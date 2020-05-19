# qatesting

# how to run the test cases
Open the terminal and navigate to the location (parent folder) of pom.xml file and run the command:
mvn clean verify serenity:aggregate -Dcucumber.options="--tags @login" -Denvironment=default

