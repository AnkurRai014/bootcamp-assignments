import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { Category } from 'src/app/common/category';
import { ProductManagementServiceService } from 'src/app/services/product-management-service.service';

@Component({
  selector: 'app-cat-form',
  templateUrl: './cat-form.component.html',
  styleUrls: ['./cat-form.component.css']
})
export class CatFormComponent implements OnInit {

  category: Category = new Category(0,"");

  constructor(private catService: ProductManagementServiceService ,private route: Router) { }

  ngOnInit(): void {
  }

  onSubmit(){
    this.catService.saveCategory(this.category).subscribe(data =>{
      console.log(this.category);
      this.route.navigateByUrl("/categories")
    });
  }

  goHome(){
    this.route.navigateByUrl("/");
  }
}
