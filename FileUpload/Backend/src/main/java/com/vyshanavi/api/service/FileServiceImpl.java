package com.vyshanavi.api.service;

import com.vyshanavi.api.dao.DocRepository;
import com.vyshanavi.api.model.DocModel;
import org.apache.commons.io.FilenameUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.nio.file.Files;

@Service
public class FileServiceImpl implements FileService {
    @Autowired
    DocRepository docRepository;

    @Override
    public void store(MultipartFile file) {
        try {
            System.out.println(file.getSize());
            System.out.println(FilenameUtils.getExtension(file.getOriginalFilename()));
            System.out.println(file.getContentType());
            DocModel docModel=new DocModel();
            docModel.setName(file.getOriginalFilename());
            docModel.setType(FilenameUtils.getExtension(file.getOriginalFilename()));
            docModel.setData(file.getBytes());
            System.out.println(docRepository.save(docModel));
        } catch (Exception e) {
            System.err.println(e);
            throw new RuntimeException("FAIL!");
        }

    }
}
