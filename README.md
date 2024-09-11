**Historian Zone App**
The Historical Figures Age Comparison App  is an educational Android application that allows users to compare their age with famous historical figures when they passed away. This fun and engaging app is designed for students to learn about different figures from history while also reflecting on their own age. The App is fun and interactive for anyone who is a fan of history and learning.

**User interface**
-Edit Text: let's the user enter the age they want to compare
-Button(generate age): click it to generate the required information input in edit text in this case age comparison of a famous person's age at death
-View text: (output) The app displays the name of a historical figure who passed away at the user's age (if there is a match), or a message saying that no historical figures passed away at the user's age.
-Clear(button): to clear out output and the input field.
Edit Text (Input Field):

This is the primary input field where users can enter their age.
The input is limited to whole numbers between 20 and 100, ensuring users provide valid data for comparison.
After entering the desired age in this field, the user can proceed to generate results by pressing the Generate Age button.
Generate Age Button:

This button triggers the core functionality of the app: comparing the user’s input age with the ages of historical figures.
Once the user has entered a valid age in the Edit Text field, they can click the Generate Age button to view the comparison.
The app will then search through its list of historical figures and display the results in the output view.
Text View (Output Display):

After the Generate Age button is pressed, the app displays the comparison results in this Text View area.
If there is a match, the app shows the name of the historical figure who passed away at the same age as the user’s input.
For example, if the user enters an age of 35, the output might say: "Mozart passed away at age 35."
If no historical figures passed away at the user’s input age, a message like "No historical figures passed away at your age." will be displayed.
This text view dynamically updates based on the input and the user’s interactions.
Clear Button:

The Clear button provides users with the ability to reset the app’s interface for a new input.
When clicked, it clears both the Edit Text input field (where the user entered their age) and the Text View output field (where the results were displayed).
This allows the user to quickly start over, entering a new age without any remnants of previous inputs or results on the screen.

**Historical Figures on the list with their age at the time of their death**
1.Bob Marley-36 years old
2.Amy Winehhouse-27 years old
3.Shaka Zulu-41 years old
4.Alexander the Great 32 years old
5.Farrah Fawcett-65 years old
6.Mariam Makeba-76 years old
7.Linda 'Prokid' Mkhize-37 years old
8.Mozart-35 years old
9.Steve Biko -30 years old
10.Steve Jobs-56 years old


**Features**
-The app let's you input your age to compare it to a late famous person's age of death > input of age
-There are 10 figures who have been put on that list with ages ranging from 20-100 years old you can compare > comparison logic
-Handles errors and invalid inputs, if the age is outside the 20-100 age range it will give your an error stating you passed the age limit.
-Clear option to clear out the text input and view> 

**usage**
-You type in the age you want to compare with in the "enter age"" input box
-Then click the "generate age" button to compare the age, the feedback will appear at the bottom on the text view space
-The app will compare your age to a name on the list 
-If you made a mistake or need to clear out the output field  you click the "clear" button

The app allows users to input their age into a designated text field. Once the user enters their age (within the range of 20 to 100 years), they can compare it against the ages of famous historical figures when they passed away.
This input system encourages users to reflect on their own age in the context of historical events and people.

The app contains a curated list of 10 historical figures, each with their age at the time of death. These figures come from different periods and backgrounds, ranging from musicians and political figures to world leaders.
The app compares the user’s age with the ages in this list, allowing the user to see if any of the historical figures passed away at their age or younger. This comparison offers an engaging way for users to connect with history through an interactive experience.

**technologies used**
-Kotlin was used to code the android appplication
-Android Studio to develop the applicaution
-Github to test the application

The app was developed using Kotlin in Android Studio. Kotlin was chosen for its concise syntax and full compatibility with Android development. Version control was set up using Git, and the project was hosted on GitHub for collaboration and backup purposes. The app’s main functionality resides in the MainActivity.kt file, where user input is processed and validated before being compared to a predefined list of historical figures.

**testing**
Manual Testing
-Perform functional tests by entering valid and invalid ages to check how the app behaves.
-Test edge cases like ages at the minimum (20) and maximum (100) valid values.
Automated testing
-This repository uses GitHub Actions for Continuous Integration 
-Every time you push changes, GitHub Actions will automatically run tests and build the project.


![Screenshot (66)](https://github.com/user-attachments/assets/774fe5a0-fa6d-4b0c-8fa8-9d037c8323ab)
![Screenshot (67)](https://github.com/user-attachments/assets/01ba87d3-36cf-403e-9187-c44f316c6444)
![Screenshot ![Screenshot (69)](https://github.com/user-attachments/assets/fb22a3ae-4716-4b19-ac85-bac34edccc5d)
![Screenshot (70)](https://github.com/user-attachments/assets/1e6842a2-5243-4029-9024-1c9f90ddf72c)

Reference:

https://www.geeksforgeeks.org/how-to-build-age-calculator-in-android-studio/. (2022)
Opoku,I. (2024). How to Use Git and GitHub – a Guide for Beginners and Experienced Developers. Available at:  https://www.freecodecamp.org/news/guide-to-git-github-for-beginners-and-experienced-devs/. (April 6, 2024)

(68)](https://github.com/user-attachments/assets/5ace94aa-628f-4e20-b475-e467295be653)
