import '../component/SignUp.css';
import React from 'react';
import axios from 'axios';

const SignUp = () => {

    const insertMany = (e) => {
        e.preventDefault();
        alert('try: try')
        axios.get(`http://localhost:8080/auth/insertMany`)
        .then(res => {
            alert(`success: ${res.data}`)
        })
        .catch(err => {
            alert(`fail: ${err}`)
        })
    }

    return (<>
        <form style={{border: "1px solid #ccc"}}>
            <div className="container">
                <h1>Sign Up</h1> <button onClick={insertMany} >더미데이터 입력</button>
                <p>Please fill in this form to create an account.</p>
                <hr/>
        
                <label for="email"><b>Email</b></label>
                <input type="text" placeholder="Enter Email" name="email" required/>
        
                <label for="psw"><b>Password</b></label>
                <input type="password" placeholder="Enter Password" name="psw" required/>
        
                <label for="psw-repeat"><b>Repeat Password</b></label>
                <input type="password" placeholder="Repeat Password" name="psw-repeat" required/>
                
                <label>
                <input type="checkbox" checked="checked" name="remember" style={{marginBottom: "30px"}}/> Remember me
                </label>
                
                <p>By creating an account you agree to our <a href="#" style={{color: "dodgerblue"}}>Terms & Privacy</a>.</p>
        
                <div className="clearfix">
                <button type="button" className="cancelbtn">Cancel</button>
                <button type="submit" className="signupbtn">Sign Up</button>
                </div>
            </div>
        </form>

    </>)
}

export default SignUp;