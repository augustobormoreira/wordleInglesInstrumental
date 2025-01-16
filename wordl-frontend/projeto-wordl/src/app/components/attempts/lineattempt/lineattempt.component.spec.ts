import { ComponentFixture, TestBed } from '@angular/core/testing';

import { LineattemptComponent } from './lineattempt.component';

describe('LineattemptComponent', () => {
  let component: LineattemptComponent;
  let fixture: ComponentFixture<LineattemptComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ LineattemptComponent ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(LineattemptComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
