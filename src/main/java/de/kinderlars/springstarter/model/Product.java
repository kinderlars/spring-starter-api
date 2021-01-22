package de.kinderlars.springstarter.model;

import java.util.UUID;

public class Product {
  private final UUID id;
  private String name;
  private String description;
  private String vendor;

  public Product(UUID id, String name, String description, String vendor) {
    this.id = id;
    this.name = name;
    this.description = description;
    this.vendor = vendor;
  }

  public UUID getId() {
    return id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public String getVendor() {
    return vendor;
  }

  public void setVendor(String vendor) {
    this.vendor = vendor;
  }
}
