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



class register {

	@Then("I verify register page appears")
	def i_verify_register_page_appears(){
		WebUI.waitForElementPresent(findTestObject('Object Repository/register/input_Nama Depan_first_name'), 15)
		String url=WebUI.getUrl();
		WebUI.verifyMatch(url, "https://qa.fabelio.com/register", false)
	}

	@When("I input (.*) in nama depan field in register page")
	def i_input_nama_depan_register_page(String nama_depan){
		WebUI.setText(findTestObject('Object Repository/register/input_Nama Depan_first_name'), nama_depan)
	}

	@And("I input (.*) in nama belakang field in register page")
	def i_input_nama_belakang_field_in_register_page(nama_belakang){
		WebUI.setText(findTestObject('Object Repository/register/input_Nama Belakang_last_name'), nama_belakang)
	}

	@And ("I input unique email in email field in register page")
	def i_input_unique_email_in_email_field_in_register_page(){
		String Email = ('test' + System.currentTimeMillis()) + '@mail.com'
		WebUI.setText(findTestObject('Object Repository/register/input_Email'), Email)
	}

	@And ("I input (.*) in password field in register page")
	def i_input_in_password_field_in_register_page(String password){
		WebUI.setText(findTestObject('Object Repository/register/input_password'), password)
	}

	@And("I input (.*) in confirm password field in register page")
	def i_input_in_confirm_password_field_in_register_page(String confirm_password){
		WebUI.setText(findTestObject('Object Repository/register/input_password_confirmation'), confirm_password)
	}

	@And ("I click term and condition in register page")
	def i_click_term_and_condition_in_register_page(){
		WebUI.click(findTestObject('register/input_TNC'))
	}

	@And ("I click register button in register page")
	def  i_click_register_button_in_register_page(){
		WebUI.click(findTestObject('Object Repository/register/button_buat_akun'))
	}
}