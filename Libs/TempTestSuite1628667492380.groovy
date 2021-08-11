import com.kms.katalon.core.logging.KeywordLogger
import com.kms.katalon.core.exception.StepFailedException
import com.kms.katalon.core.reporting.ReportUtil
import com.kms.katalon.core.main.TestCaseMain
import com.kms.katalon.core.testdata.TestDataColumn
import com.kms.katalon.core.testcase.TestCaseBinding
import com.kms.katalon.core.driver.internal.DriverCleanerCollector
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.configuration.RunConfiguration
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import internal.GlobalVariable as GlobalVariable

Map<String, String> suiteProperties = new HashMap<String, String>();


suiteProperties.put('id', 'Test Suites/PRODUCT BUNDLING PH 3/PRODUCT_BUNDLING_3_COMPLEX')

suiteProperties.put('name', 'PRODUCT_BUNDLING_3_COMPLEX')

suiteProperties.put('description', 'Collection of Complex test cases for product bundling ph.3')

suiteProperties.put('stopImmediately', 'false')
 

DriverCleanerCollector.getInstance().addDriverCleaner(new com.kms.katalon.core.webui.contribution.WebUiDriverCleaner())
DriverCleanerCollector.getInstance().addDriverCleaner(new com.kms.katalon.core.mobile.contribution.MobileDriverCleaner())
DriverCleanerCollector.getInstance().addDriverCleaner(new com.kms.katalon.core.cucumber.keyword.internal.CucumberDriverCleaner())
DriverCleanerCollector.getInstance().addDriverCleaner(new com.kms.katalon.core.windows.keyword.contribution.WindowsDriverCleaner())
DriverCleanerCollector.getInstance().addDriverCleaner(new com.kms.katalon.core.testng.keyword.internal.TestNGDriverCleaner())



RunConfiguration.setExecutionSettingFile("D:\\GITHUB\\automation-product-bundling-core\\Reports\\20210811_153812\\PRODUCT BUNDLING PH 3\\PRODUCT_BUNDLING_3_COMPLEX\\20210811_153812\\execution.properties")

TestCaseMain.beforeStart()

TestCaseMain.startTestSuite('Test Suites/PRODUCT BUNDLING PH 3/PRODUCT_BUNDLING_3_COMPLEX', suiteProperties, new File("D:\\GITHUB\\automation-product-bundling-core\\Reports\\20210811_153812\\PRODUCT BUNDLING PH 3\\PRODUCT_BUNDLING_3_COMPLEX\\20210811_153812\\testCaseBinding"))
