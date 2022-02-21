// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.datalake20200710.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetWorkflowInstanceRequest} extends {@link RequestModel}
 *
 * <p>GetWorkflowInstanceRequest</p>
 */
public class GetWorkflowInstanceRequest extends Request {
    @Query
    @NameInMap("FlowInstanceId")
    @Validation(required = true)
    private String flowInstanceId;

    @Query
    @NameInMap("ProjectId")
    @Validation(required = true)
    private String projectId;

    @Host
    @NameInMap("RegionId")
    private String regionId;

    private GetWorkflowInstanceRequest(Builder builder) {
        super(builder);
        this.flowInstanceId = builder.flowInstanceId;
        this.projectId = builder.projectId;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetWorkflowInstanceRequest create() {
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

    public static final class Builder extends Request.Builder<GetWorkflowInstanceRequest, Builder> {
        private String flowInstanceId; 
        private String projectId; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(GetWorkflowInstanceRequest response) {
            super(response);
            this.flowInstanceId = response.flowInstanceId;
            this.projectId = response.projectId;
            this.regionId = response.regionId;
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
         * RegionId
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        @Override
        public GetWorkflowInstanceRequest build() {
            return new GetWorkflowInstanceRequest(this);
        } 

    } 

}
