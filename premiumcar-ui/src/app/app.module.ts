import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { BrowserAnimationsModule } from '@angular/platform-browser/animations';
import { TreeviewModule } from 'ngx-treeview';
import { NgbModule } from '@ng-bootstrap/ng-bootstrap';
import { HttpClientModule} from '@angular/common/http';


import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { MainComponentComponent } from './components/main-component/main-component.component';
import { HeaderComponentComponent } from './components/header-component/header-component.component';
import { FooterComponentComponent } from './components/footer-component/footer-component.component';
import { HomeComponentComponent } from './components/home-component/home-component.component';
import { SellCarComponentComponent } from './components/sell-car-component/sell-car-component.component';
import { SearchCarResultComponentComponent } from './components/search-car-result-component/search-car-result-component.component';

@NgModule({
  declarations: [
    AppComponent,
    MainComponentComponent,
    HeaderComponentComponent,
    FooterComponentComponent,
    HomeComponentComponent,
    HomeComponentComponent,
    SellCarComponentComponent,
    SearchCarResultComponentComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    BrowserAnimationsModule,
    TreeviewModule.forRoot(),
    NgbModule,
    HttpClientModule 
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
