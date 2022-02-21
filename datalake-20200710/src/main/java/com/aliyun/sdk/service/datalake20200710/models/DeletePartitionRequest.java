// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.datalake20200710.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeletePartitionRequest} extends {@link RequestModel}
 *
 * <p>DeletePartitionRequest</p>
 */
public class DeletePartitionRequest extends Request {
    @Body
    @NameInMap("CatalogId")
    private String catalogId;

    @Body
    @NameInMap("DatabaseName")
    private String databaseName;

    @Body
    @NameInMap("IfExists")
    private Boolean ifExists;

    @Body
    @NameInMap("PartitionValues")
    private java.util.List < String > partitionValues;

    @Body
    @NameInMap("TableName")
    private String tableName;

    @Host
    @NameInMap("RegionId")
    private String regionId;

    private DeletePartitionRequest(Builder builder) {
        super(builder);
        this.catalogId = builder.catalogId;
        this.databaseName = builder.databaseName;
        this.ifExists = builder.ifExists;
        this.partitionValues = builder.partitionValues;
        this.tableName = builder.tableName;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeletePartitionRequest create() {
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
     * @return ifExists
     */
    public Boolean getIfExists() {
        return this.ifExists;
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

    public static final class Builder extends Request.Builder<DeletePartitionRequest, Builder> {
        private String catalogId; 
        private String databaseName; 
        private Boolean ifExists; 
        private java.util.List < String > partitionValues; 
        private String tableName; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(DeletePartitionRequest response) {
            super(response);
            this.catalogId = response.catalogId;
            this.databaseName = response.databaseName;
            this.ifExists = response.ifExists;
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
         * IfExists
         */
        public Builder ifExists(Boolean ifExists) {
            this.putBodyParameter("IfExists", ifExists);
            this.ifExists = ifExists;
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
        public DeletePartitionRequest build() {
            return new DeletePartitionRequest(this);
        } 

    } 

}
