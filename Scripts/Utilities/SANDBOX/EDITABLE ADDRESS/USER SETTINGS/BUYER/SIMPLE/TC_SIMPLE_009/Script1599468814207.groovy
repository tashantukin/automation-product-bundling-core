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

def clone_value = WebUI.getAttribute(findTestObject('BUYER_EDITABLE_ADDRESS/clone_country'), 'value')
//def fname_value = WebUI.verifyOptionSelectedByLabel(findTestObject('BUYER_EDITABLE_ADDRESS/dropdown_country'), clone_value, 
//    false, 0)
 def fname_value = 'Philippines'//
  WebUI.getAttribute(findTestObject('BUYER_EDITABLE_ADDRESS/dropdown_country'), 'value')

//def clone_value = WebUI.getAttribute(findTestObject('BUYER_EDITABLE_ADDRESS/clone_country'), 'value')
WebUI.verifyMatch(fname_value, clone_value, false, FailureHandling.STOP_ON_FAILURE)

