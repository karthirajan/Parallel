package com.centric.objectrepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.centric.resources.Commonactions;

public class StyleandThemePage extends Commonactions{
	
	public StyleandThemePage() {
		PageFactory.initElements(Commonactions.driver, this);
	}
	
	@FindBy(xpath="//span[text()='Specification' or @data-csi-tab='ApparelViews-ProductSpec']")
	private WebElement Specification;
	
	@FindBy(xpath="//span[text()='Size Chart' or @data-csi-tab='SizeChartAdmin-SizeChartSpecs']")
	private WebElement SizeChart;
	
	@FindBy(xpath="(//span[text()='Dimensions' or @data-csi-tab='SizeChartAdmin-Dimensions'])[1]")
	private WebElement Dimensions;
	
	@FindBy(xpath="(//span[text()='Dimension Gallery' or @data-csi-tab='SizeChartAdmin-DimensionCards'])")
	private WebElement DimensionCards;
	
	@FindBy(xpath="(//span[text()='Increments' or @data-csi-tab='SizeChartAdmin-Increments'])[1]")
	private WebElement Increments;
	
	@FindBy(xpath="(//span[text()='Product Group' or @data-csi-tab='SizeChartAdmin-ProductGroups'])[1]")
	private WebElement productGrp;
	
	@FindBy(xpath="(//table[contains(@data-csi-automation,'ProductGroups')]//div/div)[2]")
	private WebElement ProductGrpBtn;
	
	@FindBy(xpath="((//div[contains(@data-csi-automation,'ProductGroup')]/div)/div/input)[1]")
	private WebElement ProductGrpValue ;
	
	@FindBy(xpath="((//div[contains(@data-csi-automation,'Description')]/div)/div/input)[1]")
	private WebElement Description;
	
	@FindBy(xpath="//td//a[contains(text(),'PG - 01')]")
	private WebElement PG_Value;
	
	@FindBy(xpath="(//table[contains(@data-csi-automation,'Dimension')]//div/div)[2]")
	private WebElement DimensionBtn;
	
	@FindBy(xpath="(//td[contains(text(),'A15E')]//preceding-sibling::td)[1]//input")
	private WebElement PG_1ChkBx;
	
	@FindBy(xpath="(//td[contains(text(),'A16S')]//preceding-sibling::td)[1]//input")
	private WebElement PG_2ChkBx;
	
	@FindBy(xpath="(//td[contains(text(),'A25FE')]//preceding-sibling::td)[1]//input")
	private WebElement PG_3ChkBx;
	
	@FindBy(xpath="(//td[contains(text(),'A26FS')]//preceding-sibling::td)[1]//input")
	private WebElement PG_4ChkBx;
	
	@FindBy(xpath="(//td[@data-csi-heading='ToleranceNegative::0'])[1]")
	private WebElement Tolerance;
	
	@FindBy(xpath="(//td[@data-csi-heading='Increments::0'])[1]")
	private WebElement IncrementValue;
	
	@FindBy(xpath="//span[text()='home']")
	private WebElement home_Icon;
	
	@FindBy(xpath="//span[text()='Shape and Theme' or @data-csi-tab='ApparelViews-ShapeAndTheme']")
	private WebElement ShapeAndTheme;
	
	@FindBy(xpath="(//span[text()='Shapes' or @data-csi-tab='ApparelViews-Shapes'])[1]")
	private WebElement Shapes;
	
	@FindBy(xpath="(//table[contains(@data-csi-automation,'Shapes')]//div/div)[2]")
	private WebElement ShapesBtn;
	
	@FindBy(xpath="((//div[contains(@data-csi-automation,'Shape')]/div)/div/input)[1]")
	private WebElement Shapevalue;
	
	@FindBy(xpath="(//div[contains(@data-csi-automation,'Seasons')]/div)[1]")
	private WebElement SeasonsValue;
	
	@FindBy(xpath="(//div[contains(@data-csi-automation,'ThemeBOM')]/div)[1]")
	private WebElement BOM;
	
	@FindBy(xpath="//span[text()='Shape Masters' or @data-csi-tab='ApparelViews-ShapeMasters']")
	private WebElement ShapeMasters;
	
	@FindBy(xpath="//span[@data-csi-automation='plugin-ApparelViews-ShapeMasters-refresh']//span[@title='Refresh View']")
	private WebElement RefreshView;
	
	@FindBy(xpath="//td[@data-csi-heading='__Parent__::0']/preceding-sibling::td")
	private WebElement ShapeMasterName;
	
