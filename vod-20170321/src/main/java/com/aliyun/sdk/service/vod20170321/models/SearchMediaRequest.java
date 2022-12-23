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
         * The media asset fields to return in the query results.
         * <p>
         * 
         * By default, only the basic media asset fields are returned. You can specify additional media asset fields that need to be returned in the request. For more information, see the "API examples" section of the [Search for media asset information](~~99179~~) topic.
         */
        public Builder fields(String fields) {
            this.putQueryParameter("Fields", fields);
            this.fields = fields;
            return this;
        }

        /**
         * The filter condition. For more information about the syntax, see [Protocol for media asset search](~~86991~~).
         */
        public Builder match(String match) {
            this.putQueryParameter("Match", match);
            this.match = match;
            return this;
        }

        /**
         * The number of the page to return. Default value: **1**.
         * <p>
         * 
         * > If the value of this parameter exceeds **200**, we recommend that you set the ScrollToken parameter as well.
         */
        public Builder pageNo(Integer pageNo) {
            this.putQueryParameter("PageNo", pageNo);
            this.pageNo = pageNo;
            return this;
        }

        /**
         * The number of entries to return on each page. Default value: **10**. Maximum value: **100**.
         */
        public Builder pageSize(Integer pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * The pagination identifier. The identifier can be up to 32 characters in length.
         * <p>
         * 
         * The first time you call this operation for each new search, you do not need to specify this parameter. The value of this parameter is returned each time data records that meet the specified filter criteria are found. The value is used to record the current position of queried data. Record the returned parameter value and set this parameter according to the following requirements during the next search:
         * 
         * *   If SearchType is set to **video** or **audio** and you need to traverse all data that meets the filter criteria, you must set the ScrollToken parameter.
         * *   If the value of the PageNo parameter exceeds **200**, we recommend that you set this parameter to optimize search performance.
         */
        public Builder scrollToken(String scrollToken) {
            this.putQueryParameter("ScrollToken", scrollToken);
            this.scrollToken = scrollToken;
            return this;
        }

        /**
         * The type of the media asset that you want to query. Default value: video. Valid values:
         * <p>
         * 
         * *   **video**
         * *   **audio**
         * *   **image**
         * *   **attached**
         * 
         * > If this parameter is set to **video** or **audio** and you want to traverse all data that meets the filter criteria, you must set the ScrollToken parameter.
         */
        public Builder searchType(String searchType) {
            this.putQueryParameter("SearchType", searchType);
            this.searchType = searchType;
            return this;
        }

        /**
         * The sort field and order. Separate multiple values with commas (,). Default value: CreationTime:Desc. Valid values:
         * <p>
         * 
         * *   **CreationTime:Desc**: The results are sorted in reverse chronological order based on the creation time.
         * *   **CreationTime:Asc**: The results are sorted in chronological order based on the creation time.
         * 
         * > * For more information about the sort field, see "Sort field" in the [Search for media asset information](~~99179~~) topic.
         * > * To obtain the first 5,000 data records that meet the specified filter criteria, you can specify a maximum of three sort fields.
         * > * To obtain all the data records that meet the specified filter criteria, you can specify only one sort field.
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
