package com.supportportal.resource;

import com.supportportal.exception.ExceptionHandling;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = {"/"})
public class BaseResource extends ExceptionHandling {


}
