// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.arms20190808.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link AddTagToFlinkClusterRequest} extends {@link RequestModel}
 *
 * <p>AddTagToFlinkClusterRequest</p>
 */
public class AddTagToFlinkClusterRequest extends Request {
    @Query
    @NameInMap("ClusterId")
    @Validation(required = true)
    private String clusterId;

    @Query
    @NameInMap("FlinkWorkSpaceId")
    @Validation(required = true)
    private String flinkWorkSpaceId;

    @Query
    @NameInMap("FlinkWorkSpaceName")
    @Validation(required = true)
    private String flinkWorkSpaceName;

    @Query
    @NameInMap("RegionId")
    @Validation(required = true)
    private String regionId;

    @Query
    @NameInMap("ResourceGroupId")
    private String resourceGroupId;

    @Query
    @NameInMap("TargetUserId")
    @Validation(required = true)
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
         * ClusterId.
         */
        public Builder clusterId(String clusterId) {
            this.putQueryParameter("ClusterId", clusterId);
            this.clusterId = clusterId;
            return this;
        }

        /**
         * FlinkWorkSpaceId.
         */
        public Builder flinkWorkSpaceId(String flinkWorkSpaceId) {
            this.putQueryParameter("FlinkWorkSpaceId", flinkWorkSpaceId);
            this.flinkWorkSpaceId = flinkWorkSpaceId;
            return this;
        }

        /**
         * FlinkWorkSpaceName.
         */
        public Builder flinkWorkSpaceName(String flinkWorkSpaceName) {
            this.putQueryParameter("FlinkWorkSpaceName", flinkWorkSpaceName);
            this.flinkWorkSpaceName = flinkWorkSpaceName;
            return this;
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
         * ResourceGroupId.
         */
        public Builder resourceGroupId(String resourceGroupId) {
            this.putQueryParameter("ResourceGroupId", resourceGroupId);
            this.resourceGroupId = resourceGroupId;
            return this;
        }

        /**
         * TargetUserId.
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
