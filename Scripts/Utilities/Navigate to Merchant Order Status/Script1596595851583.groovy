import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable

WebUI.callTestCase(findTestCase('Utilities/Admin Login'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.waitForElementVisible(findTestObject('navigate_to_merchant/span_Users'), 0)

WebUI.click(findTestObject('navigate_to_merchant/span_Users'))

WebUI.delay(1, FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('navigate_to_merchant/input_Filter by_keywords'), GlobalVariable.merchant_name)

WebUI.click(findTestObject('navigate_to_merchant/input_Merchant_search_btn'))

WebUI.waitForElementVisible(findTestObject('cepheid_login/link_login'), 0)

WebUI.click(findTestObject('cepheid_login/link_login'))

WebUI.waitForElementVisible(findTestObject('cepheid_login/login_popup'), 0)

WebUI.click(findTestObject('cepheid_login/button_login_ok'))

WebUI.waitForElementPresent(findTestObject('cepheid_login/a_Orders'), 0)

WebUI.click(findTestObject('cepheid_login/a_Orders'))

WebUI.click(findTestObject('add_item_staging/a_Accept Cookies'))

WebUI.waitForElementNotPresent(findTestObject('add_item_staging/a_Accept Cookies'), 0)

