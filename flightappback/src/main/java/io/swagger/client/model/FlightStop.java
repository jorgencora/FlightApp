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
import io.swagger.client.model.OriginalFlightStop;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.time.LocalDateTime;
/**
 * details of stops for direct or change of gauge flights
 */
@Schema(description = "details of stops for direct or change of gauge flights")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2024-09-05T13:16:41.117316-07:00[America/Hermosillo]")

public class FlightStop extends OriginalFlightStop {
  @SerializedName("arrivalAt")
  private LocalDateTime arrivalAt = null;

  @SerializedName("departureAt")
  private LocalDateTime departureAt = null;

  public FlightStop arrivalAt(LocalDateTime arrivalAt) {
    this.arrivalAt = arrivalAt;
    return this;
  }

   /**
   * arrival at the stop in [ISO8601](https://en.wikipedia.org/wiki/ISO_8601) YYYY-MM-ddThh:mm:ss format, e.g. 2017-02-10T20:40:00
   * @return arrivalAt
  **/
  @Schema(description = "arrival at the stop in [ISO8601](https://en.wikipedia.org/wiki/ISO_8601) YYYY-MM-ddThh:mm:ss format, e.g. 2017-02-10T20:40:00")
  public LocalDateTime getArrivalAt() {
    return arrivalAt;
  }

  public void setArrivalAt(LocalDateTime arrivalAt) {
    this.arrivalAt = arrivalAt;
  }

  public FlightStop departureAt(LocalDateTime departureAt) {
    this.departureAt = departureAt;
    return this;
  }

   /**
   * departure from the stop in [ISO8601](https://en.wikipedia.org/wiki/ISO_8601) YYYY-MM-ddThh:mm:ss format, e.g. 2017-02-10T20:40:00
   * @return departureAt
  **/
  @Schema(description = "departure from the stop in [ISO8601](https://en.wikipedia.org/wiki/ISO_8601) YYYY-MM-ddThh:mm:ss format, e.g. 2017-02-10T20:40:00")
  public LocalDateTime getDepartureAt() {
    return departureAt;
  }

  public void setDepartureAt(LocalDateTime departureAt) {
    this.departureAt = departureAt;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FlightStop flightStop = (FlightStop) o;
    return Objects.equals(this.arrivalAt, flightStop.arrivalAt) &&
        Objects.equals(this.departureAt, flightStop.departureAt) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(arrivalAt, departureAt, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FlightStop {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    arrivalAt: ").append(toIndentedString(arrivalAt)).append("\n");
    sb.append("    departureAt: ").append(toIndentedString(departureAt)).append("\n");
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
