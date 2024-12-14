package com.app.springpowpow.mapper;

import com.app.springpowpow.domain.ProductDTO;
import com.app.springpowpow.domain.ProductVO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Optional;

@Mapper
public interface ProductMapper {
//    제품 추가
    public void insert(ProductVO productVO);
//    제품 단일
    public Optional<ProductDTO> select(Long id);
//    제품 리스트
    public List<ProductDTO> selectAll();
//    판매자의 모든 제품
    public List<ProductDTO> selectAllBySeller(Long memberId);
//    수정
    public void update(ProductDTO productDTO);
//    삭제
    public void delete(Long id);

}
