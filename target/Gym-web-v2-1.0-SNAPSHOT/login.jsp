<%--
  Created by IntelliJ IDEA.
  User: Andres
  Date: 27/06/2022
  Time: 10:03 p. m.
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta name="author" content="Andres Gayón Espinel" />
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="stylesheet" type="text/css" href="css/login.css">
    <title>Iniciar sesion</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.0-beta1/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-0evHe/X+R7YkIZDRvuzKMRqM+OrBnVFBL6DOitfPri4tjfHxaWutUpFmBp4vmVor" crossorigin="anonymous">

</head>

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

<body>
<section class="vh-100">
    <div class="container-fluid">
        <div class="row">
            <div class="col-sm-6 text-black">

                <div class="px-5 ms-xl-4">
                    <i class="fas fa-crow fa-2x me-3 pt-5 mt-xl-4" style="color: #709085;"></i>
                    <span class="h1 fw-bold mb-0">Logo</span>
                </div>

                <div class="d-flex align-items-center h-custom-2 px-5 ms-xl-4 mt-5 pt-5 pt-xl-0 mt-xl-n5">

                    <form style="width: 23rem;">

                        <h3 class="fw-normal mb-3 pb-3" style="letter-spacing: 1px;">Log in</h3>

                        <div class="form-outline mb-4">
                            <input type="email" id="form2Example18" class="form-control form-control-lg" />
                            <label class="form-label" for="form2Example18">Email</label>
                        </div>

                        <div class="form-outline mb-4">
                            <input type="password" id="form2Example28" class="form-control form-control-lg" />
                            <label class="form-label" for="form2Example28">Contraseña</label>
                        </div>

                        <div class="pt-1 mb-4">
                            <button class="btn btn-info btn-lg btn-block" type="button">Login</button>
                        </div>

                        <p class="small mb-5 pb-lg-2"><a class="text-muted" href="#!">Forgot password?</a></p>
                        <p>Don't have an account? <a href="./signin.jsp" class="link-info">Register here</a></p>

                    </form>

                </div>

            </div>
            <div class="col-sm-6 px-0 d-none d-sm-block">
                <img src="./assets/login-gym.jpg"
                     alt="Login image" class="w-100 vh-100" style="object-fit: cover; object-position: left;">
            </div>
        </div>
    </div>
</section>

<!-- login end-->

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
