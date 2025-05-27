package utez.edu.mx.cviueh9a.controller;

public class User2Controller {
    @GetMapping("/user2")
    public String getMessage() {
        return "Hola Mundo";
    }
}