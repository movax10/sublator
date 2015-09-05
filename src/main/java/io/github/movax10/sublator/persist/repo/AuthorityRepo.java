package io.github.movax10.sublator.persist.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import io.github.movax10.sublator.persist.entity.Authority;

public interface AuthorityRepo extends JpaRepository<Authority, Long> {

}