// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.datalake20200710.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link BatchUpdateTablesRequest} extends {@link RequestModel}
 *
 * <p>BatchUpdateTablesRequest</p>
 */
public class BatchUpdateTablesRequest extends Request {
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
    @NameInMap("TableInputs")
    private java.util.List < TableInput > tableInputs;

    @Host
    @NameInMap("RegionId")
    private String regionId;

    private BatchUpdateTablesRequest(Builder builder) {
        super(builder);
        this.catalogId = builder.catalogId;
        this.databaseName = builder.databaseName;
        this.isAsync = builder.isAsync;
        this.tableInputs = builder.tableInputs;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static BatchUpdateTablesRequest create() {
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
     * @return tableInputs
     */
    public java.util.List < TableInput > getTableInputs() {
        return this.tableInputs;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    public static final class Builder extends Request.Builder<BatchUpdateTablesRequest, Builder> {
        private String catalogId; 
        private String databaseName; 
        private Boolean isAsync; 
        private java.util.List < TableInput > tableInputs; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(BatchUpdateTablesRequest response) {
            super(response);
            this.catalogId = response.catalogId;
            this.databaseName = response.databaseName;
            this.isAsync = response.isAsync;
            this.tableInputs = response.tableInputs;
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
         * 是否异步
         */
        public Builder isAsync(Boolean isAsync) {
            this.putBodyParameter("IsAsync", isAsync);
            this.isAsync = isAsync;
            return this;
        }

        /**
         * TableInputs
         */
        public Builder tableInputs(java.util.List < TableInput > tableInputs) {
            this.putBodyParameter("TableInputs", tableInputs);
            this.tableInputs = tableInputs;
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
        public BatchUpdateTablesRequest build() {
            return new BatchUpdateTablesRequest(this);
        } 

    } 

}
