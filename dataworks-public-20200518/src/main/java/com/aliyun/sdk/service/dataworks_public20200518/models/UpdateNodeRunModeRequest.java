// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataworks_public20200518.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateNodeRunModeRequest} extends {@link RequestModel}
 *
 * <p>UpdateNodeRunModeRequest</p>
 */
public class UpdateNodeRunModeRequest extends Request {
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
    @com.aliyun.core.annotation.NameInMap("SchedulerType")
    @com.aliyun.core.annotation.Validation(required = true)
    private Integer schedulerType;

    private UpdateNodeRunModeRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.nodeId = builder.nodeId;
        this.projectEnv = builder.projectEnv;
        this.schedulerType = builder.schedulerType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateNodeRunModeRequest create() {
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
     * @return schedulerType
     */
    public Integer getSchedulerType() {
        return this.schedulerType;
    }

    public static final class Builder extends Request.Builder<UpdateNodeRunModeRequest, Builder> {
        private String regionId; 
        private Long nodeId; 
        private String projectEnv; 
        private Integer schedulerType; 

        private Builder() {
            super();
        } 

        private Builder(UpdateNodeRunModeRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.nodeId = request.nodeId;
            this.projectEnv = request.projectEnv;
            this.schedulerType = request.schedulerType;
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
         * The operation that you want to perform on the node. Valid values:
         * <p>
         * 
         * *   0: indicates that you want to unfreeze the node.
         * *   2: indicates that you want to freeze the node.
         */
        public Builder schedulerType(Integer schedulerType) {
            this.putBodyParameter("SchedulerType", schedulerType);
            this.schedulerType = schedulerType;
            return this;
        }

        @Override
        public UpdateNodeRunModeRequest build() {
            return new UpdateNodeRunModeRequest(this);
        } 

    } 

}
