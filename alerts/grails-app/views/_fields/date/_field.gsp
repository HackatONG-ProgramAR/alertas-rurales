<%@ page defaultCodec="html" %>
<input class="datepicker" name="${prefix}${property}" value="${formatDate(date: value, format: 'dd/MM/yyyy')}" required="${required}" data-date-format="dd/mm/yyyy"/>