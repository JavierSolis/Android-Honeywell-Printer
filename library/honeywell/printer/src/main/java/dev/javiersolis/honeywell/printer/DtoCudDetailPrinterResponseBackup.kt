package dev.javiersolis.honeywell.printer
//import com.google.gson.annotations.SerializedName

class DtoCudDetailPrinterResponseBackup(
    //@SerializedName("id_cud")
    var idCud: Int = 0,

    //@SerializedName("cud")
    var cud: String = "",

    //@SerializedName("sku")
    var sku: String = "",
    //@SerializedName("sku_description")
    var skuDescription: String = "",
    //@SerializedName("cantidad")
    var cantidad: Int = 0,
    //@SerializedName("destinatario")
    var destinatario: String = "",
    //@SerializedName("dni")
    var dni: String = "",
    //@SerializedName("receptor")
    var receptor: String = "",
    //@SerializedName("dni_receptor")
    var dniReceptor: String = "",
    //@SerializedName("telefono")
    var telefono: String = "",
    //@SerializedName("departamento")
    var departamento: String = "",
    //@SerializedName("district_consumer")
    var districtConsumer: String = "",


    //@SerializedName("province_consumer")
    var provinceConsumer: String = "",
    //@SerializedName("date_send")
    var dataSend: String = "",


    //@SerializedName("address_consumer")
    var addressConsumer: String = "",
    //@SerializedName("address_reference")
    var addressReference: String = "",
    //@SerializedName("consumer_email")
    var consumerEmail: String = "",
    //@SerializedName("retail_name")
    var retailName: String = "",
    //@SerializedName("retail_address")
    var retailAddress: String = ""
)