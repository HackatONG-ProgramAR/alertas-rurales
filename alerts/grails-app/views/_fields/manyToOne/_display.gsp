<%@ page defaultCodec="html" %>
<g:set var="propValue" value="${property.tokenize('.').inject(bean) {obj, prop -> obj."$prop" }}"/>
<ui:select id="${prefix}${property}" name="${prefix}${property}.id" optionKey="id" value='${propValue?.id}' from="${persistentProperty.referencedPropertyType.list()}" data-placeholder="${g.message(code: 'values.none')}" required="false" disabled="true"/>