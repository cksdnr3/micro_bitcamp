import React, { useState } from 'react';
import { Link } from 'react-router-dom';

const Home = () => {

    return (
        <>
        <div style={{width: "200px", margin: "0px auto"}}>
            <h1>Home</h1>
            <Link to={"Counter"}>Counter</Link><br/>
            <Link to={"SignUp"}>SignUp</Link><br/>
            <Link to={"Login"}>Login</Link><br/>
        </div>
        </>
        
    )
}

export default Home