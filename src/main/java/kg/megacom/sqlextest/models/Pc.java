package kg.megacom.sqlextest.models;


import lombok.AccessLevel;
import lombok.Data;
import lombok.experimental.FieldDefaults;

import javax.persistence.*;

@Data
@FieldDefaults(level = AccessLevel.PRIVATE)

@Entity
@Table(name = "pc")
public class Pc {

    @Id
    Integer code; // int NOT NULL ,
    int speed; //  smallint NOT NULL ,
    int ram ; // smallint NOT NULL ,
    double hd; //  real NOT NULL ,
    @Column(length = 10, nullable = false)
    String cd; //  varchar (10) NOT NULL ,
    double price; //  decimal(12,2) NULL

    @ManyToOne
            @JoinColumn(name = "model",nullable =  false)
    Product product;

}
