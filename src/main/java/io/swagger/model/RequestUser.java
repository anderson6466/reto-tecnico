package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.model.Phones;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * RequestUser
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2024-08-21T01:22:44.426254300Z[GMT]")


public class RequestUser   {
	@Valid
  @JsonProperty("name")
  private String name = null;

  @JsonProperty("email")
  private String email = null;

  @JsonProperty("password")
  private String password = null;

  @JsonProperty("phones")
  @Valid
  private List<Phones> phones = new ArrayList<Phones>();

  public RequestUser name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Get name
   * @return name
   **/
  @Schema(example = "Juan Rodriguez", required = true, description = "")
      @NotNull
      @Pattern(regexp="^([A-ZÁÉÍÓÚ]{1}[a-zñáéíóú]+[\\s]*)+$")   
  @Size(min=3,max=20)   public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public RequestUser email(String email) {
    this.email = email;
    return this;
  }

  /**
   * Get email
   * @return email
   **/
  @Schema(example = "juan@rodriguez.org", required = true, description = "")
      @NotNull
      @Pattern(regexp="^[^@]+@[^@]+\\.[^@]+$")
    @Size(min=3,max=20)   public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public RequestUser password(String password) {
    this.password = password;
    return this;
  }

  /**
   * Get password
   * @return password
   **/
  @Schema(example = "hunters2", required = true, description = "")
      @NotNull

      @Pattern(regexp="^[0-9a-zA-Z]+$") 
  @Size(min=3,max=20)   public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }

  public RequestUser phones(List<Phones> phones) {
    this.phones = phones;
    return this;
  }

  public RequestUser addPhonesItem(Phones phonesItem) {
    this.phones.add(phonesItem);
    return this;
  }

  /**
   * Get phones
   * @return phones
   **/
  @Schema(required = true, description = "")
      @NotNull
    @Valid
    public List<Phones> getPhones() {
    return phones;
  }

  public void setPhones(List<Phones> phones) {
    this.phones = phones;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RequestUser requestUser = (RequestUser) o;
    return Objects.equals(this.name, requestUser.name) &&
        Objects.equals(this.email, requestUser.email) &&
        Objects.equals(this.password, requestUser.password) &&
        Objects.equals(this.phones, requestUser.phones);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, email, password, phones);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RequestUser {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    password: ").append(toIndentedString(password)).append("\n");
    sb.append("    phones: ").append(toIndentedString(phones)).append("\n");
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
