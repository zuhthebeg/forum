package com.board



import static org.springframework.http.HttpStatus.*
import grails.plugin.springsecurity.annotation.Secured
import grails.transaction.Transactional
@Secured(['permitAll'])
@Transactional(readOnly = true)
class ArticleController {
	static scaffold = true  // scaffold = Article
}
