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

WebUI.callTestCase(findTestCase('Utilities/SANDBOX/UTILITIES/Navigate to Buyer Page'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('sandbox/search_box'), GlobalVariable.item1)

WebUI.click(findTestObject('sandbox/button_search'))

WebUI.waitForElementPresent(findTestObject('sandbox/item_link_image'), 0)

WebUI.click(findTestObject('sandbox/item_link_image'))

//WebUI.switchToWindowIndex(1)
WebUI.click(findTestObject('sandbox/btn_procuretofind'))

WebUI.click(findTestObject('checkout/button_check_address'))

WebUI.click(findTestObject('checkout/button_next'))

WebUI.click(findTestObject('checkout/checkout_daterange'))

WebUI.click(findTestObject('checkout/start_date'))

WebUI.click(findTestObject('checkout/end_date'))

WebUI.click(findTestObject('checkout/button_Apply'))

WebUI.selectOptionByIndex(findTestObject('check_out/dropdown_shipping'), '1', FailureHandling.STOP_ON_FAILURE)

//WebUI.selectOptionByIndex(findTestObject('null'), 
//    3)
WebUI.delay(2)

WebUI.click(findTestObject('checkout/button_proceed_to_payment'))

WebUI.click(findTestObject('checkout/button_order_now'))

def invoicenumber = WebUI.getText(findTestObject('checkout/invoice_number'))

CustomKeywords.'globalVariable.GlobalVariableUpdater.updatePermanently'('default', 'invoice_number', invoicenumber)

//GlobalVariable.invoice_number = invoicenumber
WebUI.click(findTestObject('checkout/button_view_purchase'))

