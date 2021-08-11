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

WebUI.callTestCase(findTestCase('Utilities/Seller/Navigate to Seller 1'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.waitForElementPresent(findTestObject('add_item_staging/a_ADD ITEM'), 0)

WebUI.click(findTestObject('add_item_staging/a_ADD ITEM'))

WebUI.verifyElementPresent(findTestObject('Item Upload/button_Product bundling'), 0)

WebUI.click(findTestObject('Item Upload/button_Product bundling'))

WebUI.waitForElementPresent(findTestObject('Item Upload/popUpWindow_productBundling'), 0)

WebUI.comment('Search First Item')

WebUI.setText(findTestObject('Item Upload/textfield_Search Item Name'), GlobalVariable.SELLER_1_ITEM1)

WebUI.click(findTestObject('Item Upload/button_Search Item Name'))

WebUI.waitForElementPresent(findTestObject('Item Upload/checkbox_itemfound 1'), 0)

WebUI.click(findTestObject('Item Upload/checkbox_itemfound 1'))

WebUI.waitForElementPresent(findTestObject('Item Upload/item_selectedvalue_1'), 0)

WebUI.comment('Search Second Item')

WebUI.setText(findTestObject('Item Upload/textfield_Search Item Name'), GlobalVariable.SELLER_1_ITEM2)

WebUI.click(findTestObject('Item Upload/button_Search Item Name'))

WebUI.waitForElementPresent(findTestObject('Item Upload/checkbox_itemfound 1'), 0)

WebUI.click(findTestObject('Item Upload/checkbox_itemfound 1'))

WebUI.waitForElementPresent(findTestObject('Item Upload/item_selectedvalue_2'), 0)

WebUI.comment('Search Third Item')

WebUI.setText(findTestObject('Item Upload/textfield_Search Item Name'), GlobalVariable.SELLER_1_ITEM3)

WebUI.click(findTestObject('Item Upload/button_Search Item Name'))

WebUI.waitForElementPresent(findTestObject('Item Upload/checkbox_itemfound 1'), 0)

WebUI.click(findTestObject('Item Upload/checkbox_itemfound 1'))

WebUI.waitForElementPresent(findTestObject('Item Upload/item_selectedvalue_3'), 0)

item1 = WebUI.getText(findTestObject('Item Upload/item_selectedvalue_1'))

item2 = WebUI.getText(findTestObject('Item Upload/item_selectedvalue_2'))

item3 = WebUI.getText(findTestObject('Item Upload/item_selectedvalue_3'))

WebUI.click(findTestObject('Item Upload/button_popUpSave'))

WebUI.waitForElementPresent(findTestObject('Item Upload/button_Product bundling'), 0)

WebUI.click(findTestObject('Item Upload/button_Product bundling'))

WebUI.waitForElementVisible(findTestObject('Item Upload/popUpWindow_productBundling'), 0)

WebUI.verifyElementText(findTestObject('Item Upload/item_selectedvalue_1'), item1)

WebUI.verifyElementText(findTestObject('Item Upload/item_selectedvalue_2'), item2)

WebUI.verifyElementText(findTestObject('Item Upload/item_selectedvalue_3'), item3)

WebUI.click(findTestObject('Item Upload/button_close'))

WebUI.callTestCase(findTestCase('Utilities/Seller/Logout'), [:])

