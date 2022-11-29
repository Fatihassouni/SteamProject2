package fr.ubo.steam.Service;
import fr.ubo.steam.DAO.ImageRevolverDao;
import fr.ubo.steam.DAO.ImageRevolverDaoImpl;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
public class ImageRevolverController {

    ImageRevolverDaoImpl imageRevolverDaoImpl = new ImageRevolverDao();

    @RequestMapping(value = "/imgs", produces = "application/json")
    public Map<String, byte[]> getloadImagesMain() throws Exception {
        return imageRevolverDaoImpl.loadImagesMain("src/img/revolver/main");

    }
    @GetMapping("/test")
    public String test() throws Exception {
        return "test successful";
    }
}
