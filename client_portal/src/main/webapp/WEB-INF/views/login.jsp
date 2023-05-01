<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page session="false"%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="UTF-8">
<%@ include file="common.jsp"%>
<link href="${pageContext.request.contextPath}/resources/css/login.css" rel="stylesheet">
<script src="${pageContext.request.contextPath}/resources/js/login.js"></script>
</head>
<body>

	<section class="vh-100">
		<div class="container-fluid h-custom">
			<div class="row d-flex justify-content-center align-items-center h-100">
				
				<div class="col-md-9 col-md-4 col-xl-5">
					<img src="https://mdbcdn.b-cdn.net/img/Photos/new-templates/bootstrap-login-form/draw2.webp" class="img-fluid" alt="Sample image">
				</div>

				<div class="col-md-8 col-md-8 col-xl-4 offset-xl-1 shadow p-3 mb-5 bg-white rounded">

					<div class="d-flex flex-row align-items-center justify-content-center justify-content-lg-start">
						<h1 class="text-uppercase fw-bold">Note Assets <i class="fa fa-book"></i></h1>
					</div>

					<div class="divider d-flex align-items-center my-4">
						<!-- <p class="text-center fw-bold mx-3 mb-0"></p> -->
					</div>

					<div class="btn-toolbar" role="toolbar" aria-label="Toolbar with button groups">

						<div class="btn-group-sm me-2" role="group" aria-label="First group">
							<button type="button" class="btn btn-info" onclick="hide(1)"><i class="fa fa-sign-in"></i> Sign In</button>
						</div>

						<div class="btn-group-sm" role="group" aria-label="Second group">
							<button type="button" class="btn btn-info" onclick="hide(2)"><i class="fa fa-plus"></i> Sign Up</button>
						</div>

					</div>

					<div id="login" class="pt-3">
					
						<form>
							<div class="row">
							<!-- User input -->
							<div class="form-outline mb-3 col-md-12">
								<label class="form-label" for="form3Example3"><i class="fa fa-user"></i> User Name</label>
								<input type="email" id="form3Example3" class="form-control form-control-sm" placeholder="Enter User Name" />
							</div>

							<!-- Password input -->
							<div class="form-outline mb-2 col-md-12">
								<label class="form-label" for="form3Example4"><i class="fa fa-unlock"></i> Password</label> 
								<input type="password" id="form3Example4" class="form-control form-control-sm" placeholder="Must be 8-20 characters long" />
							</div>

							<div class="d-flex justify-content-between align-items-center col-md-12">
								<p class="text-body small fw-bold float-start forget"><span style="color:#00b7eb"><i class="fa fa-user-secret"></i> Forgot User Name ?</span></p> 
								<p class="text-body small fw-bold float-end forget"><span style="color:#00b7eb"><i class="fa fa-key"></i> Forgot Password ?</span></p>
							</div>

							<div class="text-center text-md-center mt-1 pt-2 col-md-12">
								<button type="button" class="btn btn-primary btn-sm w-25">Submit</button>
							</div>
						
						</div>
						</form>
						
					</div>

					<div id="register" class="pt-4">
						<form>
							<div class="row">

							<div class="form-outline mb-2 col-md-4">
								<label class="form-label" for="form3Example3"><i class="fa fa-user-plus"></i> Name</label>
								<input type="email" id="form3Example3" class="form-control form-control-sm" placeholder="Enter Name" /> 
							</div>

							<div class="form-outline mb-2 col-md-4">
								<label class="form-label" for="form3Example3"><i class="fa fa-envelope"></i> Email</label>
								<input type="email" id="form3Example3" class="form-control form-control-sm" placeholder="Enter Email" /> 
							</div>
							
							<div class="form-outline mb-2 col-md-4">
								<label class="form-label" for="form3Example3"><i class="fa fa-mobile"></i> Mobile No</label>
								<input type="email" id="form3Example3" class="form-control form-control-sm" placeholder="Enter Mobile No" /> 
							</div>

							<div class="form-outline mb-2 col-md-4">
								<label class="form-label" for="form3Example3"><i class="fa fa-calendar"></i> DOB</label>
								 <input type="text" class="form-control form-control-sm"  placeholder="dd-mm-yyyy" id="dob">
							</div>
							
							<div class="form-outline mb-2 col-md-4">
							 	<label class="form-label" for="form3Example3"><i class="fa fa-venus-mars"></i> Gender</label>
								<select class="form-select form-select-sm" aria-label="Default select example">
  									<option disabled selected>---- select ----</option>
  									<option value="M">Male</option>
  									<option value="F">FeMale</option>
  									<option value="T">TransGender</option>
								</select>
							</div>
							
								<!-- User input -->
							<div class="form-outline mb-2 col-md-4">
								<label class="form-label" for="form3Example3"><i class="fa fa-user"></i> User Name</label>
								<input type="email" id="form3Example3" class="form-control form-control-sm" placeholder="Enter User Name" /> 
							</div>

							<div class="form-outline mb-2 col-md-4">
								<label class="form-label" for="form3Example3"><i class="fa fa-unlock-alt"></i> Password</label>
								<input type="email" id="form3Example3" class="form-control form-control-sm" placeholder="Enter Password" /> 
							</div>
							
							<div class="form-outline mb-1 col-md-4">
								<label class="form-label" for="form3Example3"><i class="fa fa-unlock-alt"></i> Re-Password</label>
								<input type="email" id="form3Example3" class="form-control form-control-sm" placeholder="Enter Confirm Password" /> 
							</div>
							
							<div class="text-center text-md-center mt-3 pt-2 col-md-12">
								<button type="button" class="btn btn-primary btn-sm w-25">Get Started</button>
							</div>
							
							</div>
						</form>
					</div>

				</div>
			</div>
		</div>

		<div>
			<%@ include file="footer.jsp"%>
		</div>
	</section>

</body>
</html>
