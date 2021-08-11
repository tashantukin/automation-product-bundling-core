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

WebUI.click(findTestObject('Page_diagnostics/link_item'))

int currentcount = GlobalVariable.itemcount

int nxtcount = currentcount + 1

if (currentcount == 1) {
    WebUI.setText(findTestObject('Page_diagnostics/input_search'), GlobalVariable.item1)
} else if (currentcount == 2) {
    WebUI.setText(findTestObject('Page_diagnostics/input_search'), GlobalVariable.item2)
} else {
    WebUI.setText(findTestObject('Page_diagnostics/input_search'), GlobalVariable.item3)
}

GlobalVariable.itemcount = nxtcount

WebUI.click(findTestObject('Page_diagnostics/button_apply'))

WebUI.waitForElementVisible(findTestObject('Page_diagnostics/main_toggle'), 0)

WebUI.click(findTestObject('Page_diagnostics/main_toggle'))

WebUI.delay(5)

