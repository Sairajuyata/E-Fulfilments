package com.vyshanavi.api.service;

import org.springframework.web.multipart.MultipartFile;

public interface FileService {
    public void store(MultipartFile file);
}
