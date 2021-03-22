import './ArticleEdit.css'

const ArticleEdit = () => (
    <>
    <div className="container">
        <h1>Modify</h1>
        <form>
            <label for="lname">Title</label>
            <input type="text" id="lname" name="lastname" placeholder="Title"/>

            <label for="fname">Writer</label>
            <input type="text" id="fname" name="firstname" placeholder="Writer" readOnly/>

            <label for="subject">Content</label>
            <textarea id="subject" name="subject" placeholder="Content" style={{height: "200px"}}></textarea>

            <input type="submit" value="Modify"/>
            <input type="submit" value="Cancel"/>
        </form>
    </div>
    </>
)

export default ArticleEdit