// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.datalake20200710.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateCatalogRequest} extends {@link RequestModel}
 *
 * <p>UpdateCatalogRequest</p>
 */
public class UpdateCatalogRequest extends Request {
    @Host
    @NameInMap("RegionId")
    private String regionId;

    @Body
    @NameInMap("CatalogInput")
    @Validation(required = true)
    private CatalogInput catalogInput;

    private UpdateCatalogRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.catalogInput = builder.catalogInput;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateCatalogRequest create() {
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
     * @return catalogInput
     */
    public CatalogInput getCatalogInput() {
        return this.catalogInput;
    }

    public static final class Builder extends Request.Builder<UpdateCatalogRequest, Builder> {
        private String regionId; 
        private CatalogInput catalogInput; 

        private Builder() {
            super();
        } 

        private Builder(UpdateCatalogRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.catalogInput = request.catalogInput;
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
         * CatalogInput.
         */
        public Builder catalogInput(CatalogInput catalogInput) {
            this.putBodyParameter("CatalogInput", catalogInput);
            this.catalogInput = catalogInput;
            return this;
        }

        @Override
        public UpdateCatalogRequest build() {
            return new UpdateCatalogRequest(this);
        } 

    } 

}
