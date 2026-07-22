// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eds_aic20230930.models;

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
 * {@link ModifyScheduledTaskRequest} extends {@link RequestModel}
 *
 * <p>ModifyScheduledTaskRequest</p>
 */
public class ModifyScheduledTaskRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CronExpression")
    private String cronExpression;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceIds")
    private java.util.List<String> instanceIds;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RunConfig")
    private RunConfig runConfig;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ScheduledId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String scheduledId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Status")
    private String status;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TaskName")
    private String taskName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TaskVersion")
    @com.aliyun.core.annotation.Validation(required = true)
    private Integer taskVersion;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("UserPrompt")
    private String userPrompt;

    private ModifyScheduledTaskRequest(Builder builder) {
        super(builder);
        this.cronExpression = builder.cronExpression;
        this.instanceIds = builder.instanceIds;
        this.runConfig = builder.runConfig;
        this.scheduledId = builder.scheduledId;
        this.status = builder.status;
        this.taskName = builder.taskName;
        this.taskVersion = builder.taskVersion;
        this.userPrompt = builder.userPrompt;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyScheduledTaskRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return cronExpression
     */
    public String getCronExpression() {
        return this.cronExpression;
    }

    /**
     * @return instanceIds
     */
    public java.util.List<String> getInstanceIds() {
        return this.instanceIds;
    }

    /**
     * @return runConfig
     */
    public RunConfig getRunConfig() {
        return this.runConfig;
    }

    /**
     * @return scheduledId
     */
    public String getScheduledId() {
        return this.scheduledId;
    }

    /**
     * @return status
     */
    public String getStatus() {
        return this.status;
    }

    /**
     * @return taskName
     */
    public String getTaskName() {
        return this.taskName;
    }

    /**
     * @return taskVersion
     */
    public Integer getTaskVersion() {
        return this.taskVersion;
    }

    /**
     * @return userPrompt
     */
    public String getUserPrompt() {
        return this.userPrompt;
    }

    public static final class Builder extends Request.Builder<ModifyScheduledTaskRequest, Builder> {
        private String cronExpression; 
        private java.util.List<String> instanceIds; 
        private RunConfig runConfig; 
        private String scheduledId; 
        private String status; 
        private String taskName; 
        private Integer taskVersion; 
        private String userPrompt; 

        private Builder() {
            super();
        } 

        private Builder(ModifyScheduledTaskRequest request) {
            super(request);
            this.cronExpression = request.cronExpression;
            this.instanceIds = request.instanceIds;
            this.runConfig = request.runConfig;
            this.scheduledId = request.scheduledId;
            this.status = request.status;
            this.taskName = request.taskName;
            this.taskVersion = request.taskVersion;
            this.userPrompt = request.userPrompt;
        } 

        /**
         * CronExpression.
         */
        public Builder cronExpression(String cronExpression) {
            this.putQueryParameter("CronExpression", cronExpression);
            this.cronExpression = cronExpression;
            return this;
        }

        /**
         * InstanceIds.
         */
        public Builder instanceIds(java.util.List<String> instanceIds) {
            this.putQueryParameter("InstanceIds", instanceIds);
            this.instanceIds = instanceIds;
            return this;
        }

        /**
         * RunConfig.
         */
        public Builder runConfig(RunConfig runConfig) {
            String runConfigShrink = shrink(runConfig, "RunConfig", "json");
            this.putQueryParameter("RunConfig", runConfigShrink);
            this.runConfig = runConfig;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>sch-260705-agb*****</p>
         */
        public Builder scheduledId(String scheduledId) {
            this.putQueryParameter("ScheduledId", scheduledId);
            this.scheduledId = scheduledId;
            return this;
        }

        /**
         * Status.
         */
        public Builder status(String status) {
            this.putQueryParameter("Status", status);
            this.status = status;
            return this;
        }

        /**
         * TaskName.
         */
        public Builder taskName(String taskName) {
            this.putQueryParameter("TaskName", taskName);
            this.taskName = taskName;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder taskVersion(Integer taskVersion) {
            this.putQueryParameter("TaskVersion", taskVersion);
            this.taskVersion = taskVersion;
            return this;
        }

        /**
         * UserPrompt.
         */
        public Builder userPrompt(String userPrompt) {
            this.putQueryParameter("UserPrompt", userPrompt);
            this.userPrompt = userPrompt;
            return this;
        }

        @Override
        public ModifyScheduledTaskRequest build() {
            return new ModifyScheduledTaskRequest(this);
        } 

    } 

    /**
     * 
     * {@link ModifyScheduledTaskRequest} extends {@link TeaModel}
     *
     * <p>ModifyScheduledTaskRequest</p>
     */
    public static class RunConfig extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ExtraParams")
        private String extraParams;

        @com.aliyun.core.annotation.NameInMap("MaxSteps")
        private Integer maxSteps;

        @com.aliyun.core.annotation.NameInMap("TimeoutSeconds")
        private Integer timeoutSeconds;

        private RunConfig(Builder builder) {
            this.extraParams = builder.extraParams;
            this.maxSteps = builder.maxSteps;
            this.timeoutSeconds = builder.timeoutSeconds;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static RunConfig create() {
            return builder().build();
        }

        /**
         * @return extraParams
         */
        public String getExtraParams() {
            return this.extraParams;
        }

        /**
         * @return maxSteps
         */
        public Integer getMaxSteps() {
            return this.maxSteps;
        }

        /**
         * @return timeoutSeconds
         */
        public Integer getTimeoutSeconds() {
            return this.timeoutSeconds;
        }

        public static final class Builder {
            private String extraParams; 
            private Integer maxSteps; 
            private Integer timeoutSeconds; 

            private Builder() {
            } 

            private Builder(RunConfig model) {
                this.extraParams = model.extraParams;
                this.maxSteps = model.maxSteps;
                this.timeoutSeconds = model.timeoutSeconds;
            } 

            /**
             * ExtraParams.
             */
            public Builder extraParams(String extraParams) {
                this.extraParams = extraParams;
                return this;
            }

            /**
             * MaxSteps.
             */
            public Builder maxSteps(Integer maxSteps) {
                this.maxSteps = maxSteps;
                return this;
            }

            /**
             * TimeoutSeconds.
             */
            public Builder timeoutSeconds(Integer timeoutSeconds) {
                this.timeoutSeconds = timeoutSeconds;
                return this;
            }

            public RunConfig build() {
                return new RunConfig(this);
            } 

        } 

    }
}
