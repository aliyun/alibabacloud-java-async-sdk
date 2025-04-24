// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.appstream_center20210901.models;

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
 * {@link ListAppInstanceGroupResponseBody} extends {@link TeaModel}
 *
 * <p>ListAppInstanceGroupResponseBody</p>
 */
public class ListAppInstanceGroupResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("AppInstanceGroupModels")
    private java.util.List<AppInstanceGroupModels> appInstanceGroupModels;

    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Integer pageNumber;

    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Integer totalCount;

    private ListAppInstanceGroupResponseBody(Builder builder) {
        this.appInstanceGroupModels = builder.appInstanceGroupModels;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListAppInstanceGroupResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return appInstanceGroupModels
     */
    public java.util.List<AppInstanceGroupModels> getAppInstanceGroupModels() {
        return this.appInstanceGroupModels;
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
     * @return totalCount
     */
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private java.util.List<AppInstanceGroupModels> appInstanceGroupModels; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String requestId; 
        private Integer totalCount; 

        private Builder() {
        } 

        private Builder(ListAppInstanceGroupResponseBody model) {
            this.appInstanceGroupModels = model.appInstanceGroupModels;
            this.pageNumber = model.pageNumber;
            this.pageSize = model.pageSize;
            this.requestId = model.requestId;
            this.totalCount = model.totalCount;
        } 

        /**
         * <p>The delivery groups.</p>
         */
        public Builder appInstanceGroupModels(java.util.List<AppInstanceGroupModels> appInstanceGroupModels) {
            this.appInstanceGroupModels = appInstanceGroupModels;
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
         * <p>10</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>1CBAFFAB-B697-4049-A9B1-67E1FC5F****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The total number of entries returned.</p>
         * 
         * <strong>example:</strong>
         * <p>15</p>
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public ListAppInstanceGroupResponseBody build() {
            return new ListAppInstanceGroupResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListAppInstanceGroupResponseBody} extends {@link TeaModel}
     *
     * <p>ListAppInstanceGroupResponseBody</p>
     */
    public static class Apps extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AppIcon")
        private String appIcon;

        @com.aliyun.core.annotation.NameInMap("AppId")
        private String appId;

        @com.aliyun.core.annotation.NameInMap("AppName")
        private String appName;

        @com.aliyun.core.annotation.NameInMap("AppVersion")
        private String appVersion;

        @com.aliyun.core.annotation.NameInMap("AppVersionName")
        private String appVersionName;

        private Apps(Builder builder) {
            this.appIcon = builder.appIcon;
            this.appId = builder.appId;
            this.appName = builder.appName;
            this.appVersion = builder.appVersion;
            this.appVersionName = builder.appVersionName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Apps create() {
            return builder().build();
        }

        /**
         * @return appIcon
         */
        public String getAppIcon() {
            return this.appIcon;
        }

        /**
         * @return appId
         */
        public String getAppId() {
            return this.appId;
        }

        /**
         * @return appName
         */
        public String getAppName() {
            return this.appName;
        }

        /**
         * @return appVersion
         */
        public String getAppVersion() {
            return this.appVersion;
        }

        /**
         * @return appVersionName
         */
        public String getAppVersionName() {
            return this.appVersionName;
        }

        public static final class Builder {
            private String appIcon; 
            private String appId; 
            private String appName; 
            private String appVersion; 
            private String appVersionName; 

            private Builder() {
            } 

            private Builder(Apps model) {
                this.appIcon = model.appIcon;
                this.appId = model.appId;
                this.appName = model.appName;
                this.appVersion = model.appVersion;
                this.appVersionName = model.appVersionName;
            } 

            /**
             * <p>The app icon.</p>
             * 
             * <strong>example:</strong>
             * <p><a href="https://app-center-icon-****.png">https://app-center-icon-****.png</a></p>
             */
            public Builder appIcon(String appIcon) {
                this.appIcon = appIcon;
                return this;
            }

            /**
             * <p>The app ID.</p>
             * 
             * <strong>example:</strong>
             * <p>ca-i87mycyn419nu****</p>
             */
            public Builder appId(String appId) {
                this.appId = appId;
                return this;
            }

            /**
             * <p>The app name.</p>
             */
            public Builder appName(String appName) {
                this.appName = appName;
                return this;
            }

            /**
             * <p>The app version.</p>
             * 
             * <strong>example:</strong>
             * <p>1.0.0</p>
             */
            public Builder appVersion(String appVersion) {
                this.appVersion = appVersion;
                return this;
            }

            /**
             * <p>The name of the app version.</p>
             */
            public Builder appVersionName(String appVersionName) {
                this.appVersionName = appVersionName;
                return this;
            }

            public Apps build() {
                return new Apps(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListAppInstanceGroupResponseBody} extends {@link TeaModel}
     *
     * <p>ListAppInstanceGroupResponseBody</p>
     */
    public static class TimerPeriods extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Amount")
        private Integer amount;

        @com.aliyun.core.annotation.NameInMap("EndTime")
        private String endTime;

        @com.aliyun.core.annotation.NameInMap("StartTime")
        private String startTime;

        private TimerPeriods(Builder builder) {
            this.amount = builder.amount;
            this.endTime = builder.endTime;
            this.startTime = builder.startTime;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TimerPeriods create() {
            return builder().build();
        }

        /**
         * @return amount
         */
        public Integer getAmount() {
            return this.amount;
        }

        /**
         * @return endTime
         */
        public String getEndTime() {
            return this.endTime;
        }

        /**
         * @return startTime
         */
        public String getStartTime() {
            return this.startTime;
        }

        public static final class Builder {
            private Integer amount; 
            private String endTime; 
            private String startTime; 

            private Builder() {
            } 

            private Builder(TimerPeriods model) {
                this.amount = model.amount;
                this.endTime = model.endTime;
                this.startTime = model.startTime;
            } 

            /**
             * <p>The number of destination resources.</p>
             * 
             * <strong>example:</strong>
             * <p>5</p>
             */
            public Builder amount(Integer amount) {
                this.amount = amount;
                return this;
            }

            /**
             * <p>The time when the scaling policy ends. Format: HH:mm.</p>
             * 
             * <strong>example:</strong>
             * <p>11:00</p>
             */
            public Builder endTime(String endTime) {
                this.endTime = endTime;
                return this;
            }

            /**
             * <p>The time when the scaling policy starts. Format: HH:mm.</p>
             * 
             * <strong>example:</strong>
             * <p>09:30</p>
             */
            public Builder startTime(String startTime) {
                this.startTime = startTime;
                return this;
            }

            public TimerPeriods build() {
                return new TimerPeriods(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListAppInstanceGroupResponseBody} extends {@link TeaModel}
     *
     * <p>ListAppInstanceGroupResponseBody</p>
     */
    public static class RecurrenceSchedules extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("RecurrenceType")
        private String recurrenceType;

        @com.aliyun.core.annotation.NameInMap("RecurrenceValues")
        private java.util.List<Integer> recurrenceValues;

        @com.aliyun.core.annotation.NameInMap("TimerPeriods")
        private java.util.List<TimerPeriods> timerPeriods;

        private RecurrenceSchedules(Builder builder) {
            this.recurrenceType = builder.recurrenceType;
            this.recurrenceValues = builder.recurrenceValues;
            this.timerPeriods = builder.timerPeriods;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static RecurrenceSchedules create() {
            return builder().build();
        }

        /**
         * @return recurrenceType
         */
        public String getRecurrenceType() {
            return this.recurrenceType;
        }

        /**
         * @return recurrenceValues
         */
        public java.util.List<Integer> getRecurrenceValues() {
            return this.recurrenceValues;
        }

        /**
         * @return timerPeriods
         */
        public java.util.List<TimerPeriods> getTimerPeriods() {
            return this.timerPeriods;
        }

        public static final class Builder {
            private String recurrenceType; 
            private java.util.List<Integer> recurrenceValues; 
            private java.util.List<TimerPeriods> timerPeriods; 

            private Builder() {
            } 

            private Builder(RecurrenceSchedules model) {
                this.recurrenceType = model.recurrenceType;
                this.recurrenceValues = model.recurrenceValues;
                this.timerPeriods = model.timerPeriods;
            } 

            /**
             * <p>The schedule type of the scaling policy. This parameter must be configured together with <code>RecurrenceValues</code>.``</p>
             * <p>Valid value:</p>
             * <ul>
             * <li>weekly: The scaling policy is executed on specific days each week.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Weekly</p>
             */
            public Builder recurrenceType(String recurrenceType) {
                this.recurrenceType = recurrenceType;
                return this;
            }

            /**
             * <p>The days of each week on which the scaling policy is executed.</p>
             */
            public Builder recurrenceValues(java.util.List<Integer> recurrenceValues) {
                this.recurrenceValues = recurrenceValues;
                return this;
            }

            /**
             * <p>The time periods during which the scaling policy can be executed.</p>
             */
            public Builder timerPeriods(java.util.List<TimerPeriods> timerPeriods) {
                this.timerPeriods = timerPeriods;
                return this;
            }

            public RecurrenceSchedules build() {
                return new RecurrenceSchedules(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListAppInstanceGroupResponseBody} extends {@link TeaModel}
     *
     * <p>ListAppInstanceGroupResponseBody</p>
     */
    public static class NodePool extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Amount")
        private Integer amount;

        @com.aliyun.core.annotation.NameInMap("MaxIdleAppInstanceAmount")
        private Integer maxIdleAppInstanceAmount;

        @com.aliyun.core.annotation.NameInMap("MaxScalingAmount")
        private Integer maxScalingAmount;

        @com.aliyun.core.annotation.NameInMap("NodeAmount")
        private Integer nodeAmount;

        @com.aliyun.core.annotation.NameInMap("NodeCapacity")
        private Integer nodeCapacity;

        @com.aliyun.core.annotation.NameInMap("NodeInstanceType")
        private String nodeInstanceType;

        @com.aliyun.core.annotation.NameInMap("NodePoolId")
        private String nodePoolId;

        @com.aliyun.core.annotation.NameInMap("NodeTypeName")
        private String nodeTypeName;

        @com.aliyun.core.annotation.NameInMap("NodeUsed")
        private Integer nodeUsed;

        @com.aliyun.core.annotation.NameInMap("RecurrenceSchedules")
        private java.util.List<RecurrenceSchedules> recurrenceSchedules;

        @com.aliyun.core.annotation.NameInMap("ScalingDownAfterIdleMinutes")
        private Integer scalingDownAfterIdleMinutes;

        @com.aliyun.core.annotation.NameInMap("ScalingNodeAmount")
        private Integer scalingNodeAmount;

        @com.aliyun.core.annotation.NameInMap("ScalingNodeUsed")
        private Integer scalingNodeUsed;

        @com.aliyun.core.annotation.NameInMap("ScalingStep")
        private Integer scalingStep;

        @com.aliyun.core.annotation.NameInMap("ScalingUsageThreshold")
        private String scalingUsageThreshold;

        @com.aliyun.core.annotation.NameInMap("StrategyDisableDate")
        private String strategyDisableDate;

        @com.aliyun.core.annotation.NameInMap("StrategyEnableDate")
        private String strategyEnableDate;

        @com.aliyun.core.annotation.NameInMap("StrategyType")
        private String strategyType;

        @com.aliyun.core.annotation.NameInMap("WarmUp")
        private Boolean warmUp;

        private NodePool(Builder builder) {
            this.amount = builder.amount;
            this.maxIdleAppInstanceAmount = builder.maxIdleAppInstanceAmount;
            this.maxScalingAmount = builder.maxScalingAmount;
            this.nodeAmount = builder.nodeAmount;
            this.nodeCapacity = builder.nodeCapacity;
            this.nodeInstanceType = builder.nodeInstanceType;
            this.nodePoolId = builder.nodePoolId;
            this.nodeTypeName = builder.nodeTypeName;
            this.nodeUsed = builder.nodeUsed;
            this.recurrenceSchedules = builder.recurrenceSchedules;
            this.scalingDownAfterIdleMinutes = builder.scalingDownAfterIdleMinutes;
            this.scalingNodeAmount = builder.scalingNodeAmount;
            this.scalingNodeUsed = builder.scalingNodeUsed;
            this.scalingStep = builder.scalingStep;
            this.scalingUsageThreshold = builder.scalingUsageThreshold;
            this.strategyDisableDate = builder.strategyDisableDate;
            this.strategyEnableDate = builder.strategyEnableDate;
            this.strategyType = builder.strategyType;
            this.warmUp = builder.warmUp;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static NodePool create() {
            return builder().build();
        }

        /**
         * @return amount
         */
        public Integer getAmount() {
            return this.amount;
        }

        /**
         * @return maxIdleAppInstanceAmount
         */
        public Integer getMaxIdleAppInstanceAmount() {
            return this.maxIdleAppInstanceAmount;
        }

        /**
         * @return maxScalingAmount
         */
        public Integer getMaxScalingAmount() {
            return this.maxScalingAmount;
        }

        /**
         * @return nodeAmount
         */
        public Integer getNodeAmount() {
            return this.nodeAmount;
        }

        /**
         * @return nodeCapacity
         */
        public Integer getNodeCapacity() {
            return this.nodeCapacity;
        }

        /**
         * @return nodeInstanceType
         */
        public String getNodeInstanceType() {
            return this.nodeInstanceType;
        }

        /**
         * @return nodePoolId
         */
        public String getNodePoolId() {
            return this.nodePoolId;
        }

        /**
         * @return nodeTypeName
         */
        public String getNodeTypeName() {
            return this.nodeTypeName;
        }

        /**
         * @return nodeUsed
         */
        public Integer getNodeUsed() {
            return this.nodeUsed;
        }

        /**
         * @return recurrenceSchedules
         */
        public java.util.List<RecurrenceSchedules> getRecurrenceSchedules() {
            return this.recurrenceSchedules;
        }

        /**
         * @return scalingDownAfterIdleMinutes
         */
        public Integer getScalingDownAfterIdleMinutes() {
            return this.scalingDownAfterIdleMinutes;
        }

        /**
         * @return scalingNodeAmount
         */
        public Integer getScalingNodeAmount() {
            return this.scalingNodeAmount;
        }

        /**
         * @return scalingNodeUsed
         */
        public Integer getScalingNodeUsed() {
            return this.scalingNodeUsed;
        }

        /**
         * @return scalingStep
         */
        public Integer getScalingStep() {
            return this.scalingStep;
        }

        /**
         * @return scalingUsageThreshold
         */
        public String getScalingUsageThreshold() {
            return this.scalingUsageThreshold;
        }

        /**
         * @return strategyDisableDate
         */
        public String getStrategyDisableDate() {
            return this.strategyDisableDate;
        }

        /**
         * @return strategyEnableDate
         */
        public String getStrategyEnableDate() {
            return this.strategyEnableDate;
        }

        /**
         * @return strategyType
         */
        public String getStrategyType() {
            return this.strategyType;
        }

        /**
         * @return warmUp
         */
        public Boolean getWarmUp() {
            return this.warmUp;
        }

        public static final class Builder {
            private Integer amount; 
            private Integer maxIdleAppInstanceAmount; 
            private Integer maxScalingAmount; 
            private Integer nodeAmount; 
            private Integer nodeCapacity; 
            private String nodeInstanceType; 
            private String nodePoolId; 
            private String nodeTypeName; 
            private Integer nodeUsed; 
            private java.util.List<RecurrenceSchedules> recurrenceSchedules; 
            private Integer scalingDownAfterIdleMinutes; 
            private Integer scalingNodeAmount; 
            private Integer scalingNodeUsed; 
            private Integer scalingStep; 
            private String scalingUsageThreshold; 
            private String strategyDisableDate; 
            private String strategyEnableDate; 
            private String strategyType; 
            private Boolean warmUp; 

            private Builder() {
            } 

            private Builder(NodePool model) {
                this.amount = model.amount;
                this.maxIdleAppInstanceAmount = model.maxIdleAppInstanceAmount;
                this.maxScalingAmount = model.maxScalingAmount;
                this.nodeAmount = model.nodeAmount;
                this.nodeCapacity = model.nodeCapacity;
                this.nodeInstanceType = model.nodeInstanceType;
                this.nodePoolId = model.nodePoolId;
                this.nodeTypeName = model.nodeTypeName;
                this.nodeUsed = model.nodeUsed;
                this.recurrenceSchedules = model.recurrenceSchedules;
                this.scalingDownAfterIdleMinutes = model.scalingDownAfterIdleMinutes;
                this.scalingNodeAmount = model.scalingNodeAmount;
                this.scalingNodeUsed = model.scalingNodeUsed;
                this.scalingStep = model.scalingStep;
                this.scalingUsageThreshold = model.scalingUsageThreshold;
                this.strategyDisableDate = model.strategyDisableDate;
                this.strategyEnableDate = model.strategyEnableDate;
                this.strategyType = model.strategyType;
                this.warmUp = model.warmUp;
            } 

            /**
             * <p>The number of resources purchased when the delivery group was created.</p>
             * 
             * <strong>example:</strong>
             * <p>2</p>
             */
            public Builder amount(Integer amount) {
                this.amount = amount;
                return this;
            }

            /**
             * <p>The maximum number of idle sessions. After you specify a value for this parameter, auto scale-out is triggered only if the number of idle sessions in the delivery group is smaller than the specified value and the session usage exceeds the value specified for <code>ScalingUsageThreshold</code>. Otherwise, the system determines that idle sessions in the delivery group are sufficient and does not perform auto scale-out.`` You can use this parameter to flexibly manage auto scaling and reduce costs.</p>
             * 
             * <strong>example:</strong>
             * <p>3</p>
             */
            public Builder maxIdleAppInstanceAmount(Integer maxIdleAppInstanceAmount) {
                this.maxIdleAppInstanceAmount = maxIdleAppInstanceAmount;
                return this;
            }

            /**
             * <p>The maximum number of resources that can be created for scale-out.</p>
             * 
             * <strong>example:</strong>
             * <p>8</p>
             */
            public Builder maxScalingAmount(Integer maxScalingAmount) {
                this.maxScalingAmount = maxScalingAmount;
                return this;
            }

            /**
             * <p>The total number of subscription resources.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder nodeAmount(Integer nodeAmount) {
                this.nodeAmount = nodeAmount;
                return this;
            }

            /**
             * <p>The maximum number of sessions that can be connected to a resource at the same time. If a resource connects to a large number of sessions at the same time, user experience can be compromised. The value range varies based on the resource specification. The following items describe the value ranges of different resource types:</p>
             * <ul>
             * <li>appstreaming.general.4c8g: 1 to 2</li>
             * <li>appstreaming.general.8c16g: 1 to 4</li>
             * <li>appstreaming.vgpu.8c16g.4g: 1 to 4</li>
             * <li>appstreaming.vgpu.8c31g.16g: 1 to 4</li>
             * <li>appstreaming.vgpu.14c93g.12g: 1 to 6</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>2</p>
             */
            public Builder nodeCapacity(Integer nodeCapacity) {
                this.nodeCapacity = nodeCapacity;
                return this;
            }

            /**
             * <p>The ID of the resource specification that you purchase.</p>
             * 
             * <strong>example:</strong>
             * <p>appstreaming.vgpu.4c8g.2g</p>
             */
            public Builder nodeInstanceType(String nodeInstanceType) {
                this.nodeInstanceType = nodeInstanceType;
                return this;
            }

            /**
             * <p>The ID of the resource group.</p>
             * 
             * <strong>example:</strong>
             * <p>rg-g6922kced36hx****</p>
             */
            public Builder nodePoolId(String nodePoolId) {
                this.nodePoolId = nodePoolId;
                return this;
            }

            /**
             * <p>The name of the resource specification.</p>
             */
            public Builder nodeTypeName(String nodeTypeName) {
                this.nodeTypeName = nodeTypeName;
                return this;
            }

            /**
             * <p>The number of subscription resources that are in use.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder nodeUsed(Integer nodeUsed) {
                this.nodeUsed = nodeUsed;
                return this;
            }

            /**
             * <p>The intervals at which the scaling policy is executed.</p>
             */
            public Builder recurrenceSchedules(java.util.List<RecurrenceSchedules> recurrenceSchedules) {
                this.recurrenceSchedules = recurrenceSchedules;
                return this;
            }

            /**
             * <p>The duration for which no session is connected. Unit: minutes. If no session is connected in the resources after the specified duration elapses, auto scale-in is triggered. Default value: 5.</p>
             * 
             * <strong>example:</strong>
             * <p>5</p>
             */
            public Builder scalingDownAfterIdleMinutes(Integer scalingDownAfterIdleMinutes) {
                this.scalingDownAfterIdleMinutes = scalingDownAfterIdleMinutes;
                return this;
            }

            /**
             * <p>The total number of scalable resources.</p>
             * 
             * <strong>example:</strong>
             * <p>8</p>
             */
            public Builder scalingNodeAmount(Integer scalingNodeAmount) {
                this.scalingNodeAmount = scalingNodeAmount;
                return this;
            }

            /**
             * <p>The number of scalable resources that are in use.</p>
             * 
             * <strong>example:</strong>
             * <p>4</p>
             */
            public Builder scalingNodeUsed(Integer scalingNodeUsed) {
                this.scalingNodeUsed = scalingNodeUsed;
                return this;
            }

            /**
             * <p>The number of resources that are created each time resources are scaled out. Valid values: 1 to 10.</p>
             * 
             * <strong>example:</strong>
             * <p>2</p>
             */
            public Builder scalingStep(Integer scalingStep) {
                this.scalingStep = scalingStep;
                return this;
            }

            /**
             * <p>The upper limit of session usage. If the session usage exceeds the specified upper limit, auto scale-out is triggered. The session usage is calculated by using the following formula: <code>Session usage = Number of current sessions/(Total number of resources × Number of concurrent sessions) × 100%</code>.</p>
             * 
             * <strong>example:</strong>
             * <p>85</p>
             */
            public Builder scalingUsageThreshold(String scalingUsageThreshold) {
                this.scalingUsageThreshold = scalingUsageThreshold;
                return this;
            }

            /**
             * <p>The expiration date of the scaling policy. Format: yyyy-MM-dd.</p>
             * 
             * <strong>example:</strong>
             * <p>2022-09-08</p>
             */
            public Builder strategyDisableDate(String strategyDisableDate) {
                this.strategyDisableDate = strategyDisableDate;
                return this;
            }

            /**
             * <p>The effective date of the scaling policy. Format: yyyy-MM-dd.</p>
             * 
             * <strong>example:</strong>
             * <p>2022-08-01</p>
             */
            public Builder strategyEnableDate(String strategyEnableDate) {
                this.strategyEnableDate = strategyEnableDate;
                return this;
            }

            /**
             * <p>The type of the scaling policy.</p>
             * <blockquote>
             * <p> <code>NODE_SCALING_BY_USAGE</code> is returned for this parameter only if ChargeType is set to <code>PrePaid</code>. <code>NODE_SCALING_BY_SCHEDULE</code> is returned for this parameter only if ChargeType is set to <code>PostPaid</code>.</p>
             * </blockquote>
             * <p>Valid values:</p>
             * <ul>
             * <li>NODE_FIXED: No scalable resources are used.</li>
             * <li>NODE_SCALING_BY_SCHEDULE: Scheduled scaling is used.</li>
             * <li>NODE_SCALING_BY_USAGE: Resources are scaled based on usage.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>NODE_FIXED</p>
             */
            public Builder strategyType(String strategyType) {
                this.strategyType = strategyType;
                return this;
            }

            /**
             * <p>Indicates whether resource prefetch is enabled.</p>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder warmUp(Boolean warmUp) {
                this.warmUp = warmUp;
                return this;
            }

            public NodePool build() {
                return new NodePool(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListAppInstanceGroupResponseBody} extends {@link TeaModel}
     *
     * <p>ListAppInstanceGroupResponseBody</p>
     */
    public static class OtaInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("NewOtaVersion")
        private String newOtaVersion;

        @com.aliyun.core.annotation.NameInMap("OtaVersion")
        private String otaVersion;

        @com.aliyun.core.annotation.NameInMap("TaskId")
        private String taskId;

        private OtaInfo(Builder builder) {
            this.newOtaVersion = builder.newOtaVersion;
            this.otaVersion = builder.otaVersion;
            this.taskId = builder.taskId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static OtaInfo create() {
            return builder().build();
        }

        /**
         * @return newOtaVersion
         */
        public String getNewOtaVersion() {
            return this.newOtaVersion;
        }

        /**
         * @return otaVersion
         */
        public String getOtaVersion() {
            return this.otaVersion;
        }

        /**
         * @return taskId
         */
        public String getTaskId() {
            return this.taskId;
        }

        public static final class Builder {
            private String newOtaVersion; 
            private String otaVersion; 
            private String taskId; 

            private Builder() {
            } 

            private Builder(OtaInfo model) {
                this.newOtaVersion = model.newOtaVersion;
                this.otaVersion = model.otaVersion;
                this.taskId = model.taskId;
            } 

            /**
             * <p>The new OTA version. A null value indicates that no new version is available.</p>
             * 
             * <strong>example:</strong>
             * <p>0.0.1-D-20220630.11****</p>
             */
            public Builder newOtaVersion(String newOtaVersion) {
                this.newOtaVersion = newOtaVersion;
                return this;
            }

            /**
             * <p>The current OTA version.</p>
             * 
             * <strong>example:</strong>
             * <p>0.0.1-D-20220615.11****</p>
             */
            public Builder otaVersion(String otaVersion) {
                this.otaVersion = otaVersion;
                return this;
            }

            /**
             * <p>The ID of the OTA update task.</p>
             * 
             * <strong>example:</strong>
             * <p>ota-e49929gv8acz5****</p>
             */
            public Builder taskId(String taskId) {
                this.taskId = taskId;
                return this;
            }

            public OtaInfo build() {
                return new OtaInfo(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListAppInstanceGroupResponseBody} extends {@link TeaModel}
     *
     * <p>ListAppInstanceGroupResponseBody</p>
     */
    public static class ResourceTags extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Key")
        private String key;

        @com.aliyun.core.annotation.NameInMap("Scope")
        private String scope;

        @com.aliyun.core.annotation.NameInMap("Value")
        private String value;

        private ResourceTags(Builder builder) {
            this.key = builder.key;
            this.scope = builder.scope;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ResourceTags create() {
            return builder().build();
        }

        /**
         * @return key
         */
        public String getKey() {
            return this.key;
        }

        /**
         * @return scope
         */
        public String getScope() {
            return this.scope;
        }

        /**
         * @return value
         */
        public String getValue() {
            return this.value;
        }

        public static final class Builder {
            private String key; 
            private String scope; 
            private String value; 

            private Builder() {
            } 

            private Builder(ResourceTags model) {
                this.key = model.key;
                this.scope = model.scope;
                this.value = model.value;
            } 

            /**
             * <p>The tag key.</p>
             * 
             * <strong>example:</strong>
             * <p>department</p>
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * <p>The tag type. Valid values: Custom System</p>
             * 
             * <strong>example:</strong>
             * <p>Custom</p>
             */
            public Builder scope(String scope) {
                this.scope = scope;
                return this;
            }

            /**
             * <p>The tag value.</p>
             * 
             * <strong>example:</strong>
             * <p>design</p>
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public ResourceTags build() {
                return new ResourceTags(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListAppInstanceGroupResponseBody} extends {@link TeaModel}
     *
     * <p>ListAppInstanceGroupResponseBody</p>
     */
    public static class Tags extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Key")
        private String key;

        @com.aliyun.core.annotation.NameInMap("Scope")
        private String scope;

        @com.aliyun.core.annotation.NameInMap("Value")
        private String value;

        private Tags(Builder builder) {
            this.key = builder.key;
            this.scope = builder.scope;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Tags create() {
            return builder().build();
        }

        /**
         * @return key
         */
        public String getKey() {
            return this.key;
        }

        /**
         * @return scope
         */
        public String getScope() {
            return this.scope;
        }

        /**
         * @return value
         */
        public String getValue() {
            return this.value;
        }

        public static final class Builder {
            private String key; 
            private String scope; 
            private String value; 

            private Builder() {
            } 

            private Builder(Tags model) {
                this.key = model.key;
                this.scope = model.scope;
                this.value = model.value;
            } 

            /**
             * <p>The tag key.</p>
             * 
             * <strong>example:</strong>
             * <p>department</p>
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * <p>The tag type. Valid values: Custom System</p>
             * 
             * <strong>example:</strong>
             * <p>Custom</p>
             */
            public Builder scope(String scope) {
                this.scope = scope;
                return this;
            }

            /**
             * <p>The tag value.</p>
             * 
             * <strong>example:</strong>
             * <p>design</p>
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public Tags build() {
                return new Tags(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListAppInstanceGroupResponseBody} extends {@link TeaModel}
     *
     * <p>ListAppInstanceGroupResponseBody</p>
     */
    public static class AppInstanceGroupModels extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Amount")
        private Integer amount;

        @com.aliyun.core.annotation.NameInMap("AppCenterImageId")
        private String appCenterImageId;

        @com.aliyun.core.annotation.NameInMap("AppInstanceGroupId")
        private String appInstanceGroupId;

        @com.aliyun.core.annotation.NameInMap("AppInstanceGroupName")
        private String appInstanceGroupName;

        @com.aliyun.core.annotation.NameInMap("AppInstanceType")
        private String appInstanceType;

        @com.aliyun.core.annotation.NameInMap("AppPolicyId")
        private String appPolicyId;

        @com.aliyun.core.annotation.NameInMap("AppPolicyImageCheck")
        private Boolean appPolicyImageCheck;

        @com.aliyun.core.annotation.NameInMap("AppPolicyVersion")
        private String appPolicyVersion;

        @com.aliyun.core.annotation.NameInMap("Apps")
        private java.util.List<Apps> apps;

        @com.aliyun.core.annotation.NameInMap("ChargeResourceMode")
        private String chargeResourceMode;

        @com.aliyun.core.annotation.NameInMap("ChargeType")
        private String chargeType;

        @com.aliyun.core.annotation.NameInMap("ExpiredTime")
        private String expiredTime;

        @com.aliyun.core.annotation.NameInMap("GmtCreate")
        private String gmtCreate;

        @com.aliyun.core.annotation.NameInMap("MaxAmount")
        private Integer maxAmount;

        @com.aliyun.core.annotation.NameInMap("MinAmount")
        private Integer minAmount;

        @com.aliyun.core.annotation.NameInMap("NodePool")
        private java.util.List<NodePool> nodePool;

        @com.aliyun.core.annotation.NameInMap("OfficeSiteId")
        private String officeSiteId;

        @com.aliyun.core.annotation.NameInMap("OsType")
        private String osType;

        @com.aliyun.core.annotation.NameInMap("OtaInfo")
        private OtaInfo otaInfo;

        @com.aliyun.core.annotation.NameInMap("ProductType")
        private String productType;

        @com.aliyun.core.annotation.NameInMap("RegionId")
        private String regionId;

        @com.aliyun.core.annotation.NameInMap("ReserveAmountRatio")
        private String reserveAmountRatio;

        @com.aliyun.core.annotation.NameInMap("ReserveMaxAmount")
        private Integer reserveMaxAmount;

        @com.aliyun.core.annotation.NameInMap("ReserveMinAmount")
        private Integer reserveMinAmount;

        @com.aliyun.core.annotation.NameInMap("ResourceStatus")
        private String resourceStatus;

        @com.aliyun.core.annotation.NameInMap("ResourceTags")
        private java.util.List<ResourceTags> resourceTags;

        @com.aliyun.core.annotation.NameInMap("ScalingDownAfterIdleMinutes")
        private Integer scalingDownAfterIdleMinutes;

        @com.aliyun.core.annotation.NameInMap("ScalingStep")
        private Integer scalingStep;

        @com.aliyun.core.annotation.NameInMap("ScalingUsageThreshold")
        private String scalingUsageThreshold;

        @com.aliyun.core.annotation.NameInMap("SessionTimeout")
        private String sessionTimeout;

        @com.aliyun.core.annotation.NameInMap("SkipUserAuthCheck")
        private Boolean skipUserAuthCheck;

        @com.aliyun.core.annotation.NameInMap("SpecId")
        private String specId;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("Tags")
        private java.util.List<Tags> tags;

        private AppInstanceGroupModels(Builder builder) {
            this.amount = builder.amount;
            this.appCenterImageId = builder.appCenterImageId;
            this.appInstanceGroupId = builder.appInstanceGroupId;
            this.appInstanceGroupName = builder.appInstanceGroupName;
            this.appInstanceType = builder.appInstanceType;
            this.appPolicyId = builder.appPolicyId;
            this.appPolicyImageCheck = builder.appPolicyImageCheck;
            this.appPolicyVersion = builder.appPolicyVersion;
            this.apps = builder.apps;
            this.chargeResourceMode = builder.chargeResourceMode;
            this.chargeType = builder.chargeType;
            this.expiredTime = builder.expiredTime;
            this.gmtCreate = builder.gmtCreate;
            this.maxAmount = builder.maxAmount;
            this.minAmount = builder.minAmount;
            this.nodePool = builder.nodePool;
            this.officeSiteId = builder.officeSiteId;
            this.osType = builder.osType;
            this.otaInfo = builder.otaInfo;
            this.productType = builder.productType;
            this.regionId = builder.regionId;
            this.reserveAmountRatio = builder.reserveAmountRatio;
            this.reserveMaxAmount = builder.reserveMaxAmount;
            this.reserveMinAmount = builder.reserveMinAmount;
            this.resourceStatus = builder.resourceStatus;
            this.resourceTags = builder.resourceTags;
            this.scalingDownAfterIdleMinutes = builder.scalingDownAfterIdleMinutes;
            this.scalingStep = builder.scalingStep;
            this.scalingUsageThreshold = builder.scalingUsageThreshold;
            this.sessionTimeout = builder.sessionTimeout;
            this.skipUserAuthCheck = builder.skipUserAuthCheck;
            this.specId = builder.specId;
            this.status = builder.status;
            this.tags = builder.tags;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AppInstanceGroupModels create() {
            return builder().build();
        }

        /**
         * @return amount
         */
        public Integer getAmount() {
            return this.amount;
        }

        /**
         * @return appCenterImageId
         */
        public String getAppCenterImageId() {
            return this.appCenterImageId;
        }

        /**
         * @return appInstanceGroupId
         */
        public String getAppInstanceGroupId() {
            return this.appInstanceGroupId;
        }

        /**
         * @return appInstanceGroupName
         */
        public String getAppInstanceGroupName() {
            return this.appInstanceGroupName;
        }

        /**
         * @return appInstanceType
         */
        public String getAppInstanceType() {
            return this.appInstanceType;
        }

        /**
         * @return appPolicyId
         */
        public String getAppPolicyId() {
            return this.appPolicyId;
        }

        /**
         * @return appPolicyImageCheck
         */
        public Boolean getAppPolicyImageCheck() {
            return this.appPolicyImageCheck;
        }

        /**
         * @return appPolicyVersion
         */
        public String getAppPolicyVersion() {
            return this.appPolicyVersion;
        }

        /**
         * @return apps
         */
        public java.util.List<Apps> getApps() {
            return this.apps;
        }

        /**
         * @return chargeResourceMode
         */
        public String getChargeResourceMode() {
            return this.chargeResourceMode;
        }

        /**
         * @return chargeType
         */
        public String getChargeType() {
            return this.chargeType;
        }

        /**
         * @return expiredTime
         */
        public String getExpiredTime() {
            return this.expiredTime;
        }

        /**
         * @return gmtCreate
         */
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        /**
         * @return maxAmount
         */
        public Integer getMaxAmount() {
            return this.maxAmount;
        }

        /**
         * @return minAmount
         */
        public Integer getMinAmount() {
            return this.minAmount;
        }

        /**
         * @return nodePool
         */
        public java.util.List<NodePool> getNodePool() {
            return this.nodePool;
        }

        /**
         * @return officeSiteId
         */
        public String getOfficeSiteId() {
            return this.officeSiteId;
        }

        /**
         * @return osType
         */
        public String getOsType() {
            return this.osType;
        }

        /**
         * @return otaInfo
         */
        public OtaInfo getOtaInfo() {
            return this.otaInfo;
        }

        /**
         * @return productType
         */
        public String getProductType() {
            return this.productType;
        }

        /**
         * @return regionId
         */
        public String getRegionId() {
            return this.regionId;
        }

        /**
         * @return reserveAmountRatio
         */
        public String getReserveAmountRatio() {
            return this.reserveAmountRatio;
        }

        /**
         * @return reserveMaxAmount
         */
        public Integer getReserveMaxAmount() {
            return this.reserveMaxAmount;
        }

        /**
         * @return reserveMinAmount
         */
        public Integer getReserveMinAmount() {
            return this.reserveMinAmount;
        }

        /**
         * @return resourceStatus
         */
        public String getResourceStatus() {
            return this.resourceStatus;
        }

        /**
         * @return resourceTags
         */
        public java.util.List<ResourceTags> getResourceTags() {
            return this.resourceTags;
        }

        /**
         * @return scalingDownAfterIdleMinutes
         */
        public Integer getScalingDownAfterIdleMinutes() {
            return this.scalingDownAfterIdleMinutes;
        }

        /**
         * @return scalingStep
         */
        public Integer getScalingStep() {
            return this.scalingStep;
        }

        /**
         * @return scalingUsageThreshold
         */
        public String getScalingUsageThreshold() {
            return this.scalingUsageThreshold;
        }

        /**
         * @return sessionTimeout
         */
        public String getSessionTimeout() {
            return this.sessionTimeout;
        }

        /**
         * @return skipUserAuthCheck
         */
        public Boolean getSkipUserAuthCheck() {
            return this.skipUserAuthCheck;
        }

        /**
         * @return specId
         */
        public String getSpecId() {
            return this.specId;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return tags
         */
        public java.util.List<Tags> getTags() {
            return this.tags;
        }

        public static final class Builder {
            private Integer amount; 
            private String appCenterImageId; 
            private String appInstanceGroupId; 
            private String appInstanceGroupName; 
            private String appInstanceType; 
            private String appPolicyId; 
            private Boolean appPolicyImageCheck; 
            private String appPolicyVersion; 
            private java.util.List<Apps> apps; 
            private String chargeResourceMode; 
            private String chargeType; 
            private String expiredTime; 
            private String gmtCreate; 
            private Integer maxAmount; 
            private Integer minAmount; 
            private java.util.List<NodePool> nodePool; 
            private String officeSiteId; 
            private String osType; 
            private OtaInfo otaInfo; 
            private String productType; 
            private String regionId; 
            private String reserveAmountRatio; 
            private Integer reserveMaxAmount; 
            private Integer reserveMinAmount; 
            private String resourceStatus; 
            private java.util.List<ResourceTags> resourceTags; 
            private Integer scalingDownAfterIdleMinutes; 
            private Integer scalingStep; 
            private String scalingUsageThreshold; 
            private String sessionTimeout; 
            private Boolean skipUserAuthCheck; 
            private String specId; 
            private String status; 
            private java.util.List<Tags> tags; 

            private Builder() {
            } 

            private Builder(AppInstanceGroupModels model) {
                this.amount = model.amount;
                this.appCenterImageId = model.appCenterImageId;
                this.appInstanceGroupId = model.appInstanceGroupId;
                this.appInstanceGroupName = model.appInstanceGroupName;
                this.appInstanceType = model.appInstanceType;
                this.appPolicyId = model.appPolicyId;
                this.appPolicyImageCheck = model.appPolicyImageCheck;
                this.appPolicyVersion = model.appPolicyVersion;
                this.apps = model.apps;
                this.chargeResourceMode = model.chargeResourceMode;
                this.chargeType = model.chargeType;
                this.expiredTime = model.expiredTime;
                this.gmtCreate = model.gmtCreate;
                this.maxAmount = model.maxAmount;
                this.minAmount = model.minAmount;
                this.nodePool = model.nodePool;
                this.officeSiteId = model.officeSiteId;
                this.osType = model.osType;
                this.otaInfo = model.otaInfo;
                this.productType = model.productType;
                this.regionId = model.regionId;
                this.reserveAmountRatio = model.reserveAmountRatio;
                this.reserveMaxAmount = model.reserveMaxAmount;
                this.reserveMinAmount = model.reserveMinAmount;
                this.resourceStatus = model.resourceStatus;
                this.resourceTags = model.resourceTags;
                this.scalingDownAfterIdleMinutes = model.scalingDownAfterIdleMinutes;
                this.scalingStep = model.scalingStep;
                this.scalingUsageThreshold = model.scalingUsageThreshold;
                this.sessionTimeout = model.sessionTimeout;
                this.skipUserAuthCheck = model.skipUserAuthCheck;
                this.specId = model.specId;
                this.status = model.status;
                this.tags = model.tags;
            } 

            /**
             * <p>The number of subscription resources. Minimum value: 1.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder amount(Integer amount) {
                this.amount = amount;
                return this;
            }

            /**
             * <p>The image ID of the app.</p>
             * 
             * <strong>example:</strong>
             * <p>img-8z4nztpaqvay4****</p>
             */
            public Builder appCenterImageId(String appCenterImageId) {
                this.appCenterImageId = appCenterImageId;
                return this;
            }

            /**
             * <p>The ID of the delivery group.</p>
             * 
             * <strong>example:</strong>
             * <p>aig-9ciijz60n4xsv****</p>
             */
            public Builder appInstanceGroupId(String appInstanceGroupId) {
                this.appInstanceGroupId = appInstanceGroupId;
                return this;
            }

            /**
             * <p>The name of the delivery group.</p>
             */
            public Builder appInstanceGroupName(String appInstanceGroupName) {
                this.appInstanceGroupName = appInstanceGroupName;
                return this;
            }

            /**
             * <p>The resource type of the delivery group.</p>
             * 
             * <strong>example:</strong>
             * <p><strong>dynamic</strong></p>
             */
            public Builder appInstanceType(String appInstanceType) {
                this.appInstanceType = appInstanceType;
                return this;
            }

            /**
             * <p>The policy ID.</p>
             * 
             * <strong>example:</strong>
             * <p>pg-g3k5wa2ms2****</p>
             */
            public Builder appPolicyId(String appPolicyId) {
                this.appPolicyId = appPolicyId;
                return this;
            }

            /**
             * AppPolicyImageCheck.
             */
            public Builder appPolicyImageCheck(Boolean appPolicyImageCheck) {
                this.appPolicyImageCheck = appPolicyImageCheck;
                return this;
            }

            /**
             * AppPolicyVersion.
             */
            public Builder appPolicyVersion(String appPolicyVersion) {
                this.appPolicyVersion = appPolicyVersion;
                return this;
            }

            /**
             * <p>The apps.</p>
             */
            public Builder apps(java.util.List<Apps> apps) {
                this.apps = apps;
                return this;
            }

            /**
             * <p>The sales mode.</p>
             * <p>Valid values:</p>
             * <ul>
             * <li>AppInstance: by session</li>
             * <li>Node: by resource</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Node</p>
             */
            public Builder chargeResourceMode(String chargeResourceMode) {
                this.chargeResourceMode = chargeResourceMode;
                return this;
            }

            /**
             * <p>The billing method.</p>
             * <p>Valid values:</p>
             * <ul>
             * <li>PostPaid: pay-as-you-go</li>
             * <li>PrePaid: subscription</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>PrePaid</p>
             */
            public Builder chargeType(String chargeType) {
                this.chargeType = chargeType;
                return this;
            }

            /**
             * <p>The time when the delivery group expires.</p>
             * 
             * <strong>example:</strong>
             * <p>2022-04-27T16:00:00.000+00:00</p>
             */
            public Builder expiredTime(String expiredTime) {
                this.expiredTime = expiredTime;
                return this;
            }

            /**
             * <p>The time when the delivery group was created.</p>
             * 
             * <strong>example:</strong>
             * <p>2022-04-26T15:06:16.000+00:00</p>
             */
            public Builder gmtCreate(String gmtCreate) {
                this.gmtCreate = gmtCreate;
                return this;
            }

            /**
             * <p>The maximum number of instances. Minimum value: 1.</p>
             * 
             * <strong>example:</strong>
             * <p>10</p>
             */
            public Builder maxAmount(Integer maxAmount) {
                this.maxAmount = maxAmount;
                return this;
            }

            /**
             * <p>The minimum number of instances. Minimum value: 1.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder minAmount(Integer minAmount) {
                this.minAmount = minAmount;
                return this;
            }

            /**
             * <p>The resource groups.</p>
             */
            public Builder nodePool(java.util.List<NodePool> nodePool) {
                this.nodePool = nodePool;
                return this;
            }

            /**
             * OfficeSiteId.
             */
            public Builder officeSiteId(String officeSiteId) {
                this.officeSiteId = officeSiteId;
                return this;
            }

            /**
             * <p>The type of the operating system.</p>
             * <p>Valid value:</p>
             * <ul>
             * <li>Windows</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Windows</p>
             */
            public Builder osType(String osType) {
                this.osType = osType;
                return this;
            }

            /**
             * <p>The information about the over-the-air (OTA) update task.</p>
             */
            public Builder otaInfo(OtaInfo otaInfo) {
                this.otaInfo = otaInfo;
                return this;
            }

            /**
             * <p>The product type.</p>
             * <p>Valid value:</p>
             * <ul>
             * <li>CloudApp: App Streaming</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>CloudApp</p>
             */
            public Builder productType(String productType) {
                this.productType = productType;
                return this;
            }

            /**
             * <p>The ID of the region where the delivery group resides. For information about the supported regions, see <a href="https://help.aliyun.com/document_detail/426036.html">Limits</a>.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-hangzhou</p>
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            /**
             * <p>The percentage of reserved instances. The value indicates the percentage of unused sessions in the delivery group. Valid values: 0 to 99.</p>
             * 
             * <strong>example:</strong>
             * <p>20</p>
             */
            public Builder reserveAmountRatio(String reserveAmountRatio) {
                this.reserveAmountRatio = reserveAmountRatio;
                return this;
            }

            /**
             * <p>The maximum number of reserved instances. The value indicates the maximum number of unused sessions in the delivery group. Minimum value: 1.</p>
             * 
             * <strong>example:</strong>
             * <p>5</p>
             */
            public Builder reserveMaxAmount(Integer reserveMaxAmount) {
                this.reserveMaxAmount = reserveMaxAmount;
                return this;
            }

            /**
             * <p>The minimum number of reserved instances. The value indicates the minimum number of unused sessions in the delivery group. Minimum value: 1.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder reserveMinAmount(Integer reserveMinAmount) {
                this.reserveMinAmount = reserveMinAmount;
                return this;
            }

            /**
             * <p>The resource status.</p>
             * <p>Valid values:</p>
             * <ul>
             * <li>AVAILABLE</li>
             * <li>RELEASED</li>
             * <li>EXPIRED_IN_7_DAYS</li>
             * <li>UNAVAILABLE</li>
             * <li>UPGRADING</li>
             * <li>CREATING</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>AVAILABLE</p>
             */
            public Builder resourceStatus(String resourceStatus) {
                this.resourceStatus = resourceStatus;
                return this;
            }

            /**
             * <p>The resource tags.</p>
             */
            public Builder resourceTags(java.util.List<ResourceTags> resourceTags) {
                this.resourceTags = resourceTags;
                return this;
            }

            /**
             * <p>The duration for which no session is connected. Unit: minutes. If no session is connected in the resources after the specified duration elapses, auto scale-in is triggered. Minimum value: 0.</p>
             * 
             * <strong>example:</strong>
             * <p>5</p>
             */
            public Builder scalingDownAfterIdleMinutes(Integer scalingDownAfterIdleMinutes) {
                this.scalingDownAfterIdleMinutes = scalingDownAfterIdleMinutes;
                return this;
            }

            /**
             * <p>The number of sessions that are created each time the delivery group is scaled out. Minimum value: 1.</p>
             * 
             * <strong>example:</strong>
             * <p>10</p>
             */
            public Builder scalingStep(Integer scalingStep) {
                this.scalingStep = scalingStep;
                return this;
            }

            /**
             * <p>The upper limit of session usage. If the session usage exceeds the specified upper limit, auto scale-out is triggered. The session usage rate is calculated by using the following formula: Session usage rate = Number of sessions in use/Total number of sessions × 100%. Valid values: 0 to 99.</p>
             * 
             * <strong>example:</strong>
             * <p>85</p>
             */
            public Builder scalingUsageThreshold(String scalingUsageThreshold) {
                this.scalingUsageThreshold = scalingUsageThreshold;
                return this;
            }

            /**
             * <p>The duration for which sessions are retained after disconnection. Unit: minutes. After an end user disconnects from a session, the session is closed only after the specified duration elapses. If you want to permanently retain sessions, set this parameter to <code>-1</code>. Valid values:-1 and 3 to 300. Default value: <code>15</code>.</p>
             * 
             * <strong>example:</strong>
             * <p>15</p>
             */
            public Builder sessionTimeout(String sessionTimeout) {
                this.sessionTimeout = sessionTimeout;
                return this;
            }

            /**
             * <p>Indicates whether user permission verification is skipped.</p>
             * <p>Valid values:</p>
             * <ul>
             * <li>true</li>
             * <li>false: This is the default value.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder skipUserAuthCheck(Boolean skipUserAuthCheck) {
                this.skipUserAuthCheck = skipUserAuthCheck;
                return this;
            }

            /**
             * <p>The specification ID that uniquely corresponds to the ID of the delivery group.</p>
             * 
             * <strong>example:</strong>
             * <p>spec-8o18t8uc31qib0****</p>
             */
            public Builder specId(String specId) {
                this.specId = specId;
                return this;
            }

            /**
             * <p>The status of the delivery group.</p>
             * <p>Valid values:</p>
             * <ul>
             * <li>PUBLISHED: The delivery group is published.</li>
             * <li>FAILED: The delivery group failed to be published.</li>
             * <li>MAINTAIN_FAILED: The delivery group failed to be updated.</li>
             * <li>EXPIRED: The delivery group is expired.</li>
             * <li>MAINTAINING: The delivery group is being updated.</li>
             * <li>CEASED: The delivery group has overdue payments.</li>
             * <li>EXPIRED_RECYCLING: The delivery group is expired and being recycled.</li>
             * <li>DEPLOYING: The delivery group is being published.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>PUBLISHED</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * Tags.
             */
            public Builder tags(java.util.List<Tags> tags) {
                this.tags = tags;
                return this;
            }

            public AppInstanceGroupModels build() {
                return new AppInstanceGroupModels(this);
            } 

        } 

    }
}
