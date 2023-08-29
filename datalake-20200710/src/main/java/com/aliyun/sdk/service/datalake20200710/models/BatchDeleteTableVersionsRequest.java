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
    @Host
    @NameInMap("RegionId")
    private String regionId;

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

    private BatchDeleteTableVersionsRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.catalogId = builder.catalogId;
        this.databaseName = builder.databaseName;
        this.tableName = builder.tableName;
        this.versionIds = builder.versionIds;
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
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
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

    public static final class Builder extends Request.Builder<BatchDeleteTableVersionsRequest, Builder> {
        private String regionId; 
        private String catalogId; 
        private String databaseName; 
        private String tableName; 
        private java.util.List < Integer > versionIds; 

        private Builder() {
            super();
        } 

        private Builder(BatchDeleteTableVersionsRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.catalogId = request.catalogId;
            this.databaseName = request.databaseName;
            this.tableName = request.tableName;
            this.versionIds = request.versionIds;
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
         * CatalogId.
         */
        public Builder catalogId(String catalogId) {
            this.putBodyParameter("CatalogId", catalogId);
            this.catalogId = catalogId;
            return this;
        }

        /**
         * DatabaseName.
         */
        public Builder databaseName(String databaseName) {
            this.putBodyParameter("DatabaseName", databaseName);
            this.databaseName = databaseName;
            return this;
        }

        /**
         * TableName.
         */
        public Builder tableName(String tableName) {
            this.putBodyParameter("TableName", tableName);
            this.tableName = tableName;
            return this;
        }

        /**
         * VersionIds.
         */
        public Builder versionIds(java.util.List < Integer > versionIds) {
            this.putBodyParameter("VersionIds", versionIds);
            this.versionIds = versionIds;
            return this;
        }

        @Override
        public BatchDeleteTableVersionsRequest build() {
            return new BatchDeleteTableVersionsRequest(this);
        } 

    } 

}
