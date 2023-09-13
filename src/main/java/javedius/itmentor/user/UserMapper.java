package javedius.itmentor.user;

import org.springframework.stereotype.Component;

public class UserMapper {

    UserDto entityToDto(UserEntity entity) {
        return new UserDto(entity.getId(), entity.getLogin());
    }


    UserEntity dtoToEntity(UserDto dto) {
        return new UserEntity(dto.getId(), dto.getLogin());
    }
}
