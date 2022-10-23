import { ComponentFixture, TestBed } from '@angular/core/testing';

import { UnauthorizzedComponent } from './unauthorizzed.component';

describe('UnauthorizzedComponent', () => {
  let component: UnauthorizzedComponent;
  let fixture: ComponentFixture<UnauthorizzedComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ UnauthorizzedComponent ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(UnauthorizzedComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
