package com.nish.product.query.api.projection;

import com.nish.product.command.api.data.ProductRepository;
import com.nish.product.command.api.model.ProductRestModel;
import com.nish.product.query.api.controller.queries.GetProductQuery;
import org.axonframework.queryhandling.QueryHandler;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class ProductProjection {
@Autowired
    private ProductRepository productRepository;
@QueryHandler
public List<ProductRestModel> handle (GetProductQuery getProductQuery){
var products = productRepository.findAll();
var productRestModel = products.stream().map(product -> ProductRestModel.builder().name(product.getName()).price(product.getPrice()).quantity(product.getQuantity()).build()).collect(Collectors.toList());
return productRestModel;
}

}
