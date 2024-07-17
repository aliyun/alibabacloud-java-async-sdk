// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.datalake20200710.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreatePartitionRequest} extends {@link RequestModel}
 *
 * <p>CreatePartitionRequest</p>
 */
public class CreatePartitionRequest extends Request {
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
    @com.aliyun.core.annotation.NameInMap("IfNotExists")
    private Boolean ifNotExists;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("NeedResult")
    private Boolean needResult;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("PartitionInput")
    private PartitionInput partitionInput;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("TableName")
    private String tableName;

    private CreatePartitionRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.catalogId = builder.catalogId;
        this.databaseName = builder.databaseName;
        this.ifNotExists = builder.ifNotExists;
        this.needResult = builder.needResult;
        this.partitionInput = builder.partitionInput;
        this.tableName = builder.tableName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreatePartitionRequest create() {
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
     * @return ifNotExists
     */
    public Boolean getIfNotExists() {
        return this.ifNotExists;
    }

    /**
     * @return needResult
     */
    public Boolean getNeedResult() {
        return this.needResult;
    }

    /**
     * @return partitionInput
     */
    public PartitionInput getPartitionInput() {
        return this.partitionInput;
    }

    /**
     * @return tableName
     */
    public String getTableName() {
        return this.tableName;
    }

    public static final class Builder extends Request.Builder<CreatePartitionRequest, Builder> {
        private String regionId; 
        private String catalogId; 
        private String databaseName; 
        private Boolean ifNotExists; 
        private Boolean needResult; 
        private PartitionInput partitionInput; 
        private String tableName; 

        private Builder() {
            super();
        } 

        private Builder(CreatePartitionRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.catalogId = request.catalogId;
            this.databaseName = request.databaseName;
            this.ifNotExists = request.ifNotExists;
            this.needResult = request.needResult;
            this.partitionInput = request.partitionInput;
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
         * IfNotExists.
         */
        public Builder ifNotExists(Boolean ifNotExists) {
            this.putBodyParameter("IfNotExists", ifNotExists);
            this.ifNotExists = ifNotExists;
            return this;
        }

        /**
         * NeedResult.
         */
        public Builder needResult(Boolean needResult) {
            this.putBodyParameter("NeedResult", needResult);
            this.needResult = needResult;
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
         * TableName.
         */
        public Builder tableName(String tableName) {
            this.putBodyParameter("TableName", tableName);
            this.tableName = tableName;
            return this;
        }

        @Override
        public CreatePartitionRequest build() {
            return new CreatePartitionRequest(this);
        } 

    } 

}
