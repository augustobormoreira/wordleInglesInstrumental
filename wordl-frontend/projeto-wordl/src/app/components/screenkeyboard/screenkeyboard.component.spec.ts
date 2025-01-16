import { ComponentFixture, TestBed } from '@angular/core/testing';

import { ScreenkeyboardComponent } from './screenkeyboard.component';

describe('ScreenkeyboardComponent', () => {
  let component: ScreenkeyboardComponent;
  let fixture: ComponentFixture<ScreenkeyboardComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ ScreenkeyboardComponent ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(ScreenkeyboardComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
