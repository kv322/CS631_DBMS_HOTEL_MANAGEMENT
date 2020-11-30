package com.njit.cs631.dbms.model;

import lombok.*;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.io.Serializable;

@Table(name = "HOTEL")
@Data
@Entity
@Builder(toBuilder = true)
@ToString
@AllArgsConstructor(access = AccessLevel.PACKAGE)
@NoArgsConstructor(access = AccessLevel.PUBLIC)
public class Hotel implements Serializable {
    @Id
    @Column(name = "HOTEL_ID")
    @GeneratedValue(generator = "system-uuid")
    @GenericGenerator(name = "system-uuid", strategy = "org.hibernate.id.UUIDGenerator")
    private String hotelId;

    @Column(name = "STREET")
    private String street;

    @Column(name = "STATE")
    private String state;

    @Column(name = "COUNTRY")
    private String country;

    @Column(name = "ZIP")
    private Integer zip;

    @Column(name = "PHONE_NUMBER")
    private Integer phoneNumber;
}
