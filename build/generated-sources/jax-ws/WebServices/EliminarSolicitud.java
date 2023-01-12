
package WebServices;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for EliminarSolicitud complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EliminarSolicitud"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Id_Solcitud" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EliminarSolicitud", propOrder = {
    "idSolcitud"
})
public class EliminarSolicitud {

    @XmlElement(name = "Id_Solcitud")
    protected int idSolcitud;

    /**
     * Gets the value of the idSolcitud property.
     * 
     */
    public int getIdSolcitud() {
        return idSolcitud;
    }

    /**
     * Sets the value of the idSolcitud property.
     * 
     */
    public void setIdSolcitud(int value) {
        this.idSolcitud = value;
    }

}
