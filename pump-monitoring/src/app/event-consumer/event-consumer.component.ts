import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-event-consumer',
  templateUrl: './event-consumer.component.html',
  styleUrls: ['./event-consumer.component.css']
})
export class EventConsumerComponent implements OnInit {

  constructor() { }

  ngOnInit() {
  }

  onConsume($event){
    console.log("Event consumed "+$event);
  }

}
