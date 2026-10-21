// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dms20250414.models;

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
 * {@link ListAgenticDatabaseRequest} extends {@link RequestModel}
 *
 * <p>ListAgenticDatabaseRequest</p>
 */
public class ListAgenticDatabaseRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CatalogUuid")
    @com.aliyun.core.annotation.Validation(required = true)
    private String catalogUuid;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MaxResults")
    private Integer maxResults;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NextToken")
    private String nextToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SearchKey")
    private String searchKey;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SortFieldName")
    private String sortFieldName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SortOrder")
    private String sortOrder;

    private ListAgenticDatabaseRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.catalogUuid = builder.catalogUuid;
        this.maxResults = builder.maxResults;
        this.nextToken = builder.nextToken;
        this.searchKey = builder.searchKey;
        this.sortFieldName = builder.sortFieldName;
        this.sortOrder = builder.sortOrder;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListAgenticDatabaseRequest create() {
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
     * @return catalogUuid
     */
    public String getCatalogUuid() {
        return this.catalogUuid;
    }

    /**
     * @return maxResults
     */
    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * @return nextToken
     */
    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * @return searchKey
     */
    public String getSearchKey() {
        return this.searchKey;
    }

    /**
     * @return sortFieldName
     */
    public String getSortFieldName() {
        return this.sortFieldName;
    }

    /**
     * @return sortOrder
     */
    public String getSortOrder() {
        return this.sortOrder;
    }

    public static final class Builder extends Request.Builder<ListAgenticDatabaseRequest, Builder> {
        private String regionId; 
        private String catalogUuid; 
        private Integer maxResults; 
        private String nextToken; 
        private String searchKey; 
        private String sortFieldName; 
        private String sortOrder; 

        private Builder() {
            super();
        } 

        private Builder(ListAgenticDatabaseRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.catalogUuid = request.catalogUuid;
            this.maxResults = request.maxResults;
            this.nextToken = request.nextToken;
            this.searchKey = request.searchKey;
            this.sortFieldName = request.sortFieldName;
            this.sortOrder = request.sortOrder;
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
         * <p>The UUID of the catalog to which the database belongs. You can obtain the UUID by calling ListAgenticCatalog or SearchAgenticCatalog.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>mc-HZ-OfjcNc2z***</p>
         */
        public Builder catalogUuid(String catalogUuid) {
            this.putQueryParameter("CatalogUuid", catalogUuid);
            this.catalogUuid = catalogUuid;
            return this;
        }

        /**
         * <p>The maximum number of entries to return per page.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        public Builder maxResults(Integer maxResults) {
            this.putQueryParameter("MaxResults", maxResults);
            this.maxResults = maxResults;
            return this;
        }

        /**
         * <p>The token for the next query. You do not need to specify this parameter for the first query. When you query the next page, set this parameter to the NextToken value returned in the previous response.</p>
         * 
         * <strong>example:</strong>
         * <p>f056501ada12****</p>
         */
        public Builder nextToken(String nextToken) {
            this.putQueryParameter("NextToken", nextToken);
            this.nextToken = nextToken;
            return this;
        }

        /**
         * <p>The search keyword used to match the database name or the prefix of the fully qualified name.</p>
         * 
         * <strong>example:</strong>
         * <p>order</p>
         */
        public Builder searchKey(String searchKey) {
            this.putQueryParameter("SearchKey", searchKey);
            this.searchKey = searchKey;
            return this;
        }

        /**
         * <p>The field used for sorting. This parameter is case-sensitive. Valid values:</p>
         * <ul>
         * <li><strong>name</strong>: Sorts by database name.</li>
         * <li><strong>qualifiedName</strong>: Sorts by the fully qualified name of the database.</li>
         * </ul>
         * <p>If you specify other values, the request fails. If you do not specify this parameter, the results are returned in the default order, and the SortOrder parameter does not take effect.</p>
         * 
         * <strong>example:</strong>
         * <p>name</p>
         */
        public Builder sortFieldName(String sortFieldName) {
            this.putQueryParameter("SortFieldName", sortFieldName);
            this.sortFieldName = sortFieldName;
            return this;
        }

        /**
         * <p>The sort order. This parameter takes effect only when SortFieldName is specified. This parameter is case-insensitive. Valid values:</p>
         * <ul>
         * <li><strong>ASC</strong> (default): Ascending order.</li>
         * <li><strong>DESC</strong>: Descending order.</li>
         * </ul>
         * <p>If you specify other values, the request fails.</p>
         * 
         * <strong>example:</strong>
         * <p>ASC</p>
         */
        public Builder sortOrder(String sortOrder) {
            this.putQueryParameter("SortOrder", sortOrder);
            this.sortOrder = sortOrder;
            return this;
        }

        @Override
        public ListAgenticDatabaseRequest build() {
            return new ListAgenticDatabaseRequest(this);
        } 

    } 

}
