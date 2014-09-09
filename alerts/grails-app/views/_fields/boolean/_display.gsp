<%@ page defaultCodec="html" %>
<g:set var="propValue" value="${property.tokenize('.').inject(bean) {obj, prop -> obj."$prop" }}"/>
<input name="${prefix}${property}" type="checkbox" disabled="true" <g:if test="${propValue == true}">checked="true"</g:if> />
