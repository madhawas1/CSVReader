package com.exaltrasoft;

import com.exaltrasoft.model.ErrorMessages;
import org.apache.commons.lang3.StringUtils;

public class CsvBuilderImpl implements CsvBuilder {

  private String resourcePath;

  @Override
  public CsvBuilder resourcePath(String resourcePath) {

    if (StringUtils.isBlank(resourcePath)) {
      throw new IllegalArgumentException(ErrorMessages.RESOURCE_PATH_INVALID.getErrorMessage());
    }

    this.resourcePath = resourcePath;
    return this;
  }
}
