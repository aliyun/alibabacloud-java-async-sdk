// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dms_enterprise20181101.models;

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
 * {@link ListDataLakePartitionNameRequest} extends {@link RequestModel}
 *
 * <p>ListDataLakePartitionNameRequest</p>
 */
public class ListDataLakePartitionNameRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CatalogName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String catalogName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DataRegion")
    @com.aliyun.core.annotation.Validation(required = true)
    private String dataRegion;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DbName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String dbName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MaxResults")
    private Integer maxResults;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NextToken")
    private String nextToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TableName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String tableName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Tid")
    @com.aliyun.core.annotation.Validation(minimum = 1)
    private Long tid;

    private ListDataLakePartitionNameRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.catalogName = builder.catalogName;
        this.dataRegion = builder.dataRegion;
        this.dbName = builder.dbName;
        this.maxResults = builder.maxResults;
        this.nextToken = builder.nextToken;
        this.tableName = builder.tableName;
        this.tid = builder.tid;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListDataLakePartitionNameRequest create() {
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
     * @return catalogName
     */
    public String getCatalogName() {
        return this.catalogName;
    }

    /**
     * @return dataRegion
     */
    public String getDataRegion() {
        return this.dataRegion;
    }

    /**
     * @return dbName
     */
    public String getDbName() {
        return this.dbName;
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
     * @return tableName
     */
    public String getTableName() {
        return this.tableName;
    }

    /**
     * @return tid
     */
    public Long getTid() {
        return this.tid;
    }

    public static final class Builder extends Request.Builder<ListDataLakePartitionNameRequest, Builder> {
        private String regionId; 
        private String catalogName; 
        private String dataRegion; 
        private String dbName; 
        private Integer maxResults; 
        private String nextToken; 
        private String tableName; 
        private Long tid; 

        private Builder() {
            super();
        } 

        private Builder(ListDataLakePartitionNameRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.catalogName = request.catalogName;
            this.dataRegion = request.dataRegion;
            this.dbName = request.dbName;
            this.maxResults = request.maxResults;
            this.nextToken = request.nextToken;
            this.tableName = request.tableName;
            this.tid = request.tid;
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
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>hive</p>
         */
        public Builder catalogName(String catalogName) {
            this.putQueryParameter("CatalogName", catalogName);
            this.catalogName = catalogName;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        public Builder dataRegion(String dataRegion) {
            this.putQueryParameter("DataRegion", dataRegion);
            this.dataRegion = dataRegion;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>default</p>
         */
        public Builder dbName(String dbName) {
            this.putQueryParameter("DbName", dbName);
            this.dbName = dbName;
            return this;
        }

        /**
         * MaxResults.
         */
        public Builder maxResults(Integer maxResults) {
            this.putQueryParameter("MaxResults", maxResults);
            this.maxResults = maxResults;
            return this;
        }

        /**
         * NextToken.
         */
        public Builder nextToken(String nextToken) {
            this.putQueryParameter("NextToken", nextToken);
            this.nextToken = nextToken;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>table_name</p>
         */
        public Builder tableName(String tableName) {
            this.putQueryParameter("TableName", tableName);
            this.tableName = tableName;
            return this;
        }

        /**
         * Tid.
         */
        public Builder tid(Long tid) {
            this.putQueryParameter("Tid", tid);
            this.tid = tid;
            return this;
        }

        @Override
        public ListDataLakePartitionNameRequest build() {
            return new ListDataLakePartitionNameRequest(this);
        } 

    } 

}
