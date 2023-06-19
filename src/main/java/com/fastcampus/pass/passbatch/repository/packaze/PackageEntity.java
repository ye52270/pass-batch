package com.fastcampus.pass.passbatch.repository.packaze;

import com.fastcampus.pass.passbatch.repository.BaseEntity;

import javax.persistence.*;

@Entity
@Table(name = "package")
public class PackageEntity extends BaseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer packageSeq;

    private String packageName;
    private Integer count;
    private Integer period;
}
