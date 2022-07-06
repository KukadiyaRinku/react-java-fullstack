import React, { useState, useEffect } from 'react'
import Course from "./Course"
import axios from 'axios'
import base_url from '../settings/bootapi'

export default function ViewCourse() {

    const [courses, setCourses] = useState([])

    const getAllCourses = () => {
        axios.get(`${base_url}/courses`).then(
            (response) => {
                console.log(response);
                setCourses(response.data);
            },
            (error) => {
                console.log(error);
            })
    }

    useEffect(() => {
        document.title = "View";

        getAllCourses();
    }, []);

    return (
        <>
            <h1>All Courses</h1>
            <p>List of available courses are as bellow.</p>
            {
                courses.length > 0 ?
                    courses.map((e) => <Course key={e.id} course={e}></Course>) :
                    "No Courses Available"
            }
        </>
    )
}
