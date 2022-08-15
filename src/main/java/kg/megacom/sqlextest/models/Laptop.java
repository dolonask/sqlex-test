package kg.megacom.sqlextest.models;

import lombok.AccessLevel;
import lombok.Data;
import lombok.experimental.FieldDefaults;

import javax.persistence.*;

@Data
@FieldDefaults(level = AccessLevel.PRIVATE)

@Entity
@Table(name = "laptop")
public class Laptop {

    @Id
    Integer code;

    int speed; // smallint NOT NULL ,
    int ram; //  smallint NOT NULL ,
    double hd; //  real NOT NULL ,
    double price;//   decimal(12,2) NULL ,
    int screen; // smallint NOT NULL

    @ManyToOne
            @JoinColumn(name = "model")
    Product product;
}
