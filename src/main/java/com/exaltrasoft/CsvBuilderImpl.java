package com.exaltrasoft;

import com.exaltrasoft.model.CsvFile;
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

  @Override
  public CsvFile build() {

    if (StringUtils.isBlank(resourcePath)) {
      throw new IllegalStateException(ErrorMessages.RESOURCE_PATH_INVALID.getErrorMessage());
    }

    return new CsvFile();
  }
}
