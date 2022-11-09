package com.example.demo.ComplianceTemplate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/api/v1/compliancetemplate")
public class ComplianceTemplateController {

    private ComplianceTemplateService complianceTemplateService;

    @Autowired
    public ComplianceTemplateController(ComplianceTemplateService complianceService){
        this.complianceTemplateService=complianceService;
    }

    //POSTGRESQL TABLE IS ALREADY CREATED AT resources/d/changelog/changes!

//  Create new post method endpoint /api/complience-templates, Response must have a new template id
//  Create new get method endpoint /api/complience-templates: return all ComplianceTemplates

//  ADD VALIDATIONS TO PROJECT:
//  If name is less than 3 characters long =>
//
//  Error message: Template name must be at least 3 characters long
//
//  If end_date is less than start_date  (For example: end_date 2022-11-09, start_date: 2022-11-08) =>
//
//  Error message: Template end date can't be earlier than start date


}
