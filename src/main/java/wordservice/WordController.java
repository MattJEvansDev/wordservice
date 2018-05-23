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


import org.apache.tomcat.util.codec.binary.Base64;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.Bean;
import org.springframework.http.*;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

/**
 * Created by Matt on 26/01/2018.
 */
@RestController
@EnableDiscoveryClient
@RequestMapping("/word")
public class WordController {

    public static final List<String> WORD_VALUES = Arrays.asList("Apple","Book","Chair","Donkey","Elephant","Foot");
    private static final Logger LOG = LoggerFactory.getLogger(WordController.class);

    @RequestMapping(method = RequestMethod.GET, value = "/random")
    public ResponseEntity<String> fetchRandomWord() {
        LOG.info("Getting random word");

        Random random = new Random();
        int randomIndex = random.ints(0, 6).findFirst().getAsInt();

        return new ResponseEntity<String>(WORD_VALUES.get(randomIndex), HttpStatus.OK);
    }

}
