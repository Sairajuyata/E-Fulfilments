import { Injectable } from '@angular/core';
import {HttpClient, HttpEvent, HttpRequest} from "@angular/common/http";
import {Observable} from "rxjs/index";

@Injectable({
  providedIn: 'root'
})
export class UploadFileService {

  constructor(private http: HttpClient) {}
  pushFileToStorage(file: File): Observable<HttpEvent<{}>> {
   const formdata: FormData = new FormData();
    formdata.append('file', file);
    const req = new HttpRequest('POST', 'http://localhost:8085/profile/uploadpicture', formdata, {
        reportProgress: true,
        responseType: 'text'
      }
    );
    return this.http.request(req);
  }


}
