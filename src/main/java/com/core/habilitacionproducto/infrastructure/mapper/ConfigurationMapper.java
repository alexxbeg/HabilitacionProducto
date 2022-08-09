package com.core.habilitacionproducto.infrastructure.mapper;


import com.core.habilitacionproducto.domain.model.ConfigurationDto;
import com.core.habilitacionproducto.infrastructure.entity.ConfigurationData;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper
public interface ConfigurationMapper {

    ConfigurationMapper INSTANCE = Mappers.getMapper(ConfigurationMapper.class);

    ConfigurationDto mapToConfigurationDto(ConfigurationData configurationData);

    ConfigurationData mapToConfigurationData(ConfigurationDto configurationDto);

    List<ConfigurationDto> mapToConfigurationDtoList (List<ConfigurationData> configurationDataList);

}