	@FindBy(xpath="//span[@data-csi-automation='plugin-ApparelViews-Shapes-refresh']//span[@title='Refresh View']")
	private WebElement RefreshViewShapes;
	
	@FindBy(xpath="((//a[text()='Circle Shape']/parent::td[@data-csi-act='Node Name::0'])/following-sibling::td/div/span[text()='content_copy'])[1]")
	private WebElement shapeCopy;
	
	@FindBy(xpath="((//a[text()='Square Shape']/parent::td[@data-csi-act='Node Name::0'])/following-sibling::td/div/span[text()='mode_edit'])[1]")
	private WebElement shapeedit;
	
	@FindBy(xpath="((//a[text()='Square Shape -edited']/parent::td[@data-csi-act='Node Name::0'])/following-sibling::td/div/span[text()='close'])[1]")
	private WebElement shapedelete;
	
	@FindBy(xpath="//span[text()='Shape Security Groups' or @data-csi-tab='ApparelViews-ShapeSecurityGroups']")
	private WebElement ShapeSecurityGroups;
	
	@FindBy(xpath="(//table[contains(@data-csi-automation,'ShapeSecurityGroup')]//div/div)[2]")
	private WebElement ShapesecGrpBtn;
	
	@FindBy(xpath="//td[@data-csi-heading='__Parent__:Child:__Parent__:0']")
	private WebElement SG_Shape;
	
	@FindBy(xpath="(//tr/td[contains(@data-csi-act,'Node Name')]/a[text()='Circle Shape'])[2]")
	private WebElement ShapeName ;
	
	@FindBy(xpath="//td[@data-csi-heading='ShapeSizeRange::0']")
	private WebElement ShapeSizeRange;
	
	@FindBy(xpath="//span[text()='Styles' or @data-csi-tab='Shape-ShapeStyles']")
	private WebElement Shapestyles;
	
	@FindBy(xpath="(//table[contains(@data-csi-automation,'ShapeStyles')]//div/div)[2]")
	private WebElement ShapeStyleBtn;
	
	@FindBy(xpath="(//td[contains(text(),'Accessories')]//preceding-sibling::td)[1]//input")
	private WebElement Style_1ChkBx;
	
	@FindBy(xpath="(//td[contains(text(),'Accessories - Only')]//preceding-sibling::td)[1]//input")
	private WebElement Style_2ChkBx;
	
	@FindBy(xpath="(//td[contains(text(),'Apparel')]//preceding-sibling::td)[1]//input")
	private WebElement Style_3ChkBx;
	
	@FindBy(xpath="((//a[text()='Accessories - No color and Size']/parent::td[@data-csi-heading='Node Name::0'])//following-sibling::td/div/span[text()='remove_circle_outline'])[1]")
	private WebElement Style_1Delete;
	
	@FindBy(xpath="((//a[text()='Accessories - Only Color']/parent::td[@data-csi-heading='Node Name::0'])//following-sibling::td/div/span[text()='remove_circle_outline'])[1]")
	private WebElement Style_2Delete;
	
	@FindBy(xpath="//span[text()='Samples' or @data-csi-tab='Shape-ShapeSamples']")
	private WebElement Samples;
	
	@FindBy(xpath="(//table[contains(@data-csi-automation,'ShapeSamples')]//div/div)[2]")
	private WebElement SampleBtn;
	
	@FindBy(xpath="(//td[contains(text(),'small')]//preceding-sibling::td)//input")
	private WebElement SmallChkBx;
	
	@FindBy(xpath="(//td[text()='large']//following-sibling::td/div//span[text()='mode_edit'])[1]")
	private WebElement Sample_Edit;
	
	@FindBy(xpath="((//div[contains(@data-csi-automation,'Sample')]/div)/div/input)[1]")
	private WebElement SampleValue;
	
	@FindBy(xpath="(//td[text()='large']//following-sibling::td/div//span[text()='content_copy'])[1]")
	private WebElement Sample_Copy;
	
	@FindBy(xpath="(//td[text()='large']//following-sibling::td/div//span[text()='close'])[2]")
	private WebElement Sample_Delete;
	
	@FindBy(xpath="//span[text()='Specification' or @data-csi-tab='Shape-ShapeSpecificationTab']")
	private WebElement Shape_Specification;
	
	@FindBy(xpath="(//table[contains(@data-csi-automation,'SizeChart')]//div/div)[2]")
	private WebElement SizeChartBtn;
	
	@FindBy(xpath="((//div[contains(@data-csi-automation,'SizeChart')]/div)/div/input)[1]")
	private WebElement SizeChart_Value;
	
