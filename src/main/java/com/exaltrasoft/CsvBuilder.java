package com.exaltrasoft;

import com.exaltrasoft.model.CsvFile;

public interface CsvBuilder {

  /**
   * Set the Resource Path for the .CSV File with File Name. For Maven projects, relative path from
   * the resource folder. For other projects, full path.
   *
   * @param resourcePath {@link String} Path for the .CSV file.
   * @return CsvBuilder.
   */
  CsvBuilder resourcePath(String resourcePath);

  /**
   * Build CSV file.
   *
   * @return CsvFile.
   */
  CsvFile build();
}
