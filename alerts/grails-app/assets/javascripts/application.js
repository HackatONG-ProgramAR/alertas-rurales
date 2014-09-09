// This is a manifest file that'll be compiled into application.js.
//
// Any JavaScript file within this directory can be referenced here using a relative path.
//
// You're free to add application-wide JavaScript to this file, but it's generally better 
// to create separate JavaScript files as needed.
//
//= require jquery
//= require_tree .
//= require_self

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

if (typeof jQuery !== 'undefined') {
	(function($) {
		$('#spinner').ajaxStart(function() {
			$(this).fadeIn();
		}).ajaxStop(function() {
			$(this).fadeOut();
		});
	})(jQuery);
}
