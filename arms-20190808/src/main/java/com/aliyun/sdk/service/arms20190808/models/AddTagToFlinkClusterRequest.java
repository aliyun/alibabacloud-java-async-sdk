// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.arms20190808.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link AddTagToFlinkClusterRequest} extends {@link RequestModel}
 *
 * <p>AddTagToFlinkClusterRequest</p>
 */
public class AddTagToFlinkClusterRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClusterId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String clusterId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("FlinkWorkSpaceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String flinkWorkSpaceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("FlinkWorkSpaceName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String flinkWorkSpaceName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceGroupId")
    private String resourceGroupId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TargetUserId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String targetUserId;

    private AddTagToFlinkClusterRequest(Builder builder) {
        super(builder);
        this.clusterId = builder.clusterId;
        this.flinkWorkSpaceId = builder.flinkWorkSpaceId;
        this.flinkWorkSpaceName = builder.flinkWorkSpaceName;
        this.regionId = builder.regionId;
        this.resourceGroupId = builder.resourceGroupId;
        this.targetUserId = builder.targetUserId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AddTagToFlinkClusterRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return clusterId
     */
    public String getClusterId() {
        return this.clusterId;
    }

    /**
     * @return flinkWorkSpaceId
     */
    public String getFlinkWorkSpaceId() {
        return this.flinkWorkSpaceId;
    }

    /**
     * @return flinkWorkSpaceName
     */
    public String getFlinkWorkSpaceName() {
        return this.flinkWorkSpaceName;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return resourceGroupId
     */
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    /**
     * @return targetUserId
     */
    public String getTargetUserId() {
        return this.targetUserId;
    }

    public static final class Builder extends Request.Builder<AddTagToFlinkClusterRequest, Builder> {
        private String clusterId; 
        private String flinkWorkSpaceId; 
        private String flinkWorkSpaceName; 
        private String regionId; 
        private String resourceGroupId; 
        private String targetUserId; 

        private Builder() {
            super();
        } 

        private Builder(AddTagToFlinkClusterRequest request) {
            super(request);
            this.clusterId = request.clusterId;
            this.flinkWorkSpaceId = request.flinkWorkSpaceId;
            this.flinkWorkSpaceName = request.flinkWorkSpaceName;
            this.regionId = request.regionId;
            this.resourceGroupId = request.resourceGroupId;
            this.targetUserId = request.targetUserId;
        } 

        /**
         * The ID of the Prometheus instance.
         */
        public Builder clusterId(String clusterId) {
            this.putQueryParameter("ClusterId", clusterId);
            this.clusterId = clusterId;
            return this;
        }

        /**
         * The ID of the Flink workspace.
         */
        public Builder flinkWorkSpaceId(String flinkWorkSpaceId) {
            this.putQueryParameter("FlinkWorkSpaceId", flinkWorkSpaceId);
            this.flinkWorkSpaceId = flinkWorkSpaceId;
            return this;
        }

        /**
         * The name of the Flink workspace.
         */
        public Builder flinkWorkSpaceName(String flinkWorkSpaceName) {
            this.putQueryParameter("FlinkWorkSpaceName", flinkWorkSpaceName);
            this.flinkWorkSpaceName = flinkWorkSpaceName;
            return this;
        }

        /**
         * The region ID.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * The ID of the resource group.
         */
        public Builder resourceGroupId(String resourceGroupId) {
            this.putQueryParameter("ResourceGroupId", resourceGroupId);
            this.resourceGroupId = resourceGroupId;
            return this;
        }

        /**
         * The ID of the Alibaba Cloud account to which the Flink workspace belongs.
         */
        public Builder targetUserId(String targetUserId) {
            this.putQueryParameter("TargetUserId", targetUserId);
            this.targetUserId = targetUserId;
            return this;
        }

        @Override
        public AddTagToFlinkClusterRequest build() {
            return new AddTagToFlinkClusterRequest(this);
        } 

    } 

}
