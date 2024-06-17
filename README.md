<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Personal Portfolio</title>
    <style>
        body {
            font-family: Arial, sans-serif;
            margin: 0;
            padding: 0;
            background-color: #f4f4f4;
        }
        header {
            background-color: #333;
            color: #fff;
            padding: 1rem 0;
            text-align: center;
        }
        main {
            padding: 1rem 2rem;
        }
        h1, h2 {
            color: #333;
        }
        .skills, .portfolio {
            margin: 2rem 0;
        }
        .skills ul, .portfolio ul {
            list-style-type: none;
            padding: 0;
        }
        .skills li, .portfolio li {
            background: #fff;
            margin: 0.5rem 0;
            padding: 0.5rem;
            border-radius: 5px;
            box-shadow: 0 2px 5px rgba(0,0,0,0.1);
        }
        footer {
            text-align: center;
            padding: 1rem 0;
            background-color: #333;
            color: #fff;
            position: fixed;
            width: 100%;
            bottom: 0;
        }
    </style>
</head>
<body>
    <header>
        <h1>My Personal Portfolio</h1>
    </header>
    <main>
        <section class="introduction">
            <h2>About Me</h2>
            <p>Hello! I'm a web developer passionate about creating interactive and user-friendly websites. Here is a brief overview of my skills and some of the projects I've worked on.</p>
        </section>
        <section class="skills">
            <h2>Skills</h2>
            <ul>
                <li>HTML & CSS</li>
                <li>JavaScript</li>
                <li>React</li>
                <li>Node.js</li>
                <li>Python</li>
            </ul>
        </section>
        <section class="portfolio">
            <h2>Portfolio</h2>
            <ul>
                <li><a href="#">Project 1</a></li>
                <li><a href="#">Project 2</a></li>
                <li><a href="#">Project 3</a></li>
                <li><a href="#">Project 4</a></li>
            </ul>
        </section>
    </main>
    <footer>
        <p>&copy; 2024 My Personal Portfolio</p>
    </footer>
</body>
</html>

