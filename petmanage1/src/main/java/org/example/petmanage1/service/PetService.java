package org.example.petmanage1.service;

import org.example.petmanage1.domain.Pet;
import org.example.petmanage1.repository.PetRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PetService {
    private final PetRepository petRepository;
    @Autowired
    public PetService(PetRepository petRepository) {
        this.petRepository = petRepository;
    }
    // 实现添加宠物的逻辑...
    // 可以调用 petRepository 来保存宠物信息到数据库
    public Pet addPet(Pet pet) {
        return petRepository.save(pet);
    }
    // 实现领养宠物的逻辑...
    public Pet adoptPet(Long petId,Long userId) {
        return null;
    }
}
