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
 * {@link SearchAgenticDatabaseRequest} extends {@link RequestModel}
 *
 * <p>SearchAgenticDatabaseRequest</p>
 */
public class SearchAgenticDatabaseRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CatalogUuid")
    private String catalogUuid;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DbType")
    private String dbType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EnvType")
    private String envType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MaxResults")
    private Integer maxResults;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NextToken")
    private String nextToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SearchKey")
    private String searchKey;

    private SearchAgenticDatabaseRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.catalogUuid = builder.catalogUuid;
        this.dbType = builder.dbType;
        this.envType = builder.envType;
        this.maxResults = builder.maxResults;
        this.nextToken = builder.nextToken;
        this.searchKey = builder.searchKey;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SearchAgenticDatabaseRequest create() {
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
     * @return dbType
     */
    public String getDbType() {
        return this.dbType;
    }

    /**
     * @return envType
     */
    public String getEnvType() {
        return this.envType;
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

    public static final class Builder extends Request.Builder<SearchAgenticDatabaseRequest, Builder> {
        private String regionId; 
        private String catalogUuid; 
        private String dbType; 
        private String envType; 
        private Integer maxResults; 
        private String nextToken; 
        private String searchKey; 

        private Builder() {
            super();
        } 

        private Builder(SearchAgenticDatabaseRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.catalogUuid = request.catalogUuid;
            this.dbType = request.dbType;
            this.envType = request.envType;
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
         * <p>The UUID of the catalog that limits the search scope. If you do not specify this parameter, the search is performed across all catalogs.</p>
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
         * <p>The database type. This parameter filters the results exactly by the database type of the data source associated with the catalog. The value is the uppercase name of the database type, such as MYSQL.</p>
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
         * <p>The environment type. This parameter filters the results exactly by the environment of the associated data source. Valid values: product, pre, dev, test, sit, uat, pet, and stag.</p>
         * 
         * <strong>example:</strong>
         * <p>product</p>
         */
        public Builder envType(String envType) {
            this.putQueryParameter("EnvType", envType);
            this.envType = envType;
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
         * <p>The token for the next query. You do not need to specify this parameter for the first query. When you query the next page, set this parameter to the NextToken value returned from the previous query.</p>
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
         * <p>The search keyword. It matches the name, fully qualified name, and search name of the database, as well as the name or data source alias of the associated catalog.</p>
         * 
         * <strong>example:</strong>
         * <p>order</p>
         */
        public Builder searchKey(String searchKey) {
            this.putQueryParameter("SearchKey", searchKey);
            this.searchKey = searchKey;
            return this;
        }

        @Override
        public SearchAgenticDatabaseRequest build() {
            return new SearchAgenticDatabaseRequest(this);
        } 

    } 

}
