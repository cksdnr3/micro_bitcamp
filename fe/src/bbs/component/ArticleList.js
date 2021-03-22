import "./ArticleList.css"

const ArticleList = () => (
    <>
    <body>
        <div id="container">
            <h1>Community</h1>
            <table>
                <tr>
                    <th>No</th>
                    <th className="title" style={{textAlign: "center"}}>Title</th>
                    <th>Writer</th>
                    <th>Date</th>
                </tr>
                <tr>
                    <td>0</td>
                    <td className="title" style={{textAlign: "left"}}>안녕하세요.</td>
                    <td>노찬욱</td>
                    <td>21.03.14</td>
                </tr>
                <tr>
                    <td>1</td>
                    <td className="title" style={{textAlign: "left"}}>반갑습니다.</td>
                    <td>zzaa</td>
                    <td>21.03.14</td>
                </tr>
                <tr>
                    <td>2</td>
                    <td className="title" style={{textAlign: "left"}}>하이</td>
                    <td>adsaa</td>
                    <td>21.03.14</td>
                </tr>
            </table>
        </div>
    </body>
    </>
)

export default ArticleList