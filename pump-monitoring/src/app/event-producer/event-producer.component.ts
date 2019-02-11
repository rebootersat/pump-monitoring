import { Component, OnInit, EventEmitter, Output } from '@angular/core';

@Component({
  selector: 'app-event-producer',
  templateUrl: './event-producer.component.html',
  styleUrls: ['./event-producer.component.css']
})
export class EventProducerComponent implements OnInit {

  private data:number;

  @Output() public onProduceEvent:EventEmitter<number> = new EventEmitter<number>();

  constructor() { }

  ngOnInit() {
    this.data = 0;
  }

  onProduce(){
    this.data = this.data + 1;
    console.log("Event produced "+this.data);
    this.onProduceEvent.emit(this.data);
  }

}
