// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.datalake20200710.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link RenamePartitionRequest} extends {@link RequestModel}
 *
 * <p>RenamePartitionRequest</p>
 */
public class RenamePartitionRequest extends Request {
    @Body
    @NameInMap("CatalogId")
    private String catalogId;

    @Body
    @NameInMap("DatabaseName")
    private String databaseName;

    @Body
    @NameInMap("PartitionInput")
    private PartitionInput partitionInput;

    @Body
    @NameInMap("PartitionValues")
    private java.util.List < String > partitionValues;

    @Body
    @NameInMap("TableName")
    private String tableName;

    @Host
    @NameInMap("RegionId")
    private String regionId;

    private RenamePartitionRequest(Builder builder) {
        super(builder);
        this.catalogId = builder.catalogId;
        this.databaseName = builder.databaseName;
        this.partitionInput = builder.partitionInput;
        this.partitionValues = builder.partitionValues;
        this.tableName = builder.tableName;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static RenamePartitionRequest create() {
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
     * @return partitionInput
     */
    public PartitionInput getPartitionInput() {
        return this.partitionInput;
    }

    /**
     * @return partitionValues
     */
    public java.util.List < String > getPartitionValues() {
        return this.partitionValues;
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

    public static final class Builder extends Request.Builder<RenamePartitionRequest, Builder> {
        private String catalogId; 
        private String databaseName; 
        private PartitionInput partitionInput; 
        private java.util.List < String > partitionValues; 
        private String tableName; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(RenamePartitionRequest response) {
            super(response);
            this.catalogId = response.catalogId;
            this.databaseName = response.databaseName;
            this.partitionInput = response.partitionInput;
            this.partitionValues = response.partitionValues;
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
         * PartitionInput.
         */
        public Builder partitionInput(PartitionInput partitionInput) {
            this.putBodyParameter("PartitionInput", partitionInput);
            this.partitionInput = partitionInput;
            return this;
        }

        /**
         * PartitionValues.
         */
        public Builder partitionValues(java.util.List < String > partitionValues) {
            this.putBodyParameter("PartitionValues", partitionValues);
            this.partitionValues = partitionValues;
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
        public RenamePartitionRequest build() {
            return new RenamePartitionRequest(this);
        } 

    } 

}
