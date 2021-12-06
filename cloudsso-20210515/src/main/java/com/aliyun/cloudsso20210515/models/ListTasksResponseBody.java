// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudsso20210515.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;

/**
 * {@link ListTasksResponseBody} extends {@link TeaModel}
 *
 * <p>ListTasksResponseBody</p>
 */
public class ListTasksResponseBody extends TeaModel {
    @NameInMap("IsTruncated")
    private Boolean isTruncated;

    @NameInMap("MaxResults")
    private Integer maxResults;

    @NameInMap("NextToken")
    private String nextToken;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Tasks")
    private java.util.List < Tasks> tasks;

    @NameInMap("TotalCounts")
    private Integer totalCounts;


    private ListTasksResponseBody(Builder builder) {
        this.isTruncated = builder.isTruncated;
        this.maxResults = builder.maxResults;
        this.nextToken = builder.nextToken;
        this.requestId = builder.requestId;
        this.tasks = builder.tasks;
        this.totalCounts = builder.totalCounts;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListTasksResponseBody create() {
        return builder().build();
    }

    /**
     * @return isTruncated
     */
    public Boolean getIsTruncated() {
        return this.isTruncated;
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
     * @return tasks
     */
    public java.util.List < Tasks> getTasks() {
        return this.tasks;
    }

    /**
     * @return totalCounts
     */
    public Integer getTotalCounts() {
        return this.totalCounts;
    }

    public static final class Builder {
        private Boolean isTruncated; 
        private Integer maxResults; 
        private String nextToken; 
        private String requestId; 
        private java.util.List < Tasks> tasks; 
        private Integer totalCounts; 

        /**
         * <p>IsTruncated.</p>
         */
        public Builder isTruncated(Boolean isTruncated) {
            this.isTruncated = isTruncated;
            return this;
        }

        /**
         * <p>MaxResults.</p>
         */
        public Builder maxResults(Integer maxResults) {
            this.maxResults = maxResults;
            return this;
        }

        /**
         * <p>NextToken.</p>
         */
        public Builder nextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }

        /**
         * <p>RequestId.</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Tasks.</p>
         */
        public Builder tasks(java.util.List < Tasks> tasks) {
            this.tasks = tasks;
            return this;
        }

        /**
         * <p>TotalCounts.</p>
         */
        public Builder totalCounts(Integer totalCounts) {
            this.totalCounts = totalCounts;
            return this;
        }

        public ListTasksResponseBody build() {
            return new ListTasksResponseBody(this);
        } 

    } 

    public static class Tasks extends TeaModel {
        @NameInMap("AccessConfigurationId")
        private String accessConfigurationId;

        @NameInMap("AccessConfigurationName")
        private String accessConfigurationName;

        @NameInMap("EndTime")
        private String endTime;

        @NameInMap("FailureReason")
        private String failureReason;

        @NameInMap("PrincipalId")
        private String principalId;

        @NameInMap("PrincipalName")
        private String principalName;

        @NameInMap("PrincipalType")
        private String principalType;

        @NameInMap("StartTime")
        private String startTime;

        @NameInMap("Status")
        private String status;

        @NameInMap("TargetId")
        private String targetId;

        @NameInMap("TargetName")
        private String targetName;

        @NameInMap("TargetPath")
        private String targetPath;

        @NameInMap("TargetPathName")
        private String targetPathName;

        @NameInMap("TargetType")
        private String targetType;

        @NameInMap("TaskId")
        private String taskId;

        @NameInMap("TaskType")
        private String taskType;


        private Tasks(Builder builder) {
            this.accessConfigurationId = builder.accessConfigurationId;
            this.accessConfigurationName = builder.accessConfigurationName;
            this.endTime = builder.endTime;
            this.failureReason = builder.failureReason;
            this.principalId = builder.principalId;
            this.principalName = builder.principalName;
            this.principalType = builder.principalType;
            this.startTime = builder.startTime;
            this.status = builder.status;
            this.targetId = builder.targetId;
            this.targetName = builder.targetName;
            this.targetPath = builder.targetPath;
            this.targetPathName = builder.targetPathName;
            this.targetType = builder.targetType;
            this.taskId = builder.taskId;
            this.taskType = builder.taskType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Tasks create() {
            return builder().build();
        }

        /**
         * @return accessConfigurationId
         */
        public String getAccessConfigurationId() {
            return this.accessConfigurationId;
        }

        /**
         * @return accessConfigurationName
         */
        public String getAccessConfigurationName() {
            return this.accessConfigurationName;
        }

        /**
         * @return endTime
         */
        public String getEndTime() {
            return this.endTime;
        }

        /**
         * @return failureReason
         */
        public String getFailureReason() {
            return this.failureReason;
        }

        /**
         * @return principalId
         */
        public String getPrincipalId() {
            return this.principalId;
        }

        /**
         * @return principalName
         */
        public String getPrincipalName() {
            return this.principalName;
        }

        /**
         * @return principalType
         */
        public String getPrincipalType() {
            return this.principalType;
        }

        /**
         * @return startTime
         */
        public String getStartTime() {
            return this.startTime;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return targetId
         */
        public String getTargetId() {
            return this.targetId;
        }

        /**
         * @return targetName
         */
        public String getTargetName() {
            return this.targetName;
        }

        /**
         * @return targetPath
         */
        public String getTargetPath() {
            return this.targetPath;
        }

        /**
         * @return targetPathName
         */
        public String getTargetPathName() {
            return this.targetPathName;
        }

        /**
         * @return targetType
         */
        public String getTargetType() {
            return this.targetType;
        }

        /**
         * @return taskId
         */
        public String getTaskId() {
            return this.taskId;
        }

        /**
         * @return taskType
         */
        public String getTaskType() {
            return this.taskType;
        }

        public static final class Builder {
            private String accessConfigurationId; 
            private String accessConfigurationName; 
            private String endTime; 
            private String failureReason; 
            private String principalId; 
            private String principalName; 
            private String principalType; 
            private String startTime; 
            private String status; 
            private String targetId; 
            private String targetName; 
            private String targetPath; 
            private String targetPathName; 
            private String targetType; 
            private String taskId; 
            private String taskType; 

            /**
             * <p>AccessConfigurationId.</p>
             */
            public Builder accessConfigurationId(String accessConfigurationId) {
                this.accessConfigurationId = accessConfigurationId;
                return this;
            }

            /**
             * <p>AccessConfigurationName.</p>
             */
            public Builder accessConfigurationName(String accessConfigurationName) {
                this.accessConfigurationName = accessConfigurationName;
                return this;
            }

            /**
             * <p>EndTime.</p>
             */
            public Builder endTime(String endTime) {
                this.endTime = endTime;
                return this;
            }

            /**
             * <p>FailureReason.</p>
             */
            public Builder failureReason(String failureReason) {
                this.failureReason = failureReason;
                return this;
            }

            /**
             * <p>PrincipalId.</p>
             */
            public Builder principalId(String principalId) {
                this.principalId = principalId;
                return this;
            }

            /**
             * <p>PrincipalName.</p>
             */
            public Builder principalName(String principalName) {
                this.principalName = principalName;
                return this;
            }

            /**
             * <p>PrincipalType.</p>
             */
            public Builder principalType(String principalType) {
                this.principalType = principalType;
                return this;
            }

            /**
             * <p>StartTime.</p>
             */
            public Builder startTime(String startTime) {
                this.startTime = startTime;
                return this;
            }

            /**
             * <p>Status.</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * <p>TargetId.</p>
             */
            public Builder targetId(String targetId) {
                this.targetId = targetId;
                return this;
            }

            /**
             * <p>TargetName.</p>
             */
            public Builder targetName(String targetName) {
                this.targetName = targetName;
                return this;
            }

            /**
             * <p>TargetPath.</p>
             */
            public Builder targetPath(String targetPath) {
                this.targetPath = targetPath;
                return this;
            }

            /**
             * <p>TargetPathName.</p>
             */
            public Builder targetPathName(String targetPathName) {
                this.targetPathName = targetPathName;
                return this;
            }

            /**
             * <p>TargetType.</p>
             */
            public Builder targetType(String targetType) {
                this.targetType = targetType;
                return this;
            }

            /**
             * <p>TaskId.</p>
             */
            public Builder taskId(String taskId) {
                this.taskId = taskId;
                return this;
            }

            /**
             * <p>TaskType.</p>
             */
            public Builder taskType(String taskType) {
                this.taskType = taskType;
                return this;
            }

            public Tasks build() {
                return new Tasks(this);
            } 

        } 

    }
}
