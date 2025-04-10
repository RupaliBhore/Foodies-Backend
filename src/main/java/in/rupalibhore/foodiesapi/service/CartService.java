package in.rupalibhore.foodiesapi.service;

import in.rupalibhore.foodiesapi.io.CartRequest;
import in.rupalibhore.foodiesapi.io.CartResponse;

public interface CartService {
	
    CartResponse addToCart(CartRequest request);

    CartResponse getCart();

    void clearCart();

    CartResponse removeFromCart(CartRequest cartRequest);

}
