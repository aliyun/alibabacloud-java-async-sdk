// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.datalake20200710.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link RenameTableRequest} extends {@link RequestModel}
 *
 * <p>RenameTableRequest</p>
 */
public class RenameTableRequest extends Request {
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
    @NameInMap("TableInput")
    private TableInput tableInput;

    @Body
    @NameInMap("TableName")
    private String tableName;

    @Host
    @NameInMap("RegionId")
    private String regionId;

    private RenameTableRequest(Builder builder) {
        super(builder);
        this.catalogId = builder.catalogId;
        this.databaseName = builder.databaseName;
        this.isAsync = builder.isAsync;
        this.tableInput = builder.tableInput;
        this.tableName = builder.tableName;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static RenameTableRequest create() {
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
     * @return isAsync
     */
    public Boolean getIsAsync() {
        return this.isAsync;
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

    public static final class Builder extends Request.Builder<RenameTableRequest, Builder> {
        private String catalogId; 
        private String databaseName; 
        private Boolean isAsync; 
        private TableInput tableInput; 
        private String tableName; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(RenameTableRequest response) {
            super(response);
            this.catalogId = response.catalogId;
            this.databaseName = response.databaseName;
            this.isAsync = response.isAsync;
            this.tableInput = response.tableInput;
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
         * IsAsync
         */
        public Builder isAsync(Boolean isAsync) {
            this.putBodyParameter("IsAsync", isAsync);
            this.isAsync = isAsync;
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
        public RenameTableRequest build() {
            return new RenameTableRequest(this);
        } 

    } 

}
