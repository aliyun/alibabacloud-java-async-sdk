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
 * {@link CreateScheduledTaskRequest} extends {@link RequestModel}
 *
 * <p>CreateScheduledTaskRequest</p>
 */
public class CreateScheduledTaskRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CronExpression")
    @com.aliyun.core.annotation.Validation(required = true)
    private String cronExpression;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceIds")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List<String> instanceIds;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MaxExecutions")
    private Integer maxExecutions;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RunConfig")
    private RunConfig runConfig;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TaskName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String taskName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("UserPrompt")
    @com.aliyun.core.annotation.Validation(required = true)
    private String userPrompt;

    private CreateScheduledTaskRequest(Builder builder) {
        super(builder);
        this.cronExpression = builder.cronExpression;
        this.instanceIds = builder.instanceIds;
        this.maxExecutions = builder.maxExecutions;
        this.runConfig = builder.runConfig;
        this.taskName = builder.taskName;
        this.userPrompt = builder.userPrompt;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateScheduledTaskRequest create() {
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
     * @return maxExecutions
     */
    public Integer getMaxExecutions() {
        return this.maxExecutions;
    }

    /**
     * @return runConfig
     */
    public RunConfig getRunConfig() {
        return this.runConfig;
    }

    /**
     * @return taskName
     */
    public String getTaskName() {
        return this.taskName;
    }

    /**
     * @return userPrompt
     */
    public String getUserPrompt() {
        return this.userPrompt;
    }

    public static final class Builder extends Request.Builder<CreateScheduledTaskRequest, Builder> {
        private String cronExpression; 
        private java.util.List<String> instanceIds; 
        private Integer maxExecutions; 
        private RunConfig runConfig; 
        private String taskName; 
        private String userPrompt; 

        private Builder() {
            super();
        } 

        private Builder(CreateScheduledTaskRequest request) {
            super(request);
            this.cronExpression = request.cronExpression;
            this.instanceIds = request.instanceIds;
            this.maxExecutions = request.maxExecutions;
            this.runConfig = request.runConfig;
            this.taskName = request.taskName;
            this.userPrompt = request.userPrompt;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>0 0 * * *</p>
         */
        public Builder cronExpression(String cronExpression) {
            this.putQueryParameter("CronExpression", cronExpression);
            this.cronExpression = cronExpression;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>[&quot;ai-instance-001&quot;]</p>
         */
        public Builder instanceIds(java.util.List<String> instanceIds) {
            this.putQueryParameter("InstanceIds", instanceIds);
            this.instanceIds = instanceIds;
            return this;
        }

        /**
         * MaxExecutions.
         */
        public Builder maxExecutions(Integer maxExecutions) {
            this.putQueryParameter("MaxExecutions", maxExecutions);
            this.maxExecutions = maxExecutions;
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
         * <p>每日数据同步任务</p>
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
         * <p>从源系统同步数据到目标系统</p>
         */
        public Builder userPrompt(String userPrompt) {
            this.putQueryParameter("UserPrompt", userPrompt);
            this.userPrompt = userPrompt;
            return this;
        }

        @Override
        public CreateScheduledTaskRequest build() {
            return new CreateScheduledTaskRequest(this);
        } 

    } 

    /**
     * 
     * {@link CreateScheduledTaskRequest} extends {@link TeaModel}
     *
     * <p>CreateScheduledTaskRequest</p>
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
