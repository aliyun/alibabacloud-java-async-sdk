// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vod20170321.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SearchMediaRequest} extends {@link RequestModel}
 *
 * <p>SearchMediaRequest</p>
 */
public class SearchMediaRequest extends Request {
    @Query
    @NameInMap("Fields")
    private String fields;

    @Query
    @NameInMap("Match")
    private String match;

    @Query
    @NameInMap("PageNo")
    private Integer pageNo;

    @Query
    @NameInMap("PageSize")
    private Integer pageSize;

    @Query
    @NameInMap("ScrollToken")
    private String scrollToken;

    @Query
    @NameInMap("SearchType")
    private String searchType;

    @Query
    @NameInMap("SortBy")
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

        private Builder(SearchMediaRequest response) {
            super(response);
            this.fields = response.fields;
            this.match = response.match;
            this.pageNo = response.pageNo;
            this.pageSize = response.pageSize;
            this.scrollToken = response.scrollToken;
            this.searchType = response.searchType;
            this.sortBy = response.sortBy;
        } 

        /**
         * Fields.
         */
        public Builder fields(String fields) {
            this.putQueryParameter("Fields", fields);
            this.fields = fields;
            return this;
        }

        /**
         * Match.
         */
        public Builder match(String match) {
            this.putQueryParameter("Match", match);
            this.match = match;
            return this;
        }

        /**
         * PageNo.
         */
        public Builder pageNo(Integer pageNo) {
            this.putQueryParameter("PageNo", pageNo);
            this.pageNo = pageNo;
            return this;
        }

        /**
         * PageSize.
         */
        public Builder pageSize(Integer pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * ScrollToken.
         */
        public Builder scrollToken(String scrollToken) {
            this.putQueryParameter("ScrollToken", scrollToken);
            this.scrollToken = scrollToken;
            return this;
        }

        /**
         * SearchType.
         */
        public Builder searchType(String searchType) {
            this.putQueryParameter("SearchType", searchType);
            this.searchType = searchType;
            return this;
        }

        /**
         * SortBy.
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
