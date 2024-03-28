<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" isELIgnored="false"%>
<%@ include file="/include/header.jsp"%>
    <div class="container mt-4">
      <h3>상품목록</h3>

      <div class="row mb-2">
<c:forEach var="dto" items="${list}">
      
        <div class="col-sm-4">
          <p class="text-end">${dto.id}</p>
          <img src="https://placehold.co/500x500" class="card-img-top" alt="..." />
          <h5 class="card-title">${dto.title} </h5>
          <p class="card-text">가격 <span>${dto.price}</span></p>
        </div>
        
</c:forEach>
      </div>

    </div>
<%@ include file="/include/section.jsp"%>
<%@ include file="/include/footer.jsp"%>