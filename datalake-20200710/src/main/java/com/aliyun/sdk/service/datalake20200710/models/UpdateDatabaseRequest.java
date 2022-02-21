// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.datalake20200710.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateDatabaseRequest} extends {@link RequestModel}
 *
 * <p>UpdateDatabaseRequest</p>
 */
public class UpdateDatabaseRequest extends Request {
    @Body
    @NameInMap("CatalogId")
    private String catalogId;

    @Body
    @NameInMap("DatabaseInput")
    private DatabaseInput databaseInput;

    @Body
    @NameInMap("Name")
    private String name;

    @Host
    @NameInMap("RegionId")
    private String regionId;

    private UpdateDatabaseRequest(Builder builder) {
        super(builder);
        this.catalogId = builder.catalogId;
        this.databaseInput = builder.databaseInput;
        this.name = builder.name;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateDatabaseRequest create() {
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
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    public static final class Builder extends Request.Builder<UpdateDatabaseRequest, Builder> {
        private String catalogId; 
        private DatabaseInput databaseInput; 
        private String name; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(UpdateDatabaseRequest response) {
            super(response);
            this.catalogId = response.catalogId;
            this.databaseInput = response.databaseInput;
            this.name = response.name;
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
         * Name
         */
        public Builder name(String name) {
            this.putBodyParameter("Name", name);
            this.name = name;
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
        public UpdateDatabaseRequest build() {
            return new UpdateDatabaseRequest(this);
        } 

    } 

}
