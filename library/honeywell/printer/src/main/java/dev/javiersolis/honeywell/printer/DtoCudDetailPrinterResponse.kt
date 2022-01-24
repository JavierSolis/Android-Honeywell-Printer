package dev.javiersolis.honeywell.printer
//import com.google.gson.annotations.SerializedName

class DtoCudDetailPrinterResponse(
    //@SerializedName("id_cud")
    var idCud: Int = 0,

    //@SerializedName("cud")
    var cud: String = "0984092830",

    //@SerializedName("sku")
    var sku: String = "09438584039",
    //@SerializedName("sku_description")
    var skuDescription: String = "Impresora de cuds 3000",
    //@SerializedName("cantidad")
    var cantidad: Int = 23,
    //@SerializedName("destinatario")
    var destinatario: String = "Jesus Salazar",
    //@SerializedName("dni")
    var dni: String = "09485948",
    //@SerializedName("receptor")
    var receptor: String = "Javier Solis",
    //@SerializedName("dni_receptor")
    var dniReceptor: String = "95859984",
    //@SerializedName("telefono")
    var telefono: String = "95498945",
    //@SerializedName("departamento")
    var departamento: String = "Lima",
    //@SerializedName("district_consumer")
    var districtConsumer: String = "Lima",


    //@SerializedName("province_consumer")
    var provinceConsumer: String = "Lima",
    //@SerializedName("date_send")
    var dataSend: String = "10/12/2021",


    //@SerializedName("address_consumer")
    var addressConsumer: String = "Mz",
    //@SerializedName("address_reference")
    var addressReference: String = "Esquina del grifo solmas",
    //@SerializedName("consumer_email")
    var consumerEmail: String = "",
    //@SerializedName("retail_name")
    var retailName: String = "",
    //@SerializedName("retail_address")
    var retailAddress: String = ""
)