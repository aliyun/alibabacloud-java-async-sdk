// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.datalake20200710.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link BatchDeleteTablesRequest} extends {@link RequestModel}
 *
 * <p>BatchDeleteTablesRequest</p>
 */
public class BatchDeleteTablesRequest extends Request {
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
    @NameInMap("IfExists")
    private Boolean ifExists;

    @Body
    @NameInMap("TableNames")
    private java.util.List < String > tableNames;

    private BatchDeleteTablesRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.catalogId = builder.catalogId;
        this.databaseName = builder.databaseName;
        this.ifExists = builder.ifExists;
        this.tableNames = builder.tableNames;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static BatchDeleteTablesRequest create() {
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
     * @return tableNames
     */
    public java.util.List < String > getTableNames() {
        return this.tableNames;
    }

    public static final class Builder extends Request.Builder<BatchDeleteTablesRequest, Builder> {
        private String regionId; 
        private String catalogId; 
        private String databaseName; 
        private Boolean ifExists; 
        private java.util.List < String > tableNames; 

        private Builder() {
            super();
        } 

        private Builder(BatchDeleteTablesRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.catalogId = request.catalogId;
            this.databaseName = request.databaseName;
            this.ifExists = request.ifExists;
            this.tableNames = request.tableNames;
        } 

        /**
         * RegionId
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
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
         * IfExists
         */
        public Builder ifExists(Boolean ifExists) {
            this.putBodyParameter("IfExists", ifExists);
            this.ifExists = ifExists;
            return this;
        }

        /**
         * TableName
         */
        public Builder tableNames(java.util.List < String > tableNames) {
            this.putBodyParameter("TableNames", tableNames);
            this.tableNames = tableNames;
            return this;
        }

        @Override
        public BatchDeleteTablesRequest build() {
            return new BatchDeleteTablesRequest(this);
        } 

    } 

}
