package com.example.demo.ComplianceTemplate;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.sql.Date;
import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table(name = "book")
public class ComplianceTemplate {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private int id;
  private String name;
  private String description;
  private Date start_date;
  private Date end_date;
  private boolean is_repeatable=false;
  private int repeat_interval;
  private int compliance_node_id;
  private String createdBy;
  private LocalDateTime createdOn;
  private String updatedBy;
  private LocalDateTime updatedOn;
  private boolean deleted=false;
  private String deletedBy;
  private LocalDateTime deletedOn;

}
