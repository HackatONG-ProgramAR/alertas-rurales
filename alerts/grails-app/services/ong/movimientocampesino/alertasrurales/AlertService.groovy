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
import ong.movimientocampesino.alertasrurales.alerts.Alert
import ong.movimientocampesino.alertasrurales.alerts.Recipient
import ong.movimientocampesino.alertasrurales.security.User

@Transactional
class AlertService {
    def mailService

    void createAlertAndSendNotifications(User emisor, String message){
        Alert alert = new Alert()
        alert.emisor = emisor
        alert.message = message
        alert.save()
        def allRecipients = Recipient.list()

        String mailTemplate = "Alerta ${emisor.lastname}, ${emisor.name}."

        allRecipients.each { Recipient recipient ->
            mailService.sendMail {
                to recipient.mail
                subject "Alerta"
                body message
//                html g.render(template:"myMailTemplate")
            }
        }

        def proc = '/usr/bin/twidge update "'+  mailTemplate + '"'.execute()
        print proc
    }
}
