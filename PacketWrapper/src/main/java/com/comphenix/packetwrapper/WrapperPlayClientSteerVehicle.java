/**
 * This file is part of PacketWrapper.
 * Copyright (C) 2012-2015 Kristian S. Strangeland
 * Copyright (C) 2015 dmulloy2
 *
 * PacketWrapper is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Lesser General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * PacketWrapper is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public License
 * along with PacketWrapper.  If not, see <http://www.gnu.org/licenses/>.
 */
package com.comphenix.packetwrapper;

import com.comphenix.protocol.PacketType;
import com.comphenix.protocol.events.PacketContainer;

public class WrapperPlayClientSteerVehicle extends AbstractPacket {
    public static final PacketType TYPE = PacketType.Play.Client.STEER_VEHICLE;
    
    public WrapperPlayClientSteerVehicle() {
        super(new PacketContainer(TYPE), TYPE);
        handle.getModifier().writeDefaults();
    }
    
    public WrapperPlayClientSteerVehicle(PacketContainer packet) {
        super(packet, TYPE);
    }
    
    /**
     * Retrieve Sideways.
     * <p>
     * Notes: positive to the left of the player
     * @return The current Sideways
     */
    public float getSideways() {
        return handle.getFloat().read(0);
    }
    
    /**
     * Set Sideways.
     * @param value - new value.
     */
    public void setSideways(float value) {
        handle.getFloat().write(0, value);
    }
    
    /**
     * Retrieve Forward.
     * <p>
     * Notes: positive forward
     * @return The current Forward
     */
    public float getForward() {
        return handle.getFloat().read(1);
    }
    
    /**
     * Set Forward.
     * @param value - new value.
     */
    public void setForward(float value) {
        handle.getFloat().write(1, value);
    }

    public boolean isJump() {
    	return handle.getBooleans().read(0);
    }

    public void setJump(boolean value) {
    	handle.getBooleans().write(0, value);
    }

    public boolean isUnmount() {
    	return handle.getBooleans().read(0);
    }

    public void setUnmount(boolean value) {
    	handle.getBooleans().write(0, value);
    }
    
}

