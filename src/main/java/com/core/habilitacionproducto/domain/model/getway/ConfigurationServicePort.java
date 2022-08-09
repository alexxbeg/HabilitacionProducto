package com.core.habilitacionproducto.domain.model.getway;

import com.core.habilitacionproducto.domain.model.exception.BusinessException;
import com.core.habilitacionproducto.domain.model.ConfigurationDto;

import java.util.List;

public interface ConfigurationServicePort {

    ConfigurationDto addConfiguration (ConfigurationDto configurationDto);

    ConfigurationDto updateConfiguration (ConfigurationDto configurationDto);

    void deleteConfiguration (Long id) throws BusinessException;

    List<ConfigurationDto> getListConfigurations();

    ConfigurationDto getById (Long id) throws BusinessException;


}
