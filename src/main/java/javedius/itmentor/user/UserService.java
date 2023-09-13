package javedius.itmentor.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;

    @Autowired
    private final UserMapper userMapper = new UserMapper();

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }


    UserDto createUser(UserDto dto) {
//        return dto;
        UserEntity entity = userRepository.save(userMapper.dtoToEntity(dto));
        System.out.println(entity);
        return userMapper.entityToDto(entity);
    }

    List<UserDto> getUserList() {
        return userRepository.findAll().stream().map(userMapper::entityToDto).toList();
    }
}
