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
 * {@link GetStreamLogContentRequest} extends {@link RequestModel}
 *
 * <p>GetStreamLogContentRequest</p>
 */
public class GetStreamLogContentRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DeploymentInstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String deploymentInstanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("LogName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String logName;

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
    private String taskmanagerId;

    private GetStreamLogContentRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.deploymentInstanceId = builder.deploymentInstanceId;
        this.logName = builder.logName;
        this.opTenantId = builder.opTenantId;
        this.opUserId = builder.opUserId;
        this.projectId = builder.projectId;
        this.taskmanagerId = builder.taskmanagerId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetStreamLogContentRequest create() {
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
     * @return logName
     */
    public String getLogName() {
        return this.logName;
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

    public static final class Builder extends Request.Builder<GetStreamLogContentRequest, Builder> {
        private String regionId; 
        private String deploymentInstanceId; 
        private String logName; 
        private Long opTenantId; 
        private String opUserId; 
        private Long projectId; 
        private String taskmanagerId; 

        private Builder() {
            super();
        } 

        private Builder(GetStreamLogContentRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.deploymentInstanceId = request.deploymentInstanceId;
            this.logName = request.logName;
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
         * <p>The deployment instance ID. Obtain the value from the deploymentInstanceId parameter returned in the operation record or historical running instance.</p>
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
         * <p>The original name of the log file. Obtain the value from the logName parameter in the corresponding JobManager or TaskManager log file list. Pass the value as is.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>flink--standalonesession-0-dataphin-session-7db678957dc449aab0086b931c9f8218-jobmanager.log</p>
         */
        public Builder logName(String logName) {
            this.putQueryParameter("LogName", logName);
            this.logName = logName;
            return this;
        }

        /**
         * <p>The tenant ID.</p>
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
         * <p>The ID of the operator.</p>
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
         * <p>The ID of the Dataphin project to which the task belongs. This parameter is used for permission verification in the production environment.</p>
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
         * <p>The optional ID of the TaskManager. Obtain the value from the taskmanagerId parameter returned by the ListStreamTaskManagers operation. If this parameter is not specified or is empty, the JobManager logs are retrieved.</p>
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
        public GetStreamLogContentRequest build() {
            return new GetStreamLogContentRequest(this);
        } 

    } 

}
