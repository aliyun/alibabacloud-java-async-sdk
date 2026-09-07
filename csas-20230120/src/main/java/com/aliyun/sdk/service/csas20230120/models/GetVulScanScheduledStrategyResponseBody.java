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
 * {@link GetVulScanScheduledStrategyResponseBody} extends {@link TeaModel}
 *
 * <p>GetVulScanScheduledStrategyResponseBody</p>
 */
public class GetVulScanScheduledStrategyResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("CreateTime")
    private Long createTime;

    @com.aliyun.core.annotation.NameInMap("CustomMatchGroup")
    private java.util.List<CustomMatchGroup> customMatchGroup;

    @com.aliyun.core.annotation.NameInMap("LastTriggerTime")
    private Long lastTriggerTime;

    @com.aliyun.core.annotation.NameInMap("MatchMode")
    private String matchMode;

    @com.aliyun.core.annotation.NameInMap("MatchTargetIds")
    private java.util.List<String> matchTargetIds;

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

    private GetVulScanScheduledStrategyResponseBody(Builder builder) {
        this.createTime = builder.createTime;
        this.customMatchGroup = builder.customMatchGroup;
        this.lastTriggerTime = builder.lastTriggerTime;
        this.matchMode = builder.matchMode;
        this.matchTargetIds = builder.matchTargetIds;
        this.priority = builder.priority;
        this.requestId = builder.requestId;
        this.scanBeginTime = builder.scanBeginTime;
        this.scanEndTime = builder.scanEndTime;
        this.scanFrequency = builder.scanFrequency;
        this.scanInterval = builder.scanInterval;
        this.status = builder.status;
        this.strategyDescription = builder.strategyDescription;
        this.strategyId = builder.strategyId;
        this.strategyName = builder.strategyName;
        this.whitelist = builder.whitelist;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetVulScanScheduledStrategyResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
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
     * @return lastTriggerTime
     */
    public Long getLastTriggerTime() {
        return this.lastTriggerTime;
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
        private Long createTime; 
        private java.util.List<CustomMatchGroup> customMatchGroup; 
        private Long lastTriggerTime; 
        private String matchMode; 
        private java.util.List<String> matchTargetIds; 
        private Integer priority; 
        private String requestId; 
        private Integer scanBeginTime; 
        private Integer scanEndTime; 
        private String scanFrequency; 
        private Integer scanInterval; 
        private String status; 
        private String strategyDescription; 
        private String strategyId; 
        private String strategyName; 
        private java.util.List<String> whitelist; 

        private Builder() {
        } 

        private Builder(GetVulScanScheduledStrategyResponseBody model) {
            this.createTime = model.createTime;
            this.customMatchGroup = model.customMatchGroup;
            this.lastTriggerTime = model.lastTriggerTime;
            this.matchMode = model.matchMode;
            this.matchTargetIds = model.matchTargetIds;
            this.priority = model.priority;
            this.requestId = model.requestId;
            this.scanBeginTime = model.scanBeginTime;
            this.scanEndTime = model.scanEndTime;
            this.scanFrequency = model.scanFrequency;
            this.scanInterval = model.scanInterval;
            this.status = model.status;
            this.strategyDescription = model.strategyDescription;
            this.strategyId = model.strategyId;
            this.strategyName = model.strategyName;
            this.whitelist = model.whitelist;
        } 

        /**
         * <p>The time when the policy was created, in seconds-level UNIX timestamp.</p>
         * 
         * <strong>example:</strong>
         * <p>1786291200</p>
         */
        public Builder createTime(Long createTime) {
            this.createTime = createTime;
            return this;
        }

        /**
         * <p>The effective scope specified by organizational structure. An empty list is returned if the scope is not configured by organizational structure.</p>
         */
        public Builder customMatchGroup(java.util.List<CustomMatchGroup> customMatchGroup) {
            this.customMatchGroup = customMatchGroup;
            return this;
        }

        /**
         * <p>The time when the policy last triggered a scan, in seconds-level UNIX timestamp. The value 0 is returned if the policy has never been triggered.</p>
         * 
         * <strong>example:</strong>
         * <p>1786291200</p>
         */
        public Builder lastTriggerTime(Long lastTriggerTime) {
            this.lastTriggerTime = lastTriggerTime;
            return this;
        }

        /**
         * <p>The matching mode of the effective scope. Valid values:</p>
         * <ul>
         * <li><strong>UserGroupAll</strong>: The policy takes effect on all users under the current Alibaba Cloud account.</li>
         * <li><strong>UserGroupNormal</strong>: The policy takes effect only on users in specified user groups.</li>
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
         * <p>The collection of user group IDs that the policy takes effect on. An empty list is returned when MatchMode is set to UserGroupAll.</p>
         */
        public Builder matchTargetIds(java.util.List<String> matchTargetIds) {
            this.matchTargetIds = matchTargetIds;
            return this;
        }

        /**
         * <p>The policy priority. A smaller value indicates a higher priority. Valid values: 1 to 100.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder priority(Integer priority) {
            this.priority = priority;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>3D7EC0AF-DB2A-5D9C-90EC-F090A6BAAEA7</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The start hour during which the scan can be triggered. The value is a whole hour number. Valid values: 0 to 23, inclusive. This field is not a timestamp.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder scanBeginTime(Integer scanBeginTime) {
            this.scanBeginTime = scanBeginTime;
            return this;
        }

        /**
         * <p>The end hour during which the scan can be triggered. The value is a whole hour number. Valid values: 1 to 24, exclusive of the specified hour, and must be greater than ScanBeginTime. This field is not a timestamp.</p>
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
         * <li><strong>day</strong>: by day.</li>
         * <li><strong>week</strong>: by week.</li>
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
         * <p>The interval number of the trigger cycle, which together with ScanFrequency determines the trigger cycle. Valid values: 1 to 30. For example, if ScanFrequency is set to week and ScanInterval is set to 1, the scan is triggered once a week.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder scanInterval(Integer scanInterval) {
            this.scanInterval = scanInterval;
            return this;
        }

        /**
         * <p>The enabling status. Valid values:</p>
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
         * <p>Execute vulnerability scanning on R&amp;D department endpoints every Sunday at midnight</p>
         */
        public Builder strategyDescription(String strategyDescription) {
            this.strategyDescription = strategyDescription;
            return this;
        }

        /**
         * <p>The vulnerability scheduled scan policy ID.</p>
         * 
         * <strong>example:</strong>
         * <p>vul-scan-scheduled-strategy-8a3f6c2e91b7****</p>
         */
        public Builder strategyId(String strategyId) {
            this.strategyId = strategyId;
            return this;
        }

        /**
         * <p>The policy name.</p>
         * 
         * <strong>example:</strong>
         * <p>Weekly vulnerability scanning for R&amp;D Department</p>
         */
        public Builder strategyName(String strategyName) {
            this.strategyName = strategyName;
            return this;
        }

        /**
         * <p>The list of exempted users. Users in this list are excluded from the scan of this policy. An empty list is returned if no exemption is configured.</p>
         */
        public Builder whitelist(java.util.List<String> whitelist) {
            this.whitelist = whitelist;
            return this;
        }

        public GetVulScanScheduledStrategyResponseBody build() {
            return new GetVulScanScheduledStrategyResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetVulScanScheduledStrategyResponseBody} extends {@link TeaModel}
     *
     * <p>GetVulScanScheduledStrategyResponseBody</p>
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
