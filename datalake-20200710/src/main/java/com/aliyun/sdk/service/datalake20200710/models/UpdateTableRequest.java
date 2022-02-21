// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.datalake20200710.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateTableRequest} extends {@link RequestModel}
 *
 * <p>UpdateTableRequest</p>
 */
public class UpdateTableRequest extends Request {
    @Body
    @NameInMap("AllowPartitionKeyChange")
    private Boolean allowPartitionKeyChange;

    @Body
    @NameInMap("CatalogId")
    private String catalogId;

    @Body
    @NameInMap("DatabaseName")
    private String databaseName;

    @Body
    @NameInMap("IsAsync")
    private Boolean isAsync;

    @Body
    @NameInMap("SkipArchive")
    private Boolean skipArchive;

    @Body
    @NameInMap("TableInput")
    private TableInput tableInput;

    @Body
    @NameInMap("TableName")
    private String tableName;

    @Host
    @NameInMap("RegionId")
    private String regionId;

    private UpdateTableRequest(Builder builder) {
        super(builder);
        this.allowPartitionKeyChange = builder.allowPartitionKeyChange;
        this.catalogId = builder.catalogId;
        this.databaseName = builder.databaseName;
        this.isAsync = builder.isAsync;
        this.skipArchive = builder.skipArchive;
        this.tableInput = builder.tableInput;
        this.tableName = builder.tableName;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateTableRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return allowPartitionKeyChange
     */
    public Boolean getAllowPartitionKeyChange() {
        return this.allowPartitionKeyChange;
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
     * @return isAsync
     */
    public Boolean getIsAsync() {
        return this.isAsync;
    }

    /**
     * @return skipArchive
     */
    public Boolean getSkipArchive() {
        return this.skipArchive;
    }

    /**
     * @return tableInput
     */
    public TableInput getTableInput() {
        return this.tableInput;
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

    public static final class Builder extends Request.Builder<UpdateTableRequest, Builder> {
        private Boolean allowPartitionKeyChange; 
        private String catalogId; 
        private String databaseName; 
        private Boolean isAsync; 
        private Boolean skipArchive; 
        private TableInput tableInput; 
        private String tableName; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(UpdateTableRequest response) {
            super(response);
            this.allowPartitionKeyChange = response.allowPartitionKeyChange;
            this.catalogId = response.catalogId;
            this.databaseName = response.databaseName;
            this.isAsync = response.isAsync;
            this.skipArchive = response.skipArchive;
            this.tableInput = response.tableInput;
            this.tableName = response.tableName;
            this.regionId = response.regionId;
        } 

        /**
         * AllowPartitionKeyChange
         */
        public Builder allowPartitionKeyChange(Boolean allowPartitionKeyChange) {
            this.putBodyParameter("AllowPartitionKeyChange", allowPartitionKeyChange);
            this.allowPartitionKeyChange = allowPartitionKeyChange;
            return this;
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
         * IsAsync
         */
        public Builder isAsync(Boolean isAsync) {
            this.putBodyParameter("IsAsync", isAsync);
            this.isAsync = isAsync;
            return this;
        }

        /**
         * SkipArchive
         */
        public Builder skipArchive(Boolean skipArchive) {
            this.putBodyParameter("SkipArchive", skipArchive);
            this.skipArchive = skipArchive;
            return this;
        }

        /**
         * TableInput.
         */
        public Builder tableInput(TableInput tableInput) {
            this.putBodyParameter("TableInput", tableInput);
            this.tableInput = tableInput;
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
        public UpdateTableRequest build() {
            return new UpdateTableRequest(this);
        } 

    } 

}
