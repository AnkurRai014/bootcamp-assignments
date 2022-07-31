export class Product {

    /*
    "prodId" : 101,
      "sku" : "IP1370",
      "name" : "Iphone 13 Pink 128GB",
      "description" : "Iphone 13 Pink 128GB 2 Back camera 12MP each and 1 front camera",
      "unitPrice" : 69999.0,
      "imageURL" : "iphone.html",
      "unitsInStock" : 20,
      "dateCreated" : "2021-09-19T18:30:00.000+00:00",
      "lastUpdated" : "2022-07-18T18:30:00.000+00:00",
      "categoryId" : 1,
    */
    constructor(public prodId: number,
                public sku: string,
                public name: string,
                public description: string,
                public unitPrice: number,
                public imageURL: string,
                public unitsInStock: number,
                public dateCreated: Date,
                public lastUpdated: Date,
                public categoryId: number
        ){

    }
}
