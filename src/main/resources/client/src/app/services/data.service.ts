import { Injectable } from '@angular/core';
import { Http } from '@angular/http';
import 'rxjs/add/operator/map';

@Injectable()
export class DataService {

  constructor(public http: Http) {
    console.log('Data service connected...');
  }

  getPosts() {
    return this.http.get('https://jsonplaceholder.typicode.com/posts').map(res => res.json());
  }

  getUsers() {
    return this.http.get('http://192.168.0.32:4567/all/Users').map(res => res.json());
  }

}
