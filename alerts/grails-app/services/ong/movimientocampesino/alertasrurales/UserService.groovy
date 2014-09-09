/*
SMS Alertas rurales
===============

## Contributors

* Daniel Gerbaudo ([@dgerbaudo](http://twitter.com/dgerbaudo))
* Ricardo Vilella ([@VilellaRicardo](http://twitter.com/VilellaRicardo))
* Gaston Calderon ([@Delmontetupido](https://twitter.com/Delmontetupido))
* Martin Caballero ([@mpccolorado](http://twitter.com/mpccolorado))
* Silvia Marquez ([@pipimarquez](https://twitter.com/PipiMarquez))
* Lucia Guadagno ([@luciguadagno](https://twitter.com/luciguadagno))
* Lucas Muñoz ([@lucas_martin19](https://twitter.com/lucas_martin19))

## License

MIT License.
 */

package ong.movimientocampesino.alertasrurales

import grails.transaction.Transactional
import ong.movimientocampesino.alertasrurales.security.User

@Transactional
class UserService {
    User findUserByPhone(String phoneNumber) {
        def users = User.createCriteria().list(){
            phones{
                eq("number", phoneNumber)
            }
            eq("verified", true)
            maxResults(1)
        }
        if(users.size() == 0)
            throw new RuntimeException("Usuario no encontrado")

        return users[0]
    }
}
