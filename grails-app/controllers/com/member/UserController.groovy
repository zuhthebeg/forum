package com.member

import grails.plugin.springsecurity.annotation.Secured;

@Secured(['permitAll']) 
class UserController {

	static scaffold = true
    //def index() {render 1 }
}
