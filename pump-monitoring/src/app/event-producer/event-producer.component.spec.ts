import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { EventProducerComponent } from './event-producer.component';

describe('EventProducerComponent', () => {
  let component: EventProducerComponent;
  let fixture: ComponentFixture<EventProducerComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ EventProducerComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(EventProducerComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
