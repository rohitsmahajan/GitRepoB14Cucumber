package com.basic.differentfolder;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		monochrome=true, // this is used for garbage collection and unicode characters this will give result output in understandable languege
		//dryRun = true, //this feature is used to just check featurefile and defination file is in sync.
		features = {"src/test/resources/differentfolderFF"},
		glue = {"com/basic/differentfolder"}
		)
public class RunnermyFirstFeatureTest {
	

}
