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
    @Body
    @NameInMap("NodeId")
    @Validation(required = true)
    private Long nodeId;

    @Body
    @NameInMap("ProjectEnv")
    @Validation(required = true)
    private String projectEnv;

    @Host
    @NameInMap("RegionId")
    @Validation(required = true)
    private String regionId;

    @Body
    @NameInMap("SchedulerType")
    @Validation(required = true)
    private Integer schedulerType;

    private UpdateNodeRunModeRequest(Builder builder) {
        super(builder);
        this.nodeId = builder.nodeId;
        this.projectEnv = builder.projectEnv;
        this.regionId = builder.regionId;
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
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return schedulerType
     */
    public Integer getSchedulerType() {
        return this.schedulerType;
    }

    public static final class Builder extends Request.Builder<UpdateNodeRunModeRequest, Builder> {
        private Long nodeId; 
        private String projectEnv; 
        private String regionId; 
        private Integer schedulerType; 

        private Builder() {
            super();
        } 

        private Builder(UpdateNodeRunModeRequest request) {
            super(request);
            this.nodeId = request.nodeId;
            this.projectEnv = request.projectEnv;
            this.regionId = request.regionId;
            this.schedulerType = request.schedulerType;
        } 

        /**
         * NodeId.
         */
        public Builder nodeId(Long nodeId) {
            this.putBodyParameter("NodeId", nodeId);
            this.nodeId = nodeId;
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
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * SchedulerType.
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
