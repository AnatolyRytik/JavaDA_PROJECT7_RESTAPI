package com.nnk.springboot.domain;

import com.nnk.springboot.dto.RuleNameDto;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.RequiredArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name = "rulename")
@Data
@AllArgsConstructor
@RequiredArgsConstructor
public class RuleName {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "Id")
    private int id;

    @Column(name = "name")
    private String name;

    @Column(name = "description")
    private String description;

    @Column(name = "json")
    private String json;

    @Column(name = "template")
    private String template;

    @Column(name = "sqlstr")
    private String sqlStr;

    @Column(name = "sqlpart")
    private String sqlPart;

    public RuleName(RuleNameDto ruleNameDto) {
        this.name = ruleNameDto.getName();
        this.description = ruleNameDto.getDescription();
        this.json = ruleNameDto.getJson();
        this.template = ruleNameDto.getTemplate();
        this.sqlStr = ruleNameDto.getSqlStr();
        this.sqlPart = ruleNameDto.getSqlPart();
    }
}
