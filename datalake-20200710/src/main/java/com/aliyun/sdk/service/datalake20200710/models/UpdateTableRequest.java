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
    @Host
    @NameInMap("RegionId")
    private String regionId;

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

    private UpdateTableRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.allowPartitionKeyChange = builder.allowPartitionKeyChange;
        this.catalogId = builder.catalogId;
        this.databaseName = builder.databaseName;
        this.isAsync = builder.isAsync;
        this.skipArchive = builder.skipArchive;
        this.tableInput = builder.tableInput;
        this.tableName = builder.tableName;
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
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
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

    public static final class Builder extends Request.Builder<UpdateTableRequest, Builder> {
        private String regionId; 
        private Boolean allowPartitionKeyChange; 
        private String catalogId; 
        private String databaseName; 
        private Boolean isAsync; 
        private Boolean skipArchive; 
        private TableInput tableInput; 
        private String tableName; 

        private Builder() {
            super();
        } 

        private Builder(UpdateTableRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.allowPartitionKeyChange = request.allowPartitionKeyChange;
            this.catalogId = request.catalogId;
            this.databaseName = request.databaseName;
            this.isAsync = request.isAsync;
            this.skipArchive = request.skipArchive;
            this.tableInput = request.tableInput;
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
         * AllowPartitionKeyChange.
         */
        public Builder allowPartitionKeyChange(Boolean allowPartitionKeyChange) {
            this.putBodyParameter("AllowPartitionKeyChange", allowPartitionKeyChange);
            this.allowPartitionKeyChange = allowPartitionKeyChange;
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
         * IsAsync.
         */
        public Builder isAsync(Boolean isAsync) {
            this.putBodyParameter("IsAsync", isAsync);
            this.isAsync = isAsync;
            return this;
        }

        /**
         * SkipArchive.
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
         * TableName.
         */
        public Builder tableName(String tableName) {
            this.putBodyParameter("TableName", tableName);
            this.tableName = tableName;
            return this;
        }

        @Override
        public UpdateTableRequest build() {
            return new UpdateTableRequest(this);
        } 

    } 

}
