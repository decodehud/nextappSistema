
package WebServices;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for BuscarSolicitud complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BuscarSolicitud"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Id_Solicitud" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="Codigo_Empleado" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Correo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
@XmlType(name = "BuscarSolicitud", propOrder = {
    "idSolicitud",
    "codigoEmpleado",
    "correo",
    "estado"
})
public class BuscarSolicitud {

    @XmlElement(name = "Id_Solicitud")
    protected int idSolicitud;
    @XmlElement(name = "Codigo_Empleado")
    protected String codigoEmpleado;
    @XmlElement(name = "Correo")
    protected String correo;
    @XmlElement(name = "Estado")
    protected String estado;

    /**
     * Gets the value of the idSolicitud property.
     * 
     */
    public int getIdSolicitud() {
        return idSolicitud;
    }

    /**
     * Sets the value of the idSolicitud property.
     * 
     */
    public void setIdSolicitud(int value) {
        this.idSolicitud = value;
    }

    /**
     * Gets the value of the codigoEmpleado property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodigoEmpleado() {
        return codigoEmpleado;
    }

    /**
     * Sets the value of the codigoEmpleado property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodigoEmpleado(String value) {
        this.codigoEmpleado = value;
    }

    /**
     * Gets the value of the correo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCorreo() {
        return correo;
    }

    /**
     * Sets the value of the correo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCorreo(String value) {
        this.correo = value;
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
