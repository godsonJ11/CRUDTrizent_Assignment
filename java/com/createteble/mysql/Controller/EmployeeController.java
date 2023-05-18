package com.createteble.mysql.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.createteble.mysql.Entity.TableCreating;
import com.createteble.mysql.Repo.EmployeeRepo;


@Controller
public class EmployeeController {
	
	@Autowired
	EmployeeRepo repo;
	@RequestMapping("/")
	public String home() {
		return "index.jsp";
	}
	    @RequestMapping("/addEmp")
		public String addEmp(TableCreating tableCreating) {
			repo.save(tableCreating);
			System.out.println("Employee details save successfully...............................");
			return "index.jsp";
		}
	    @RequestMapping("/getEmp")
		public ModelAndView addEmp(@RequestParam("eEmail") String eEmail) {
		 ModelAndView model = new ModelAndView("show.jsp");
			TableCreating tableCreating = repo.findById(eEmail).orElse(null);
			model.addObject( tableCreating);
			System.out.println(tableCreating);
			return model;
		}
	   @RequestMapping("/deleteEmp")
	   public ModelAndView deleteEmp(@RequestParam ("eEmail")String eEmail) {
		  ModelAndView model= new ModelAndView("index.jsp");
		  TableCreating tableCreating = repo.findById(eEmail).orElse(new TableCreating());
		  repo.deleteById(eEmail);
		  model.addObject(tableCreating);
		 System.out.println("Employee details deleted successfully................................");
	 	 return model;
	 }
	  @RequestMapping("/updateEmp")
	  public ModelAndView updateEmp(TableCreating tableCreating) {
		  
		  ModelAndView model =new ModelAndView("updateUser.jsp");
		   tableCreating=  repo.findById(tableCreating.geteEmail()).orElse(new TableCreating());
		   repo.deleteById(tableCreating.geteEmail());
		   model.addObject(tableCreating);
		   return model;
				  
		 
	 }
}
