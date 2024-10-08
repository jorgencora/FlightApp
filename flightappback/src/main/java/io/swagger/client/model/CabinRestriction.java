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
import io.swagger.client.model.Coverage;
import io.swagger.client.model.TravelClass;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
/**
 * CabinRestriction
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2024-09-05T13:16:41.117316-07:00[America/Hermosillo]")

public class CabinRestriction {
  @SerializedName("cabin")
  private TravelClass cabin = null;

  @SerializedName("coverage")
  private Coverage coverage = null;

  @SerializedName("originDestinationIds")
  private List<String> originDestinationIds = null;

  public CabinRestriction cabin(TravelClass cabin) {
    this.cabin = cabin;
    return this;
  }

   /**
   * Get cabin
   * @return cabin
  **/
  @Schema(description = "")
  public TravelClass getCabin() {
    return cabin;
  }

  public void setCabin(TravelClass cabin) {
    this.cabin = cabin;
  }

  public CabinRestriction coverage(Coverage coverage) {
    this.coverage = coverage;
    return this;
  }

   /**
   * Get coverage
   * @return coverage
  **/
  @Schema(description = "")
  public Coverage getCoverage() {
    return coverage;
  }

  public void setCoverage(Coverage coverage) {
    this.coverage = coverage;
  }

  public CabinRestriction originDestinationIds(List<String> originDestinationIds) {
    this.originDestinationIds = originDestinationIds;
    return this;
  }

  public CabinRestriction addOriginDestinationIdsItem(String originDestinationIdsItem) {
    if (this.originDestinationIds == null) {
      this.originDestinationIds = new ArrayList<String>();
    }
    this.originDestinationIds.add(originDestinationIdsItem);
    return this;
  }

   /**
   * The list of originDestination identifiers for which the cabinRestriction applies
   * @return originDestinationIds
  **/
  @Schema(example = "[1,2]", description = "The list of originDestination identifiers for which the cabinRestriction applies")
  public List<String> getOriginDestinationIds() {
    return originDestinationIds;
  }

  public void setOriginDestinationIds(List<String> originDestinationIds) {
    this.originDestinationIds = originDestinationIds;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CabinRestriction cabinRestriction = (CabinRestriction) o;
    return Objects.equals(this.cabin, cabinRestriction.cabin) &&
        Objects.equals(this.coverage, cabinRestriction.coverage) &&
        Objects.equals(this.originDestinationIds, cabinRestriction.originDestinationIds);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cabin, coverage, originDestinationIds);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CabinRestriction {\n");
    
    sb.append("    cabin: ").append(toIndentedString(cabin)).append("\n");
    sb.append("    coverage: ").append(toIndentedString(coverage)).append("\n");
    sb.append("    originDestinationIds: ").append(toIndentedString(originDestinationIds)).append("\n");
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
