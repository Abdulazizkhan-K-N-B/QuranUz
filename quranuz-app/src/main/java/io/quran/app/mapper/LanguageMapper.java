package io.quran.app.mapper;

import io.quran.app.payload.LanguageDto;
import io.quran.db.entity.Language;
import org.mapstruct.Mapper;
import org.springframework.stereotype.Component;
import java.util.List;

@Component
@Mapper(componentModel = "spring")
public interface LanguageMapper {

    LanguageDto toLanguageDto(Language source);

    Language toLanguage(LanguageDto source);

    List<LanguageDto> toDtoList(List<Language> entityList);
}
