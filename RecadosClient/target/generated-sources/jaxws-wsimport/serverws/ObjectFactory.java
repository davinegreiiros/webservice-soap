
package serverws;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the serverws package. 
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

    private final static QName _Cadastrar_QNAME = new QName("http://ServerWS/", "cadastrar");
    private final static QName _CadastrarResponse_QNAME = new QName("http://ServerWS/", "cadastrarResponse");
    private final static QName _RemoverRecadosResponse_QNAME = new QName("http://ServerWS/", "removerRecadosResponse");
    private final static QName _RemoverRecados_QNAME = new QName("http://ServerWS/", "removerRecados");
    private final static QName _ConsultarTodos_QNAME = new QName("http://ServerWS/", "consultarTodos");
    private final static QName _ConsultarTodosResponse_QNAME = new QName("http://ServerWS/", "consultarTodosResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: serverws
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link RemoverRecados }
     * 
     */
    public RemoverRecados createRemoverRecados() {
        return new RemoverRecados();
    }

    /**
     * Create an instance of {@link ConsultarTodosResponse }
     * 
     */
    public ConsultarTodosResponse createConsultarTodosResponse() {
        return new ConsultarTodosResponse();
    }

    /**
     * Create an instance of {@link ConsultarTodos }
     * 
     */
    public ConsultarTodos createConsultarTodos() {
        return new ConsultarTodos();
    }

    /**
     * Create an instance of {@link RemoverRecadosResponse }
     * 
     */
    public RemoverRecadosResponse createRemoverRecadosResponse() {
        return new RemoverRecadosResponse();
    }

    /**
     * Create an instance of {@link Cadastrar }
     * 
     */
    public Cadastrar createCadastrar() {
        return new Cadastrar();
    }

    /**
     * Create an instance of {@link CadastrarResponse }
     * 
     */
    public CadastrarResponse createCadastrarResponse() {
        return new CadastrarResponse();
    }

    /**
     * Create an instance of {@link Mural }
     * 
     */
    public Mural createMural() {
        return new Mural();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Cadastrar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ServerWS/", name = "cadastrar")
    public JAXBElement<Cadastrar> createCadastrar(Cadastrar value) {
        return new JAXBElement<Cadastrar>(_Cadastrar_QNAME, Cadastrar.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CadastrarResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ServerWS/", name = "cadastrarResponse")
    public JAXBElement<CadastrarResponse> createCadastrarResponse(CadastrarResponse value) {
        return new JAXBElement<CadastrarResponse>(_CadastrarResponse_QNAME, CadastrarResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RemoverRecadosResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ServerWS/", name = "removerRecadosResponse")
    public JAXBElement<RemoverRecadosResponse> createRemoverRecadosResponse(RemoverRecadosResponse value) {
        return new JAXBElement<RemoverRecadosResponse>(_RemoverRecadosResponse_QNAME, RemoverRecadosResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RemoverRecados }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ServerWS/", name = "removerRecados")
    public JAXBElement<RemoverRecados> createRemoverRecados(RemoverRecados value) {
        return new JAXBElement<RemoverRecados>(_RemoverRecados_QNAME, RemoverRecados.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConsultarTodos }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ServerWS/", name = "consultarTodos")
    public JAXBElement<ConsultarTodos> createConsultarTodos(ConsultarTodos value) {
        return new JAXBElement<ConsultarTodos>(_ConsultarTodos_QNAME, ConsultarTodos.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConsultarTodosResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ServerWS/", name = "consultarTodosResponse")
    public JAXBElement<ConsultarTodosResponse> createConsultarTodosResponse(ConsultarTodosResponse value) {
        return new JAXBElement<ConsultarTodosResponse>(_ConsultarTodosResponse_QNAME, ConsultarTodosResponse.class, null, value);
    }

}
