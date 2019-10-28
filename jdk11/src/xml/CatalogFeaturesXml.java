package xml;

import javax.xml.catalog.CatalogFeatures;
import javax.xml.catalog.CatalogFeatures.Feature;

public class CatalogFeaturesXml {
	public static void main(String[] args) {
		CatalogFeatures f = CatalogFeatures.builder().with(Feature.RESOLVE, "continue").build();
		System.setProperty(Feature.RESOLVE.getPropertyName(), "continue");
			
	}
}
