package com.core.habilitacionproducto.domain.model.getway;

import com.core.habilitacionproducto.domain.model.ConfigurationDto;

import java.util.List;

public interface ConfigurationPersistencePort {

    ConfigurationDto addConfiguration (ConfigurationDto configurationDto);

    ConfigurationDto updateConfiguration (ConfigurationDto configurationDto);

    void deleteConfiguration (Long id);

    List<ConfigurationDto> getListConfigurations();

    ConfigurationDto getById (Long id);
}
