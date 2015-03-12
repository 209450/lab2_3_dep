package edu.iis.mto.search;

import edu.iis.mto.bsearch.SearchResult;

public interface SearchFascade {
	SearchResult search(int key, int[] seq);
}
