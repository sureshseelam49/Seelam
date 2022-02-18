sap.ui.define(
	["sap/ui/core/mvc/Controller",
	"jquery.sap.global",
	"restservice/utills/servicecalls"],
	function(Controller, JQuery, service){
		return Controller.extend("restservice.controllers.Main",{
			onLoadData:function(){
			//alert('loading data.....');
			var that=this;
			service.callService("/getAllVendors","GET", {}).then(function(data){
				
				var oModel=new sap.ui.model.json.JSONModel();
				oModel.setData(data);
				that.getView().setModel(oModel);
				that.getView().byId("idTable").bindRows("/");
				
			}).catch(function(err){
				alert(err);
			});	
			
			}
		});
	});


