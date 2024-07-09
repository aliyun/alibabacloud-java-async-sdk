// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.emr_serverless_spark20230808.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
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

        /**
         * The details of the job.
         */
        public Builder jobRun(JobRun jobRun) {
            this.jobRun = jobRun;
            return this;
        }

        /**
         * The request ID.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetJobRunResponseBody build() {
            return new GetJobRunResponseBody(this);
        } 

    } 

    public static class ConfigurationOverrides extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("configurations")
        private java.util.List < Configuration > configurations;

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
        public java.util.List < Configuration > getConfigurations() {
            return this.configurations;
        }

        public static final class Builder {
            private java.util.List < Configuration > configurations; 

            /**
             * The configurations.
             */
            public Builder configurations(java.util.List < Configuration > configurations) {
                this.configurations = configurations;
                return this;
            }

            public ConfigurationOverrides build() {
                return new ConfigurationOverrides(this);
            } 

        } 

    }
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

            /**
             * The error code.
             */
            public Builder code(String code) {
                this.code = code;
                return this;
            }

            /**
             * The error message.
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
    public static class JobRun extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("codeType")
        private String codeType;

        @com.aliyun.core.annotation.NameInMap("configurationOverrides")
        private ConfigurationOverrides configurationOverrides;

        @com.aliyun.core.annotation.NameInMap("endTime")
        private Long endTime;

        @com.aliyun.core.annotation.NameInMap("executionTimeoutSeconds")
        private Integer executionTimeoutSeconds;

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
        private java.util.List < Tag > tags;

        @com.aliyun.core.annotation.NameInMap("webUI")
        private String webUI;

        @com.aliyun.core.annotation.NameInMap("workspaceId")
        private String workspaceId;

        private JobRun(Builder builder) {
            this.codeType = builder.codeType;
            this.configurationOverrides = builder.configurationOverrides;
            this.endTime = builder.endTime;
            this.executionTimeoutSeconds = builder.executionTimeoutSeconds;
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
         * @return endTime
         */
        public Long getEndTime() {
            return this.endTime;
        }

        /**
         * @return executionTimeoutSeconds
         */
        public Integer getExecutionTimeoutSeconds() {
            return this.executionTimeoutSeconds;
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
        public java.util.List < Tag > getTags() {
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
            private Long endTime; 
            private Integer executionTimeoutSeconds; 
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
            private java.util.List < Tag > tags; 
            private String webUI; 
            private String workspaceId; 

            /**
             * The code type of the job. Valid values:
             * <p>
             * 
             * *   SQL
             * *   JAR
             * *   PYTHON
             */
            public Builder codeType(String codeType) {
                this.codeType = codeType;
                return this;
            }

            /**
             * The task configurations of Spark.
             */
            public Builder configurationOverrides(ConfigurationOverrides configurationOverrides) {
                this.configurationOverrides = configurationOverrides;
                return this;
            }

            /**
             * The end time of the job.
             */
            public Builder endTime(Long endTime) {
                this.endTime = endTime;
                return this;
            }

            /**
             * The timeout period of the job.
             */
            public Builder executionTimeoutSeconds(Integer executionTimeoutSeconds) {
                this.executionTimeoutSeconds = executionTimeoutSeconds;
                return this;
            }

            /**
             * The information about Spark Driver.
             */
            public Builder jobDriver(JobDriver jobDriver) {
                this.jobDriver = jobDriver;
                return this;
            }

            /**
             * The job ID.
             */
            public Builder jobRunId(String jobRunId) {
                this.jobRunId = jobRunId;
                return this;
            }

            /**
             * The path where the operational logs are stored.
             */
            public Builder log(RunLog log) {
                this.log = log;
                return this;
            }

            /**
             * The job name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * The version of the Spark engine on which the job runs.
             */
            public Builder releaseVersion(String releaseVersion) {
                this.releaseVersion = releaseVersion;
                return this;
            }

            /**
             * The ID of the user who created the job.
             */
            public Builder resourceOwnerId(String resourceOwnerId) {
                this.resourceOwnerId = resourceOwnerId;
                return this;
            }

            /**
             * The name of the queue on which the job runs.
             */
            public Builder resourceQueueId(String resourceQueueId) {
                this.resourceQueueId = resourceQueueId;
                return this;
            }

            /**
             * The job state.
             */
            public Builder state(String state) {
                this.state = state;
                return this;
            }

            /**
             * The reason of the job status change.
             */
            public Builder stateChangeReason(StateChangeReason stateChangeReason) {
                this.stateChangeReason = stateChangeReason;
                return this;
            }

            /**
             * The time when the job was submitted.
             */
            public Builder submitTime(Long submitTime) {
                this.submitTime = submitTime;
                return this;
            }

            /**
             * The tags of the job.
             */
            public Builder tags(java.util.List < Tag > tags) {
                this.tags = tags;
                return this;
            }

            /**
             * The web UI of the job.
             */
            public Builder webUI(String webUI) {
                this.webUI = webUI;
                return this;
            }

            /**
             * The workspace ID.
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
