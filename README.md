This is a simple project for performing visual diffs on a Drupal CMS.
It is not restricted to Drupal, but has been initially written with Drupal in mind.

There is one sample test in the project which does:

1. Visit the base url of your site.

2. Screenshot the homepage.

3. Login to the CMS.

4. Go to the Create Article content type.

5. Screenshot the Create Article content type.

6. The test is then re-run at a later date which repeats steps 1 to 5, and a visual diff report is automatically generated.


### How to use this project

1. clone this repository.

2. cd into the repository directory.

3. generate a set of baseline images.

4. increment the POM configuration version by 1.

5. generate a set of comparison images.

6. view the results.

### Note
The tests sit in a package called "package com.visualdiff.PROJECTNAME;".

Please update "PROJECTNAME" with the name of your project.

### Setup
* To setup the tests, clone the repository.

### Execution
* cd into the repository directory:

```
cd VisualDiffwithJavaSelenium
```

* This will generate a set of base line images:

```
mvn clean install site -DbaseURL={{the_base_url_of_the_site}} -Dbrowser={{the_browser_type_}} -Dusername={{the_username_value}} -Dpassword={{the_password_value}}
```

* This will increment the pom.xml version number:

```
mvn build-helper:parse-version versions:set -DnewVersion=\${parsedVersion.majorVersion}.\${parsedVersion.minorVersion}.\${parsedVersion.nextIncrementalVersion} versions:commit
```

* This will generate a set of comparison images:

```
mvn clean install site -DbaseURL={{the_base_url_of_the_site}} -Dbrowser={{the_browser_type_}} -Dusername={{the_username_value}} -Dpassword={{the_password_value}}
```

### Results
* A visual diff report will be generated in:

```
/target/site/visualdiff.html
```

### Extending the tests
The sample test does very little but is designed to be extended easily.

If you want to visual diff other 'Create Content' pages, simply duplicate the code for the 'Article' content type.

If you want to visual diff specific URLs (useful for a static site), then add the list of URLs to ../src/test/java/com/Model/Configuration.java. Then read these in one-by-one into the test in a similar way to the sample test.

There are other options and ways this can be extended.
