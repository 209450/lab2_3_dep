package edu.iis.mto.search;

import edu.iis.mto.bsearch.BinarySearch;
import edu.iis.mto.bsearch.SearchResult;

public class SearchAdapter implements SearchFascade {

	public SearchResult search(int key, int[] seq) {
		
		return BinarySearch.search(key, seq);
	}

}
