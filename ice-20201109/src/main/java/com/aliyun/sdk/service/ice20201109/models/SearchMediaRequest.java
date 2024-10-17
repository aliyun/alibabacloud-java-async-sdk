// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ice20201109.models;

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
    @com.aliyun.core.annotation.NameInMap("EntityId")
    private String entityId;

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
    @com.aliyun.core.annotation.NameInMap("SearchLibName")
    private String searchLibName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SortBy")
    private String sortBy;

    private SearchMediaRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.entityId = builder.entityId;
        this.match = builder.match;
        this.pageNo = builder.pageNo;
        this.pageSize = builder.pageSize;
        this.scrollToken = builder.scrollToken;
        this.searchLibName = builder.searchLibName;
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
     * @return entityId
     */
    public String getEntityId() {
        return this.entityId;
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
     * @return searchLibName
     */
    public String getSearchLibName() {
        return this.searchLibName;
    }

    /**
     * @return sortBy
     */
    public String getSortBy() {
        return this.sortBy;
    }

    public static final class Builder extends Request.Builder<SearchMediaRequest, Builder> {
        private String regionId; 
        private String entityId; 
        private String match; 
        private Integer pageNo; 
        private Integer pageSize; 
        private String scrollToken; 
        private String searchLibName; 
        private String sortBy; 

        private Builder() {
            super();
        } 

        private Builder(SearchMediaRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.entityId = request.entityId;
            this.match = request.match;
            this.pageNo = request.pageNo;
            this.pageSize = request.pageSize;
            this.scrollToken = request.scrollToken;
            this.searchLibName = request.searchLibName;
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
         * <p>The ID of the entity.</p>
         * 
         * <strong>example:</strong>
         * <p>2d3bf1e35a1e42b5ab338d701efa7603</p>
         */
        public Builder entityId(String entityId) {
            this.putQueryParameter("EntityId", entityId);
            this.entityId = entityId;
            return this;
        }

        /**
         * <p>The filter conditions. For more information about the parameter syntax
         * &lt;props=&quot;china&quot;&gt;, see <a href="https://help.aliyun.com/document_detail/2584256.html">Media asset search protocols</a>.</p>
         */
        public Builder match(String match) {
            this.putQueryParameter("Match", match);
            this.match = match;
            return this;
        }

        /**
         * <p>The page number. Default value: 1.</p>
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
         * <p>20</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>The pagination identifier. The value can be up to 32 characters in length. The first time you call this operation for each new search, you do not need to specify this parameter. The value of this parameter is returned each time data records that meet the specified filter condition are found. The value is used to record the current position of queried data. Record the returned parameter value and set this parameter according to the following requirements during the next search: If you need to traverse all data that meets the filter criteria, you must set the ScrollToken parameter. If the value of the PageNo parameter exceeds 200, we recommend that you set this parameter to optimize search performance. You can only page backward. You can page a maximum of 1,000 entries in an operation.</p>
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
         * <p>The search library.</p>
         * 
         * <strong>example:</strong>
         * <p>test-1</p>
         */
        public Builder searchLibName(String searchLibName) {
            this.putQueryParameter("SearchLibName", searchLibName);
            this.searchLibName = searchLibName;
            return this;
        }

        /**
         * <p>The sort field and order. Separate multiple parameters with commas (,).</p>
         * 
         * <strong>example:</strong>
         * <p>utcCreate:Desc, utcModified:Desc</p>
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
