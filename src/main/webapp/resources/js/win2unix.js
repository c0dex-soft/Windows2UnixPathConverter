/**
 * 
 */
$(document).ready(function() {
	$('#win2unixButton').click(function() {
		var winPath = $('#winPath').val();
		
		$.ajax({
			type:'GET',
			url: "/Windows2UnixPathConverter/convert?winPath=" +winPath,
			dataType: 'json',
			success: function(result) {
				$('#unixAddress').val(result.unixAddress);
			},
			error:function (jqXHR, textStatus, errorThrown) {
                alert("ERROR: " + textStatus + " " + errorThrown + " !");
            }
		})
	
		
	})
})

$(document).ready(function() {
	$('#pathForm').submit(function(e) {
		$.post('/Windows2UnixPathConverter/convert', $(this).serialize(), function(result) {
			$('#unixPath').val(result.unixPath);
		})
		
		e.preventDefault();
	})
	
})