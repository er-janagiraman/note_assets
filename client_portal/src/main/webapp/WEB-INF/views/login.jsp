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
	<!-- Section: Design Block -->
	<section class="background-radial-gradient overflow-hidden vh-100">

		<div
			class="container px-4 py-5 px-md-5 text-center text-lg-start my-5 position-relative">
			<div class="row gx-lg-5 align-items-center mb-5">
				<div class="col-lg-6 mb-5 mb-lg-0" style="z-index: 10">
					<h1 class="my-5 display-5 fw-bold ls-tight" style="color: hsl(218, 81%, 95%)">Scribe Life<br /> 
					<span style="color: hsl(218, 81%, 75%)">Your Personal Diary Companion</span>
					</h1>
					<p class="mb-4 opacity-70" style="color: hsl(218, 81%, 85%)">
						ScribeLife is your trusted companion for capturing every aspect of
						your life through handwritten notes in a digital diary. This
						unique app blends the convenience of technology with the personal
						touch of traditional journaling. With ScribeLife, you can
						effortlessly jot down your thoughts, experiences, and emotions,
						just like writing in a diary. Whether it's recording daily
						musings, documenting significant events, or reflecting on personal
						growth, ScribeLife provides a safe and private space for your
						introspection. Experience the joy of authentic, human-written
						notes with ScribeLife and create a timeless record of your life's
						journey.</p>
				</div>

				<div class="col-lg-6 mb-5 mb-lg-0 position-relative">
					<div id="radius-shape-1" class="position-absolute rounded-circle shadow-5-strong"></div>
					<div id="radius-shape-2" class="position-absolute shadow-5-strong"></div>

					<div class="card bg-glass">
						<div class="card-body px-4 py-5 px-md-5">

							<div class="btn-toolbar mb-4" role="toolbar" aria-label="Toolbar with button groups">
								<div class="btn-group me-2" role="group" aria-label="First group">
									<button type="button" class="btn btn-light" onclick="hide(1)">Sign In</button>
								</div>

								<div class="btn-group" role="group" aria-label="Second group">
									<button type="button" class="btn btn-light" onclick="hide(2)">Sign Up</button>
								</div>
							</div>

							<div id="login">
								<form>
									<div class="row">
										<!-- User Name input -->
										<div class="form-outline mb-3 col-md-12">
											<label class="form-label fw-bold float-start" for="form3Example3"><i class="fa fa-user"></i> User Name</label> 
											<input type="text" id="username" class="form-control form-control-sm" placeholder="Enter User Name" />
										</div>

										<!-- Password input -->
										<div class="form-outline mb-2 col-md-12">
											<label class="form-label fw-bold float-start" for="form3Example4"><i class="fa fa-unlock"></i> Password</label> 
											<input type="password" id="password" class="form-control form-control-sm" placeholder="Must be 8-20 characters long" />
										</div>

										<div class="d-flex justify-content-between align-items-center col-md-12">
											<p class="text-body small fw-bold float-start forget">
												<span style="color: #00b7eb"><i class="fa fa-user-secret"></i> Forgot User Name ?</span>
											</p>
											<p class="text-body small fw-bold float-end forget">
												<span style="color: #00b7eb"><i class="fa fa-key"></i> Forgot Password ?</span>
											</p>
										</div>

										<div class="text-center text-md-center mt-1 pt-2 col-md-12">
											<button type="button" class="btn btn-primary btn-sm w-25" onclick="submitLogin()" >Submit</button>
										</div>

									</div>
								</form>
							</div>

							<div id="register">
								<form>
									<div class="row">
										<!-- Name input -->
										<div class="form-outline mb-2 col-md-4">
											<label class="form-label fw-bold float-start" for="form3Example3"><i class="fa fa-user-plus"></i> Name</label> 
											<input type="text" id="form3Example3" class="form-control form-control-sm" placeholder="Enter Name" />
										</div>
										<!-- Email input -->
										<div class="form-outline mb-2 col-md-4">
											<label class="form-label fw-bold float-start" for="form3Example3"><i class="fa fa-envelope"></i> Email</label> 
											<input type="email" id="form3Example3" class="form-control form-control-sm" placeholder="Enter Email" />
										</div>
										<!-- Email input -->
										<div class="form-outline mb-2 col-md-4">
											<label class="form-label fw-bold float-start" for="form3Example3"><i class="fa fa-mobile"></i> Mobile No</label> 
											<input type="text" id="form3Example3" class="form-control form-control-sm" placeholder="Enter Mobile No" />
										</div>
										<!-- DOB input -->
										<div class="form-outline mb-2 col-md-4">
											<label class="form-label fw-bold float-start" for="form3Example3"><i class="fa fa-calendar"></i> DOB</label> 
											<input type="text" class="form-control form-control-sm" placeholder="dd-mm-yyyy" id="dob" readonly>
										</div>
										<!-- Gender select -->
										<div class="form-outline mb-2 col-md-4">
											<label class="form-label fw-bold float-start" for="form3Example3"><i class="fa fa-venus-mars"></i> Gender</label> 
											<select class="form-select form-select-sm" aria-label="Default select example">
												<option disabled selected>---- select ----</option>
												<option value="Male">Male</option>
												<option value="FeMale">FeMale</option>
												<option value="TransGender">TransGender</option>
											</select>
										</div>

										<!-- User Name input -->
										<div class="form-outline mb-2 col-md-4">
											<label class="form-label fw-bold float-start" for="form3Example3"><i class="fa fa-user"></i> User Name</label> 
											<input type="text" id="form3Example3" class="form-control form-control-sm" placeholder="Enter User Name" />
										</div>
										<!-- Password input -->
										<div class="form-outline mb-2 col-md-4">
											<label class="form-label fw-bold float-start" for="form3Example3"><i class="fa fa-unlock-alt"></i> Password</label> 
											<input type="password" id="form3Example3" class="form-control form-control-sm" placeholder="Enter Password" />
										</div>
										<!-- Re Password input -->
										<div class="form-outline mb-1 col-md-4">
											<label class="form-label fw-bold float-start" for="form3Example3"><i class="fa fa-unlock-alt"></i> Re-Password</label> 
											<input type="password" id="form3Example3" class="form-control form-control-sm" placeholder="Confirm Password" />
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
			</div>
		</div>
	</section>
	<!-- Section: Design Block -->
</body>
</html>