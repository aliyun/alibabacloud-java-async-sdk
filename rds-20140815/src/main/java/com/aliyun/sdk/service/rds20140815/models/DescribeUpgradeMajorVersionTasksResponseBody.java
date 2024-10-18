// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.rds20140815.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DescribeUpgradeMajorVersionTasksResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeUpgradeMajorVersionTasksResponseBody</p>
 */
public class DescribeUpgradeMajorVersionTasksResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Items")
    private java.util.List < Items> items;

    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Integer pageNumber;

    @com.aliyun.core.annotation.NameInMap("PageRecordCount")
    private Integer pageRecordCount;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalRecordCount")
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
         * <p>The tasks for major engine version upgrades.</p>
         */
        public Builder items(java.util.List < Items> items) {
            this.items = items;
            return this;
        }

        /**
         * <p>The page number.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder pageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * <p>The number of entries per page.</p>
         * 
         * <strong>example:</strong>
         * <p>30</p>
         */
        public Builder pageRecordCount(Integer pageRecordCount) {
            this.pageRecordCount = pageRecordCount;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>152E0C6D-B9C3-4468-9F2C-FEF9D9E8417B</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The total number of entries returned.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder totalRecordCount(Integer totalRecordCount) {
            this.totalRecordCount = totalRecordCount;
            return this;
        }

        public DescribeUpgradeMajorVersionTasksResponseBody build() {
            return new DescribeUpgradeMajorVersionTasksResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeUpgradeMajorVersionTasksResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeUpgradeMajorVersionTasksResponseBody</p>
     */
    public static class Items extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CollectStatMode")
        private String collectStatMode;

        @com.aliyun.core.annotation.NameInMap("Detail")
        private String detail;

        @com.aliyun.core.annotation.NameInMap("EndTime")
        private String endTime;

        @com.aliyun.core.annotation.NameInMap("Result")
        private String result;

        @com.aliyun.core.annotation.NameInMap("SourceInsName")
        private String sourceInsName;

        @com.aliyun.core.annotation.NameInMap("SourceMajorVersion")
        private String sourceMajorVersion;

        @com.aliyun.core.annotation.NameInMap("StartTime")
        private String startTime;

        @com.aliyun.core.annotation.NameInMap("SwitchTime")
        private String switchTime;

        @com.aliyun.core.annotation.NameInMap("TargetInsName")
        private String targetInsName;

        @com.aliyun.core.annotation.NameInMap("TargetMajorVersion")
        private String targetMajorVersion;

        @com.aliyun.core.annotation.NameInMap("TaskId")
        private Integer taskId;

        @com.aliyun.core.annotation.NameInMap("UpgradeMode")
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
             * <p>The time when the system collects the statistics.</p>
             * <p>Valid values:</p>
             * <ul>
             * <li><strong>After</strong>: The system collects the statistics after a switchover.</li>
             * <li><strong>Before</strong>: The system collects the statistics before a switchover.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>After</p>
             */
            public Builder collectStatMode(String collectStatMode) {
                this.collectStatMode = collectStatMode;
                return this;
            }

            /**
             * <p>The details of the task.</p>
             * 
             * <strong>example:</strong>
             * <p>2021-10-27 15:03:05 --- do upgrade precheck on slave succcess.\n2021-10-27 15:03:11 --- begin to upgrade major version, source instance will locked in readonly mode.\n2021-10-27 15:03:21 --- upgrade master success.\n2021-10-27 15:06:10 --- exchange source and target instance dns success.\n</p>
             */
            public Builder detail(String detail) {
                this.detail = detail;
                return this;
            }

            /**
             * <p>The end time of the task.</p>
             * <p>This value is a UNIX timestamp representing the number of milliseconds that have elapsed since the epoch time January 1, 1970, 00:00:00 UTC. Unit: milliseconds.</p>
             * 
             * <strong>example:</strong>
             * <p>1614237779000</p>
             */
            public Builder endTime(String endTime) {
                this.endTime = endTime;
                return this;
            }

            /**
             * <p>The status of the task.</p>
             * <ul>
             * <li><strong>Success</strong>: The task is successful.</li>
             * <li><strong>Failed</strong>: The task failed.</li>
             * <li><strong>Running</strong>: The task is in the phase in which data is being migrated to a new instance.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Success</p>
             */
            public Builder result(String result) {
                this.result = result;
                return this;
            }

            /**
             * <p>The ID of the original instance.</p>
             * 
             * <strong>example:</strong>
             * <p>pgm-bp1i3kkq7321****</p>
             */
            public Builder sourceInsName(String sourceInsName) {
                this.sourceInsName = sourceInsName;
                return this;
            }

            /**
             * <p>The major engine version of the original instance.</p>
             * 
             * <strong>example:</strong>
             * <p>11.0</p>
             */
            public Builder sourceMajorVersion(String sourceMajorVersion) {
                this.sourceMajorVersion = sourceMajorVersion;
                return this;
            }

            /**
             * <p>The start time of the task.</p>
             * <p>This value is a UNIX timestamp representing the number of milliseconds that have elapsed since the epoch time January 1, 1970, 00:00:00 UTC. Unit: milliseconds.</p>
             * 
             * <strong>example:</strong>
             * <p>1614236007000</p>
             */
            public Builder startTime(String startTime) {
                this.startTime = startTime;
                return this;
            }

            /**
             * <p>The time at which your workloads are switched over from the original instance to the new instance.</p>
             * <p>This value is a UNIX timestamp representing the number of milliseconds that have elapsed since the epoch time January 1, 1970, 00:00:00 UTC. Unit: milliseconds.</p>
             * 
             * <strong>example:</strong>
             * <p>1614237539000</p>
             */
            public Builder switchTime(String switchTime) {
                this.switchTime = switchTime;
                return this;
            }

            /**
             * <p>The ID of the new instance.</p>
             * 
             * <strong>example:</strong>
             * <p>pgm-bp1c0v6d8092****</p>
             */
            public Builder targetInsName(String targetInsName) {
                this.targetInsName = targetInsName;
                return this;
            }

            /**
             * <p>The major engine version of the new instance. Valid values:</p>
             * <ul>
             * <li><strong>10.0</strong></li>
             * <li><strong>11.0</strong></li>
             * <li><strong>12.0</strong></li>
             * <li><strong>13.0</strong></li>
             * <li><strong>14.0</strong></li>
             * <li><strong>15.0</strong></li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>12.0</p>
             */
            public Builder targetMajorVersion(String targetMajorVersion) {
                this.targetMajorVersion = targetMajorVersion;
                return this;
            }

            /**
             * <p>The task ID.</p>
             * 
             * <strong>example:</strong>
             * <p>342900000</p>
             */
            public Builder taskId(Integer taskId) {
                this.taskId = taskId;
                return this;
            }

            /**
             * <p>The upgrade mode.</p>
             * <p>Valid values:</p>
             * <ul>
             * <li><strong>clone</strong>: The system does not migrate data to the new instance and does not switch your workloads over to the new instance.</li>
             * <li><strong>switch</strong>: The system migrates data to the new instance and switches your workloads over to the new instance.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>switch</p>
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
