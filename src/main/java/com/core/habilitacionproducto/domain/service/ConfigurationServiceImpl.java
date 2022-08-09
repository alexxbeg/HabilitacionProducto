package com.core.habilitacionproducto.domain.service;

import com.core.habilitacionproducto.domain.model.exception.BusinessException;
import com.core.habilitacionproducto.domain.model.exception.ConfigurationNotFoundException;
import com.core.habilitacionproducto.domain.model.ConfigurationDto;
import com.core.habilitacionproducto.domain.model.getway.ConfigurationPersistencePort;
import com.core.habilitacionproducto.domain.model.getway.ConfigurationServicePort;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ConfigurationServiceImpl implements ConfigurationServicePort {

    private final ConfigurationPersistencePort configurationPersistencePort;

    public ConfigurationServiceImpl(ConfigurationPersistencePort configurationPersistencePort){
        this.configurationPersistencePort = configurationPersistencePort;
    }

    @Override
    public ConfigurationDto addConfiguration(ConfigurationDto configurationDto) {
        return this.configurationPersistencePort.addConfiguration(configurationDto);
    }

    @Override
    public ConfigurationDto updateConfiguration(ConfigurationDto configurationDto) {
        return this.configurationPersistencePort.updateConfiguration(configurationDto);
    }

    @Override
    public void deleteConfiguration(Long id) throws BusinessException{
        Optional<ConfigurationDto> exisDto = Optional.ofNullable(
                this.configurationPersistencePort.getById(id)
        );
        this.configurationPersistencePort.deleteConfiguration(exisDto.orElseThrow(ConfigurationNotFoundException::new).getConfigurationId());
    }

    @Override
    public List<ConfigurationDto> getListConfigurations() {
        return this.configurationPersistencePort.getListConfigurations();
    }

    @Override
    public ConfigurationDto getById(Long id) throws BusinessException {
        Optional<ConfigurationDto> exisDto = Optional.ofNullable(
                this.configurationPersistencePort.getById(id)
        );
        return exisDto.orElseThrow(ConfigurationNotFoundException::new);
    }
}
