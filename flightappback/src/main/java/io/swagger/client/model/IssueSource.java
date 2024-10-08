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
 * an object containing references to the source of the error
 */
@Schema(description = "an object containing references to the source of the error")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2024-09-05T13:16:41.117316-07:00[America/Hermosillo]")

public class IssueSource {
  @SerializedName("example")
  private String example = null;

  @SerializedName("parameter")
  private String parameter = null;

  @SerializedName("pointer")
  private String pointer = null;

  public IssueSource example(String example) {
    this.example = example;
    return this;
  }

   /**
   * a string indicating an example of the right value
   * @return example
  **/
  @Schema(description = "a string indicating an example of the right value")
  public String getExample() {
    return example;
  }

  public void setExample(String example) {
    this.example = example;
  }

  public IssueSource parameter(String parameter) {
    this.parameter = parameter;
    return this;
  }

   /**
   * a string indicating which URI query parameter caused the issue
   * @return parameter
  **/
  @Schema(description = "a string indicating which URI query parameter caused the issue")
  public String getParameter() {
    return parameter;
  }

  public void setParameter(String parameter) {
    this.parameter = parameter;
  }

  public IssueSource pointer(String pointer) {
    this.pointer = pointer;
    return this;
  }

   /**
   * a JSON Pointer [RFC6901] to the associated entity in the request document
   * @return pointer
  **/
  @Schema(description = "a JSON Pointer [RFC6901] to the associated entity in the request document")
  public String getPointer() {
    return pointer;
  }

  public void setPointer(String pointer) {
    this.pointer = pointer;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IssueSource issueSource = (IssueSource) o;
    return Objects.equals(this.example, issueSource.example) &&
        Objects.equals(this.parameter, issueSource.parameter) &&
        Objects.equals(this.pointer, issueSource.pointer);
  }

  @Override
  public int hashCode() {
    return Objects.hash(example, parameter, pointer);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IssueSource {\n");
    
    sb.append("    example: ").append(toIndentedString(example)).append("\n");
    sb.append("    parameter: ").append(toIndentedString(parameter)).append("\n");
    sb.append("    pointer: ").append(toIndentedString(pointer)).append("\n");
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
