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

package ong.movimientocampesino.alertasrurales.security

class Role {

	String authority

	static mapping = {
		cache true
	}

	static constraints = {
		authority blank: false, unique: true
	}

    String toString(){
        authority
    }
}
