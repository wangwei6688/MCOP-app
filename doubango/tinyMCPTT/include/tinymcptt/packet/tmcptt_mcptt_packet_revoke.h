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

#ifndef TINYMCPTT_MCPTT_PACKET_REVOKE_H
#define TINYMCPTT_MCPTT_PACKET_REVOKE_H

#include "tinymcptt_config.h"
#include "tinymcptt/packet/tmcptt_mcptt_packet.h"
#include "tinymcptt/packet/tmcptt_mcptt_packet_specific.h"

#include "tsk_object.h"

#define TMCPTT_MCPTT_PACKET_REVOKE_MIN_SIZE 4

TMCPTT_BEGIN_DECLS
	
/* Revoke reason codes */

typedef enum {
  REVOKE_REASON_ONLY_ONE      = 1,
  REVOKE_REASON_MB_TOO_LONG   = 2,
  REVOKE_REASON_NO_PERMISSION = 3,
  REVOKE_REASON_PREEMPTED     = 4,
  REVOKE_REASON_NO_RESOURCES  = 6,
  REVOKE_REASON_OTHER         = 255
} tmcptt_mcptt_packet_revoke_reason_t;


typedef struct tmcptt_mcptt_packet_revoke_s
{
	TSK_DECLARE_OBJECT;
	tmcptt_mcptt_packet_specific_binary_16_txt_t*	reject_cause;  
	tmcptt_mcptt_packet_specific_binary_txt_ref_t*	track_info;		//Only when non-controlling is included
} tmcptt_mcptt_packet_revoke_t;

TINYMCPTT_API tmcptt_mcptt_packet_revoke_t* tmcptt_mcptt_packet_revoke_create_null();
TINYMCPTT_API tmcptt_mcptt_packet_revoke_t* tmcptt_mcptt_packet_revoke_deserialize(const void* data, tsk_size_t size);
TINYMCPTT_API int tmcptt_mcptt_packet_revoke_serialize_to(const tmcptt_mcptt_packet_revoke_t* self, void* data, tsk_size_t size);
TINYMCPTT_API tsk_size_t tmcptt_mcptt_packet_revoke_get_size(const tmcptt_mcptt_packet_revoke_t* self);

TMCPTT_END_DECLS

#endif /* TINYMCPTT_MCPTT_PACKET_REVOKE_H */