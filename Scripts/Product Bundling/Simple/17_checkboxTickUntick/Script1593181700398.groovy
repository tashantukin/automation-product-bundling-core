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

WebUI.setText(findTestObject('Item Upload/textfield_Search Item Name'), GlobalVariable.SELLER_1_ITEM1)

WebUI.click(findTestObject('Item Upload/button_Search Item Name'))

WebUI.delay(5)

WebUI.waitForElementPresent(findTestObject('add_item_staging/itemresult'), 0)

WebUI.click(findTestObject('add_item_staging/itemresult'))

WebUI.waitForElementPresent(findTestObject('add_item_staging/checkeditem'), 0)

WebUI.verifyElementChecked(findTestObject('add_item_staging/checkboxinput'), 0)

WebUI.click(findTestObject('add_item_staging/itemresult'))

WebUI.verifyElementNotChecked(findTestObject('add_item_staging/checkboxinput'), 0)

