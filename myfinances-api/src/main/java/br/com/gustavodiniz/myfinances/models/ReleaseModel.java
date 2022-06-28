package br.com.gustavodiniz.myfinances.models;

import br.com.gustavodiniz.myfinances.enums.ReleaseStatusEnum;
import br.com.gustavodiniz.myfinances.enums.ReleaseTypeEnum;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.jpa.convert.threeten.Jsr310JpaConverters;

import javax.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDate;

@Data
@Entity
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "tb_releases", schema = "financial")
public class ReleaseModel {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "description")
    private String description;

    @Column(name = "month")
    private Integer month;

    @Column(name = "year")
    private Integer year;

    @Column(name = "value")
    private BigDecimal value;

    @Column(name = "type")
    @Enumerated(value = EnumType.STRING)
    private ReleaseTypeEnum type;

    @Column(name = "status")
    @Enumerated(value = EnumType.STRING)
    private ReleaseStatusEnum status;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private UserModel userId;

    @Column(name = "register_date")
    @Convert(converter = Jsr310JpaConverters.LocalDateConverter.class)
    private LocalDate registerDate;
}
