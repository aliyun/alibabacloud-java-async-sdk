// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.emr_serverless_spark20230808.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListJobRunsResponseBody} extends {@link TeaModel}
 *
 * <p>ListJobRunsResponseBody</p>
 */
public class ListJobRunsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("jobRuns")
    private java.util.List < JobRuns> jobRuns;

    @com.aliyun.core.annotation.NameInMap("maxResults")
    private Integer maxResults;

    @com.aliyun.core.annotation.NameInMap("nextToken")
    private String nextToken;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("totalCount")
    private Integer totalCount;

    private ListJobRunsResponseBody(Builder builder) {
        this.jobRuns = builder.jobRuns;
        this.maxResults = builder.maxResults;
        this.nextToken = builder.nextToken;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListJobRunsResponseBody create() {
        return builder().build();
    }

    /**
     * @return jobRuns
     */
    public java.util.List < JobRuns> getJobRuns() {
        return this.jobRuns;
    }

    /**
     * @return maxResults
     */
    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * @return nextToken
     */
    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return totalCount
     */
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private java.util.List < JobRuns> jobRuns; 
        private Integer maxResults; 
        private String nextToken; 
        private String requestId; 
        private Integer totalCount; 

        /**
         * jobRuns.
         */
        public Builder jobRuns(java.util.List < JobRuns> jobRuns) {
            this.jobRuns = jobRuns;
            return this;
        }

        /**
         * 本次请求所返回的最大记录条数。
         */
        public Builder maxResults(Integer maxResults) {
            this.maxResults = maxResults;
            return this;
        }

        /**
         * 返回读取到的数据位置，空代表数据已经读取完毕。
         */
        public Builder nextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }

        /**
         * 请求ID。
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * 本次请求条件下的数据总量。
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public ListJobRunsResponseBody build() {
            return new ListJobRunsResponseBody(this);
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
    public static class JobRuns extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("codeType")
        private String codeType;

        @com.aliyun.core.annotation.NameInMap("configurationOverrides")
        private ConfigurationOverrides configurationOverrides;

        @com.aliyun.core.annotation.NameInMap("creator")
        private String creator;

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

        private JobRuns(Builder builder) {
            this.codeType = builder.codeType;
            this.configurationOverrides = builder.configurationOverrides;
            this.creator = builder.creator;
            this.endTime = builder.endTime;
            this.executionTimeoutSeconds = builder.executionTimeoutSeconds;
            this.jobDriver = builder.jobDriver;
            this.jobRunId = builder.jobRunId;
            this.log = builder.log;
            this.name = builder.name;
            this.releaseVersion = builder.releaseVersion;
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

        public static JobRuns create() {
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
         * @return creator
         */
        public String getCreator() {
            return this.creator;
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
            private String creator; 
            private Long endTime; 
            private Integer executionTimeoutSeconds; 
            private JobDriver jobDriver; 
            private String jobRunId; 
            private RunLog log; 
            private String name; 
            private String releaseVersion; 
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
             * 创建用户Uid。
             */
            public Builder creator(String creator) {
                this.creator = creator;
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

            public JobRuns build() {
                return new JobRuns(this);
            } 

        } 

    }
}
