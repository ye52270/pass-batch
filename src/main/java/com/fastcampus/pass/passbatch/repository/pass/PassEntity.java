package com.fastcampus.pass.passbatch.repository.pass;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "pass")
public class PassEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer passSeq;
    private Integer packageSeq;
    private String userId;

    @Enumerated
    private PassStatus status;
    private Integer remainingCount;

    private LocalDateTime startedAt;
    private LocalDateTime endedAt;
    private LocalDateTime expiredAt;
}
