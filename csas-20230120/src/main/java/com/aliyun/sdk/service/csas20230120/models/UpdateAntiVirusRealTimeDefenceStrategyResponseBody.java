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
 * {@link UpdateAntiVirusRealTimeDefenceStrategyResponseBody} extends {@link TeaModel}
 *
 * <p>UpdateAntiVirusRealTimeDefenceStrategyResponseBody</p>
 */
public class UpdateAntiVirusRealTimeDefenceStrategyResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("HighRiskOperation")
    private String highRiskOperation;

    @com.aliyun.core.annotation.NameInMap("LowRiskOperation")
    private String lowRiskOperation;

    @com.aliyun.core.annotation.NameInMap("MatchMode")
    private String matchMode;

    @com.aliyun.core.annotation.NameInMap("MidRiskOperation")
    private String midRiskOperation;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("ScanTargets")
    private java.util.List<String> scanTargets;

    @com.aliyun.core.annotation.NameInMap("Status")
    private String status;

    @com.aliyun.core.annotation.NameInMap("StrategyId")
    private String strategyId;

    @com.aliyun.core.annotation.NameInMap("UserGroupIds")
    private java.util.List<String> userGroupIds;

    @com.aliyun.core.annotation.NameInMap("Whitelist")
    private java.util.List<String> whitelist;

    private UpdateAntiVirusRealTimeDefenceStrategyResponseBody(Builder builder) {
        this.highRiskOperation = builder.highRiskOperation;
        this.lowRiskOperation = builder.lowRiskOperation;
        this.matchMode = builder.matchMode;
        this.midRiskOperation = builder.midRiskOperation;
        this.requestId = builder.requestId;
        this.scanTargets = builder.scanTargets;
        this.status = builder.status;
        this.strategyId = builder.strategyId;
        this.userGroupIds = builder.userGroupIds;
        this.whitelist = builder.whitelist;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateAntiVirusRealTimeDefenceStrategyResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
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
     * @return midRiskOperation
     */
    public String getMidRiskOperation() {
        return this.midRiskOperation;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
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
     * @return strategyId
     */
    public String getStrategyId() {
        return this.strategyId;
    }

    /**
     * @return userGroupIds
     */
    public java.util.List<String> getUserGroupIds() {
        return this.userGroupIds;
    }

    /**
     * @return whitelist
     */
    public java.util.List<String> getWhitelist() {
        return this.whitelist;
    }

    public static final class Builder {
        private String highRiskOperation; 
        private String lowRiskOperation; 
        private String matchMode; 
        private String midRiskOperation; 
        private String requestId; 
        private java.util.List<String> scanTargets; 
        private String status; 
        private String strategyId; 
        private java.util.List<String> userGroupIds; 
        private java.util.List<String> whitelist; 

        private Builder() {
        } 

        private Builder(UpdateAntiVirusRealTimeDefenceStrategyResponseBody model) {
            this.highRiskOperation = model.highRiskOperation;
            this.lowRiskOperation = model.lowRiskOperation;
            this.matchMode = model.matchMode;
            this.midRiskOperation = model.midRiskOperation;
            this.requestId = model.requestId;
            this.scanTargets = model.scanTargets;
            this.status = model.status;
            this.strategyId = model.strategyId;
            this.userGroupIds = model.userGroupIds;
            this.whitelist = model.whitelist;
        } 

        /**
         * <p>The action to take on high-risk virus files. Valid values:</p>
         * <ul>
         * <li><strong>Quarantine</strong>: Quarantines quarantined file.</li>
         * <li><strong>Notify</strong>: Reports an alert only without taking action on quarantined file. Quarantine is returned if no real-time defense policy has been configured.</li>
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
         * <p>The action to take on low-risk virus files. Valid values:</p>
         * <ul>
         * <li><strong>Quarantine</strong>: Quarantines quarantined file.</li>
         * <li><strong>Notify</strong>: Reports an alert only without taking action on quarantined file.</li>
         * <li><strong>None</strong>: Takes no action. None is returned if no real-time defense policy has been configured.</li>
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
         * <p>The matching mode for the effective scope. Valid values:</p>
         * <ul>
         * <li><strong>UserGroupAll</strong>: Applies to all users under the current Alibaba Cloud account.</li>
         * <li><strong>UserGroupNormal</strong>: Applies only to users in specified user groups. An empty string is returned if no real-time defense policy has been configured.</li>
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
         * <p>The action to take on medium-risk virus files. Valid values:</p>
         * <ul>
         * <li><strong>Quarantine</strong>: Quarantines quarantined file.</li>
         * <li><strong>Notify</strong>: Reports an alert only without taking action on quarantined file. Notify is returned if no real-time defense policy has been configured.</li>
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
         * <p>The collection of virus types to be handled by real-time defense. An empty list is returned if no real-time defense policy has been configured.</p>
         */
        public Builder scanTargets(java.util.List<String> scanTargets) {
            this.scanTargets = scanTargets;
            return this;
        }

        /**
         * <p>The enabling status. Valid values:</p>
         * <ul>
         * <li><strong>Enabled</strong>: Enabled.</li>
         * <li><strong>Disabled</strong>: Disabled. This value is returned if no real-time defense policy has been configured.</li>
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
         * <p>The real-time defense policy ID. An empty string is returned if no real-time defense policy has been configured.</p>
         * 
         * <strong>example:</strong>
         * <p>av-rtd-2f5c8e1a7b94****</p>
         */
        public Builder strategyId(String strategyId) {
            this.strategyId = strategyId;
            return this;
        }

        /**
         * <p>The collection of user group IDs to which the policy applies. An empty list is returned when MatchMode is set to UserGroupAll.</p>
         */
        public Builder userGroupIds(java.util.List<String> userGroupIds) {
            this.userGroupIds = userGroupIds;
            return this;
        }

        /**
         * <p>The exception user list. Users in this list are excluded from real-time defense. An empty list is returned if no exception users are configured.</p>
         */
        public Builder whitelist(java.util.List<String> whitelist) {
            this.whitelist = whitelist;
            return this;
        }

        public UpdateAntiVirusRealTimeDefenceStrategyResponseBody build() {
            return new UpdateAntiVirusRealTimeDefenceStrategyResponseBody(this);
        } 

    } 

}
