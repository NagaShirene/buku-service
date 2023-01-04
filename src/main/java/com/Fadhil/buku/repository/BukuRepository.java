/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.Fadhil.buku.repository;

import com.Fadhil.buku.entity.Buku;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author user
 */
public interface BukuRepository extends JpaRepository<Buku, Long>{

    public Buku findByBukuId(Long bukuId);
    
}
