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
    stage("CODE Coverage")
	{
		echo "Step:Code Coverage Test by jacoco"
		sh "/opt/maven-3.3/bin/mvn test jacoco:report"
	}
}		
