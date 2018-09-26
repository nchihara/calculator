#!/usr/bin/env groovy
node
{
	stage("CHECKOUT")
	{
		checkout scm
	}
	stage("COMPILE")
	{
		echo "Step::compile"
		sh "/opt/maven-3.3/bin/mvn compile"
	}
	stage("TEST")
	{
		echo "Step::Test"
		sh "/opt/maven-3.3/bin/mvn test"
		junit "target/surefire-reports/*xml"
		
	}
//	stage("Archive")
//	{
//		try
//		{
//			archiveArtifacts  artifacts: '**/target/*jar', figerprint: true
//		}
//		finally
//		{
//			echo "Clean up workspace"
//			deleteDir()
//			sh "/opt/maven-3.3/bin/mvn clean"
//		}
//	}
}		
