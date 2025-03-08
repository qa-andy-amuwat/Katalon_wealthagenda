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
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.maximizeWindow()

WebUI.navigateToUrl('https://wealthagenda.co.uk/contactus.htm')

WebUI.setText(findTestObject('Object Repository/Contact Us Form/Page_Wealth Agenda - Contact Us/input_Your Name_name'), 
    'Andrew Jesurun')

WebUI.setText(findTestObject('Object Repository/Contact Us Form/Page_Wealth Agenda - Contact Us/input_Email_email'), 'andrew@wealthagenda.co.uk')

WebUI.setText(findTestObject('Object Repository/Contact Us Form/Page_Wealth Agenda - Contact Us/input_Subject_subject'), 
    'Testing to see if it works')

WebUI.setText(findTestObject('Object Repository/Contact Us Form/Page_Wealth Agenda - Contact Us/textarea_Subject_message'), 
    'Testing to see if it works properly')

WebUI.click(findTestObject('Object Repository/Contact Us Form/Page_Wealth Agenda - Contact Us/input_Subject_submit-button'))

WebUI.closeBrowser()

