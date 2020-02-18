import { Component, OnInit } from '@angular/core';
import { MasterServicesService } from 'src/app/services/master-services.service';

@Component({
  selector: 'app-sell-car-component',
  templateUrl: './sell-car-component.component.html',
  styleUrls: ['./sell-car-component.component.css']
})
export class SellCarComponentComponent implements OnInit {

  constructor(private masterServicesService: MasterServicesService) 
  { 

  }

  yearList;
  carModelsList: Array<Object>;
  modelsList:object;
  carName:String;
  modelName:String;
  
  ngOnInit() {
    this.getListOfYears();
    this.getCarModelsList();
  }

  getListOfYears() {
    var d = new Date();
    var n = d.getFullYear();
    var years = [];
    for(var i=0; i<10; i++){
      years.push(n-i);    
    }
    this.yearList = years;
  }

  getCarModelsList(){
    this.masterServicesService.getCarModelsList().subscribe(data =>{
      this.carModelsList = data["carModelsList"];
    });
  };

  onChangeCarList(carName){
    this.carName = carName;
    var tempList;
    this.carModelsList.forEach(function(value){
        if(value["key"]==carName){
          tempList = value["data"];
        }
    });
    this.modelsList = tempList;
  };

  onChangeModelList(modelName){
    this.modelName = modelName;
  }
}
