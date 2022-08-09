package com.core.habilitacionproducto.infrastructure.adapters;


import com.core.habilitacionproducto.domain.model.ConfigurationDto;
import com.core.habilitacionproducto.domain.model.getway.ConfigurationPersistencePort;
import com.core.habilitacionproducto.infrastructure.entity.ConfigurationData;
import com.core.habilitacionproducto.infrastructure.mapper.ConfigurationMapper;
import com.core.habilitacionproducto.infrastructure.repository.ConfigurationRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ConfigurationJpaAdapter implements ConfigurationPersistencePort {

    private final ConfigurationRepository configurationRepository;

    public ConfigurationJpaAdapter(ConfigurationRepository configurationRepository){
        this.configurationRepository = configurationRepository;
    }

    @Override
    public ConfigurationDto addConfiguration(ConfigurationDto configurationDto) {
        ConfigurationData configurationData = ConfigurationMapper.INSTANCE.mapToConfigurationData(configurationDto);
        ConfigurationData configurationDataSaved = this.configurationRepository.save(configurationData);
        return ConfigurationMapper.INSTANCE.mapToConfigurationDto(configurationDataSaved);
    }

    @Override
    public ConfigurationDto updateConfiguration(ConfigurationDto configurationDto) {
        return this.addConfiguration(configurationDto);
    }

    @Override
    public void deleteConfiguration(Long id) {
        this.configurationRepository.deleteById(id);
    }

    @Override
    public List<ConfigurationDto> getListConfigurations() {
        return ConfigurationMapper.INSTANCE.mapToConfigurationDtoList(this.configurationRepository.findAll());
    }

    @Override
    public ConfigurationDto getById(Long id) {
        return this.configurationRepository.findById(id)
                .map(ConfigurationMapper.INSTANCE::mapToConfigurationDto)
                .orElse(null);
    }
}
