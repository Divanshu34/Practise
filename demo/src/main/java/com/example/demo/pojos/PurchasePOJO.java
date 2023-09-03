package com.example.demo.pojos;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(name = "purchases")
public class PurchasePOJO {
    @Id
    private Long id;
    private String name;
    private String quality;
    private Long quanity;

    // PurchasePOJO(){}

    public PurchasePOJO(Long id, String name, String quality, Long quanity) {
        this.id = id;
        this.name = name;
        this.quality = quality;
        this.quanity = quanity;
    }

    // public static void main(String... args) {
    //     PurchasePOJO purchasePOJO = new PurchasePOJO();
    // }

    // PurchasePOJO(){

    // }
    // public String getName() {
    // return name;
    // }
    // public void setName(String name) {
    // this.name = name;
    // }

}
