package io.quran.app.payload;

import com.fasterxml.jackson.annotation.JsonInclude;
import io.quran.app.payload.template.BaseDto;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
public class SurahDto extends BaseDto {
    private String name;
    private String uzbName;
    private String kirilName;
    private String separatorArabic;
    private Integer verseCount;
    private Integer orderNumber;
    private Long milliseconds;

    public SurahDto(String uzbName, String kirilName) {
        this.uzbName = uzbName;
        this.kirilName = kirilName;
    }
}