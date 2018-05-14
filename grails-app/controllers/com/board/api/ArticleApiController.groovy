package com.board.api

import grails.converters.JSON
import grails.plugin.springsecurity.annotation.Secured

import com.board.Article
import com.member.User

@Secured(['permitAll'])
class ArticleApiController {

    def list() { render Article.list() as JSON } 
	
	def show() {
		def hit = Article.get(params.id)
		hit.hitCount += 1
		hit.save(true)
		render hit as JSON
		
	}
	
	def write(){
		def newArticle = new Article(title:params.title, content:params.content,hitCount:0,user:User.get(1)).save(failOnError:true)
		render newArticle as JSON
	}
	
	def update(){
		println params
		def old = Article.get(params.id)
		old.title = params.title
		old.content = params.content
		old.save()
		render old as JSON
	}
	
	def delete(){
		println params
		def old = Article.get(params.id)
		old.delete(flush:true)
		render true
	}
}
