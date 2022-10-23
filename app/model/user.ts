import { Role } from './role';

export class User {
  id!: number;
  username: string = '';
  firstName: string = '';
  lastName: string = '';
  email: string = '';
  password: string = '';
  role!: Role;
}
