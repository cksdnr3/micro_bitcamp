import '../component/Login.css';

const Login = () => {

    return (<>

    <form>
        <div className="imgcontainer">
            <img src="img_avatar2.png" alt="Avatar" className="avatar"/>
        </div>

        <div className="container">
            <label for="uname"><b>Username</b></label>
            <input type="text" placeholder="Enter Username" name="uname" required/>

            <label for="psw"><b>Password</b></label>
            <input type="password" placeholder="Enter Password" name="psw" required/>

            <button type="submit">submit</button>
            <label>
            <input type="checkbox" checked="checked" name="remember"/> Remember me
            </label>
        </div>

        <div className="container" style= {{backgroundColor: "#f1f1f1"}}>
            <span className="psw">Forgot <a href="#">password?</a></span>
        </div>
    </form>

</>)
}

export default Login;