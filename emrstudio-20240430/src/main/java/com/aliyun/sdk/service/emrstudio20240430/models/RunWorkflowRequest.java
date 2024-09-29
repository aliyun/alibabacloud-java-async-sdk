// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.emrstudio20240430.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link RunWorkflowRequest} extends {@link RequestModel}
 *
 * <p>RunWorkflowRequest</p>
 */
public class RunWorkflowRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("projectId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String projectId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("alertGroupId")
    private String alertGroupId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("alertStrategy")
    private String alertStrategy;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("complementDependentMode")
    private String complementDependentMode;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("dryRun")
    private String dryRun;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("execType")
    private String execType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("expectedParallelismNumber")
    private String expectedParallelismNumber;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("failureStrategy")
    private String failureStrategy;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("resourceGroupId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String resourceGroupId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("runMode")
    private String runMode;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("scheduleTime")
    private String scheduleTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("startParams")
    private String startParams;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("workflowId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String workflowId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("workflowInstancePriority")
    private String workflowInstancePriority;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("workspaceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String workspaceId;

    private RunWorkflowRequest(Builder builder) {
        super(builder);
        this.projectId = builder.projectId;
        this.alertGroupId = builder.alertGroupId;
        this.alertStrategy = builder.alertStrategy;
        this.complementDependentMode = builder.complementDependentMode;
        this.dryRun = builder.dryRun;
        this.execType = builder.execType;
        this.expectedParallelismNumber = builder.expectedParallelismNumber;
        this.failureStrategy = builder.failureStrategy;
        this.resourceGroupId = builder.resourceGroupId;
        this.runMode = builder.runMode;
        this.scheduleTime = builder.scheduleTime;
        this.startParams = builder.startParams;
        this.workflowId = builder.workflowId;
        this.workflowInstancePriority = builder.workflowInstancePriority;
        this.workspaceId = builder.workspaceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static RunWorkflowRequest create() {
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
     * @return alertGroupId
     */
    public String getAlertGroupId() {
        return this.alertGroupId;
    }

    /**
     * @return alertStrategy
     */
    public String getAlertStrategy() {
        return this.alertStrategy;
    }

    /**
     * @return complementDependentMode
     */
    public String getComplementDependentMode() {
        return this.complementDependentMode;
    }

    /**
     * @return dryRun
     */
    public String getDryRun() {
        return this.dryRun;
    }

    /**
     * @return execType
     */
    public String getExecType() {
        return this.execType;
    }

    /**
     * @return expectedParallelismNumber
     */
    public String getExpectedParallelismNumber() {
        return this.expectedParallelismNumber;
    }

    /**
     * @return failureStrategy
     */
    public String getFailureStrategy() {
        return this.failureStrategy;
    }

    /**
     * @return resourceGroupId
     */
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    /**
     * @return runMode
     */
    public String getRunMode() {
        return this.runMode;
    }

    /**
     * @return scheduleTime
     */
    public String getScheduleTime() {
        return this.scheduleTime;
    }

    /**
     * @return startParams
     */
    public String getStartParams() {
        return this.startParams;
    }

    /**
     * @return workflowId
     */
    public String getWorkflowId() {
        return this.workflowId;
    }

    /**
     * @return workflowInstancePriority
     */
    public String getWorkflowInstancePriority() {
        return this.workflowInstancePriority;
    }

    /**
     * @return workspaceId
     */
    public String getWorkspaceId() {
        return this.workspaceId;
    }

    public static final class Builder extends Request.Builder<RunWorkflowRequest, Builder> {
        private String projectId; 
        private String alertGroupId; 
        private String alertStrategy; 
        private String complementDependentMode; 
        private String dryRun; 
        private String execType; 
        private String expectedParallelismNumber; 
        private String failureStrategy; 
        private String resourceGroupId; 
        private String runMode; 
        private String scheduleTime; 
        private String startParams; 
        private String workflowId; 
        private String workflowInstancePriority; 
        private String workspaceId; 

        private Builder() {
            super();
        } 

        private Builder(RunWorkflowRequest request) {
            super(request);
            this.projectId = request.projectId;
            this.alertGroupId = request.alertGroupId;
            this.alertStrategy = request.alertStrategy;
            this.complementDependentMode = request.complementDependentMode;
            this.dryRun = request.dryRun;
            this.execType = request.execType;
            this.expectedParallelismNumber = request.expectedParallelismNumber;
            this.failureStrategy = request.failureStrategy;
            this.resourceGroupId = request.resourceGroupId;
            this.runMode = request.runMode;
            this.scheduleTime = request.scheduleTime;
            this.startParams = request.startParams;
            this.workflowId = request.workflowId;
            this.workflowInstancePriority = request.workflowInstancePriority;
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
         * alertGroupId.
         */
        public Builder alertGroupId(String alertGroupId) {
            this.putQueryParameter("alertGroupId", alertGroupId);
            this.alertGroupId = alertGroupId;
            return this;
        }

        /**
         * alertStrategy.
         */
        public Builder alertStrategy(String alertStrategy) {
            this.putQueryParameter("alertStrategy", alertStrategy);
            this.alertStrategy = alertStrategy;
            return this;
        }

        /**
         * complementDependentMode.
         */
        public Builder complementDependentMode(String complementDependentMode) {
            this.putQueryParameter("complementDependentMode", complementDependentMode);
            this.complementDependentMode = complementDependentMode;
            return this;
        }

        /**
         * dryRun.
         */
        public Builder dryRun(String dryRun) {
            this.putQueryParameter("dryRun", dryRun);
            this.dryRun = dryRun;
            return this;
        }

        /**
         * execType.
         */
        public Builder execType(String execType) {
            this.putQueryParameter("execType", execType);
            this.execType = execType;
            return this;
        }

        /**
         * expectedParallelismNumber.
         */
        public Builder expectedParallelismNumber(String expectedParallelismNumber) {
            this.putQueryParameter("expectedParallelismNumber", expectedParallelismNumber);
            this.expectedParallelismNumber = expectedParallelismNumber;
            return this;
        }

        /**
         * failureStrategy.
         */
        public Builder failureStrategy(String failureStrategy) {
            this.putQueryParameter("failureStrategy", failureStrategy);
            this.failureStrategy = failureStrategy;
            return this;
        }

        /**
         * resourceGroupId.
         */
        public Builder resourceGroupId(String resourceGroupId) {
            this.putQueryParameter("resourceGroupId", resourceGroupId);
            this.resourceGroupId = resourceGroupId;
            return this;
        }

        /**
         * runMode.
         */
        public Builder runMode(String runMode) {
            this.putQueryParameter("runMode", runMode);
            this.runMode = runMode;
            return this;
        }

        /**
         * scheduleTime.
         */
        public Builder scheduleTime(String scheduleTime) {
            this.putQueryParameter("scheduleTime", scheduleTime);
            this.scheduleTime = scheduleTime;
            return this;
        }

        /**
         * startParams.
         */
        public Builder startParams(String startParams) {
            this.putQueryParameter("startParams", startParams);
            this.startParams = startParams;
            return this;
        }

        /**
         * workflowId.
         */
        public Builder workflowId(String workflowId) {
            this.putQueryParameter("workflowId", workflowId);
            this.workflowId = workflowId;
            return this;
        }

        /**
         * workflowInstancePriority.
         */
        public Builder workflowInstancePriority(String workflowInstancePriority) {
            this.putQueryParameter("workflowInstancePriority", workflowInstancePriority);
            this.workflowInstancePriority = workflowInstancePriority;
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
        public RunWorkflowRequest build() {
            return new RunWorkflowRequest(this);
        } 

    } 

}
