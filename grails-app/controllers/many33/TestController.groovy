package many33

import grails.transaction.Transactional

class TestController {
	@Transactional
	def delete(Long id) {
		User.get(id).delete()
		render "User $id deleted"
	}
}
