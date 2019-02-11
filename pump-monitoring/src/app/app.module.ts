import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { EventProducerComponent } from './event-producer/event-producer.component';
import { EventConsumerComponent } from './event-consumer/event-consumer.component';
import { AssetConfigComponent } from './asset-config/asset-config.component';
import { ModelTrainingComponent } from './model-training/model-training.component';
import { AssetAnalysisComponent } from './asset-analysis/asset-analysis.component';
import { ReportComponent } from './report/report.component';

@NgModule({
  declarations: [
    AppComponent,
    EventProducerComponent,
    EventConsumerComponent,
    AssetConfigComponent,
    ModelTrainingComponent,
    AssetAnalysisComponent,
    ReportComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
