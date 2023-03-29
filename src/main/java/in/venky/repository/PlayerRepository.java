package in.venky.repository;

import org.springframework.data.repository.CrudRepository;

import in.venky.entity.PlayerEntity;

public interface PlayerRepository extends CrudRepository<PlayerEntity, Integer> {

}
