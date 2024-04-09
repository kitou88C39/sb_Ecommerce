package com.example.library.model;

import javax.persistence.*
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "products", uniqueConstraints = @UniqueConstraint(columnNames= {"name","image"}))
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.INDENITY)
    @Column(name = "product_id")
    private Long id;
    private String name;
    private String description;
    private double constPrice;
    private double salePrice;
    private int currentQuantity;
    @Lob
    @Column(columnDefinition = "MEDIUMBLOB")
    private String image;
    @ManyToOne(fetch = FetchType.EAGER, cascade = CasecadeType.ALL)
    @JoinColumn(name = "category_id", referncedColumnName = "category_id")
    private Category category;
    private boolean is_deleted;
    private boolean is_activated;
}