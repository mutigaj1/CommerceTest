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

WebUI.openBrowser('')

WebUI.maximizeWindow()

WebUI.navigateToUrl(url)

WebUI.click(findTestObject('Start Page/button-Register'))

WebUI.delay(3)

WebUI.click(findTestObject('UserRegistration/checkBox-Gender', [('gender') : gender]))

WebUI.setText(findTestObject('UserRegistration/input-FirstName'), firstname)

WebUI.setText(findTestObject('UserRegistration/input-lastName'), secondname)

WebUI.selectOptionByValue(findTestObject('UserRegistration/dropbox-Date'), date, false)

WebUI.selectOptionByValue(findTestObject('UserRegistration/dropbox-Month'), month, false)

WebUI.selectOptionByValue(findTestObject('UserRegistration/dropBox-Year'), year, false)

WebUI.setText(findTestObject('UserRegistration/input-Email'), email)

WebUI.setText(findTestObject('UserRegistration/input-Company'), company)

WebUI.setEncryptedText(findTestObject('UserRegistration/input-Password'), 'VIz28yrNd+q+X7Cy0jWfpw==')

WebUI.setEncryptedText(findTestObject('UserRegistration/input-ConfirmPassword'), 'VIz28yrNd+q+X7Cy0jWfpw==')

WebUI.click(findTestObject('UserRegistration/button-Register2'))

WebUI.verifyElementPresent(findTestObject('UserRegistration/text-RegistrationComplete'), 0)

WebUI.click(findTestObject('UserRegistration/button-Continue'))

WebUI.click(findTestObject('UserRegistration/button-Signout'))

