package dio.me.dio_desafio_api.service;

import dio.me.dio_desafio_api.domain.model.User;

public interface UserService {
    User findbyId(Long id);

    User create(User userToCreate);
}
