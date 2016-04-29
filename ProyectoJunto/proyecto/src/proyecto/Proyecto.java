package proyecto;

import excepciones.AlbaranMetido;
import excepciones.DatosActualizados;
import java.io.IOException;
import modelo.*;
import vista.*;

import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class Proyecto {
    
    //private static ResultSet rs;
    private static Vista1 v1;
    private static Perfil p;
    private static Login l;
    private static Centro c;
    private static ArrayList<String> nombres;
    private static Trabajador t;
    private static Trabajador trab;
    private static ArrayList<Integer> centros;
    private static ArrayList<modelo.AfterParte> listaPartes;
    //private static boolean unauotra = false;
    private static Principal pr;
    private static VentanaCentros vc;
    private static ArrayList<Vehiculo> listaVehiculos ;
    private static VistaParte vistaParte; // para meter
    private static VistaAfterParte vap;// para meter
    private static Viaje v;
    private static modelo.AfterParte ap;
    private static VisualizarParte vp;
    private static VistaModificarParte vmp;
    private static ArrayList<Viaje> listaViajes;

//    public static boolean isUnauotra() {
//        return unauotra;
//    }

//    public static void setUnauotra(boolean unauotra) {
//        Fase2.unauotra = unauotra;
//    }

    public static void main(String[] args) {
        
        try {
            GenericaBD.abrirConexion();
            //CentroBD.solicitarCentros();
            //v1 = new Vista1(centros);
            //v1.setVisible(true);
            pr = new Principal();
            pr.setVisible(true);
            Login dialog = new Login (pr,true);
            dialog.setVisible(true);
        } catch (IOException ex) {
            Logger.getLogger(Proyecto.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public static ArrayList<Viaje> getListaViajes() {
        return listaViajes;
    }

    public static void setListaViajes(Viaje vi) {
        listaViajes.add(vi);
    }
    
    public static ArrayList<Vehiculo> getListaVehiculos() {
        return listaVehiculos;
    }
    public static void setVehiculo(Vehiculo v) {
        listaVehiculos.add(v);
    }
    public static void setListaVehiculos(ArrayList<Vehiculo> listaVehiculos) {
        Proyecto.listaVehiculos = listaVehiculos;
    }

    public static modelo.AfterParte getAp() {
        return ap;
    }

    public static void setAp(modelo.AfterParte ap) {
        Proyecto.ap = ap;
    }

    public static ArrayList<modelo.AfterParte> getListaPartes() {
        return listaPartes;
    }

    public static void setListaPartes(ArrayList<modelo.AfterParte> listaPartes) {
        Proyecto.listaPartes = listaPartes;
    }


    public static void ventanaPartes ()
    {
        
        try {
            
            vistaParte = new VistaParte();
            vistaParte.setVisible(true);
            
        } catch (Exception e) 
        {
            JOptionPane.showMessageDialog(null, "Error al abrir ventana de partes");
        }
        
    }
    
    public static void prueba() {
        listaVehiculos = new ArrayList();
        VehiculosBD.seleccionarVehiculos();
    }

    public static VistaParte getVistaParte() {
        return vistaParte;
    }

    public static void setVistaParte(VistaParte vistaParte) {
        Proyecto.vistaParte = vistaParte;
    }
    
    public static void ventanaAfterParteAbrir(){        
        vap = new VistaAfterParte();
        vap.setVisible(true);
    }    
    public static void ventanaAfterParteCerrar(){
        vap.dispose();
        vistaParte.dispose();
    }
    
    public static int rellenarParte(java.sql.Date fecha, int kmInicial, int kmFinal, int gasolina, int peaje, int dietas, int otros, String incidencia, String estado)
    {
        try {
            ap = new modelo.AfterParte(fecha,kmInicial,kmFinal,gasolina,peaje,dietas,otros,incidencia,estado,t);
            AfterParteBD.agregarParte(ap);
            
        } catch (Exception e) 
        {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
        return ap.getIdParte();
    }
    
    public static void rellenarViaje(int albaran, String horaSalida, String horaLlegada, String matricula,int parte)
    {
        try {
            
            v = new Viaje(albaran,horaSalida,horaLlegada,matricula,parte);
            if(ViajeBD.agregarAlbaran(v)==true)
            {
                throw new AlbaranMetido();
            }
        }catch(AlbaranMetido e)
        {
            JOptionPane.showMessageDialog(null, "Albaraan insertado Correctamente");
        }
        catch (Exception e) 
        {
            JOptionPane.showMessageDialog(null, "Error "+ e.getMessage());
        }
        
        
    }
    public static String setEstado(String estado) {
        ap.setEstado(estado);
        return estado;
    }
    public static String getEstado(){
        return ap.getEstado();
    }
    public static void abiertoCerrado()
    {
        vap = new VistaAfterParte();
        
        vap.dispose();
    }

    public static void crearPerfil() {
        p = new Perfil();
        p.setVisible(true);
    }
    
    public static String nombreCentro(Integer centro){
        return nombres.get(centro);
    }

    
    public static boolean buscarTrabajador(String dni) {
        trab = TrabajadorBD.getTrabajador(dni);
        if(trab == null){
            return false;
        }else{
            return true;
        }
    }
    
    public static String getNombre(){
        return t.getNombre();
    }
    
    public static String getDni(){
        return t.getDni();
    }
    
    public static String getApe1(){
        return t.getApellido1();
    }
    
    public static String getApe2(){
        return t.getApellido2();
    }
    
    public static String getCalle(){
        return t.getCalle();
    }
    
    public static String getPortal(){
        return t.getPortal();
    }
    
    public static String getPiso(){
        return String.valueOf(t.getPiso());
    }
    
    public static String getMano(){
        return t.getMano();
    }
    
    public static String getPersonal(){
        return t.getTelPersonal();
    }
    
    public static String getEmpresa(){
        return t.getTelEmpresa();
    }
    
    public static Calendar getFechaNac(){
        if (t.getFechaNac()!=null)
        {
            Calendar ca = Calendar.getInstance();
            ca.setTime(t.getFechaNac());
            return ca;
        }
        return null;
    }
    
    public static String getSalario(){
        return String.valueOf(t.getSalario());
    }
    
    public static Class getClase(){
        return t.getClass();
    }
    
    public static Class getClaseLogistica(){
        return Logistica.class;
    }

    public static void setNombre(String nombre) {
        t.setNombre(nombre);
    }

    public static void setDni(String dni) {
        t.setDni(dni);
    }

    public static void setApellidos(String ape) {
        int c = ape.length();
        if(ape.contains(" ")){
            c = ape.indexOf(" ");
        }
        t.setApellido1(ape.substring(0, c));
        t.setApellido2(ape.substring(c+1));
    }

    public static void setCalle(String calle) {
        t.setCalle(calle);
    }

    public static void setPortal(String portal) {
        t.setPortal(portal);
    }

    public static void setPiso(String piso) {
        t.setPiso(Integer.parseInt(piso));
    }

    public static void setMano(String mano) {
        t.setMano(mano);
    }

    public static void setPersonal(String per) {
        t.setTelPersonal(per);
    }

    public static void setEmpresa(String emp) {
        t.setTelEmpresa(emp);
    }

    public static void setSalario(String salario) {
        t.setSalario(Float.parseFloat(salario));
    }

    public static void setFecha(Calendar fecha) {
        t.setFechaNac(fecha.getTime());
    }

    public static void insertar() {
        TrabajadorBD.insertar(trab);
        javax.swing.JOptionPane.showMessageDialog(p, "Usuario insertado");
        //System.exit(0);
    }

    public static void borrarTrabajador() {
        TrabajadorBD.borrar(trab);
        javax.swing.JOptionPane.showMessageDialog(p, "Usuario borrado");
    }

    public static void iniAdmin() {
        trab = new Administracion();
    }

    public static void iniLog() {
        trab = new Logistica();
    }

    public static void modificar() {
        TrabajadorBD.modificar(trab);
        javax.swing.JOptionPane.showMessageDialog(p, "Usuario modificado");
        //System.exit(0);
    }

    public static void guardarCentros(ArrayList<Integer> pCentros) {
        centros = pCentros;
    }

    public static void guardarNombres(ArrayList<String> pNombres) {
        nombres = pNombres;
    }

    public static boolean comprobarUsuario(String text, char[] password) {
        int x;
        String contraseña="";
        for(x=0;x<password.length;x++)
        {
            contraseña += password[x];
        }
        boolean comprobado = TrabajadorBD.login(text, contraseña);
        if(comprobado){
            t = TrabajadorBD.getTrabajador(text);
            return true;
        }else{
            return false;
        }
    }
    
    public static void setTrabajador(Trabajador pTrab){
        t = pTrab;
    }

    public static void tipoTrabajador(boolean b) {
        pr.cerrarPestanas(b);
    }

    public static void mostrarPerfil(){
        p = new Perfil();
        p.setVisible(true);
        p.visualizar();
    }
    
    public static void mostrarTrab(){
        p = new Perfil();
        p.setVisible(true);
        p.modificarTrab();
    }
    
    public static void cerrarConexion(){
        GenericaBD.cerrarConexion();
    }
    
    public static String getNombreT(){
        return trab.getNombre();
    }
    
    public static String getDniT(){
        return trab.getDni();
    }
    
    public static String getApe1T(){
        return trab.getApellido1();
    }
    
    public static String getApe2T(){
        return trab.getApellido2();
    }
    
    public static String getCalleT(){
        return trab.getCalle();
    }
    
    public static String getPortalT(){
        return trab.getPortal();
    }
    
    public static String getPisoT(){
        return String.valueOf(trab.getPiso());
    }
    
    public static String getManoT(){
        return trab.getMano();
    }
    
    public static Class getClaseT(){
        return trab.getClass();
    }
    
    public static String getPersonalT(){
        return trab.getTelPersonal();
    }
    
    public static String getEmpresaT(){
        return trab.getTelEmpresa();
    }
    
    public static Calendar getFechaNacT(){
        if (trab.getFechaNac()!=null)
        {
            Calendar ca = Calendar.getInstance();
            ca.setTime(trab.getFechaNac());
            return ca;
        }
        return null;
    }
    
    public static String getSalarioT(){
        return String.valueOf(trab.getSalario());
    }
    
    public static void setDniT(String dni) {
        trab.setDni(dni);
    }

    public static void setNombreT(String nombre) {
        trab.setNombre(nombre);
    }

    public static void setApellidosT(String ape) {
        int c = ape.length();
        if(ape.contains(" ")){
            c = ape.indexOf(" ");
        }
        trab.setApellido1(ape.substring(0, c));
        trab.setApellido2(ape.substring(c+1));
    }

    public static void setCalleT(String calle) {
        trab.setCalle(calle);
    }

    public static void setPortalT(String portal) {
        trab.setPortal(portal);
    }

    public static void setPisoT(String piso) {
        trab.setPiso(Integer.parseInt(piso));
    }

    public static void setManoT(String mano) {
        trab.setMano(mano);
    }

    public static void setPersonalT(String per) {
        trab.setTelPersonal(per);
    }

    public static void setEmpresaT(String emp) {
        trab.setTelEmpresa(emp);
    }

    public static void setSalarioT(String salario) {
        trab.setSalario(Float.parseFloat(salario));
    }

    public static void setFechaT(Calendar fecha) {
        trab.setFechaNac(fecha.getTime());
    }

    public static boolean getCentro(int id) {
        c = null;
        CentroBD.solicitarCentro(id);
        if(c == null){
            return false;
        }else{
            return true;
        }
    }

    public static void setCentro(Centro pC) {
        c = pC;
    }

    public static void mostrarCentro() {
        vc = new VentanaCentros();
        vc.setVisible(true);
        vc.visualizar();
    }
    
    public static int getId(){
        return c.getId();
    }
    
    public static int getNumero(){
        return c.getNumero();
    }
    
    public static int getCp(){
        return c.getCp();
    }
    
    public static String getNombreC(){
        return c.getNombre();
    }
    
    public static String getCalleC(){
        return c.getCalle();
    }
    
    public static String getCiudad(){
        return c.getCiudad();
    }
    
    public static String getProvincia(){
        return c.getProvincia();
    }
    
    public static String getTelefono(){
        return c.getTelefono();
    }
    
    public static ArrayList getListado(){
        return c.getListado();
    }

    public static void crearCentro() {
        vc = new VentanaCentros();
        vc.setVisible(true);
    }
    
    public static void setNumero(Integer pNum){
        c.setNumero(pNum);
    }
    
    public static void setCp(Integer pCp){
        c.setCp(pCp);
    }
    
    public static void setNombreC(String pNombre){
        c.setNombre(pNombre);
    }
    
    public static void setCalleC(String pCalle){
        c.setCalle(pCalle);
    }
    
    public static void setCiudad(String pCiudad){
        c.setCiudad(pCiudad);
    }
    
    public static void setProvincia(String pProvincia){
        c.setProvincia(pProvincia);
    }
    
    public static void setTelefono(String pTelefono){
        c.setTelefono(pTelefono);
    }

    public static void iniCentro() {
        c = new Centro();
    }

    public static void insertarCentro() {
        CentroBD.insertar(c);
    }

    public static void modificarC() {
        vc = new VentanaCentros();
        vc.setVisible(true);
        vc.modificar();
    }

    public static void modificarCentro() {
        CentroBD.modificar(c);
    }

    public static void eliminarC() {
        CentroBD.borrar(c);
    }

    public static void modificarPartesAbiertos()
    {
        vp = new VisualizarParte();
        vp.setVisible(true);
    }
    public static void encontrarAbiertos(java.sql.Date d)
    {
        try {
            AfterParteBD.seleccionarPartes(d);
        } catch (Exception e)
        {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }

    public static void actualizarViajes(int idParte, Date fecha, int kmInicial, int kmFinal, int gasolina, int peaje, int dietas, int otros, String incidencia, String estado) {
        try {
            ap = new modelo.AfterParte(idParte, (java.sql.Date) fecha,kmInicial,kmFinal,gasolina,peaje,dietas,otros,incidencia,estado,t);
            if(AfterParteBD.actualizarParte(ap)==true)
            {
                throw new DatosActualizados();
            }else
                throw new Exception();
        }catch (DatosActualizados e)
        {
            JOptionPane.showMessageDialog(null, "Datos Modificados");
        }
        catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al modificar los datos");
        }
   
    }
    public static void seleccionarPartesViaje(int id)
    {
        try {
            listaViajes = new ArrayList();
            ViajeBD.agregarViaje(id);
        } catch (Exception e) {
        }
    }

    public static void abrirVistaModificarParte() {
        vmp= new VistaModificarParte();
        vmp.setVisible(true);
    }

    public static void actualizarParte(int Albaran,String kmInicial,String kmFinal,String matricula) {
     
        try {
            if(ViajeBD.actualizarViaje(Albaran, kmInicial, kmFinal, matricula)==true)
            {
                throw new DatosActualizados();
            }
            
        }catch (DatosActualizados e)
        {
            JOptionPane.showMessageDialog(null, "Datos Modificados");
        }
        catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al modificar los datos");
        }   
    }
    
}
