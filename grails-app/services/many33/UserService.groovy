package many33

import grails.gorm.services.Service

@Service(User)
interface UserService {
    
    void delete(Serializable id)
}
