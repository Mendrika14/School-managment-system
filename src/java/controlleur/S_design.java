/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package controlleur;

import Dao.Ecole;
import Dao.Inscription;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Vector;
import javax.servlet.*;
import javax.servlet.http.*;
/**
 *
 * @author Mendrika
 */
public class S_design extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */

    

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) {
        try {
            Vector<Ecole> list=Inscription.get_ecole();
            request.setAttribute("ecole", list);
            RequestDispatcher dispat =request.getRequestDispatcher("design.jsp");
            dispat.forward(request, response);
        }
        catch(Exception e){}
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
    {
        ServletContext current=this.getServletContext();
        ServletContext context = current.getContext("/S_ecole");
        ServletContext context1 = current.getContext("/S_ecole_region");
        try{
            Inscription.inscrir(context.getAttribute("nom").toString(),context.getAttribute("prenom").toString(),context.getAttribute("sexe").toString(),context1.getAttribute("ecole").toString(),"Design",request.getParameter("noteAnglais"),request.getParameter("noteFrancais"),request.getParameter("noteMath"),"0");
        }
        catch(Exception e){}
//  (request.getParameter("math"), request.getParameter("fra"), request.getParameter("ang"));
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
