
package WebServices;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ModificarCompraEquipo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ModificarCompraEquipo"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Id_Compra" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="Id_Proveedor" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="Id_Equipo" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="Cantidad" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="Precio" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="Descripcion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ModificarCompraEquipo", propOrder = {
    "idCompra",
    "idProveedor",
    "idEquipo",
    "cantidad",
    "precio",
    "descripcion"
})
public class ModificarCompraEquipo {

    @XmlElement(name = "Id_Compra")
    protected int idCompra;
    @XmlElement(name = "Id_Proveedor")
    protected int idProveedor;
    @XmlElement(name = "Id_Equipo")
    protected int idEquipo;
    @XmlElement(name = "Cantidad")
    protected int cantidad;
    @XmlElement(name = "Precio")
    protected double precio;
    @XmlElement(name = "Descripcion")
    protected String descripcion;

    /**
     * Gets the value of the idCompra property.
     * 
     */
    public int getIdCompra() {
        return idCompra;
    }

    /**
     * Sets the value of the idCompra property.
     * 
     */
    public void setIdCompra(int value) {
        this.idCompra = value;
    }

    /**
     * Gets the value of the idProveedor property.
     * 
     */
    public int getIdProveedor() {
        return idProveedor;
    }

    /**
     * Sets the value of the idProveedor property.
     * 
     */
    public void setIdProveedor(int value) {
        this.idProveedor = value;
    }

    /**
     * Gets the value of the idEquipo property.
     * 
     */
    public int getIdEquipo() {
        return idEquipo;
    }

    /**
     * Sets the value of the idEquipo property.
     * 
     */
    public void setIdEquipo(int value) {
        this.idEquipo = value;
    }

    /**
     * Gets the value of the cantidad property.
     * 
     */
    public int getCantidad() {
        return cantidad;
    }

    /**
     * Sets the value of the cantidad property.
     * 
     */
    public void setCantidad(int value) {
        this.cantidad = value;
    }

    /**
     * Gets the value of the precio property.
     * 
     */
    public double getPrecio() {
        return precio;
    }

    /**
     * Sets the value of the precio property.
     * 
     */
    public void setPrecio(double value) {
        this.precio = value;
    }

    /**
     * Gets the value of the descripcion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescripcion() {
        return descripcion;
    }

    /**
     * Sets the value of the descripcion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescripcion(String value) {
        this.descripcion = value;
    }

}
