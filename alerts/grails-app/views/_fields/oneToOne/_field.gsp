<%@ page defaultCodec="html" %>
<ui:select id="${prefix}${property}" name="${prefix}${property}.id" optionKey="id" value="${value?.id}" from="${persistentProperty.referencedPropertyType.list()}" data-placeholder="Seleccione un valor" required="${required}" width="300"/>
