<html>
    <body>
        <?php

        $name = $age = $comments = "   ";

        if($_SERVER["REQUEST_METHOD"]=="POST")
        {
            $name = test_input($_POST["name"]);
            $age = test_input($_POST["age"]);
            $addr = test_input($_POST["addr"]);

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

        Name:
        <input type="text" name="name">

        Age:
        <input type="text" name="age">

        Address:
        <input type="text" name="addr">

        <input type="submit" value="submit">

    </form>

    <?php

    echo "$name";
    echo "<br >";
    echo "$age";
    echo "<br >";
    echo "$addr";
    echo "<br >";


