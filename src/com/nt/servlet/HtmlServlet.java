package com.nt.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class HtmlServlet extends HttpServlet {

	public void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {

		// get printwriter
		PrintWriter pw = null;
		// set responce type
		res.setContentType("text/html");

		// write logic to generte output
		pw.println("<table border='1'>");
		pw.println("<tr><th>Player</th><th>Role</th></tr>");
		pw.println("<tr><td>dhoni</td><td>captain</td></tr>");
		pw.println("<tr><td>Sachin</td><td>batsmen</td></tr>");
		pw.println("<tr><td>messi</td><td>footballplayer</td></tr>");
		pw.println("<tr><td>saniaMirza</td><td>tennisplaer</td></tr>");
		pw.println("<tr><td>anupKumar</td><td>kabaddiplayer</td></tr>");
		pw.println("</table>");
		pw.close();
	}
}
