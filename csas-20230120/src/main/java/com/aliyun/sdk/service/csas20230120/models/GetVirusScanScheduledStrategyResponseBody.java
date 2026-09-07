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
 * {@link GetVirusScanScheduledStrategyResponseBody} extends {@link TeaModel}
 *
 * <p>GetVirusScanScheduledStrategyResponseBody</p>
 */
public class GetVirusScanScheduledStrategyResponseBody extends TeaModel {
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

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

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

    private GetVirusScanScheduledStrategyResponseBody(Builder builder) {
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
        this.requestId = builder.requestId;
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

    public static GetVirusScanScheduledStrategyResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
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
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
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
        private String requestId; 
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

        private Builder(GetVirusScanScheduledStrategyResponseBody model) {
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
            this.requestId = model.requestId;
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
         * <p>The time when the policy was created, in the format of yyyy-MM-dd HH:mm:ss in the UTC+8 time zone.</p>
         * 
         * <strong>example:</strong>
         * <p>2026-08-21 10:24:31</p>
         */
        public Builder createTime(String createTime) {
            this.createTime = createTime;
            return this;
        }

        /**
         * <p>The effective scope specified by organizational structure.</p>
         */
        public Builder customMatchGroup(java.util.List<CustomMatchGroup> customMatchGroup) {
            this.customMatchGroup = customMatchGroup;
            return this;
        }

        /**
         * <p>The action to take on high-risk virus files. Valid values:</p>
         * <ul>
         * <li><strong>Quarantine</strong>: Quarantine quarantined file.</li>
         * <li><strong>Notify</strong>: Only report an alert without taking action on quarantined file.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Quarantine</p>
         */
        public Builder highRiskOperation(String highRiskOperation) {
            this.highRiskOperation = highRiskOperation;
            return this;
        }

        /**
         * <p>The time when the policy last triggered a scan, in the format of yyyy-MM-dd HH:mm:ss in the UTC+8 time zone. An empty string is returned if the policy has never been triggered.</p>
         * 
         * <strong>example:</strong>
         * <p>2026-08-21 01:00:03</p>
         */
        public Builder lastTriggerTime(String lastTriggerTime) {
            this.lastTriggerTime = lastTriggerTime;
            return this;
        }

        /**
         * <p>The action to take on low-risk virus files. Valid values:</p>
         * <ul>
         * <li><strong>Quarantine</strong>: Quarantine quarantined file.</li>
         * <li><strong>Notify</strong>: Only report an alert without taking action on quarantined file.</li>
         * <li><strong>None</strong>: No action.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>None</p>
         */
        public Builder lowRiskOperation(String lowRiskOperation) {
            this.lowRiskOperation = lowRiskOperation;
            return this;
        }

        /**
         * <p>The matching method for the effective scope. Valid values:</p>
         * <ul>
         * <li><strong>UserGroupAll</strong>: Applies to all users under the current Alibaba Cloud account.</li>
         * <li><strong>UserGroupNormal</strong>: Applies only to users in specified user groups.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>UserGroupNormal</p>
         */
        public Builder matchMode(String matchMode) {
            this.matchMode = matchMode;
            return this;
        }

        /**
         * <p>The collection of user group IDs within the effective scope. An empty list is returned when MatchMode is set to UserGroupAll.</p>
         */
        public Builder matchTargetIds(java.util.List<String> matchTargetIds) {
            this.matchTargetIds = matchTargetIds;
            return this;
        }

        /**
         * <p>The maximum percentage of endpoint CPU usage allowed during the scan.</p>
         * 
         * <strong>example:</strong>
         * <p>30</p>
         */
        public Builder maxCpuUsage(Long maxCpuUsage) {
            this.maxCpuUsage = maxCpuUsage;
            return this;
        }

        /**
         * <p>The action to take on medium-risk virus files. Valid values:</p>
         * <ul>
         * <li><strong>Quarantine</strong>: Quarantine quarantined file.</li>
         * <li><strong>Notify</strong>: Only report an alert without taking action on quarantined file.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Notify</p>
         */
        public Builder midRiskOperation(String midRiskOperation) {
            this.midRiskOperation = midRiskOperation;
            return this;
        }

        /**
         * <p>The scan performance schema pattern. Valid values:</p>
         * <ul>
         * <li><strong>SecurityFirst</strong>: Security first. The default CPU usage upper limit is 50%.</li>
         * <li><strong>Balance</strong>: Balanced. The default CPU usage upper limit is 30%.</li>
         * <li><strong>ExperienceFirst</strong>: Experience first. The default CPU usage upper limit is 15%.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Balance</p>
         */
        public Builder performanceMode(String performanceMode) {
            this.performanceMode = performanceMode;
            return this;
        }

        /**
         * <p>The policy priority. A smaller value indicates a higher priority.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder priority(Integer priority) {
            this.priority = priority;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>3D7EC0AF-DB2A-5D9C-90EC-F090A6BAAEA7</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The start hour during which the scan can be triggered. The value is a whole hour number ranging from 0 to 23, inclusive. This field is not a timestamp.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder scanBeginTime(Integer scanBeginTime) {
            this.scanBeginTime = scanBeginTime;
            return this;
        }

        /**
         * <p>The end hour during which the scan can be triggered. The value is a whole hour number ranging from 1 to 24, exclusive of the specified hour, and must be greater than ScanBeginTime. The scan task generated by each trigger expires at this hour on the same day. This field is not a timestamp.</p>
         * 
         * <strong>example:</strong>
         * <p>6</p>
         */
        public Builder scanEndTime(Integer scanEndTime) {
            this.scanEndTime = scanEndTime;
            return this;
        }

        /**
         * <p>The unit of the trigger cycle. Valid values:</p>
         * <ul>
         * <li><strong>day</strong>: By day.</li>
         * <li><strong>week</strong>: By week.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>week</p>
         */
        public Builder scanFrequency(String scanFrequency) {
            this.scanFrequency = scanFrequency;
            return this;
        }

        /**
         * <p>The interval number of the trigger cycle, which determines the trigger cycle together with ScanFrequency. For example, if ScanFrequency is set to week and ScanInterval is set to 1, the scan is triggered once a week.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder scanInterval(Integer scanInterval) {
            this.scanInterval = scanInterval;
            return this;
        }

        /**
         * <p>The scan path scope. Valid values:</p>
         * <ul>
         * <li><strong>Quick</strong>: Quick scan. Only scans critical system directories and common risk locations.</li>
         * <li><strong>Full</strong>: Full disk scan.</li>
         * <li><strong>Custom</strong>: Custom path scan.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Quick</p>
         */
        public Builder scanMode(String scanMode) {
            this.scanMode = scanMode;
            return this;
        }

        /**
         * <p>The collection of custom scan paths.</p>
         */
        public Builder scanPath(java.util.List<String> scanPath) {
            this.scanPath = scanPath;
            return this;
        }

        /**
         * <p>The collection of virus types to be handled in this scan.</p>
         */
        public Builder scanTargets(java.util.List<String> scanTargets) {
            this.scanTargets = scanTargets;
            return this;
        }

        /**
         * <p>The enabled status. Valid values:</p>
         * <ul>
         * <li><strong>Enabled</strong>: Enabled.</li>
         * <li><strong>Disabled</strong>: Disabled.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Enabled</p>
         */
        public Builder status(String status) {
            this.status = status;
            return this;
        }

        /**
         * <p>The policy description.</p>
         * 
         * <strong>example:</strong>
         * <p>Full disk scan for R&amp;D department endpoints every Sunday at midnight</p>
         */
        public Builder strategyDescription(String strategyDescription) {
            this.strategyDescription = strategyDescription;
            return this;
        }

        /**
         * <p>The ID of the scheduled virus scan policy.</p>
         * 
         * <strong>example:</strong>
         * <p>vc-strategy-8a3f6c2e91b7****</p>
         */
        public Builder strategyId(String strategyId) {
            this.strategyId = strategyId;
            return this;
        }

        /**
         * <p>The policy name.</p>
         * 
         * <strong>example:</strong>
         * <p>Weekly scan for R&amp;D department</p>
         */
        public Builder strategyName(String strategyName) {
            this.strategyName = strategyName;
            return this;
        }

        /**
         * <p>The list of exempted users. Users in this list are excluded from the scan policy. An empty list is returned if no exemptions are configured.</p>
         */
        public Builder whitelist(java.util.List<String> whitelist) {
            this.whitelist = whitelist;
            return this;
        }

        public GetVirusScanScheduledStrategyResponseBody build() {
            return new GetVirusScanScheduledStrategyResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetVirusScanScheduledStrategyResponseBody} extends {@link TeaModel}
     *
     * <p>GetVirusScanScheduledStrategyResponseBody</p>
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
             * <p>The collection of organizational structure nodes.</p>
             */
            public Builder group(java.util.List<String> group) {
                this.group = group;
                return this;
            }

            /**
             * <p>The identity provider ID.</p>
             * 
             * <strong>example:</strong>
             * <p>idp-7c3f9a2e5b18****</p>
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
}
