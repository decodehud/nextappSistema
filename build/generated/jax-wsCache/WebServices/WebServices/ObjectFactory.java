
package WebServices;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the WebServices package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _ActualizarSolicitud_QNAME = new QName("http://WebServices/", "ActualizarSolicitud");
    private final static QName _ActualizarSolicitudResponse_QNAME = new QName("http://WebServices/", "ActualizarSolicitudResponse");
    private final static QName _AgregarCompraEquipo_QNAME = new QName("http://WebServices/", "AgregarCompraEquipo");
    private final static QName _AgregarCompraEquipoResponse_QNAME = new QName("http://WebServices/", "AgregarCompraEquipoResponse");
    private final static QName _AgregarEmpleado_QNAME = new QName("http://WebServices/", "AgregarEmpleado");
    private final static QName _AgregarEmpleadoResponse_QNAME = new QName("http://WebServices/", "AgregarEmpleadoResponse");
    private final static QName _AgregarEquipo_QNAME = new QName("http://WebServices/", "AgregarEquipo");
    private final static QName _AgregarEquipoResponse_QNAME = new QName("http://WebServices/", "AgregarEquipoResponse");
    private final static QName _AgregarProveedor_QNAME = new QName("http://WebServices/", "AgregarProveedor");
    private final static QName _AgregarProveedorResponse_QNAME = new QName("http://WebServices/", "AgregarProveedorResponse");
    private final static QName _AgregarSolicitudEquipo_QNAME = new QName("http://WebServices/", "AgregarSolicitudEquipo");
    private final static QName _AgregarSolicitudEquipoResponse_QNAME = new QName("http://WebServices/", "AgregarSolicitudEquipoResponse");
    private final static QName _AgregarUsuario_QNAME = new QName("http://WebServices/", "AgregarUsuario");
    private final static QName _AgregarUsuarioResponse_QNAME = new QName("http://WebServices/", "AgregarUsuarioResponse");
    private final static QName _BuscarEmpleado_QNAME = new QName("http://WebServices/", "BuscarEmpleado");
    private final static QName _BuscarEmpleadoResponse_QNAME = new QName("http://WebServices/", "BuscarEmpleadoResponse");
    private final static QName _BuscarEquipo_QNAME = new QName("http://WebServices/", "BuscarEquipo");
    private final static QName _BuscarEquipoResponse_QNAME = new QName("http://WebServices/", "BuscarEquipoResponse");
    private final static QName _BuscarProveedor_QNAME = new QName("http://WebServices/", "BuscarProveedor");
    private final static QName _BuscarProveedorResponse_QNAME = new QName("http://WebServices/", "BuscarProveedorResponse");
    private final static QName _BuscarSolicitud_QNAME = new QName("http://WebServices/", "BuscarSolicitud");
    private final static QName _BuscarSolicitudResponse_QNAME = new QName("http://WebServices/", "BuscarSolicitudResponse");
    private final static QName _BuscarUsuario_QNAME = new QName("http://WebServices/", "BuscarUsuario");
    private final static QName _BuscarUsuarioResponse_QNAME = new QName("http://WebServices/", "BuscarUsuarioResponse");
    private final static QName _CrearSolicitud_QNAME = new QName("http://WebServices/", "CrearSolicitud");
    private final static QName _CrearSolicitudResponse_QNAME = new QName("http://WebServices/", "CrearSolicitudResponse");
    private final static QName _EliminarCompraEquipo_QNAME = new QName("http://WebServices/", "EliminarCompraEquipo");
    private final static QName _EliminarCompraEquipoResponse_QNAME = new QName("http://WebServices/", "EliminarCompraEquipoResponse");
    private final static QName _EliminarEmpleados_QNAME = new QName("http://WebServices/", "EliminarEmpleados");
    private final static QName _EliminarEmpleadosResponse_QNAME = new QName("http://WebServices/", "EliminarEmpleadosResponse");
    private final static QName _EliminarEquipo_QNAME = new QName("http://WebServices/", "EliminarEquipo");
    private final static QName _EliminarEquipoResponse_QNAME = new QName("http://WebServices/", "EliminarEquipoResponse");
    private final static QName _EliminarProveedor_QNAME = new QName("http://WebServices/", "EliminarProveedor");
    private final static QName _EliminarProveedorResponse_QNAME = new QName("http://WebServices/", "EliminarProveedorResponse");
    private final static QName _EliminarSolicitud_QNAME = new QName("http://WebServices/", "EliminarSolicitud");
    private final static QName _EliminarSolicitudResponse_QNAME = new QName("http://WebServices/", "EliminarSolicitudResponse");
    private final static QName _EliminarUsuario_QNAME = new QName("http://WebServices/", "EliminarUsuario");
    private final static QName _EliminarUsuarioResponse_QNAME = new QName("http://WebServices/", "EliminarUsuarioResponse");
    private final static QName _ListarCargoEmpleado_QNAME = new QName("http://WebServices/", "ListarCargoEmpleado");
    private final static QName _ListarCargoEmpleadoResponse_QNAME = new QName("http://WebServices/", "ListarCargoEmpleadoResponse");
    private final static QName _ListarCompras_QNAME = new QName("http://WebServices/", "ListarCompras");
    private final static QName _ListarComprasResponse_QNAME = new QName("http://WebServices/", "ListarComprasResponse");
    private final static QName _ListarDepartEmp_QNAME = new QName("http://WebServices/", "ListarDepartEmp");
    private final static QName _ListarDepartEmpResponse_QNAME = new QName("http://WebServices/", "ListarDepartEmpResponse");
    private final static QName _ListarEmpleados_QNAME = new QName("http://WebServices/", "ListarEmpleados");
    private final static QName _ListarEmpleadosResponse_QNAME = new QName("http://WebServices/", "ListarEmpleadosResponse");
    private final static QName _ListarEquipos_QNAME = new QName("http://WebServices/", "ListarEquipos");
    private final static QName _ListarEquiposResponse_QNAME = new QName("http://WebServices/", "ListarEquiposResponse");
    private final static QName _ListarMarca_QNAME = new QName("http://WebServices/", "ListarMarca");
    private final static QName _ListarMarcaResponse_QNAME = new QName("http://WebServices/", "ListarMarcaResponse");
    private final static QName _ListarProvedores_QNAME = new QName("http://WebServices/", "ListarProvedores");
    private final static QName _ListarProvedoresResponse_QNAME = new QName("http://WebServices/", "ListarProvedoresResponse");
    private final static QName _ListarUsuario_QNAME = new QName("http://WebServices/", "ListarUsuario");
    private final static QName _ListarUsuarioResponse_QNAME = new QName("http://WebServices/", "ListarUsuarioResponse");
    private final static QName _ModificarCompraEquipo_QNAME = new QName("http://WebServices/", "ModificarCompraEquipo");
    private final static QName _ModificarCompraEquipoResponse_QNAME = new QName("http://WebServices/", "ModificarCompraEquipoResponse");
    private final static QName _ModificarEmpleado_QNAME = new QName("http://WebServices/", "ModificarEmpleado");
    private final static QName _ModificarEmpleadoResponse_QNAME = new QName("http://WebServices/", "ModificarEmpleadoResponse");
    private final static QName _ModificarEquipo_QNAME = new QName("http://WebServices/", "ModificarEquipo");
    private final static QName _ModificarEquipoResponse_QNAME = new QName("http://WebServices/", "ModificarEquipoResponse");
    private final static QName _ModificarProveedor_QNAME = new QName("http://WebServices/", "ModificarProveedor");
    private final static QName _ModificarProveedorResponse_QNAME = new QName("http://WebServices/", "ModificarProveedorResponse");
    private final static QName _ModificarSolicitud_QNAME = new QName("http://WebServices/", "ModificarSolicitud");
    private final static QName _ModificarSolicitudResponse_QNAME = new QName("http://WebServices/", "ModificarSolicitudResponse");
    private final static QName _ModificarUsuario_QNAME = new QName("http://WebServices/", "ModificarUsuario");
    private final static QName _ModificarUsuarioResponse_QNAME = new QName("http://WebServices/", "ModificarUsuarioResponse");
    private final static QName _TecnicoAsignado_QNAME = new QName("http://WebServices/", "TecnicoAsignado");
    private final static QName _TecnicoAsignadoResponse_QNAME = new QName("http://WebServices/", "TecnicoAsignadoResponse");
    private final static QName _TipoEquipo_QNAME = new QName("http://WebServices/", "TipoEquipo");
    private final static QName _TipoEquipoResponse_QNAME = new QName("http://WebServices/", "TipoEquipoResponse");
    private final static QName _ValidarUsuario_QNAME = new QName("http://WebServices/", "ValidarUsuario");
    private final static QName _ValidarUsuarioResponse_QNAME = new QName("http://WebServices/", "ValidarUsuarioResponse");
    private final static QName _MostrarProveedores_QNAME = new QName("http://WebServices/", "mostrarProveedores");
    private final static QName _MostrarProveedoresResponse_QNAME = new QName("http://WebServices/", "mostrarProveedoresResponse");
    private final static QName _Privilegios_QNAME = new QName("http://WebServices/", "privilegios");
    private final static QName _PrivilegiosResponse_QNAME = new QName("http://WebServices/", "privilegiosResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: WebServices
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ActualizarSolicitud }
     * 
     */
    public ActualizarSolicitud createActualizarSolicitud() {
        return new ActualizarSolicitud();
    }

    /**
     * Create an instance of {@link ActualizarSolicitudResponse }
     * 
     */
    public ActualizarSolicitudResponse createActualizarSolicitudResponse() {
        return new ActualizarSolicitudResponse();
    }

    /**
     * Create an instance of {@link AgregarCompraEquipo }
     * 
     */
    public AgregarCompraEquipo createAgregarCompraEquipo() {
        return new AgregarCompraEquipo();
    }

    /**
     * Create an instance of {@link AgregarCompraEquipoResponse }
     * 
     */
    public AgregarCompraEquipoResponse createAgregarCompraEquipoResponse() {
        return new AgregarCompraEquipoResponse();
    }

    /**
     * Create an instance of {@link AgregarEmpleado }
     * 
     */
    public AgregarEmpleado createAgregarEmpleado() {
        return new AgregarEmpleado();
    }

    /**
     * Create an instance of {@link AgregarEmpleadoResponse }
     * 
     */
    public AgregarEmpleadoResponse createAgregarEmpleadoResponse() {
        return new AgregarEmpleadoResponse();
    }

    /**
     * Create an instance of {@link AgregarEquipo }
     * 
     */
    public AgregarEquipo createAgregarEquipo() {
        return new AgregarEquipo();
    }

    /**
     * Create an instance of {@link AgregarEquipoResponse }
     * 
     */
    public AgregarEquipoResponse createAgregarEquipoResponse() {
        return new AgregarEquipoResponse();
    }

    /**
     * Create an instance of {@link AgregarProveedor }
     * 
     */
    public AgregarProveedor createAgregarProveedor() {
        return new AgregarProveedor();
    }

    /**
     * Create an instance of {@link AgregarProveedorResponse }
     * 
     */
    public AgregarProveedorResponse createAgregarProveedorResponse() {
        return new AgregarProveedorResponse();
    }

    /**
     * Create an instance of {@link AgregarSolicitudEquipo }
     * 
     */
    public AgregarSolicitudEquipo createAgregarSolicitudEquipo() {
        return new AgregarSolicitudEquipo();
    }

    /**
     * Create an instance of {@link AgregarSolicitudEquipoResponse }
     * 
     */
    public AgregarSolicitudEquipoResponse createAgregarSolicitudEquipoResponse() {
        return new AgregarSolicitudEquipoResponse();
    }

    /**
     * Create an instance of {@link AgregarUsuario }
     * 
     */
    public AgregarUsuario createAgregarUsuario() {
        return new AgregarUsuario();
    }

    /**
     * Create an instance of {@link AgregarUsuarioResponse }
     * 
     */
    public AgregarUsuarioResponse createAgregarUsuarioResponse() {
        return new AgregarUsuarioResponse();
    }

    /**
     * Create an instance of {@link BuscarEmpleado }
     * 
     */
    public BuscarEmpleado createBuscarEmpleado() {
        return new BuscarEmpleado();
    }

    /**
     * Create an instance of {@link BuscarEmpleadoResponse }
     * 
     */
    public BuscarEmpleadoResponse createBuscarEmpleadoResponse() {
        return new BuscarEmpleadoResponse();
    }

    /**
     * Create an instance of {@link BuscarEquipo }
     * 
     */
    public BuscarEquipo createBuscarEquipo() {
        return new BuscarEquipo();
    }

    /**
     * Create an instance of {@link BuscarEquipoResponse }
     * 
     */
    public BuscarEquipoResponse createBuscarEquipoResponse() {
        return new BuscarEquipoResponse();
    }

    /**
     * Create an instance of {@link BuscarProveedor }
     * 
     */
    public BuscarProveedor createBuscarProveedor() {
        return new BuscarProveedor();
    }

    /**
     * Create an instance of {@link BuscarProveedorResponse }
     * 
     */
    public BuscarProveedorResponse createBuscarProveedorResponse() {
        return new BuscarProveedorResponse();
    }

    /**
     * Create an instance of {@link BuscarSolicitud }
     * 
     */
    public BuscarSolicitud createBuscarSolicitud() {
        return new BuscarSolicitud();
    }

    /**
     * Create an instance of {@link BuscarSolicitudResponse }
     * 
     */
    public BuscarSolicitudResponse createBuscarSolicitudResponse() {
        return new BuscarSolicitudResponse();
    }

    /**
     * Create an instance of {@link BuscarUsuario }
     * 
     */
    public BuscarUsuario createBuscarUsuario() {
        return new BuscarUsuario();
    }

    /**
     * Create an instance of {@link BuscarUsuarioResponse }
     * 
     */
    public BuscarUsuarioResponse createBuscarUsuarioResponse() {
        return new BuscarUsuarioResponse();
    }

    /**
     * Create an instance of {@link CrearSolicitud }
     * 
     */
    public CrearSolicitud createCrearSolicitud() {
        return new CrearSolicitud();
    }

    /**
     * Create an instance of {@link CrearSolicitudResponse }
     * 
     */
    public CrearSolicitudResponse createCrearSolicitudResponse() {
        return new CrearSolicitudResponse();
    }

    /**
     * Create an instance of {@link EliminarCompraEquipo }
     * 
     */
    public EliminarCompraEquipo createEliminarCompraEquipo() {
        return new EliminarCompraEquipo();
    }

    /**
     * Create an instance of {@link EliminarCompraEquipoResponse }
     * 
     */
    public EliminarCompraEquipoResponse createEliminarCompraEquipoResponse() {
        return new EliminarCompraEquipoResponse();
    }

    /**
     * Create an instance of {@link EliminarEmpleados }
     * 
     */
    public EliminarEmpleados createEliminarEmpleados() {
        return new EliminarEmpleados();
    }

    /**
     * Create an instance of {@link EliminarEmpleadosResponse }
     * 
     */
    public EliminarEmpleadosResponse createEliminarEmpleadosResponse() {
        return new EliminarEmpleadosResponse();
    }

    /**
     * Create an instance of {@link EliminarEquipo }
     * 
     */
    public EliminarEquipo createEliminarEquipo() {
        return new EliminarEquipo();
    }

    /**
     * Create an instance of {@link EliminarEquipoResponse }
     * 
     */
    public EliminarEquipoResponse createEliminarEquipoResponse() {
        return new EliminarEquipoResponse();
    }

    /**
     * Create an instance of {@link EliminarProveedor }
     * 
     */
    public EliminarProveedor createEliminarProveedor() {
        return new EliminarProveedor();
    }

    /**
     * Create an instance of {@link EliminarProveedorResponse }
     * 
     */
    public EliminarProveedorResponse createEliminarProveedorResponse() {
        return new EliminarProveedorResponse();
    }

    /**
     * Create an instance of {@link EliminarSolicitud }
     * 
     */
    public EliminarSolicitud createEliminarSolicitud() {
        return new EliminarSolicitud();
    }

    /**
     * Create an instance of {@link EliminarSolicitudResponse }
     * 
     */
    public EliminarSolicitudResponse createEliminarSolicitudResponse() {
        return new EliminarSolicitudResponse();
    }

    /**
     * Create an instance of {@link EliminarUsuario }
     * 
     */
    public EliminarUsuario createEliminarUsuario() {
        return new EliminarUsuario();
    }

    /**
     * Create an instance of {@link EliminarUsuarioResponse }
     * 
     */
    public EliminarUsuarioResponse createEliminarUsuarioResponse() {
        return new EliminarUsuarioResponse();
    }

    /**
     * Create an instance of {@link ListarCargoEmpleado }
     * 
     */
    public ListarCargoEmpleado createListarCargoEmpleado() {
        return new ListarCargoEmpleado();
    }

    /**
     * Create an instance of {@link ListarCargoEmpleadoResponse }
     * 
     */
    public ListarCargoEmpleadoResponse createListarCargoEmpleadoResponse() {
        return new ListarCargoEmpleadoResponse();
    }

    /**
     * Create an instance of {@link ListarCompras }
     * 
     */
    public ListarCompras createListarCompras() {
        return new ListarCompras();
    }

    /**
     * Create an instance of {@link ListarComprasResponse }
     * 
     */
    public ListarComprasResponse createListarComprasResponse() {
        return new ListarComprasResponse();
    }

    /**
     * Create an instance of {@link ListarDepartEmp }
     * 
     */
    public ListarDepartEmp createListarDepartEmp() {
        return new ListarDepartEmp();
    }

    /**
     * Create an instance of {@link ListarDepartEmpResponse }
     * 
     */
    public ListarDepartEmpResponse createListarDepartEmpResponse() {
        return new ListarDepartEmpResponse();
    }

    /**
     * Create an instance of {@link ListarEmpleados }
     * 
     */
    public ListarEmpleados createListarEmpleados() {
        return new ListarEmpleados();
    }

    /**
     * Create an instance of {@link ListarEmpleadosResponse }
     * 
     */
    public ListarEmpleadosResponse createListarEmpleadosResponse() {
        return new ListarEmpleadosResponse();
    }

    /**
     * Create an instance of {@link ListarEquipos }
     * 
     */
    public ListarEquipos createListarEquipos() {
        return new ListarEquipos();
    }

    /**
     * Create an instance of {@link ListarEquiposResponse }
     * 
     */
    public ListarEquiposResponse createListarEquiposResponse() {
        return new ListarEquiposResponse();
    }

    /**
     * Create an instance of {@link ListarMarca }
     * 
     */
    public ListarMarca createListarMarca() {
        return new ListarMarca();
    }

    /**
     * Create an instance of {@link ListarMarcaResponse }
     * 
     */
    public ListarMarcaResponse createListarMarcaResponse() {
        return new ListarMarcaResponse();
    }

    /**
     * Create an instance of {@link ListarProvedores }
     * 
     */
    public ListarProvedores createListarProvedores() {
        return new ListarProvedores();
    }

    /**
     * Create an instance of {@link ListarProvedoresResponse }
     * 
     */
    public ListarProvedoresResponse createListarProvedoresResponse() {
        return new ListarProvedoresResponse();
    }

    /**
     * Create an instance of {@link ListarUsuario }
     * 
     */
    public ListarUsuario createListarUsuario() {
        return new ListarUsuario();
    }

    /**
     * Create an instance of {@link ListarUsuarioResponse }
     * 
     */
    public ListarUsuarioResponse createListarUsuarioResponse() {
        return new ListarUsuarioResponse();
    }

    /**
     * Create an instance of {@link ModificarCompraEquipo }
     * 
     */
    public ModificarCompraEquipo createModificarCompraEquipo() {
        return new ModificarCompraEquipo();
    }

    /**
     * Create an instance of {@link ModificarCompraEquipoResponse }
     * 
     */
    public ModificarCompraEquipoResponse createModificarCompraEquipoResponse() {
        return new ModificarCompraEquipoResponse();
    }

    /**
     * Create an instance of {@link ModificarEmpleado }
     * 
     */
    public ModificarEmpleado createModificarEmpleado() {
        return new ModificarEmpleado();
    }

    /**
     * Create an instance of {@link ModificarEmpleadoResponse }
     * 
     */
    public ModificarEmpleadoResponse createModificarEmpleadoResponse() {
        return new ModificarEmpleadoResponse();
    }

    /**
     * Create an instance of {@link ModificarEquipo }
     * 
     */
    public ModificarEquipo createModificarEquipo() {
        return new ModificarEquipo();
    }

    /**
     * Create an instance of {@link ModificarEquipoResponse }
     * 
     */
    public ModificarEquipoResponse createModificarEquipoResponse() {
        return new ModificarEquipoResponse();
    }

    /**
     * Create an instance of {@link ModificarProveedor }
     * 
     */
    public ModificarProveedor createModificarProveedor() {
        return new ModificarProveedor();
    }

    /**
     * Create an instance of {@link ModificarProveedorResponse }
     * 
     */
    public ModificarProveedorResponse createModificarProveedorResponse() {
        return new ModificarProveedorResponse();
    }

    /**
     * Create an instance of {@link ModificarSolicitud }
     * 
     */
    public ModificarSolicitud createModificarSolicitud() {
        return new ModificarSolicitud();
    }

    /**
     * Create an instance of {@link ModificarSolicitudResponse }
     * 
     */
    public ModificarSolicitudResponse createModificarSolicitudResponse() {
        return new ModificarSolicitudResponse();
    }

    /**
     * Create an instance of {@link ModificarUsuario }
     * 
     */
    public ModificarUsuario createModificarUsuario() {
        return new ModificarUsuario();
    }

    /**
     * Create an instance of {@link ModificarUsuarioResponse }
     * 
     */
    public ModificarUsuarioResponse createModificarUsuarioResponse() {
        return new ModificarUsuarioResponse();
    }

    /**
     * Create an instance of {@link TecnicoAsignado }
     * 
     */
    public TecnicoAsignado createTecnicoAsignado() {
        return new TecnicoAsignado();
    }

    /**
     * Create an instance of {@link TecnicoAsignadoResponse }
     * 
     */
    public TecnicoAsignadoResponse createTecnicoAsignadoResponse() {
        return new TecnicoAsignadoResponse();
    }

    /**
     * Create an instance of {@link TipoEquipo }
     * 
     */
    public TipoEquipo createTipoEquipo() {
        return new TipoEquipo();
    }

    /**
     * Create an instance of {@link TipoEquipoResponse }
     * 
     */
    public TipoEquipoResponse createTipoEquipoResponse() {
        return new TipoEquipoResponse();
    }

    /**
     * Create an instance of {@link ValidarUsuario }
     * 
     */
    public ValidarUsuario createValidarUsuario() {
        return new ValidarUsuario();
    }

    /**
     * Create an instance of {@link ValidarUsuarioResponse }
     * 
     */
    public ValidarUsuarioResponse createValidarUsuarioResponse() {
        return new ValidarUsuarioResponse();
    }

    /**
     * Create an instance of {@link MostrarProveedores }
     * 
     */
    public MostrarProveedores createMostrarProveedores() {
        return new MostrarProveedores();
    }

    /**
     * Create an instance of {@link MostrarProveedoresResponse }
     * 
     */
    public MostrarProveedoresResponse createMostrarProveedoresResponse() {
        return new MostrarProveedoresResponse();
    }

    /**
     * Create an instance of {@link Privilegios }
     * 
     */
    public Privilegios createPrivilegios() {
        return new Privilegios();
    }

    /**
     * Create an instance of {@link PrivilegiosResponse }
     * 
     */
    public PrivilegiosResponse createPrivilegiosResponse() {
        return new PrivilegiosResponse();
    }

    /**
     * Create an instance of {@link LEmpleados }
     * 
     */
    public LEmpleados createLEmpleados() {
        return new LEmpleados();
    }

    /**
     * Create an instance of {@link PrivilegiosGT }
     * 
     */
    public PrivilegiosGT createPrivilegiosGT() {
        return new PrivilegiosGT();
    }

    /**
     * Create an instance of {@link Usuarios }
     * 
     */
    public Usuarios createUsuarios() {
        return new Usuarios();
    }

    /**
     * Create an instance of {@link Proveedores }
     * 
     */
    public Proveedores createProveedores() {
        return new Proveedores();
    }

    /**
     * Create an instance of {@link LMarca }
     * 
     */
    public LMarca createLMarca() {
        return new LMarca();
    }

    /**
     * Create an instance of {@link TipoEquipoGT }
     * 
     */
    public TipoEquipoGT createTipoEquipoGT() {
        return new TipoEquipoGT();
    }

    /**
     * Create an instance of {@link Tecnico }
     * 
     */
    public Tecnico createTecnico() {
        return new Tecnico();
    }

    /**
     * Create an instance of {@link Mproveedores }
     * 
     */
    public Mproveedores createMproveedores() {
        return new Mproveedores();
    }

    /**
     * Create an instance of {@link LCargoEmpleado }
     * 
     */
    public LCargoEmpleado createLCargoEmpleado() {
        return new LCargoEmpleado();
    }

    /**
     * Create an instance of {@link LUsuarios }
     * 
     */
    public LUsuarios createLUsuarios() {
        return new LUsuarios();
    }

    /**
     * Create an instance of {@link LCompras }
     * 
     */
    public LCompras createLCompras() {
        return new LCompras();
    }

    /**
     * Create an instance of {@link Equipos }
     * 
     */
    public Equipos createEquipos() {
        return new Equipos();
    }

    /**
     * Create an instance of {@link LProveedores }
     * 
     */
    public LProveedores createLProveedores() {
        return new LProveedores();
    }

    /**
     * Create an instance of {@link LEquipos }
     * 
     */
    public LEquipos createLEquipos() {
        return new LEquipos();
    }

    /**
     * Create an instance of {@link LDepartEmp }
     * 
     */
    public LDepartEmp createLDepartEmp() {
        return new LDepartEmp();
    }

    /**
     * Create an instance of {@link SolicitudEquipos }
     * 
     */
    public SolicitudEquipos createSolicitudEquipos() {
        return new SolicitudEquipos();
    }

    /**
     * Create an instance of {@link Empleados }
     * 
     */
    public Empleados createEmpleados() {
        return new Empleados();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ActualizarSolicitud }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ActualizarSolicitud }{@code >}
     */
    @XmlElementDecl(namespace = "http://WebServices/", name = "ActualizarSolicitud")
    public JAXBElement<ActualizarSolicitud> createActualizarSolicitud(ActualizarSolicitud value) {
        return new JAXBElement<ActualizarSolicitud>(_ActualizarSolicitud_QNAME, ActualizarSolicitud.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ActualizarSolicitudResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ActualizarSolicitudResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://WebServices/", name = "ActualizarSolicitudResponse")
    public JAXBElement<ActualizarSolicitudResponse> createActualizarSolicitudResponse(ActualizarSolicitudResponse value) {
        return new JAXBElement<ActualizarSolicitudResponse>(_ActualizarSolicitudResponse_QNAME, ActualizarSolicitudResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AgregarCompraEquipo }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link AgregarCompraEquipo }{@code >}
     */
    @XmlElementDecl(namespace = "http://WebServices/", name = "AgregarCompraEquipo")
    public JAXBElement<AgregarCompraEquipo> createAgregarCompraEquipo(AgregarCompraEquipo value) {
        return new JAXBElement<AgregarCompraEquipo>(_AgregarCompraEquipo_QNAME, AgregarCompraEquipo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AgregarCompraEquipoResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link AgregarCompraEquipoResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://WebServices/", name = "AgregarCompraEquipoResponse")
    public JAXBElement<AgregarCompraEquipoResponse> createAgregarCompraEquipoResponse(AgregarCompraEquipoResponse value) {
        return new JAXBElement<AgregarCompraEquipoResponse>(_AgregarCompraEquipoResponse_QNAME, AgregarCompraEquipoResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AgregarEmpleado }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link AgregarEmpleado }{@code >}
     */
    @XmlElementDecl(namespace = "http://WebServices/", name = "AgregarEmpleado")
    public JAXBElement<AgregarEmpleado> createAgregarEmpleado(AgregarEmpleado value) {
        return new JAXBElement<AgregarEmpleado>(_AgregarEmpleado_QNAME, AgregarEmpleado.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AgregarEmpleadoResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link AgregarEmpleadoResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://WebServices/", name = "AgregarEmpleadoResponse")
    public JAXBElement<AgregarEmpleadoResponse> createAgregarEmpleadoResponse(AgregarEmpleadoResponse value) {
        return new JAXBElement<AgregarEmpleadoResponse>(_AgregarEmpleadoResponse_QNAME, AgregarEmpleadoResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AgregarEquipo }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link AgregarEquipo }{@code >}
     */
    @XmlElementDecl(namespace = "http://WebServices/", name = "AgregarEquipo")
    public JAXBElement<AgregarEquipo> createAgregarEquipo(AgregarEquipo value) {
        return new JAXBElement<AgregarEquipo>(_AgregarEquipo_QNAME, AgregarEquipo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AgregarEquipoResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link AgregarEquipoResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://WebServices/", name = "AgregarEquipoResponse")
    public JAXBElement<AgregarEquipoResponse> createAgregarEquipoResponse(AgregarEquipoResponse value) {
        return new JAXBElement<AgregarEquipoResponse>(_AgregarEquipoResponse_QNAME, AgregarEquipoResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AgregarProveedor }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link AgregarProveedor }{@code >}
     */
    @XmlElementDecl(namespace = "http://WebServices/", name = "AgregarProveedor")
    public JAXBElement<AgregarProveedor> createAgregarProveedor(AgregarProveedor value) {
        return new JAXBElement<AgregarProveedor>(_AgregarProveedor_QNAME, AgregarProveedor.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AgregarProveedorResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link AgregarProveedorResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://WebServices/", name = "AgregarProveedorResponse")
    public JAXBElement<AgregarProveedorResponse> createAgregarProveedorResponse(AgregarProveedorResponse value) {
        return new JAXBElement<AgregarProveedorResponse>(_AgregarProveedorResponse_QNAME, AgregarProveedorResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AgregarSolicitudEquipo }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link AgregarSolicitudEquipo }{@code >}
     */
    @XmlElementDecl(namespace = "http://WebServices/", name = "AgregarSolicitudEquipo")
    public JAXBElement<AgregarSolicitudEquipo> createAgregarSolicitudEquipo(AgregarSolicitudEquipo value) {
        return new JAXBElement<AgregarSolicitudEquipo>(_AgregarSolicitudEquipo_QNAME, AgregarSolicitudEquipo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AgregarSolicitudEquipoResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link AgregarSolicitudEquipoResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://WebServices/", name = "AgregarSolicitudEquipoResponse")
    public JAXBElement<AgregarSolicitudEquipoResponse> createAgregarSolicitudEquipoResponse(AgregarSolicitudEquipoResponse value) {
        return new JAXBElement<AgregarSolicitudEquipoResponse>(_AgregarSolicitudEquipoResponse_QNAME, AgregarSolicitudEquipoResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AgregarUsuario }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link AgregarUsuario }{@code >}
     */
    @XmlElementDecl(namespace = "http://WebServices/", name = "AgregarUsuario")
    public JAXBElement<AgregarUsuario> createAgregarUsuario(AgregarUsuario value) {
        return new JAXBElement<AgregarUsuario>(_AgregarUsuario_QNAME, AgregarUsuario.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AgregarUsuarioResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link AgregarUsuarioResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://WebServices/", name = "AgregarUsuarioResponse")
    public JAXBElement<AgregarUsuarioResponse> createAgregarUsuarioResponse(AgregarUsuarioResponse value) {
        return new JAXBElement<AgregarUsuarioResponse>(_AgregarUsuarioResponse_QNAME, AgregarUsuarioResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BuscarEmpleado }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link BuscarEmpleado }{@code >}
     */
    @XmlElementDecl(namespace = "http://WebServices/", name = "BuscarEmpleado")
    public JAXBElement<BuscarEmpleado> createBuscarEmpleado(BuscarEmpleado value) {
        return new JAXBElement<BuscarEmpleado>(_BuscarEmpleado_QNAME, BuscarEmpleado.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BuscarEmpleadoResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link BuscarEmpleadoResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://WebServices/", name = "BuscarEmpleadoResponse")
    public JAXBElement<BuscarEmpleadoResponse> createBuscarEmpleadoResponse(BuscarEmpleadoResponse value) {
        return new JAXBElement<BuscarEmpleadoResponse>(_BuscarEmpleadoResponse_QNAME, BuscarEmpleadoResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BuscarEquipo }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link BuscarEquipo }{@code >}
     */
    @XmlElementDecl(namespace = "http://WebServices/", name = "BuscarEquipo")
    public JAXBElement<BuscarEquipo> createBuscarEquipo(BuscarEquipo value) {
        return new JAXBElement<BuscarEquipo>(_BuscarEquipo_QNAME, BuscarEquipo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BuscarEquipoResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link BuscarEquipoResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://WebServices/", name = "BuscarEquipoResponse")
    public JAXBElement<BuscarEquipoResponse> createBuscarEquipoResponse(BuscarEquipoResponse value) {
        return new JAXBElement<BuscarEquipoResponse>(_BuscarEquipoResponse_QNAME, BuscarEquipoResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BuscarProveedor }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link BuscarProveedor }{@code >}
     */
    @XmlElementDecl(namespace = "http://WebServices/", name = "BuscarProveedor")
    public JAXBElement<BuscarProveedor> createBuscarProveedor(BuscarProveedor value) {
        return new JAXBElement<BuscarProveedor>(_BuscarProveedor_QNAME, BuscarProveedor.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BuscarProveedorResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link BuscarProveedorResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://WebServices/", name = "BuscarProveedorResponse")
    public JAXBElement<BuscarProveedorResponse> createBuscarProveedorResponse(BuscarProveedorResponse value) {
        return new JAXBElement<BuscarProveedorResponse>(_BuscarProveedorResponse_QNAME, BuscarProveedorResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BuscarSolicitud }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link BuscarSolicitud }{@code >}
     */
    @XmlElementDecl(namespace = "http://WebServices/", name = "BuscarSolicitud")
    public JAXBElement<BuscarSolicitud> createBuscarSolicitud(BuscarSolicitud value) {
        return new JAXBElement<BuscarSolicitud>(_BuscarSolicitud_QNAME, BuscarSolicitud.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BuscarSolicitudResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link BuscarSolicitudResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://WebServices/", name = "BuscarSolicitudResponse")
    public JAXBElement<BuscarSolicitudResponse> createBuscarSolicitudResponse(BuscarSolicitudResponse value) {
        return new JAXBElement<BuscarSolicitudResponse>(_BuscarSolicitudResponse_QNAME, BuscarSolicitudResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BuscarUsuario }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link BuscarUsuario }{@code >}
     */
    @XmlElementDecl(namespace = "http://WebServices/", name = "BuscarUsuario")
    public JAXBElement<BuscarUsuario> createBuscarUsuario(BuscarUsuario value) {
        return new JAXBElement<BuscarUsuario>(_BuscarUsuario_QNAME, BuscarUsuario.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BuscarUsuarioResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link BuscarUsuarioResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://WebServices/", name = "BuscarUsuarioResponse")
    public JAXBElement<BuscarUsuarioResponse> createBuscarUsuarioResponse(BuscarUsuarioResponse value) {
        return new JAXBElement<BuscarUsuarioResponse>(_BuscarUsuarioResponse_QNAME, BuscarUsuarioResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CrearSolicitud }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CrearSolicitud }{@code >}
     */
    @XmlElementDecl(namespace = "http://WebServices/", name = "CrearSolicitud")
    public JAXBElement<CrearSolicitud> createCrearSolicitud(CrearSolicitud value) {
        return new JAXBElement<CrearSolicitud>(_CrearSolicitud_QNAME, CrearSolicitud.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CrearSolicitudResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CrearSolicitudResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://WebServices/", name = "CrearSolicitudResponse")
    public JAXBElement<CrearSolicitudResponse> createCrearSolicitudResponse(CrearSolicitudResponse value) {
        return new JAXBElement<CrearSolicitudResponse>(_CrearSolicitudResponse_QNAME, CrearSolicitudResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EliminarCompraEquipo }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link EliminarCompraEquipo }{@code >}
     */
    @XmlElementDecl(namespace = "http://WebServices/", name = "EliminarCompraEquipo")
    public JAXBElement<EliminarCompraEquipo> createEliminarCompraEquipo(EliminarCompraEquipo value) {
        return new JAXBElement<EliminarCompraEquipo>(_EliminarCompraEquipo_QNAME, EliminarCompraEquipo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EliminarCompraEquipoResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link EliminarCompraEquipoResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://WebServices/", name = "EliminarCompraEquipoResponse")
    public JAXBElement<EliminarCompraEquipoResponse> createEliminarCompraEquipoResponse(EliminarCompraEquipoResponse value) {
        return new JAXBElement<EliminarCompraEquipoResponse>(_EliminarCompraEquipoResponse_QNAME, EliminarCompraEquipoResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EliminarEmpleados }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link EliminarEmpleados }{@code >}
     */
    @XmlElementDecl(namespace = "http://WebServices/", name = "EliminarEmpleados")
    public JAXBElement<EliminarEmpleados> createEliminarEmpleados(EliminarEmpleados value) {
        return new JAXBElement<EliminarEmpleados>(_EliminarEmpleados_QNAME, EliminarEmpleados.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EliminarEmpleadosResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link EliminarEmpleadosResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://WebServices/", name = "EliminarEmpleadosResponse")
    public JAXBElement<EliminarEmpleadosResponse> createEliminarEmpleadosResponse(EliminarEmpleadosResponse value) {
        return new JAXBElement<EliminarEmpleadosResponse>(_EliminarEmpleadosResponse_QNAME, EliminarEmpleadosResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EliminarEquipo }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link EliminarEquipo }{@code >}
     */
    @XmlElementDecl(namespace = "http://WebServices/", name = "EliminarEquipo")
    public JAXBElement<EliminarEquipo> createEliminarEquipo(EliminarEquipo value) {
        return new JAXBElement<EliminarEquipo>(_EliminarEquipo_QNAME, EliminarEquipo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EliminarEquipoResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link EliminarEquipoResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://WebServices/", name = "EliminarEquipoResponse")
    public JAXBElement<EliminarEquipoResponse> createEliminarEquipoResponse(EliminarEquipoResponse value) {
        return new JAXBElement<EliminarEquipoResponse>(_EliminarEquipoResponse_QNAME, EliminarEquipoResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EliminarProveedor }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link EliminarProveedor }{@code >}
     */
    @XmlElementDecl(namespace = "http://WebServices/", name = "EliminarProveedor")
    public JAXBElement<EliminarProveedor> createEliminarProveedor(EliminarProveedor value) {
        return new JAXBElement<EliminarProveedor>(_EliminarProveedor_QNAME, EliminarProveedor.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EliminarProveedorResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link EliminarProveedorResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://WebServices/", name = "EliminarProveedorResponse")
    public JAXBElement<EliminarProveedorResponse> createEliminarProveedorResponse(EliminarProveedorResponse value) {
        return new JAXBElement<EliminarProveedorResponse>(_EliminarProveedorResponse_QNAME, EliminarProveedorResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EliminarSolicitud }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link EliminarSolicitud }{@code >}
     */
    @XmlElementDecl(namespace = "http://WebServices/", name = "EliminarSolicitud")
    public JAXBElement<EliminarSolicitud> createEliminarSolicitud(EliminarSolicitud value) {
        return new JAXBElement<EliminarSolicitud>(_EliminarSolicitud_QNAME, EliminarSolicitud.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EliminarSolicitudResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link EliminarSolicitudResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://WebServices/", name = "EliminarSolicitudResponse")
    public JAXBElement<EliminarSolicitudResponse> createEliminarSolicitudResponse(EliminarSolicitudResponse value) {
        return new JAXBElement<EliminarSolicitudResponse>(_EliminarSolicitudResponse_QNAME, EliminarSolicitudResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EliminarUsuario }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link EliminarUsuario }{@code >}
     */
    @XmlElementDecl(namespace = "http://WebServices/", name = "EliminarUsuario")
    public JAXBElement<EliminarUsuario> createEliminarUsuario(EliminarUsuario value) {
        return new JAXBElement<EliminarUsuario>(_EliminarUsuario_QNAME, EliminarUsuario.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EliminarUsuarioResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link EliminarUsuarioResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://WebServices/", name = "EliminarUsuarioResponse")
    public JAXBElement<EliminarUsuarioResponse> createEliminarUsuarioResponse(EliminarUsuarioResponse value) {
        return new JAXBElement<EliminarUsuarioResponse>(_EliminarUsuarioResponse_QNAME, EliminarUsuarioResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListarCargoEmpleado }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ListarCargoEmpleado }{@code >}
     */
    @XmlElementDecl(namespace = "http://WebServices/", name = "ListarCargoEmpleado")
    public JAXBElement<ListarCargoEmpleado> createListarCargoEmpleado(ListarCargoEmpleado value) {
        return new JAXBElement<ListarCargoEmpleado>(_ListarCargoEmpleado_QNAME, ListarCargoEmpleado.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListarCargoEmpleadoResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ListarCargoEmpleadoResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://WebServices/", name = "ListarCargoEmpleadoResponse")
    public JAXBElement<ListarCargoEmpleadoResponse> createListarCargoEmpleadoResponse(ListarCargoEmpleadoResponse value) {
        return new JAXBElement<ListarCargoEmpleadoResponse>(_ListarCargoEmpleadoResponse_QNAME, ListarCargoEmpleadoResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListarCompras }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ListarCompras }{@code >}
     */
    @XmlElementDecl(namespace = "http://WebServices/", name = "ListarCompras")
    public JAXBElement<ListarCompras> createListarCompras(ListarCompras value) {
        return new JAXBElement<ListarCompras>(_ListarCompras_QNAME, ListarCompras.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListarComprasResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ListarComprasResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://WebServices/", name = "ListarComprasResponse")
    public JAXBElement<ListarComprasResponse> createListarComprasResponse(ListarComprasResponse value) {
        return new JAXBElement<ListarComprasResponse>(_ListarComprasResponse_QNAME, ListarComprasResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListarDepartEmp }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ListarDepartEmp }{@code >}
     */
    @XmlElementDecl(namespace = "http://WebServices/", name = "ListarDepartEmp")
    public JAXBElement<ListarDepartEmp> createListarDepartEmp(ListarDepartEmp value) {
        return new JAXBElement<ListarDepartEmp>(_ListarDepartEmp_QNAME, ListarDepartEmp.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListarDepartEmpResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ListarDepartEmpResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://WebServices/", name = "ListarDepartEmpResponse")
    public JAXBElement<ListarDepartEmpResponse> createListarDepartEmpResponse(ListarDepartEmpResponse value) {
        return new JAXBElement<ListarDepartEmpResponse>(_ListarDepartEmpResponse_QNAME, ListarDepartEmpResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListarEmpleados }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ListarEmpleados }{@code >}
     */
    @XmlElementDecl(namespace = "http://WebServices/", name = "ListarEmpleados")
    public JAXBElement<ListarEmpleados> createListarEmpleados(ListarEmpleados value) {
        return new JAXBElement<ListarEmpleados>(_ListarEmpleados_QNAME, ListarEmpleados.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListarEmpleadosResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ListarEmpleadosResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://WebServices/", name = "ListarEmpleadosResponse")
    public JAXBElement<ListarEmpleadosResponse> createListarEmpleadosResponse(ListarEmpleadosResponse value) {
        return new JAXBElement<ListarEmpleadosResponse>(_ListarEmpleadosResponse_QNAME, ListarEmpleadosResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListarEquipos }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ListarEquipos }{@code >}
     */
    @XmlElementDecl(namespace = "http://WebServices/", name = "ListarEquipos")
    public JAXBElement<ListarEquipos> createListarEquipos(ListarEquipos value) {
        return new JAXBElement<ListarEquipos>(_ListarEquipos_QNAME, ListarEquipos.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListarEquiposResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ListarEquiposResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://WebServices/", name = "ListarEquiposResponse")
    public JAXBElement<ListarEquiposResponse> createListarEquiposResponse(ListarEquiposResponse value) {
        return new JAXBElement<ListarEquiposResponse>(_ListarEquiposResponse_QNAME, ListarEquiposResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListarMarca }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ListarMarca }{@code >}
     */
    @XmlElementDecl(namespace = "http://WebServices/", name = "ListarMarca")
    public JAXBElement<ListarMarca> createListarMarca(ListarMarca value) {
        return new JAXBElement<ListarMarca>(_ListarMarca_QNAME, ListarMarca.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListarMarcaResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ListarMarcaResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://WebServices/", name = "ListarMarcaResponse")
    public JAXBElement<ListarMarcaResponse> createListarMarcaResponse(ListarMarcaResponse value) {
        return new JAXBElement<ListarMarcaResponse>(_ListarMarcaResponse_QNAME, ListarMarcaResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListarProvedores }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ListarProvedores }{@code >}
     */
    @XmlElementDecl(namespace = "http://WebServices/", name = "ListarProvedores")
    public JAXBElement<ListarProvedores> createListarProvedores(ListarProvedores value) {
        return new JAXBElement<ListarProvedores>(_ListarProvedores_QNAME, ListarProvedores.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListarProvedoresResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ListarProvedoresResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://WebServices/", name = "ListarProvedoresResponse")
    public JAXBElement<ListarProvedoresResponse> createListarProvedoresResponse(ListarProvedoresResponse value) {
        return new JAXBElement<ListarProvedoresResponse>(_ListarProvedoresResponse_QNAME, ListarProvedoresResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListarUsuario }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ListarUsuario }{@code >}
     */
    @XmlElementDecl(namespace = "http://WebServices/", name = "ListarUsuario")
    public JAXBElement<ListarUsuario> createListarUsuario(ListarUsuario value) {
        return new JAXBElement<ListarUsuario>(_ListarUsuario_QNAME, ListarUsuario.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListarUsuarioResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ListarUsuarioResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://WebServices/", name = "ListarUsuarioResponse")
    public JAXBElement<ListarUsuarioResponse> createListarUsuarioResponse(ListarUsuarioResponse value) {
        return new JAXBElement<ListarUsuarioResponse>(_ListarUsuarioResponse_QNAME, ListarUsuarioResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ModificarCompraEquipo }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ModificarCompraEquipo }{@code >}
     */
    @XmlElementDecl(namespace = "http://WebServices/", name = "ModificarCompraEquipo")
    public JAXBElement<ModificarCompraEquipo> createModificarCompraEquipo(ModificarCompraEquipo value) {
        return new JAXBElement<ModificarCompraEquipo>(_ModificarCompraEquipo_QNAME, ModificarCompraEquipo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ModificarCompraEquipoResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ModificarCompraEquipoResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://WebServices/", name = "ModificarCompraEquipoResponse")
    public JAXBElement<ModificarCompraEquipoResponse> createModificarCompraEquipoResponse(ModificarCompraEquipoResponse value) {
        return new JAXBElement<ModificarCompraEquipoResponse>(_ModificarCompraEquipoResponse_QNAME, ModificarCompraEquipoResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ModificarEmpleado }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ModificarEmpleado }{@code >}
     */
    @XmlElementDecl(namespace = "http://WebServices/", name = "ModificarEmpleado")
    public JAXBElement<ModificarEmpleado> createModificarEmpleado(ModificarEmpleado value) {
        return new JAXBElement<ModificarEmpleado>(_ModificarEmpleado_QNAME, ModificarEmpleado.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ModificarEmpleadoResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ModificarEmpleadoResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://WebServices/", name = "ModificarEmpleadoResponse")
    public JAXBElement<ModificarEmpleadoResponse> createModificarEmpleadoResponse(ModificarEmpleadoResponse value) {
        return new JAXBElement<ModificarEmpleadoResponse>(_ModificarEmpleadoResponse_QNAME, ModificarEmpleadoResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ModificarEquipo }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ModificarEquipo }{@code >}
     */
    @XmlElementDecl(namespace = "http://WebServices/", name = "ModificarEquipo")
    public JAXBElement<ModificarEquipo> createModificarEquipo(ModificarEquipo value) {
        return new JAXBElement<ModificarEquipo>(_ModificarEquipo_QNAME, ModificarEquipo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ModificarEquipoResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ModificarEquipoResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://WebServices/", name = "ModificarEquipoResponse")
    public JAXBElement<ModificarEquipoResponse> createModificarEquipoResponse(ModificarEquipoResponse value) {
        return new JAXBElement<ModificarEquipoResponse>(_ModificarEquipoResponse_QNAME, ModificarEquipoResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ModificarProveedor }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ModificarProveedor }{@code >}
     */
    @XmlElementDecl(namespace = "http://WebServices/", name = "ModificarProveedor")
    public JAXBElement<ModificarProveedor> createModificarProveedor(ModificarProveedor value) {
        return new JAXBElement<ModificarProveedor>(_ModificarProveedor_QNAME, ModificarProveedor.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ModificarProveedorResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ModificarProveedorResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://WebServices/", name = "ModificarProveedorResponse")
    public JAXBElement<ModificarProveedorResponse> createModificarProveedorResponse(ModificarProveedorResponse value) {
        return new JAXBElement<ModificarProveedorResponse>(_ModificarProveedorResponse_QNAME, ModificarProveedorResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ModificarSolicitud }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ModificarSolicitud }{@code >}
     */
    @XmlElementDecl(namespace = "http://WebServices/", name = "ModificarSolicitud")
    public JAXBElement<ModificarSolicitud> createModificarSolicitud(ModificarSolicitud value) {
        return new JAXBElement<ModificarSolicitud>(_ModificarSolicitud_QNAME, ModificarSolicitud.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ModificarSolicitudResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ModificarSolicitudResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://WebServices/", name = "ModificarSolicitudResponse")
    public JAXBElement<ModificarSolicitudResponse> createModificarSolicitudResponse(ModificarSolicitudResponse value) {
        return new JAXBElement<ModificarSolicitudResponse>(_ModificarSolicitudResponse_QNAME, ModificarSolicitudResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ModificarUsuario }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ModificarUsuario }{@code >}
     */
    @XmlElementDecl(namespace = "http://WebServices/", name = "ModificarUsuario")
    public JAXBElement<ModificarUsuario> createModificarUsuario(ModificarUsuario value) {
        return new JAXBElement<ModificarUsuario>(_ModificarUsuario_QNAME, ModificarUsuario.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ModificarUsuarioResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ModificarUsuarioResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://WebServices/", name = "ModificarUsuarioResponse")
    public JAXBElement<ModificarUsuarioResponse> createModificarUsuarioResponse(ModificarUsuarioResponse value) {
        return new JAXBElement<ModificarUsuarioResponse>(_ModificarUsuarioResponse_QNAME, ModificarUsuarioResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TecnicoAsignado }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link TecnicoAsignado }{@code >}
     */
    @XmlElementDecl(namespace = "http://WebServices/", name = "TecnicoAsignado")
    public JAXBElement<TecnicoAsignado> createTecnicoAsignado(TecnicoAsignado value) {
        return new JAXBElement<TecnicoAsignado>(_TecnicoAsignado_QNAME, TecnicoAsignado.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TecnicoAsignadoResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link TecnicoAsignadoResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://WebServices/", name = "TecnicoAsignadoResponse")
    public JAXBElement<TecnicoAsignadoResponse> createTecnicoAsignadoResponse(TecnicoAsignadoResponse value) {
        return new JAXBElement<TecnicoAsignadoResponse>(_TecnicoAsignadoResponse_QNAME, TecnicoAsignadoResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TipoEquipo }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link TipoEquipo }{@code >}
     */
    @XmlElementDecl(namespace = "http://WebServices/", name = "TipoEquipo")
    public JAXBElement<TipoEquipo> createTipoEquipo(TipoEquipo value) {
        return new JAXBElement<TipoEquipo>(_TipoEquipo_QNAME, TipoEquipo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TipoEquipoResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link TipoEquipoResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://WebServices/", name = "TipoEquipoResponse")
    public JAXBElement<TipoEquipoResponse> createTipoEquipoResponse(TipoEquipoResponse value) {
        return new JAXBElement<TipoEquipoResponse>(_TipoEquipoResponse_QNAME, TipoEquipoResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ValidarUsuario }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ValidarUsuario }{@code >}
     */
    @XmlElementDecl(namespace = "http://WebServices/", name = "ValidarUsuario")
    public JAXBElement<ValidarUsuario> createValidarUsuario(ValidarUsuario value) {
        return new JAXBElement<ValidarUsuario>(_ValidarUsuario_QNAME, ValidarUsuario.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ValidarUsuarioResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ValidarUsuarioResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://WebServices/", name = "ValidarUsuarioResponse")
    public JAXBElement<ValidarUsuarioResponse> createValidarUsuarioResponse(ValidarUsuarioResponse value) {
        return new JAXBElement<ValidarUsuarioResponse>(_ValidarUsuarioResponse_QNAME, ValidarUsuarioResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MostrarProveedores }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link MostrarProveedores }{@code >}
     */
    @XmlElementDecl(namespace = "http://WebServices/", name = "mostrarProveedores")
    public JAXBElement<MostrarProveedores> createMostrarProveedores(MostrarProveedores value) {
        return new JAXBElement<MostrarProveedores>(_MostrarProveedores_QNAME, MostrarProveedores.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MostrarProveedoresResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link MostrarProveedoresResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://WebServices/", name = "mostrarProveedoresResponse")
    public JAXBElement<MostrarProveedoresResponse> createMostrarProveedoresResponse(MostrarProveedoresResponse value) {
        return new JAXBElement<MostrarProveedoresResponse>(_MostrarProveedoresResponse_QNAME, MostrarProveedoresResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Privilegios }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Privilegios }{@code >}
     */
    @XmlElementDecl(namespace = "http://WebServices/", name = "privilegios")
    public JAXBElement<Privilegios> createPrivilegios(Privilegios value) {
        return new JAXBElement<Privilegios>(_Privilegios_QNAME, Privilegios.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PrivilegiosResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link PrivilegiosResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://WebServices/", name = "privilegiosResponse")
    public JAXBElement<PrivilegiosResponse> createPrivilegiosResponse(PrivilegiosResponse value) {
        return new JAXBElement<PrivilegiosResponse>(_PrivilegiosResponse_QNAME, PrivilegiosResponse.class, null, value);
    }

}
