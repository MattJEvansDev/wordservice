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