
package org.me.healthcaresystem;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.6-1b01 
 * Generated source version: 2.2
 * 
 */
@WebService(name = "CreateAcc", targetNamespace = "http://healthcaresystem.me.org/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface CreateAcc {


    /**
     * 
     * @param doctor
     * @param date
     * @param time
     * @param username
     * @return
     *     returns java.lang.String
     */
    @WebMethod(operationName = "Adding")
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "Adding", targetNamespace = "http://healthcaresystem.me.org/", className = "org.me.healthcaresystem.Adding")
    @ResponseWrapper(localName = "AddingResponse", targetNamespace = "http://healthcaresystem.me.org/", className = "org.me.healthcaresystem.AddingResponse")
    @Action(input = "http://healthcaresystem.me.org/CreateAcc/AddingRequest", output = "http://healthcaresystem.me.org/CreateAcc/AddingResponse")
    public String adding(
        @WebParam(name = "username", targetNamespace = "")
        String username,
        @WebParam(name = "doctor", targetNamespace = "")
        String doctor,
        @WebParam(name = "date", targetNamespace = "")
        String date,
        @WebParam(name = "time", targetNamespace = "")
        String time);

    /**
     * 
     * @param privilige
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "privilige1", targetNamespace = "http://healthcaresystem.me.org/", className = "org.me.healthcaresystem.Privilige1")
    @ResponseWrapper(localName = "privilige1Response", targetNamespace = "http://healthcaresystem.me.org/", className = "org.me.healthcaresystem.Privilige1Response")
    @Action(input = "http://healthcaresystem.me.org/CreateAcc/privilige1Request", output = "http://healthcaresystem.me.org/CreateAcc/privilige1Response")
    public String privilige1(
        @WebParam(name = "privilige", targetNamespace = "")
        String privilige);

    /**
     * 
     * @param fname
     * @param lname
     * @param password
     * @param email1
     * @param privilige1
     * @param add1
     * @param username
     * @param phone1
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "submitNewAcc", targetNamespace = "http://healthcaresystem.me.org/", className = "org.me.healthcaresystem.SubmitNewAcc")
    @ResponseWrapper(localName = "submitNewAccResponse", targetNamespace = "http://healthcaresystem.me.org/", className = "org.me.healthcaresystem.SubmitNewAccResponse")
    @Action(input = "http://healthcaresystem.me.org/CreateAcc/submitNewAccRequest", output = "http://healthcaresystem.me.org/CreateAcc/submitNewAccResponse")
    public String submitNewAcc(
        @WebParam(name = "fname", targetNamespace = "")
        String fname,
        @WebParam(name = "lname", targetNamespace = "")
        String lname,
        @WebParam(name = "username", targetNamespace = "")
        String username,
        @WebParam(name = "password", targetNamespace = "")
        String password,
        @WebParam(name = "email1", targetNamespace = "")
        String email1,
        @WebParam(name = "add1", targetNamespace = "")
        String add1,
        @WebParam(name = "phone1", targetNamespace = "")
        String phone1,
        @WebParam(name = "privilige1", targetNamespace = "")
        String privilige1);

    /**
     * 
     * @param fname
     * @param lname
     * @param password
     * @param email1
     * @param privilige1
     * @param add1
     * @param username
     * @param phone1
     * @return
     *     returns java.lang.Boolean
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "validateNewAcc", targetNamespace = "http://healthcaresystem.me.org/", className = "org.me.healthcaresystem.ValidateNewAcc")
    @ResponseWrapper(localName = "validateNewAccResponse", targetNamespace = "http://healthcaresystem.me.org/", className = "org.me.healthcaresystem.ValidateNewAccResponse")
    @Action(input = "http://healthcaresystem.me.org/CreateAcc/validateNewAccRequest", output = "http://healthcaresystem.me.org/CreateAcc/validateNewAccResponse")
    public Boolean validateNewAcc(
        @WebParam(name = "fname", targetNamespace = "")
        String fname,
        @WebParam(name = "lname", targetNamespace = "")
        String lname,
        @WebParam(name = "username", targetNamespace = "")
        String username,
        @WebParam(name = "password", targetNamespace = "")
        String password,
        @WebParam(name = "email1", targetNamespace = "")
        String email1,
        @WebParam(name = "add1", targetNamespace = "")
        String add1,
        @WebParam(name = "phone1", targetNamespace = "")
        String phone1,
        @WebParam(name = "privilige1", targetNamespace = "")
        String privilige1);

    /**
     * 
     * @param arg0
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "quotate", targetNamespace = "http://healthcaresystem.me.org/", className = "org.me.healthcaresystem.Quotate")
    @ResponseWrapper(localName = "quotateResponse", targetNamespace = "http://healthcaresystem.me.org/", className = "org.me.healthcaresystem.QuotateResponse")
    @Action(input = "http://healthcaresystem.me.org/CreateAcc/quotateRequest", output = "http://healthcaresystem.me.org/CreateAcc/quotateResponse")
    public String quotate(
        @WebParam(name = "arg0", targetNamespace = "")
        String arg0);

}
