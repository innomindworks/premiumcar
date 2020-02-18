import { Injectable } from '@angular/core';
import { HttpClient} from '@angular/common/http';

@Injectable({
  providedIn: 'root'
})
export class MasterServicesService {

  constructor(private http: HttpClient) { }

  getCarModelsList(){
    return this.http.get('../../assets/json/carList.json');
    
  }
}
