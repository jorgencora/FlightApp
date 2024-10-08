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
import io.swagger.client.model.AdditionalInformation;
import io.swagger.client.model.ExtendedPricingOptions;
import io.swagger.client.model.FlightFilters;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.math.BigDecimal;
/**
 * SearchCriteria
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2024-09-05T13:16:41.117316-07:00[America/Hermosillo]")

public class SearchCriteria {
  @SerializedName("addOneWayOffers")
  private Boolean addOneWayOffers = null;

  @SerializedName("additionalInformation")
  private AdditionalInformation additionalInformation = null;

  @SerializedName("allowAlternativeFareOptions")
  private Boolean allowAlternativeFareOptions = null;

  @SerializedName("excludeAllotments")
  private Boolean excludeAllotments = null;

  @SerializedName("flightFilters")
  private FlightFilters flightFilters = null;

  @SerializedName("maxFlightOffers")
  private BigDecimal maxFlightOffers = new BigDecimal(250);

  @SerializedName("maxPrice")
  private Integer maxPrice = null;

  @SerializedName("oneFlightOfferPerDay")
  private Boolean oneFlightOfferPerDay = null;

  @SerializedName("pricingOptions")
  private ExtendedPricingOptions pricingOptions = null;

  public SearchCriteria addOneWayOffers(Boolean addOneWayOffers) {
    this.addOneWayOffers = addOneWayOffers;
    return this;
  }

   /**
   * This option allows activate the one-way combinable feature
   * @return addOneWayOffers
  **/
  @Schema(example = "true", description = "This option allows activate the one-way combinable feature")
  public Boolean isAddOneWayOffers() {
    return addOneWayOffers;
  }

  public void setAddOneWayOffers(Boolean addOneWayOffers) {
    this.addOneWayOffers = addOneWayOffers;
  }

  public SearchCriteria additionalInformation(AdditionalInformation additionalInformation) {
    this.additionalInformation = additionalInformation;
    return this;
  }

   /**
   * Get additionalInformation
   * @return additionalInformation
  **/
  @Schema(description = "")
  public AdditionalInformation getAdditionalInformation() {
    return additionalInformation;
  }

  public void setAdditionalInformation(AdditionalInformation additionalInformation) {
    this.additionalInformation = additionalInformation;
  }

  public SearchCriteria allowAlternativeFareOptions(Boolean allowAlternativeFareOptions) {
    this.allowAlternativeFareOptions = allowAlternativeFareOptions;
    return this;
  }

   /**
   * This option allows to default to a standard fareOption if no offers are found for the selected fareOption.
   * @return allowAlternativeFareOptions
  **/
  @Schema(example = "true", description = "This option allows to default to a standard fareOption if no offers are found for the selected fareOption.")
  public Boolean isAllowAlternativeFareOptions() {
    return allowAlternativeFareOptions;
  }

  public void setAllowAlternativeFareOptions(Boolean allowAlternativeFareOptions) {
    this.allowAlternativeFareOptions = allowAlternativeFareOptions;
  }

  public SearchCriteria excludeAllotments(Boolean excludeAllotments) {
    this.excludeAllotments = excludeAllotments;
    return this;
  }

   /**
   * This option allows to exclude the isAllotment flag associated to a booking class in the search response when it exist.
   * @return excludeAllotments
  **/
  @Schema(example = "false", description = "This option allows to exclude the isAllotment flag associated to a booking class in the search response when it exist.")
  public Boolean isExcludeAllotments() {
    return excludeAllotments;
  }

  public void setExcludeAllotments(Boolean excludeAllotments) {
    this.excludeAllotments = excludeAllotments;
  }

  public SearchCriteria flightFilters(FlightFilters flightFilters) {
    this.flightFilters = flightFilters;
    return this;
  }

   /**
   * Get flightFilters
   * @return flightFilters
  **/
  @Schema(description = "")
  public FlightFilters getFlightFilters() {
    return flightFilters;
  }

  public void setFlightFilters(FlightFilters flightFilters) {
    this.flightFilters = flightFilters;
  }

  public SearchCriteria maxFlightOffers(BigDecimal maxFlightOffers) {
    this.maxFlightOffers = maxFlightOffers;
    return this;
  }

   /**
   * Maximum number of flight offers returned (Max 250)
   * @return maxFlightOffers
  **/
  @Schema(example = "250", description = "Maximum number of flight offers returned (Max 250)")
  public BigDecimal getMaxFlightOffers() {
    return maxFlightOffers;
  }

  public void setMaxFlightOffers(BigDecimal maxFlightOffers) {
    this.maxFlightOffers = maxFlightOffers;
  }

  public SearchCriteria maxPrice(Integer maxPrice) {
    this.maxPrice = maxPrice;
    return this;
  }

   /**
   * maximum price per traveler. By default, no limit is applied. If specified, the value should be a positive number with no decimals
   * @return maxPrice
  **/
  @Schema(example = "100", description = "maximum price per traveler. By default, no limit is applied. If specified, the value should be a positive number with no decimals")
  public Integer getMaxPrice() {
    return maxPrice;
  }

  public void setMaxPrice(Integer maxPrice) {
    this.maxPrice = maxPrice;
  }

  public SearchCriteria oneFlightOfferPerDay(Boolean oneFlightOfferPerDay) {
    this.oneFlightOfferPerDay = oneFlightOfferPerDay;
    return this;
  }

   /**
   * Requests the system to find at least one flight-offer per day, if possible, when a range of dates is specified. Default is false.
   * @return oneFlightOfferPerDay
  **/
  @Schema(example = "true", description = "Requests the system to find at least one flight-offer per day, if possible, when a range of dates is specified. Default is false.")
  public Boolean isOneFlightOfferPerDay() {
    return oneFlightOfferPerDay;
  }

  public void setOneFlightOfferPerDay(Boolean oneFlightOfferPerDay) {
    this.oneFlightOfferPerDay = oneFlightOfferPerDay;
  }

  public SearchCriteria pricingOptions(ExtendedPricingOptions pricingOptions) {
    this.pricingOptions = pricingOptions;
    return this;
  }

   /**
   * Get pricingOptions
   * @return pricingOptions
  **/
  @Schema(description = "")
  public ExtendedPricingOptions getPricingOptions() {
    return pricingOptions;
  }

  public void setPricingOptions(ExtendedPricingOptions pricingOptions) {
    this.pricingOptions = pricingOptions;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SearchCriteria searchCriteria = (SearchCriteria) o;
    return Objects.equals(this.addOneWayOffers, searchCriteria.addOneWayOffers) &&
        Objects.equals(this.additionalInformation, searchCriteria.additionalInformation) &&
        Objects.equals(this.allowAlternativeFareOptions, searchCriteria.allowAlternativeFareOptions) &&
        Objects.equals(this.excludeAllotments, searchCriteria.excludeAllotments) &&
        Objects.equals(this.flightFilters, searchCriteria.flightFilters) &&
        Objects.equals(this.maxFlightOffers, searchCriteria.maxFlightOffers) &&
        Objects.equals(this.maxPrice, searchCriteria.maxPrice) &&
        Objects.equals(this.oneFlightOfferPerDay, searchCriteria.oneFlightOfferPerDay) &&
        Objects.equals(this.pricingOptions, searchCriteria.pricingOptions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(addOneWayOffers, additionalInformation, allowAlternativeFareOptions, excludeAllotments, flightFilters, maxFlightOffers, maxPrice, oneFlightOfferPerDay, pricingOptions);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SearchCriteria {\n");
    
    sb.append("    addOneWayOffers: ").append(toIndentedString(addOneWayOffers)).append("\n");
    sb.append("    additionalInformation: ").append(toIndentedString(additionalInformation)).append("\n");
    sb.append("    allowAlternativeFareOptions: ").append(toIndentedString(allowAlternativeFareOptions)).append("\n");
    sb.append("    excludeAllotments: ").append(toIndentedString(excludeAllotments)).append("\n");
    sb.append("    flightFilters: ").append(toIndentedString(flightFilters)).append("\n");
    sb.append("    maxFlightOffers: ").append(toIndentedString(maxFlightOffers)).append("\n");
    sb.append("    maxPrice: ").append(toIndentedString(maxPrice)).append("\n");
    sb.append("    oneFlightOfferPerDay: ").append(toIndentedString(oneFlightOfferPerDay)).append("\n");
    sb.append("    pricingOptions: ").append(toIndentedString(pricingOptions)).append("\n");
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
