package ws;

public class IProductWSProxy implements ws.IProductWS {
  private String _endpoint = null;
  private ws.IProductWS iProductWS = null;
  
  public IProductWSProxy() {
    _initIProductWSProxy();
  }
  
  public IProductWSProxy(String endpoint) {
    _endpoint = endpoint;
    _initIProductWSProxy();
  }
  
  private void _initIProductWSProxy() {
    try {
      iProductWS = (new ws.ProductImplServiceLocator()).getProductImplPort();
      if (iProductWS != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)iProductWS)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)iProductWS)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (iProductWS != null)
      ((javax.xml.rpc.Stub)iProductWS)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public ws.IProductWS getIProductWS() {
    if (iProductWS == null)
      _initIProductWSProxy();
    return iProductWS;
  }
  
  public ws.Product find() throws java.rmi.RemoteException{
    if (iProductWS == null)
      _initIProductWSProxy();
    return iProductWS.find();
  }
  
  public ws.Product[] findAll() throws java.rmi.RemoteException{
    if (iProductWS == null)
      _initIProductWSProxy();
    return iProductWS.findAll();
  }
  
  
}