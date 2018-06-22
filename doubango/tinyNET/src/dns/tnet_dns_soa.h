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
/**@file tnet_dns_soa.h
 * @brief DNS Start Of Authority record - RR - (RFC 1035).
 *
 * @author Mamadou Diop <diopmamadou(at)doubango[dot]org>
 *

 */
#ifndef TNET_DNS_RR_SOA_H
#define TNET_DNS_RR_SOA_H

#include "tinynet_config.h"

#include "tnet_dns_rr.h"

TNET_BEGIN_DECLS

typedef struct tnet_dns_soa_s
{
	TNET_DECLARE_DNS_RR;

	/* RFC 1035 - 3.3.13. SOA RDATA format
	+--+--+--+--+--+--+--+--+--+--+--+--+--+--+--+--+
    /                     MNAME                     /
    /                                               /
    +--+--+--+--+--+--+--+--+--+--+--+--+--+--+--+--+
    /                     RNAME                     /
    +--+--+--+--+--+--+--+--+--+--+--+--+--+--+--+--+
    |                    SERIAL                     |
    |                                               |
    +--+--+--+--+--+--+--+--+--+--+--+--+--+--+--+--+
    |                    REFRESH                    |
    |                                               |
    +--+--+--+--+--+--+--+--+--+--+--+--+--+--+--+--+
    |                     RETRY                     |
    |                                               |
    +--+--+--+--+--+--+--+--+--+--+--+--+--+--+--+--+
    |                    EXPIRE                     |
    |                                               |
    +--+--+--+--+--+--+--+--+--+--+--+--+--+--+--+--+
    |                    MINIMUM                    |
    |                                               |
    +--+--+--+--+--+--+--+--+--+--+--+--+--+--+--+--+
	*/
	char* mname;
	char* rname;
	uint32_t serial;
	uint32_t refresh;
	uint32_t retry;
	uint32_t expire;
	uint32_t minimum;
}
tnet_dns_soa_t;

tnet_dns_soa_t* tnet_dns_soa_create(const char* name, tnet_dns_qclass_t qclass, uint32_t ttl, uint16_t rdlength, const void* data, tsk_size_t offset);

TINYNET_GEXTERN const tsk_object_def_t *tnet_dns_soa_def_t;

TNET_END_DECLS

#endif /* TNET_DNS_RR_SOA_H */

