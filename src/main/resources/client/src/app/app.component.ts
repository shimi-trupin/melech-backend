import { Component } from '@angular/core';
import {Http} from '@angular/http';
import {DataService} from './services/data.service';
import 'rxjs/add/operator/map';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  // title = 'מלך';
  constructor(private dataService: DataService) {
    console.log('constructor ran..');
  }
}


