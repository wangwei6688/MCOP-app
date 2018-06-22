/*
 *
 *  Copyright (C) 2018 Eduardo Zarate Lasurtegui
 *   Copyright (C) 2018, University of the Basque Country (UPV/EHU)
 *
 *  Contact for licensing options: <licensing-mcpttclient(at)mcopenplatform(dot)com>
 *
 *  This file is part of MCOP MCPTT Client
 *
 *  This is free software: you can redistribute it and/or modify it under the terms of
 *  the GNU General Public License as published by the Free Software Foundation, either version 3
 *  of the License, or (at your option) any later version.
 *
 *  This is distributed in the hope that it will be useful, but WITHOUT ANY WARRANTY;
 *  without even the implied warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.
 *  See the GNU General Public License for more details.
 *
 *  You should have received a copy of the GNU General Public License along
 *  with this program; if not, write to the Free Software Foundation, Inc.,
 *  59 Temple Place - Suite 330, Boston, MA  02111-1307, USA.
 */

package org.mcopenplatform.muoapi.managerIapi;

import android.os.IBinder;
import android.os.Message;
import android.util.Log;

import org.mcopenplatform.iapi.IConfigurationService;
import org.mcopenplatform.muoapi.BuildConfig;


public class ManagerConfigurationService extends ManagerIapiBase {
    private final static String TAG = org.mcopenplatform.muoapi.utils.Utils.getTAG(ManagerConfigurationService.class.getCanonicalName());

    protected final String PACKET_SERVICE="org.mcopenplatform.iapi.ConfigurationService";

    public ManagerConfigurationService() {
        super();
    }

    @Override
    protected void startInternal() {

    }

    @Override
    protected void stopInternal() {

    }

    @Override
    protected Object registerInterface(IBinder service) {
        IConfigurationService serviceInterface = IConfigurationService.Stub.asInterface(service);
        try {
            (serviceInterface).registerNotificationReceiver(mcopMessenger);
        } catch (Exception e) {
            Log.e(TAG,e.getLocalizedMessage());
        }
        return serviceInterface;
    }

    @Override
    protected boolean receiveEvent(Message message) {
        if(BuildConfig.DEBUG)
            Log.d(TAG,"Execute receiveEvent in "+getPACKET_SERVICE()+": what: "+message.what);
        return true;
    }

    /**
     * It allows to distinguish between the different PACKET_SERVICE for each of the extended class of ManagerIapiBase
     * @return PACKET_SERVICE constant
     */
    @Override
    protected String getPACKET_SERVICE() {
        return PACKET_SERVICE;
    }

    @Override
    protected String getPACKET_MAIN_SERVICE() {
        return PACKET_MAIN_SERVICE;
    }
}