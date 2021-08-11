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

WebUI.openBrowser('')

WebUI.maximizeWindow()

WebUI.navigateToUrl(GlobalVariable.url)

WebUI.waitForElementVisible(findTestObject('Homepage/linktext_SIGN IN'), 0)

WebUI.click(findTestObject('CookiePolicy/button_acceptCookies'))

WebUI.waitForElementNotPresent(findTestObject('CookiePolicy/button_acceptCookies'), 0)

WebUI.click(findTestObject('Homepage/linktext_SIGN IN'))

WebUI.waitForElementVisible(findTestObject('Sign In Page/textfield_username'), 0)

WebUI.setText(findTestObject('Sign In Page/textfield_username'), GlobalVariable.username)

WebUI.setText(findTestObject('Sign In Page/textfield_password'), GlobalVariable.password)

WebUI.click(findTestObject('Sign In Page/button_save'))

WebUI.waitForElementVisible(findTestObject('Homepage/linktext_SELLER'), 0)

