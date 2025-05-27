package utez.edu.mx.cviueh9a.controller;

public class User1Controller {
    @GetMapping("/user1")
    public String getMessage() {
        return "Hola Mundo";
    }
}