// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.emr_serverless_spark20230808.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetJobRunResponseBody} extends {@link TeaModel}
 *
 * <p>GetJobRunResponseBody</p>
 */
public class GetJobRunResponseBody extends TeaModel {
    @NameInMap("jobRun")
    private JobRun jobRun;

    @NameInMap("requestId")
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
         * jobRun.
         */
        public Builder jobRun(JobRun jobRun) {
            this.jobRun = jobRun;
            return this;
        }

        /**
         * 请求ID。
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
        @NameInMap("configurations")
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
             * configurations.
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
        @NameInMap("code")
        private String code;

        @NameInMap("message")
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
             * code.
             */
            public Builder code(String code) {
                this.code = code;
                return this;
            }

            /**
             * message.
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
        @NameInMap("codeType")
        private String codeType;

        @NameInMap("configurationOverrides")
        private ConfigurationOverrides configurationOverrides;

        @NameInMap("endTime")
        private Long endTime;

        @NameInMap("executionTimeoutSeconds")
        private Integer executionTimeoutSeconds;

        @NameInMap("jobDriver")
        private JobDriver jobDriver;

        @NameInMap("jobRunId")
        private String jobRunId;

        @NameInMap("log")
        private RunLog log;

        @NameInMap("name")
        private String name;

        @NameInMap("releaseVersion")
        private String releaseVersion;

        @NameInMap("resourceOwnerId")
        private String resourceOwnerId;

        @NameInMap("resourceQueueId")
        private String resourceQueueId;

        @NameInMap("state")
        private String state;

        @NameInMap("stateChangeReason")
        private StateChangeReason stateChangeReason;

        @NameInMap("submitTime")
        private Long submitTime;

        @NameInMap("tags")
        private java.util.List < Tag > tags;

        @NameInMap("webUI")
        private String webUI;

        @NameInMap("workspaceId")
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
             * 作业代码类型。
             */
            public Builder codeType(String codeType) {
                this.codeType = codeType;
                return this;
            }

            /**
             * configurationOverrides.
             */
            public Builder configurationOverrides(ConfigurationOverrides configurationOverrides) {
                this.configurationOverrides = configurationOverrides;
                return this;
            }

            /**
             * 作业结束时间。
             */
            public Builder endTime(Long endTime) {
                this.endTime = endTime;
                return this;
            }

            /**
             * 运行超时时间。
             */
            public Builder executionTimeoutSeconds(Integer executionTimeoutSeconds) {
                this.executionTimeoutSeconds = executionTimeoutSeconds;
                return this;
            }

            /**
             * jobDriver.
             */
            public Builder jobDriver(JobDriver jobDriver) {
                this.jobDriver = jobDriver;
                return this;
            }

            /**
             * 任务实例ID。
             */
            public Builder jobRunId(String jobRunId) {
                this.jobRunId = jobRunId;
                return this;
            }

            /**
             * log.
             */
            public Builder log(RunLog log) {
                this.log = log;
                return this;
            }

            /**
             * 作业实例名称。
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * releaseVersion.
             */
            public Builder releaseVersion(String releaseVersion) {
                this.releaseVersion = releaseVersion;
                return this;
            }

            /**
             * 创建用户Uid。
             */
            public Builder resourceOwnerId(String resourceOwnerId) {
                this.resourceOwnerId = resourceOwnerId;
                return this;
            }

            /**
             * resourceQueueId.
             */
            public Builder resourceQueueId(String resourceQueueId) {
                this.resourceQueueId = resourceQueueId;
                return this;
            }

            /**
             * 作业状态。
             */
            public Builder state(String state) {
                this.state = state;
                return this;
            }

            /**
             * stateChangeReason.
             */
            public Builder stateChangeReason(StateChangeReason stateChangeReason) {
                this.stateChangeReason = stateChangeReason;
                return this;
            }

            /**
             * 作业提交时间。
             */
            public Builder submitTime(Long submitTime) {
                this.submitTime = submitTime;
                return this;
            }

            /**
             * 标签。
             */
            public Builder tags(java.util.List < Tag > tags) {
                this.tags = tags;
                return this;
            }

            /**
             * 作业web ui。
             */
            public Builder webUI(String webUI) {
                this.webUI = webUI;
                return this;
            }

            /**
             * 工作空间id。
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
