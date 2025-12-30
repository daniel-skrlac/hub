import { Component } from '@angular/core';
import { ReactiveFormsModule } from '@angular/forms';
import { FormService } from '../services/form-service';
import { inject, signal } from '@angular/core';

@Component({
  selector: 'app-form-renderer',
  imports: [ReactiveFormsModule],
  templateUrl: './form-renderer.html',
  styleUrl: './form-renderer.scss',
})
export class FormRenderer {

  protected title = signal('hub-frontend');
  private formService: FormService = inject(FormService);

  public name() {
    this.formService.getForms("string").subscribe(it => this.title.set(it.at(0)?.user || "empty"));
  }
}
