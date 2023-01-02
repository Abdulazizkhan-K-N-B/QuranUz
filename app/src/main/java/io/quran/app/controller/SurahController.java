package io.quran.app.controller;

import io.quran.app.payload.api.ApiResult;
import io.quran.app.payload.surah.SurahDetailDto;
import io.quran.app.payload.surah.SurahWithName;
import io.quran.app.service.SurahDetailService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1/surah")
public class SurahController {

    private final SurahDetailService surahDetailService;

    public SurahController(SurahDetailService surahDetailService) {
        this.surahDetailService = surahDetailService;
    }

    @GetMapping("/{surahId}/{languageId}")
    public ApiResult<SurahDetailDto> getSurahById(@PathVariable Integer surahId,
                                                  @PathVariable Integer languageId){
        ApiResult<SurahDetailDto> result = surahDetailService.getSurahDetailById(surahId, languageId);
        return result;
    }

    @GetMapping("/{languageCode}")
    public ApiResult<?> getAllSurahs(@PathVariable String languageCode){
        ApiResult<?> result = surahDetailService.getSurahs(languageCode);
        return result;
    }

}
