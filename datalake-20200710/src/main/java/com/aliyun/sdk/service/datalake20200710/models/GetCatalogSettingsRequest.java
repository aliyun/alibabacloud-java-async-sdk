// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.datalake20200710.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetCatalogSettingsRequest} extends {@link RequestModel}
 *
 * <p>GetCatalogSettingsRequest</p>
 */
public class GetCatalogSettingsRequest extends Request {
    @Host
    @NameInMap("RegionId")
    private String regionId;

    @Query
    @NameInMap("CatalogId")
    private String catalogId;

    private GetCatalogSettingsRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.catalogId = builder.catalogId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetCatalogSettingsRequest create() {
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

    public static final class Builder extends Request.Builder<GetCatalogSettingsRequest, Builder> {
        private String regionId; 
        private String catalogId; 

        private Builder() {
            super();
        } 

        private Builder(GetCatalogSettingsRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.catalogId = request.catalogId;
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
            this.putQueryParameter("CatalogId", catalogId);
            this.catalogId = catalogId;
            return this;
        }

        @Override
        public GetCatalogSettingsRequest build() {
            return new GetCatalogSettingsRequest(this);
        } 

    } 

}
