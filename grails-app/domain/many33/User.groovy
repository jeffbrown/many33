package many33

class User {
	String name
	
	static hasMany = [relationships: Relationship]
	static mappedBy = [relationships: 'user']
	
	static mapping = { table 'table_user' }
}
