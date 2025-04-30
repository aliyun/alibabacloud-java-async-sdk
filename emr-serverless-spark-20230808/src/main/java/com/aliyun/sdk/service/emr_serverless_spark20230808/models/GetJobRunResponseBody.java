// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.emr_serverless_spark20230808.models;

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
 * {@link GetJobRunResponseBody} extends {@link TeaModel}
 *
 * <p>GetJobRunResponseBody</p>
 */
public class GetJobRunResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("jobRun")
    private JobRun jobRun;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    private GetJobRunResponseBody(Builder builder) {
        this.jobRun = builder.jobRun;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetJobRunResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return jobRun
     */
    public JobRun getJobRun() {
        return this.jobRun;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private JobRun jobRun; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(GetJobRunResponseBody model) {
            this.jobRun = model.jobRun;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The details of the job.</p>
         */
        public Builder jobRun(JobRun jobRun) {
            this.jobRun = jobRun;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>DD6B1B2A-5837-5237-ABE4-FF0C8944****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetJobRunResponseBody build() {
            return new GetJobRunResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetJobRunResponseBody} extends {@link TeaModel}
     *
     * <p>GetJobRunResponseBody</p>
     */
    public static class ConfigurationOverrides extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("configurations")
        private java.util.List<Configuration> configurations;

        private ConfigurationOverrides(Builder builder) {
            this.configurations = builder.configurations;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ConfigurationOverrides create() {
            return builder().build();
        }

        /**
         * @return configurations
         */
        public java.util.List<Configuration> getConfigurations() {
            return this.configurations;
        }

        public static final class Builder {
            private java.util.List<Configuration> configurations; 

            private Builder() {
            } 

            private Builder(ConfigurationOverrides model) {
                this.configurations = model.configurations;
            } 

            /**
             * <p>The configurations.</p>
             */
            public Builder configurations(java.util.List<Configuration> configurations) {
                this.configurations = configurations;
                return this;
            }

            public ConfigurationOverrides build() {
                return new ConfigurationOverrides(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetJobRunResponseBody} extends {@link TeaModel}
     *
     * <p>GetJobRunResponseBody</p>
     */
    public static class StateChangeReason extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("code")
        private String code;

        @com.aliyun.core.annotation.NameInMap("message")
        private String message;

        private StateChangeReason(Builder builder) {
            this.code = builder.code;
            this.message = builder.message;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static StateChangeReason create() {
            return builder().build();
        }

        /**
         * @return code
         */
        public String getCode() {
            return this.code;
        }

        /**
         * @return message
         */
        public String getMessage() {
            return this.message;
        }

        public static final class Builder {
            private String code; 
            private String message; 

            private Builder() {
            } 

            private Builder(StateChangeReason model) {
                this.code = model.code;
                this.message = model.message;
            } 

            /**
             * <p>The error code.</p>
             * 
             * <strong>example:</strong>
             * <p>ERR-100000</p>
             */
            public Builder code(String code) {
                this.code = code;
                return this;
            }

            /**
             * <p>The error message.</p>
             * 
             * <strong>example:</strong>
             * <p>connection refused</p>
             */
            public Builder message(String message) {
                this.message = message;
                return this;
            }

            public StateChangeReason build() {
                return new StateChangeReason(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetJobRunResponseBody} extends {@link TeaModel}
     *
     * <p>GetJobRunResponseBody</p>
     */
    public static class JobRun extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("codeType")
        private String codeType;

        @com.aliyun.core.annotation.NameInMap("configurationOverrides")
        private ConfigurationOverrides configurationOverrides;

        @com.aliyun.core.annotation.NameInMap("displayReleaseVersion")
        private String displayReleaseVersion;

        @com.aliyun.core.annotation.NameInMap("endTime")
        private Long endTime;

        @com.aliyun.core.annotation.NameInMap("environmentId")
        private String environmentId;

        @com.aliyun.core.annotation.NameInMap("executionTimeoutSeconds")
        private Integer executionTimeoutSeconds;

        @com.aliyun.core.annotation.NameInMap("fusion")
        private Boolean fusion;

        @com.aliyun.core.annotation.NameInMap("jobDriver")
        private JobDriver jobDriver;

        @com.aliyun.core.annotation.NameInMap("jobRunId")
        private String jobRunId;

        @com.aliyun.core.annotation.NameInMap("log")
        private RunLog log;

        @com.aliyun.core.annotation.NameInMap("name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("releaseVersion")
        private String releaseVersion;

        @com.aliyun.core.annotation.NameInMap("resourceOwnerId")
        private String resourceOwnerId;

        @com.aliyun.core.annotation.NameInMap("resourceQueueId")
        private String resourceQueueId;

        @com.aliyun.core.annotation.NameInMap("state")
        private String state;

        @com.aliyun.core.annotation.NameInMap("stateChangeReason")
        private StateChangeReason stateChangeReason;

        @com.aliyun.core.annotation.NameInMap("submitTime")
        private Long submitTime;

        @com.aliyun.core.annotation.NameInMap("tags")
        private java.util.List<Tag> tags;

        @com.aliyun.core.annotation.NameInMap("webUI")
        private String webUI;

        @com.aliyun.core.annotation.NameInMap("workspaceId")
        private String workspaceId;

        private JobRun(Builder builder) {
            this.codeType = builder.codeType;
            this.configurationOverrides = builder.configurationOverrides;
            this.displayReleaseVersion = builder.displayReleaseVersion;
            this.endTime = builder.endTime;
            this.environmentId = builder.environmentId;
            this.executionTimeoutSeconds = builder.executionTimeoutSeconds;
            this.fusion = builder.fusion;
            this.jobDriver = builder.jobDriver;
            this.jobRunId = builder.jobRunId;
            this.log = builder.log;
            this.name = builder.name;
            this.releaseVersion = builder.releaseVersion;
            this.resourceOwnerId = builder.resourceOwnerId;
            this.resourceQueueId = builder.resourceQueueId;
            this.state = builder.state;
            this.stateChangeReason = builder.stateChangeReason;
            this.submitTime = builder.submitTime;
            this.tags = builder.tags;
            this.webUI = builder.webUI;
            this.workspaceId = builder.workspaceId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static JobRun create() {
            return builder().build();
        }

        /**
         * @return codeType
         */
        public String getCodeType() {
            return this.codeType;
        }

        /**
         * @return configurationOverrides
         */
        public ConfigurationOverrides getConfigurationOverrides() {
            return this.configurationOverrides;
        }

        /**
         * @return displayReleaseVersion
         */
        public String getDisplayReleaseVersion() {
            return this.displayReleaseVersion;
        }

        /**
         * @return endTime
         */
        public Long getEndTime() {
            return this.endTime;
        }

        /**
         * @return environmentId
         */
        public String getEnvironmentId() {
            return this.environmentId;
        }

        /**
         * @return executionTimeoutSeconds
         */
        public Integer getExecutionTimeoutSeconds() {
            return this.executionTimeoutSeconds;
        }

        /**
         * @return fusion
         */
        public Boolean getFusion() {
            return this.fusion;
        }

        /**
         * @return jobDriver
         */
        public JobDriver getJobDriver() {
            return this.jobDriver;
        }

        /**
         * @return jobRunId
         */
        public String getJobRunId() {
            return this.jobRunId;
        }

        /**
         * @return log
         */
        public RunLog getLog() {
            return this.log;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return releaseVersion
         */
        public String getReleaseVersion() {
            return this.releaseVersion;
        }

        /**
         * @return resourceOwnerId
         */
        public String getResourceOwnerId() {
            return this.resourceOwnerId;
        }

        /**
         * @return resourceQueueId
         */
        public String getResourceQueueId() {
            return this.resourceQueueId;
        }

        /**
         * @return state
         */
        public String getState() {
            return this.state;
        }

        /**
         * @return stateChangeReason
         */
        public StateChangeReason getStateChangeReason() {
            return this.stateChangeReason;
        }

        /**
         * @return submitTime
         */
        public Long getSubmitTime() {
            return this.submitTime;
        }

        /**
         * @return tags
         */
        public java.util.List<Tag> getTags() {
            return this.tags;
        }

        /**
         * @return webUI
         */
        public String getWebUI() {
            return this.webUI;
        }

        /**
         * @return workspaceId
         */
        public String getWorkspaceId() {
            return this.workspaceId;
        }

        public static final class Builder {
            private String codeType; 
            private ConfigurationOverrides configurationOverrides; 
            private String displayReleaseVersion; 
            private Long endTime; 
            private String environmentId; 
            private Integer executionTimeoutSeconds; 
            private Boolean fusion; 
            private JobDriver jobDriver; 
            private String jobRunId; 
            private RunLog log; 
            private String name; 
            private String releaseVersion; 
            private String resourceOwnerId; 
            private String resourceQueueId; 
            private String state; 
            private StateChangeReason stateChangeReason; 
            private Long submitTime; 
            private java.util.List<Tag> tags; 
            private String webUI; 
            private String workspaceId; 

            private Builder() {
            } 

            private Builder(JobRun model) {
                this.codeType = model.codeType;
                this.configurationOverrides = model.configurationOverrides;
                this.displayReleaseVersion = model.displayReleaseVersion;
                this.endTime = model.endTime;
                this.environmentId = model.environmentId;
                this.executionTimeoutSeconds = model.executionTimeoutSeconds;
                this.fusion = model.fusion;
                this.jobDriver = model.jobDriver;
                this.jobRunId = model.jobRunId;
                this.log = model.log;
                this.name = model.name;
                this.releaseVersion = model.releaseVersion;
                this.resourceOwnerId = model.resourceOwnerId;
                this.resourceQueueId = model.resourceQueueId;
                this.state = model.state;
                this.stateChangeReason = model.stateChangeReason;
                this.submitTime = model.submitTime;
                this.tags = model.tags;
                this.webUI = model.webUI;
                this.workspaceId = model.workspaceId;
            } 

            /**
             * <p>The code type of the job. Valid values:</p>
             * <ul>
             * <li>SQL</li>
             * <li>JAR</li>
             * <li>PYTHON</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>SQL</p>
             */
            public Builder codeType(String codeType) {
                this.codeType = codeType;
                return this;
            }

            /**
             * <p>The configurations of the Spark jobs.</p>
             */
            public Builder configurationOverrides(ConfigurationOverrides configurationOverrides) {
                this.configurationOverrides = configurationOverrides;
                return this;
            }

            /**
             * <p>The version of the Spark engine.</p>
             * 
             * <strong>example:</strong>
             * <p>esr-4.0.0 (Spark 3.5.2, Scala 2.12)</p>
             */
            public Builder displayReleaseVersion(String displayReleaseVersion) {
                this.displayReleaseVersion = displayReleaseVersion;
                return this;
            }

            /**
             * <p>The end time of the job.</p>
             * 
             * <strong>example:</strong>
             * <p>1684119314000</p>
             */
            public Builder endTime(Long endTime) {
                this.endTime = endTime;
                return this;
            }

            /**
             * <p>The environment ID.</p>
             * 
             * <strong>example:</strong>
             * <p>env-cpv569tlhtgndjl8****</p>
             */
            public Builder environmentId(String environmentId) {
                this.environmentId = environmentId;
                return this;
            }

            /**
             * <p>The timeout period of the job.</p>
             * 
             * <strong>example:</strong>
             * <p>3600</p>
             */
            public Builder executionTimeoutSeconds(Integer executionTimeoutSeconds) {
                this.executionTimeoutSeconds = executionTimeoutSeconds;
                return this;
            }

            /**
             * <p>Indicates whether the Fusion engine is used for acceleration.</p>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder fusion(Boolean fusion) {
                this.fusion = fusion;
                return this;
            }

            /**
             * <p>The information about Spark Driver.</p>
             */
            public Builder jobDriver(JobDriver jobDriver) {
                this.jobDriver = jobDriver;
                return this;
            }

            /**
             * <p>The job ID.</p>
             * 
             * <strong>example:</strong>
             * <p>jr-231231</p>
             */
            public Builder jobRunId(String jobRunId) {
                this.jobRunId = jobRunId;
                return this;
            }

            /**
             * <p>The path where the operational logs are stored.</p>
             */
            public Builder log(RunLog log) {
                this.log = log;
                return this;
            }

            /**
             * <p>The job name.</p>
             * 
             * <strong>example:</strong>
             * <p>jobName</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The version of the Spark engine on which the job runs.</p>
             * 
             * <strong>example:</strong>
             * <p>esr-3.3.1</p>
             */
            public Builder releaseVersion(String releaseVersion) {
                this.releaseVersion = releaseVersion;
                return this;
            }

            /**
             * <p>The ID of the user who created the job.</p>
             * 
             * <strong>example:</strong>
             * <p>1509789347011222</p>
             */
            public Builder resourceOwnerId(String resourceOwnerId) {
                this.resourceOwnerId = resourceOwnerId;
                return this;
            }

            /**
             * <p>The name of the queue on which the job runs.</p>
             * 
             * <strong>example:</strong>
             * <p>root_queue</p>
             */
            public Builder resourceQueueId(String resourceQueueId) {
                this.resourceQueueId = resourceQueueId;
                return this;
            }

            /**
             * <p>The job state.</p>
             * 
             * <strong>example:</strong>
             * <p>Running</p>
             */
            public Builder state(String state) {
                this.state = state;
                return this;
            }

            /**
             * <p>The reason of the job status change.</p>
             */
            public Builder stateChangeReason(StateChangeReason stateChangeReason) {
                this.stateChangeReason = stateChangeReason;
                return this;
            }

            /**
             * <p>The time when the job was submitted.</p>
             * 
             * <strong>example:</strong>
             * <p>1684119314000</p>
             */
            public Builder submitTime(Long submitTime) {
                this.submitTime = submitTime;
                return this;
            }

            /**
             * <p>The tags of the job.</p>
             */
            public Builder tags(java.util.List<Tag> tags) {
                this.tags = tags;
                return this;
            }

            /**
             * <p>The web UI of the job.</p>
             * 
             * <strong>example:</strong>
             * <p><a href="http://spark-ui">http://spark-ui</a></p>
             */
            public Builder webUI(String webUI) {
                this.webUI = webUI;
                return this;
            }

            /**
             * <p>The workspace ID.</p>
             * 
             * <strong>example:</strong>
             * <p>w-1234abcd</p>
             */
            public Builder workspaceId(String workspaceId) {
                this.workspaceId = workspaceId;
                return this;
            }

            public JobRun build() {
                return new JobRun(this);
            } 

        } 

    }
}
