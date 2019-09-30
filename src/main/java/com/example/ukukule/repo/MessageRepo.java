package com.example.ukukule.repo;

import com.example.ukukule.domain.Message;
import org.springframework.data.repository.CrudRepository;

public interface MessageRepo extends CrudRepository<Message, Long> {
}
