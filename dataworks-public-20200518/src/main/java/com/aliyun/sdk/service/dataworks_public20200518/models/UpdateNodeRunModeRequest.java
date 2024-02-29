// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataworks_public20200518.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateNodeRunModeRequest} extends {@link RequestModel}
 *
 * <p>UpdateNodeRunModeRequest</p>
 */
public class UpdateNodeRunModeRequest extends Request {
    @Host
    @NameInMap("RegionId")
    private String regionId;

    @Body
    @NameInMap("NodeId")
    @Validation(required = true)
    private Long nodeId;

    @Body
    @NameInMap("ProjectEnv")
    @Validation(required = true)
    private String projectEnv;

    @Body
    @NameInMap("SchedulerType")
    @Validation(required = true)
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
         * The region ID. For example, the ID of the China (Shanghai) region is cn-shanghai, and that of the China (Zhangjiakou) region is cn-zhangjiakou. The system automatically determines the value of this parameter based on the endpoint used to call the operation.
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * The ID of the node. You can call the [ListNodes](~~173979~~) operation to query the ID.
         */
        public Builder nodeId(Long nodeId) {
            this.putBodyParameter("NodeId", nodeId);
            this.nodeId = nodeId;
            return this;
        }

        /**
         * The environment where the node runs. Valid values: DEV and PROD. The value DEV indicates the development environment. The value PROD indicates the production environment.
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
