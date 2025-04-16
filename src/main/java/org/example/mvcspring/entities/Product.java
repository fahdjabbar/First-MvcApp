package org.example.mvcspring.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.*;

@Entity
@NoArgsConstructor @AllArgsConstructor @ToString  @Getter
@Setter @Builder
public class Product {
    @Id @GeneratedValue
    private Long id;
    private String name;
    private double price;
    private int quantity;
}
