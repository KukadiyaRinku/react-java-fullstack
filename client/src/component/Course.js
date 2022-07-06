import React from 'react'
import {
    Card, CardImg, CardText, CardBody,
    CardTitle, CardSubtitle, Container, Button
} from 'reactstrap';


export default function Course({ course }) {
    return (
        <>
            <Card className="text-center">
                <CardBody>
                    <CardSubtitle className="font-weight-bold">{course.name}</CardSubtitle>
                    <CardText>{course.description}</CardText>
                    <Container className="text-center">
                        <Button color="warning">Update</Button>{' '}
                        <Button color="danger">Delete</Button>
                    </Container>
                </CardBody>
            </Card>
        </>
    )
}
