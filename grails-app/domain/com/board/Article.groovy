package com.board

import com.member.User

class Article {
	
	String title
	String content
	Date dateCreated
	Date lastUpdated
	User user
	Integer hitCount
	
		

    static constraints = {
		
		title nullable : false,size:10..20
		content nullable : false,size:50..500
	
		
    }
}
