package com.example.demo.repository;

import com.example.demo.model.UserModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
@Transactional
public interface UserRepository extends JpaRepository<UserModel,String> {
    @Query(value = "select id, nama,alamat, kota, provinsi,  stats from allData" , nativeQuery = true)
    List<UserModel> getAllUser();
}
