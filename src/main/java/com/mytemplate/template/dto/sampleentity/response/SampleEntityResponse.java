package com.mytemplate.template.dto.sampleentity.response;

import com.mytemplate.template.domain.sampleentity.SampleEntity;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class SampleEntityResponse {

    private Long id;
    private String name;

    public static SampleEntityResponse fromSampleEntity(SampleEntity sampleEntity){
        return new SampleEntityResponse(
                sampleEntity.getSampleEntityId(),
                sampleEntity.getName()
        );
    }

}