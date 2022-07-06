import React, { useEffect } from 'react'
import { Button, Container, Form, FormGroup, Input, Label, label } from 'reactstrap'

export default function AddCourse() {

    useEffect(() => {
        document.title = "Add"
    }, []);

    return (
        <>
            <h1 className="text-center">Add New Course</h1>
            <Form>
                <FormGroup>
                    <Label for="id">Course Id</Label>
                    <Input type="text" placeholder="Enter id here" name="id" id="id"></Input>
                </FormGroup>
                <FormGroup>
                    <Label for="name">Course Name</Label>
                    <Input type="text" placeholder="Enter name here" name="name" id="name"></Input>
                </FormGroup>
                <FormGroup>
                    <Label for="description">Course Description</Label>
                    <Input type="textarea" placeholder="Enter description here" name="description" id="description" style={{ height: 100 }}></Input>
                </FormGroup>
                <Container className="text-center">
                    <Button color="success">Save</Button>{' '}
                    <Button color="warning">Clear</Button>
                </Container>
            </Form>

        </>
    )
}
