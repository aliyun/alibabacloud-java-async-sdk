// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataworks_public20200518.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateNodeOwnerRequest} extends {@link RequestModel}
 *
 * <p>UpdateNodeOwnerRequest</p>
 */
public class UpdateNodeOwnerRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("NodeId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long nodeId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ProjectEnv")
    @com.aliyun.core.annotation.Validation(required = true)
    private String projectEnv;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("UserId")
    @com.aliyun.core.annotation.Validation(required = true, maxLength = 64)
    private String userId;

    private UpdateNodeOwnerRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.nodeId = builder.nodeId;
        this.projectEnv = builder.projectEnv;
        this.userId = builder.userId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateNodeOwnerRequest create() {
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
     * @return nodeId
     */
    public Long getNodeId() {
        return this.nodeId;
    }

    /**
     * @return projectEnv
     */
    public String getProjectEnv() {
        return this.projectEnv;
    }

    /**
     * @return userId
     */
    public String getUserId() {
        return this.userId;
    }

    public static final class Builder extends Request.Builder<UpdateNodeOwnerRequest, Builder> {
        private String regionId; 
        private Long nodeId; 
        private String projectEnv; 
        private String userId; 

        private Builder() {
            super();
        } 

        private Builder(UpdateNodeOwnerRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.nodeId = request.nodeId;
            this.projectEnv = request.projectEnv;
            this.userId = request.userId;
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
         * The node ID. You can call the [ListNodes](~~173979~~) operation to query the node ID.
         */
        public Builder nodeId(Long nodeId) {
            this.putBodyParameter("NodeId", nodeId);
            this.nodeId = nodeId;
            return this;
        }

        /**
         * The environment in which the node runs. Valid values: DEV and PROD. The value DEV indicates the development environment, and the value PROD indicates the production environment.
         * <p>
         * 
         * *   PROD
         * *   DEV
         */
        public Builder projectEnv(String projectEnv) {
            this.putBodyParameter("ProjectEnv", projectEnv);
            this.projectEnv = projectEnv;
            return this;
        }

        /**
         * The ID of the Alibaba Cloud account used by the node owner. You can log on to the DataWorks console and move the pointer over the profile picture in the upper-right corner to view the ID.
         */
        public Builder userId(String userId) {
            this.putBodyParameter("UserId", userId);
            this.userId = userId;
            return this;
        }

        @Override
        public UpdateNodeOwnerRequest build() {
            return new UpdateNodeOwnerRequest(this);
        } 

    } 

}
