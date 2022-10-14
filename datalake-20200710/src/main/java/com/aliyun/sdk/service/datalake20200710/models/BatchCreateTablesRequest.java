// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.datalake20200710.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link BatchCreateTablesRequest} extends {@link RequestModel}
 *
 * <p>BatchCreateTablesRequest</p>
 */
public class BatchCreateTablesRequest extends Request {
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
    @NameInMap("IfNotExists")
    private Boolean ifNotExists;

    @Body
    @NameInMap("TableInputs")
    private java.util.List < TableInput > tableInputs;

    private BatchCreateTablesRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.catalogId = builder.catalogId;
        this.databaseName = builder.databaseName;
        this.ifNotExists = builder.ifNotExists;
        this.tableInputs = builder.tableInputs;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static BatchCreateTablesRequest create() {
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
     * @return tableInputs
     */
    public java.util.List < TableInput > getTableInputs() {
        return this.tableInputs;
    }

    public static final class Builder extends Request.Builder<BatchCreateTablesRequest, Builder> {
        private String regionId; 
        private String catalogId; 
        private String databaseName; 
        private Boolean ifNotExists; 
        private java.util.List < TableInput > tableInputs; 

        private Builder() {
            super();
        } 

        private Builder(BatchCreateTablesRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.catalogId = request.catalogId;
            this.databaseName = request.databaseName;
            this.ifNotExists = request.ifNotExists;
            this.tableInputs = request.tableInputs;
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
         * IfNotExists
         */
        public Builder ifNotExists(Boolean ifNotExists) {
            this.putBodyParameter("IfNotExists", ifNotExists);
            this.ifNotExists = ifNotExists;
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

        @Override
        public BatchCreateTablesRequest build() {
            return new BatchCreateTablesRequest(this);
        } 

    } 

}
