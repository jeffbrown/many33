package many33

class BootStrap {

    def init = { servletContext ->
		def user1 = new User(name: 'User 1').save()
		new User(name: 'User 2', relationships: [new Relationship(related: user1)]).save() 	
    }
    def destroy = {
    }
}
