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

WebUI.comment('Set text of all the fields ')

long ts = System.currentTimeMillis() / 1000

String tsAsString = ts.toString()

WebUI.setText(findTestObject('edit_address_delivery/input_Alternative contact person name_ads-first-name'), 'Edited' + tsAsString)

//First name
def fname = WebUI.getAttribute(findTestObject('edit_address_delivery/input_Alternative contact person name_ads-first-name'), 
    'value')

GlobalVariable.editfirstname = fname

WebUI.setText(findTestObject('edit_address_delivery/input_Alternative contact person number_ads-last-name'), '5555' + tsAsString)

//Last name
def lname = WebUI.getAttribute(findTestObject('edit_address_delivery/input_Alternative contact person number_ads-last-name'), 
    'value')

GlobalVariable.editnumber = lname

//Email
WebUI.setText(findTestObject('edit_address_delivery/input_Alternative contact person email_alt-mail'), tsAsString + '@email.com')

def email = WebUI.getAttribute(findTestObject('edit_address_delivery/input_Alternative contact person email_alt-mail'), 
    'value')

GlobalVariable.editemail = email

//address
WebUI.setText(findTestObject('edit_address_delivery/input_Address_address'), 'Address' + tsAsString)

def address = WebUI.getAttribute(findTestObject('edit_address_delivery/input_Address_address'), 'value')

GlobalVariable.editaddress = address

//country
WebUI.selectOptionByLabel(findTestObject('edit_address_delivery/dropdown_country'), 'Philippines', false)

def country = WebUI.getAttribute(findTestObject('edit_address_delivery/dropdown_country'), 'value')

GlobalVariable.editcountry = country

//state
WebUI.setText(findTestObject('edit_address_delivery/input_State_state'), 'STATE' + tsAsString)

//state
def state = WebUI.getAttribute(findTestObject('edit_address_delivery/input_State_state'), 'value')

GlobalVariable.editstate = state

//city
WebUI.setText(findTestObject('edit_address_delivery/input_City_city'), 'CITY' + tsAsString)

def city = WebUI.getAttribute(findTestObject('edit_address_delivery/input_City_city'), 'value')

GlobalVariable.editcity = city

WebUI.setText(findTestObject('edit_address_delivery/input_Postal code_postalcode'), '001' + tsAsString)

//postal code
def postalcode = WebUI.getAttribute(findTestObject('edit_address_delivery/input_Postal code_postalcode'), 'value')

GlobalVariable.editpostalcode = postalcode

WebUI.click(findTestObject('edit_address_delivery/button_SAVE'))

WebUI.delay(5)

