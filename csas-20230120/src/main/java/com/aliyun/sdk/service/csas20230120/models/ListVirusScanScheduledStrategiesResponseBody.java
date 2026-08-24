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
 * {@link ListVirusScanScheduledStrategiesResponseBody} extends {@link TeaModel}
 *
 * <p>ListVirusScanScheduledStrategiesResponseBody</p>
 */
public class ListVirusScanScheduledStrategiesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Strategies")
    private java.util.List<Strategies> strategies;

    @com.aliyun.core.annotation.NameInMap("TotalNum")
    private Integer totalNum;

    private ListVirusScanScheduledStrategiesResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.strategies = builder.strategies;
        this.totalNum = builder.totalNum;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListVirusScanScheduledStrategiesResponseBody create() {
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
     * @return strategies
     */
    public java.util.List<Strategies> getStrategies() {
        return this.strategies;
    }

    /**
     * @return totalNum
     */
    public Integer getTotalNum() {
        return this.totalNum;
    }

    public static final class Builder {
        private String requestId; 
        private java.util.List<Strategies> strategies; 
        private Integer totalNum; 

        private Builder() {
        } 

        private Builder(ListVirusScanScheduledStrategiesResponseBody model) {
            this.requestId = model.requestId;
            this.strategies = model.strategies;
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
         * Strategies.
         */
        public Builder strategies(java.util.List<Strategies> strategies) {
            this.strategies = strategies;
            return this;
        }

        /**
         * TotalNum.
         */
        public Builder totalNum(Integer totalNum) {
            this.totalNum = totalNum;
            return this;
        }

        public ListVirusScanScheduledStrategiesResponseBody build() {
            return new ListVirusScanScheduledStrategiesResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListVirusScanScheduledStrategiesResponseBody} extends {@link TeaModel}
     *
     * <p>ListVirusScanScheduledStrategiesResponseBody</p>
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
     * {@link ListVirusScanScheduledStrategiesResponseBody} extends {@link TeaModel}
     *
     * <p>ListVirusScanScheduledStrategiesResponseBody</p>
     */
    public static class Strategies extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private String createTime;

        @com.aliyun.core.annotation.NameInMap("CustomMatchGroup")
        private java.util.List<CustomMatchGroup> customMatchGroup;

        @com.aliyun.core.annotation.NameInMap("HighRiskOperation")
        private String highRiskOperation;

        @com.aliyun.core.annotation.NameInMap("LastTriggerTime")
        private String lastTriggerTime;

        @com.aliyun.core.annotation.NameInMap("LowRiskOperation")
        private String lowRiskOperation;

        @com.aliyun.core.annotation.NameInMap("MatchMode")
        private String matchMode;

        @com.aliyun.core.annotation.NameInMap("MatchTargetIds")
        private java.util.List<String> matchTargetIds;

        @com.aliyun.core.annotation.NameInMap("MaxCpuUsage")
        private Long maxCpuUsage;

        @com.aliyun.core.annotation.NameInMap("MidRiskOperation")
        private String midRiskOperation;

        @com.aliyun.core.annotation.NameInMap("PerformanceMode")
        private String performanceMode;

        @com.aliyun.core.annotation.NameInMap("Priority")
        private Integer priority;

        @com.aliyun.core.annotation.NameInMap("ScanBeginTime")
        private Integer scanBeginTime;

        @com.aliyun.core.annotation.NameInMap("ScanEndTime")
        private Integer scanEndTime;

        @com.aliyun.core.annotation.NameInMap("ScanFrequency")
        private String scanFrequency;

        @com.aliyun.core.annotation.NameInMap("ScanInterval")
        private Integer scanInterval;

        @com.aliyun.core.annotation.NameInMap("ScanMode")
        private String scanMode;

        @com.aliyun.core.annotation.NameInMap("ScanPath")
        private java.util.List<String> scanPath;

        @com.aliyun.core.annotation.NameInMap("ScanTargets")
        private java.util.List<String> scanTargets;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("StrategyDescription")
        private String strategyDescription;

        @com.aliyun.core.annotation.NameInMap("StrategyId")
        private String strategyId;

        @com.aliyun.core.annotation.NameInMap("StrategyName")
        private String strategyName;

        @com.aliyun.core.annotation.NameInMap("Whitelist")
        private java.util.List<String> whitelist;

        private Strategies(Builder builder) {
            this.createTime = builder.createTime;
            this.customMatchGroup = builder.customMatchGroup;
            this.highRiskOperation = builder.highRiskOperation;
            this.lastTriggerTime = builder.lastTriggerTime;
            this.lowRiskOperation = builder.lowRiskOperation;
            this.matchMode = builder.matchMode;
            this.matchTargetIds = builder.matchTargetIds;
            this.maxCpuUsage = builder.maxCpuUsage;
            this.midRiskOperation = builder.midRiskOperation;
            this.performanceMode = builder.performanceMode;
            this.priority = builder.priority;
            this.scanBeginTime = builder.scanBeginTime;
            this.scanEndTime = builder.scanEndTime;
            this.scanFrequency = builder.scanFrequency;
            this.scanInterval = builder.scanInterval;
            this.scanMode = builder.scanMode;
            this.scanPath = builder.scanPath;
            this.scanTargets = builder.scanTargets;
            this.status = builder.status;
            this.strategyDescription = builder.strategyDescription;
            this.strategyId = builder.strategyId;
            this.strategyName = builder.strategyName;
            this.whitelist = builder.whitelist;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Strategies create() {
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
         * @return highRiskOperation
         */
        public String getHighRiskOperation() {
            return this.highRiskOperation;
        }

        /**
         * @return lastTriggerTime
         */
        public String getLastTriggerTime() {
            return this.lastTriggerTime;
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
         * @return matchTargetIds
         */
        public java.util.List<String> getMatchTargetIds() {
            return this.matchTargetIds;
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
         * @return priority
         */
        public Integer getPriority() {
            return this.priority;
        }

        /**
         * @return scanBeginTime
         */
        public Integer getScanBeginTime() {
            return this.scanBeginTime;
        }

        /**
         * @return scanEndTime
         */
        public Integer getScanEndTime() {
            return this.scanEndTime;
        }

        /**
         * @return scanFrequency
         */
        public String getScanFrequency() {
            return this.scanFrequency;
        }

        /**
         * @return scanInterval
         */
        public Integer getScanInterval() {
            return this.scanInterval;
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
        public String getStatus() {
            return this.status;
        }

        /**
         * @return strategyDescription
         */
        public String getStrategyDescription() {
            return this.strategyDescription;
        }

        /**
         * @return strategyId
         */
        public String getStrategyId() {
            return this.strategyId;
        }

        /**
         * @return strategyName
         */
        public String getStrategyName() {
            return this.strategyName;
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
            private String highRiskOperation; 
            private String lastTriggerTime; 
            private String lowRiskOperation; 
            private String matchMode; 
            private java.util.List<String> matchTargetIds; 
            private Long maxCpuUsage; 
            private String midRiskOperation; 
            private String performanceMode; 
            private Integer priority; 
            private Integer scanBeginTime; 
            private Integer scanEndTime; 
            private String scanFrequency; 
            private Integer scanInterval; 
            private String scanMode; 
            private java.util.List<String> scanPath; 
            private java.util.List<String> scanTargets; 
            private String status; 
            private String strategyDescription; 
            private String strategyId; 
            private String strategyName; 
            private java.util.List<String> whitelist; 

            private Builder() {
            } 

            private Builder(Strategies model) {
                this.createTime = model.createTime;
                this.customMatchGroup = model.customMatchGroup;
                this.highRiskOperation = model.highRiskOperation;
                this.lastTriggerTime = model.lastTriggerTime;
                this.lowRiskOperation = model.lowRiskOperation;
                this.matchMode = model.matchMode;
                this.matchTargetIds = model.matchTargetIds;
                this.maxCpuUsage = model.maxCpuUsage;
                this.midRiskOperation = model.midRiskOperation;
                this.performanceMode = model.performanceMode;
                this.priority = model.priority;
                this.scanBeginTime = model.scanBeginTime;
                this.scanEndTime = model.scanEndTime;
                this.scanFrequency = model.scanFrequency;
                this.scanInterval = model.scanInterval;
                this.scanMode = model.scanMode;
                this.scanPath = model.scanPath;
                this.scanTargets = model.scanTargets;
                this.status = model.status;
                this.strategyDescription = model.strategyDescription;
                this.strategyId = model.strategyId;
                this.strategyName = model.strategyName;
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
             * HighRiskOperation.
             */
            public Builder highRiskOperation(String highRiskOperation) {
                this.highRiskOperation = highRiskOperation;
                return this;
            }

            /**
             * LastTriggerTime.
             */
            public Builder lastTriggerTime(String lastTriggerTime) {
                this.lastTriggerTime = lastTriggerTime;
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
             * MatchTargetIds.
             */
            public Builder matchTargetIds(java.util.List<String> matchTargetIds) {
                this.matchTargetIds = matchTargetIds;
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
             * Priority.
             */
            public Builder priority(Integer priority) {
                this.priority = priority;
                return this;
            }

            /**
             * ScanBeginTime.
             */
            public Builder scanBeginTime(Integer scanBeginTime) {
                this.scanBeginTime = scanBeginTime;
                return this;
            }

            /**
             * ScanEndTime.
             */
            public Builder scanEndTime(Integer scanEndTime) {
                this.scanEndTime = scanEndTime;
                return this;
            }

            /**
             * ScanFrequency.
             */
            public Builder scanFrequency(String scanFrequency) {
                this.scanFrequency = scanFrequency;
                return this;
            }

            /**
             * ScanInterval.
             */
            public Builder scanInterval(Integer scanInterval) {
                this.scanInterval = scanInterval;
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
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * StrategyDescription.
             */
            public Builder strategyDescription(String strategyDescription) {
                this.strategyDescription = strategyDescription;
                return this;
            }

            /**
             * StrategyId.
             */
            public Builder strategyId(String strategyId) {
                this.strategyId = strategyId;
                return this;
            }

            /**
             * StrategyName.
             */
            public Builder strategyName(String strategyName) {
                this.strategyName = strategyName;
                return this;
            }

            /**
             * Whitelist.
             */
            public Builder whitelist(java.util.List<String> whitelist) {
                this.whitelist = whitelist;
                return this;
            }

            public Strategies build() {
                return new Strategies(this);
            } 

        } 

    }
}
