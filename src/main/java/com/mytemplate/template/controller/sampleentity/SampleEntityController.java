package com.mytemplate.template.controller.sampleentity;

import com.mytemplate.template.controller.AbstractController;
import com.mytemplate.template.dto.ResponseDTO;
import com.mytemplate.template.dto.sampleentity.response.SampleEntityResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RestController
@RequestMapping("/sampleentity")
public class SampleEntityController extends AbstractController {

    @GetMapping("/{sampleEntityId}")
    public ResponseDTO<SampleEntityResponse> get(@PathVariable Long sampleEntityId){
        return ok(new SampleEntityResponse(1L,"test"));
    }
}
