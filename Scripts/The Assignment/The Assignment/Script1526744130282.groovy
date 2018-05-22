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

WebUI.callTestCase(findTestCase('Verify-Registration'), [('gender') : 'gender-male', ('firstname') : 'Jesse', ('secondname') : 'Mutiga'
        , ('date') : '11', ('month') : '7', ('year') : '1995', ('email') : 'jessemutiga23@live.com', ('company') : 'Tezza Solutions'
        , ('url') : 'http://demo.nopcommerce.com'], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Verify-Login'), [('email') : 'jessemutiga23@live.com'], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Verify-AddLumiaToCart'), [('lumia') : 'Nokia Lumia 1020'], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Verify-FlowerGirlBracelet'), [('flower') : 'flower girl bracelet'], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Verify-RemoveLumiaFromCart'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Verify-CheckOut'), [('country') : '148', ('visa') : 'visa', ('cardnumber') : '4478150090540616'
        , ('monthofexpiry') : '4', ('yearofexpiry') : '2019', ('cardcode') : '0616', ('city') : 'Nairobi', ('address') : 'P.O. Box 187, Nyeri'
        , ('zipcode') : '10100', ('phonenumber') : '0720176766', ('cardholdername') : 'Jesse Mutiga'], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Verify-Logout'), [:], FailureHandling.STOP_ON_FAILURE)

