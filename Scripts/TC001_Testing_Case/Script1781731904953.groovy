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

WebUI.navigateToUrl('https://blazedemo.com')

WebUI.selectOptionByLabel(findTestObject('HomePage/ddl_DepartureCity'),'Boston',false)

WebUI.selectOptionByLabel(findTestObject('HomePage/ddl_DestinationCity'),'London',false)

WebUI.click(findTestObject('HomePage/btn_FindFlights'))

WebUI.click(findTestObject('ReservePage/btn_ChooseFlight'))

WebUI.setText(findTestObject('PurchasePage/txt_Name'),'Muhammad Syazwi')

WebUI.setText(findTestObject('PurchasePage/txt_Address'),'Kuala Lumpur')

WebUI.setText(findTestObject('PurchasePage/txt_City'),'Petaling Jaya')

WebUI.setText(findTestObject('PurchasePage/txt_State'),'Selangor')

WebUI.setText(findTestObject('PurchasePage/txt_CreditCard'),'4111111111111111')

WebUI.setText(findTestObject('PurchasePage/txt_NameOnCard'),'Muhammad Syazwi')

WebUI.click(findTestObject('PurchasePage/btn_PurchaseFlight'))

WebUI.verifyTextPresent('Thank you for your purchase today!',false)

WebUI.closeBrowser()

