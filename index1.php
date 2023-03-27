<html>
    <head><title>PHP display</title></head>

    <body>

    <?php

    $name = $age = $comments = "" ;

    if($_SERVER["REQUEST_METHOD"]=="POST")
    {
        $name = test_input($_POST["name"]);
        $age = test_input($_POST["age"]);
        $comments = test_input($_POST["comments"]);
    }

    function test_input($data)
    {
        $data = trim($data);
        $data = stripslashes($data);
        $data = htmlspecialchars($data);
        return $data;


    }

    ?>

    <form method="post">

    Username: <input type="text" name="name">
    Age: <input type="text" name="age">
    Comments: <input type="text" name="comments">

    <input type="submit" value="submit">

</form>
<?php


echo "$name";
echo "<br>";
echo "$age";
echo "<br>";
echo "$comments";
?>

</body>
</html>


<!-- Run this:

php -S localhost:8000 

brew services restart php

brew services start php

-->