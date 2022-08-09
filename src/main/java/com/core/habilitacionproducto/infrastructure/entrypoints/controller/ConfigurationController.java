package com.core.habilitacionproducto.infrastructure.entrypoints.controller;


import com.core.habilitacionproducto.application.mapper.ConfigurationRestMapper;
import com.core.habilitacionproducto.infrastructure.entrypoints.model.request.ConfigurationRequest;
import com.core.habilitacionproducto.infrastructure.entrypoints.model.response.ConfigurationResponse;
import com.core.habilitacionproducto.domain.model.ConfigurationDto;
import com.core.habilitacionproducto.domain.model.getway.ConfigurationServicePort;

import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.ws.rs.Produces;

@Produces("Application/Json")
@RestController
@RequiredArgsConstructor
public class ConfigurationController {

    private final ConfigurationServicePort configurationServicePort;

    @PostMapping(path = "/save-configuration")
    public ResponseEntity<ConfigurationResponse> addConfiguration(@RequestBody ConfigurationRequest configurationRequest) {
        ConfigurationDto configurationDto = ConfigurationRestMapper.INSTANCE.mapToConfigurationDto(configurationRequest);
        ConfigurationResponse configurationResponse = ConfigurationRestMapper.INSTANCE.mapToConfigurationResponse(
                this.configurationServicePort.addConfiguration(configurationDto)
        );
        return ResponseEntity.status(HttpStatus.CREATED)
                .body(configurationResponse);
    }

}
