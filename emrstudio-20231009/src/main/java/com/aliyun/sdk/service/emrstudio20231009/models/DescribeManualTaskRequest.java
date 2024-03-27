// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.emrstudio20231009.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeManualTaskRequest} extends {@link RequestModel}
 *
 * <p>DescribeManualTaskRequest</p>
 */
public class DescribeManualTaskRequest extends Request {
    @Path
    @NameInMap("projectId")
    @Validation(required = true)
    private String projectId;

    @Path
    @NameInMap("manualTaskId")
    @Validation(required = true)
    private String manualTaskId;

    @Query
    @NameInMap("workspaceId")
    @Validation(required = true)
    private String workspaceId;

    private DescribeManualTaskRequest(Builder builder) {
        super(builder);
        this.projectId = builder.projectId;
        this.manualTaskId = builder.manualTaskId;
        this.workspaceId = builder.workspaceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeManualTaskRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return projectId
     */
    public String getProjectId() {
        return this.projectId;
    }

    /**
     * @return manualTaskId
     */
    public String getManualTaskId() {
        return this.manualTaskId;
    }

    /**
     * @return workspaceId
     */
    public String getWorkspaceId() {
        return this.workspaceId;
    }

    public static final class Builder extends Request.Builder<DescribeManualTaskRequest, Builder> {
        private String projectId; 
        private String manualTaskId; 
        private String workspaceId; 

        private Builder() {
            super();
        } 

        private Builder(DescribeManualTaskRequest request) {
            super(request);
            this.projectId = request.projectId;
            this.manualTaskId = request.manualTaskId;
            this.workspaceId = request.workspaceId;
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
         * manualTaskId.
         */
        public Builder manualTaskId(String manualTaskId) {
            this.putPathParameter("manualTaskId", manualTaskId);
            this.manualTaskId = manualTaskId;
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
        public DescribeManualTaskRequest build() {
            return new DescribeManualTaskRequest(this);
        } 

    } 

}
