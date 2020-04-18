package com.svc.coding;

import static org.assertj.core.api.Assertions.assertThat;

import com.svc.coding.service.ProcessService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.junit4.SpringRunner;


@RunWith(SpringRunner.class)

public class ProcessServiceTest {


	@Test
	public void testProcess() {
		int n = 10; int k = 2;
		ProcessService processService = new ProcessService();
		processService.initialize();
		processService.setNumOfChildren(n);
		processService.addChildren();
		processService.addResult();
		processService.setCounter(k);
		processService.execute();
		assertThat(processService.resultList.get(processService.resultList.size()-1)).toString().equals(" n:  1 ");
	}
	

}

