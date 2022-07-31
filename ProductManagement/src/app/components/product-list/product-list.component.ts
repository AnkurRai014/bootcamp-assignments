import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { Product } from 'src/app/common/product';
import { ProductManagementServiceService } from 'src/app/services/product-management-service.service';

@Component({
  selector: 'app-product-list',
  templateUrl: './product-list.component.html',
  styleUrls: ['./product-list.component.css']
})
export class ProductListComponent implements OnInit {

  products : Product[]
  constructor(private service : ProductManagementServiceService, private route:Router) { }

  ngOnInit(): void {
    this.listOfProducts();
  }

  // showProduct(){
  //   this.route.navigateByUrl("/products")
  // }

  listOfProducts(){
    this.service.getAllProduct().subscribe(data =>{
      console.log(data);
      this.products = data
    }
    )
  }
}
