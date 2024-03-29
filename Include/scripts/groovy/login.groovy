import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.checkpoint.CheckpointFactory
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testcase.TestCaseFactory
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testdata.TestDataFactory
import com.kms.katalon.core.testobject.ObjectRepository
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

import internal.GlobalVariable

import org.openqa.selenium.WebElement
import org.openqa.selenium.WebDriver
import org.openqa.selenium.By

import com.kms.katalon.core.mobile.keyword.internal.MobileDriverFactory
import com.kms.katalon.core.webui.driver.DriverFactory

import com.kms.katalon.core.testobject.RequestObject
import com.kms.katalon.core.testobject.ResponseObject
import com.kms.katalon.core.testobject.ConditionType
import com.kms.katalon.core.testobject.TestObjectProperty

import com.kms.katalon.core.mobile.helper.MobileElementCommonHelper
import com.kms.katalon.core.util.KeywordUtil

import com.kms.katalon.core.webui.exception.WebElementNotFoundException

import cucumber.api.java.en.And
import cucumber.api.java.en.Given
import cucumber.api.java.en.Then
import cucumber.api.java.en.When



class login {
	
	@Then("I verify login pop-up appears")
	def i_verify_login_pop_up_appears(){
		WebUI.verifyElementPresent(findTestObject('login_pop_up/login_pop_up'), 15)
	}

	@When("I click buat akun sekarang link")
	def i_click_buat_akun_sekarang_link(){
		WebUI.click(findTestObject('login_pop_up/link_register'))
	}
	
	@When ("I input (.*) in email field in login pop-up")
	def i_input_email_field_in_login_pop_up(String email){
		WebUI.waitForElementPresent(findTestObject("Object Repository/login_pop_up/input_Email_username"), 15)
		WebUI.setText(findTestObject('Object Repository/login_pop_up/input_Email_username'), 'fifekawahid@gmail.com')
	}

	@And("I input (.*) in password field in login pop-up")
	def i_input_password_field_in_login_pop_up(String password){
		WebUI.setText(findTestObject("Object Repository/login_pop_up/input_Kata sandi_password"),password)
	}

	@And("I click masuk button in login pop-up")
	def i_click_masuk_button_in_login_pop_up(){
		WebUI.click(findTestObject("Object Repository/login_pop_up/button_masuk"))
	}

}