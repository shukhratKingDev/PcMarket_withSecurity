package com.company.pcmarket.repository;

import com.company.pcmarket.entity.PcMarket;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path = "warehouse",collectionResourceRel = "list")
public interface WareHouseRepository extends JpaRepository<PcMarket,Integer> {
}
