// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.csas20230120.models;

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
 * {@link ListVulScanTasksResponseBody} extends {@link TeaModel}
 *
 * <p>ListVulScanTasksResponseBody</p>
 */
public class ListVulScanTasksResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Tasks")
    private java.util.List<Tasks> tasks;

    @com.aliyun.core.annotation.NameInMap("TotalNum")
    private Long totalNum;

    private ListVulScanTasksResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.tasks = builder.tasks;
        this.totalNum = builder.totalNum;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListVulScanTasksResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
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
     * @return totalNum
     */
    public Long getTotalNum() {
        return this.totalNum;
    }

    public static final class Builder {
        private String requestId; 
        private java.util.List<Tasks> tasks; 
        private Long totalNum; 

        private Builder() {
        } 

        private Builder(ListVulScanTasksResponseBody model) {
            this.requestId = model.requestId;
            this.tasks = model.tasks;
            this.totalNum = model.totalNum;
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
         * TotalNum.
         */
        public Builder totalNum(Long totalNum) {
            this.totalNum = totalNum;
            return this;
        }

        public ListVulScanTasksResponseBody build() {
            return new ListVulScanTasksResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListVulScanTasksResponseBody} extends {@link TeaModel}
     *
     * <p>ListVulScanTasksResponseBody</p>
     */
    public static class CustomMatchGroup extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Group")
        private java.util.List<String> group;

        @com.aliyun.core.annotation.NameInMap("IdpId")
        private String idpId;

        private CustomMatchGroup(Builder builder) {
            this.group = builder.group;
            this.idpId = builder.idpId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static CustomMatchGroup create() {
            return builder().build();
        }

        /**
         * @return group
         */
        public java.util.List<String> getGroup() {
            return this.group;
        }

        /**
         * @return idpId
         */
        public String getIdpId() {
            return this.idpId;
        }

        public static final class Builder {
            private java.util.List<String> group; 
            private String idpId; 

            private Builder() {
            } 

            private Builder(CustomMatchGroup model) {
                this.group = model.group;
                this.idpId = model.idpId;
            } 

            /**
             * Group.
             */
            public Builder group(java.util.List<String> group) {
                this.group = group;
                return this;
            }

            /**
             * IdpId.
             */
            public Builder idpId(String idpId) {
                this.idpId = idpId;
                return this;
            }

            public CustomMatchGroup build() {
                return new CustomMatchGroup(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListVulScanTasksResponseBody} extends {@link TeaModel}
     *
     * <p>ListVulScanTasksResponseBody</p>
     */
    public static class TargetDeviceCount extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AckCount")
        private Long ackCount;

        @com.aliyun.core.annotation.NameInMap("FailCount")
        private Long failCount;

        @com.aliyun.core.annotation.NameInMap("StartCount")
        private Long startCount;

        @com.aliyun.core.annotation.NameInMap("SuccessCount")
        private Long successCount;

        private TargetDeviceCount(Builder builder) {
            this.ackCount = builder.ackCount;
            this.failCount = builder.failCount;
            this.startCount = builder.startCount;
            this.successCount = builder.successCount;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TargetDeviceCount create() {
            return builder().build();
        }

        /**
         * @return ackCount
         */
        public Long getAckCount() {
            return this.ackCount;
        }

        /**
         * @return failCount
         */
        public Long getFailCount() {
            return this.failCount;
        }

        /**
         * @return startCount
         */
        public Long getStartCount() {
            return this.startCount;
        }

        /**
         * @return successCount
         */
        public Long getSuccessCount() {
            return this.successCount;
        }

        public static final class Builder {
            private Long ackCount; 
            private Long failCount; 
            private Long startCount; 
            private Long successCount; 

            private Builder() {
            } 

            private Builder(TargetDeviceCount model) {
                this.ackCount = model.ackCount;
                this.failCount = model.failCount;
                this.startCount = model.startCount;
                this.successCount = model.successCount;
            } 

            /**
             * AckCount.
             */
            public Builder ackCount(Long ackCount) {
                this.ackCount = ackCount;
                return this;
            }

            /**
             * FailCount.
             */
            public Builder failCount(Long failCount) {
                this.failCount = failCount;
                return this;
            }

            /**
             * StartCount.
             */
            public Builder startCount(Long startCount) {
                this.startCount = startCount;
                return this;
            }

            /**
             * SuccessCount.
             */
            public Builder successCount(Long successCount) {
                this.successCount = successCount;
                return this;
            }

            public TargetDeviceCount build() {
                return new TargetDeviceCount(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListVulScanTasksResponseBody} extends {@link TeaModel}
     *
     * <p>ListVulScanTasksResponseBody</p>
     */
    public static class Tasks extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private Long createTime;

        @com.aliyun.core.annotation.NameInMap("CustomMatchGroup")
        private java.util.List<CustomMatchGroup> customMatchGroup;

        @com.aliyun.core.annotation.NameInMap("EndTimestamp")
        private Long endTimestamp;

        @com.aliyun.core.annotation.NameInMap("MatchMode")
        private String matchMode;

        @com.aliyun.core.annotation.NameInMap("MatchTargetIds")
        private java.util.List<String> matchTargetIds;

        @com.aliyun.core.annotation.NameInMap("ScheduledStrategyId")
        private String scheduledStrategyId;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("TargetDeviceCount")
        private TargetDeviceCount targetDeviceCount;

        @com.aliyun.core.annotation.NameInMap("TaskDescription")
        private String taskDescription;

        @com.aliyun.core.annotation.NameInMap("TaskId")
        private String taskId;

        @com.aliyun.core.annotation.NameInMap("TaskName")
        private String taskName;

        @com.aliyun.core.annotation.NameInMap("TaskType")
        private String taskType;

        @com.aliyun.core.annotation.NameInMap("VulCount")
        private Long vulCount;

        @com.aliyun.core.annotation.NameInMap("Whitelist")
        private java.util.List<String> whitelist;

        private Tasks(Builder builder) {
            this.createTime = builder.createTime;
            this.customMatchGroup = builder.customMatchGroup;
            this.endTimestamp = builder.endTimestamp;
            this.matchMode = builder.matchMode;
            this.matchTargetIds = builder.matchTargetIds;
            this.scheduledStrategyId = builder.scheduledStrategyId;
            this.status = builder.status;
            this.targetDeviceCount = builder.targetDeviceCount;
            this.taskDescription = builder.taskDescription;
            this.taskId = builder.taskId;
            this.taskName = builder.taskName;
            this.taskType = builder.taskType;
            this.vulCount = builder.vulCount;
            this.whitelist = builder.whitelist;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Tasks create() {
            return builder().build();
        }

        /**
         * @return createTime
         */
        public Long getCreateTime() {
            return this.createTime;
        }

        /**
         * @return customMatchGroup
         */
        public java.util.List<CustomMatchGroup> getCustomMatchGroup() {
            return this.customMatchGroup;
        }

        /**
         * @return endTimestamp
         */
        public Long getEndTimestamp() {
            return this.endTimestamp;
        }

        /**
         * @return matchMode
         */
        public String getMatchMode() {
            return this.matchMode;
        }

        /**
         * @return matchTargetIds
         */
        public java.util.List<String> getMatchTargetIds() {
            return this.matchTargetIds;
        }

        /**
         * @return scheduledStrategyId
         */
        public String getScheduledStrategyId() {
            return this.scheduledStrategyId;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return targetDeviceCount
         */
        public TargetDeviceCount getTargetDeviceCount() {
            return this.targetDeviceCount;
        }

        /**
         * @return taskDescription
         */
        public String getTaskDescription() {
            return this.taskDescription;
        }

        /**
         * @return taskId
         */
        public String getTaskId() {
            return this.taskId;
        }

        /**
         * @return taskName
         */
        public String getTaskName() {
            return this.taskName;
        }

        /**
         * @return taskType
         */
        public String getTaskType() {
            return this.taskType;
        }

        /**
         * @return vulCount
         */
        public Long getVulCount() {
            return this.vulCount;
        }

        /**
         * @return whitelist
         */
        public java.util.List<String> getWhitelist() {
            return this.whitelist;
        }

        public static final class Builder {
            private Long createTime; 
            private java.util.List<CustomMatchGroup> customMatchGroup; 
            private Long endTimestamp; 
            private String matchMode; 
            private java.util.List<String> matchTargetIds; 
            private String scheduledStrategyId; 
            private String status; 
            private TargetDeviceCount targetDeviceCount; 
            private String taskDescription; 
            private String taskId; 
            private String taskName; 
            private String taskType; 
            private Long vulCount; 
            private java.util.List<String> whitelist; 

            private Builder() {
            } 

            private Builder(Tasks model) {
                this.createTime = model.createTime;
                this.customMatchGroup = model.customMatchGroup;
                this.endTimestamp = model.endTimestamp;
                this.matchMode = model.matchMode;
                this.matchTargetIds = model.matchTargetIds;
                this.scheduledStrategyId = model.scheduledStrategyId;
                this.status = model.status;
                this.targetDeviceCount = model.targetDeviceCount;
                this.taskDescription = model.taskDescription;
                this.taskId = model.taskId;
                this.taskName = model.taskName;
                this.taskType = model.taskType;
                this.vulCount = model.vulCount;
                this.whitelist = model.whitelist;
            } 

            /**
             * CreateTime.
             */
            public Builder createTime(Long createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * CustomMatchGroup.
             */
            public Builder customMatchGroup(java.util.List<CustomMatchGroup> customMatchGroup) {
                this.customMatchGroup = customMatchGroup;
                return this;
            }

            /**
             * EndTimestamp.
             */
            public Builder endTimestamp(Long endTimestamp) {
                this.endTimestamp = endTimestamp;
                return this;
            }

            /**
             * MatchMode.
             */
            public Builder matchMode(String matchMode) {
                this.matchMode = matchMode;
                return this;
            }

            /**
             * MatchTargetIds.
             */
            public Builder matchTargetIds(java.util.List<String> matchTargetIds) {
                this.matchTargetIds = matchTargetIds;
                return this;
            }

            /**
             * ScheduledStrategyId.
             */
            public Builder scheduledStrategyId(String scheduledStrategyId) {
                this.scheduledStrategyId = scheduledStrategyId;
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
             * TargetDeviceCount.
             */
            public Builder targetDeviceCount(TargetDeviceCount targetDeviceCount) {
                this.targetDeviceCount = targetDeviceCount;
                return this;
            }

            /**
             * TaskDescription.
             */
            public Builder taskDescription(String taskDescription) {
                this.taskDescription = taskDescription;
                return this;
            }

            /**
             * TaskId.
             */
            public Builder taskId(String taskId) {
                this.taskId = taskId;
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
             * TaskType.
             */
            public Builder taskType(String taskType) {
                this.taskType = taskType;
                return this;
            }

            /**
             * VulCount.
             */
            public Builder vulCount(Long vulCount) {
                this.vulCount = vulCount;
                return this;
            }

            /**
             * Whitelist.
             */
            public Builder whitelist(java.util.List<String> whitelist) {
                this.whitelist = whitelist;
                return this;
            }

            public Tasks build() {
                return new Tasks(this);
            } 

        } 

    }
}
