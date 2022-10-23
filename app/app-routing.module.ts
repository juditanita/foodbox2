import { HomeComponent } from './components/user/home/home.component';
import { NgModule, Component } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { LoginComponent } from './components/user/login/login.component';
import { RegisterComponent } from './components/user/register/register.component';
import { ProfileComponent } from './components/user/profile/profile.component';
import { DetailComponent } from './components/user/detail/detail.component';
import { DashboardComponent } from './components/admin/dashboard/dashboard.component';
import { AdminUserListComponent } from './components/admin/admin-user-list/admin-user-list.component';
import { ProductListComponent } from './components/admin/product-list/product-list.component';
import { NotFoundComponent } from './components/error/not-found/not-found.component';
import { UnauthorizzedComponent } from './components/error/unauthorizzed/unauthorizzed.component';

const routes: Routes = [
  {
    path: '',
    redirectTo: 'home',
    pathMatch: 'full',
    component: HomeComponent,
  },
  {
    path: 'home',
    component: HomeComponent,
  },
  {
    path: 'login',
    component: LoginComponent,
  },
  {
    path: 'register',
    component: RegisterComponent,
  },
  {
    path: 'profile',
    component: ProfileComponent,
  },
  {
    path: 'detail',
    component: DetailComponent,
  },
  {
    path: 'detail/:id',
    component: DetailComponent,
  },
  {
    path: 'dashboard',
    component: DashboardComponent,
  },
  {
    path: 'user-list',
    component: AdminUserListComponent,
  },
  {
    path: 'product-list',
    component: ProductListComponent,
  },
  {
    path: '404',
    component: NotFoundComponent,
  },
  {
    path: '401',
    component: UnauthorizzedComponent,
  },
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule],
})
export class AppRoutingModule {}
