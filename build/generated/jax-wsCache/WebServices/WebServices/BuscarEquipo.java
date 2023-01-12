
package WebServices;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for BuscarEquipo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BuscarEquipo"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Id_Equipo" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="Modelo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Serie" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="IdTipoEquipo" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="Estado" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BuscarEquipo", propOrder = {
    "idEquipo",
    "modelo",
    "serie",
    "idTipoEquipo",
    "estado"
})
public class BuscarEquipo {

    @XmlElement(name = "Id_Equipo")
    protected int idEquipo;
    @XmlElement(name = "Modelo")
    protected String modelo;
    @XmlElement(name = "Serie")
    protected String serie;
    @XmlElement(name = "IdTipoEquipo")
    protected int idTipoEquipo;
    @XmlElement(name = "Estado")
    protected String estado;

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
     * Gets the value of the estado property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEstado() {
        return estado;
    }

    /**
     * Sets the value of the estado property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEstado(String value) {
        this.estado = value;
    }

}
