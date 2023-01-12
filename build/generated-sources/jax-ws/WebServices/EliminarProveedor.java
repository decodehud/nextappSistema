
package WebServices;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for EliminarProveedor complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EliminarProveedor"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Id_Proveedor" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EliminarProveedor", propOrder = {
    "idProveedor"
})
public class EliminarProveedor {

    @XmlElement(name = "Id_Proveedor")
    protected int idProveedor;

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

}
