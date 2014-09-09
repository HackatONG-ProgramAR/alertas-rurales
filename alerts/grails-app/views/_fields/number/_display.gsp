<%@ page defaultCodec="html" %>
<g:set var="propValue" value="${property.tokenize('.').inject(bean) {obj, prop -> obj."$prop" }}"/>
<span name="${prefix}${property}" class="uneditable-input">${propValue}</span>