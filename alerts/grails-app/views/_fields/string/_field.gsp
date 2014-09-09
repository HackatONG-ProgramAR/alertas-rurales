<%@ page defaultCodec="html" %>
<g:if test="${mask != null}">
    <ui:inputMask class="form-control" name="${prefix}${property}" value="${value?value:null}" mask="${mask}" required="${required}" placeholder="${placeholder}"/>
</g:if>
<g:else>
    <input type="text" name="${prefix}${property}" value="${value}" placeholder="${placeholder}" class="form-control"/>
</g:else>
