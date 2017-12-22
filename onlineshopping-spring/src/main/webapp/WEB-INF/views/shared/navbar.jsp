<script>
		window.userRole = '${userModel.role}';
</script>

<nav class="navbar navbar-expand-lg navbar-dark bg-dark fixed-top">
      <div class="container">
        <a class="navbar-brand" href="${contextRoot}/home">Online Shopping</a>
        <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarResponsive" aria-controls="navbarResponsive" aria-expanded="false" aria-label="Toggle navigation">
          <span class="navbar-toggler-icon"></span>
        </button>
        <div class="collapse navbar-collapse" id="navbarResponsive">
          <ul class="navbar-nav ml-auto">
	           <li class="nav-item active">
	             <a class="nav-link" href="${contextRoot}/home">Home
	               <span class="sr-only">(current)</span>
	             </a>
	           </li>
	           <li id="about">
	            	<a href="${contextRoot}/about">About
	            		<span class="sr-only">(current)</span>
	            	</a>
	           </li>
	            
	           <li id="listProducts">
	           		<a href="${contextRoot}/show/all/products">View Products
	               		<span class="sr-only">(current)</span>
	               	</a>
	           </li>
	            
	           <security:authorize access="hasAuthority('ADMIN')">
		           	<li id="manageProduct">
		            	<a href="${contextRoot}/manage/product">Manage Product
		                	<span class="sr-only">(current)</span>
		                </a>
		            </li>					
				</security:authorize>
	            
	            <li class="nav-item">
	              	<a class="nav-link" href="#">Services
	              		<span class="sr-only">(current)</span>
	              	</a>
	            </li>
	            
	           <li id="contact">
	              	<a href="${contextRoot}/contact">Contact</a>
	           </li>
          	</ul>
        </div>
      </div>
    </nav>