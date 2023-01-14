package com.mytemplate.template.repository.sampleentity;

import com.mytemplate.template.domain.sampleentity.SampleEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SampleEntityRepository extends JpaRepository<SampleEntity, Long> {
}
