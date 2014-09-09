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

import ong.movimientocampesino.alertasrurales.alerts.Phone
import ong.movimientocampesino.alertasrurales.alerts.Recipient
import ong.movimientocampesino.alertasrurales.location.City
import ong.movimientocampesino.alertasrurales.location.Province
import ong.movimientocampesino.alertasrurales.security.Role
import ong.movimientocampesino.alertasrurales.security.User
import ong.movimientocampesino.alertasrurales.security.UserRole

class BootStrap {

    def init = { servletContext ->
        if(User.count() == 0){
            Province cordoba = new Province(name: "Córdoba")
            City villaMaria = new City(name: "Villa María")
            cordoba.addToCities(villaMaria)
            cordoba.save(flush: true, failOnError: true)

            Recipient empresa1 = new Recipient(name: "Empresa 1", mail: "mpccolorado@gmail.com").save(failOnError: true)

            Role rolUsuario = new Role(authority: "ROLE_USUARIO")
            Role rolAdmin = new Role(authority: "ROLE_ADMIN")
            rolUsuario.save(flush: true, failOnError: true)
            rolAdmin.save(flush: true, failOnError: true)
            User usuarioAdmin = new User(username: "admin", password: "132.456*")
            usuarioAdmin.save(flush: true, failOnError: true)
            new UserRole(user: usuarioAdmin, role: rolAdmin).save(flush: true, failOnError: true)
            User usuarioDanielCampesino = new User(username: "daniel",
                    password: "daniel", name: "Daniel", lastname: "Gerbaudo", latitude: 212311, longitude: 212122, city: villaMaria).save(flush: true, failOnError: true)
            Phone danielPhone = new Phone(number: "+5493536573003").save(flush: true, failOnError: true)
            usuarioDanielCampesino.addToPhones(danielPhone)
            usuarioDanielCampesino.save(flush: true, failOnError: true)
            new UserRole(user: usuarioDanielCampesino, role: rolUsuario).save(flush: true, failOnError: true)
        }
    }
    def destroy = {
    }
}
