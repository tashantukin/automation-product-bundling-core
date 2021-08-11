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

WebUI.click(findTestObject('BUYER_EDITABLE_ADDRESS/button_icon_down'))

WebUI.click(findTestObject('BUYER_EDITABLE_ADDRESS/link_settings'))

WebUI.click(findTestObject('BUYER_EDITABLE_ADDRESS/button_next'))

WebUI.click(findTestObject('BUYER_EDITABLE_ADDRESS/button_edit'))

WebUI.click(findTestObject('BUYER_EDITABLE_ADDRESS/pop_up_ok'))

WebUI.comment('Set text of all the fields ')

long ts = System.currentTimeMillis() / 1000

String tsAsString = ts.toString()

WebUI.setText(findTestObject('BUYER_EDITABLE_ADDRESS/input_Alternative contact person name_first-name'), 'Edited' + tsAsString)

//First name
def fname = WebUI.getAttribute(findTestObject('BUYER_EDITABLE_ADDRESS/input_Alternative contact person name_first-name'), 
    'value')

GlobalVariable.editfirstname = fname

WebUI.setText(findTestObject('BUYER_EDITABLE_ADDRESS/input_Alternative contact person number_last-name'), '5555' + tsAsString)

//Last name
def lname = WebUI.getAttribute(findTestObject('BUYER_EDITABLE_ADDRESS/input_Alternative contact person number_last-name'), 
    'value')

GlobalVariable.editnumber = lname

//Email
WebUI.setText(findTestObject('BUYER_EDITABLE_ADDRESS/input_Alternative contact person email_contact-email'), tsAsString + '@email.com'  )

def email = WebUI.getAttribute(findTestObject('BUYER_EDITABLE_ADDRESS/input_Alternative contact person email_contact-email'), 
    'value')

GlobalVariable.editemail = email

//address
WebUI.setText(findTestObject('BUYER_EDITABLE_ADDRESS/input_Address_myaddress'), 'Address' +  tsAsString)

def address = WebUI.getAttribute(findTestObject('BUYER_EDITABLE_ADDRESS/input_Address_myaddress'), 'value')

GlobalVariable.editaddress = address

//country
WebUI.selectOptionByLabel(findTestObject('BUYER_EDITABLE_ADDRESS/dropdown_country'), 'Philippines', false)

def country = WebUI.getAttribute(findTestObject('BUYER_EDITABLE_ADDRESS/dropdown_country'), 'value')

GlobalVariable.editcountry = country

//state
WebUI.setText(findTestObject('BUYER_EDITABLE_ADDRESS/input_State_state'), 'STATE' + tsAsString)

//state
def state = WebUI.getAttribute(findTestObject('BUYER_EDITABLE_ADDRESS/input_State_state'), 'value')

GlobalVariable.editstate = state

//city
WebUI.setText(findTestObject('BUYER_EDITABLE_ADDRESS/input_City_city'), 'CITY' + tsAsString)

def city = WebUI.getAttribute(findTestObject('BUYER_EDITABLE_ADDRESS/input_City_city'), 'value')

GlobalVariable.editcity = city

WebUI.setText(findTestObject('BUYER_EDITABLE_ADDRESS/input_Postal code_postal-code'), '001' + tsAsString)

//postal code
def postalcode = WebUI.getAttribute(findTestObject('BUYER_EDITABLE_ADDRESS/input_Postal code_postal-code'), 'value')

GlobalVariable.editpostalcode = postalcode

WebUI.delay(5)

