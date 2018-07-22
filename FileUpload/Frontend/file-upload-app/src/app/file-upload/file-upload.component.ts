import { Component, OnInit } from '@angular/core';
import { UploadFileService } from '../upload-file.service';
import {  HttpResponse } from '@angular/common/http';

@Component({
  selector: 'app-file-upload',
  templateUrl: './file-upload.component.html',
  styleUrls: ['./file-upload.component.css'],
  providers: [UploadFileService]
})
export class FileUploadComponent implements OnInit {

  selectedFiles: FileList;
  currentFileUpload: File;
  constructor(private uploadService: UploadFileService) {}
  selectFile(event) {
    this.selectedFiles = event.target.files;
  }
  upload() {
    this.currentFileUpload = this.selectedFiles.item(0);
    this.uploadService.pushFileToStorage(this.currentFileUpload).subscribe(event => {
      if (event instanceof HttpResponse) {
        console.log('File is completely uploaded!');
      }
    });
    this.selectedFiles = undefined;
  }

  ngOnInit() {
  }

}
