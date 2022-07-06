import React, { useEffect } from 'react'
import { Button, Container, Jumbotron } from 'reactstrap'

export default function Home() {

    useEffect(() => {
        document.title = "Home"
    }, []);

    return (
        <>
            <Jumbotron className="text-center">
                <h3 className="text-center">Home page of my first react app</h3>
                <p>This is Courses Tutorial App.This is the Home Page of the application. This is demo application to learn react library.
                </p>
                <Container>
                    <Button color="primary" outline>Learn More</Button>
                </Container>
            </Jumbotron>
        </>
    )
}
