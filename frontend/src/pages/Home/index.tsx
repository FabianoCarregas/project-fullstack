import Footer from "components/Footer";
import NavBar from "components/NavBar";
import { Link } from "react-router-dom";

const Home = () =>  {
    return (
        <>
        <NavBar />
        <div className="container">
        <div className="jumbotron">
            <h1 className="display-4">Fab-lous-Sales</h1>
            <p className="lead">Check your sales out, in real time with our platform! </p>
            <hr/>
            <p>This Application will provide an immersive experience from an app developed from scratch, through  Spring Boot backend, Angular frontend Frameworks.</p>
            <Link className="btn btn-primary btn-lg" to="/dashboard">
                Dashboard
            </Link>    

        </div>
    </div>
    <Footer />
    </>
    );
  }
  
  export default Home;