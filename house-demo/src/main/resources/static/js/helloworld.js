var hello = {};

$(document).ready(function(){
    hello.init();
});

hello.init = function(){
    $('#btn').click(function(){
        $.ajax({
            url : ctxPath + "/api/hello/hello",
            type : "GET",
            // data : JSON.stringify({
            //     run_date : $('#run_date').val()
            // }),
            // contentType : "application/json; charset=utf-8",
            success : function(result){
                hello.print(result);
            },
            error : function(xhr, status, error){
                alert(xhr.responseJSON.message);
            }
        });
    });
}
hello.print = function(result){
    $('#helloDiv').html(result.name + ", " + result.hello);
}