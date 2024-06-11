package org.example.petmanage1.controller;

import org.example.petmanage1.entity.Pet;
import org.example.petmanage1.service.PetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/pets")
public class PetConroller {
    private final PetService petService;
    @Autowired
    public PetConroller(PetService petService) {
        this.petService = petService;
    }
    //支持分页显示pet列表请求
    //addPet()实现添加宠物请求
    //editPet()实现编辑更新宠物信息
    //deletePet()实现删除宠物信息
}
