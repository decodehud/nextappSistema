
package WebServices;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for privilegiosGT complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="privilegiosGT"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="error" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="idPrivilegio" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="privilegio" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "privilegiosGT", propOrder = {
    "error",
    "idPrivilegio",
    "privilegio"
})
public class PrivilegiosGT {

    protected String error;
    protected int idPrivilegio;
    protected String privilegio;

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
     * Gets the value of the idPrivilegio property.
     * 
     */
    public int getIdPrivilegio() {
        return idPrivilegio;
    }

    /**
     * Sets the value of the idPrivilegio property.
     * 
     */
    public void setIdPrivilegio(int value) {
        this.idPrivilegio = value;
    }

    /**
     * Gets the value of the privilegio property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrivilegio() {
        return privilegio;
    }

    /**
     * Sets the value of the privilegio property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrivilegio(String value) {
        this.privilegio = value;
    }

}
