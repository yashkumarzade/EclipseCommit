package com.listners;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.base.BaseClass;

public class ListnersEx extends BaseClass implements ITestListener {

	public void onTestStart(ITestResult result) {
		test = report.createTest(result.getName());
		log.info("extent test initiated");

	}

	public void onTestSuccess(ITestResult result) {
		test.log(test.getStatus().PASS, "testcase passed");
		log.info("testcase passed with the name >> " + result.getName());

	}

	public void onTestFailure(ITestResult result) {
		test.log(test.getStatus().FAIL, "testcase failed");
		log.info("testcase failed with the name >> " + result.getName());
		log.info("capturing screenshot as test failed");
		test.addScreenCaptureFromPath(getSceenshot(result.getName()));

	}

	public void onTestSkipped(ITestResult result) {

		test.log(test.getStatus().SKIP, "testcase skipped");
		log.info("testcase skipped with the name >> " + result.getName());

	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {

	}

	public void onStart(ITestContext context) {
		log.info("test suite started");

	}

	public void onFinish(ITestContext context) {
		report.flush();
		log.info("test suite finished");

	}

}
