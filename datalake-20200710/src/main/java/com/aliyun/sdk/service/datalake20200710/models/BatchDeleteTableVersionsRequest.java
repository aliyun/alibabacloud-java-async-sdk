// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.datalake20200710.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link BatchDeleteTableVersionsRequest} extends {@link RequestModel}
 *
 * <p>BatchDeleteTableVersionsRequest</p>
 */
public class BatchDeleteTableVersionsRequest extends Request {
    @Body
    @NameInMap("CatalogId")
    private String catalogId;

    @Body
    @NameInMap("DatabaseName")
    private String databaseName;

    @Body
    @NameInMap("TableName")
    private String tableName;

    @Body
    @NameInMap("VersionIds")
    private java.util.List < Integer > versionIds;

    @Host
    @NameInMap("RegionId")
    private String regionId;

    private BatchDeleteTableVersionsRequest(Builder builder) {
        super(builder);
        this.catalogId = builder.catalogId;
        this.databaseName = builder.databaseName;
        this.tableName = builder.tableName;
        this.versionIds = builder.versionIds;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static BatchDeleteTableVersionsRequest create() {
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
     * @return tableName
     */
    public String getTableName() {
        return this.tableName;
    }

    /**
     * @return versionIds
     */
    public java.util.List < Integer > getVersionIds() {
        return this.versionIds;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    public static final class Builder extends Request.Builder<BatchDeleteTableVersionsRequest, Builder> {
        private String catalogId; 
        private String databaseName; 
        private String tableName; 
        private java.util.List < Integer > versionIds; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(BatchDeleteTableVersionsRequest response) {
            super(response);
            this.catalogId = response.catalogId;
            this.databaseName = response.databaseName;
            this.tableName = response.tableName;
            this.versionIds = response.versionIds;
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
         * TableName
         */
        public Builder tableName(String tableName) {
            this.putBodyParameter("TableName", tableName);
            this.tableName = tableName;
            return this;
        }

        /**
         * Table versionIds
         */
        public Builder versionIds(java.util.List < Integer > versionIds) {
            this.putBodyParameter("VersionIds", versionIds);
            this.versionIds = versionIds;
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
        public BatchDeleteTableVersionsRequest build() {
            return new BatchDeleteTableVersionsRequest(this);
        } 

    } 

}
