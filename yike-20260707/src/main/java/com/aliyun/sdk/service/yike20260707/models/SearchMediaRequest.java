// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.yike20260707.models;

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
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("BizConfig")
    private String bizConfig;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CategoryId")
    private Long categoryId;

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
    @com.aliyun.core.annotation.NameInMap("SortBy")
    private String sortBy;

    private SearchMediaRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.bizConfig = builder.bizConfig;
        this.categoryId = builder.categoryId;
        this.match = builder.match;
        this.pageNo = builder.pageNo;
        this.pageSize = builder.pageSize;
        this.scrollToken = builder.scrollToken;
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
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return bizConfig
     */
    public String getBizConfig() {
        return this.bizConfig;
    }

    /**
     * @return categoryId
     */
    public Long getCategoryId() {
        return this.categoryId;
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
     * @return sortBy
     */
    public String getSortBy() {
        return this.sortBy;
    }

    public static final class Builder extends Request.Builder<SearchMediaRequest, Builder> {
        private String regionId; 
        private String bizConfig; 
        private Long categoryId; 
        private String match; 
        private Integer pageNo; 
        private Integer pageSize; 
        private String scrollToken; 
        private String sortBy; 

        private Builder() {
            super();
        } 

        private Builder(SearchMediaRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.bizConfig = request.bizConfig;
            this.categoryId = request.categoryId;
            this.match = request.match;
            this.pageNo = request.pageNo;
            this.pageSize = request.pageSize;
            this.scrollToken = request.scrollToken;
            this.sortBy = request.sortBy;
        } 

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * BizConfig.
         */
        public Builder bizConfig(String bizConfig) {
            this.putQueryParameter("BizConfig", bizConfig);
            this.bizConfig = bizConfig;
            return this;
        }

        /**
         * <p>The category ID. You can obtain the category ID by using the following methods:</p>
         * <ul>
         * <li>When you create a category by calling the CreateAssetCategory operation, the category ID is the value of CategoryId in the response.</li>
         * <li>When you query categories by calling the ListAssetCategories operation, the category ID is the value of CategoryId in the corresponding entry of the response.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder categoryId(Long categoryId) {
            this.putQueryParameter("CategoryId", categoryId);
            this.categoryId = categoryId;
            return this;
        }

        /**
         * <p>The filter conditions. For syntax rules, see <a href="https://www.alibabacloud.com/help/en/ims/developer-reference/media-asset-search-filter-description">Media asset search protocol</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>title = \&quot;China\&quot; and utcCreate = [\&quot;1693367158561\&quot;,\&quot;1693367158562\&quot;]</p>
         */
        public Builder match(String match) {
            this.putQueryParameter("Match", match);
            this.match = match;
            return this;
        }

        /**
         * <p>The current page number. Default value: 1.</p>
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
         * <p>The number of entries per page. Default value: 10. Maximum value: 50.</p>
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
         * <p>The pagination token. The value is a 32-character string. Do not set this parameter for the first search request. When the search request matches data, the server returns this parameter value to record the current position of the search data. Record the returned parameter value and set this parameter in the next search request based on the following requirements or recommendations: This parameter is required if you want to traverse all data that matches the search conditions. If the PageNo parameter value exceeds 200, set this parameter to optimize search performance. You can only page forward, and the maximum paging distance is 1000 media assets.</p>
         * 
         * <strong>example:</strong>
         * <p>F8C4F642184DBDA5D93907A70AAE****</p>
         */
        public Builder scrollToken(String scrollToken) {
            this.putQueryParameter("ScrollToken", scrollToken);
            this.scrollToken = scrollToken;
            return this;
        }

        /**
         * <p>The sort fields and sort orders, separated by commas (,). The format is field1:Desc,field2:Asc. The direction can only be Asc or Desc.</p>
         * 
         * <strong>example:</strong>
         * <p>utcCreate:Desc</p>
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
