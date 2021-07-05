package ucf.assignments;

import java.util.ArrayList;
import java.util.Collection;

public class AppModel {
Collection<ToDoList> toDoList = new ArrayList<>();

public void loadAll() {
    //New File savedLists ("/SavedLists/")
    //New File[] lists = savedLists listFiles
    //For all of lists array
        //If lists is a file
            //Run loadList() with lists' file name

}

public void loadList(String fileName) {
    //Try
    //String fullPath = build string "./SavedLists/" + fileName + ".csv"
    //New Scanner file = Scanner(fullPath)
    //New ToDoList loadedList
    //setTitle loadedList to fileName
    //While file has next
        //New String data = file next
        //New String[] lineValues = data.split(",")
        //loadedList.addItem(lineValues[0], lineValues[1], lineValues[2])
    //toDoList.add(loadedList)
    //Catch
}

public void saveAll() {
    //For each ToDoList in toDoList
    //  Run saveList() with toDoList getTitle

}

public void saveList(ToDoList toSave) {
    //String fileName = "/SavedLists/" + title from toSave + ".csv"
    //New FileWriter as file using fileName as parameter
    //For each ToDoItem in toSave toDoItems
    //  Append to file getDesc, ",", getDueDate, ",", getCompleted, & "\n"
}

public void addList(){
    //New ToDoList newList
    //New String newTitle = ""
    //New int titleNo = 1
    //do
    //  if !toDoList.title.contains("NewList"+titleNo)
    //      newTitle = "NewList" + titleNo
    //  titleNo ++
    //while newTitle = ""
    //setTitle of newList to newTitle
    //Add newList to toDoList
}

public void removeList(String title){
    //New Iterator<ToDoList> i of toDoList
    //Loop while i has values
    //New ToDoList compare = next i
    //If compare title = param title
    //  remove i

}

}
