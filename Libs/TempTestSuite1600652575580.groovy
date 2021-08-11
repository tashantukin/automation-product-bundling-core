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


suiteProperties.put('id', 'Test Suites/TXN STATUS/TS_INITIAL_STATUS_ON_CHECKOUT_SELLER')

suiteProperties.put('name', 'TS_INITIAL_STATUS_ON_CHECKOUT_SELLER')

suiteProperties.put('description', 'Verify if the statuses are correct upon successful check out on seller portal')

suiteProperties.put('stopImmediately', 'false')
 

DriverCleanerCollector.getInstance().addDriverCleaner(new com.kms.katalon.core.webui.contribution.WebUiDriverCleaner())
DriverCleanerCollector.getInstance().addDriverCleaner(new com.kms.katalon.core.mobile.contribution.MobileDriverCleaner())
DriverCleanerCollector.getInstance().addDriverCleaner(new com.kms.katalon.core.cucumber.keyword.internal.CucumberDriverCleaner())
DriverCleanerCollector.getInstance().addDriverCleaner(new com.kms.katalon.core.windows.keyword.contribution.WindowsDriverCleaner())
DriverCleanerCollector.getInstance().addDriverCleaner(new com.kms.katalon.core.testng.keyword.internal.TestNGDriverCleaner())



RunConfiguration.setExecutionSettingFile("D:\\GITHUB\\FIND PH 2\\0910\\Reports\\20200921_094251\\TXN STATUS\\TS_INITIAL_STATUS_ON_CHECKOUT_SELLER\\20200921_094255\\execution.properties")

TestCaseMain.beforeStart()

TestCaseMain.startTestSuite('Test Suites/TXN STATUS/TS_INITIAL_STATUS_ON_CHECKOUT_SELLER', suiteProperties, new File("D:\\GITHUB\\FIND PH 2\\0910\\Reports\\20200921_094251\\TXN STATUS\\TS_INITIAL_STATUS_ON_CHECKOUT_SELLER\\20200921_094255\\testCaseBinding"))
