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
 * {@link RunAgentTaskRequest} extends {@link RequestModel}
 *
 * <p>RunAgentTaskRequest</p>
 */
public class RunAgentTaskRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("BizRegionId")
    private String bizRegionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceIds")
    private java.util.List<String> instanceIds;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MaxSteps")
    private Integer maxSteps;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ScheduleId")
    private String scheduleId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Targets")
    private java.util.List<Targets> targets;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TaskConfigId")
    private String taskConfigId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TimeoutSeconds")
    private Integer timeoutSeconds;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("UserPrompt")
    private String userPrompt;

    private RunAgentTaskRequest(Builder builder) {
        super(builder);
        this.bizRegionId = builder.bizRegionId;
        this.instanceIds = builder.instanceIds;
        this.maxSteps = builder.maxSteps;
        this.scheduleId = builder.scheduleId;
        this.targets = builder.targets;
        this.taskConfigId = builder.taskConfigId;
        this.timeoutSeconds = builder.timeoutSeconds;
        this.userPrompt = builder.userPrompt;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static RunAgentTaskRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return bizRegionId
     */
    public String getBizRegionId() {
        return this.bizRegionId;
    }

    /**
     * @return instanceIds
     */
    public java.util.List<String> getInstanceIds() {
        return this.instanceIds;
    }

    /**
     * @return maxSteps
     */
    public Integer getMaxSteps() {
        return this.maxSteps;
    }

    /**
     * @return scheduleId
     */
    public String getScheduleId() {
        return this.scheduleId;
    }

    /**
     * @return targets
     */
    public java.util.List<Targets> getTargets() {
        return this.targets;
    }

    /**
     * @return taskConfigId
     */
    public String getTaskConfigId() {
        return this.taskConfigId;
    }

    /**
     * @return timeoutSeconds
     */
    public Integer getTimeoutSeconds() {
        return this.timeoutSeconds;
    }

    /**
     * @return userPrompt
     */
    public String getUserPrompt() {
        return this.userPrompt;
    }

    public static final class Builder extends Request.Builder<RunAgentTaskRequest, Builder> {
        private String bizRegionId; 
        private java.util.List<String> instanceIds; 
        private Integer maxSteps; 
        private String scheduleId; 
        private java.util.List<Targets> targets; 
        private String taskConfigId; 
        private Integer timeoutSeconds; 
        private String userPrompt; 

        private Builder() {
            super();
        } 

        private Builder(RunAgentTaskRequest request) {
            super(request);
            this.bizRegionId = request.bizRegionId;
            this.instanceIds = request.instanceIds;
            this.maxSteps = request.maxSteps;
            this.scheduleId = request.scheduleId;
            this.targets = request.targets;
            this.taskConfigId = request.taskConfigId;
            this.timeoutSeconds = request.timeoutSeconds;
            this.userPrompt = request.userPrompt;
        } 

        /**
         * BizRegionId.
         */
        public Builder bizRegionId(String bizRegionId) {
            this.putQueryParameter("BizRegionId", bizRegionId);
            this.bizRegionId = bizRegionId;
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
         * MaxSteps.
         */
        public Builder maxSteps(Integer maxSteps) {
            this.putQueryParameter("MaxSteps", maxSteps);
            this.maxSteps = maxSteps;
            return this;
        }

        /**
         * ScheduleId.
         */
        public Builder scheduleId(String scheduleId) {
            this.putQueryParameter("ScheduleId", scheduleId);
            this.scheduleId = scheduleId;
            return this;
        }

        /**
         * Targets.
         */
        public Builder targets(java.util.List<Targets> targets) {
            this.putQueryParameter("Targets", targets);
            this.targets = targets;
            return this;
        }

        /**
         * TaskConfigId.
         */
        public Builder taskConfigId(String taskConfigId) {
            this.putQueryParameter("TaskConfigId", taskConfigId);
            this.taskConfigId = taskConfigId;
            return this;
        }

        /**
         * TimeoutSeconds.
         */
        public Builder timeoutSeconds(Integer timeoutSeconds) {
            this.putQueryParameter("TimeoutSeconds", timeoutSeconds);
            this.timeoutSeconds = timeoutSeconds;
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
        public RunAgentTaskRequest build() {
            return new RunAgentTaskRequest(this);
        } 

    } 

    /**
     * 
     * {@link RunAgentTaskRequest} extends {@link TeaModel}
     *
     * <p>RunAgentTaskRequest</p>
     */
    public static class Targets extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("InstanceId")
        private String instanceId;

        @com.aliyun.core.annotation.NameInMap("SessionId")
        private String sessionId;

        private Targets(Builder builder) {
            this.instanceId = builder.instanceId;
            this.sessionId = builder.sessionId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Targets create() {
            return builder().build();
        }

        /**
         * @return instanceId
         */
        public String getInstanceId() {
            return this.instanceId;
        }

        /**
         * @return sessionId
         */
        public String getSessionId() {
            return this.sessionId;
        }

        public static final class Builder {
            private String instanceId; 
            private String sessionId; 

            private Builder() {
            } 

            private Builder(Targets model) {
                this.instanceId = model.instanceId;
                this.sessionId = model.sessionId;
            } 

            /**
             * InstanceId.
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * SessionId.
             */
            public Builder sessionId(String sessionId) {
                this.sessionId = sessionId;
                return this;
            }

            public Targets build() {
                return new Targets(this);
            } 

        } 

    }
}
