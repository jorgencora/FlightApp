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
import io.swagger.client.model.CabinRestriction;
import io.swagger.client.model.CarrierRestrictions;
import io.swagger.client.model.ConnectionRestriction;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
/**
 * FlightFilters
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2024-09-05T13:16:41.117316-07:00[America/Hermosillo]")

public class FlightFilters {
  @SerializedName("busSegmentAllowed")
  private Boolean busSegmentAllowed = null;

  @SerializedName("cabinRestrictions")
  private List<CabinRestriction> cabinRestrictions = null;

  @SerializedName("carrierRestrictions")
  private CarrierRestrictions carrierRestrictions = null;

  @SerializedName("connectionRestriction")
  private ConnectionRestriction connectionRestriction = null;

  @SerializedName("crossBorderAllowed")
  private Boolean crossBorderAllowed = null;

  @SerializedName("maxFlightTime")
  private BigDecimal maxFlightTime = null;

  @SerializedName("moreOvernightsAllowed")
  private Boolean moreOvernightsAllowed = null;

  @SerializedName("railSegmentAllowed")
  private Boolean railSegmentAllowed = null;

  @SerializedName("returnToDepartureAirport")
  private Boolean returnToDepartureAirport = null;

  public FlightFilters busSegmentAllowed(Boolean busSegmentAllowed) {
    this.busSegmentAllowed = busSegmentAllowed;
    return this;
  }

   /**
   * This flag enable/disable filtering of bus segment
   * @return busSegmentAllowed
  **/
  @Schema(example = "true", description = "This flag enable/disable filtering of bus segment")
  public Boolean isBusSegmentAllowed() {
    return busSegmentAllowed;
  }

  public void setBusSegmentAllowed(Boolean busSegmentAllowed) {
    this.busSegmentAllowed = busSegmentAllowed;
  }

  public FlightFilters cabinRestrictions(List<CabinRestriction> cabinRestrictions) {
    this.cabinRestrictions = cabinRestrictions;
    return this;
  }

  public FlightFilters addCabinRestrictionsItem(CabinRestriction cabinRestrictionsItem) {
    if (this.cabinRestrictions == null) {
      this.cabinRestrictions = new ArrayList<CabinRestriction>();
    }
    this.cabinRestrictions.add(cabinRestrictionsItem);
    return this;
  }

   /**
   * Restriction towards cabins.
   * @return cabinRestrictions
  **/
  @Schema(description = "Restriction towards cabins.")
  public List<CabinRestriction> getCabinRestrictions() {
    return cabinRestrictions;
  }

  public void setCabinRestrictions(List<CabinRestriction> cabinRestrictions) {
    this.cabinRestrictions = cabinRestrictions;
  }

  public FlightFilters carrierRestrictions(CarrierRestrictions carrierRestrictions) {
    this.carrierRestrictions = carrierRestrictions;
    return this;
  }

   /**
   * Get carrierRestrictions
   * @return carrierRestrictions
  **/
  @Schema(description = "")
  public CarrierRestrictions getCarrierRestrictions() {
    return carrierRestrictions;
  }

  public void setCarrierRestrictions(CarrierRestrictions carrierRestrictions) {
    this.carrierRestrictions = carrierRestrictions;
  }

  public FlightFilters connectionRestriction(ConnectionRestriction connectionRestriction) {
    this.connectionRestriction = connectionRestriction;
    return this;
  }

   /**
   * Get connectionRestriction
   * @return connectionRestriction
  **/
  @Schema(description = "")
  public ConnectionRestriction getConnectionRestriction() {
    return connectionRestriction;
  }

  public void setConnectionRestriction(ConnectionRestriction connectionRestriction) {
    this.connectionRestriction = connectionRestriction;
  }

  public FlightFilters crossBorderAllowed(Boolean crossBorderAllowed) {
    this.crossBorderAllowed = crossBorderAllowed;
    return this;
  }

   /**
   * Allows to search a location outside the borders when a radius around a location is specified. Default is false.
   * @return crossBorderAllowed
  **/
  @Schema(example = "false", description = "Allows to search a location outside the borders when a radius around a location is specified. Default is false.")
  public Boolean isCrossBorderAllowed() {
    return crossBorderAllowed;
  }

  public void setCrossBorderAllowed(Boolean crossBorderAllowed) {
    this.crossBorderAllowed = crossBorderAllowed;
  }

  public FlightFilters maxFlightTime(BigDecimal maxFlightTime) {
    this.maxFlightTime = maxFlightTime;
    return this;
  }

   /**
   * This option allows to modify the value for the Elapsed Flying Time (EFT) masterPricer option
   * @return maxFlightTime
  **/
  @Schema(example = "200", description = "This option allows to modify the value for the Elapsed Flying Time (EFT) masterPricer option")
  public BigDecimal getMaxFlightTime() {
    return maxFlightTime;
  }

  public void setMaxFlightTime(BigDecimal maxFlightTime) {
    this.maxFlightTime = maxFlightTime;
  }

  public FlightFilters moreOvernightsAllowed(Boolean moreOvernightsAllowed) {
    this.moreOvernightsAllowed = moreOvernightsAllowed;
    return this;
  }

   /**
   * This flag enables/disables the possibility to have more overnight flights in Low Fare Search
   * @return moreOvernightsAllowed
  **/
  @Schema(example = "false", description = "This flag enables/disables the possibility to have more overnight flights in Low Fare Search")
  public Boolean isMoreOvernightsAllowed() {
    return moreOvernightsAllowed;
  }

  public void setMoreOvernightsAllowed(Boolean moreOvernightsAllowed) {
    this.moreOvernightsAllowed = moreOvernightsAllowed;
  }

  public FlightFilters railSegmentAllowed(Boolean railSegmentAllowed) {
    this.railSegmentAllowed = railSegmentAllowed;
    return this;
  }

   /**
   * This flag enable/disable filtering of rail segment (TGV AIR, RAIL ...)
   * @return railSegmentAllowed
  **/
  @Schema(example = "true", description = "This flag enable/disable filtering of rail segment (TGV AIR, RAIL ...)")
  public Boolean isRailSegmentAllowed() {
    return railSegmentAllowed;
  }

  public void setRailSegmentAllowed(Boolean railSegmentAllowed) {
    this.railSegmentAllowed = railSegmentAllowed;
  }

  public FlightFilters returnToDepartureAirport(Boolean returnToDepartureAirport) {
    this.returnToDepartureAirport = returnToDepartureAirport;
    return this;
  }

   /**
   * This option force to retrieve flight-offer with a departure and a return in the same airport
   * @return returnToDepartureAirport
  **/
  @Schema(example = "false", description = "This option force to retrieve flight-offer with a departure and a return in the same airport")
  public Boolean isReturnToDepartureAirport() {
    return returnToDepartureAirport;
  }

  public void setReturnToDepartureAirport(Boolean returnToDepartureAirport) {
    this.returnToDepartureAirport = returnToDepartureAirport;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FlightFilters flightFilters = (FlightFilters) o;
    return Objects.equals(this.busSegmentAllowed, flightFilters.busSegmentAllowed) &&
        Objects.equals(this.cabinRestrictions, flightFilters.cabinRestrictions) &&
        Objects.equals(this.carrierRestrictions, flightFilters.carrierRestrictions) &&
        Objects.equals(this.connectionRestriction, flightFilters.connectionRestriction) &&
        Objects.equals(this.crossBorderAllowed, flightFilters.crossBorderAllowed) &&
        Objects.equals(this.maxFlightTime, flightFilters.maxFlightTime) &&
        Objects.equals(this.moreOvernightsAllowed, flightFilters.moreOvernightsAllowed) &&
        Objects.equals(this.railSegmentAllowed, flightFilters.railSegmentAllowed) &&
        Objects.equals(this.returnToDepartureAirport, flightFilters.returnToDepartureAirport);
  }

  @Override
  public int hashCode() {
    return Objects.hash(busSegmentAllowed, cabinRestrictions, carrierRestrictions, connectionRestriction, crossBorderAllowed, maxFlightTime, moreOvernightsAllowed, railSegmentAllowed, returnToDepartureAirport);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FlightFilters {\n");
    
    sb.append("    busSegmentAllowed: ").append(toIndentedString(busSegmentAllowed)).append("\n");
    sb.append("    cabinRestrictions: ").append(toIndentedString(cabinRestrictions)).append("\n");
    sb.append("    carrierRestrictions: ").append(toIndentedString(carrierRestrictions)).append("\n");
    sb.append("    connectionRestriction: ").append(toIndentedString(connectionRestriction)).append("\n");
    sb.append("    crossBorderAllowed: ").append(toIndentedString(crossBorderAllowed)).append("\n");
    sb.append("    maxFlightTime: ").append(toIndentedString(maxFlightTime)).append("\n");
    sb.append("    moreOvernightsAllowed: ").append(toIndentedString(moreOvernightsAllowed)).append("\n");
    sb.append("    railSegmentAllowed: ").append(toIndentedString(railSegmentAllowed)).append("\n");
    sb.append("    returnToDepartureAirport: ").append(toIndentedString(returnToDepartureAirport)).append("\n");
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
