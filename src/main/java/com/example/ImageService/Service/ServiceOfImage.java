package com.example.ImageService.Service;


import com.example.ImageService.Config.ModelMapperObject;
import com.example.ImageService.DTO.ResponeImageDTO;
import com.example.ImageService.Entity.Image;
import com.example.ImageService.Repository.ImageRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ServiceOfImage implements IImageService {

    @Autowired
    ImageRepository imageRepository;

    @Autowired
    ModelMapperObject modelMapperObject;


    @Override
    public ResponeImageDTO getImageByCourseID(int id) {
        return fromDTO(imageRepository.findByCourseId(id));
    }

   @Override
    public int deleteImageByCourseID(int id)
    {
        return imageRepository.deleteImageByCourseId(id);
    }

    @Override
    public ResponeImageDTO fromDTO(Image image) {
        return image != null ?  modelMapperObject.modelMapper().map(image,ResponeImageDTO.class) : null;
    }


    public ResponeImageDTO fromImagetoResponeImageDTO(Image image)
    {
             ResponeImageDTO responeImageDTO = new ResponeImageDTO();

             if(image == null)
             {
                 return responeImageDTO;
             }
             else
             {
                 responeImageDTO.setId(image.getId());

                 responeImageDTO.setOne(image.getOne());

                 responeImageDTO.setTwo(image.getTwo());

                 responeImageDTO.setThree(image.getThree());

                 responeImageDTO.setFour(image.getFour());

                 responeImageDTO.setCourseId(image.getCourseId());
             }

             return  responeImageDTO;
    }
}
