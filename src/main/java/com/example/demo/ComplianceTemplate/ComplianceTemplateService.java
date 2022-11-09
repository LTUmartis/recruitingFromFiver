package com.example.demo.ComplianceTemplate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ComplianceTemplateService {

  private final ComplianceTemplateRepository templateRepository;

  @Autowired
  public ComplianceTemplateService(ComplianceTemplateRepository templateRepository){
    this.templateRepository=templateRepository;
  }


}
