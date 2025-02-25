// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.datalake20200710.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateCatalogRequest} extends {@link RequestModel}
 *
 * <p>CreateCatalogRequest</p>
 */
public class CreateCatalogRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("CatalogInput")
    private CatalogInput catalogInput;

    private CreateCatalogRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.catalogInput = builder.catalogInput;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateCatalogRequest create() {
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

    public static final class Builder extends Request.Builder<CreateCatalogRequest, Builder> {
        private String regionId; 
        private CatalogInput catalogInput; 

        private Builder() {
            super();
        } 

        private Builder(CreateCatalogRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.catalogInput = request.catalogInput;
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
         * cataloginput
         */
        public Builder catalogInput(CatalogInput catalogInput) {
            this.putBodyParameter("CatalogInput", catalogInput);
            this.catalogInput = catalogInput;
            return this;
        }

        @Override
        public CreateCatalogRequest build() {
            return new CreateCatalogRequest(this);
        } 

    } 

}
