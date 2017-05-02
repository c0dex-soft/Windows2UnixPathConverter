/**
 * 
 */
$(document).ready(function() {
	$('#dos2unixButton').click(function() {
		var dosAddress = $('#dosAddress').val();
		
		$.ajax({
			type:'GET',
			url: "/Dos2UnixAddressConverter/convert?dosAddress=" +dosAddress,
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
	$('#addressForm').submit(function(e) {
		$.post('/Dos2UnixAddressConverter/convert', $(this).serialize(), function(result) {
			$('#unixAddress').val(result.unixAddress);
		})
		
		e.preventDefault();
	})
	
})