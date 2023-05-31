package practice;

import java.util.ArrayList;

public class TodoList {
    ArrayList<String> taskList = new ArrayList<>();
    public void add(String todo) {
        // TODO: добавьте переданное дело в конец списка
        taskList.add(todo);
    }

    public void add(int index, String todo) {
        // TODO: добавьте дело на указаный индекс,
        //  проверьте возможность добавления
        if (index > taskList.size()){
            index = taskList.size();
        }
        taskList.add(index, todo);

    }

    public void edit(int index, String todo) {
        // TODO: заменить дело на index переданным todo индекс,
        //  проверьте возможность изменения
        if (index > taskList.size()){
            return;
        }
        taskList.set(index, todo);
    }

    public void delete(int index) {
        // TODO: удалить дело находящееся по переданному индексу,
        //  проверьте возможность удаления дела
        if (index >= taskList.size()) {
            ;
        } else {
            taskList.remove(index);
        }
    }

    public ArrayList<String> getTodos() {
        // TODO: вернуть список дел
        return taskList;
    }

}