// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ddi20200617.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ResumeFlowRequest} extends {@link RequestModel}
 *
 * <p>ResumeFlowRequest</p>
 */
public class ResumeFlowRequest extends Request {
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

    private ResumeFlowRequest(Builder builder) {
        super(builder);
        this.flowInstanceId = builder.flowInstanceId;
        this.projectId = builder.projectId;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ResumeFlowRequest create() {
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

    public static final class Builder extends Request.Builder<ResumeFlowRequest, Builder> {
        private String flowInstanceId; 
        private String projectId; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(ResumeFlowRequest request) {
            super(request);
            this.flowInstanceId = request.flowInstanceId;
            this.projectId = request.projectId;
            this.regionId = request.regionId;
        } 

        /**
         * 工作流实例ID。您可以调用ListFlowInstance查看工作流ID。
         */
        public Builder flowInstanceId(String flowInstanceId) {
            this.putQueryParameter("FlowInstanceId", flowInstanceId);
            this.flowInstanceId = flowInstanceId;
            return this;
        }

        /**
         * 项目ID。您可以调用ListFlowProject查看项目的ID。
         */
        public Builder projectId(String projectId) {
            this.putQueryParameter("ProjectId", projectId);
            this.projectId = projectId;
            return this;
        }

        /**
         * 区域ID。您可以调用DescribeRegions查看最新的阿里云地域列表。
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        @Override
        public ResumeFlowRequest build() {
            return new ResumeFlowRequest(this);
        } 

    } 

}
