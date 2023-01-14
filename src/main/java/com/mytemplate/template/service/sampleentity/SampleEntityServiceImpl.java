package com.mytemplate.template.service.sampleentity;

public class SampleEntityServiceImpl implements SampleEntityService{
    @Override
    public void sampleFunction(int num) {
        System.out.println("sampleFunction method executed : " + num);
    }
}
