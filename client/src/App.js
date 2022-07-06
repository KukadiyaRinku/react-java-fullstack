import Header from "./component/Header";
import NavBar from "./component/NavBar";
import Home from "./component/Home";
import ViewCourse from "./component/ViewCourses";
import { ToastContainer } from 'react-toastify'
import AddCourse from "./component/AddCourse";
import { Col, Container, Row } from "reactstrap";
import 'react-toastify/dist/ReactToastify.css';
import { BrowserRouter as Router, Route } from "react-router-dom";

function App() {
  return (
    <>
      <Router>
        <ToastContainer />
        <Container>
          <Header></Header>
          <Row>
            <Col md={2}><NavBar></NavBar> </Col>
            <Col md={8}>
              <Route path="/" component={Home} exact></Route>
              <Route path="/view-courses" component={ViewCourse} exact></Route>
              <Route path="/add-course" component={AddCourse} exact></Route>
              <Route path="/about"></Route>
            </Col>
          </Row>
        </Container>
      </Router>
    </>
  );
}

export default App;