	@FindBy(xpath="(//div[contains(@data-csi-automation,'Subtype')]/div)[1]")
	private WebElement SubType;
	
	@FindBy(xpath="(//div[contains(@class,'SizeChart')]//span[text()='+']/parent::div)[1]")
	private WebElement SizePluIcon;
	
	@FindBy(xpath="(//td[contains(@data-csi-heading,'SubrangeIncrement:Child:CurrentRevision')])[1]")
	private WebElement SCIncrement;
	
	@FindBy(xpath="//span[text()='Themes' or @data-csi-tab='ApparelViews-Themes']")
	private WebElement Themes;
	
	@FindBy(xpath="(//table[contains(@data-csi-automation,'Theme')]//div/div)[2]")
	private WebElement ThemeBtn;
	
	@FindBy(xpath="((//div[contains(@data-csi-automation,'Theme')]/div)/div/input)[1]")
	private WebElement ThemeMasterValue;
	
	@FindBy(xpath="((//div[contains(@data-csi-automation,'Theme-Form-Node Name')]/div)/div/input)[2]")
	private WebElement ThemeValue;
	
	@FindBy(xpath="(//table[contains(@data-csi-automation,'Theme')])[1]//tbody/tr/td[2]")
	private WebElement ThemeBtnExpand;
	
	@FindBy(xpath="//td[text()='New Theme from Style']")
	private WebElement StyleThemeBtn;
	
	@FindBy(xpath="(//td[contains(text(),'Apparel - Color and Size')]/preceding-sibling::td)[1]/div/input")
	private WebElement StyTheme_ChkBx;
	
	@FindBy(xpath="//td[text()='New Theme from Material']")
	private WebElement MaterialThemeBtn;
	
	@FindBy(xpath="(//td[contains(text(),'Rayon')]/preceding-sibling::td)[1]/div/input")
	private WebElement MatThemeChkBx;
	
	@FindBy(xpath="(//a[text()='Apparel - Color and Size']/parent::td//following-sibling::td/div//span[text()='content_copy'])[1]")
	private WebElement Theme_Copy;
	
	@FindBy(xpath="(//a[contains(text(),'Copied')]/parent::td//following-sibling::td/div//span[text()='mode_edit'])[1]")
	private WebElement Theme_Edit;
	
	@FindBy(xpath="(//a[contains(text(),'Copied')]/parent::td//following-sibling::td/div//span[text()='close'])[1]")
	private WebElement Theme_Delete;
	
	@FindBy(xpath="//span[text()='Theme Security Groups' or @data-csi-tab='ApparelViews-ThemeSecurityGroups']")
	private WebElement ThemeSecGrp;
	
	@FindBy(xpath="(//table[contains(@data-csi-automation,'ThemeSecurity')]//div/div)[2]")
	private WebElement TSG_Btn;
	
	@FindBy(xpath="//span[text()='Theme Masters' or @data-csi-tab='ApparelViews-ThemeMasters']")
	private WebElement ThemeMaster;
	
	@FindBy(xpath="(//a[contains(text(),'Wild')]/parent::td//following-sibling::td[@data-csi-heading='__Parent__::0'])")
	private WebElement TSG_Value;
	
	@FindBy(xpath="//td[@data-csi-heading='Description::0']/preceding-sibling::td/a[contains(text(),'Apparel')]")
	private WebElement ThemeName;
	
	@FindBy(xpath="(//table[contains(@data-csi-automation,'Theme-ColorColorway')]//div/div)[2]")
	private WebElement ThemeClrBtn;
	
	@FindBy(xpath="(//td[contains(text(),'Blue')]//following-sibling::td/div//span[text()='repeat'])[1]")
	private WebElement ThemeRepeatBtn;
	
	@FindBy(xpath="(//td[contains(text(),'Blue')]/preceding-sibling::td)[1]/div/input")
	private WebElement BlueChkBx;
	
	@FindBy(xpath="(//table[contains(@data-csi-automation,'Theme-ColorColorway')])[1]//tbody/tr/td[2]")
	private WebElement ThemeClrExpandBtn;
	
	@FindBy(xpath="//td[text()='New Theme Colorway Colors from Styles']")
	private WebElement Style_ClrTheme;
	
	@FindBy(xpath="//td[text()='New from Color Specification']")
	private WebElement Style_ClrSpec;
	
	@FindBy(xpath="(//td[contains(text(),'GLASS')]/preceding-sibling::td)[1]/div/input")
	private WebElement GlassChkBx;
	
