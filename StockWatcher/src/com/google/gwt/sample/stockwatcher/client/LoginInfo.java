package com.google.gwt.sample.stockwatcher.client;

import java.io.Serializable;

public class LoginInfo implements Serializable {

private boolean loggedIn = false;
  private String loginUrl;
  private String logoutUrl;
  private String emailAddress;
  private String nickname;

  public boolean isLoggedIn() {
    return loggedIn;
  }

  public void setLoggedIn(boolean loggedIn) {
    this.loggedIn = loggedIn;
  }

  public String getLoginUrl() {
    return loginUrl;
  }

  public void setLoginUrl(String loginUrl) {
    this.loginUrl = loginUrl;
  }

  public String getLogoutUrl() {
    return logoutUrl;
  }

  public void setLogoutUrl(String logoutUrl) {
    this.logoutUrl = logoutUrl;
  }

  public String getEmailAddress() {
    return emailAddress;
  }

  public void setEmailAddress(String emailAddress) {
    this.emailAddress = emailAddress;
  }
  
  public void testCommit() {
	 //hi
	 //Trying to make merge conflicts
	 //Trying really hard to make merge conflicts
  }
  public void testCommit2() {
		 //hi
		 //Trying to make merge conflicts
		 //Trying really hard to make merge conflicts
	  }
}