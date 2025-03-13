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

        /**
         * <p>The delivery groups.</p>
         */
        public Builder appInstanceGroupModels(java.util.List<AppInstanceGroupModels> appInstanceGroupModels) {
            this.appInstanceGroupModels = appInstanceGroupModels;
            return this;
        }

        /**
         * PageNumber.
         */
        public Builder pageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * PageSize.
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
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
         * TotalCount.
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

            /**
             * AppIcon.
             */
            public Builder appIcon(String appIcon) {
                this.appIcon = appIcon;
                return this;
            }

            /**
             * AppId.
             */
            public Builder appId(String appId) {
                this.appId = appId;
                return this;
            }

            /**
             * AppName.
             */
            public Builder appName(String appName) {
                this.appName = appName;
                return this;
            }

            /**
             * AppVersion.
             */
            public Builder appVersion(String appVersion) {
                this.appVersion = appVersion;
                return this;
            }

            /**
             * AppVersionName.
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

            /**
             * Amount.
             */
            public Builder amount(Integer amount) {
                this.amount = amount;
                return this;
            }

            /**
             * EndTime.
             */
            public Builder endTime(String endTime) {
                this.endTime = endTime;
                return this;
            }

            /**
             * StartTime.
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

            /**
             * RecurrenceType.
             */
            public Builder recurrenceType(String recurrenceType) {
                this.recurrenceType = recurrenceType;
                return this;
            }

            /**
             * RecurrenceValues.
             */
            public Builder recurrenceValues(java.util.List<Integer> recurrenceValues) {
                this.recurrenceValues = recurrenceValues;
                return this;
            }

            /**
             * TimerPeriods.
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

            /**
             * Amount.
             */
            public Builder amount(Integer amount) {
                this.amount = amount;
                return this;
            }

            /**
             * <p>The maximum number of idle sessions. After you specify a value for this parameter, auto scaling is triggered only if the number of idle sessions in the delivery group is smaller than the specified value and the session usage exceeds the value specified for <code>ScalingUsageThreshold</code>. Otherwise, the system determines that the idle sessions in the delivery group are sufficient and does not perform auto scaling.`` You can use this parameter to flexibly manage auto scaling and reduce costs.</p>
             * 
             * <strong>example:</strong>
             * <p>3</p>
             */
            public Builder maxIdleAppInstanceAmount(Integer maxIdleAppInstanceAmount) {
                this.maxIdleAppInstanceAmount = maxIdleAppInstanceAmount;
                return this;
            }

            /**
             * MaxScalingAmount.
             */
            public Builder maxScalingAmount(Integer maxScalingAmount) {
                this.maxScalingAmount = maxScalingAmount;
                return this;
            }

            /**
             * NodeAmount.
             */
            public Builder nodeAmount(Integer nodeAmount) {
                this.nodeAmount = nodeAmount;
                return this;
            }

            /**
             * NodeCapacity.
             */
            public Builder nodeCapacity(Integer nodeCapacity) {
                this.nodeCapacity = nodeCapacity;
                return this;
            }

            /**
             * NodeInstanceType.
             */
            public Builder nodeInstanceType(String nodeInstanceType) {
                this.nodeInstanceType = nodeInstanceType;
                return this;
            }

            /**
             * NodePoolId.
             */
            public Builder nodePoolId(String nodePoolId) {
                this.nodePoolId = nodePoolId;
                return this;
            }

            /**
             * NodeTypeName.
             */
            public Builder nodeTypeName(String nodeTypeName) {
                this.nodeTypeName = nodeTypeName;
                return this;
            }

            /**
             * NodeUsed.
             */
            public Builder nodeUsed(Integer nodeUsed) {
                this.nodeUsed = nodeUsed;
                return this;
            }

            /**
             * RecurrenceSchedules.
             */
            public Builder recurrenceSchedules(java.util.List<RecurrenceSchedules> recurrenceSchedules) {
                this.recurrenceSchedules = recurrenceSchedules;
                return this;
            }

            /**
             * ScalingDownAfterIdleMinutes.
             */
            public Builder scalingDownAfterIdleMinutes(Integer scalingDownAfterIdleMinutes) {
                this.scalingDownAfterIdleMinutes = scalingDownAfterIdleMinutes;
                return this;
            }

            /**
             * ScalingNodeAmount.
             */
            public Builder scalingNodeAmount(Integer scalingNodeAmount) {
                this.scalingNodeAmount = scalingNodeAmount;
                return this;
            }

            /**
             * ScalingNodeUsed.
             */
            public Builder scalingNodeUsed(Integer scalingNodeUsed) {
                this.scalingNodeUsed = scalingNodeUsed;
                return this;
            }

            /**
             * ScalingStep.
             */
            public Builder scalingStep(Integer scalingStep) {
                this.scalingStep = scalingStep;
                return this;
            }

            /**
             * ScalingUsageThreshold.
             */
            public Builder scalingUsageThreshold(String scalingUsageThreshold) {
                this.scalingUsageThreshold = scalingUsageThreshold;
                return this;
            }

            /**
             * StrategyDisableDate.
             */
            public Builder strategyDisableDate(String strategyDisableDate) {
                this.strategyDisableDate = strategyDisableDate;
                return this;
            }

            /**
             * StrategyEnableDate.
             */
            public Builder strategyEnableDate(String strategyEnableDate) {
                this.strategyEnableDate = strategyEnableDate;
                return this;
            }

            /**
             * StrategyType.
             */
            public Builder strategyType(String strategyType) {
                this.strategyType = strategyType;
                return this;
            }

            /**
             * WarmUp.
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

            /**
             * NewOtaVersion.
             */
            public Builder newOtaVersion(String newOtaVersion) {
                this.newOtaVersion = newOtaVersion;
                return this;
            }

            /**
             * OtaVersion.
             */
            public Builder otaVersion(String otaVersion) {
                this.otaVersion = otaVersion;
                return this;
            }

            /**
             * TaskId.
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

            /**
             * <p>The tag key.</p>
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * <p>The tag type. Valid values: Custom and System.</p>
             */
            public Builder scope(String scope) {
                this.scope = scope;
                return this;
            }

            /**
             * <p>The tag value.</p>
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

            /**
             * Amount.
             */
            public Builder amount(Integer amount) {
                this.amount = amount;
                return this;
            }

            /**
             * AppCenterImageId.
             */
            public Builder appCenterImageId(String appCenterImageId) {
                this.appCenterImageId = appCenterImageId;
                return this;
            }

            /**
             * AppInstanceGroupId.
             */
            public Builder appInstanceGroupId(String appInstanceGroupId) {
                this.appInstanceGroupId = appInstanceGroupId;
                return this;
            }

            /**
             * AppInstanceGroupName.
             */
            public Builder appInstanceGroupName(String appInstanceGroupName) {
                this.appInstanceGroupName = appInstanceGroupName;
                return this;
            }

            /**
             * AppInstanceType.
             */
            public Builder appInstanceType(String appInstanceType) {
                this.appInstanceType = appInstanceType;
                return this;
            }

            /**
             * AppPolicyId.
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
             * Apps.
             */
            public Builder apps(java.util.List<Apps> apps) {
                this.apps = apps;
                return this;
            }

            /**
             * ChargeResourceMode.
             */
            public Builder chargeResourceMode(String chargeResourceMode) {
                this.chargeResourceMode = chargeResourceMode;
                return this;
            }

            /**
             * ChargeType.
             */
            public Builder chargeType(String chargeType) {
                this.chargeType = chargeType;
                return this;
            }

            /**
             * ExpiredTime.
             */
            public Builder expiredTime(String expiredTime) {
                this.expiredTime = expiredTime;
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
             * MaxAmount.
             */
            public Builder maxAmount(Integer maxAmount) {
                this.maxAmount = maxAmount;
                return this;
            }

            /**
             * MinAmount.
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
             * OtaInfo.
             */
            public Builder otaInfo(OtaInfo otaInfo) {
                this.otaInfo = otaInfo;
                return this;
            }

            /**
             * ProductType.
             */
            public Builder productType(String productType) {
                this.productType = productType;
                return this;
            }

            /**
             * RegionId.
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            /**
             * ReserveAmountRatio.
             */
            public Builder reserveAmountRatio(String reserveAmountRatio) {
                this.reserveAmountRatio = reserveAmountRatio;
                return this;
            }

            /**
             * ReserveMaxAmount.
             */
            public Builder reserveMaxAmount(Integer reserveMaxAmount) {
                this.reserveMaxAmount = reserveMaxAmount;
                return this;
            }

            /**
             * ReserveMinAmount.
             */
            public Builder reserveMinAmount(Integer reserveMinAmount) {
                this.reserveMinAmount = reserveMinAmount;
                return this;
            }

            /**
             * ResourceStatus.
             */
            public Builder resourceStatus(String resourceStatus) {
                this.resourceStatus = resourceStatus;
                return this;
            }

            /**
             * <p>The tags added to the resources.</p>
             */
            public Builder resourceTags(java.util.List<ResourceTags> resourceTags) {
                this.resourceTags = resourceTags;
                return this;
            }

            /**
             * ScalingDownAfterIdleMinutes.
             */
            public Builder scalingDownAfterIdleMinutes(Integer scalingDownAfterIdleMinutes) {
                this.scalingDownAfterIdleMinutes = scalingDownAfterIdleMinutes;
                return this;
            }

            /**
             * ScalingStep.
             */
            public Builder scalingStep(Integer scalingStep) {
                this.scalingStep = scalingStep;
                return this;
            }

            /**
             * ScalingUsageThreshold.
             */
            public Builder scalingUsageThreshold(String scalingUsageThreshold) {
                this.scalingUsageThreshold = scalingUsageThreshold;
                return this;
            }

            /**
             * SessionTimeout.
             */
            public Builder sessionTimeout(String sessionTimeout) {
                this.sessionTimeout = sessionTimeout;
                return this;
            }

            /**
             * SkipUserAuthCheck.
             */
            public Builder skipUserAuthCheck(Boolean skipUserAuthCheck) {
                this.skipUserAuthCheck = skipUserAuthCheck;
                return this;
            }

            /**
             * SpecId.
             */
            public Builder specId(String specId) {
                this.specId = specId;
                return this;
            }

            /**
             * Status.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            public AppInstanceGroupModels build() {
                return new AppInstanceGroupModels(this);
            } 

        } 

    }
}
