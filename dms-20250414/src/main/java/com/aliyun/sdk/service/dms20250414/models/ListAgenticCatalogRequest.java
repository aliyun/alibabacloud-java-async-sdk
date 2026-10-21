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
 * {@link ListAgenticCatalogRequest} extends {@link RequestModel}
 *
 * <p>ListAgenticCatalogRequest</p>
 */
public class ListAgenticCatalogRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CatalogType")
    private String catalogType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MaxResults")
    private Integer maxResults;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NextToken")
    private String nextToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SearchKey")
    private String searchKey;

    private ListAgenticCatalogRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.catalogType = builder.catalogType;
        this.maxResults = builder.maxResults;
        this.nextToken = builder.nextToken;
        this.searchKey = builder.searchKey;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListAgenticCatalogRequest create() {
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
     * @return catalogType
     */
    public String getCatalogType() {
        return this.catalogType;
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

    public static final class Builder extends Request.Builder<ListAgenticCatalogRequest, Builder> {
        private String regionId; 
        private String catalogType; 
        private Integer maxResults; 
        private String nextToken; 
        private String searchKey; 

        private Builder() {
            super();
        } 

        private Builder(ListAgenticCatalogRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.catalogType = request.catalogType;
            this.maxResults = request.maxResults;
            this.nextToken = request.nextToken;
            this.searchKey = request.searchKey;
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
         * <p>The catalog type. This parameter is used to filter catalogs by exact type. Valid values:</p>
         * <ul>
         * <li><strong>JDBC</strong>: relational database catalog</li>
         * <li><strong>DataLake</strong>: data lake catalog</li>
         * <li><strong>Dataset</strong>: knowledge base catalog</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>JDBC</p>
         */
        public Builder catalogType(String catalogType) {
            this.putQueryParameter("CatalogType", catalogType);
            this.catalogType = catalogType;
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
         * <p>The token for the next query. You do not need to specify this parameter for the first query. To query the next page, set this parameter to the NextToken value returned from the previous query.</p>
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
         * <p>The search keyword for the catalog name. Matches catalogs by name prefix.</p>
         * 
         * <strong>example:</strong>
         * <p>prod_</p>
         */
        public Builder searchKey(String searchKey) {
            this.putQueryParameter("SearchKey", searchKey);
            this.searchKey = searchKey;
            return this;
        }

        @Override
        public ListAgenticCatalogRequest build() {
            return new ListAgenticCatalogRequest(this);
        } 

    } 

}
