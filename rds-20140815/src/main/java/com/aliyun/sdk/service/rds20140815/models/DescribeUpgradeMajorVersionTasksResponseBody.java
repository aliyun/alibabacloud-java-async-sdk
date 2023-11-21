// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.rds20140815.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeUpgradeMajorVersionTasksResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeUpgradeMajorVersionTasksResponseBody</p>
 */
public class DescribeUpgradeMajorVersionTasksResponseBody extends TeaModel {
    @NameInMap("Items")
    private java.util.List < Items> items;

    @NameInMap("PageNumber")
    private Integer pageNumber;

    @NameInMap("PageRecordCount")
    private Integer pageRecordCount;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("TotalRecordCount")
    private Integer totalRecordCount;

    private DescribeUpgradeMajorVersionTasksResponseBody(Builder builder) {
        this.items = builder.items;
        this.pageNumber = builder.pageNumber;
        this.pageRecordCount = builder.pageRecordCount;
        this.requestId = builder.requestId;
        this.totalRecordCount = builder.totalRecordCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeUpgradeMajorVersionTasksResponseBody create() {
        return builder().build();
    }

    /**
     * @return items
     */
    public java.util.List < Items> getItems() {
        return this.items;
    }

    /**
     * @return pageNumber
     */
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    /**
     * @return pageRecordCount
     */
    public Integer getPageRecordCount() {
        return this.pageRecordCount;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return totalRecordCount
     */
    public Integer getTotalRecordCount() {
        return this.totalRecordCount;
    }

    public static final class Builder {
        private java.util.List < Items> items; 
        private Integer pageNumber; 
        private Integer pageRecordCount; 
        private String requestId; 
        private Integer totalRecordCount; 

        /**
         * The tasks for major engine version upgrades.
         */
        public Builder items(java.util.List < Items> items) {
            this.items = items;
            return this;
        }

        /**
         * The page number.
         */
        public Builder pageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * The number of entries per page.
         */
        public Builder pageRecordCount(Integer pageRecordCount) {
            this.pageRecordCount = pageRecordCount;
            return this;
        }

        /**
         * The request ID.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * The total number of entries returned.
         */
        public Builder totalRecordCount(Integer totalRecordCount) {
            this.totalRecordCount = totalRecordCount;
            return this;
        }

        public DescribeUpgradeMajorVersionTasksResponseBody build() {
            return new DescribeUpgradeMajorVersionTasksResponseBody(this);
        } 

    } 

    public static class Items extends TeaModel {
        @NameInMap("CollectStatMode")
        private String collectStatMode;

        @NameInMap("Detail")
        private String detail;

        @NameInMap("EndTime")
        private String endTime;

        @NameInMap("Result")
        private String result;

        @NameInMap("SourceInsName")
        private String sourceInsName;

        @NameInMap("SourceMajorVersion")
        private String sourceMajorVersion;

        @NameInMap("StartTime")
        private String startTime;

        @NameInMap("SwitchTime")
        private String switchTime;

        @NameInMap("TargetInsName")
        private String targetInsName;

        @NameInMap("TargetMajorVersion")
        private String targetMajorVersion;

        @NameInMap("TaskId")
        private Integer taskId;

        @NameInMap("UpgradeMode")
        private String upgradeMode;

        private Items(Builder builder) {
            this.collectStatMode = builder.collectStatMode;
            this.detail = builder.detail;
            this.endTime = builder.endTime;
            this.result = builder.result;
            this.sourceInsName = builder.sourceInsName;
            this.sourceMajorVersion = builder.sourceMajorVersion;
            this.startTime = builder.startTime;
            this.switchTime = builder.switchTime;
            this.targetInsName = builder.targetInsName;
            this.targetMajorVersion = builder.targetMajorVersion;
            this.taskId = builder.taskId;
            this.upgradeMode = builder.upgradeMode;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Items create() {
            return builder().build();
        }

        /**
         * @return collectStatMode
         */
        public String getCollectStatMode() {
            return this.collectStatMode;
        }

        /**
         * @return detail
         */
        public String getDetail() {
            return this.detail;
        }

        /**
         * @return endTime
         */
        public String getEndTime() {
            return this.endTime;
        }

        /**
         * @return result
         */
        public String getResult() {
            return this.result;
        }

        /**
         * @return sourceInsName
         */
        public String getSourceInsName() {
            return this.sourceInsName;
        }

        /**
         * @return sourceMajorVersion
         */
        public String getSourceMajorVersion() {
            return this.sourceMajorVersion;
        }

        /**
         * @return startTime
         */
        public String getStartTime() {
            return this.startTime;
        }

        /**
         * @return switchTime
         */
        public String getSwitchTime() {
            return this.switchTime;
        }

        /**
         * @return targetInsName
         */
        public String getTargetInsName() {
            return this.targetInsName;
        }

        /**
         * @return targetMajorVersion
         */
        public String getTargetMajorVersion() {
            return this.targetMajorVersion;
        }

        /**
         * @return taskId
         */
        public Integer getTaskId() {
            return this.taskId;
        }

        /**
         * @return upgradeMode
         */
        public String getUpgradeMode() {
            return this.upgradeMode;
        }

        public static final class Builder {
            private String collectStatMode; 
            private String detail; 
            private String endTime; 
            private String result; 
            private String sourceInsName; 
            private String sourceMajorVersion; 
            private String startTime; 
            private String switchTime; 
            private String targetInsName; 
            private String targetMajorVersion; 
            private Integer taskId; 
            private String upgradeMode; 

            /**
             * The time when the system collects the statistics.
             * <p>
             * 
             * Valid values:
             * 
             * *   **After**: The system collects the statistics after a switchover.
             * *   **Before**: The system collects the statistics before a switchover.
             */
            public Builder collectStatMode(String collectStatMode) {
                this.collectStatMode = collectStatMode;
                return this;
            }

            /**
             * The details of the task.
             */
            public Builder detail(String detail) {
                this.detail = detail;
                return this;
            }

            /**
             * The end time of the task.
             * <p>
             * 
             * This value is a UNIX timestamp representing the number of milliseconds that have elapsed since the epoch time January 1, 1970, 00:00:00 UTC. Unit: milliseconds.
             */
            public Builder endTime(String endTime) {
                this.endTime = endTime;
                return this;
            }

            /**
             * The status of the task.
             * <p>
             * 
             * *   **Success**: The task is successful.
             * *   **Failed**: The task failed.
             * *   **Running**: The task is in the phase in which data is being migrated to a new instance.
             */
            public Builder result(String result) {
                this.result = result;
                return this;
            }

            /**
             * The ID of the original instance.
             */
            public Builder sourceInsName(String sourceInsName) {
                this.sourceInsName = sourceInsName;
                return this;
            }

            /**
             * The major engine version of the original instance.
             */
            public Builder sourceMajorVersion(String sourceMajorVersion) {
                this.sourceMajorVersion = sourceMajorVersion;
                return this;
            }

            /**
             * The start time of the task.
             * <p>
             * 
             * This value is a UNIX timestamp representing the number of milliseconds that have elapsed since the epoch time January 1, 1970, 00:00:00 UTC. Unit: milliseconds.
             */
            public Builder startTime(String startTime) {
                this.startTime = startTime;
                return this;
            }

            /**
             * The time at which your workloads are switched over from the original instance to the new instance.
             * <p>
             * 
             * This value is a UNIX timestamp representing the number of milliseconds that have elapsed since the epoch time January 1, 1970, 00:00:00 UTC. Unit: milliseconds.
             */
            public Builder switchTime(String switchTime) {
                this.switchTime = switchTime;
                return this;
            }

            /**
             * The ID of the new instance.
             */
            public Builder targetInsName(String targetInsName) {
                this.targetInsName = targetInsName;
                return this;
            }

            /**
             * The major engine version of the new instance. Valid values:
             * <p>
             * 
             * *   **10.0**
             * *   **11.0**
             * *   **12.0**
             * *   **13.0**
             * *   **14.0**
             * *   **15.0**
             */
            public Builder targetMajorVersion(String targetMajorVersion) {
                this.targetMajorVersion = targetMajorVersion;
                return this;
            }

            /**
             * The task ID.
             */
            public Builder taskId(Integer taskId) {
                this.taskId = taskId;
                return this;
            }

            /**
             * The upgrade mode.
             * <p>
             * 
             * Valid values:
             * 
             * *   **clone**: The system does not migrate data to the new instance and does not switch your workloads over to the new instance.
             * *   **switch**: The system migrates data to the new instance and switches your workloads over to the new instance.
             */
            public Builder upgradeMode(String upgradeMode) {
                this.upgradeMode = upgradeMode;
                return this;
            }

            public Items build() {
                return new Items(this);
            } 

        } 

    }
}
