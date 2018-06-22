/*
* Copyright (C) 2017 Eduardo Zarate Lasurtegui
* Copyright (C) 2017, University of the Basque Country (UPV/EHU)
* Contact for licensing options: <licensing-mcpttclient(at)mcopenplatform(dot)com>
*
* The original file was part of Open Source Doubango Framework
* Copyright (C) 2010-2011 Mamadou Diop.
* Copyright (C) 2012 Doubango Telecom <http://doubango.org>
*
* This file is part of Open Source Doubango Framework.
*
* DOUBANGO is free software: you can redistribute it and/or modify
* it under the terms of the GNU General Public License as published by
* the Free Software Foundation, either version 3 of the License, or
* (at your option) any later version.
*
* DOUBANGO is distributed in the hope that it will be useful,
* but WITHOUT ANY WARRANTY; without even the implied warranty of
* MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
* GNU General Public License for more details.
*
* You should have received a copy of the GNU General Public License
* along with DOUBANGO.
*
*/

/**@file tsip_header_P_Preferred_Identity.h
 * @brief SIP header 'P-Preferred-Identity'.
 *
 * @author Mamadou Diop <diopmamadou(at)doubango[dot]org>
 *

 */
#ifndef _TSIP_HEADER_P_PREFERRED_IDENTITY_H_
#define _TSIP_HEADER_P_PREFERRED_IDENTITY_H_

#include "tinysip_config.h"

#include "tinysip/tsip_uri.h"
#include "tinysip/headers/tsip_header.h"

TSIP_BEGIN_DECLS

#define TSIP_HEADER_P_PREFERRED_IDENTITY_VA_ARGS(uri)	tsip_header_P_Preferred_Identity_def_t, (const tsip_uri_t*)uri

////////////////////////////////////////////////////////////////////////////////////////////////////
///
/// @brief	SIP header 'P-Preferred-Identity' as per RFC 3325.
///
/// @par ABNF:  PPreferredID = "P-Preferred-Identity" HCOLON PPreferredID-value *(COMMA PPreferredID-value)
///       PPreferredID-value = name-addr / addr-spec
/// 	
////////////////////////////////////////////////////////////////////////////////////////////////////
typedef struct tsip_header_P_Preferred_Identity_s
{	
	TSIP_DECLARE_HEADER;

	tsip_uri_t *uri;
	char *display_name;
}
tsip_header_P_Preferred_Identity_t;

TINYSIP_API tsip_header_P_Preferred_Identity_t* tsip_header_P_Preferred_Identity_create(const tsip_uri_t* uri);
TINYSIP_API tsip_header_P_Preferred_Identity_t* tsip_header_P_Preferred_Identity_create_null();

TINYSIP_API tsip_header_P_Preferred_Identity_t *tsip_header_P_Preferred_Identity_parse(const char *data, tsk_size_t size);

TINYSIP_GEXTERN const tsk_object_def_t *tsip_header_P_Preferred_Identity_def_t;

TSIP_END_DECLS

#endif /* _TSIP_HEADER_P_PREFERRED_IDENTITY_H_ */

