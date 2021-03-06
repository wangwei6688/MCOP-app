/* 

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

/*
 * @file tmcptt_mbms_message.h
 * @brief MCPTT MBMS message.
 *
 */
#ifndef TINYMCPTT_MBMS_MESSAGE_H
#define TINYMCPTT_MBMS_MESSAGE_H

#include "tinymcptt_config.h"
#include "tsk_object.h"

TMCPTT_BEGIN_DECLS

#define TMCPTT_MBMS_MESSAGE(self)				((tmcptt_mbms_message_t*)(self))

typedef struct tmcptt_mbms_message_s
{
	TSK_DECLARE_OBJECT;
	
	char* group_id;
	char* tmgi;
	char* media_ip;
	uint16_t media_port;
	uint16_t media_control_port;
}
tmcptt_mbms_message_t;

TINYMCPTT_API tmcptt_mbms_message_t* tmcptt_mbms_message_create_null();

TINYMCPTT_GEXTERN const tsk_object_def_t *tmcptt_mbms_message_def_t;

TMCPTT_END_DECLS

#endif /* TINYMCPTT_MESSAGE_H */
