/* 
*  Copyright (C) 2017 Eduardo Zarate Lasurtegui, Mikel Ramos
*  Copyright (C) 2017, University of the Basque Country (UPV/EHU)
*
* Contact for licensing options: <licensing-mcpttclient(at)mcopenplatform(dot)com>
*       
* This file is part of MCOP MCPTT Client
*
* This is free software: you can redistribute it and/or modify it under the terms of
* the GNU General Public License as published by the Free Software Foundation, either version 3 
* of the License, or (at your option) any later version.
*       
* This is distributed in the hope that it will be useful, but WITHOUT ANY WARRANTY;
* without even the implied warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  
* See the GNU General Public License for more details.
*       
* You should have received a copy of the GNU General Public License along 
* with this program; if not, write to the Free Software Foundation, Inc., 
* 59 Temple Place - Suite 330, Boston, MA  02111-1307, USA.
*/
#include "DDebug.h"

#include "SipStack.h"

#include "Common.h"

#if ANDROID /* callbacks will fail with jni */
#	include <android/log.h>
#	define ANDROID_DEBUG_TAG "tinyWRAP"
#endif

/* Very Important ==> never call functions which could raise debug callbacks into callback functions
*  Callbacks should not be used with Android (JNI).
*/

enum cb_type{
	cb_info,
	cb_warn,
	cb_error,
	cb_fatal
};

int debug_xxx_cb(const void* arg, const char* fmt, enum cb_type type, va_list *app)
{
	int ret = -1;
	if(!arg){
		return -1;
	}

	const SipStack* stack = dyn_cast<const SipStack*>((const SipStack*)arg);

 	if(stack && stack->getDebugCallback()){
		char* message = tsk_null;		
		tsk_sprintf_2(&message, fmt, app);
		
		switch(type){
			case cb_info:
				if(message && message!=tsk_null)
				ret=
#if ANDROID
				
				__android_log_write(ANDROID_LOG_INFO, ANDROID_DEBUG_TAG, message);
#else
				(stack->getDebugCallback()) ? stack->getDebugCallback()->OnDebugInfo(message) : -1;
#endif
				break;
			case cb_warn:
				ret=
#if ANDROID
				__android_log_write(ANDROID_LOG_WARN, ANDROID_DEBUG_TAG, message);
#else
				stack->getDebugCallback()-> OnDebugWarn(message);
#endif
				break;
			case cb_error:
				ret=
#if ANDROID
				__android_log_write(ANDROID_LOG_ERROR, ANDROID_DEBUG_TAG, message);
#else
				stack->getDebugCallback()-> OnDebugError(message);
#endif
				break;
			case cb_fatal:
				ret=
#if ANDROID
				__android_log_write(ANDROID_LOG_FATAL, ANDROID_DEBUG_TAG, message);
#else
				stack->getDebugCallback()-> OnDebugFatal(message);
#endif
				break;
		}
		
		TSK_FREE(message);
	}

	return ret;
}

int DDebugCallback::debug_info_cb(const void* arg, const char* fmt, ...)
{
	va_list ap;
	int ret;

	va_start(ap, fmt);
	ret = debug_xxx_cb(arg, fmt, cb_info, &ap);
	va_end(ap);
	
	return ret;
}

int DDebugCallback::debug_warn_cb(const void* arg, const char* fmt, ...){
	va_list ap;
	int ret;

	va_start(ap, fmt);
	ret = debug_xxx_cb(arg, fmt, cb_warn, &ap);
	va_end(ap);

	return ret;
}

int DDebugCallback::debug_error_cb(const void* arg, const char* fmt, ...){
	va_list ap;
	int ret;

	va_start(ap, fmt);
	ret = debug_xxx_cb(arg, fmt, cb_error, &ap);
	va_end(ap);

	return ret;
}

int DDebugCallback::debug_fatal_cb(const void* arg, const char* fmt, ...){
	va_list ap;
	int ret;

	va_start(ap, fmt);
	ret = debug_xxx_cb(arg, fmt, cb_fatal, &ap);
	va_end(ap);

	return ret;
}

