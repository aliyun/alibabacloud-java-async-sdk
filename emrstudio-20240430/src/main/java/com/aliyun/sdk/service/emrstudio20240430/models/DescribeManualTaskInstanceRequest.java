// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.emrstudio20240430.models;

import com.aliyun.sdk.gateway.pop.*;
import darabonba.core.*;
import darabonba.core.async.*;
import darabonba.core.sync.*;
import darabonba.core.client.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DescribeManualTaskInstanceRequest} extends {@link RequestModel}
 *
 * <p>DescribeManualTaskInstanceRequest</p>
 */
public class DescribeManualTaskInstanceRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("manualTaskInstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String manualTaskInstanceId;

    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("projectId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String projectId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("workspaceId")
    @com.aliyun.core.annotation.Validation(required = true)
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
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>mti-0k5vype05xm****</p>
         */
        public Builder manualTaskInstanceId(String manualTaskInstanceId) {
            this.putPathParameter("manualTaskInstanceId", manualTaskInstanceId);
            this.manualTaskInstanceId = manualTaskInstanceId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>p-3q9jo749ne5****</p>
         */
        public Builder projectId(String projectId) {
            this.putPathParameter("projectId", projectId);
            this.projectId = projectId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>123***</p>
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
