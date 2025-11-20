package ru.maximenko.data.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import org.springframework.lang.Nullable;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * StudentDataResponse
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-11-20T15:09:46.742046200+03:00[Europe/Moscow]", comments = "Generator version: 7.15.0")
public class StudentDataResponse {

  private @Nullable Long id;

  private @Nullable String fullName;

  private @Nullable String passport;

  public StudentDataResponse id(@Nullable Long id) {
    this.id = id;
    return this;
  }

  /**
   * Get id
   * @return id
   */
  
  @Schema(name = "id", example = "1", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("id")
  public @Nullable Long getId() {
    return id;
  }

  public void setId(@Nullable Long id) {
    this.id = id;
  }

  public StudentDataResponse fullName(@Nullable String fullName) {
    this.fullName = fullName;
    return this;
  }

  /**
   * Get fullName
   * @return fullName
   */
  
  @Schema(name = "fullName", example = "Иванов Иван Иванович", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("fullName")
  public @Nullable String getFullName() {
    return fullName;
  }

  public void setFullName(@Nullable String fullName) {
    this.fullName = fullName;
  }

  public StudentDataResponse passport(@Nullable String passport) {
    this.passport = passport;
    return this;
  }

  /**
   * Get passport
   * @return passport
   */
  
  @Schema(name = "passport", example = "+7 999 123-45-67", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("passport")
  public @Nullable String getPassport() {
    return passport;
  }

  public void setPassport(@Nullable String passport) {
    this.passport = passport;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StudentDataResponse studentDataResponse = (StudentDataResponse) o;
    return Objects.equals(this.id, studentDataResponse.id) &&
        Objects.equals(this.fullName, studentDataResponse.fullName) &&
        Objects.equals(this.passport, studentDataResponse.passport);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, fullName, passport);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StudentDataResponse {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    fullName: ").append(toIndentedString(fullName)).append("\n");
    sb.append("    passport: ").append(toIndentedString(passport)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

