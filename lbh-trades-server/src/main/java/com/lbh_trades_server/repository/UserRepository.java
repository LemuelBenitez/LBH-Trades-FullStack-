package com.lbh_trades_server.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.lbh_trades_server.modal.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

}