	@FindBy(xpath="(//a[contains(text(),'WHITE')]/parent::div/parent::td/preceding-sibling::td)[1]")
	private WebElement White_Value;
	
	@FindBy(xpath="(//table[contains(@data-csi-automation,'ThemeProductAlternative')]//div/div)[2]")
	private WebElement ThemeProductBtn;
	
	@FindBy(xpath="(//td[contains(text(),'Italy')]//following-sibling::td/div//span[text()='content_copy'])[1]")
	private WebElement product_Copy;
	
	@FindBy(xpath="(//td[contains(text(),'Italy')]//following-sibling::td/div//span[text()='close'])[1]")
	private WebElement Product_Delete;
	
	@FindBy(xpath="(//td[contains(text(),'Vanilla')]//following-sibling::td/div//span[text()='close'])[1]")
	private WebElement Vanilla_Delete;
	
	@FindBy(xpath="//span[text()='Theme Colorway' or @data-csi-tab='Theme-ColorColorwayGallery']")
	private WebElement ThemeClrWay;
	
	@FindBy(xpath="//span[text()='Docs' or @data-csi-tab='DocumentContainer-DocumentsAndComments']")
	private WebElement ThemeDocs;
	
	@FindBy(xpath="//span[text()='Style' or @data-csi-tab='Theme-StyleTabs']")
	private WebElement ThemeStyle;
	
	@FindBy(xpath="//span[text()='Style Product' or @data-csi-tab='Theme-StylePAs']")
	private WebElement ThemeStylePA;
	
	@FindBy(xpath="//span[text()='Style Gallery' or @data-csi-tab='Theme-StyleGallery']")
	private WebElement ThemeStyleGallery;
	
	@FindBy(xpath="//span[text()='Inspiration Styles' or @data-csi-tab='Theme-InspirationStyles']")
	private WebElement ThemeInsStyle;

	public WebElement getSpecification() {
		return Specification;
	}

	public WebElement getSizeChart() {
		return SizeChart;
	}

	public WebElement getDimensions() {
		return Dimensions;
	}

	public WebElement getDimensionCards() {
		return DimensionCards;
	}

	public WebElement getIncrements() {
		return Increments;
	}

	public WebElement getProductGrp() {
		return productGrp;
	}

	public WebElement getProductGrpBtn() {
		return ProductGrpBtn;
	}

	public WebElement getProductGrpValue() {
		return ProductGrpValue;
	}

	public WebElement getDescription() {
		return Description;
	}

	public WebElement getPG_Value() {
		return PG_Value;
	}

	public WebElement getDimensionBtn() {
		return DimensionBtn;
	}

	public WebElement getPG_1ChkBx() {
		return PG_1ChkBx;
	}

	public WebElement getPG_2ChkBx() {
		return PG_2ChkBx;
	}

	public WebElement getPG_3ChkBx() {
		return PG_3ChkBx;
	}

	public WebElement getPG_4ChkBx() {
		return PG_4ChkBx;
	}

	public WebElement getTolerance() {
		return Tolerance;
	}

	public WebElement getIncrementValue() {
		return IncrementValue;
	}

	public WebElement getHome_Icon() {
		return home_Icon;
	}

	public WebElement getShapeAndTheme() {
		return ShapeAndTheme;
	}

	public WebElement getShapes() {
		return Shapes;
	}

	public WebElement getShapesBtn() {
		return ShapesBtn;
	}

	public WebElement getShapevalue() {
		return Shapevalue;
	}

	public WebElement getSeasonsValue() {
		return SeasonsValue;
	}

	public WebElement getShapeMasters() {
		return ShapeMasters;
	}

	public WebElement getRefreshView() {
		return RefreshView;
	}

	public WebElement getShapeMasterName() {
		return ShapeMasterName;
	}

	public WebElement getRefreshViewShapes() {
		return RefreshViewShapes;
	}

	public WebElement getShapeCopy() {
		return shapeCopy;
	}

	public WebElement getShapeedit() {
		return shapeedit;
	}

	public WebElement getShapedelete() {
		return shapedelete;
	}

	public WebElement getShapeSecurityGroups() {
		return ShapeSecurityGroups;
	}

	public WebElement getShapesecGrpBtn() {
		return ShapesecGrpBtn;
	}

	public WebElement getSG_Shape() {
		return SG_Shape;
	}

	public WebElement getShapeName() {
		return ShapeName;
	}

	public WebElement getShapeSizeRange() {
		return ShapeSizeRange;
	}

