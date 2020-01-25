package com.varunramachandran.trinitystore.model;

import com.varunramachandran.trinitystore.utility.Side;

public class DoorNumber {
	
	private String door;
	
	private Side side;

	public String getDoor() {
		return door;
	}

	public void setDoor(String door) {
		this.door = door;
	}

	public Side getSide() {
		return side;
	}

	public void setSide(Side side) {
		this.side = side;
	}

	@Override
	public String toString() {
		return "DoorNumber [door=" + door + ", side=" + side + "]";
	}

}
