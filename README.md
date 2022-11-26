## Setup :

- Clone the Project from ```report_generator_parser``` branch to your local and follow the below steps .

#### Eclipse

- Install Eclipse or any Java IDE .
- Configue the JDK path by going to Environment Variables . Eg : 
            ```JAVA_HOME = C:\Program Files\Java\jdk1.8.0_202```
- Once that's done, import the project that you cloned from git repo by following the below steps:
    - In Eclipse, ```File -> Import -> General -> Existing Projects into Workspace```.

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


Once the Project has been imported and the above setup has been completed, run the ```Parser_Inner.java``` file. The generated latex file will be ```latex_rev4.tex```. Open command prompt, run ```pdflatex latex_rev4.tex -shell-escape```. The PDF file will be generated in your project directory itself.

