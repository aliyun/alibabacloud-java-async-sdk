// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.datalake20200710.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link BatchUpdatePartitionsRequest} extends {@link RequestModel}
 *
 * <p>BatchUpdatePartitionsRequest</p>
 */
public class BatchUpdatePartitionsRequest extends Request {
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
    @NameInMap("PartitionInputs")
    private java.util.List < PartitionInput > partitionInputs;

    @Body
    @NameInMap("TableName")
    private String tableName;

    private BatchUpdatePartitionsRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.catalogId = builder.catalogId;
        this.databaseName = builder.databaseName;
        this.partitionInputs = builder.partitionInputs;
        this.tableName = builder.tableName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static BatchUpdatePartitionsRequest create() {
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
     * @return partitionInputs
     */
    public java.util.List < PartitionInput > getPartitionInputs() {
        return this.partitionInputs;
    }

    /**
     * @return tableName
     */
    public String getTableName() {
        return this.tableName;
    }

    public static final class Builder extends Request.Builder<BatchUpdatePartitionsRequest, Builder> {
        private String regionId; 
        private String catalogId; 
        private String databaseName; 
        private java.util.List < PartitionInput > partitionInputs; 
        private String tableName; 

        private Builder() {
            super();
        } 

        private Builder(BatchUpdatePartitionsRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.catalogId = request.catalogId;
            this.databaseName = request.databaseName;
            this.partitionInputs = request.partitionInputs;
            this.tableName = request.tableName;
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
         * PartitionInputs.
         */
        public Builder partitionInputs(java.util.List < PartitionInput > partitionInputs) {
            this.putBodyParameter("PartitionInputs", partitionInputs);
            this.partitionInputs = partitionInputs;
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

        @Override
        public BatchUpdatePartitionsRequest build() {
            return new BatchUpdatePartitionsRequest(this);
        } 

    } 

}
