// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.config20200907.models;

import com.aliyun.sdk.gateway.pop.*;
import darabonba.core.*;
import darabonba.core.async.*;
import darabonba.core.sync.*;
import darabonba.core.client.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link GenerateResourceInventoryRequest} extends {@link RequestModel}
 *
 * <p>GenerateResourceInventoryRequest</p>
 */
public class GenerateResourceInventoryRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Regions")
    private String regions;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceDeleted")
    private Integer resourceDeleted;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceTypes")
    private String resourceTypes;

    private GenerateResourceInventoryRequest(Builder builder) {
        super(builder);
        this.regions = builder.regions;
        this.resourceDeleted = builder.resourceDeleted;
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
     * @return resourceDeleted
     */
    public Integer getResourceDeleted() {
        return this.resourceDeleted;
    }

    /**
     * @return resourceTypes
     */
    public String getResourceTypes() {
        return this.resourceTypes;
    }

    public static final class Builder extends Request.Builder<GenerateResourceInventoryRequest, Builder> {
        private String regions; 
        private Integer resourceDeleted; 
        private String resourceTypes; 

        private Builder() {
            super();
        } 

        private Builder(GenerateResourceInventoryRequest request) {
            super(request);
            this.regions = request.regions;
            this.resourceDeleted = request.resourceDeleted;
            this.resourceTypes = request.resourceTypes;
        } 

        /**
         * <p>The region IDs of the resources. Separate multiple region IDs with commas (,).</p>
         * 
         * <strong>example:</strong>
         * <p>cn-shanghai</p>
         */
        public Builder regions(String regions) {
            this.putQueryParameter("Regions", regions);
            this.regions = regions;
            return this;
        }

        /**
         * <p>Indicates whether the resource is deleted. Valid values:</p>
         * <ul>
         * <li>1 (default): The resource is retained.</li>
         * <li>0: The resource is deleted.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder resourceDeleted(Integer resourceDeleted) {
            this.putQueryParameter("ResourceDeleted", resourceDeleted);
            this.resourceDeleted = resourceDeleted;
            return this;
        }

        /**
         * <p>The resource types. Separate multiple resource types with commas (,).</p>
         * 
         * <strong>example:</strong>
         * <p>ACS::ECS::Instance</p>
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
