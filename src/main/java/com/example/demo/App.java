package com.example.demo;

public class App {
	AppUser appUser;

	/**
	 * @return the appUser
	 */
	public AppUser getAppUser() {
		return appUser;
	}

	/**
	 * @param appUser the appUser to set
	 */
	public void setAppUser(AppUser appUser) {
		this.appUser = appUser;
	}

	@Override
	public String toString() {
		return "App [appUser=" + appUser + "]";
	}
	
}
