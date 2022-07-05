package com.example.orderservice.entity;

import com.example.orderservice.entity.enums.ClientStatus;
import com.example.orderservice.entity.enums.Language;
import com.example.orderservice.entity.enums.Region;
import com.example.orderservice.entity.enums.UserType;
import lombok.*;

import javax.persistence.*;
import java.time.LocalDate;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
public class Human {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false, unique = true)
    private String number;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private ClientStatus status;

    @Column(nullable = false)
    private LocalDate birthdate;

    private Region region;

    @Column(nullable = false)
    @Enumerated(EnumType.STRING)
    private Language lang;

    @Column(nullable = false)
    @Enumerated(EnumType.STRING)
    private UserType userType;

    @OneToOne
    private Attachment photo;
}
