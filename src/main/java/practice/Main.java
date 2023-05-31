package practice;

import java.util.Scanner;

public class Main {
    private static TodoList todoList = new TodoList();

    public static void main(String[] args) {
        // TODO: написать консольное приложение для работы со списком дел todoList
        String value = new Scanner(System.in).nextLine();
        if (value.contains("ADD")){
            todoList.add(value);
        }
        if (value.contains("EDIT")){
            String index = value.substring(5,6);
            todoList.edit(Integer.parseInt(index), value);
        }
        if (value.contains("DELETE")){
            String index = value.substring(7,8);
            todoList.delete(Integer.parseInt(index));
        }
        if (value.contains("LIST")){
            for (String task: todoList.getTodos()){
                System.out.println(task);
            }
        }
    }
}
