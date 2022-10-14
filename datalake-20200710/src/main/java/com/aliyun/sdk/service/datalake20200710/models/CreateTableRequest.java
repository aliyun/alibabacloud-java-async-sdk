// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.datalake20200710.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateTableRequest} extends {@link RequestModel}
 *
 * <p>CreateTableRequest</p>
 */
public class CreateTableRequest extends Request {
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
    @NameInMap("TableInput")
    private TableInput tableInput;

    private CreateTableRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.catalogId = builder.catalogId;
        this.databaseName = builder.databaseName;
        this.tableInput = builder.tableInput;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateTableRequest create() {
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
     * @return tableInput
     */
    public TableInput getTableInput() {
        return this.tableInput;
    }

    public static final class Builder extends Request.Builder<CreateTableRequest, Builder> {
        private String regionId; 
        private String catalogId; 
        private String databaseName; 
        private TableInput tableInput; 

        private Builder() {
            super();
        } 

        private Builder(CreateTableRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.catalogId = request.catalogId;
            this.databaseName = request.databaseName;
            this.tableInput = request.tableInput;
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
         * TableInput.
         */
        public Builder tableInput(TableInput tableInput) {
            this.putBodyParameter("TableInput", tableInput);
            this.tableInput = tableInput;
            return this;
        }

        @Override
        public CreateTableRequest build() {
            return new CreateTableRequest(this);
        } 

    } 

}
