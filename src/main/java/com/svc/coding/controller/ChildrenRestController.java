package com.svc.coding.controller;

import com.svc.coding.service.ProcessService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class ChildrenRestController {

	@Autowired
	private ProcessService processService;


	/**
	 * processChildrenFlow
	 * @return String sequence of children flow
	 */

	@GetMapping(path="/svc/exercise/{n}/process/{k}")
	public String processChildrenFlow(@PathVariable int n,
												@PathVariable int k){

		if (n<=0 || k<=0) {
			return "The value of n or k is less than equal to 0";
		}
		processService.initialize();
		processService.setNumOfChildren(n);
		processService.addChildren();
		processService.addResult();

		processService.setCounter(k);
		processService.execute();
		return processService.resultList.toString();
	}
	
}
