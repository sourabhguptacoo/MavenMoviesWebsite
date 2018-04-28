  <nav class="navbar navbar-expand-lg navbar-light bg-light">
    <a class="navbar-brand" href="#"></a>
    <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
      <span class="navbar-toggler-icon"></span>
    </button>
    <div class="collapse navbar-collapse" id="navbarSupportedContent">
      <ul class="navbar-nav mr-auto">
        <li class="nav-item">
          <a class="nav-link" href="index.jsp">Home</a>
        </li>
        <li class="nav-item dropdown">
          <a class="nav-link dropdown-toggle" href="#" id="navbarDropdown" 
                    role="button" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
            View Movies
          </a>
          <div class="dropdown-menu" aria-labelledby="navbarDropdown">
            <a class="dropdown-item" href="ViewAll">Unsorted</a>
            <div class="dropdown-divider"></div>
            <a class="dropdown-item" href="ViewAll?sortType=title">by Title</a>
            <a class="dropdown-item" href="ViewAll?sortType=director">by Director</a>
            <a class="dropdown-item" href="ViewAll?sortType=playTime">by Play Time</a>
          </div>
        </li>
      </ul>
      <form class="form-inline my-2 my-lg-0" action="Search" method="post">
        <input class="form-control mr-sm-2" type="search" placeholder="Movie Title" aria-label="Movie Title" name="title">
        <button class="btn btn-outline-dark my-2 my-sm-0" type="submit" value="Search">Search</button>
      </form>
    </div>
  </nav>