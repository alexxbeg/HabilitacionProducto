package com.core.habilitacionproducto.infrastructure.repository;

import com.core.habilitacionproducto.infrastructure.entity.ConfigurationData;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ConfigurationRepository extends JpaRepository<ConfigurationData, Long> {
}


