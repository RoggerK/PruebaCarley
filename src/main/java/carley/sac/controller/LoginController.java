package carley.sac.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import carley.sac.models.Login;

@Controller
public class LoginController {
	
	@GetMapping("/login")
	public String login(Model model) {
		model.addAttribute("login", new Login());
		return "login";
	}
	
	@PostMapping("/ingresar")
	public String logeo(@ModelAttribute("login") Login logeo) {
		System.out.format("usuario: %s - contraseña: %s", logeo.getCorreo(), logeo.getContrasenia());
		return "/Empleado/usuario";
	}
}
