<html>
    <body>
        <?php

        $name = $age = $comments = " " ;

        if($_SERVER["REQUEST_METHOD"]=="POST")
        {
            $name = test_input($POST["name"]);
            $age = test_input($POST["age"]);
            $comments = test_input($POST["comments"]);

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

        Username : <input type="text" name="name" >
        Age : <input type="text" name="age" >
        Comments : <input type="text" name="comments" >
        <input type="submit" value="submit">

    </form>

    <?php

    echo "$name";
    echo "<br>";
    echo "$age";
    echo "<br>";
    echo "$comments";
    echo "<br>";

    ?>

    </body>
    </html>
    
