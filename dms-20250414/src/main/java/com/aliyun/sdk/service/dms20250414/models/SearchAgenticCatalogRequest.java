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
 * {@link SearchAgenticCatalogRequest} extends {@link RequestModel}
 *
 * <p>SearchAgenticCatalogRequest</p>
 */
public class SearchAgenticCatalogRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CatalogType")
    private String catalogType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CatalogUuids")
    private String catalogUuids;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DbType")
    private String dbType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MaxResults")
    private Integer maxResults;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NextToken")
    private String nextToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SearchKey")
    private String searchKey;

    private SearchAgenticCatalogRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.catalogType = builder.catalogType;
        this.catalogUuids = builder.catalogUuids;
        this.dbType = builder.dbType;
        this.maxResults = builder.maxResults;
        this.nextToken = builder.nextToken;
        this.searchKey = builder.searchKey;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SearchAgenticCatalogRequest create() {
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
     * @return catalogUuids
     */
    public String getCatalogUuids() {
        return this.catalogUuids;
    }

    /**
     * @return dbType
     */
    public String getDbType() {
        return this.dbType;
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

    public static final class Builder extends Request.Builder<SearchAgenticCatalogRequest, Builder> {
        private String regionId; 
        private String catalogType; 
        private String catalogUuids; 
        private String dbType; 
        private Integer maxResults; 
        private String nextToken; 
        private String searchKey; 

        private Builder() {
            super();
        } 

        private Builder(SearchAgenticCatalogRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.catalogType = request.catalogType;
            this.catalogUuids = request.catalogUuids;
            this.dbType = request.dbType;
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
         * <p>The catalog type. Filters catalogs by exact type. Valid values:</p>
         * <ul>
         * <li><strong>JDBC</strong>: relational database catalog.</li>
         * <li><strong>DataLake</strong>: data lake catalog.</li>
         * <li><strong>Dataset</strong>: knowledge base catalog.</li>
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
         * <p>The list of catalog UUIDs. Filters catalogs exactly by UUID. Separate multiple UUIDs with commas (,). You can specify up to 500 UUIDs, and null values are not allowed. If this parameter is specified along with other filter conditions, the conditions are combined by using the AND logical operator.</p>
         * 
         * <strong>example:</strong>
         * <p>mc-HZ-OfjcNc2z***,mc-HZ-Bq8Lx3wT***</p>
         */
        public Builder catalogUuids(String catalogUuids) {
            this.putQueryParameter("CatalogUuids", catalogUuids);
            this.catalogUuids = catalogUuids;
            return this;
        }

        /**
         * <p>The database type. Filters catalogs exactly by the database type of the associated data source. The value is the uppercase name of the database type, such as MYSQL.</p>
         * 
         * <strong>example:</strong>
         * <p>MYSQL</p>
         */
        public Builder dbType(String dbType) {
            this.putQueryParameter("DbType", dbType);
            this.dbType = dbType;
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
         * <p>The token for the next query. This parameter is not required for the first query. To query the next page, set this parameter to the NextToken value returned in the previous response.</p>
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
         * <p>The search keyword. It matches the catalog name, data source alias, or the prefix of the data source endpoint. A catalog is matched if any of these conditions are met.</p>
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
        public SearchAgenticCatalogRequest build() {
            return new SearchAgenticCatalogRequest(this);
        } 

    } 

}
