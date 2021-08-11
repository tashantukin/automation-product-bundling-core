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

int currentcount = GlobalVariable.ITEM_COUNT

if (currentcount == 1) {
	WebUI.mouseOver(findTestObject('Navigate to seller/seller_hover'))

	WebUI.click(findTestObject('Navigate to seller/add_item'))
} else {
	WebUI.click(findTestObject('Navigate to seller/label_add_item'))
}

WebUI.click(findTestObject('ITEM UPLOAD/label'))

long ts = System.currentTimeMillis() / 1000

String tsAsString = ts.toString()

WebUI.setText(findTestObject('ITEM UPLOAD/input_ITEM NAME _item-name'), 'item' + tsAsString)

def itemname = WebUI.getAttribute(findTestObject('ITEM UPLOAD/input_ITEM NAME _item-name'), 'value')

int nxtcount = currentcount + 1

if (currentcount == 1) {
	CustomKeywords.'globalVariable.GlobalVariableUpdater.updatePermanently'('default', 'SELLER_1_ITEM1', itemname)
} else if (currentcount == 2) {
	CustomKeywords.'globalVariable.GlobalVariableUpdater.updatePermanently'('default', 'SELLER_1_ITEM2', itemname)
} else {
	CustomKeywords.'globalVariable.GlobalVariableUpdater.updatePermanently'('default', 'SELLER_1_ITEM3', itemname)
}

//increment the count
GlobalVariable.ITEM_COUNT = nxtcount

WebUI.setText(findTestObject('ITEM UPLOAD/input_PRICE _item-price'), '5999')

WebUI.setText(findTestObject('ITEM UPLOAD/input_ID_sku-field'), tsAsString)

WebUI.setText(findTestObject('ITEM UPLOAD/textarea_ITEM DESCRIPTION _item-description'), 'item desc' + tsAsString)

WebUI.comment('Image Uploading')

WebUI.click(findTestObject('ITEM UPLOAD/a_BROWSE'))

String userDir = System.getProperty('user.dir')

String filePath = userDir + '\\images\\medicine.jpg'

WebUI.uploadFile(findTestObject('ITEM UPLOAD/input_Upload Image_upload-file'), filePath)

WebUI.click(findTestObject('ITEM UPLOAD/div_Upload Image_crop'))

WebUI.setText(findTestObject('ITEM UPLOAD/input_QUANTITY _item-quantity'), '200')

WebUI.click(findTestObject('ITEM UPLOAD/a_SAVE'))

WebUI.click(findTestObject('Item Upload/button_do_it_laturr'))

