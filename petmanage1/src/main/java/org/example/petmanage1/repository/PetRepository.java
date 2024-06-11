package org.example.petmanage1.repository;

import org.example.petmanage1.domain.Pet;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PetRepository extends JpaRepository<Pet, Long> {
    //根据主人ID查询宠物
    List<Pet> findByOwnerId(Long id);
}
