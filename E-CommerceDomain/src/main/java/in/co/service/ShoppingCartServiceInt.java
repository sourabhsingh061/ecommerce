package in.co.service;

import java.util.List;

import in.co.common.BaseServiceInt;
import in.co.dto.ShoppingCartDTO;

public interface ShoppingCartServiceInt extends BaseServiceInt<ShoppingCartDTO> {

	ShoppingCartDTO getCartItemsByUser(Long userId);

    ShoppingCartDTO getCartItemByProduct(Long productId);
}
