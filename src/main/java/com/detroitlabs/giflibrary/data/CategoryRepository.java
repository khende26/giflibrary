package com.detroitlabs.giflibrary.data;

import com.detroitlabs.giflibrary.model.Category;
import com.detroitlabs.giflibrary.model.Gif;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;
@Component
public class CategoryRepository {
    private static final List<Category> ALL_CATEGORIES = Arrays.asList(
            new Category(457, "animals"),
            new Category(458, "men"),
            new Category(459, "women"));




    public Category findById(int id) {
        for (Category category : ALL_CATEGORIES) {
            if (category.getId() == id) {
            return category;
            }
        }
        return null;
    }
    public List<Category> getAllCategories() {
        return ALL_CATEGORIES;

        }
    }
