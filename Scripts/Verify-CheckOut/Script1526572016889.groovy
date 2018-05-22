import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.checkpoint.CheckpointFactory as CheckpointFactory
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as MobileBuiltInKeywords
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testcase.TestCaseFactory as TestCaseFactory
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testdata.TestDataFactory as TestDataFactory
import com.kms.katalon.core.testobject.ObjectRepository as ObjectRepository
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WSBuiltInKeywords
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUiBuiltInKeywords
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

WebUI.check(findTestObject('CheckOut/checkBox-TermsandConditions'))

WebUI.click(findTestObject('CheckOut/button-CheckOut'))

WebUI.delay(2)

WebUI.selectOptionByValue(findTestObject('CheckOut/dropDown-Kenya'), country, false)

WebUI.setText(findTestObject('CheckOut/input-City'), city)

WebUI.setText(findTestObject('CheckOut/input-Address1'), address)

WebUI.setText(findTestObject('CheckOut/input-ZipCode'), zipcode)

WebUI.setText(findTestObject('CheckOut/input-PhoneNumber'), phonenumber)

WebUI.click(findTestObject('CheckOut/button-Continue'))

WebUI.check(findTestObject('CheckOut/checkBox-ShippingAddress'))

WebUI.click(findTestObject('CheckOut/button-Continue2'))

WebUI.check(findTestObject('CheckOut/checkBox-Payment'))

WebUI.click(findTestObject('CheckOut/button-Continue3'))

WebUI.selectOptionByValue(findTestObject('CheckOut/dropDown-Visa'), visa, false)

WebUI.setText(findTestObject('CheckOut/input-CardHolderName'), cardholdername)

WebUI.setText(findTestObject('CheckOut/input-CardNumber'), cardnumber)

WebUI.selectOptionByValue(findTestObject('CheckOut/dropDown-MonthofExpiry'), monthofexpiry, false)

WebUI.selectOptionByValue(findTestObject('CheckOut/dropDown-ExpireYear'), yearofexpiry, false)

WebUI.setText(findTestObject('CheckOut/input-cardCode'), cardcode)

WebUI.click(findTestObject('CheckOut/button-Continue4'))

WebUI.delay(1)

WebUI.click(findTestObject('CheckOut/button-Confirm'))

WebUI.verifyElementPresent(findTestObject('CheckOut/VerifyText-OrderConfirm'), 0)

