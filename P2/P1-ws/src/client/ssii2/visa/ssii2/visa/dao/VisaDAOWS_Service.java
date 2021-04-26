
package ssii2.visa.dao;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceException;
import javax.xml.ws.WebServiceFeature;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "VisaDAOWS", targetNamespace = "http://dao.visa.ssii2/", wsdlLocation = "http://10.7.8.1:8080/P1-ws-ws/VisaDAOWS?wsdl")
public class VisaDAOWS_Service
    extends Service
{

    private final static URL VISADAOWS_WSDL_LOCATION;
    private final static WebServiceException VISADAOWS_EXCEPTION;
    private final static QName VISADAOWS_QNAME = new QName("http://dao.visa.ssii2/", "VisaDAOWS");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://10.7.8.1:8080/P1-ws-ws/VisaDAOWS?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        VISADAOWS_WSDL_LOCATION = url;
        VISADAOWS_EXCEPTION = e;
    }

    public VisaDAOWS_Service() {
        super(__getWsdlLocation(), VISADAOWS_QNAME);
    }

    public VisaDAOWS_Service(WebServiceFeature... features) {
        super(__getWsdlLocation(), VISADAOWS_QNAME, features);
    }

    public VisaDAOWS_Service(URL wsdlLocation) {
        super(wsdlLocation, VISADAOWS_QNAME);
    }

    public VisaDAOWS_Service(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, VISADAOWS_QNAME, features);
    }

    public VisaDAOWS_Service(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public VisaDAOWS_Service(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns VisaDAOWS
     */
    @WebEndpoint(name = "VisaDAOWSPort")
    public VisaDAOWS getVisaDAOWSPort() {
        return super.getPort(new QName("http://dao.visa.ssii2/", "VisaDAOWSPort"), VisaDAOWS.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns VisaDAOWS
     */
    @WebEndpoint(name = "VisaDAOWSPort")
    public VisaDAOWS getVisaDAOWSPort(WebServiceFeature... features) {
        return super.getPort(new QName("http://dao.visa.ssii2/", "VisaDAOWSPort"), VisaDAOWS.class, features);
    }

    private static URL __getWsdlLocation() {
        if (VISADAOWS_EXCEPTION!= null) {
            throw VISADAOWS_EXCEPTION;
        }
        return VISADAOWS_WSDL_LOCATION;
    }

}
