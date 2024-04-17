package com.topas404.matchmaking.models;

import java.util.ArrayList;
import java.util.Collections;

public class UtilityUser {
	private String user_i = null;
	private String user_j = null;
	private float weight = 0;

	public UtilityUser(String user_i, String user_j, float weight) {
		this.user_i = user_i;
		this.user_j = user_j;
		this.weight = weight;
	}


	public float getWeight() {
		return weight;
	}

	public void setWeight(float weight) {
		this.weight = weight;
	}

	public String getUser_j() {
		return user_j;
	}

	public void setUser_j(String user_j) {
		this.user_j = user_j;
	}

	public String getUser_i() {
		return user_i;
	}

	public void setUser_i(String user_i) {
		this.user_i = user_i;
	}

	

	
}
