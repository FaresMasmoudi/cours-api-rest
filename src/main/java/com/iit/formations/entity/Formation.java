package com.iit.formations.entity;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import lombok.*;

import java.util.List;
@Data
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "FORMATION")
public class Formation {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "FORMATION_ID")
    private Long id;
    @Column(name = "FORMATION_THEME")
    private String theme;
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name="FK_FD_ID")
    private FormationDetail formationDetail;
    @JsonManagedReference
    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(
            name = "formations_tps",
            joinColumns = @JoinColumn(
                    name = "FORMATION_ID", referencedColumnName = "FORMATION_ID"
            ),
            inverseJoinColumns = @JoinColumn(
                    name = "TP_ID", referencedColumnName = "TP_ID"
            )
    )
    private List<TravauxPratiques> tps;

}