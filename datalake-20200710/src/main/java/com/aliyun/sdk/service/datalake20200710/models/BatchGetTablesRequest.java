// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.datalake20200710.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link BatchGetTablesRequest} extends {@link RequestModel}
 *
 * <p>BatchGetTablesRequest</p>
 */
public class BatchGetTablesRequest extends Request {
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
    @com.aliyun.core.annotation.NameInMap("TableNames")
    private java.util.List < String > tableNames;

    private BatchGetTablesRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.catalogId = builder.catalogId;
        this.databaseName = builder.databaseName;
        this.tableNames = builder.tableNames;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static BatchGetTablesRequest create() {
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
     * @return tableNames
     */
    public java.util.List < String > getTableNames() {
        return this.tableNames;
    }

    public static final class Builder extends Request.Builder<BatchGetTablesRequest, Builder> {
        private String regionId; 
        private String catalogId; 
        private String databaseName; 
        private java.util.List < String > tableNames; 

        private Builder() {
            super();
        } 

        private Builder(BatchGetTablesRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.catalogId = request.catalogId;
            this.databaseName = request.databaseName;
            this.tableNames = request.tableNames;
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
         * TableNames.
         */
        public Builder tableNames(java.util.List < String > tableNames) {
            this.putBodyParameter("TableNames", tableNames);
            this.tableNames = tableNames;
            return this;
        }

        @Override
        public BatchGetTablesRequest build() {
            return new BatchGetTablesRequest(this);
        } 

    } 

}
