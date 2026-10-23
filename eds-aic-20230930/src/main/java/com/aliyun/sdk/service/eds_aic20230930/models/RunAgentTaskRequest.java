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
    @com.aliyun.core.annotation.NameInMap("RunConfig")
    private RunConfig runConfig;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SaveArtifacts")
    private Boolean saveArtifacts;

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
        this.runConfig = builder.runConfig;
        this.saveArtifacts = builder.saveArtifacts;
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
     * @return runConfig
     */
    public RunConfig getRunConfig() {
        return this.runConfig;
    }

    /**
     * @return saveArtifacts
     */
    public Boolean getSaveArtifacts() {
        return this.saveArtifacts;
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
        private RunConfig runConfig; 
        private Boolean saveArtifacts; 
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
            this.runConfig = request.runConfig;
            this.saveArtifacts = request.saveArtifacts;
            this.scheduleId = request.scheduleId;
            this.targets = request.targets;
            this.taskConfigId = request.taskConfigId;
            this.timeoutSeconds = request.timeoutSeconds;
            this.userPrompt = request.userPrompt;
        } 

        /**
         * <p>The region ID of the Mobile node.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-shanghai</p>
         */
        public Builder bizRegionId(String bizRegionId) {
            this.putQueryParameter("BizRegionId", bizRegionId);
            this.bizRegionId = bizRegionId;
            return this;
        }

        /**
         * <p>The list of Mobile node IDs. A single request supports up to 100 nodes.</p>
         */
        public Builder instanceIds(java.util.List<String> instanceIds) {
            this.putQueryParameter("InstanceIds", instanceIds);
            this.instanceIds = instanceIds;
            return this;
        }

        /**
         * <p>The maximum number of execution steps for the task to prevent infinite loops. Valid values: 50 to 1000. Default value: 50.</p>
         * 
         * <strong>example:</strong>
         * <p>50</p>
         */
        public Builder maxSteps(Integer maxSteps) {
            this.putQueryParameter("MaxSteps", maxSteps);
            this.maxSteps = maxSteps;
            return this;
        }

        /**
         * <p>The runtime configuration that carries the runtime parameters such as skills for the current task.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;Skills&quot;:[&quot;sk-abc&quot;,&quot;sk-def&quot;]}</p>
         */
        public Builder runConfig(RunConfig runConfig) {
            String runConfigShrink = shrink(runConfig, "RunConfig", "json");
            this.putQueryParameter("RunConfig", runConfigShrink);
            this.runConfig = runConfig;
            return this;
        }

        /**
         * <p>Specifies whether to write the task artifacts to the user\&quot;s OSS.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder saveArtifacts(Boolean saveArtifacts) {
            this.putQueryParameter("SaveArtifacts", saveArtifacts);
            this.saveArtifacts = saveArtifacts;
            return this;
        }

        /**
         * <p>The scheduling plan ID. If specified, the execute record is associated with the corresponding scheduled node to facilitate aggregate query by scheduling dimension aggregation.</p>
         * 
         * <strong>example:</strong>
         * <p>sch-260625-pbj2****</p>
         */
        public Builder scheduleId(String scheduleId) {
            this.putQueryParameter("ScheduleId", scheduleId);
            this.scheduleId = scheduleId;
            return this;
        }

        /**
         * <p>The Targets array. Each element is an object that contains InstanceId and SessionId.</p>
         */
        public Builder targets(java.util.List<Targets> targets) {
            this.putQueryParameter("Targets", targets);
            this.targets = targets;
            return this;
        }

        /**
         * <p>The task configuration ID used to trigger a task with the specified configuration.</p>
         * 
         * <strong>example:</strong>
         * <p>tsk-260625-49be****</p>
         */
        public Builder taskConfigId(String taskConfigId) {
            this.putQueryParameter("TaskConfigId", taskConfigId);
            this.taskConfigId = taskConfigId;
            return this;
        }

        /**
         * <p>The timeout period for the task in seconds. Valid values: 300 to 3600. Default value: 3600.</p>
         * 
         * <strong>example:</strong>
         * <p>3600</p>
         */
        public Builder timeoutSeconds(Integer timeoutSeconds) {
            this.putQueryParameter("TimeoutSeconds", timeoutSeconds);
            this.timeoutSeconds = timeoutSeconds;
            return this;
        }

        /**
         * <p>The user prompt in natural language based on which the agent performs operations.</p>
         * 
         * <strong>example:</strong>
         * <p>Download DingTalk from the app store</p>
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
    public static class RunConfig extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Skills")
        private java.util.List<String> skills;

        private RunConfig(Builder builder) {
            this.skills = builder.skills;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static RunConfig create() {
            return builder().build();
        }

        /**
         * @return skills
         */
        public java.util.List<String> getSkills() {
            return this.skills;
        }

        public static final class Builder {
            private java.util.List<String> skills; 

            private Builder() {
            } 

            private Builder(RunConfig model) {
                this.skills = model.skills;
            } 

            /**
             * <p>The list of skill IDs. A maximum of 10 skills are supported. Only the first skill ID is passed through when the command is delivered. All skill IDs are stored in the task_skill_relation table for reverse lookup.</p>
             * 
             * <strong>example:</strong>
             * <p>[&quot;sk-abc&quot;,&quot;sk-def&quot;]</p>
             */
            public Builder skills(java.util.List<String> skills) {
                this.skills = skills;
                return this;
            }

            public RunConfig build() {
                return new RunConfig(this);
            } 

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
             * <p>The Mobile node ID, such as acp-xxx.</p>
             * 
             * <strong>example:</strong>
             * <p>acp-5hh4a31emkt6u****</p>
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * <p>The session ID. Tasks with the same session ID share the context, such as ses-260702-21b****.</p>
             * 
             * <strong>example:</strong>
             * <p>ses-260702-21bh****。</p>
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
