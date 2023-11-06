// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.config20200907.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GenerateResourceInventoryRequest} extends {@link RequestModel}
 *
 * <p>GenerateResourceInventoryRequest</p>
 */
public class GenerateResourceInventoryRequest extends Request {
    @Query
    @NameInMap("Regions")
    private String regions;

    @Query
    @NameInMap("ResourceTypes")
    private String resourceTypes;

    private GenerateResourceInventoryRequest(Builder builder) {
        super(builder);
        this.regions = builder.regions;
        this.resourceTypes = builder.resourceTypes;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GenerateResourceInventoryRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return regions
     */
    public String getRegions() {
        return this.regions;
    }

    /**
     * @return resourceTypes
     */
    public String getResourceTypes() {
        return this.resourceTypes;
    }

    public static final class Builder extends Request.Builder<GenerateResourceInventoryRequest, Builder> {
        private String regions; 
        private String resourceTypes; 

        private Builder() {
            super();
        } 

        private Builder(GenerateResourceInventoryRequest request) {
            super(request);
            this.regions = request.regions;
            this.resourceTypes = request.resourceTypes;
        } 

        /**
         * The region IDs of the resources. Separate multiple region IDs with commas (,).
         */
        public Builder regions(String regions) {
            this.putQueryParameter("Regions", regions);
            this.regions = regions;
            return this;
        }

        /**
         * The resource types. Separate multiple resource types with commas (,).
         */
        public Builder resourceTypes(String resourceTypes) {
            this.putQueryParameter("ResourceTypes", resourceTypes);
            this.resourceTypes = resourceTypes;
            return this;
        }

        @Override
        public GenerateResourceInventoryRequest build() {
            return new GenerateResourceInventoryRequest(this);
        } 

    } 

}
