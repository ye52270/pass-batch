package com.fastcampus.pass.passbatch.repository.booking;

import com.fastcampus.pass.passbatch.repository.BaseEntity;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Getter@Setter@ToString
public class BookingEntity extends BaseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer bookingSeq;
    private Integer passSeq;
    private String userId;

    @Enumerated(EnumType.STRING)
    private BookingStatus status;
    private boolean usedPass;
    private boolean attended;

    private LocalDateTime startedAt;
    private LocalDateTime endedAt;
    private LocalDateTime cancelledAt;
}
