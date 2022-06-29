<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <meta name="author" content="Andres Gayón Espinel" />
    <title>Gym</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.0-beta1/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-0evHe/X+R7YkIZDRvuzKMRqM+OrBnVFBL6DOitfPri4tjfHxaWutUpFmBp4vmVor" crossorigin="anonymous">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="stylesheet" type="text/css" href="css/index.css">

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
                        <a class="nav-link active" aria-current="page" href="index.jsp   ">Home</a>
                    </li>
                    <li class="nav-item">
                        <a class="nav-link disable" href="#footer">Contactenos</a>
                    </li>
                    <li class="nav-item">
                        <a class="nav-link disable" href="#price">Planes y precios</a>
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

    <section>
        <style>
            /* Default height for small devices */
            #intro-example {
                height: 700px;
            }

            /* Height for devices larger than 992px */
            @media (min-width: 1000px) {
                #intro-example {
                    height: 680px;
                }
            }
        </style>

        <div
                id="intro-example"
                class="p-5 text-center bg-image"
                style="background-image: url('assets/gym.jpg');"
        >
            <div class="mask" style="background-color: rgba(0, 0, 0, 0.3);">
                <div class="d-flex justify-content-center align-items-center h-100">
                    <div class="text-white">
                        <h1 class="mb-3">Entrena con nosotros!</h1>
                        <h5 class="mb-4">Por una vida saludable y un cuerpo Fit</h5>
                        <a
                                class="btn btn-outline-light btn-lg m-2"
                                href="#price"
                                role="button"
                                rel="nofollow"
                         >Planes y precios</a>
                        <a
                                class="btn btn-outline-light btn-lg m-2"
                                href="#footer"
                                role="button"
                        >contactanos</a>
                    </div>
                </div>
            </div>
        </div>
    </section>
    <section class="pricing py-5" id="price">
        <div class="container">
            <div class="row">
                <!-- Free Tier -->
                <div class="col-lg-4">
                    <div class="card mb-5 mb-lg-0">
                        <div class="card-body">
                            <h5 class="card-title text-muted text-uppercase text-center">Basic</h5>
                            <h6 class="card-price text-center" style="color:#FF6600">$150.000<span class="period">/month</span></h6>
                            <hr>
                            <ul class="fa-ul">
                                <li><span class="fa-li"><i class="fas fa-check"></i></span>Rutinas personalizadas</li>
                                <li><span class="fa-li"><i class="fas fa-check"></i></span>clases personalizadas</li>
                                <li><span class="fa-li"><i class="fas fa-check"></i></span>valoración médica</li>
                                <li><span class="fa-li"><i class="fas fa-check"></i></span>acceso a cursos personalizados</li>
                                <li class="text-muted"><span class="fa-li"><i class="fas fa-times"></i></span>més gratis por afiliarse</li>
                            </ul>
                            <a href="#" class="btn btn-block btn-primary text-uppercase">Comprar</a>
                        </div>
                    </div>
                </div>
                <!-- Plus Tier -->
                <div class="col-lg-4">
                    <div class="card mb-5 mb-lg-0">
                        <div class="card-body">
                            <h5 class="card-title text-muted text-uppercase text-center">Plus</h5>
                            <h6 class="card-price text-center" style="color:#FF6600">$190.000<span class="period">/month</span></h6>
                            <hr>
                            <ul class="fa-ul">
                                <li><span class="fa-li"><i class="fas fa-check"></i></span><strong>rutinas personalizadas</strong></li>
                                <li><span class="fa-li"><i class="fas fa-check"></i></span>valoración medica quincenal</li>
                                <li><span class="fa-li"><i class="fas fa-check"></i></span>Sin tiempos de permanencia</li>
                                <li><span class="fa-li"><i class="fas fa-check"></i></span>afiliación con debito automático</li>
                                <li><span class="fa-li"><i class="fas fa-check"></i></span>Acceso a nuestras instalaciones afiliadas</li>

                            </ul>
                            <a href="#" class="btn btn-block btn-primary text-uppercase">Comprar</a>
                        </div>
                    </div>
                </div>
                <!-- Pro Tier -->
                <div class="col-lg-4">
                    <div class="card">
                        <div class="card-body">
                            <h5 class="card-title text-muted text-uppercase text-center">Plan de Bienvenida</h5>
                            <h6 class="card-price text-center"style="color:#FF6600">$90.000<span class="period">/month</span></h6>
                            <hr>
                            <ul class="fa-ul">
                                <li><span class="fa-li"><i class="fas fa-check"></i></span><strong>1 més de entrenamiento en la sede</strong></li>
                                <li><span class="fa-li"><i class="fas fa-check"></i></span>Evaluación de composición corporal</li>
                                <li><span class="fa-li"><i class="fas fa-check"></i></span>Tarifa de renovación al adquirir un nuevo plan</li>

                            </ul>
                            <a href="#" style="align:center;" class="btn btn-block btn-primary text-uppercase">Comprar</a>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </section>

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