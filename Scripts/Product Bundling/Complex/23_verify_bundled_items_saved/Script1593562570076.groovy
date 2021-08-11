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

WebUI.mouseOver(findTestObject('Navigate to seller/seller_hover'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Navigate to seller/add_item'))

WebUI.verifyElementPresent(findTestObject('Item Upload/button_Product bundling'), 0)

WebUI.click(findTestObject('sandbox/add_item/add_item_category'))

long ts = System.currentTimeMillis() / 1000

String tsAsString = ts.toString()

WebUI.setText(findTestObject('Item Upload/textfield _item-name'), 'item' + tsAsString)

def itemname = WebUI.getAttribute(findTestObject('Item Upload/textfield _item-name'), 'value')

int currentcount = GlobalVariable.itemcount

//CustomKeywords.'globalVariable.GlobalVariableUpdater.updatePermanentlyInt'('default', GlobalVariable.itemcount , nxtcount)
WebUI.setText(findTestObject('Item Upload/textfield _item-price'), GlobalVariable.Price)

WebUI.setText(findTestObject('Item Upload/input_ID_sku-field'), GlobalVariable.ID)

WebUI.setText(findTestObject('ITEM UPLOAD/textarea_ITEM DESCRIPTION _item-description'), 'item desc' + tsAsString)

//WebUI.setText(findTestObject('Item Upload/textarea_item-description'), GlobalVariable.itemDescription)
WebUI.verifyElementPresent(findTestObject('Item Upload/button_Product bundling'), 0)

WebUI.click(findTestObject('Item Upload/button_Product bundling'))

WebUI.waitForElementPresent(findTestObject('Item Upload/popUpWindow_productBundling'), 0)

WebUI.comment('Search First Item')

WebUI.setText(findTestObject('Item Upload/textfield_Search Item Name'), GlobalVariable.SELLER_1_ITEM1)

WebUI.click(findTestObject('Item Upload/button_Search Item Name'))

WebUI.waitForElementVisible(findTestObject('Item Upload/checkbox_itemfound 1'), 0)

WebUI.click(findTestObject('Item Upload/checkbox_itemfound 1'))

WebUI.waitForElementVisible(findTestObject('Item Upload/item_selectedvalue_1'), 0)

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

WebUI.comment('Image Uploading')

WebUI.click(findTestObject('ITEM UPLOAD/a_BROWSE'))

String userDir = System.getProperty('user.dir')

String filePath = userDir + '\\images\\medicine.jpg'

WebUI.uploadFile(findTestObject('ITEM UPLOAD/input_Upload Image_upload-file'), filePath)

WebUI.click(findTestObject('ITEM UPLOAD/div_Upload Image_crop'))

WebUI.setText(findTestObject('ITEM UPLOAD/input_QUANTITY _item-quantity'), '200')

WebUI.click(findTestObject('ITEM UPLOAD/a_SAVE'))

WebUI.click(findTestObject('Item Upload/button_do_it_laturr'))

WebUI.delay(5)

GlobalVariable.SELLER_1_ITEM1 = itemname

int nxtcount = currentcount + 1

//if (currentcount == 1) {
//    CustomKeywords.'globalVariable.GlobalVariableUpdater.updatePermanently'('default', 'item1', itemname)
//} else if (currentcount == 2) {
//    CustomKeywords.'globalVariable.GlobalVariableUpdater.updatePermanently'('default', 'item2', itemname)
//} else {
//    CustomKeywords.'globalVariable.GlobalVariableUpdater.updatePermanently'('default', 'item3', itemname)
//}
//increment the count
GlobalVariable.itemcount = nxtcount

//WebUI.click(findTestObject('sandbox/add_item/illdoitlaterbutton'))
WebUI.setText(findTestObject('bundled_items/input_YOUR ITEMS_search-item'), GlobalVariable.SELLER_1_ITEM1)

WebUI.click(findTestObject('bundled_items/input_YOUR ITEMS_item-search-btn'))

WebUI.waitForElementVisible(findTestObject('bundled_items/a_Sample Item'), 0)

WebUI.click(findTestObject('bundled_items/a_Sample Item'))

WebUI.delay(1)

WebUI.switchToWindowIndex(1)

//WebUI.waitForElementVisible(findTestObject('Page_Item Name 1/h3_Related Products'), 0)
WebUI.click(findTestObject('BUYER CHECKOUT - SUCCESS PAGE/a_ADD TO CART'))

WebUI.verifyElementPresent(findTestObject('sandbox/add_item/prod_box_modal'), 0, FailureHandling.STOP_ON_FAILURE)

