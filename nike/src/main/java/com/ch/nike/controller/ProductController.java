package com.ch.nike.controller;


import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.ch.nike.dto.Category;
import com.ch.nike.dto.Product;
import com.ch.nike.dto.ProductDetail;
import com.ch.nike.dto.ProductFeature;
import com.ch.nike.dto.ProductPhoto;
import com.ch.nike.dto.Review;
import com.ch.nike.dto.ReviewPhoto;
import com.ch.nike.service.ProductDetailService;
import com.ch.nike.service.ProductFeatureService;
import com.ch.nike.service.ProductPhotoService;
import com.ch.nike.service.ProductService;
import com.ch.nike.service.ReviewPhotoService;
import com.ch.nike.service.ReviewService;

@Controller
public class ProductController {
	@Autowired
	private ProductService ps;
	@Autowired
	private ProductPhotoService pps;
	@Autowired
	private ProductDetailService pds;
	@Autowired
	private ProductFeatureService pfs;
	@Autowired
	private ReviewService rs;
	@Autowired
	private ReviewPhotoService rps;
	
	
	@RequestMapping("/") //메인 최하단 하단 신발 리스트 by창률 // 로그아웃 위한 세션작업 by수인
	public String main(Model model, HttpSession session) {
		return "nike_main";
	}
	
	
	@RequestMapping("/product/newReleases.do")
	public String newReleases(Model model) {
		List<Product> productList = ps.list();
		model.addAttribute("productList", productList);
		return "product/newReleases";
	}
	
	@RequestMapping("/product/productDetail.do") //해당상품의 상세정보 by수인
	public String productDetail(int productNo, String color, Model model) {
		Product product = ps.selectsoo(productNo);
		
		List<ProductDetail> productDetailList  = pds.detailList(productNo);
		List<ProductPhoto> productPhotoList = pps.photoList(productNo);		
		List<ProductFeature> productFeatureList = pfs.featureList(productNo);

		model.addAttribute("productFeatureList",productFeatureList);
		
		//리뷰리스트
		List<Review> rvList = rs.selectProductReview(productNo);
		List<ReviewPhoto> rvPhotos = new ArrayList<>();	
		List<ReviewPhoto> rvPhotos2 = new ArrayList<>();
		for (Review rv:rvList) {
			rvPhotos = rps.selectReviewPhoto(rv.getReviewNo());
			rvPhotos2.addAll(rvPhotos);
		}
		
		model.addAttribute("product", product);
		model.addAttribute("productDetailList",productDetailList);
		model.addAttribute("productPhotoList",productPhotoList);
		model.addAttribute("color", color);
		
		model.addAttribute("rvPhotos", rvPhotos2);
		model.addAttribute("rvList", rvList);
		model.addAttribute("productNo", productNo);	

		
		return "product/productDetail";
	}
	
}
