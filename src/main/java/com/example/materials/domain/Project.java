package com.example.materials.domain;

import lombok.Data;
import tk.mybatis.mapper.annotation.KeySql;

import javax.persistence.Id;

@Data
public class Project {
    @Id
    @KeySql(useGeneratedKeys = true)
    private Integer id;
    private String blocname;
    private String companyname;
    private String projectbranchname;
    private String projectname;
    private String code;
    private String retendernum;
    private String year;
}
