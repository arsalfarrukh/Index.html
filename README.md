<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Portfolio</title>
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
</head>
<body>

<!-- Navigation Bar -->
<nav class="navbar navbar-expand-lg navbar-dark bg-dark">
    <a class="navbar-brand" href="#">Portfolio</a>
    <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarNav" aria-controls="navbarNav" aria-expanded="false" aria-label="Toggle navigation">
        <span class="navbar-toggler-icon"></span>
    </button>
    <div class="collapse navbar-collapse" id="navbarNav">
        <ul class="navbar-nav ml-auto">
            <li class="nav-item">
                <a class="nav-link" href="#home">Home</a>
            </li>
            <li class="nav-item">
                <a class="nav-link" href="#about">About Me</a>
            </li>
            <li class="nav-item">
                <a class="nav-link" href="#projects">Projects</a>
            </li>
            <li class="nav-item">
                <a class="nav-link" href="#contact">Contact</a>
            </li>
        </ul>
    </div>
</nav>

<!-- Home Section -->
<section id="home" class="container mt-5">
    <div class="row">
        <div class="col-md-6">
            <h1>Welcome to My Portfolio</h1>
            <p>A brief introduction about yourself.</p>
        </div>
        <div class="col-md-6">
            <img src="profile.jpg" alt="Profile Picture" class="img-fluid rounded-circle">
        </div>
    </div>
</section>

<!-- About Me Section -->
<section id="about" class="container mt-5">
    <h2>About Me</h2>
    <div class="row">
        <div class="col-md-6">
            <h3>Biography</h3>
            <p>Write your detailed biography here.</p>
            <ul>
                <li>Education: Your education details.</li>
                <li>Skills: List your skills.</li>
                <li>Interests: Your interests.</li>
            </ul>
        </div>
        <div class="col-md-6">
            <h3>Resume</h3>
            <!-- Embed your resume here -->
            <iframe src="resume.pdf" width="100%" height="500px"></iframe>
            <br><br>
            <!-- Download button for resume -->
            <a href="resume.pdf" download class="btn btn-primary">Download Resume</a>
        </div>
    </div>
</section>

<!-- Projects Section -->
<section id="projects" class="container mt-5">
    <h2>Projects</h2>
    <div class="row">
        <div class="col-md-4 mb-4">
            <div class="card">
                <img src="project1.jpg" class="card-img-top" alt="Project 1">
                <div class="card-body">
                    <h5 class="card-title">Project 1</h5>
                    <p class="card-text">Description of Project 1.</p>
                    <a href="#" class="btn btn-primary">View Demo</a>
                </div>
            </div>
        </div>
        <div class="col-md-4 mb-4">
            <div class="card">
                <img src="project2.jpg" class="card-img-top" alt="Project 2">
                <div class="card-body">
                    <h5 class="card-title">Project 2</h5>
                    <p class="card-text">Description of Project 2.</p>
                    <a href="#" class="btn btn-primary">View Demo</a>
                </div>
            </div>
        </div>
        <div class="col-md-4 mb-4">
            <div class="card">
                <img src="project3.jpg" class="card-img-top" alt="Project 3">
                <div class="card-body">
                    <h5 class="card-title">Project 3</h5>
                    <p class="card-text">Description of Project 3.</p>
                    <a href="#" class="btn btn-primary">View Demo</a>
                </div>
            </div>
        </div>
    </div>
</section>

<!-- Contact Section -->
<section id="contact" class="container mt-5">
    <h2>Contact Me</h2>
    <div class="row">
        <div class="col-md-6">
            <form>
                <div class="form-group">
                    <label for="name">Name</label>
                    <input type="text" class="form-control" id="name" placeholder="Enter your name">
                </div>
                <div class="form-group">
                    <label for="email">Email address</label>
                    <input type="email" class="form-control" id="email" placeholder="Enter your email">
                </div>
                <div class="form-group">
                    <label for="subject">Subject</label>
                    <input type="text" class="form-control" id="subject" placeholder="Enter the subject">
                </div>
                <div class="form-group">
                    <label for="message">Message</label>
                    <textarea class="form-control" id="message" rows="5" placeholder="Enter your message"></textarea>
                </div>
                <button type="submit" class="btn btn-primary">Submit</button>
            </form>
        </div>
        <div class="col-md-6">
            <h3>Connect with Me</h3>
            <!-- Social media links -->
            <ul class="list-unstyled">
                <li><a href="#"><i class="fab fa-linkedin fa-2x"></i></a></li>
                <li><a href="#"><i class="fab fa-twitter fa-2x"></i></a></li>
                <li><a href="#"><i class="fab fa-github fa-2x"></i></a></li>
            </ul>
        </div>
    </div>
</section>

<!-- Footer -->
<footer class="bg-dark text-white text-center py-3">
    <p>&copy; 2024 Your Name. All rights reserved.</p>
</footer>

<!-- Scripts -->
<script src="https://code.jquery.com/jquery-3.5.1.slim.min.js"></script>
<script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.5.4/dist/umd/popper.min.js"></script>
<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>

</body>
</html>
       
      
