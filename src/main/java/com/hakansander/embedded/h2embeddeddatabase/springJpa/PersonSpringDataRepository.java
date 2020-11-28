package com.hakansander.embedded.h2embeddeddatabase.springJpa;

import com.hakansander.embedded.h2embeddeddatabase.entity.Person;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonSpringDataRepository extends JpaRepository<Person, Integer> {
}
