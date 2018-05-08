import com.member.Role
import com.member.User
import com.member.UserRole

class BootStrap {

    def init = { servletContext ->
		def adminRole = new Role(authority: 'ROLE_ADMIN').save(flush: true)     // 관리자 권한 생성
		
		def userRole = new Role(authority: 'ROLE_USER').save(flush: true)       // 유저 권한 생성
		def testUser = new User(username: 'test', password: 'test')

		testUser.save(flush: true)                                              // 테스트 유저 생성

		UserRole.create testUser, adminRole, true                               // 테스트 계정 USER 권한 부여
		
		
		
    }
    def destroy = {
    }
}
