
package WebServices;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ModificarEmpleado complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ModificarEmpleado"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Id_Empleado" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="Nombre" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Apellido" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Codigo_Empleado" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Correo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Cargo" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="Departamento" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="Estado" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ModificarEmpleado", propOrder = {
    "idEmpleado",
    "nombre",
    "apellido",
    "codigoEmpleado",
    "correo",
    "cargo",
    "departamento",
    "estado"
})
public class ModificarEmpleado {

    @XmlElement(name = "Id_Empleado")
    protected int idEmpleado;
    @XmlElement(name = "Nombre")
    protected String nombre;
    @XmlElement(name = "Apellido")
    protected String apellido;
    @XmlElement(name = "Codigo_Empleado")
    protected String codigoEmpleado;
    @XmlElement(name = "Correo")
    protected String correo;
    @XmlElement(name = "Cargo")
    protected int cargo;
    @XmlElement(name = "Departamento")
    protected int departamento;
    @XmlElement(name = "Estado")
    protected Boolean estado;

    /**
     * Gets the value of the idEmpleado property.
     * 
     */
    public int getIdEmpleado() {
        return idEmpleado;
    }

    /**
     * Sets the value of the idEmpleado property.
     * 
     */
    public void setIdEmpleado(int value) {
        this.idEmpleado = value;
    }

    /**
     * Gets the value of the nombre property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Sets the value of the nombre property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNombre(String value) {
        this.nombre = value;
    }

    /**
     * Gets the value of the apellido property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getApellido() {
        return apellido;
    }

    /**
     * Sets the value of the apellido property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setApellido(String value) {
        this.apellido = value;
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
     * Gets the value of the cargo property.
     * 
     */
    public int getCargo() {
        return cargo;
    }

    /**
     * Sets the value of the cargo property.
     * 
     */
    public void setCargo(int value) {
        this.cargo = value;
    }

    /**
     * Gets the value of the departamento property.
     * 
     */
    public int getDepartamento() {
        return departamento;
    }

    /**
     * Sets the value of the departamento property.
     * 
     */
    public void setDepartamento(int value) {
        this.departamento = value;
    }

    /**
     * Gets the value of the estado property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isEstado() {
        return estado;
    }

    /**
     * Sets the value of the estado property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setEstado(Boolean value) {
        this.estado = value;
    }

}
