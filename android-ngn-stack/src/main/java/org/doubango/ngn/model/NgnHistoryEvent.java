/*
* Copyright (C) 2017, University of the Basque Country (UPV/EHU)
*  Contact for licensing options: <licensing-mcpttclient(at)mcopenplatform(dot)com>
*
* The original file was part of Open Source IMSDROID
*  Copyright (C) 2010-2011, Mamadou Diop.
*  Copyright (C) 2011, Doubango Telecom.
*
*
* Contact: Mamadou Diop <diopmamadou(at)doubango(dot)org>
*
* This file is part of Open Source Doubango Framework.
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
package org.doubango.ngn.model;

import org.doubango.ngn.media.NgnMediaType;
import org.doubango.ngn.utils.NgnUriUtils;
import org.simpleframework.xml.Element;
import org.simpleframework.xml.Root;

import java.util.Date;

@Root
public abstract class NgnHistoryEvent  implements Comparable<NgnHistoryEvent> {
	
	public enum StatusType{
		Outgoing,
		Incoming,
		Missed,
		Failed
	}
	
	// For performance reasons, do not use Date() class
	@Element(required = false, name = "type")
	protected NgnMediaType mMediaType;
	@Element(required = false, name = "start")
	protected long mStartTime;
	@Element(required = false, name = "end")
	protected long mEndTime;
	@Element(required = false, name = "remote")
	protected String mRemoteParty;
	@Element(required = false, name = "seen")
	protected boolean mSeen;
	@Element(required = false, name = "status")
	protected StatusType mStatus;
	
	private String mDisplayName;
	
	
	protected NgnHistoryEvent(NgnMediaType mediaType, String remoteParty){
		mMediaType = mediaType;
		mStartTime = new Date().getTime();
		mEndTime = mStartTime;
		mRemoteParty = remoteParty;
		mStatus = StatusType.Missed;
	}
	
	public void setStartTime(long time){
		mStartTime = time;
	}
	
	public long getStartTime(){
		return mStartTime;
	}
	
	public long getEndTime(){
		return mEndTime;
	}
	
	public void setEndTime(long time){
		mEndTime = time;
	}
	
	public NgnMediaType getMediaType(){
		return mMediaType;
	}
	
	public String getRemoteParty(){
		return mRemoteParty;
	}
	
	public void setRemoteParty(String remoteParty){
		mRemoteParty = remoteParty;
	}
	
	public boolean isSeen(){
		return mSeen;
	}
	
	public void setSeen(boolean seen){
		mSeen = seen;
	}
	
	public StatusType getStatus(){
		return mStatus;
	}
	
	public void setStatus(StatusType status){
		mStatus = status;
	}
	
	public void setDisplayName(String displayName){
		mDisplayName = displayName;
	}
	
	public String getDisplayName(){
		if(mDisplayName == null){
			mDisplayName = NgnUriUtils.getDisplayName(getRemoteParty());
		}
		return mDisplayName;
	}
	
	@Override
	public int compareTo(NgnHistoryEvent another) {
		return (int)(mStartTime - another.mStartTime);
	}
}
