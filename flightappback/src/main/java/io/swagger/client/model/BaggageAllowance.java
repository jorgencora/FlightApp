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
/**
 * baggageAllowance
 */
@Schema(description = "baggageAllowance")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2024-09-05T13:16:41.117316-07:00[America/Hermosillo]")

public class BaggageAllowance {
  @SerializedName("quantity")
  private Integer quantity = null;

  @SerializedName("weight")
  private Integer weight = null;

  @SerializedName("weightUnit")
  private String weightUnit = null;

  public BaggageAllowance quantity(Integer quantity) {
    this.quantity = quantity;
    return this;
  }

   /**
   * Total number of units
   * @return quantity
  **/
  @Schema(example = "1", description = "Total number of units")
  public Integer getQuantity() {
    return quantity;
  }

  public void setQuantity(Integer quantity) {
    this.quantity = quantity;
  }

  public BaggageAllowance weight(Integer weight) {
    this.weight = weight;
    return this;
  }

   /**
   * Weight of the baggage allowance
   * @return weight
  **/
  @Schema(example = "20", description = "Weight of the baggage allowance")
  public Integer getWeight() {
    return weight;
  }

  public void setWeight(Integer weight) {
    this.weight = weight;
  }

  public BaggageAllowance weightUnit(String weightUnit) {
    this.weightUnit = weightUnit;
    return this;
  }

   /**
   * Code to qualify unit as pounds or kilos
   * @return weightUnit
  **/
  @Schema(example = "KG", description = "Code to qualify unit as pounds or kilos")
  public String getWeightUnit() {
    return weightUnit;
  }

  public void setWeightUnit(String weightUnit) {
    this.weightUnit = weightUnit;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BaggageAllowance baggageAllowance = (BaggageAllowance) o;
    return Objects.equals(this.quantity, baggageAllowance.quantity) &&
        Objects.equals(this.weight, baggageAllowance.weight) &&
        Objects.equals(this.weightUnit, baggageAllowance.weightUnit);
  }

  @Override
  public int hashCode() {
    return Objects.hash(quantity, weight, weightUnit);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BaggageAllowance {\n");
    
    sb.append("    quantity: ").append(toIndentedString(quantity)).append("\n");
    sb.append("    weight: ").append(toIndentedString(weight)).append("\n");
    sb.append("    weightUnit: ").append(toIndentedString(weightUnit)).append("\n");
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
