<!DOCTYPE html>
<html lang="en">
<head>
  <meta charset="UTF-8">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <title>Personal Portfolio and Blog</title>
  <!-- Bootstrap CSS -->
  <link href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/css/bootstrap.min.css" rel="stylesheet">
  <!-- Custom CSS -->
  <link rel="stylesheet" href="styles.css">
</head>
<body>

  <!-- Navbar -->
  <nav class="navbar navbar-expand-lg navbar-dark bg-dark">
    <a class="navbar-brand" href="#">Your Name</a>
    <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarNav" aria-controls="navbarNav" aria-expanded="false" aria-label="Toggle navigation">
      <span class="navbar-toggler-icon"></span>
    </button>
    <div class="collapse navbar-collapse" id="navbarNav">
      <ul class="navbar-nav ml-auto">
        <li class="nav-item active">
          <a class="nav-link" href="#home">Home</a>
        </li>
        <li class="nav-item">
          <a class="nav-link" href="#about">About</a>
        </li>
        <li class="nav-item">
          <a class="nav-link" href="#projects">Projects</a>
        </li>
        <li class="nav-item">
          <a class="nav-link" href="#blog">Blog</a>
        </li>
        <li class="nav-item">
          <a class="nav-link" href="#contact">Contact</a>
        </li>
      </ul>
    </div>
  </nav>

  <!-- Home Page -->
  <section id="home" class="container mt-5">
    <h1>Arsal Farrukh Portfolio</h1>
    <p>3020 project</p>
    
   
    
  </section>

  <!-- About Me Page -->
  <section id="about" class="container mt-5">
    <h2>About Me</h2>
    <h3>Biography</h3>
    <p>Your detailed biography goes here.</p>
    <h3>Resume</h3>
    <p>Embed your resume or provide a download link.</p>
    <!-- Include other content for about me page as needed -->
  </section>

  <!-- Projects Page -->
  <section id="projects" class="container mt-5">
    <h2>Projects</h2>
    <div class="row">
      <div class="col-md-4">
        <div class="card mb-4">
          <img class="card-img-top" src="project1.jpg" alt="Project 1">
          <div class="card-body">
            <h5 class="card-title">Project 1</h5>
            <p class="card-text">Project description.</p>
            <a href="#" class="btn btn-primary">View Project</a>
          </div>
        </div>
      </div>
      <!-- Add more project cards as needed -->
    </div>
  </section>

  <!-- Blog Page -->
  <section id="blog" class="container mt-5">
    <h2>Blog</h2>
    <p>Note: Specification of the Blog Page will be completed in Assignment 2.</p>
  </section>

  <!-- Contact Page -->
  <section id="contact" class="container mt-5">
    <h2>Contact</h2>
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
        <input type="text" class="form-control" id="subject" placeholder="Enter subject">
      </div>
      <div class="form-group">
        <label for="message">Message</label>
        <textarea class="form-control" id="message" rows="5" placeholder="Enter your message"></textarea>
      </div>
      <button type="submit" class="btn btn-primary">Submit</button>
    </form>
  </section>

  <!-- Footer -->
  <footer class="footer mt-5 py-3 bg-dark text-white">
    <div class="container text-center">
      <p>&copy; 2024 Your Name. All rights reserved.</p>
    </div>
  </footer>

  <!-- Bootstrap JS and dependencies -->
  <script src="https://cdnjs.cloudflare.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
  <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/js/bootstrap.min.js"></script>
</body>
</html>
      
