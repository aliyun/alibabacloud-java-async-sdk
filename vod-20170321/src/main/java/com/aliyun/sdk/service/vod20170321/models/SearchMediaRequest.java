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
         * <p>The media asset fields to return in the query results.</p>
         * <p>By default, only the basic media asset fields are returned. You can specify additional media asset fields that need to be returned in the request. For more information, see the &quot;API examples&quot; section of the <a href="https://help.aliyun.com/document_detail/99179.html">Search for media asset information</a> topic.</p>
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
         * <p>The filter condition. For more information about the syntax, see <a href="https://help.aliyun.com/document_detail/86991.html">Protocol for media asset search</a>.</p>
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
         * <p>The number of the page to return. Default value: <strong>1</strong>.</p>
         * <blockquote>
         * <p>If the value of this parameter exceeds <strong>200</strong>, we recommend that you set the ScrollToken parameter as well.</p>
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
         * <p>The number of entries to return on each page. Default value: <strong>10</strong>. Maximum value: <strong>100</strong>.</p>
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
         * <p>The pagination identifier. The password must be 32 characters in length The first time you call this operation for each new search, you do not need to specify this parameter. The value of this parameter is returned each time data records that meet the specified filter condition are found. The value is used to record the current position of queried data. Record the returned parameter value and set this parameter according to the following requirements during the next search:</p>
         * <ul>
         * <li>If SearchType is set to <strong>video</strong> or <strong>audio</strong> and you need to traverse all data that meets the filter criteria, you must set the ScrollToken parameter.</li>
         * <li>If the value of the PageNo parameter exceeds <strong>200</strong>, we recommend that you set this parameter to optimize search performance.</li>
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
         * <p>The type of the media asset that you want to query. Default value: video. Valid values:</p>
         * <ul>
         * <li><strong>video</strong></li>
         * <li><strong>audio</strong></li>
         * <li><strong>image</strong></li>
         * <li><strong>attached</strong></li>
         * </ul>
         * <blockquote>
         * <p>If this parameter is set to <strong>video</strong> or <strong>audio</strong> and you want to traverse all data that meets the filter criteria, you must set the ScrollToken parameter.</p>
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
         * <p>The sort field and order. Separate multiple values with commas (,). Default value: CreationTime:Desc. Valid values:</p>
         * <ul>
         * <li><strong>CreationTime:Desc</strong>: The results are sorted in reverse chronological order based on the creation time.</li>
         * <li><strong>CreationTime:Asc</strong>: The results are sorted in chronological order based on the creation time.</li>
         * </ul>
         * <blockquote>
         * <ul>
         * <li>For more information about the sort field, see &quot;Sort field&quot; in the <a href="https://help.aliyun.com/document_detail/99179.html">Search for media asset information</a> topic.</li>
         * <li>To obtain the first 5,000 data records that meet the specified filter criteria, you can specify a maximum of three sort fields.</li>
         * <li>To obtain all the data records that meet the specified filter criteria, you can specify only one sort field.</li>
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
