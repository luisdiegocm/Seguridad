package com.example

import grails.test.mixin.TestFor
import spock.lang.Specification

/**
 * See the API for {@link grails.test.mixin.web.ControllerUnitTestMixin} for usage instructions
 */
@TestFor(UsuarioController)
class UsuarioControllerSpec extends Specification {

    def index() { 
		render "Hello World"
	}
	def hi() { 
		render "How are you?"
	}
}
