// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataphin_public20230630.models;

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
 * {@link ListStreamTaskManagerLogsRequest} extends {@link RequestModel}
 *
 * <p>ListStreamTaskManagerLogsRequest</p>
 */
public class ListStreamTaskManagerLogsRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DeploymentInstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String deploymentInstanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OpTenantId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long opTenantId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OpUserId")
    private String opUserId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ProjectId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long projectId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TaskmanagerId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String taskmanagerId;

    private ListStreamTaskManagerLogsRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.deploymentInstanceId = builder.deploymentInstanceId;
        this.opTenantId = builder.opTenantId;
        this.opUserId = builder.opUserId;
        this.projectId = builder.projectId;
        this.taskmanagerId = builder.taskmanagerId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListStreamTaskManagerLogsRequest create() {
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
     * @return deploymentInstanceId
     */
    public String getDeploymentInstanceId() {
        return this.deploymentInstanceId;
    }

    /**
     * @return opTenantId
     */
    public Long getOpTenantId() {
        return this.opTenantId;
    }

    /**
     * @return opUserId
     */
    public String getOpUserId() {
        return this.opUserId;
    }

    /**
     * @return projectId
     */
    public Long getProjectId() {
        return this.projectId;
    }

    /**
     * @return taskmanagerId
     */
    public String getTaskmanagerId() {
        return this.taskmanagerId;
    }

    public static final class Builder extends Request.Builder<ListStreamTaskManagerLogsRequest, Builder> {
        private String regionId; 
        private String deploymentInstanceId; 
        private Long opTenantId; 
        private String opUserId; 
        private Long projectId; 
        private String taskmanagerId; 

        private Builder() {
            super();
        } 

        private Builder(ListStreamTaskManagerLogsRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.deploymentInstanceId = request.deploymentInstanceId;
            this.opTenantId = request.opTenantId;
            this.opUserId = request.opUserId;
            this.projectId = request.projectId;
            this.taskmanagerId = request.taskmanagerId;
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
         * <p>The ID of the Flink deployment instance.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>7db678957dc449aab0086b931c9f8218</p>
         */
        public Builder deploymentInstanceId(String deploymentInstanceId) {
            this.putQueryParameter("DeploymentInstanceId", deploymentInstanceId);
            this.deploymentInstanceId = deploymentInstanceId;
            return this;
        }

        /**
         * <p>The ID of the operating tenant. The gateway verifies that the current identity has access to the tenant and then injects the TenantId into the backend.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>30001011</p>
         */
        public Builder opTenantId(Long opTenantId) {
            this.putQueryParameter("OpTenantId", opTenantId);
            this.opTenantId = opTenantId;
            return this;
        }

        /**
         * <p>The optional ID of the operator. This parameter follows the gateway identity verification rules and is not directly bound to the backend UserId.</p>
         * 
         * <strong>example:</strong>
         * <p>30001011</p>
         */
        public Builder opUserId(String opUserId) {
            this.putQueryParameter("OpUserId", opUserId);
            this.opUserId = opUserId;
            return this;
        }

        /**
         * <p>The project ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>7299592831043008</p>
         */
        public Builder projectId(Long projectId) {
            this.putQueryParameter("ProjectId", projectId);
            this.projectId = projectId;
            return this;
        }

        /**
         * <p>The TaskManager ID. This parameter can be omitted when retrieving log content. If omitted, the JobManager logs are returned.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>dataphin-session-7db678957dc449aab0086b931c9f8218-taskmanazjkxq</p>
         */
        public Builder taskmanagerId(String taskmanagerId) {
            this.putQueryParameter("TaskmanagerId", taskmanagerId);
            this.taskmanagerId = taskmanagerId;
            return this;
        }

        @Override
        public ListStreamTaskManagerLogsRequest build() {
            return new ListStreamTaskManagerLogsRequest(this);
        } 

    } 

}
