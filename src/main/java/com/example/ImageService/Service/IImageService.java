package com.example.ImageService.Service;


import com.example.ImageService.DTO.ResponeImageDTO;
import com.example.ImageService.Entity.Image;

public interface IImageService {
    ResponeImageDTO getImageByCourseID(int id);

    public int deleteImageByCourseID(int id);

    ResponeImageDTO fromDTO(Image image);
}
