import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { LoginComponent } from './components/user/login/login.component';
import { RegisterComponent } from './components/user/register/register.component';
import { ProfileComponent } from './components/user/profile/profile.component';
import { HomeComponent } from './components/user/home/home.component';
import { DetailComponent } from './components/user/detail/detail.component';
import { DashboardComponent } from './components/admin/dashboard/dashboard.component';
import { AdminUserListComponent } from './components/admin/admin-user-list/admin-user-list.component';
import { ProductListComponent } from './components/admin/product-list/product-list.component';
import { UserTemplateComponent } from './components/templates/user-template/user-template.component';
import { AdminTemplateComponent } from './components/templates/admin-template/admin-template.component';
import { NotFoundComponent } from './components/error/not-found/not-found.component';
import { UnauthorizzedComponent } from './components/error/unauthorizzed/unauthorizzed.component';
import { HttpClientModule } from '@angular/common/http';
import { FormsModule, ReactiveFormsModule } from '@angular/forms';
@NgModule({
  declarations: [
    AppComponent,
    LoginComponent,
    RegisterComponent,
    ProfileComponent,
    HomeComponent,
    DetailComponent,
    DashboardComponent,
    AdminUserListComponent,
    ProductListComponent,
    UserTemplateComponent,
    AdminTemplateComponent,
    NotFoundComponent,
    UnauthorizzedComponent,
  ],
  imports: [
    BrowserModule,
    HttpClientModule,
    FormsModule,
    ReactiveFormsModule,
    AppRoutingModule,
  ],
  providers: [],
  bootstrap: [AppComponent],
})
export class AppModule {}
