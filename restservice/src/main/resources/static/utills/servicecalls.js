sap.ui.define(
	["jquery.sap.global"],
	function(jQuery){
		return {
			callService: function(sUrl, sMethod, oPayload){
				return new Promise(function(resolve, reject){
					switch(sMethod.toUpperCase()){
						case "GET":	
													
							jQuery.ajax(sUrl,{
								type:'GET',
								success:function(data){
									//console.log(data);
									resolve(data);			
												
								},
								error:function(err){
									alert(err);
									reject(err);
								}							
							});
							break;
							
						case "POST":
							jQuery.ajax(sUrl,{
								type:'POST',
								contentType:'application/json',
								data:JSON.stringfy(oPayload),
								success:function(data){
									//console.log(data);
									resolve(data);			
												
								},
								error:function(err){
									alert(err);
									reject(err);
								}							
							});
							
						break;
					}
				});
			}
		}
	}
);