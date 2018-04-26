package many33


class TestController {
    
    UserService userService
    
	def delete(Long id) {
		userService.delete(id)
		render "User $id deleted"
	}
}
