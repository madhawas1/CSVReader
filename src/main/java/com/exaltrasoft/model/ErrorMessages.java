package com.exaltrasoft.model;

public enum ErrorMessages {

  RESOURCE_PATH_INVALID("Invalid Resource Path");

  private String errorMessage;

  ErrorMessages(String errorMessage) {
    this.errorMessage = errorMessage;
  }

  public String getErrorMessage() {
    return errorMessage;
  }
}
