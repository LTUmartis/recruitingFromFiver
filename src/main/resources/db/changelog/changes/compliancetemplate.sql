-- liquibase formatted sql

  -- changeset Creator1:1
CREATE TABLE IF NOT EXISTS compliance_templates(
    id INT NOT NULL PRIMARY KEY,
    name VARCHAR(100) NOT NULL,
    description TEXT,
    start_date DATE NOT NULL,
    end_date DATE NOT NULL,
    is_repeatable BOOLEAN NOT NULL DEFAULT false,
    reapeat_interval INT,
    compliance_node_id INT NOT NULL,
    createdBy VARCHAR(100) NOT NULL,
    createdOn DATE NOT NULL,
    updatedBy VARCHAR(100),
    updatedOn DATE,
    deleted BOOLEAN NOT NULL DEFAULT false,
    deletedBy VARCHAR(100),
    deletedOn DATE
    );
