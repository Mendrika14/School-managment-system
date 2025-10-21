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
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author Mendrika
 */
public class S_informatique extends HttpServlet {

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
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
    {
        try {
            Vector<Ecole> list=Inscription.get_ecole();
            request.setAttribute("ecole", list);
            RequestDispatcher dispat =request.getRequestDispatcher("informatique.jsp");
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
        try{
            Inscription.inscrir(
                    current.getAttribute("nom").toString(),
                    current.getAttribute("prenom").toString(),
                    current.getAttribute("sexe").toString(),
                    current.getAttribute("ecole").toString(),
                    "Informatique",request.getParameter("noteAnglais"),"0",request.getParameter("noteMath"),request.getParameter("notePhysique"));
        }
        catch(Exception e){
            e.printStackTrace();
        }
        doGet(request,response);
      //(request.getParameter("math"), request.getParameter("pc"), request.getParameter("ang"));
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
