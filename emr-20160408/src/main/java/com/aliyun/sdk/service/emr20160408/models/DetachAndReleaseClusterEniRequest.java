// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.emr20160408.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DetachAndReleaseClusterEniRequest} extends {@link RequestModel}
 *
 * <p>DetachAndReleaseClusterEniRequest</p>
 */
public class DetachAndReleaseClusterEniRequest extends Request {
    @Query
    @NameInMap("RegionId")
    @Validation(required = true)
    private String regionId;

    @Query
    @NameInMap("ResourceOwnerId")
    private Long resourceOwnerId;

    @Query
    @NameInMap("TargetClusterId")
    @Validation(required = true)
    private String targetClusterId;

    @Query
    @NameInMap("VswitchId")
    @Validation(required = true)
    private String vswitchId;

    private DetachAndReleaseClusterEniRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.resourceOwnerId = builder.resourceOwnerId;
        this.targetClusterId = builder.targetClusterId;
        this.vswitchId = builder.vswitchId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DetachAndReleaseClusterEniRequest create() {
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
     * @return resourceOwnerId
     */
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    /**
     * @return targetClusterId
     */
    public String getTargetClusterId() {
        return this.targetClusterId;
    }

    /**
     * @return vswitchId
     */
    public String getVswitchId() {
        return this.vswitchId;
    }

    public static final class Builder extends Request.Builder<DetachAndReleaseClusterEniRequest, Builder> {
        private String regionId; 
        private Long resourceOwnerId; 
        private String targetClusterId; 
        private String vswitchId; 

        private Builder() {
            super();
        } 

        private Builder(DetachAndReleaseClusterEniRequest response) {
            super(response);
            this.regionId = response.regionId;
            this.resourceOwnerId = response.resourceOwnerId;
            this.targetClusterId = response.targetClusterId;
            this.vswitchId = response.vswitchId;
        } 

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * ResourceOwnerId.
         */
        public Builder resourceOwnerId(Long resourceOwnerId) {
            this.putQueryParameter("ResourceOwnerId", resourceOwnerId);
            this.resourceOwnerId = resourceOwnerId;
            return this;
        }

        /**
         * TargetClusterId.
         */
        public Builder targetClusterId(String targetClusterId) {
            this.putQueryParameter("TargetClusterId", targetClusterId);
            this.targetClusterId = targetClusterId;
            return this;
        }

        /**
         * VswitchId.
         */
        public Builder vswitchId(String vswitchId) {
            this.putQueryParameter("VswitchId", vswitchId);
            this.vswitchId = vswitchId;
            return this;
        }

        @Override
        public DetachAndReleaseClusterEniRequest build() {
            return new DetachAndReleaseClusterEniRequest(this);
        } 

    } 

}
