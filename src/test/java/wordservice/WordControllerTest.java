/**
 * Copyright 2018 Matt J Evans
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions andlimitations under the License.
 *
 */
package wordservice;

import org.junit.Test;
import org.springframework.data.domain.Page;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import static org.junit.Assert.assertEquals;
import static wordservice.WordController.WORD_VALUES;

public class WordControllerTest {

    private WordController controller;
    private ResponseEntity<String> word;
    private ResponseEntity<Page<Integer>> pageResponseEntity;

    @Test
    public void fetchLast() throws Exception {
        givenIHaveAController();
        whenICallFetchLast();
        thenIAmReturnedAValue();
    }

    private void givenIHaveAController() {

        controller = new WordController();
    }


    private void whenICallFetchLast() {

        word = controller.fetchRandomWord();
    }

    private void thenIAmReturnedAValue() {
        assertEquals("Status not equal to 200", HttpStatus.OK, word.getStatusCode());
        assertEquals("Value not as expected", true, WORD_VALUES.contains(word.getBody()));

    }
}