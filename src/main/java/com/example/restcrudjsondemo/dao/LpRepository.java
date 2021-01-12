package com.example.restcrudjsondemo.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.restcrudjsondemo.entity.Lp;

public interface LpRepository extends JpaRepository<Lp, Integer> {

}
