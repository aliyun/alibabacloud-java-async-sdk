// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataworks_public20200518.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListCurrentUsageForResourceGroupRequest} extends {@link RequestModel}
 *
 * <p>ListCurrentUsageForResourceGroupRequest</p>
 */
public class ListCurrentUsageForResourceGroupRequest extends Request {
    @Host
    @NameInMap("RegionId")
    private String regionId;

    @Body
    @NameInMap("ProjectEnv")
    private String projectEnv;

    @Body
    @NameInMap("ResourceGroupIdentifier")
    @Validation(required = true)
    private String resourceGroupIdentifier;

    private ListCurrentUsageForResourceGroupRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.projectEnv = builder.projectEnv;
        this.resourceGroupIdentifier = builder.resourceGroupIdentifier;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListCurrentUsageForResourceGroupRequest create() {
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
     * @return projectEnv
     */
    public String getProjectEnv() {
        return this.projectEnv;
    }

    /**
     * @return resourceGroupIdentifier
     */
    public String getResourceGroupIdentifier() {
        return this.resourceGroupIdentifier;
    }

    public static final class Builder extends Request.Builder<ListCurrentUsageForResourceGroupRequest, Builder> {
        private String regionId; 
        private String projectEnv; 
        private String resourceGroupIdentifier; 

        private Builder() {
            super();
        } 

        private Builder(ListCurrentUsageForResourceGroupRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.projectEnv = request.projectEnv;
            this.resourceGroupIdentifier = request.resourceGroupIdentifier;
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
         * ProjectEnv.
         */
        public Builder projectEnv(String projectEnv) {
            this.putBodyParameter("ProjectEnv", projectEnv);
            this.projectEnv = projectEnv;
            return this;
        }

        /**
         * ResourceGroupIdentifier.
         */
        public Builder resourceGroupIdentifier(String resourceGroupIdentifier) {
            this.putBodyParameter("ResourceGroupIdentifier", resourceGroupIdentifier);
            this.resourceGroupIdentifier = resourceGroupIdentifier;
            return this;
        }

        @Override
        public ListCurrentUsageForResourceGroupRequest build() {
            return new ListCurrentUsageForResourceGroupRequest(this);
        } 

    } 

}
