<!DOCTYPE html>
<html lang="en">
<head>
    <title>Assessment</title>

    <style>
    p {
        font-size: 16pt;
        margin-left: 3cm;
    }
    a {
        font-size: 16pt;
        margin-top: 3cm;
    }
    </style>

    <script>
        function wordTime(){
            displayWords(["pi", "mo", "in", "fab", "pun", "sed"]);
        }

        function displayWords(words){
            var element = document.getElementById("insert");
            var p1 = document.createElement("p");
            var p1Text = document.createTextNode(${words});
            words.shift();
            p1.class = "p1";
            p1.id = "p1";
            p1.appendChild(p1Text);
            element.appendChild(p1);
            setTimeout(function(){removeWords(words)}, 3000);
        }

        function removeWords(words){
            var element = document.getElementById("insert");
            var items = document.getElementsByClassName("p1");
            element.removeChild(p1);
            if (words[0] != "sed"){
                displayWords(words);
            }
        }

        function removeWords1(){
            var element = document.getElementbyId("insert");
            var items = document.getElementsByClassName("p1");
            element.removeChild(p1);
        }
    </script>
</head>

<body>
<h2> Read the following words outloud: </h2>
<button onclick="wordTime()">START</button>
<div id="insert">
</div>
<a href="/done">Done!</a>
</body>
</html>