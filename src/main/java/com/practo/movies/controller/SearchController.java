package com.practo.movies.controller;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.practo.movies.manager.SearchManager;
import com.practo.movies.utils.ObjMapperFactory;

@Controller
@RequestMapping("/")
public class SearchController {
	
    @RequestMapping(value="/search", method = RequestMethod.POST)
    public @ResponseBody String getMovieSearchResults(HttpServletRequest request,HttpServletResponse response) throws Exception {    	
    	String query = request.getParameter("query");
    	Map<String, Object> data = SearchManager.getMovieData(query);  		
    	return ObjMapperFactory.getSearchResponse(data, query);
    }
    
    
    @RequestMapping(value="/index", method = RequestMethod.POST)
    public @ResponseBody String indexMovieData(HttpServletRequest request, HttpServletResponse response) throws Exception {
    	/**
    	 * Stream POST data
    	 * Data size could be as big as entire movie catalog
    	 * 
    	 * FULL INDEXING - Reindexes the entire Movie Catalog
    	 * 
    	 * 
    	 * 
    	 * INCREMENTAL INDEXING - contains delta updates to the Movie Catalog
    	 */
    	return null;
    }    
        
}
