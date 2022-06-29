<%--
  Created by IntelliJ IDEA.
  User: Andres
  Date: 28/06/2022
  Time: 04:59 p. m.
  To change this template use File | Settings | File Templates.
  cedula, nombre, apellido, email, password, telefono, peso, altura, imc, Entrenador_id
--%>
<%@ page import="com.Gym.Gym_web_v2.dto.ClienteDTO"%>
<%@ page import="com.Gym.Gym_web_v2.dao.ClienteDAO"%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    String cedula = request.getParameter("cedula");
    String nombre = request.getParameter("nombre");
    String apellido = request.getParameter("apellido");
    String email = request.getParameter("email");

%>
<html>
<head>
    <meta name="author" content="Andres Gayón Espinel" />
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="stylesheet" type="text/css" href="css/index.css">
    <title>Registrate con nosotros</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.0-beta1/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-0evHe/X+R7YkIZDRvuzKMRqM+OrBnVFBL6DOitfPri4tjfHxaWutUpFmBp4vmVor" crossorigin="anonymous">

</head>
<header>
    <header>
        <nav class="navbar navbar-expand-lg navbar-dark bg-dark">
            <div class="container-fluid">
            <span class="navbar-brand mb-0 h1">
                <img src="./assets/icon.icon" alt="" width="40"  class="d-inline-block align-text-top">
                GYMSPORT
            </span>

                <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarNav" aria-controls="navbarNav" aria-expanded="false" aria-label="Toggle navigation">
                    <span class="navbar-toggler-icon"></span>
                </button>
                <div class="collapse navbar-collapse" id="navbarNav">
                    <ul class="navbar-nav">
                        <li class="nav-item">
                            <a class="nav-link active" aria-current="page" href="index.jsp">Home</a>
                        </li>
                        <li class="nav-item">
                            <a class="nav-link disable" href="index.jsp">Contactenos</a>
                        </li>
                        <li class="nav-item">
                            <a class="nav-link disable" href="index.jsp">Planes y precios</a>
                        </li>
                        <li class="nav-item">
                            <a class="nav-link" href="./login.jsp">Inciar sesion</a>
                        </li>
                        <li class="nav-item">
                            <a class="nav-link" href="./signin.jsp">Registrarse</a>
                        </li>
                    </ul>
                </div>
            </div>
        </nav>
    </header>
</header>
<body>
<section class="text-center">
    <!-- Background image -->
    <div class="p-5 bg-image" style="
        background-image: url('assets/sign-in-gym.jpg');
        height: 550px;
        "></div>
    <!-- Background image -->

    <div class="card mx-4 mx-md-5 shadow-5-strong" style="
        margin-top: -150px;
        background: hsla(0, 0%, 100%, 0.8);
        backdrop-filter: blur(30px);
        ">
        <div class="card-body py-5 px-md-5">

            <div class="row d-flex justify-content-center">
                <div class="col-lg-8">
                    <h2 class="fw-bold mb-5">Sign up now</h2>
                    <form>
                        <!-- 2 column grid layout with text inputs for the first and last names -->
                        <div class="row">
                            <div class="col-md-6 mb-4">
                                <div class="form-outline">
                                    <input type="text" id="Nombre" class="form-control" />
                                    <label class="form-label" for="Nombre">Nombres</label>
                                </div>
                            </div>
                            <div class="col-md-6 mb-4">
                                <div class="form-outline">
                                    <input type="text" id="Apellido" class="form-control" />
                                    <label class="form-label" for="Apellido">Apellido</label>
                                </div>
                            </div>
                        </div>

                        <!-- Document input-->
                        <div class="form-outline mb-4">
                            <input type="email" id="Cedula" class="form-control" />
                            <label class="form-label" for="Cedula">Documento de identidad</label>
                        </div>


                        <!-- Phone input-->
                        <div class="form-outline mb-4">
                            <input type="email" id="telefono" class="form-control" />
                            <label class="form-label" for="telefono">Telefono</label>
                        </div>

                        <!-- Email input -->
                        <div class="form-outline mb-4">
                            <input type="email" id="email" class="form-control" placeholder="name@example.com" value="<%= email %>"/>
                            <label class="form-label" for="email" >Email</label>
                        </div>

                        <!-- Password input -->
                        <div class="form-outline mb-4">
                            <input type="password" id="password" class="form-control" />
                            <label class="form-label" for="password">Password</label>
                        </div>

                        <!-- Checkbox -->
                        <div class="form-check d-flex justify-content-center mb-4">
                            <input class="form-check-input me-2" type="checkbox" value="" id="form2Example33" checked />
                            <label class="form-check-label" for="form2Example33">
                                Acepto los terminos y condiciones
                            </label>
                        </div>

                        <!-- Submit button -->
                        <button type="submit" class="btn btn-primary btn-block mb-4">
                            Registrarse
                        </button>


                    </form>
                </div>
            </div>
        </div>
    </div>
</section>
<!-- Signin end -->

<!-- Footer begin -->
<section class="footer" id="footer" style="background-color:#9E3F00">
    <!-- Footer -->
    <footer class="bg-secondary text-white">
        <!-- Grid container -->
        <div class="container p-4">
            <!--Grid row-->
            <div class="row">
                <!--Grid column-->
                <div class="col-lg-6 col-md-12 mb-4 mb-md-0">
                    <h5 class="text-uppercase">¿Quienes somos?</h5>

                    <p>
                        Somos una compañia, dispuesta y comprometida a mejorar la salud de nuestros clientes,
                        capaces de dar un servicio de calidad y aseguramos resultados factibles de acuerdo a
                        las necesidades de cada usuario.
                    </p>
                </div>
                <!--Grid column-->

                <!--Grid column-->
                <div class="col-lg-3 col-md-6 mb-4 mb-md-0">
                    <h5 class="text-uppercase">Telefonos</h5>

                    <ul class="list-unstyled mb-0">
                        <li>
                            <a href="#!" class="text-white">320 356032</a>
                        </li>
                        <li>
                            <a href="#!" class="text-white">01800 353641</a>
                        </li>

                    </ul>
                </div>
                <!--Grid column-->

                <!--Grid column-->
                <div class="col-lg-3 col-md-6 mb-4 mb-md-0">
                    <h5 class="text-uppercase mb-0">contactanos</h5>

                    <ul class="list-unstyled">
                        <li>
                            <a href="#!" class="text-white">info@gymsport.com</a>
                        </li>
                        <li>
                            <a href="#!" class="text-white">peticiones@gymsport.com</a>
                        </li>

                    </ul>
                </div>
                <!--Grid column-->
            </div>
            <!--Grid row-->
        </div>
        <!-- Grid container -->

    </footer>
    <!-- Footer -->
</section>

</body>
</html>
