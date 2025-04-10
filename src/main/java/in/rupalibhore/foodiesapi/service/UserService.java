package in.rupalibhore.foodiesapi.service;

import in.rupalibhore.foodiesapi.io.UserRequest;
import in.rupalibhore.foodiesapi.io.UserResponse;



public interface UserService {

    UserResponse registerUser(UserRequest request);

    String findByUserId();
}
