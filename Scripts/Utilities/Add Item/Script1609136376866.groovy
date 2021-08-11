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

WebUI.callTestCase(findTestCase('Utilities/Navigate to Merchant Page Staging'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.waitForElementPresent(findTestObject('add_item_staging/a_ADD ITEM'), 0)

WebUI.click(findTestObject('add_item_staging/a_ADD ITEM'))

WebUI.click(findTestObject('tuberculosis_cat'))

long ts = System.currentTimeMillis() / 1000

String tsAsString = ts.toString()

WebUI.setText(findTestObject('Item Upload/textfield _item-name'), 'item' + tsAsString)

def itemname = WebUI.getAttribute(findTestObject('Item Upload/textfield _item-name'), 'value')

int currentcount = GlobalVariable.itemcount

int nxtcount = currentcount + 1

if (currentcount == 1) {
    CustomKeywords.'globalVariable.GlobalVariableUpdater.updatePermanently'('default', 'item1', itemname)
} else if (currentcount == 2) {
    CustomKeywords.'globalVariable.GlobalVariableUpdater.updatePermanently'('default', 'item2', itemname)
} else {
    CustomKeywords.'globalVariable.GlobalVariableUpdater.updatePermanently'('default', 'item3', itemname)
}

//increment the count
GlobalVariable.itemcount = nxtcount

//CustomKeywords.'globalVariable.GlobalVariableUpdater.updatePermanentlyInt'('default', GlobalVariable.itemcount , nxtcount)
WebUI.setText(findTestObject('Item Upload/textfield _item-price'), GlobalVariable.Price)

WebUI.setText(findTestObject('Item Upload/input_ID_sku-field'), GlobalVariable.ID)

WebUI.setText(findTestObject('Item Upload/textarea_item-description'), GlobalVariable.itemDescription)

WebUI.comment('Image Uploading')

WebUI.waitForElementVisible(findTestObject('Item Upload/button_browse'), 0)

WebUI.click(findTestObject('Item Upload/button_browse'))

String userDir = System.getProperty('user.dir')

String filePath = userDir + '\\images\\medicine.png'

WebUI.uploadFile(findTestObject('Item Upload/popup_image'), filePath)

WebUI.waitForElementVisible(findTestObject('Item Upload/button_ok'), 0)

WebUI.click(findTestObject('Item Upload/button_ok'), FailureHandling.STOP_ON_FAILURE)

WebUI.waitForElementVisible(findTestObject('Item Upload/span_Quantity _onoffswitch-inner'), 0)

WebUI.click(findTestObject('Item Upload/span_Quantity _onoffswitch-inner'))

//WebUI.setText(findTestObject('sandbox/add_item/IE_BODY'), 'random ')
//
//WebUI.setText(findTestObject('Item Upload/textfield_Shelf life'), '1')
//
//WebUI.setText(findTestObject('Item Upload/textfield_Packaginglabeling'), '1')
//
//WebUI.setText(findTestObject('Item Upload/textfield_Storage condition'), '1')
//
//WebUI.setText(findTestObject('Item Upload/textfield_HS code'), '1')
//
//WebUI.setText(findTestObject('Item Upload/textfield_Transportation'), '1')
//
//WebUI.setText(findTestObject('Item Upload/textfield_Unit of measurement'), 'kg')
//
//WebUI.setText(findTestObject('sandbox/add_item/volume'), '1')
//
//WebUI.setText(findTestObject('sandbox/add_item/contact_person'), '1')
//
//WebUI.setText(findTestObject('sandbox/add_item/name_of_manufacturer'), '1')
//
//WebUI.setText(findTestObject('Item Upload/input_Email address_custom-email'), 'email@email.com')
//
//WebUI.setText(findTestObject('Item Upload/textfield_Country of manufacturer'), '1')
//
//WebUI.click(findTestObject('sandbox/add_item/chkbox_regulatory_appr'), FailureHandling.STOP_ON_FAILURE)
//
//WebUI.setText(findTestObject('sandbox/add_item/country_reg_body'), 'PH')
//
//WebUI.click(findTestObject('sandbox/add_item/chkbox_procurement_options'))
//
//WebUI.setText(findTestObject('sandbox/add_item/searchtag'), 'random tag')

WebUI.click(findTestObject('Item Upload/button_SAVE'))

WebUI.click(findTestObject('sandbox/add_item/illdoitlaterbutton'))

WebUI.delay(5)

