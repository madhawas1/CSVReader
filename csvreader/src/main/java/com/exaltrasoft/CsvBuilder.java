package com.exaltrasoft;

public interface CsvBuilder {

  /**
   * Set the Resource Path for the .CSV File with File Name. For Maven projects, relative path from
   * the resource folder. For other projects, full path.
   *
   * @param resourcePath {@link String} Path for the .CSV file.
   * @return CsvBuilder.
   */
  CsvBuilder resourcePath(String resourcePath);
}
