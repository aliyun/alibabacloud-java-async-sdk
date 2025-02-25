// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.datalake20200710.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeletePartitionRequest} extends {@link RequestModel}
 *
 * <p>DeletePartitionRequest</p>
 */
public class DeletePartitionRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("CatalogId")
    private String catalogId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("DatabaseName")
    private String databaseName;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("IfExists")
    private Boolean ifExists;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("PartitionValues")
    private java.util.List < String > partitionValues;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("TableName")
    private String tableName;

    private DeletePartitionRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.catalogId = builder.catalogId;
        this.databaseName = builder.databaseName;
        this.ifExists = builder.ifExists;
        this.partitionValues = builder.partitionValues;
        this.tableName = builder.tableName;
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

    public static final class Builder extends Request.Builder<DeletePartitionRequest, Builder> {
        private String regionId; 
        private String catalogId; 
        private String databaseName; 
        private Boolean ifExists; 
        private java.util.List < String > partitionValues; 
        private String tableName; 

        private Builder() {
            super();
        } 

        private Builder(DeletePartitionRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.catalogId = request.catalogId;
            this.databaseName = request.databaseName;
            this.ifExists = request.ifExists;
            this.partitionValues = request.partitionValues;
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
         * IfExists.
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
         * TableName.
         */
        public Builder tableName(String tableName) {
            this.putBodyParameter("TableName", tableName);
            this.tableName = tableName;
            return this;
        }

        @Override
        public DeletePartitionRequest build() {
            return new DeletePartitionRequest(this);
        } 

    } 

}
