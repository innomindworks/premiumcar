import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { MasterServicesService } from 'src/app/services/master-services.service';

@Component({
  selector: 'app-home-component',
  templateUrl: './home-component.component.html',
  styleUrls: ['./home-component.component.css']
})
export class HomeComponentComponent implements OnInit {

  constructor(private router:Router, private masterServicesService: MasterServicesService) { }

  ngOnInit() {
    this.getCarModelsList();
  };

  carModelsList: Array<Object>;
  modelsList:object;
  carName:String;
  modelName:String;

  searchCar(){
    console.log(this.carName + "   "+ this.modelName);
    this.router.navigateByUrl('/searchCarResult');
  };

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
