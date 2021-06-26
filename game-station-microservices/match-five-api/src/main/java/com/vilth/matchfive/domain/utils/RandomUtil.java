package com.vilth.matchfive.domain.utils;

import java.util.Collection;
import java.util.Random;

public class RandomUtil {

    private static final Random random = new Random();

    public static int randomId(Collection<?> list) {
        return random.nextInt(list.size());
    }
}
