package com.core.habilitacionproducto.infrastructure.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;


@Table(name = "Tbl_Configuration")
@Data
@Entity
@NoArgsConstructor
@Builder(toBuilder = true)
@AllArgsConstructor
public class ConfigurationData {

    @Id
    @Column(name = "CONFIGURATION_ID")
    private Long configurationId;

    @Column(name = "NAME", nullable = false, length = 60)
    private String nameConfiguration;

    @Column(name = "STATUS", nullable = false, length = 3)
    private String statusConfig;

    @Column(name = "PARENT_CONFIGURATION_ID", nullable = false, length = 3)
    private String parentConfigurationId;

}
