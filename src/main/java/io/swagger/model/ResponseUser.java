package io.swagger.model;

import java.time.LocalDate;
import java.util.Objects;
import java.util.UUID;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;

import io.swagger.v3.oas.annotations.media.Schema;
import org.threeten.bp.OffsetDateTime;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * ResponseUser
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2024-08-21T01:22:44.426254300Z[GMT]")

@JsonInclude(JsonInclude.Include.NON_NULL) 
public class ResponseUser   {
  
  @JsonProperty("mensaje")
  private String mensaje = null;
  public String getMensaje() {
	return mensaje;
}

public void setMensaje(String mensaje) {
	this.mensaje = mensaje;
}

@JsonProperty("id")
  private UUID id = null;

  @JsonProperty("created")
  private LocalDate created = null;

  @JsonProperty("modified")
  private LocalDate modified = null;

  @JsonProperty("last_login")
  private LocalDate lastLogin = null;

  @JsonProperty("token")
  private String token = null;

  @JsonProperty("isactive")
  private Boolean isactive = null;

  public ResponseUser id(UUID id) {
    this.id = id;
    return this;
  }

  /**
   * Get id
   * @return id
   **/
  @Schema(example = "7b7f5924-393f-487f-ba2a-4e38afa4fb9f", description = "")
      @NotNull

    public UUID getId() {
    return id;
  }

  public void setId(UUID id) {
    this.id = id;
  }

  public ResponseUser created(LocalDate created) {
    this.created = created;
    return this;
  }

  /**
   * Get created
   * @return created
   **/
  @Schema(description = "")
      @NotNull

    @Valid
    public LocalDate getCreated() {
    return created;
  }

  public void setCreated(LocalDate created) {
    this.created = created;
  }

  public ResponseUser modified(LocalDate modified) {
    this.modified = modified;
    return this;
  }

  /**
   * Get modified
   * @return modified
   **/
  @Schema(description = "")
      @NotNull

    @Valid
    public LocalDate getModified() {
    return modified;
  }

  public void setModified(LocalDate modified) {
    this.modified = modified;
  }

  public ResponseUser lastLogin(LocalDate lastLogin) {
    this.lastLogin = lastLogin;
    return this;
  }

  /**
   * Get lastLogin
   * @return lastLogin
   **/
  @Schema(description = "")
      @NotNull

    @Valid
    public LocalDate getLastLogin() {
    return lastLogin;
  }

  public void setLastLogin(LocalDate lastLogin) {
    this.lastLogin = lastLogin;
  }

  public ResponseUser token(String token) {
    this.token = token;
    return this;
  }

  /**
   * Get token
   * @return token
   **/
  @Schema(example = "7b7f5924393f487fba2a4e38afa4fb9f", description = "")
      @NotNull

    public String getToken() {
    return token;
  }

  public void setToken(String token) {
    this.token = token;
  }

  public ResponseUser isactive(Boolean isactive) {
    this.isactive = isactive;
    return this;
  }

  /**
   * Get isactive
   * @return isactive
   **/
  @Schema(example = "true", description = "")
      @NotNull

    public Boolean isIsactive() {
    return isactive;
  }

  public void setIsactive(Boolean isactive) {
    this.isactive = isactive;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ResponseUser responseUser = (ResponseUser) o;
    return Objects.equals(this.id, responseUser.id) &&
        Objects.equals(this.created, responseUser.created) &&
        Objects.equals(this.modified, responseUser.modified) &&
        Objects.equals(this.lastLogin, responseUser.lastLogin) &&
        Objects.equals(this.token, responseUser.token) &&
        Objects.equals(this.isactive, responseUser.isactive);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, created, modified, lastLogin, token, isactive);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ResponseUser {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    created: ").append(toIndentedString(created)).append("\n");
    sb.append("    modified: ").append(toIndentedString(modified)).append("\n");
    sb.append("    lastLogin: ").append(toIndentedString(lastLogin)).append("\n");
    sb.append("    token: ").append(toIndentedString(token)).append("\n");
    sb.append("    isactive: ").append(toIndentedString(isactive)).append("\n");
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
