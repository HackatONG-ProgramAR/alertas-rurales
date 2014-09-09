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

package ong.movimientocampesino.alertasrurales.alerts

import grails.plugin.springsecurity.annotation.Secured
import ong.movimientocampesino.alertasrurales.security.User

@Secured(["IS_AUTHENTICATED_ANONYMOUSLY"])
class AlertProcessorController {
    def alertService
    def userService

    def saveAlert() {
        if(params.hash == "123"){
            try {
                String phoneNumber = params.phone_number
                String message = params.message

                User emisorUser = userService.findUserByPhone(phoneNumber)
                alertService.createAlertAndSendNotifications(emisorUser, message)
                render "ok"
            }
            catch (Exception ex){
                render "failed"
            }
        }
        else
            render "failed"
    }
}
