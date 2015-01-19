/**
 * 
 */
package com.aokunsang.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.aokunsang.web.BaseController;

/**
 * @author tushen
 * @date Nov 5, 2011
 */
@Controller
public class HomeController extends BaseController {

	@RequestMapping(value="/index",method=RequestMethod.GET)
	public String test(){
		return "test";
	}
}
