<%@ page defaultCodec="html" %>
<g:if test="${Enum.class.isAssignableFrom(persistentProperty.referencedPropertyType)}">
    <g:set var="from" value="${persistentProperty.referencedPropertyType.values()}"/>
    <g:set var="keys" value="${persistentProperty.referencedPropertyType.values()}"/>
    <ui:select name="${prefix}${property}" keys="${keys}" value="${value}" from="${from}" multiple="true" data-placeholder="Seleccione un valor" required="${required}" disabled="true"/>
</g:if>
<g:else>
    <g:set var="from" value="${persistentProperty.referencedPropertyType.list()}"/>

    <g:set var="propValue" value="${property.tokenize('.').inject(bean) {obj, prop -> obj."$prop" }}"/>
    <ui:select name="${prefix}${property}" optionKey="id" value="${propValue*.id}" from="${from}" multiple="true" placeholder="${g.message(code: 'values.none')}" required="false" disabled="true"/>
</g:else>