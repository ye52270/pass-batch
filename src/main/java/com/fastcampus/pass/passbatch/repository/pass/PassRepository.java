package com.fastcampus.pass.passbatch.repository.pass;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PassRepository extends JpaRepository<PassEntity, Integer> {
}
