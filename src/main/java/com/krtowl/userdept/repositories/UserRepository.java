package com.krtowl.userdept.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.krtowl.userdept.entities.User;
public interface UserRepository extends JpaRepository <User, Long> {

}
