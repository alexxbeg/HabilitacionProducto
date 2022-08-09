package com.core.habilitacionproducto.application.mapper;

import com.core.habilitacionproducto.infrastructure.entrypoints.model.request.ConfigurationRequest;
import com.core.habilitacionproducto.infrastructure.entrypoints.model.response.ConfigurationResponse;
import com.core.habilitacionproducto.domain.model.ConfigurationDto;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper
public interface ConfigurationRestMapper {

    ConfigurationRestMapper INSTANCE = Mappers.getMapper(ConfigurationRestMapper.class);

    ConfigurationDto mapToConfigurationDto(ConfigurationRequest configurationRequest);

    ConfigurationResponse mapToConfigurationResponse(ConfigurationDto configurationDto);

    List<ConfigurationResponse> mapToConfigurationResponseList (List<ConfigurationDto> configurationDtoList);
}
