package com.br.Cors;

import jakarta.servlet.http.HttpServletResponse;

public class Cors {
	
	 private void liberacaoCores(HttpServletResponse response) {

	        if (response.getHeader("Access-Control-Allow-Origin") == null) {
	            response.addHeader("Access-Control-Allow-Origin", "");
	        }

	        if (response.getHeader("Access-Control-Allow-Headers") == null) {
	            response.addHeader("Access-Control-Allow-Headers", "");
	        }

	        if (response.getHeader("Acess-Control-Request-Headers") == null) {
	            response.addHeader("Acess-Control-Request-Headers", "");
	        }

	        if (response.getHeader("Access-Control-Allow-Methods") == null) {
	            response.addHeader("Access-Control-Allow-Methods", "");
	        }
	    }

}
