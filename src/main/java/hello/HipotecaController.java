package hello;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HipotecaController {

	@GetMapping(value="/form")
	public ModelAndView mostrarForm(){ 
		 //mm.addAttribute("hipoteca", new Hipoteca());
        return new ModelAndView("form", "hipoteca", new Hipoteca());  
    }  
	
		
	@PostMapping(value="/form")
	public String guardar(@Valid @ModelAttribute("hipoteca") Hipoteca hipoteca, BindingResult result, ModelMap model){  
		model.addAttribute("capital", hipoteca.getCapital());
        model.addAttribute("interes", hipoteca.getInteres());
        model.addAttribute("anos", hipoteca.getAnos());
        model.addAttribute("cuota", hipoteca.getCuota());
        
		return "result"; 
	}
	

}
