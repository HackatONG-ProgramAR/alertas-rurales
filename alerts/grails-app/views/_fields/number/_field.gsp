<%@ page defaultCodec="html" %>
<g:if test="${mask != null}">
    <ui:inputMask class="form-control" name="${prefix}${property}" value="${fieldValue(bean: bean, field: property)?fieldValue(bean: bean, field: property):null}" mask="${mask}" required="${required}" placeholder="${placeholder}"/>
</g:if>
<g:else>
    <input class="form-control" type="text" name="${prefix}${property}" value="${fieldValue(bean: bean, field: property)}" placeholder="${placeholder}"/>
</g:else>