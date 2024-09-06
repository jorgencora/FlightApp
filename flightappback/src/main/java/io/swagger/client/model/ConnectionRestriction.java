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
import java.math.BigDecimal;
/**
 * Restriction towards number of connections.
 */
@Schema(description = "Restriction towards number of connections.")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2024-09-05T13:16:41.117316-07:00[America/Hermosillo]")

public class ConnectionRestriction {
  @SerializedName("airportChangeAllowed")
  private Boolean airportChangeAllowed = null;

  @SerializedName("maxNumberOfConnections")
  private BigDecimal maxNumberOfConnections = null;

  @SerializedName("technicalStopsAllowed")
  private Boolean technicalStopsAllowed = null;

  public ConnectionRestriction airportChangeAllowed(Boolean airportChangeAllowed) {
    this.airportChangeAllowed = airportChangeAllowed;
    return this;
  }

   /**
   * Allow to change airport during connection
   * @return airportChangeAllowed
  **/
  @Schema(example = "false", description = "Allow to change airport during connection")
  public Boolean isAirportChangeAllowed() {
    return airportChangeAllowed;
  }

  public void setAirportChangeAllowed(Boolean airportChangeAllowed) {
    this.airportChangeAllowed = airportChangeAllowed;
  }

  public ConnectionRestriction maxNumberOfConnections(BigDecimal maxNumberOfConnections) {
    this.maxNumberOfConnections = maxNumberOfConnections;
    return this;
  }

   /**
   * The maximal number of connections for each itinerary. Value can be 0, 1 or 2.
   * @return maxNumberOfConnections
  **/
  @Schema(example = "2", description = "The maximal number of connections for each itinerary. Value can be 0, 1 or 2.")
  public BigDecimal getMaxNumberOfConnections() {
    return maxNumberOfConnections;
  }

  public void setMaxNumberOfConnections(BigDecimal maxNumberOfConnections) {
    this.maxNumberOfConnections = maxNumberOfConnections;
  }

  public ConnectionRestriction technicalStopsAllowed(Boolean technicalStopsAllowed) {
    this.technicalStopsAllowed = technicalStopsAllowed;
    return this;
  }

   /**
   * This option allows the single segment to have one or more intermediate stops (technical stops).
   * @return technicalStopsAllowed
  **/
  @Schema(example = "true", description = "This option allows the single segment to have one or more intermediate stops (technical stops).")
  public Boolean isTechnicalStopsAllowed() {
    return technicalStopsAllowed;
  }

  public void setTechnicalStopsAllowed(Boolean technicalStopsAllowed) {
    this.technicalStopsAllowed = technicalStopsAllowed;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ConnectionRestriction connectionRestriction = (ConnectionRestriction) o;
    return Objects.equals(this.airportChangeAllowed, connectionRestriction.airportChangeAllowed) &&
        Objects.equals(this.maxNumberOfConnections, connectionRestriction.maxNumberOfConnections) &&
        Objects.equals(this.technicalStopsAllowed, connectionRestriction.technicalStopsAllowed);
  }

  @Override
  public int hashCode() {
    return Objects.hash(airportChangeAllowed, maxNumberOfConnections, technicalStopsAllowed);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConnectionRestriction {\n");
    
    sb.append("    airportChangeAllowed: ").append(toIndentedString(airportChangeAllowed)).append("\n");
    sb.append("    maxNumberOfConnections: ").append(toIndentedString(maxNumberOfConnections)).append("\n");
    sb.append("    technicalStopsAllowed: ").append(toIndentedString(technicalStopsAllowed)).append("\n");
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
