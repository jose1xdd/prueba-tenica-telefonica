package com.prueba.telefofica.config;

import org.mapstruct.CollectionMappingStrategy;
import org.mapstruct.InjectionStrategy;
import org.mapstruct.MapperConfig;
import org.mapstruct.NullValueCheckStrategy;

@MapperConfig(nullValueCheckStrategy = NullValueCheckStrategy.ALWAYS, collectionMappingStrategy = CollectionMappingStrategy.SETTER_PREFERRED,
    injectionStrategy = InjectionStrategy.CONSTRUCTOR, componentModel = "spring")
public class MapStructConfig {
}
