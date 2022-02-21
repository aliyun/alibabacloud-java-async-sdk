// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.datalake20200710.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateDatabaseRequest} extends {@link RequestModel}
 *
 * <p>CreateDatabaseRequest</p>
 */
public class CreateDatabaseRequest extends Request {
    @Body
    @NameInMap("CatalogId")
    private String catalogId;

    @Body
    @NameInMap("DatabaseInput")
    private DatabaseInput databaseInput;

    @Host
    @NameInMap("RegionId")
    private String regionId;

    private CreateDatabaseRequest(Builder builder) {
        super(builder);
        this.catalogId = builder.catalogId;
        this.databaseInput = builder.databaseInput;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateDatabaseRequest create() {
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
     * @return databaseInput
     */
    public DatabaseInput getDatabaseInput() {
        return this.databaseInput;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    public static final class Builder extends Request.Builder<CreateDatabaseRequest, Builder> {
        private String catalogId; 
        private DatabaseInput databaseInput; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(CreateDatabaseRequest response) {
            super(response);
            this.catalogId = response.catalogId;
            this.databaseInput = response.databaseInput;
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
         * DatabaseInput.
         */
        public Builder databaseInput(DatabaseInput databaseInput) {
            this.putBodyParameter("DatabaseInput", databaseInput);
            this.databaseInput = databaseInput;
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
        public CreateDatabaseRequest build() {
            return new CreateDatabaseRequest(this);
        } 

    } 

}
