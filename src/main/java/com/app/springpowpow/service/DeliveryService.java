package com.app.springpowpow.service;

import com.app.springpowpow.domain.DeliveryVO;
import com.app.springpowpow.domain.ProductDTO;

public interface DeliveryService {

    public void insertDeliveryInfo(ProductDTO productDTO);

    public void updateDeliveryInfo(ProductDTO productDTO);

    public void deleteDeliveryInfo(Long id);

}