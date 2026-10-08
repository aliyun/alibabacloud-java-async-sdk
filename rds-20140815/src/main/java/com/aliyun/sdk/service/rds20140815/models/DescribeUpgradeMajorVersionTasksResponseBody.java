// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.rds20140815.models;

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
 * {@link DescribeUpgradeMajorVersionTasksResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeUpgradeMajorVersionTasksResponseBody</p>
 */
public class DescribeUpgradeMajorVersionTasksResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Items")
    private java.util.List<Items> items;

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

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return items
     */
    public java.util.List<Items> getItems() {
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
        private java.util.List<Items> items; 
        private Integer pageNumber; 
        private Integer pageRecordCount; 
        private String requestId; 
        private Integer totalRecordCount; 

        private Builder() {
        } 

        private Builder(DescribeUpgradeMajorVersionTasksResponseBody model) {
            this.items = model.items;
            this.pageNumber = model.pageNumber;
            this.pageRecordCount = model.pageRecordCount;
            this.requestId = model.requestId;
            this.totalRecordCount = model.totalRecordCount;
        } 

        /**
         * <p>The list of major engine version upgrade tasks.</p>
         */
        public Builder items(java.util.List<Items> items) {
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
         * <p>The total number of entries.</p>
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

        @com.aliyun.core.annotation.NameInMap("SwitchEndTime")
        private String switchEndTime;

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

        @com.aliyun.core.annotation.NameInMap("cutOver")
        private Boolean cutOver;

        @com.aliyun.core.annotation.NameInMap("totalLogicRepDelayTime")
        private Integer totalLogicRepDelayTime;

        @com.aliyun.core.annotation.NameInMap("totalLogicRepLatencyMB")
        private Integer totalLogicRepLatencyMB;

        @com.aliyun.core.annotation.NameInMap("zeroDownTimeConnectionString")
        private String zeroDownTimeConnectionString;

        @com.aliyun.core.annotation.NameInMap("zeroDownTimePort")
        private Integer zeroDownTimePort;

        private Items(Builder builder) {
            this.collectStatMode = builder.collectStatMode;
            this.detail = builder.detail;
            this.endTime = builder.endTime;
            this.result = builder.result;
            this.sourceInsName = builder.sourceInsName;
            this.sourceMajorVersion = builder.sourceMajorVersion;
            this.startTime = builder.startTime;
            this.switchEndTime = builder.switchEndTime;
            this.switchTime = builder.switchTime;
            this.targetInsName = builder.targetInsName;
            this.targetMajorVersion = builder.targetMajorVersion;
            this.taskId = builder.taskId;
            this.upgradeMode = builder.upgradeMode;
            this.cutOver = builder.cutOver;
            this.totalLogicRepDelayTime = builder.totalLogicRepDelayTime;
            this.totalLogicRepLatencyMB = builder.totalLogicRepLatencyMB;
            this.zeroDownTimeConnectionString = builder.zeroDownTimeConnectionString;
            this.zeroDownTimePort = builder.zeroDownTimePort;
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
         * @return switchEndTime
         */
        public String getSwitchEndTime() {
            return this.switchEndTime;
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

        /**
         * @return cutOver
         */
        public Boolean getCutOver() {
            return this.cutOver;
        }

        /**
         * @return totalLogicRepDelayTime
         */
        public Integer getTotalLogicRepDelayTime() {
            return this.totalLogicRepDelayTime;
        }

        /**
         * @return totalLogicRepLatencyMB
         */
        public Integer getTotalLogicRepLatencyMB() {
            return this.totalLogicRepLatencyMB;
        }

        /**
         * @return zeroDownTimeConnectionString
         */
        public String getZeroDownTimeConnectionString() {
            return this.zeroDownTimeConnectionString;
        }

        /**
         * @return zeroDownTimePort
         */
        public Integer getZeroDownTimePort() {
            return this.zeroDownTimePort;
        }

        public static final class Builder {
            private String collectStatMode; 
            private String detail; 
            private String endTime; 
            private String result; 
            private String sourceInsName; 
            private String sourceMajorVersion; 
            private String startTime; 
            private String switchEndTime; 
            private String switchTime; 
            private String targetInsName; 
            private String targetMajorVersion; 
            private Integer taskId; 
            private String upgradeMode; 
            private Boolean cutOver; 
            private Integer totalLogicRepDelayTime; 
            private Integer totalLogicRepLatencyMB; 
            private String zeroDownTimeConnectionString; 
            private Integer zeroDownTimePort; 

            private Builder() {
            } 

            private Builder(Items model) {
                this.collectStatMode = model.collectStatMode;
                this.detail = model.detail;
                this.endTime = model.endTime;
                this.result = model.result;
                this.sourceInsName = model.sourceInsName;
                this.sourceMajorVersion = model.sourceMajorVersion;
                this.startTime = model.startTime;
                this.switchEndTime = model.switchEndTime;
                this.switchTime = model.switchTime;
                this.targetInsName = model.targetInsName;
                this.targetMajorVersion = model.targetMajorVersion;
                this.taskId = model.taskId;
                this.upgradeMode = model.upgradeMode;
                this.cutOver = model.cutOver;
                this.totalLogicRepDelayTime = model.totalLogicRepDelayTime;
                this.totalLogicRepLatencyMB = model.totalLogicRepLatencyMB;
                this.zeroDownTimeConnectionString = model.zeroDownTimeConnectionString;
                this.zeroDownTimePort = model.zeroDownTimePort;
            } 

            /**
             * <p>The statistics information collection pattern.</p>
             * <p>Valid values:</p>
             * <ul>
             * <li><strong>After</strong>: Upgrade after the cutover.</li>
             * <li><strong>Before</strong>: Upgrade before the cutover.</li>
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
             * <p>The detailed information about the task.</p>
             * 
             * <strong>example:</strong>
             * <p>2021-10-27 15:03:05 --- do upgrade precheck on slave succcess.\n2021-10-27 15:03:11 --- begin to upgrade major version, source instance will locked in readonly mode.\n2021-10-27 15:03:21 --- upgrade master success.\n2021-10-27 15:06:10 --- exchange source and target instance dns success.\n</p>
             */
            public Builder detail(String detail) {
                this.detail = detail;
                return this;
            }

            /**
             * <p>The end time of the major engine version upgrade.</p>
             * <p>The value is a UNIX timestamp. Unit: milliseconds.</p>
             * 
             * <strong>example:</strong>
             * <p>1614237779000</p>
             */
            public Builder endTime(String endTime) {
                this.endTime = endTime;
                return this;
            }

            /**
             * <p>The final result of the task. Valid values:</p>
             * <ul>
             * <li><strong>Success</strong>: The task is successful.</li>
             * <li><strong>Failed</strong>: The task failed.</li>
             * <li><strong>Running</strong>: The migration is in progress.</li>
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
             * <p>The ID of the original instance before the upgrade.</p>
             * 
             * <strong>example:</strong>
             * <p>pgm-bp1i3kkq7321****</p>
             */
            public Builder sourceInsName(String sourceInsName) {
                this.sourceInsName = sourceInsName;
                return this;
            }

            /**
             * <p>The version of the original instance before the upgrade.</p>
             * 
             * <strong>example:</strong>
             * <p>11.0</p>
             */
            public Builder sourceMajorVersion(String sourceMajorVersion) {
                this.sourceMajorVersion = sourceMajorVersion;
                return this;
            }

            /**
             * <p>The start time of the major engine version upgrade.</p>
             * <p>The value is a UNIX timestamp. Unit: milliseconds.</p>
             * 
             * <strong>example:</strong>
             * <p>1614236007000</p>
             */
            public Builder startTime(String startTime) {
                this.startTime = startTime;
                return this;
            }

            /**
             * <p>The end time of the instance switchover from the original instance to the new instance.</p>
             * <p>The value is a UNIX timestamp. Unit: milliseconds.</p>
             * 
             * <strong>example:</strong>
             * <p>1714237539000</p>
             */
            public Builder switchEndTime(String switchEndTime) {
                this.switchEndTime = switchEndTime;
                return this;
            }

            /**
             * <p>The time of the instance switchover from the original instance to the new instance.</p>
             * <p>The value is a UNIX timestamp. Unit: milliseconds.</p>
             * 
             * <strong>example:</strong>
             * <p>1614237539000</p>
             */
            public Builder switchTime(String switchTime) {
                this.switchTime = switchTime;
                return this;
            }

            /**
             * <p>The ID of the new instance after the upgrade.</p>
             * 
             * <strong>example:</strong>
             * <p>pgm-bp1c0v6d8092****</p>
             */
            public Builder targetInsName(String targetInsName) {
                this.targetInsName = targetInsName;
                return this;
            }

            /**
             * <p>The major engine version after the upgrade. Valid values:</p>
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
             * <li><strong>clone</strong>: no cutover</li>
             * <li><strong>switch</strong>: cutover</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>switch</p>
             */
            public Builder upgradeMode(String upgradeMode) {
                this.upgradeMode = upgradeMode;
                return this;
            }

            /**
             * <p>Indicates whether a cutover is performed.</p>
             * <ul>
             * <li><strong>true</strong>: A cutover is performed.</li>
             * <li><strong>false</strong>: No cutover is performed.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder cutOver(Boolean cutOver) {
                this.cutOver = cutOver;
                return this;
            }

            /**
             * <p>The estimated synchronization time for the logical replication lag. Unit: seconds.</p>
             * <blockquote>
             * <p>This parameter is used only for <strong>zero-downtime</strong> major engine version upgrades.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>10</p>
             */
            public Builder totalLogicRepDelayTime(Integer totalLogicRepDelayTime) {
                this.totalLogicRepDelayTime = totalLogicRepDelayTime;
                return this;
            }

            /**
             * <p>The size of the logical replication lag. Unit: MB.</p>
             * <blockquote>
             * <p>This parameter is used only for <strong>zero-downtime</strong> major engine version upgrades.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder totalLogicRepLatencyMB(Integer totalLogicRepLatencyMB) {
                this.totalLogicRepLatencyMB = totalLogicRepLatencyMB;
                return this;
            }

            /**
             * <p>The temporary internal endpoint of the higher-version instance for the zero-downtime major engine version upgrade. The format is <code>****.pg.rds.aliyuncs.com</code>.</p>
             * <blockquote>
             * <p>This parameter is used only for <strong>zero-downtime</strong> major engine version upgrades.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>****.pg.rds.aliyuncs.com</p>
             */
            public Builder zeroDownTimeConnectionString(String zeroDownTimeConnectionString) {
                this.zeroDownTimeConnectionString = zeroDownTimeConnectionString;
                return this;
            }

            /**
             * <p>The port of the higher-version instance, which is the same as the port of the source instance.</p>
             * <blockquote>
             * <p>This parameter is used only for <strong>zero-downtime</strong> major engine version upgrades.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>5432</p>
             */
            public Builder zeroDownTimePort(Integer zeroDownTimePort) {
                this.zeroDownTimePort = zeroDownTimePort;
                return this;
            }

            public Items build() {
                return new Items(this);
            } 

        } 

    }
}
