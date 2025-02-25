// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.emr20160408.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link StartFlowRequest} extends {@link RequestModel}
 *
 * <p>StartFlowRequest</p>
 */
public class StartFlowRequest extends Request {
    @Query
    @NameInMap("FlowInstanceId")
    @Validation(required = true)
    private String flowInstanceId;

    @Query
    @NameInMap("ProjectId")
    @Validation(required = true)
    private String projectId;

    @Query
    @NameInMap("RegionId")
    @Validation(required = true)
    private String regionId;

    private StartFlowRequest(Builder builder) {
        super(builder);
        this.flowInstanceId = builder.flowInstanceId;
        this.projectId = builder.projectId;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static StartFlowRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return flowInstanceId
     */
    public String getFlowInstanceId() {
        return this.flowInstanceId;
    }

    /**
     * @return projectId
     */
    public String getProjectId() {
        return this.projectId;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    public static final class Builder extends Request.Builder<StartFlowRequest, Builder> {
        private String flowInstanceId; 
        private String projectId; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(StartFlowRequest request) {
            super(request);
            this.flowInstanceId = request.flowInstanceId;
            this.projectId = request.projectId;
            this.regionId = request.regionId;
        } 

        /**
         * FlowInstanceId.
         */
        public Builder flowInstanceId(String flowInstanceId) {
            this.putQueryParameter("FlowInstanceId", flowInstanceId);
            this.flowInstanceId = flowInstanceId;
            return this;
        }

        /**
         * ProjectId.
         */
        public Builder projectId(String projectId) {
            this.putQueryParameter("ProjectId", projectId);
            this.projectId = projectId;
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

        @Override
        public StartFlowRequest build() {
            return new StartFlowRequest(this);
        } 

    } 

}
