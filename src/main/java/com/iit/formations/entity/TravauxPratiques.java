package com.iit.formations.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;
import lombok.*;

import java.util.List;
@Data
@ToString
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Builder
@Table(name = "TP")
public class TravauxPratiques {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="TP_ID")
    Long tpId;
    @Column(name="TP_SUJET")
    String tpSujet;
    @Column(name="TP_DUREE")
    Long tpDuree;
    @JsonBackReference
    @OneToMany(cascade = CascadeType.ALL, mappedBy="tp")
    private List<TpCorrection> TpCorrections;
    @JsonBackReference
    @ManyToMany(mappedBy="tps", cascade = CascadeType.ALL)
    private List<Formation> formations;

}