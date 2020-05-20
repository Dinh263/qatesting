# qatesting

# how to run the test cases
Open the terminal and navigate to the location (parent folder) of pom.xml file and run the command:
mvn clean verify serenity:aggregate -Dcucumber.options="--tags @login" -Denvironment=default

# run test case on headless mode or not
you can configure test case run on headless or not by change the value of option "headless.mode" in the serenity.conf file.
the serenity.conf is located under folder /src/test/resources/
set value for "headless.mode" = true if run on headless or set to false if run on UI mode.