package Controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import EntityClass.IPL;
import ImplementRepository.Implementcls;

@RestController
public class Controller {
	@Autowired
	Implementcls im;
@PostMapping("/addPlayer")
public String addplayer(@RequestBody IPL i) {
	im.save(i);
	return "Data Saved";
}

@PostMapping("/UpdatePlayer")
public String UpdateData(@RequestBody IPL i) {
	im.save(i);
	return "Update Successfull";
}

@GetMapping("/delete")
public String delete(@RequestParam IPL i) {
	im.delete(i);
	return "delete Successfull";
}
@GetMapping("/FetchData")
public IPL GetData(@RequestParam int i) {
	
	Optional<IPL> o= im.findById(i);
	IPL ipl = o.get();
	return ipl;
}
}
