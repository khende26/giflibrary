package com.detroitlabs.giflibrary.data;

import com.detroitlabs.giflibrary.model.Gif;
import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
@Component
public class GifRepository {
    private static final List<Gif> ALL_GIFS = Arrays.asList(
            new Gif("toobad", LocalDate.of(2019, 2, 23), "Erika Languirand", true, 458),
            new Gif("exhausting", LocalDate.of(2019, 2, 21), "Jen Bloomer", false, 459),
            new Gif("headtilt", LocalDate.of(2019, 2, 20), "Dan Newport", true, 457),
            new Gif("corgibeg", LocalDate.of(2019, 2, 19), "Matt of Lansing", false, 457),
            new Gif("hugemistake", LocalDate.of(2019, 2, 18), "Erika Languirand", true, 458),
            new Gif("whatisaid", LocalDate.of(2019, 2, 22), "Dan Newport", true, 459));

    public Gif findByName(String name) {
        for (Gif gif : ALL_GIFS) {
            if (gif.getName().equals(name)) {
                return gif;
            }
        }
        return null;
    }

    public List<Gif> findById(int id) {
        List<Gif> gifsByCategory = new ArrayList<>();
        for (Gif gif : ALL_GIFS) {
            if (gif.getId() == id) {
                gifsByCategory.add(gif);
            }
        }
            return gifsByCategory;
            }
        }








