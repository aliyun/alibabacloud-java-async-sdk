// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vod20170321.models;

import com.aliyun.sdk.gateway.pop.*;
import darabonba.core.*;
import darabonba.core.async.*;
import darabonba.core.sync.*;
import darabonba.core.client.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link SearchMediaRequest} extends {@link RequestModel}
 *
 * <p>SearchMediaRequest</p>
 */
public class SearchMediaRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Fields")
    private String fields;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Match")
    private String match;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageNo")
    private Integer pageNo;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ScrollToken")
    private String scrollToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SearchType")
    private String searchType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SortBy")
    private String sortBy;

    private SearchMediaRequest(Builder builder) {
        super(builder);
        this.fields = builder.fields;
        this.match = builder.match;
        this.pageNo = builder.pageNo;
        this.pageSize = builder.pageSize;
        this.scrollToken = builder.scrollToken;
        this.searchType = builder.searchType;
        this.sortBy = builder.sortBy;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SearchMediaRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return fields
     */
    public String getFields() {
        return this.fields;
    }

    /**
     * @return match
     */
    public String getMatch() {
        return this.match;
    }

    /**
     * @return pageNo
     */
    public Integer getPageNo() {
        return this.pageNo;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
    }

    /**
     * @return scrollToken
     */
    public String getScrollToken() {
        return this.scrollToken;
    }

    /**
     * @return searchType
     */
    public String getSearchType() {
        return this.searchType;
    }

    /**
     * @return sortBy
     */
    public String getSortBy() {
        return this.sortBy;
    }

    public static final class Builder extends Request.Builder<SearchMediaRequest, Builder> {
        private String fields; 
        private String match; 
        private Integer pageNo; 
        private Integer pageSize; 
        private String scrollToken; 
        private String searchType; 
        private String sortBy; 

        private Builder() {
            super();
        } 

        private Builder(SearchMediaRequest request) {
            super(request);
            this.fields = request.fields;
            this.match = request.match;
            this.pageNo = request.pageNo;
            this.pageSize = request.pageSize;
            this.scrollToken = request.scrollToken;
            this.searchType = request.searchType;
            this.sortBy = request.sortBy;
        } 

        /**
         * <p>The media asset fields to return in the search results.</p>
         * <p>By default, only basic media asset fields are returned. You can specify additional media asset fields to return. For more information, see <a href="https://help.aliyun.com/document_detail/99179.html">Usage examples</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>Title,CoverURL</p>
         */
        public Builder fields(String fields) {
            this.putQueryParameter("Fields", fields);
            this.fields = fields;
            return this;
        }

        /**
         * <p>The filter conditions. For syntax rules, see <a href="https://help.aliyun.com/document_detail/86991.html">Search protocol syntax</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>field = value</p>
         */
        public Builder match(String match) {
            this.putQueryParameter("Match", match);
            this.match = match;
            return this;
        }

        /**
         * <p>The page number. Default value: <strong>1</strong>.</p>
         * <blockquote>
         * <p>If this parameter exceeds <strong>200</strong>, set the ScrollToken parameter as well.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder pageNo(Integer pageNo) {
            this.putQueryParameter("PageNo", pageNo);
            this.pageNo = pageNo;
            return this;
        }

        /**
         * <p>The number of records per page. Default value: <strong>10</strong>. Maximum value: <strong>100</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>The pagination token. The value is a 32-character string.
         * You do not need to set this parameter for the first search request. When the search request matches data, the server returns this parameter value, which records the current position of the search data. Record the returned value and set this parameter in the next search request based on the following requirements or recommendations:</p>
         * <ul>
         * <li>If SearchType is set to <strong>video</strong> or <strong>audio</strong> and you need to traverse all data that matches the search conditions, this parameter is required.</li>
         * <li>If PageNo exceeds <strong>200</strong>, set this parameter to optimize search performance.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>24e0fba7188fae707e146esa54****</p>
         */
        public Builder scrollToken(String scrollToken) {
            this.putQueryParameter("ScrollToken", scrollToken);
            this.scrollToken = scrollToken;
            return this;
        }

        /**
         * <p>The type of media asset to search. Valid values:</p>
         * <ul>
         * <li><strong>video</strong> (default): video.</li>
         * <li><strong>audio</strong>: audio.</li>
         * <li><strong>image</strong>: image.</li>
         * <li><strong>attached</strong>: auxiliary media asset.</li>
         * </ul>
         * <blockquote>
         * <p>If this parameter is set to <strong>video</strong> or <strong>audio</strong> and you need to traverse all data that matches the search conditions, you must set the ScrollToken parameter.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>video</p>
         */
        public Builder searchType(String searchType) {
            this.putQueryParameter("SearchType", searchType);
            this.searchType = searchType;
            return this;
        }

        /**
         * <p>The sort field and sort order. Separate multiple values with commas (,). Valid values:</p>
         * <ul>
         * <li><strong>CreationTime:Desc</strong> (default): sorts by creation time in descending order.</li>
         * <li><strong>CreationTime:Asc</strong>: sorts by creation time in ascending order.</li>
         * </ul>
         * <blockquote>
         * <ul>
         * <li>For sort field examples, see <a href="https://help.aliyun.com/document_detail/99179.html">Sort fields</a>.</li>
         * <li>When retrieving the first 5,000 records of search results, up to three sort fields are supported.</li>
         * <li>When retrieving all data that matches the search conditions, only one sort field is supported.</li>
         * </ul>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>CreationTime:Desc</p>
         */
        public Builder sortBy(String sortBy) {
            this.putQueryParameter("SortBy", sortBy);
            this.sortBy = sortBy;
            return this;
        }

        @Override
        public SearchMediaRequest build() {
            return new SearchMediaRequest(this);
        } 

    } 

}
