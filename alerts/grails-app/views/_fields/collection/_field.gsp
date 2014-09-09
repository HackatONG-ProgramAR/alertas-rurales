<%@ page defaultCodec="html" %>
<g:if test="${Enum.class.isAssignableFrom(persistentProperty.referencedPropertyType)}">
    <g:set var="from" value="${persistentProperty.referencedPropertyType.values()}"/>
    <g:set var="keys" value="${persistentProperty.referencedPropertyType.values()}"/>
    <ui:select name="${prefix}${property}" keys="${keys}" value="${value}" from="${from}" multiple="true" data-placeholder="Seleccione un valor" required="${required}"/>
</g:if>
<g:else>
    <g:set var="from" value="${persistentProperty.referencedPropertyType.list()}"/>
    <ui:select name="${prefix}${property}" optionKey="id" value="${value}" from="${from}" multiple="true" data-placeholder="Seleccione un valor" required="${required}"/>
</g:else>
