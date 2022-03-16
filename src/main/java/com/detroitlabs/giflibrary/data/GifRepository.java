package com.detroitlabs.giflibrary.data;

import com.detroitlabs.giflibrary.model.Gif;
import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;
@Component
public class GifRepository {
    private static final List<Gif> ALL_GIFS = Arrays.asList(
            new Gif("toobad", LocalDate.of(2019, 2, 23), "Erika Languirand", true),
            new Gif("exhausting", LocalDate.of(2019, 2, 23), "Jen Bloomer", false),
            new Gif("headtilt", LocalDate.of(2019, 2, 23), "Dan Newport", true),
            new Gif("corgibeg", LocalDate.of(2019, 2, 23), "Matt of Lansing", false),
            new Gif("hugemistake", LocalDate.of(2019, 2, 23), "Erika Languirand", true),
            new Gif("whatisaid", LocalDate.of(2019, 2, 23), "Dan Newport", true));

    public Gif findByName(String name) {
        for (Gif gif : ALL_GIFS) {
            if (gif.getName().equals(name)) {
                return gif;
            }
        }
        return null;
    }
}
