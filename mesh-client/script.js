var ip = 'http://localhost:';
var port = '8080/';
var prefix = ip + port + 'rest/';

function restGetAllSongs(){
//var restGetAllSongs = function () {
    $.ajax({
        type: 'GET',
        url: prefix + "song/all/",
        dataType: 'json',
        async: true,
        success: function(data) {
            var songs = data;
            for (var i = 0; i < songs.length; i++){
                $('#songs_select').append('<option value="' + songs[i].id + '">' + songs[i].author + " :: " + songs[i].title + " :: " + songs[i].duration + '</option>');
            }
        },
        error: function(jqXHR, textStatus, errorThrown) {
            alert(jqXHR.status + ' ' + jqXHR.responseText);
        }
    })
};

function onreload(){
    restGetAllSongs();
}