/* tslint:disable */
/* eslint-disable */
// Generated using typescript-generator version 3.2.1263 on 2025-12-30 14:22:59.

export interface FormDto {
    id: ObjectId;
    user: string;
    createdAt: Date;
    components: FormComponent[];
}

export interface FormResponseDto {
    formId: ObjectId;
    user: string;
    submittedAt: Date;
    answers: { [index: string]: any };
}

export interface ObjectId extends Comparable<ObjectId>, Serializable {
    timestamp: number;
    date: Date;
}

export interface FormComponent {
    name: string;
    type: HtmlElement;
    label: string;
}

export interface Serializable {
}

export interface Comparable<T> {
}

export type HtmlElement = "textarea";
