
package WebServices;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for equipos complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="equipos"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="caracteristicas" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="equipo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="error" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="estado" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="fecha_Registro" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="idTipoEquipo" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="id_Equipo" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="marca" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="modelo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="serie" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="stock" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "equipos", propOrder = {
    "caracteristicas",
    "equipo",
    "error",
    "estado",
    "fechaRegistro",
    "idTipoEquipo",
    "idEquipo",
    "marca",
    "modelo",
    "serie",
    "stock"
})
public class Equipos {

    protected String caracteristicas;
    protected String equipo;
    protected String error;
    protected int estado;
    @XmlElement(name = "fecha_Registro")
    protected String fechaRegistro;
    protected int idTipoEquipo;
    @XmlElement(name = "id_Equipo")
    protected int idEquipo;
    protected String marca;
    protected String modelo;
    protected String serie;
    protected String stock;

    /**
     * Gets the value of the caracteristicas property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCaracteristicas() {
        return caracteristicas;
    }

    /**
     * Sets the value of the caracteristicas property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCaracteristicas(String value) {
        this.caracteristicas = value;
    }

    /**
     * Gets the value of the equipo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEquipo() {
        return equipo;
    }

    /**
     * Sets the value of the equipo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEquipo(String value) {
        this.equipo = value;
    }

    /**
     * Gets the value of the error property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getError() {
        return error;
    }

    /**
     * Sets the value of the error property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setError(String value) {
        this.error = value;
    }

    /**
     * Gets the value of the estado property.
     * 
     */
    public int getEstado() {
        return estado;
    }

    /**
     * Sets the value of the estado property.
     * 
     */
    public void setEstado(int value) {
        this.estado = value;
    }

    /**
     * Gets the value of the fechaRegistro property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFechaRegistro() {
        return fechaRegistro;
    }

    /**
     * Sets the value of the fechaRegistro property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFechaRegistro(String value) {
        this.fechaRegistro = value;
    }

    /**
     * Gets the value of the idTipoEquipo property.
     * 
     */
    public int getIdTipoEquipo() {
        return idTipoEquipo;
    }

    /**
     * Sets the value of the idTipoEquipo property.
     * 
     */
    public void setIdTipoEquipo(int value) {
        this.idTipoEquipo = value;
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
     * Gets the value of the marca property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMarca() {
        return marca;
    }

    /**
     * Sets the value of the marca property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMarca(String value) {
        this.marca = value;
    }

    /**
     * Gets the value of the modelo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getModelo() {
        return modelo;
    }

    /**
     * Sets the value of the modelo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setModelo(String value) {
        this.modelo = value;
    }

    /**
     * Gets the value of the serie property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSerie() {
        return serie;
    }

    /**
     * Sets the value of the serie property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSerie(String value) {
        this.serie = value;
    }

    /**
     * Gets the value of the stock property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStock() {
        return stock;
    }

    /**
     * Sets the value of the stock property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStock(String value) {
        this.stock = value;
    }

}
