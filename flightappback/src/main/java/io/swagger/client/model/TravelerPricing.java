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
import io.swagger.client.model.FareDetailsBySegment;
import io.swagger.client.model.Price;
import io.swagger.client.model.TravelerPricingFareOption;
import io.swagger.client.model.TravelerType;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
/**
 * TravelerPricing
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2024-09-05T13:16:41.117316-07:00[America/Hermosillo]")

public class TravelerPricing {
  @SerializedName("associatedAdultId")
  private String associatedAdultId = null;

  @SerializedName("fareDetailsBySegment")
  private List<FareDetailsBySegment> fareDetailsBySegment = new ArrayList<FareDetailsBySegment>();

  @SerializedName("fareOption")
  private TravelerPricingFareOption fareOption = null;

  @SerializedName("price")
  private Price price = null;

  @SerializedName("travelerId")
  private String travelerId = null;

  @SerializedName("travelerType")
  private TravelerType travelerType = null;

  public TravelerPricing associatedAdultId(String associatedAdultId) {
    this.associatedAdultId = associatedAdultId;
    return this;
  }

   /**
   * if type&#x3D;\&quot;HELD_INFANT\&quot;, corresponds to the adult traveler&#x27;s id who will share the seat
   * @return associatedAdultId
  **/
  @Schema(description = "if type=\"HELD_INFANT\", corresponds to the adult traveler's id who will share the seat")
  public String getAssociatedAdultId() {
    return associatedAdultId;
  }

  public void setAssociatedAdultId(String associatedAdultId) {
    this.associatedAdultId = associatedAdultId;
  }

  public TravelerPricing fareDetailsBySegment(List<FareDetailsBySegment> fareDetailsBySegment) {
    this.fareDetailsBySegment = fareDetailsBySegment;
    return this;
  }

  public TravelerPricing addFareDetailsBySegmentItem(FareDetailsBySegment fareDetailsBySegmentItem) {
    this.fareDetailsBySegment.add(fareDetailsBySegmentItem);
    return this;
  }

   /**
   * Get fareDetailsBySegment
   * @return fareDetailsBySegment
  **/
  @Schema(required = true, description = "")
  public List<FareDetailsBySegment> getFareDetailsBySegment() {
    return fareDetailsBySegment;
  }

  public void setFareDetailsBySegment(List<FareDetailsBySegment> fareDetailsBySegment) {
    this.fareDetailsBySegment = fareDetailsBySegment;
  }

  public TravelerPricing fareOption(TravelerPricingFareOption fareOption) {
    this.fareOption = fareOption;
    return this;
  }

   /**
   * Get fareOption
   * @return fareOption
  **/
  @Schema(required = true, description = "")
  public TravelerPricingFareOption getFareOption() {
    return fareOption;
  }

  public void setFareOption(TravelerPricingFareOption fareOption) {
    this.fareOption = fareOption;
  }

  public TravelerPricing price(Price price) {
    this.price = price;
    return this;
  }

   /**
   * Get price
   * @return price
  **/
  @Schema(description = "")
  public Price getPrice() {
    return price;
  }

  public void setPrice(Price price) {
    this.price = price;
  }

  public TravelerPricing travelerId(String travelerId) {
    this.travelerId = travelerId;
    return this;
  }

   /**
   * Id of the traveler
   * @return travelerId
  **/
  @Schema(example = "1", required = true, description = "Id of the traveler")
  public String getTravelerId() {
    return travelerId;
  }

  public void setTravelerId(String travelerId) {
    this.travelerId = travelerId;
  }

  public TravelerPricing travelerType(TravelerType travelerType) {
    this.travelerType = travelerType;
    return this;
  }

   /**
   * Get travelerType
   * @return travelerType
  **/
  @Schema(required = true, description = "")
  public TravelerType getTravelerType() {
    return travelerType;
  }

  public void setTravelerType(TravelerType travelerType) {
    this.travelerType = travelerType;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TravelerPricing travelerPricing = (TravelerPricing) o;
    return Objects.equals(this.associatedAdultId, travelerPricing.associatedAdultId) &&
        Objects.equals(this.fareDetailsBySegment, travelerPricing.fareDetailsBySegment) &&
        Objects.equals(this.fareOption, travelerPricing.fareOption) &&
        Objects.equals(this.price, travelerPricing.price) &&
        Objects.equals(this.travelerId, travelerPricing.travelerId) &&
        Objects.equals(this.travelerType, travelerPricing.travelerType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(associatedAdultId, fareDetailsBySegment, fareOption, price, travelerId, travelerType);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TravelerPricing {\n");
    
    sb.append("    associatedAdultId: ").append(toIndentedString(associatedAdultId)).append("\n");
    sb.append("    fareDetailsBySegment: ").append(toIndentedString(fareDetailsBySegment)).append("\n");
    sb.append("    fareOption: ").append(toIndentedString(fareOption)).append("\n");
    sb.append("    price: ").append(toIndentedString(price)).append("\n");
    sb.append("    travelerId: ").append(toIndentedString(travelerId)).append("\n");
    sb.append("    travelerType: ").append(toIndentedString(travelerType)).append("\n");
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
