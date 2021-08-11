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

WebUI.callTestCase(findTestCase('Utilities/SANDBOX/UTILITIES/Admin Login'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('admin_txn_list/link_txn'))

WebUI.click(findTestObject('admin_txn_list/link_txn_list'))

WebUI.setText(findTestObject('admin_txn_list/textbox_search'), GlobalVariable.invoice_number)

WebUI.click(findTestObject('admin_txn_list/button_search'))

WebUI.click(findTestObject('admin_txn_details/link_invoice'))

WebUI.selectOptionByLabel(findTestObject('admin_txn_details/dropdown_orders'), 'Rejected', false)

WebUI.delay(3)

WebUI.back()

WebUI.verifyElementText(findTestObject('admin_txn_list/label_order_status'), 'Rejected')

