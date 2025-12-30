import { Component } from '@angular/core';
import { RouterOutlet } from '@angular/router';
import { FormRenderer } from './form-renderer/form-renderer';

@Component({
  selector: 'app-root',
  imports: [RouterOutlet, FormRenderer],
  templateUrl: './app.html',
  styleUrl: './app.scss'
})
export class App {
}
