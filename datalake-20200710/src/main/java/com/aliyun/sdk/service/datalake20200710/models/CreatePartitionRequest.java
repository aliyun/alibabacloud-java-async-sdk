// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.datalake20200710.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreatePartitionRequest} extends {@link RequestModel}
 *
 * <p>CreatePartitionRequest</p>
 */
public class CreatePartitionRequest extends Request {
    @Body
    @NameInMap("CatalogId")
    private String catalogId;

    @Body
    @NameInMap("DatabaseName")
    private String databaseName;

    @Body
    @NameInMap("IfNotExists")
    private Boolean ifNotExists;

    @Body
    @NameInMap("NeedResult")
    private Boolean needResult;

    @Body
    @NameInMap("PartitionInput")
    private PartitionInput partitionInput;

    @Body
    @NameInMap("TableName")
    private String tableName;

    @Host
    @NameInMap("RegionId")
    private String regionId;

    private CreatePartitionRequest(Builder builder) {
        super(builder);
        this.catalogId = builder.catalogId;
        this.databaseName = builder.databaseName;
        this.ifNotExists = builder.ifNotExists;
        this.needResult = builder.needResult;
        this.partitionInput = builder.partitionInput;
        this.tableName = builder.tableName;
        this.regionId = builder.regionId;
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

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    public static final class Builder extends Request.Builder<CreatePartitionRequest, Builder> {
        private String catalogId; 
        private String databaseName; 
        private Boolean ifNotExists; 
        private Boolean needResult; 
        private PartitionInput partitionInput; 
        private String tableName; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(CreatePartitionRequest response) {
            super(response);
            this.catalogId = response.catalogId;
            this.databaseName = response.databaseName;
            this.ifNotExists = response.ifNotExists;
            this.needResult = response.needResult;
            this.partitionInput = response.partitionInput;
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
         * IfNotExists
         */
        public Builder ifNotExists(Boolean ifNotExists) {
            this.putBodyParameter("IfNotExists", ifNotExists);
            this.ifNotExists = ifNotExists;
            return this;
        }

        /**
         * NeedResult
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
        public CreatePartitionRequest build() {
            return new CreatePartitionRequest(this);
        } 

    } 

}
