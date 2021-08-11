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

WebUI.setText(findTestObject('merchant_po_list/textbox_search'), GlobalVariable.invoice_number)

WebUI.click(findTestObject('merchant_po_list/button_search'))

WebUI.selectOptionByLabel(findTestObject('merchant_po_list/dropdown_orders'), 'Acknowledged', false)

WebUI.click(findTestObject('merchant_po_list/confirm_button'))

WebUI.delay(3)

WebUI.verifyOptionSelectedByLabel(findTestObject('merchant_po_list/dropdown_orders'), 'Acknowledged', false, 0)

WebUI.click(findTestObject('merchant_po_list/link_invoicenumber'))

WebUI.verifyOptionSelectedByLabel(findTestObject('merchant_po_details/dropdown_orders'), 'Acknowledged', false, 0)

WebUI.back()

