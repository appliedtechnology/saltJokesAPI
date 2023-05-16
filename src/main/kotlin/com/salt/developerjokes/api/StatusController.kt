package com.salt.developerjokes.api

import org.springframework.http.HttpStatus
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/")
class StatusController {

  @RequestMapping(method = [RequestMethod.HEAD])
  @ResponseStatus(HttpStatus.OK)
  fun status() {
    return
  }
}
