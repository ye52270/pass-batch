package com.fastcampus.pass.passbatch.repository.packaze;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PackageRepository extends JpaRepository<PackageEntity, Integer> {
}
