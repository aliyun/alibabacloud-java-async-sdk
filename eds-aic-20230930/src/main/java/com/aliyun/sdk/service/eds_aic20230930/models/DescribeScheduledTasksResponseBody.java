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
 * {@link DescribeScheduledTasksResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeScheduledTasksResponseBody</p>
 */
public class DescribeScheduledTasksResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("MaxResults")
    private Integer maxResults;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("NextToken")
    private String nextToken;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Tasks")
    private java.util.List<Tasks> tasks;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Integer totalCount;

    private DescribeScheduledTasksResponseBody(Builder builder) {
        this.code = builder.code;
        this.maxResults = builder.maxResults;
        this.message = builder.message;
        this.nextToken = builder.nextToken;
        this.requestId = builder.requestId;
        this.tasks = builder.tasks;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeScheduledTasksResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return maxResults
     */
    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
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
     * @return tasks
     */
    public java.util.List<Tasks> getTasks() {
        return this.tasks;
    }

    /**
     * @return totalCount
     */
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private String code; 
        private Integer maxResults; 
        private String message; 
        private String nextToken; 
        private String requestId; 
        private java.util.List<Tasks> tasks; 
        private Integer totalCount; 

        private Builder() {
        } 

        private Builder(DescribeScheduledTasksResponseBody model) {
            this.code = model.code;
            this.maxResults = model.maxResults;
            this.message = model.message;
            this.nextToken = model.nextToken;
            this.requestId = model.requestId;
            this.tasks = model.tasks;
            this.totalCount = model.totalCount;
        } 

        /**
         * Code.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * MaxResults.
         */
        public Builder maxResults(Integer maxResults) {
            this.maxResults = maxResults;
            return this;
        }

        /**
         * Message.
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * NextToken.
         */
        public Builder nextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Tasks.
         */
        public Builder tasks(java.util.List<Tasks> tasks) {
            this.tasks = tasks;
            return this;
        }

        /**
         * TotalCount.
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public DescribeScheduledTasksResponseBody build() {
            return new DescribeScheduledTasksResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeScheduledTasksResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeScheduledTasksResponseBody</p>
     */
    public static class RunConfig extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ExtraParams")
        private String extraParams;

        @com.aliyun.core.annotation.NameInMap("MaxSteps")
        private Integer maxSteps;

        @com.aliyun.core.annotation.NameInMap("Skills")
        private java.util.List<String> skills;

        @com.aliyun.core.annotation.NameInMap("TimeoutSeconds")
        private Integer timeoutSeconds;

        private RunConfig(Builder builder) {
            this.extraParams = builder.extraParams;
            this.maxSteps = builder.maxSteps;
            this.skills = builder.skills;
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
         * @return skills
         */
        public java.util.List<String> getSkills() {
            return this.skills;
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
            private java.util.List<String> skills; 
            private Integer timeoutSeconds; 

            private Builder() {
            } 

            private Builder(RunConfig model) {
                this.extraParams = model.extraParams;
                this.maxSteps = model.maxSteps;
                this.skills = model.skills;
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
             * Skills.
             */
            public Builder skills(java.util.List<String> skills) {
                this.skills = skills;
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
    /**
     * 
     * {@link DescribeScheduledTasksResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeScheduledTasksResponseBody</p>
     */
    public static class Tasks extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CronExpression")
        private String cronExpression;

        @com.aliyun.core.annotation.NameInMap("GmtCreate")
        private String gmtCreate;

        @com.aliyun.core.annotation.NameInMap("GmtModified")
        private String gmtModified;

        @com.aliyun.core.annotation.NameInMap("InstanceIds")
        private java.util.List<String> instanceIds;

        @com.aliyun.core.annotation.NameInMap("LastExecutionAt")
        private String lastExecutionAt;

        @com.aliyun.core.annotation.NameInMap("NextExecutionAt")
        private String nextExecutionAt;

        @com.aliyun.core.annotation.NameInMap("RunConfig")
        private RunConfig runConfig;

        @com.aliyun.core.annotation.NameInMap("ScheduledId")
        private String scheduledId;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("TaskConfigId")
        private String taskConfigId;

        @com.aliyun.core.annotation.NameInMap("TaskName")
        private String taskName;

        @com.aliyun.core.annotation.NameInMap("TotalExecutions")
        private Long totalExecutions;

        @com.aliyun.core.annotation.NameInMap("TotalFailures")
        private Long totalFailures;

        @com.aliyun.core.annotation.NameInMap("UserPrompt")
        private String userPrompt;

        @com.aliyun.core.annotation.NameInMap("Version")
        private Integer version;

        private Tasks(Builder builder) {
            this.cronExpression = builder.cronExpression;
            this.gmtCreate = builder.gmtCreate;
            this.gmtModified = builder.gmtModified;
            this.instanceIds = builder.instanceIds;
            this.lastExecutionAt = builder.lastExecutionAt;
            this.nextExecutionAt = builder.nextExecutionAt;
            this.runConfig = builder.runConfig;
            this.scheduledId = builder.scheduledId;
            this.status = builder.status;
            this.taskConfigId = builder.taskConfigId;
            this.taskName = builder.taskName;
            this.totalExecutions = builder.totalExecutions;
            this.totalFailures = builder.totalFailures;
            this.userPrompt = builder.userPrompt;
            this.version = builder.version;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Tasks create() {
            return builder().build();
        }

        /**
         * @return cronExpression
         */
        public String getCronExpression() {
            return this.cronExpression;
        }

        /**
         * @return gmtCreate
         */
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        /**
         * @return gmtModified
         */
        public String getGmtModified() {
            return this.gmtModified;
        }

        /**
         * @return instanceIds
         */
        public java.util.List<String> getInstanceIds() {
            return this.instanceIds;
        }

        /**
         * @return lastExecutionAt
         */
        public String getLastExecutionAt() {
            return this.lastExecutionAt;
        }

        /**
         * @return nextExecutionAt
         */
        public String getNextExecutionAt() {
            return this.nextExecutionAt;
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
         * @return taskConfigId
         */
        public String getTaskConfigId() {
            return this.taskConfigId;
        }

        /**
         * @return taskName
         */
        public String getTaskName() {
            return this.taskName;
        }

        /**
         * @return totalExecutions
         */
        public Long getTotalExecutions() {
            return this.totalExecutions;
        }

        /**
         * @return totalFailures
         */
        public Long getTotalFailures() {
            return this.totalFailures;
        }

        /**
         * @return userPrompt
         */
        public String getUserPrompt() {
            return this.userPrompt;
        }

        /**
         * @return version
         */
        public Integer getVersion() {
            return this.version;
        }

        public static final class Builder {
            private String cronExpression; 
            private String gmtCreate; 
            private String gmtModified; 
            private java.util.List<String> instanceIds; 
            private String lastExecutionAt; 
            private String nextExecutionAt; 
            private RunConfig runConfig; 
            private String scheduledId; 
            private String status; 
            private String taskConfigId; 
            private String taskName; 
            private Long totalExecutions; 
            private Long totalFailures; 
            private String userPrompt; 
            private Integer version; 

            private Builder() {
            } 

            private Builder(Tasks model) {
                this.cronExpression = model.cronExpression;
                this.gmtCreate = model.gmtCreate;
                this.gmtModified = model.gmtModified;
                this.instanceIds = model.instanceIds;
                this.lastExecutionAt = model.lastExecutionAt;
                this.nextExecutionAt = model.nextExecutionAt;
                this.runConfig = model.runConfig;
                this.scheduledId = model.scheduledId;
                this.status = model.status;
                this.taskConfigId = model.taskConfigId;
                this.taskName = model.taskName;
                this.totalExecutions = model.totalExecutions;
                this.totalFailures = model.totalFailures;
                this.userPrompt = model.userPrompt;
                this.version = model.version;
            } 

            /**
             * CronExpression.
             */
            public Builder cronExpression(String cronExpression) {
                this.cronExpression = cronExpression;
                return this;
            }

            /**
             * GmtCreate.
             */
            public Builder gmtCreate(String gmtCreate) {
                this.gmtCreate = gmtCreate;
                return this;
            }

            /**
             * GmtModified.
             */
            public Builder gmtModified(String gmtModified) {
                this.gmtModified = gmtModified;
                return this;
            }

            /**
             * InstanceIds.
             */
            public Builder instanceIds(java.util.List<String> instanceIds) {
                this.instanceIds = instanceIds;
                return this;
            }

            /**
             * LastExecutionAt.
             */
            public Builder lastExecutionAt(String lastExecutionAt) {
                this.lastExecutionAt = lastExecutionAt;
                return this;
            }

            /**
             * NextExecutionAt.
             */
            public Builder nextExecutionAt(String nextExecutionAt) {
                this.nextExecutionAt = nextExecutionAt;
                return this;
            }

            /**
             * RunConfig.
             */
            public Builder runConfig(RunConfig runConfig) {
                this.runConfig = runConfig;
                return this;
            }

            /**
             * ScheduledId.
             */
            public Builder scheduledId(String scheduledId) {
                this.scheduledId = scheduledId;
                return this;
            }

            /**
             * Status.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * TaskConfigId.
             */
            public Builder taskConfigId(String taskConfigId) {
                this.taskConfigId = taskConfigId;
                return this;
            }

            /**
             * TaskName.
             */
            public Builder taskName(String taskName) {
                this.taskName = taskName;
                return this;
            }

            /**
             * TotalExecutions.
             */
            public Builder totalExecutions(Long totalExecutions) {
                this.totalExecutions = totalExecutions;
                return this;
            }

            /**
             * TotalFailures.
             */
            public Builder totalFailures(Long totalFailures) {
                this.totalFailures = totalFailures;
                return this;
            }

            /**
             * UserPrompt.
             */
            public Builder userPrompt(String userPrompt) {
                this.userPrompt = userPrompt;
                return this;
            }

            /**
             * Version.
             */
            public Builder version(Integer version) {
                this.version = version;
                return this;
            }

            public Tasks build() {
                return new Tasks(this);
            } 

        } 

    }
}
