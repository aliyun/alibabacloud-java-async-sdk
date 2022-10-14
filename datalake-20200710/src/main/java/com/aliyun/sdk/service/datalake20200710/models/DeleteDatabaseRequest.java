// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.datalake20200710.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteDatabaseRequest} extends {@link RequestModel}
 *
 * <p>DeleteDatabaseRequest</p>
 */
public class DeleteDatabaseRequest extends Request {
    @Host
    @NameInMap("RegionId")
    private String regionId;

    @Query
    @NameInMap("Cascade")
    private Boolean cascade;

    @Query
    @NameInMap("CatalogId")
    private String catalogId;

    @Query
    @NameInMap("Name")
    private String name;

    private DeleteDatabaseRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.cascade = builder.cascade;
        this.catalogId = builder.catalogId;
        this.name = builder.name;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteDatabaseRequest create() {
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
     * @return cascade
     */
    public Boolean getCascade() {
        return this.cascade;
    }

    /**
     * @return catalogId
     */
    public String getCatalogId() {
        return this.catalogId;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    public static final class Builder extends Request.Builder<DeleteDatabaseRequest, Builder> {
        private String regionId; 
        private Boolean cascade; 
        private String catalogId; 
        private String name; 

        private Builder() {
            super();
        } 

        private Builder(DeleteDatabaseRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.cascade = request.cascade;
            this.catalogId = request.catalogId;
            this.name = request.name;
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
         * Cascade
         */
        public Builder cascade(Boolean cascade) {
            this.putQueryParameter("Cascade", cascade);
            this.cascade = cascade;
            return this;
        }

        /**
         * CatalogId
         */
        public Builder catalogId(String catalogId) {
            this.putQueryParameter("CatalogId", catalogId);
            this.catalogId = catalogId;
            return this;
        }

        /**
         * Name
         */
        public Builder name(String name) {
            this.putQueryParameter("Name", name);
            this.name = name;
            return this;
        }

        @Override
        public DeleteDatabaseRequest build() {
            return new DeleteDatabaseRequest(this);
        } 

    } 

}
