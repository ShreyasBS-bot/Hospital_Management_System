package Pom_classes;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import Generic_Methods.Base_Page;

public class Admin_Doctor_Page extends Base_Page
{
	@FindBy(xpath="//button[@class='btn btn-primary pull-right']")
	private WebElement add_doctor;
	@FindBy(xpath="(//input[@type='text'])[3]")
	private WebElement search_button;
	@FindBy(xpath="(//td[@class=' '])[8]")
	private WebElement xxx;
	@FindBy(xpath="//a[@class='btn btn-default btn-sm btn-icon icon-left']")
	private WebElement edit;
	@FindBy(xpath="//td[.='abcde']")
	private WebElement abcde;
	 
	 
	
	
	
	
	
	public Admin_Doctor_Page(WebDriver driver)
	{
		super(driver);
	}
	
	
	
	public void clickOnAddDoctor()
	{
		elementToBeCLickable(5, add_doctor);
		add_doctor.click();
	}
	public void clickOnSearch(String name)
	{
		elementToBeCLickable(5, search_button);
		search_button.sendKeys(name);
	}
	public void elementVisible()
	{
		visibilityOf(5, xxx);
	}
	public void clickOnEdit()
	{
		elementToBeCLickable(5, edit);
		edit.click();
	}
	public void abcdeVisible()
	{
		visibilityOf(5, abcde);
	}
}