	public WebElement getShapestyles() {
		return Shapestyles;
	}

	public WebElement getShapeStyleBtn() {
		return ShapeStyleBtn;
	}

	public WebElement getStyle_1ChkBx() {
		return Style_1ChkBx;
	}

	public WebElement getStyle_2ChkBx() {
		return Style_2ChkBx;
	}

	public WebElement getStyle_3ChkBx() {
		return Style_3ChkBx;
	}

	public WebElement getStyle_1Delete() {
		return Style_1Delete;
	}

	public WebElement getStyle_2Delete() {
		return Style_2Delete;
	}

	public WebElement getSamples() {
		return Samples;
	}

	public WebElement getSampleBtn() {
		return SampleBtn;
	}

	public WebElement getSmallChkBx() {
		return SmallChkBx;
	}

	public WebElement getSample_Edit() {
		return Sample_Edit;
	}

	public WebElement getSampleValue() {
		return SampleValue;
	}

	public WebElement getSample_Copy() {
		return Sample_Copy;
	}

	public WebElement getSample_Delete() {
		return Sample_Delete;
	}

	public WebElement getShape_Specification() {
		return Shape_Specification;
	}

	public WebElement getSizeChartBtn() {
		return SizeChartBtn;
	}

	public WebElement getSizeChart_Value() {
		return SizeChart_Value;
	}

	public WebElement getSubType() {
		return SubType;
	}

	public WebElement getSizePluIcon() {
		return SizePluIcon;
	}

	public WebElement getSCIncrement() {
		return SCIncrement;
	}

	public WebElement getThemes() {
		return Themes;
	}

	public WebElement getThemeBtn() {
		return ThemeBtn;
	}

	public WebElement getThemeMasterValue() {
		return ThemeMasterValue;
	}

	public WebElement getThemeValue() {
		return ThemeValue;
	}

	public WebElement getThemeBtnExpand() {
		return ThemeBtnExpand;
	}

	public WebElement getStyleThemeBtn() {
		return StyleThemeBtn;
	}

	public WebElement getStyTheme_ChkBx() {
		return StyTheme_ChkBx;
	}

	public WebElement getMaterialThemeBtn() {
		return MaterialThemeBtn;
	}

	public WebElement getMatThemeChkBx() {
		return MatThemeChkBx;
	}

	public WebElement getTheme_Copy() {
		return Theme_Copy;
	}

	public WebElement getTheme_Edit() {
		return Theme_Edit;
	}

	public WebElement getTheme_Delete() {
		return Theme_Delete;
	}

	public WebElement getThemeSecGrp() {
		return ThemeSecGrp;
	}

	public WebElement getTSG_Btn() {
		return TSG_Btn;
	}

	public WebElement getThemeMaster() {
		return ThemeMaster;
	}

	public WebElement getTSG_Value() {
		return TSG_Value;
	}

	public WebElement getThemeName() {
		return ThemeName;
	}

	public WebElement getThemeClrBtn() {
		return ThemeClrBtn;
	}

	public WebElement getThemeRepeatBtn() {
		return ThemeRepeatBtn;
	}

	public WebElement getBlueChkBx() {
		return BlueChkBx;
	}

	public WebElement getThemeClrExpandBtn() {
		return ThemeClrExpandBtn;
	}

	public WebElement getStyle_ClrTheme() {
		return Style_ClrTheme;
	}

	public WebElement getStyle_ClrSpec() {
		return Style_ClrSpec;
	}

	public WebElement getGlassChkBx() {
		return GlassChkBx;
	}

	public WebElement getWhite_Value() {
		return White_Value;
	}

	public WebElement getThemeProductBtn() {
		return ThemeProductBtn;
	}

	public WebElement getProduct_Copy() {
		return product_Copy;
	}

	public WebElement getProduct_Delete() {
		return Product_Delete;
	}

	public WebElement getVanilla_Delete() {
		return Vanilla_Delete;
	}

	public WebElement getThemeClrWay() {
		return ThemeClrWay;
	}

	public WebElement getThemeDocs() {
		return ThemeDocs;
	}

	public WebElement getThemeStyle() {
		return ThemeStyle;
	}

	public WebElement getThemeStylePA() {
		return ThemeStylePA;
	}

	public WebElement getThemeStyleGallery() {
		return ThemeStyleGallery;
	}

	public WebElement getThemeInsStyle() {
		return ThemeInsStyle;
	}

	public WebElement getBOM() {
		return BOM;
	}
	

	
	
}
