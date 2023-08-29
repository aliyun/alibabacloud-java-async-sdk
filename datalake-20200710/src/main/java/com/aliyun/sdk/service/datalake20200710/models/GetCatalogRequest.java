// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.datalake20200710.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetCatalogRequest} extends {@link RequestModel}
 *
 * <p>GetCatalogRequest</p>
 */
public class GetCatalogRequest extends Request {
    @Host
    @NameInMap("RegionId")
    private String regionId;

    @Query
    @NameInMap("CatalogId")
    private String catalogId;

    private GetCatalogRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.catalogId = builder.catalogId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetCatalogRequest create() {
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

    public static final class Builder extends Request.Builder<GetCatalogRequest, Builder> {
        private String regionId; 
        private String catalogId; 

        private Builder() {
            super();
        } 

        private Builder(GetCatalogRequest request) {
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
         * catalogId
         */
        public Builder catalogId(String catalogId) {
            this.putQueryParameter("CatalogId", catalogId);
            this.catalogId = catalogId;
            return this;
        }

        @Override
        public GetCatalogRequest build() {
            return new GetCatalogRequest(this);
        } 

    } 

}
