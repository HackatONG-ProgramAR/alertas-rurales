<%@ page defaultCodec="html" %>
<div class="control-group ${invalid ? 'error' : ''}">
	<label class="control-label" for="${property}">${label}</label>
	<div>
		<%= widget %>
        <g:if test="${required}">
            <span class="required-indicator">*</span>
        </g:if>
	</div>
</div>