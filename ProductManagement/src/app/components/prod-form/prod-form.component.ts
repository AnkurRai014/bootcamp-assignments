import { Component, OnInit } from '@angular/core';
import { Route, Router } from '@angular/router';
import { Category } from 'src/app/common/category';
import { Product } from 'src/app/common/product';
import { ProductManagementServiceService } from 'src/app/services/product-management-service.service';

@Component({
  selector: 'app-prod-form',
  templateUrl: './prod-form.component.html',
  styleUrls: ['./prod-form.component.css']
})
export class ProdFormComponent implements OnInit {

  product: Product = new Product(0,"","","",0,"",0,new Date(),new Date(),0);
  categories: Category[]
  constructor(private prodService: ProductManagementServiceService, private route: Router) { }

  ngOnInit(): void {
    this.listOfCategories();
  }

  onSubmit(){
    this.prodService.saveProduct(this.product).subscribe(data =>{
      console.log(this.product);
      this.route.navigateByUrl("/products")
    });
    
  }

  listOfCategories(){
    this.prodService.getAllCategory().subscribe(data =>{
      console.log(data);
      this.categories = data;
    }
    )
  }

  goHome(){
    this.route.navigateByUrl("/");
  }
}
