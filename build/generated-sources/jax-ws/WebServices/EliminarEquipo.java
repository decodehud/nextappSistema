
package WebServices;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for EliminarEquipo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EliminarEquipo"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Id_Equipo" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EliminarEquipo", propOrder = {
    "idEquipo"
})
public class EliminarEquipo {

    @XmlElement(name = "Id_Equipo")
    protected int idEquipo;

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

}
