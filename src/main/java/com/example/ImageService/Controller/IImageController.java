package com.example.ImageService.Controller;



import com.example.ImageService.DTO.ResponeImageDTO;
import com.example.ImageService.Entity.Image;
import com.example.ImageService.ResponeObject.ResponeObject;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;

@RequestMapping("/api/image")
public interface IImageController {

    @GetMapping("/getImageByCourseID/{id}")
    ResponeImageDTO getImageByCourseID(@PathVariable int id);


    @GetMapping("/deleteImageByCourseID/{id}")
    int deleteImageByCourseID(int id);


    @PostMapping("/saveCourseImages")
    ResponseEntity<ResponeObject> saveCourseImages(MultipartFile one, MultipartFile two, MultipartFile three, MultipartFile four, int courseId) throws IOException;

}
