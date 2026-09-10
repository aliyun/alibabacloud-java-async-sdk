// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.polardb20170801.models;

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
 * {@link DescribeCronJobPolicyServerlessResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeCronJobPolicyServerlessResponseBody</p>
 */
public class DescribeCronJobPolicyServerlessResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Items")
    private java.util.List<Items> items;

    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Integer pageNumber;

    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalRecordCount")
    private Integer totalRecordCount;

    private DescribeCronJobPolicyServerlessResponseBody(Builder builder) {
        this.items = builder.items;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.totalRecordCount = builder.totalRecordCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeCronJobPolicyServerlessResponseBody create() {
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
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
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
        private Integer pageSize; 
        private String requestId; 
        private Integer totalRecordCount; 

        private Builder() {
        } 

        private Builder(DescribeCronJobPolicyServerlessResponseBody model) {
            this.items = model.items;
            this.pageNumber = model.pageNumber;
            this.pageSize = model.pageSize;
            this.requestId = model.requestId;
            this.totalRecordCount = model.totalRecordCount;
        } 

        /**
         * <p>The list of tasks.</p>
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
         * <p>The number of records on each page. Valid values:</p>
         * <ul>
         * <li><p><strong>30</strong></p>
         * </li>
         * <li><p><strong>50</strong></p>
         * </li>
         * <li><p><strong>100</strong></p>
         * </li>
         * </ul>
         * <p>Default value: <strong>30</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>30</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>9B7BFB11-C077-4FE3-B051-F69CEB******</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The total number of records.</p>
         * 
         * <strong>example:</strong>
         * <p>5</p>
         */
        public Builder totalRecordCount(Integer totalRecordCount) {
            this.totalRecordCount = totalRecordCount;
            return this;
        }

        public DescribeCronJobPolicyServerlessResponseBody build() {
            return new DescribeCronJobPolicyServerlessResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeCronJobPolicyServerlessResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeCronJobPolicyServerlessResponseBody</p>
     */
    public static class Items extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Action")
        private String action;

        @com.aliyun.core.annotation.NameInMap("AllowShutDown")
        private String allowShutDown;

        @com.aliyun.core.annotation.NameInMap("CronExpression")
        private String cronExpression;

        @com.aliyun.core.annotation.NameInMap("DBClusterId")
        private String DBClusterId;

        @com.aliyun.core.annotation.NameInMap("EndTime")
        private String endTime;

        @com.aliyun.core.annotation.NameInMap("JobId")
        private String jobId;

        @com.aliyun.core.annotation.NameInMap("OrderId")
        private String orderId;

        @com.aliyun.core.annotation.NameInMap("RegionId")
        private String regionId;

        @com.aliyun.core.annotation.NameInMap("ScaleApRoNumMax")
        private String scaleApRoNumMax;

        @com.aliyun.core.annotation.NameInMap("ScaleApRoNumMin")
        private String scaleApRoNumMin;

        @com.aliyun.core.annotation.NameInMap("ScaleMax")
        private String scaleMax;

        @com.aliyun.core.annotation.NameInMap("ScaleMin")
        private String scaleMin;

        @com.aliyun.core.annotation.NameInMap("ScaleRoNumMax")
        private String scaleRoNumMax;

        @com.aliyun.core.annotation.NameInMap("ScaleRoNumMin")
        private String scaleRoNumMin;

        @com.aliyun.core.annotation.NameInMap("SecondsUntilAutoPause")
        private String secondsUntilAutoPause;

        @com.aliyun.core.annotation.NameInMap("ServerlessRuleCpuEnlargeThreshold")
        private String serverlessRuleCpuEnlargeThreshold;

        @com.aliyun.core.annotation.NameInMap("ServerlessRuleCpuShrinkThreshold")
        private String serverlessRuleCpuShrinkThreshold;

        @com.aliyun.core.annotation.NameInMap("ServerlessRuleMode")
        private String serverlessRuleMode;

        @com.aliyun.core.annotation.NameInMap("StartTime")
        private String startTime;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        private Items(Builder builder) {
            this.action = builder.action;
            this.allowShutDown = builder.allowShutDown;
            this.cronExpression = builder.cronExpression;
            this.DBClusterId = builder.DBClusterId;
            this.endTime = builder.endTime;
            this.jobId = builder.jobId;
            this.orderId = builder.orderId;
            this.regionId = builder.regionId;
            this.scaleApRoNumMax = builder.scaleApRoNumMax;
            this.scaleApRoNumMin = builder.scaleApRoNumMin;
            this.scaleMax = builder.scaleMax;
            this.scaleMin = builder.scaleMin;
            this.scaleRoNumMax = builder.scaleRoNumMax;
            this.scaleRoNumMin = builder.scaleRoNumMin;
            this.secondsUntilAutoPause = builder.secondsUntilAutoPause;
            this.serverlessRuleCpuEnlargeThreshold = builder.serverlessRuleCpuEnlargeThreshold;
            this.serverlessRuleCpuShrinkThreshold = builder.serverlessRuleCpuShrinkThreshold;
            this.serverlessRuleMode = builder.serverlessRuleMode;
            this.startTime = builder.startTime;
            this.status = builder.status;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Items create() {
            return builder().build();
        }

        /**
         * @return action
         */
        public String getAction() {
            return this.action;
        }

        /**
         * @return allowShutDown
         */
        public String getAllowShutDown() {
            return this.allowShutDown;
        }

        /**
         * @return cronExpression
         */
        public String getCronExpression() {
            return this.cronExpression;
        }

        /**
         * @return DBClusterId
         */
        public String getDBClusterId() {
            return this.DBClusterId;
        }

        /**
         * @return endTime
         */
        public String getEndTime() {
            return this.endTime;
        }

        /**
         * @return jobId
         */
        public String getJobId() {
            return this.jobId;
        }

        /**
         * @return orderId
         */
        public String getOrderId() {
            return this.orderId;
        }

        /**
         * @return regionId
         */
        public String getRegionId() {
            return this.regionId;
        }

        /**
         * @return scaleApRoNumMax
         */
        public String getScaleApRoNumMax() {
            return this.scaleApRoNumMax;
        }

        /**
         * @return scaleApRoNumMin
         */
        public String getScaleApRoNumMin() {
            return this.scaleApRoNumMin;
        }

        /**
         * @return scaleMax
         */
        public String getScaleMax() {
            return this.scaleMax;
        }

        /**
         * @return scaleMin
         */
        public String getScaleMin() {
            return this.scaleMin;
        }

        /**
         * @return scaleRoNumMax
         */
        public String getScaleRoNumMax() {
            return this.scaleRoNumMax;
        }

        /**
         * @return scaleRoNumMin
         */
        public String getScaleRoNumMin() {
            return this.scaleRoNumMin;
        }

        /**
         * @return secondsUntilAutoPause
         */
        public String getSecondsUntilAutoPause() {
            return this.secondsUntilAutoPause;
        }

        /**
         * @return serverlessRuleCpuEnlargeThreshold
         */
        public String getServerlessRuleCpuEnlargeThreshold() {
            return this.serverlessRuleCpuEnlargeThreshold;
        }

        /**
         * @return serverlessRuleCpuShrinkThreshold
         */
        public String getServerlessRuleCpuShrinkThreshold() {
            return this.serverlessRuleCpuShrinkThreshold;
        }

        /**
         * @return serverlessRuleMode
         */
        public String getServerlessRuleMode() {
            return this.serverlessRuleMode;
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

        public static final class Builder {
            private String action; 
            private String allowShutDown; 
            private String cronExpression; 
            private String DBClusterId; 
            private String endTime; 
            private String jobId; 
            private String orderId; 
            private String regionId; 
            private String scaleApRoNumMax; 
            private String scaleApRoNumMin; 
            private String scaleMax; 
            private String scaleMin; 
            private String scaleRoNumMax; 
            private String scaleRoNumMin; 
            private String secondsUntilAutoPause; 
            private String serverlessRuleCpuEnlargeThreshold; 
            private String serverlessRuleCpuShrinkThreshold; 
            private String serverlessRuleMode; 
            private String startTime; 
            private String status; 

            private Builder() {
            } 

            private Builder(Items model) {
                this.action = model.action;
                this.allowShutDown = model.allowShutDown;
                this.cronExpression = model.cronExpression;
                this.DBClusterId = model.DBClusterId;
                this.endTime = model.endTime;
                this.jobId = model.jobId;
                this.orderId = model.orderId;
                this.regionId = model.regionId;
                this.scaleApRoNumMax = model.scaleApRoNumMax;
                this.scaleApRoNumMin = model.scaleApRoNumMin;
                this.scaleMax = model.scaleMax;
                this.scaleMin = model.scaleMin;
                this.scaleRoNumMax = model.scaleRoNumMax;
                this.scaleRoNumMin = model.scaleRoNumMin;
                this.secondsUntilAutoPause = model.secondsUntilAutoPause;
                this.serverlessRuleCpuEnlargeThreshold = model.serverlessRuleCpuEnlargeThreshold;
                this.serverlessRuleCpuShrinkThreshold = model.serverlessRuleCpuShrinkThreshold;
                this.serverlessRuleMode = model.serverlessRuleMode;
                this.startTime = model.startTime;
                this.status = model.status;
            } 

            /**
             * <p>A system parameter. Set the value to <strong>ModifyDBClusterServerlessConf</strong>.</p>
             * 
             * <strong>example:</strong>
             * <p>ModifyDBClusterServerlessConf</p>
             */
            public Builder action(String action) {
                this.action = action;
                return this;
            }

            /**
             * <p>Specifies whether to enable No-activity Suspension. Valid values:</p>
             * <ul>
             * <li><p><strong>true</strong>: enabled</p>
             * </li>
             * <li><p><strong>false</strong>: disabled (default)</p>
             * </li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder allowShutDown(String allowShutDown) {
                this.allowShutDown = allowShutDown;
                return this;
            }

            /**
             * <p>The Cron expression for the scheduled task.</p>
             * 
             * <strong>example:</strong>
             * <p>0 0 8 * * ?</p>
             */
            public Builder cronExpression(String cronExpression) {
                this.cronExpression = cronExpression;
                return this;
            }

            /**
             * <p>The cluster ID.</p>
             * 
             * <strong>example:</strong>
             * <p>pc-*****************</p>
             */
            public Builder DBClusterId(String DBClusterId) {
                this.DBClusterId = DBClusterId;
                return this;
            }

            /**
             * <p>The end time of the task. The time is in the yyyy-MM-ddTHH:mm:ssZ format and in UTC.</p>
             * 
             * <strong>example:</strong>
             * <p>2024-12-04T02:25:00Z</p>
             */
            public Builder endTime(String endTime) {
                this.endTime = endTime;
                return this;
            }

            /**
             * <p>The ID of the scheduled task.</p>
             * 
             * <strong>example:</strong>
             * <p>12eee3eb-60bd-40ac-a403-218e02eb99c7</p>
             */
            public Builder jobId(String jobId) {
                this.jobId = jobId;
                return this;
            }

            /**
             * <p>The order ID.</p>
             * 
             * <strong>example:</strong>
             * <p>254752088000354</p>
             */
            public Builder orderId(String orderId) {
                this.orderId = orderId;
                return this;
            }

            /**
             * <p>The region ID.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-hangzhou</p>
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            /**
             * <p>The maximum number of read-only IMCI nodes. Valid values: 1 to 15.</p>
             * 
             * <strong>example:</strong>
             * <p>2</p>
             */
            public Builder scaleApRoNumMax(String scaleApRoNumMax) {
                this.scaleApRoNumMax = scaleApRoNumMax;
                return this;
            }

            /**
             * <p>The minimum number of read-only IMCI nodes. Valid values: 0 to 15.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder scaleApRoNumMin(String scaleApRoNumMin) {
                this.scaleApRoNumMin = scaleApRoNumMin;
                return this;
            }

            /**
             * <p>The maximum capacity. The value must be from 1 to 32. Unit: PCU.</p>
             * 
             * <strong>example:</strong>
             * <p>9</p>
             */
            public Builder scaleMax(String scaleMax) {
                this.scaleMax = scaleMax;
                return this;
            }

            /**
             * <p>The minimum capacity. The value must be from 0.25 to 32 and less than or equal to the maximum capacity. Unit: PolarDB Capacity Unit (PCU).</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder scaleMin(String scaleMin) {
                this.scaleMin = scaleMin;
                return this;
            }

            /**
             * <p>The maximum number of read-only nodes. The value must be greater than or equal to the minimum value. Valid values: 0 to 15.</p>
             * 
             * <strong>example:</strong>
             * <p>3</p>
             */
            public Builder scaleRoNumMax(String scaleRoNumMax) {
                this.scaleRoNumMax = scaleRoNumMax;
                return this;
            }

            /**
             * <p>The minimum number of read-only nodes. Valid values: 0 to 15.</p>
             * 
             * <strong>example:</strong>
             * <p>2</p>
             */
            public Builder scaleRoNumMin(String scaleRoNumMin) {
                this.scaleRoNumMin = scaleRoNumMin;
                return this;
            }

            /**
             * <p>The detection period for No-activity Suspension. The value must be a multiple of 5. Valid values: 5 to 1440. Unit: minutes.</p>
             * 
             * <strong>example:</strong>
             * <p>1200</p>
             */
            public Builder secondsUntilAutoPause(String secondsUntilAutoPause) {
                this.secondsUntilAutoPause = secondsUntilAutoPause;
                return this;
            }

            /**
             * <p>The CPU utilization threshold for scaling up. Valid values: 40 to 100. Unit: %.</p>
             * 
             * <strong>example:</strong>
             * <p>70</p>
             */
            public Builder serverlessRuleCpuEnlargeThreshold(String serverlessRuleCpuEnlargeThreshold) {
                this.serverlessRuleCpuEnlargeThreshold = serverlessRuleCpuEnlargeThreshold;
                return this;
            }

            /**
             * <p>The CPU utilization threshold for scaling down. Valid values: 10 to 100. Unit: %. The difference between the scale-up threshold and the scale-down threshold must be 30 or greater.</p>
             * 
             * <strong>example:</strong>
             * <p>40</p>
             */
            public Builder serverlessRuleCpuShrinkThreshold(String serverlessRuleCpuShrinkThreshold) {
                this.serverlessRuleCpuShrinkThreshold = serverlessRuleCpuShrinkThreshold;
                return this;
            }

            /**
             * <p>The elasticity sensitivity. Valid values:</p>
             * <ul>
             * <li><p>normal: standard</p>
             * </li>
             * <li><p>flexible: sensitive</p>
             * </li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>normal</p>
             */
            public Builder serverlessRuleMode(String serverlessRuleMode) {
                this.serverlessRuleMode = serverlessRuleMode;
                return this;
            }

            /**
             * <p>The start time of the task. The time is in the <code>yyyy-MM-ddTHH:mmZ</code> format and in UTC.</p>
             * 
             * <strong>example:</strong>
             * <p>2020-06-09T18:00:00Z</p>
             */
            public Builder startTime(String startTime) {
                this.startTime = startTime;
                return this;
            }

            /**
             * <p>The status of the task. Valid values:</p>
             * <ul>
             * <li><p><strong>working</strong>: The scheduled task is running.</p>
             * </li>
             * <li><p><strong>finish</strong>: The scheduled task is complete.</p>
             * </li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>3</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            public Items build() {
                return new Items(this);
            } 

        } 

    }
}
