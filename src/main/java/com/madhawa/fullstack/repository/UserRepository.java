// This will create the interface

package com.madhawa.fullstack.repository;

import com.madhawa.fullstack.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {
}
