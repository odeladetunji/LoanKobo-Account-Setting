package com.dao;

import com.entity.Biodata;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface RegistrationRepository extends CrudRepository<Biodata, Long> {
    List<Biodata> findDistinctByEmail(String email);
}



























