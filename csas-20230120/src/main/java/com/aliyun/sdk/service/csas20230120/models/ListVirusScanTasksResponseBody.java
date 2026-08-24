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
 * {@link ListVirusScanTasksResponseBody} extends {@link TeaModel}
 *
 * <p>ListVirusScanTasksResponseBody</p>
 */
public class ListVirusScanTasksResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Tasks")
    private java.util.List<Tasks> tasks;

    @com.aliyun.core.annotation.NameInMap("TotalNum")
    private Integer totalNum;

    private ListVirusScanTasksResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.tasks = builder.tasks;
        this.totalNum = builder.totalNum;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListVirusScanTasksResponseBody create() {
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
    public Integer getTotalNum() {
        return this.totalNum;
    }

    public static final class Builder {
        private String requestId; 
        private java.util.List<Tasks> tasks; 
        private Integer totalNum; 

        private Builder() {
        } 

        private Builder(ListVirusScanTasksResponseBody model) {
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
        public Builder totalNum(Integer totalNum) {
            this.totalNum = totalNum;
            return this;
        }

        public ListVirusScanTasksResponseBody build() {
            return new ListVirusScanTasksResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListVirusScanTasksResponseBody} extends {@link TeaModel}
     *
     * <p>ListVirusScanTasksResponseBody</p>
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
     * {@link ListVirusScanTasksResponseBody} extends {@link TeaModel}
     *
     * <p>ListVirusScanTasksResponseBody</p>
     */
    public static class MatchTargetInfos extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("TargetId")
        private String targetId;

        @com.aliyun.core.annotation.NameInMap("TargetName")
        private String targetName;

        private MatchTargetInfos(Builder builder) {
            this.targetId = builder.targetId;
            this.targetName = builder.targetName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static MatchTargetInfos create() {
            return builder().build();
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

        public static final class Builder {
            private String targetId; 
            private String targetName; 

            private Builder() {
            } 

            private Builder(MatchTargetInfos model) {
                this.targetId = model.targetId;
                this.targetName = model.targetName;
            } 

            /**
             * TargetId.
             */
            public Builder targetId(String targetId) {
                this.targetId = targetId;
                return this;
            }

            /**
             * TargetName.
             */
            public Builder targetName(String targetName) {
                this.targetName = targetName;
                return this;
            }

            public MatchTargetInfos build() {
                return new MatchTargetInfos(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListVirusScanTasksResponseBody} extends {@link TeaModel}
     *
     * <p>ListVirusScanTasksResponseBody</p>
     */
    public static class Tasks extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private String createTime;

        @com.aliyun.core.annotation.NameInMap("CustomMatchGroup")
        private java.util.List<CustomMatchGroup> customMatchGroup;

        @com.aliyun.core.annotation.NameInMap("EndTime")
        private Long endTime;

        @com.aliyun.core.annotation.NameInMap("HighRiskOperation")
        private String highRiskOperation;

        @com.aliyun.core.annotation.NameInMap("LowRiskOperation")
        private String lowRiskOperation;

        @com.aliyun.core.annotation.NameInMap("MatchMode")
        private String matchMode;

        @com.aliyun.core.annotation.NameInMap("MatchTargetInfos")
        private java.util.List<MatchTargetInfos> matchTargetInfos;

        @com.aliyun.core.annotation.NameInMap("MaxCpuUsage")
        private Long maxCpuUsage;

        @com.aliyun.core.annotation.NameInMap("MidRiskOperation")
        private String midRiskOperation;

        @com.aliyun.core.annotation.NameInMap("PerformanceMode")
        private String performanceMode;

        @com.aliyun.core.annotation.NameInMap("ScanMode")
        private String scanMode;

        @com.aliyun.core.annotation.NameInMap("ScanPath")
        private java.util.List<String> scanPath;

        @com.aliyun.core.annotation.NameInMap("ScanTargets")
        private java.util.List<String> scanTargets;

        @com.aliyun.core.annotation.NameInMap("Status")
        private Integer status;

        @com.aliyun.core.annotation.NameInMap("TaskDescription")
        private String taskDescription;

        @com.aliyun.core.annotation.NameInMap("TaskId")
        private String taskId;

        @com.aliyun.core.annotation.NameInMap("Whitelist")
        private java.util.List<String> whitelist;

        private Tasks(Builder builder) {
            this.createTime = builder.createTime;
            this.customMatchGroup = builder.customMatchGroup;
            this.endTime = builder.endTime;
            this.highRiskOperation = builder.highRiskOperation;
            this.lowRiskOperation = builder.lowRiskOperation;
            this.matchMode = builder.matchMode;
            this.matchTargetInfos = builder.matchTargetInfos;
            this.maxCpuUsage = builder.maxCpuUsage;
            this.midRiskOperation = builder.midRiskOperation;
            this.performanceMode = builder.performanceMode;
            this.scanMode = builder.scanMode;
            this.scanPath = builder.scanPath;
            this.scanTargets = builder.scanTargets;
            this.status = builder.status;
            this.taskDescription = builder.taskDescription;
            this.taskId = builder.taskId;
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
        public String getCreateTime() {
            return this.createTime;
        }

        /**
         * @return customMatchGroup
         */
        public java.util.List<CustomMatchGroup> getCustomMatchGroup() {
            return this.customMatchGroup;
        }

        /**
         * @return endTime
         */
        public Long getEndTime() {
            return this.endTime;
        }

        /**
         * @return highRiskOperation
         */
        public String getHighRiskOperation() {
            return this.highRiskOperation;
        }

        /**
         * @return lowRiskOperation
         */
        public String getLowRiskOperation() {
            return this.lowRiskOperation;
        }

        /**
         * @return matchMode
         */
        public String getMatchMode() {
            return this.matchMode;
        }

        /**
         * @return matchTargetInfos
         */
        public java.util.List<MatchTargetInfos> getMatchTargetInfos() {
            return this.matchTargetInfos;
        }

        /**
         * @return maxCpuUsage
         */
        public Long getMaxCpuUsage() {
            return this.maxCpuUsage;
        }

        /**
         * @return midRiskOperation
         */
        public String getMidRiskOperation() {
            return this.midRiskOperation;
        }

        /**
         * @return performanceMode
         */
        public String getPerformanceMode() {
            return this.performanceMode;
        }

        /**
         * @return scanMode
         */
        public String getScanMode() {
            return this.scanMode;
        }

        /**
         * @return scanPath
         */
        public java.util.List<String> getScanPath() {
            return this.scanPath;
        }

        /**
         * @return scanTargets
         */
        public java.util.List<String> getScanTargets() {
            return this.scanTargets;
        }

        /**
         * @return status
         */
        public Integer getStatus() {
            return this.status;
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
         * @return whitelist
         */
        public java.util.List<String> getWhitelist() {
            return this.whitelist;
        }

        public static final class Builder {
            private String createTime; 
            private java.util.List<CustomMatchGroup> customMatchGroup; 
            private Long endTime; 
            private String highRiskOperation; 
            private String lowRiskOperation; 
            private String matchMode; 
            private java.util.List<MatchTargetInfos> matchTargetInfos; 
            private Long maxCpuUsage; 
            private String midRiskOperation; 
            private String performanceMode; 
            private String scanMode; 
            private java.util.List<String> scanPath; 
            private java.util.List<String> scanTargets; 
            private Integer status; 
            private String taskDescription; 
            private String taskId; 
            private java.util.List<String> whitelist; 

            private Builder() {
            } 

            private Builder(Tasks model) {
                this.createTime = model.createTime;
                this.customMatchGroup = model.customMatchGroup;
                this.endTime = model.endTime;
                this.highRiskOperation = model.highRiskOperation;
                this.lowRiskOperation = model.lowRiskOperation;
                this.matchMode = model.matchMode;
                this.matchTargetInfos = model.matchTargetInfos;
                this.maxCpuUsage = model.maxCpuUsage;
                this.midRiskOperation = model.midRiskOperation;
                this.performanceMode = model.performanceMode;
                this.scanMode = model.scanMode;
                this.scanPath = model.scanPath;
                this.scanTargets = model.scanTargets;
                this.status = model.status;
                this.taskDescription = model.taskDescription;
                this.taskId = model.taskId;
                this.whitelist = model.whitelist;
            } 

            /**
             * CreateTime.
             */
            public Builder createTime(String createTime) {
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
             * EndTime.
             */
            public Builder endTime(Long endTime) {
                this.endTime = endTime;
                return this;
            }

            /**
             * HighRiskOperation.
             */
            public Builder highRiskOperation(String highRiskOperation) {
                this.highRiskOperation = highRiskOperation;
                return this;
            }

            /**
             * LowRiskOperation.
             */
            public Builder lowRiskOperation(String lowRiskOperation) {
                this.lowRiskOperation = lowRiskOperation;
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
             * MatchTargetInfos.
             */
            public Builder matchTargetInfos(java.util.List<MatchTargetInfos> matchTargetInfos) {
                this.matchTargetInfos = matchTargetInfos;
                return this;
            }

            /**
             * MaxCpuUsage.
             */
            public Builder maxCpuUsage(Long maxCpuUsage) {
                this.maxCpuUsage = maxCpuUsage;
                return this;
            }

            /**
             * MidRiskOperation.
             */
            public Builder midRiskOperation(String midRiskOperation) {
                this.midRiskOperation = midRiskOperation;
                return this;
            }

            /**
             * PerformanceMode.
             */
            public Builder performanceMode(String performanceMode) {
                this.performanceMode = performanceMode;
                return this;
            }

            /**
             * ScanMode.
             */
            public Builder scanMode(String scanMode) {
                this.scanMode = scanMode;
                return this;
            }

            /**
             * ScanPath.
             */
            public Builder scanPath(java.util.List<String> scanPath) {
                this.scanPath = scanPath;
                return this;
            }

            /**
             * ScanTargets.
             */
            public Builder scanTargets(java.util.List<String> scanTargets) {
                this.scanTargets = scanTargets;
                return this;
            }

            /**
             * Status.
             */
            public Builder status(Integer status) {
                this.status = status;
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
