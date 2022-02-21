// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.datalake20200710.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListPartitionNamesRequest} extends {@link RequestModel}
 *
 * <p>ListPartitionNamesRequest</p>
 */
public class ListPartitionNamesRequest extends Request {
    @Body
    @NameInMap("CatalogId")
    private String catalogId;

    @Body
    @NameInMap("DatabaseName")
    private String databaseName;

    @Body
    @NameInMap("NextPageToken")
    private String nextPageToken;

    @Body
    @NameInMap("PageSize")
    private Integer pageSize;

    @Body
    @NameInMap("PartialPartValues")
    private java.util.List < String > partialPartValues;

    @Body
    @NameInMap("TableName")
    private String tableName;

    @Host
    @NameInMap("RegionId")
    private String regionId;

    private ListPartitionNamesRequest(Builder builder) {
        super(builder);
        this.catalogId = builder.catalogId;
        this.databaseName = builder.databaseName;
        this.nextPageToken = builder.nextPageToken;
        this.pageSize = builder.pageSize;
        this.partialPartValues = builder.partialPartValues;
        this.tableName = builder.tableName;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListPartitionNamesRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return catalogId
     */
    public String getCatalogId() {
        return this.catalogId;
    }

    /**
     * @return databaseName
     */
    public String getDatabaseName() {
        return this.databaseName;
    }

    /**
     * @return nextPageToken
     */
    public String getNextPageToken() {
        return this.nextPageToken;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
    }

    /**
     * @return partialPartValues
     */
    public java.util.List < String > getPartialPartValues() {
        return this.partialPartValues;
    }

    /**
     * @return tableName
     */
    public String getTableName() {
        return this.tableName;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    public static final class Builder extends Request.Builder<ListPartitionNamesRequest, Builder> {
        private String catalogId; 
        private String databaseName; 
        private String nextPageToken; 
        private Integer pageSize; 
        private java.util.List < String > partialPartValues; 
        private String tableName; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(ListPartitionNamesRequest response) {
            super(response);
            this.catalogId = response.catalogId;
            this.databaseName = response.databaseName;
            this.nextPageToken = response.nextPageToken;
            this.pageSize = response.pageSize;
            this.partialPartValues = response.partialPartValues;
            this.tableName = response.tableName;
            this.regionId = response.regionId;
        } 

        /**
         * CatalogId
         */
        public Builder catalogId(String catalogId) {
            this.putBodyParameter("CatalogId", catalogId);
            this.catalogId = catalogId;
            return this;
        }

        /**
         * DatabaseName
         */
        public Builder databaseName(String databaseName) {
            this.putBodyParameter("DatabaseName", databaseName);
            this.databaseName = databaseName;
            return this;
        }

        /**
         * NextPageToken
         */
        public Builder nextPageToken(String nextPageToken) {
            this.putBodyParameter("NextPageToken", nextPageToken);
            this.nextPageToken = nextPageToken;
            return this;
        }

        /**
         * PageSize
         */
        public Builder pageSize(Integer pageSize) {
            this.putBodyParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * PartialPartValues.
         */
        public Builder partialPartValues(java.util.List < String > partialPartValues) {
            this.putBodyParameter("PartialPartValues", partialPartValues);
            this.partialPartValues = partialPartValues;
            return this;
        }

        /**
         * TableName
         */
        public Builder tableName(String tableName) {
            this.putBodyParameter("TableName", tableName);
            this.tableName = tableName;
            return this;
        }

        /**
         * RegionId
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        @Override
        public ListPartitionNamesRequest build() {
            return new ListPartitionNamesRequest(this);
        } 

    } 

}
