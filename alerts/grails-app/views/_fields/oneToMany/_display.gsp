<%@ page defaultCodec="html" %>
<g:set var="propValue" value="${property.tokenize('.').inject(bean) {obj, prop -> obj."$prop" }}"/>
<ui:select name="${prefix}${property}" optionKey="id" value="${propValue*.id}" from="${persistentProperty.referencedPropertyType.list()}" multiple="true" placeholder="${g.message(code: 'values.none')}" required="false" disabled="true"/>