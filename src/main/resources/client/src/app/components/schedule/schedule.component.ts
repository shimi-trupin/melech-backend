import { Component, OnInit } from '@angular/core';
import {DataService} from '../../services/data.service';

@Component({
  selector: 'app-schedule',
  templateUrl: './schedule.component.html',
  styleUrls: ['./schedule.component.css']
})
export class ScheduleComponent implements OnInit {
  posts: Post[];
  users: User[];

  constructor(private dataService: DataService) {
    console.log('constructor ran..');
  }

  ngOnInit() {
    console.log('ngOnInit ran...');
    this.dataService.getUsers().subscribe((users) => {
      this.users = users;
    });
    /*this.dataService.getPosts().subscribe((posts) => {
      // console.log(posts);
      this.posts = posts;
    });*/
  }

}

interface Post {
  userId: number;
  id: number;
  title: string;
  body: string;
}

interface User {
  _id: string;
  name: string;
  id: number;
  status: string;
  user_type: string;
  section: string;
  course_num: number;
}
