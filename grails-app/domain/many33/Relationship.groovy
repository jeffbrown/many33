package many33
    
	class Relationship implements Serializable {
		User user
		User related

		static belongsTo = [ user: User, related: User ]

		static mapping = {
			table 'table_relationship'
			id composite: ['user', 'related']
			version false
		}
	}
