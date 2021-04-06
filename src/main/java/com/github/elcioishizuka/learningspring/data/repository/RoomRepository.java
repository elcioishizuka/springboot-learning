package com.github.elcioishizuka.learningspring.data.repository;

import com.github.elcioishizuka.learningspring.data.entity.Room;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RoomRepository extends CrudRepository<Room, Long> {

}
