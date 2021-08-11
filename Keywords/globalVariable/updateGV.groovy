package globalVariable

import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable

import java.nio.file.Files
import java.nio.file.Paths
import javax.xml.parsers.DocumentBuilder
import javax.xml.parsers.DocumentBuilderFactory
import javax.xml.transform.OutputKeys
import javax.xml.transform.Transformer
import javax.xml.transform.TransformerFactory
import javax.xml.transform.dom.DOMSource
import javax.xml.transform.stream.StreamResult
import org.w3c.dom.Document
import org.w3c.dom.Element
import org.w3c.dom.NodeList
import com.kms.katalon.core.configuration.RunConfiguration
import com.kms.katalon.core.util.KeywordUtil


public class GlobalVariableUpdater {


	public static void updatePermanently(String varName, String newValue) {
		updatePermanently(RunConfiguration.getExecutionProfile(), varName, newValue)
	}
	public static void updatePermanentlyInt(int varName, int newValue) {
		updatePermanently(RunConfiguration.getExecutionProfile(), varName, newValue)
	}

	/** WARNING - Permanently updates a variable in specified execution profile.<br>
	 * Original value will be replaced with new value and cannot be restored.
	 * @param envName
	 * @param varName
	 * @param newValue
	 */

	@Keyword
	public static void updatePermanently(String envName, String varName, String newValue) {
		File inputFile = new File(RunConfiguration.getProjectDir() + "//Profiles//" + envName + ".glbl")
		if(!Files.exists(Paths.get(inputFile.getAbsolutePath()))) {
			KeywordUtil.markFailed("A file with profile was not found - check path: " + inputFile.getAbsolutePath())
		}

		DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance()
		DocumentBuilder builder = factory.newDocumentBuilder()
		Document document = builder.parse(inputFile)

		NodeList elems = document.getDocumentElement().getElementsByTagName("GlobalVariableEntity")
		for(Element elem in elems) {
			if(elem.getElementsByTagName("name").item(0).getTextContent() == varName) {
				elem.getElementsByTagName("initValue").item(0).setTextContent("'" + newValue + "'")
				document.getDocumentElement().normalize()
				Transformer transformer = TransformerFactory.newInstance().newTransformer()
				DOMSource source = new DOMSource(document)
				StreamResult result = new StreamResult(inputFile)
				transformer.setOutputProperty(OutputKeys.INDENT, "yes")
				transformer.transform(source, result)
				return
			}
		}
		KeywordUtil.markWarning("Global variable with name " + varName + " was not found.")
	}

	//for int values
	public static void updatePermanentlyInt(String envName, int varName, int newValue) {
		File inputFile = new File(RunConfiguration.getProjectDir() + "//Profiles//" + envName + ".glbl")
		if(!Files.exists(Paths.get(inputFile.getAbsolutePath()))) {
			KeywordUtil.markFailed("A file with profile was not found - check path: " + inputFile.getAbsolutePath())
		}

		DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance()
		DocumentBuilder builder = factory.newDocumentBuilder()
		Document document = builder.parse(inputFile)

		NodeList elems = document.getDocumentElement().getElementsByTagName("GlobalVariableEntity")
		for(Element elem in elems) {
			if(elem.getElementsByTagName("name").item(0).getTextContent() == varName) {
				elem.getElementsByTagName("initValue").item(0).setTextContent("'" + newValue + "'")
				document.getDocumentElement().normalize()
				Transformer transformer = TransformerFactory.newInstance().newTransformer()
				DOMSource source = new DOMSource(document)
				StreamResult result = new StreamResult(inputFile)
				transformer.setOutputProperty(OutputKeys.INDENT, "yes")
				transformer.transform(source, result)
				return
			}
		}
		KeywordUtil.markWarning("Global variable with name " + varName + " was not found.")
	}
}

/*Usage:
 change selected profile
 GlobalVariableUpdater.updatePermanently("myProfileName", "VariableName", "new value")
 change current profile
 GlobalVariableUpdater.updatePermanently("VariableName", "new value")*/