import { Component, inject, OnInit, signal } from '@angular/core';
import { MAT_DIALOG_DATA } from '@angular/material/dialog';
import { FormComponent, FormDto } from '../models/model';
import {
  FormArray,
  FormBuilder,
  FormControl,
  FormGroup,
  ReactiveFormsModule,
} from '@angular/forms';
import { MatFormFieldModule } from '@angular/material/form-field';

interface DynamicForm {
  [key: string]: FormControl;
}

@Component({
  selector: 'app-form-renderer',
  imports: [ReactiveFormsModule, MatFormFieldModule],
  templateUrl: './form-renderer.html',
  styleUrl: './form-renderer.scss',
})
export class FormRenderer {
  private form: FormDto = inject(MAT_DIALOG_DATA);
  private fb = inject(FormBuilder);
  formPreview = this.createForm(this.form);
  formComponents = signal(this.form.components);

  createForm(form: FormDto) {
    return this.fb.group({
      components: this.fb.group(this.renderFormAsObject(form)),
    });
  }

  renderFormAsObject(form: FormDto) {
    let result: DynamicForm = {};
    form.components.forEach((it) => {
      result[it.name] = new FormControl('');
    });
    return result;
  }

  onSubmit() {
    console.log(this.formPreview.value);
  }
}
