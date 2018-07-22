package com.vyshanavi.api.dao;

import com.vyshanavi.api.model.DocModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DocRepository extends JpaRepository<DocModel, Long> {
    DocModel save(DocModel user);
}
