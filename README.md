## Setup :

- Clone the Project to your local and follow the below steps to configure the JDK.
- Configue the JDK path by going to Environment Variables . Eg : 
            ```JAVA_HOME = C:\Program Files\Java\jdk1.8.0_202```
- Open command prompt and go the file path where ```Parser_Inner.java``` exists inside the project :
    - ```C:\Users\jyoth\Documents\SE_Project\report_generator\Report_Generator\src\report\generator\jsonparser\Parser_Inner.java```
- Compile using ```javac Parser_Inner.java```.
- Once it compiles, to run the code execute ```java Parser_Inner.java```.
- Make sure to configure the gson jar for which Eclipse IDE is required, before executing ```Parser_Inner.java``` from command line.

### Json Parser for extracting json elements 

- Install ```gson.jar``` file and follow the below steps to import the jar:
    - Go to Preferences in Eclipse.
    - Navigate to ```Java -> Build Path -> User Libraries -> New``` . Name the library  .
    - After naming, click on ```Add External Jars``` and save .
    - Once the external jar is added, it needs to be added to the Project .
        - Right click on the Project.
        - Go to ```Build Path -> Add Libraries -> User Library```.
        - Choose the User Library you created and save.

### Latex Parser

- Install ```MikTex``` into your system.
- Configure the path variable by navigating to Environment Variables .
    - Under ```User Variable -> Path```, paste ```C:\Users\jyoth\AppData\Local\Programs\MiKTeX\miktex\bin\x64```.
    - To test, open command prompt and try running ```pdflatex <filename.tex>```. The PDF will be generated in the project directory.


Once the Project has been imported and the above setup has been completed, make sure to configure the path to ```elements.json``` in your local system in the ```Parser_Inner.java``` and then run the ```Parser_Inner.java``` file. The generated latex file will be ```latex_rev7.tex```. Open command prompt, run ```pdflatex latex_rev7.tex -shell-escape```. The PDF file will be generated in your project directory itself.

### Junit Testing

- For the Junit Testing setup, kindly refer to the Appendix Section of the FinalDocumentation.pdf, which is included in the main branch and readme.md file inside tests folder inside the project.
