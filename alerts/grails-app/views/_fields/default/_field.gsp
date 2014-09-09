<%@ page defaultCodec="html" %>
<div class="control-group ${invalid ? 'error' : ''}">
	<label class="control-label span2" for="${property}">${label}</label>
	<div class="span10">
		<%= widget %>
        <g:if test="${required}">
            <span>*</span>
        </g:if>
	</div>
</div>