# MapApp

This extension allows you to save a searched path, screensnap it as a PNG image. It also allows you to retrieve all of the saved searches from the past.You can see the demonstrations here: https://vimeo.com/201802625.

I created 2 components: for saving a path search and for retrieving saved searches.

Saving:
In the application.MapApp.setupRouteTab() method, I created a textfield and a button to displaying in the Routing tab. The textfield is for capturing the user input for the title of the file to be saved. Once the button is clicked, a screenshot of the application window (more exactly, the primaryStage) will be created by creating a WritableImage instance and output it as a PNG file through the Image.IO() method. You can save an image after you find a path from A to B.

Retrieving:
I created another tab called My Maps, which is a JavaFx Tab control called lognTab, and I place it under the MapApp class as a private field. Similar to setupRouteTab(), I created a setupLoginTab() method to handle events and display controls within the tab.

Originally I design it to be similar to Google Maps, where users have to login to see their saved maps. However I did not implement the user authentication part due to lack of time, therefore I use a static value “admin” as username and password. After logging into your account, you can see a list of saved PNG maps. The list is presented by the ListView control, and is returned from the application.MapApp.setupMyMaps() method. In the method I customized every cell (item on the ListView) with the ListView.setCellFactory() factory method. I added an Open button to each cell, and set the button to be disabled. When the cell is highlighted, the button will be enabled for clicking. Clicking the button opens a new javafx.stage.Stage (i.e. a pop-up window) as displays the PNG image.

Usage:
Download or clone this repo and replace your UCSDGraph/src/application/ folder with this application/ folder, run MapApp.java as Java application.
