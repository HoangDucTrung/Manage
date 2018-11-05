package com.trunghd.manage.dao;

import com.trunghd.manage.entities.Role;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoleRepository extends JpaRepository<Role, Long> {
}
