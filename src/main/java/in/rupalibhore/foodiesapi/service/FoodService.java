package in.rupalibhore.foodiesapi.service;

import org.springframework.web.multipart.MultipartFile;

import in.rupalibhore.foodiesapi.io.FoodRequest;
import in.rupalibhore.foodiesapi.io.FoodResponse;

import java.util.List;

public interface FoodService {
	
	 String uploadFile(MultipartFile file);

	    FoodResponse addFood(FoodRequest request, MultipartFile file);

	    List<FoodResponse> readFoods();
//
	    FoodResponse readFood(String id);
//
	    boolean deleteFile(String filename);
//
	    void deleteFood(String id);

}
