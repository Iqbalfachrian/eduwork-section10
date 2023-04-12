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

Mobile.startApplication('C:\\Users\\Dell\\Katalon Studio\\EduApp\\mobileapp\\Lulu Shopping_2.2.10.1.1.apk', true)

Mobile.tap(findTestObject('Final Project/SKIP'), 0)

Mobile.tap(findTestObject('Object Repository/Final Project/android.widget.ImageView (5)'), 0)

Mobile.tap(findTestObject('Object Repository/Final Project/android.widget.Button - Continue (1)'), 0)

Mobile.tap(findTestObject('Object Repository/Final Project/android.widget.Button - Get Started'), 0)

Mobile.tap(findTestObject('Object Repository/Final Project/android.widget.TextView - Skip'), 0)

Mobile.tap(findTestObject('Object Repository/Final Project/android.widget.TextView - Store Pickup'), 0)

Mobile.tap(findTestObject('Object Repository/Final Project/android.widget.TextView - Lulu Hypermarket, Shati, Dammam'), 
    0)

Mobile.tap(findTestObject('Final Project/android.widget.ImageView (2)'), 0)

Mobile.tap(findTestObject('Final Project/android.widget.ImageView (3)'), 0)

Mobile.tap(findTestObject('Final Project/android.widget.ImageView (4)'), 0)

Mobile.tap(findTestObject('Final Project/android.widget.Button - Add To Cart (1)'), 0)

Mobile.tap(findTestObject('Final Project/android.widget.Button - Go To Cart (1)'), 0)

Mobile.tap(findTestObject('Final Project/android.widget.Button - Proceed (1)'), 0)

Mobile.setText(findTestObject('Final Project/android.widget.EditText - First Name'), 'iqbal', 0)

Mobile.setText(findTestObject('Final Project/android.widget.EditText - Last Name'), 'Fachrian', 0)

Mobile.setText(findTestObject('Final Project/android.widget.EditText - Phone Number'), '1234567', 0)

Mobile.setText(findTestObject('Final Project/android.widget.EditText - Create Password'), 'Fullst@ck2022', 0)

Mobile.scrollToText('continue', FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Final Project/android.widget.Button - Continue'), 0)

Mobile.closeApplication()

