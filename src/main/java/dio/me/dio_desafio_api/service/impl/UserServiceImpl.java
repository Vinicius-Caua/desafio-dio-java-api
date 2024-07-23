package dio.me.dio_desafio_api.service.impl;

import dio.me.dio_desafio_api.domain.model.User;
import dio.me.dio_desafio_api.domain.repository.UserRepository;
import dio.me.dio_desafio_api.service.UserService;
import org.springframework.stereotype.Service;

import java.util.NoSuchElementException;

@Service
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;

    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public User findbyId(Long id) {
        return userRepository.findById(id).orElseThrow(NoSuchElementException::new);
    }

    @Override
    public User create(User userToCreate) {
        if (userRepository.existsByNumber(userToCreate.getNumber())){
            throw new IllegalArgumentException("This User ID already exists");
        }
        return this.userRepository.save(userToCreate);
    }
}
