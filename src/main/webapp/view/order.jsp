<!DOCTYPE html>
<html>
<body>

<h1>Sandwich Condiments</h1>

<form action="/showList" method="post" object="sandwich">
    <table>
        <tr>
            <td>
                <input type="checkbox" id="lettuce" name="lettuce" value=1>
            </td>
            <td>
                <label for="lettuce"> Lettuce</label>
            </td>
            <td>
                <input type="checkbox" id="tomato" name="tomato" value=1>
            </td>
            <td>
                <label for="tomato"> Tomato</label>
            </td>
            <td>
                <input type="checkbox" id="mustard" name="mustard" value=1>
            </td>
            <td>
                <label for="mustard"> Mustard</label>
            </td>
            <td>
                <input type="checkbox" id="sprouts" name="sprouts" value=1>
            </td>
            <td>
                <label for="sprouts"> Sprouts</label>
            </td>
        </tr>
        <tr>
            <input type="submit" value="Submit">
        </tr>
    </table>
    <input type="hidden" name="lettuce" value=0>
    <input type="hidden" name="tomato" value=0>
    <input type="hidden" name="mustard" value=0>
    <input type="hidden" name="sprouts" value=0>
</form>
</body>
</html>
