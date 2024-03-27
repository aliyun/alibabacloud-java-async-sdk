// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.emrstudio20231009.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeManualTaskInstanceRequest} extends {@link RequestModel}
 *
 * <p>DescribeManualTaskInstanceRequest</p>
 */
public class DescribeManualTaskInstanceRequest extends Request {
    @Path
    @NameInMap("manualTaskInstanceId")
    @Validation(required = true)
    private String manualTaskInstanceId;

    @Path
    @NameInMap("projectId")
    @Validation(required = true)
    private String projectId;

    @Query
    @NameInMap("workspaceId")
    @Validation(required = true)
    private String workspaceId;

    private DescribeManualTaskInstanceRequest(Builder builder) {
        super(builder);
        this.manualTaskInstanceId = builder.manualTaskInstanceId;
        this.projectId = builder.projectId;
        this.workspaceId = builder.workspaceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeManualTaskInstanceRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return manualTaskInstanceId
     */
    public String getManualTaskInstanceId() {
        return this.manualTaskInstanceId;
    }

    /**
     * @return projectId
     */
    public String getProjectId() {
        return this.projectId;
    }

    /**
     * @return workspaceId
     */
    public String getWorkspaceId() {
        return this.workspaceId;
    }

    public static final class Builder extends Request.Builder<DescribeManualTaskInstanceRequest, Builder> {
        private String manualTaskInstanceId; 
        private String projectId; 
        private String workspaceId; 

        private Builder() {
            super();
        } 

        private Builder(DescribeManualTaskInstanceRequest request) {
            super(request);
            this.manualTaskInstanceId = request.manualTaskInstanceId;
            this.projectId = request.projectId;
            this.workspaceId = request.workspaceId;
        } 

        /**
         * manualTaskInstanceId.
         */
        public Builder manualTaskInstanceId(String manualTaskInstanceId) {
            this.putPathParameter("manualTaskInstanceId", manualTaskInstanceId);
            this.manualTaskInstanceId = manualTaskInstanceId;
            return this;
        }

        /**
         * projectId.
         */
        public Builder projectId(String projectId) {
            this.putPathParameter("projectId", projectId);
            this.projectId = projectId;
            return this;
        }

        /**
         * workspaceId.
         */
        public Builder workspaceId(String workspaceId) {
            this.putQueryParameter("workspaceId", workspaceId);
            this.workspaceId = workspaceId;
            return this;
        }

        @Override
        public DescribeManualTaskInstanceRequest build() {
            return new DescribeManualTaskInstanceRequest(this);
        } 

    } 

}
