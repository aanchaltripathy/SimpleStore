package com.aanchal.ecom_proj.model;
import jakarta.persistence.*;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Lob;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private String description;
    private String brand;
    private BigDecimal price;
    private String category;
    private Date releaseDate;
    private boolean productAvailable;
    private int stockquantity;
    private String imageName;
    private String imageType;
    @Lob
    private byte[] imageDate;
}
