package project1;

import java.util.List;

//import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

public class dresspage  extends basepage{
	// size check box
	
	@FindBy(xpath="//*[@id='layered_id_attribute_group_1']")
	private WebElement Small;
	
	@FindBy(xpath="//*[@id='layered_id_attribute_group_2']")
	private WebElement Medium;
	
	@FindBy(xpath="//*[@id='layered_id_attribute_group_3']")
	private WebElement Large;
	
	
	
	@FindBy(xpath="//*[@id=\"center_column\"]/h1/span[2]")
	private WebElement header;
	
	
	@FindBys(@FindBy(xpath="//*[@id=\"center_column\"]/ul/li"))
    private List<WebElement> productcount;



	

	public dresspage() {
		PageFactory.initElements(driver, this);
	}
	
	
	public WebElement getSmall() {
		return Small;
		
	}
	public WebElement getMedium() {
		return Medium;
		
	}
	
	public WebElement getLarge() {
		return Large;
	}
	
	
	public int getproductnumberheader() {
		String s = header.getText();
		String[] arr=s.split(" ");
		String value =arr[2];
		int count = Integer.parseInt(value);
		return count;
	}
	
	public int getproductcount() {
		return productcount.size();
	}
}

