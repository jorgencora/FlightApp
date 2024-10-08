/*
 * Flight Offers Search
 *  Before using this API, we recommend you read our **[Authorization Guide](https://developers.amadeus.com/self-service/apis-docs/guides/authorization)** for more information on how to generate an access token.   Please also be aware that our test environment is based on a subset of the production, if you are not returning any results try with big cities/airports like LON (London) or NYC (New-York).
 *
 * OpenAPI spec version: 2.2.0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package io.swagger.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import org.threeten.bp.LocalDate;
/**
 * DateTimeRange
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2024-09-05T13:16:41.117316-07:00[America/Hermosillo]")

public class DateTimeRange {
  @SerializedName("date")
  private LocalDate date = null;

  @SerializedName("dateWindow")
  private String dateWindow = null;

  @SerializedName("time")
  private String time = null;

  @SerializedName("timeWindow")
  private String timeWindow = null;

  public DateTimeRange date(LocalDate date) {
    this.date = date;
    return this;
  }

   /**
   * Dates are specified in the [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) YYYY-MM-DD format, e.g. 2018-12-25
   * @return date
  **/
  @Schema(example = "Fri Sep 21 17:00:00 MST 2018", required = true, description = "Dates are specified in the [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) YYYY-MM-DD format, e.g. 2018-12-25")
  public LocalDate getDate() {
    return date;
  }

  public void setDate(LocalDate date) {
    this.date = date;
  }

  public DateTimeRange dateWindow(String dateWindow) {
    this.dateWindow = dateWindow;
    return this;
  }

   /**
   * Either 1, 2 or 3 extra days around the local date (IxD for +/- x days - Ex: I3D), Either 1 to 3 days after the local date (PxD for +x days - Ex: P3D), or 1 to 3 days before the local date (MxD for -x days - Ex: M3D)  Can not be combined with \&quot;originRadius\&quot; or \&quot;destinationRadius\&quot;. 
   * @return dateWindow
  **/
  @Schema(example = "I3D", description = "Either 1, 2 or 3 extra days around the local date (IxD for +/- x days - Ex: I3D), Either 1 to 3 days after the local date (PxD for +x days - Ex: P3D), or 1 to 3 days before the local date (MxD for -x days - Ex: M3D)  Can not be combined with \"originRadius\" or \"destinationRadius\". ")
  public String getDateWindow() {
    return dateWindow;
  }

  public void setDateWindow(String dateWindow) {
    this.dateWindow = dateWindow;
  }

  public DateTimeRange time(String time) {
    this.time = time;
    return this;
  }

   /**
   * Local time. hh:mm:ss format, e.g 10:30:00
   * @return time
  **/
  @Schema(example = "10:30:00", description = "Local time. hh:mm:ss format, e.g 10:30:00")
  public String getTime() {
    return time;
  }

  public void setTime(String time) {
    this.time = time;
  }

  public DateTimeRange timeWindow(String timeWindow) {
    this.timeWindow = timeWindow;
    return this;
  }

   /**
   * 1 to 12 hours around (both +and -) the local time. Possibly limited by the number of extra days when specified, i.e.  in some situations, it may not be used to exceed the maximum date range. [1-12]H format, e.g. 6H  Can not be combined with \&quot;originRadius\&quot; or \&quot;destinationRadius\&quot;. 
   * @return timeWindow
  **/
  @Schema(example = "2H", description = "1 to 12 hours around (both +and -) the local time. Possibly limited by the number of extra days when specified, i.e.  in some situations, it may not be used to exceed the maximum date range. [1-12]H format, e.g. 6H  Can not be combined with \"originRadius\" or \"destinationRadius\". ")
  public String getTimeWindow() {
    return timeWindow;
  }

  public void setTimeWindow(String timeWindow) {
    this.timeWindow = timeWindow;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DateTimeRange dateTimeRange = (DateTimeRange) o;
    return Objects.equals(this.date, dateTimeRange.date) &&
        Objects.equals(this.dateWindow, dateTimeRange.dateWindow) &&
        Objects.equals(this.time, dateTimeRange.time) &&
        Objects.equals(this.timeWindow, dateTimeRange.timeWindow);
  }

  @Override
  public int hashCode() {
    return Objects.hash(date, dateWindow, time, timeWindow);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DateTimeRange {\n");
    
    sb.append("    date: ").append(toIndentedString(date)).append("\n");
    sb.append("    dateWindow: ").append(toIndentedString(dateWindow)).append("\n");
    sb.append("    time: ").append(toIndentedString(time)).append("\n");
    sb.append("    timeWindow: ").append(toIndentedString(timeWindow)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}
