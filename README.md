"# ArabDTweb" 
## Step 1: Clone the Git Repository
- Open your terminal or command prompt.
- Navigate to the directory where you want to clone the repository.
- Run the following command to clone the Git repository:
- git clone <repository_url>

## Step 2: Navigate to the Project Directory
- Once the repository is cloned, navigate to the project directory:
- cd <project_directory>

## Step 3: Build the Project
- Inside the project directory, you should see the `pom.xml` file. This file contains the project configuration and dependencies.
- Run the following Maven command to build the project and download dependencies:
- mvn clean install or build it from inside IDE
  
## Step 4: Run the Tests
- Right-click on the `testng.xml` file and then select "Run as TestNg Suite".
- Or run the following Maven command:
  ```
  mvn clean test -DsuiteXmlFile=testng.xml
  ```
