$('#provinsi').change(
		        function() {
		            $.getJSON("/instansi", {
		                provinsiId : $(this).val(),
		                ajax : 'true'
		            }, function(data) {
		                var html = '<option value="">--Pilih Instansi--</option>';
		                var len = data.length;
		                for ( var i = 0; i < len; i++) {
		                    html += '<option value="' + data[i].id + '">'
		                            + data[i].nama + '</option>';
		                }
		                html += '</option>';
		                $('#instansi').html(html);
		            });
		        });