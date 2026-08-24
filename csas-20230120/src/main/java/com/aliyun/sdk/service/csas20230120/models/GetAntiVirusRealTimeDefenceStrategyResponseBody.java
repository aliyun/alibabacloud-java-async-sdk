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
 * {@link GetAntiVirusRealTimeDefenceStrategyResponseBody} extends {@link TeaModel}
 *
 * <p>GetAntiVirusRealTimeDefenceStrategyResponseBody</p>
 */
public class GetAntiVirusRealTimeDefenceStrategyResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("HighRiskOperation")
    private String highRiskOperation;

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

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("ScanTargets")
    private java.util.List<String> scanTargets;

    @com.aliyun.core.annotation.NameInMap("Status")
    private String status;

    @com.aliyun.core.annotation.NameInMap("StrategyId")
    private String strategyId;

    @com.aliyun.core.annotation.NameInMap("Whitelist")
    private java.util.List<String> whitelist;

    private GetAntiVirusRealTimeDefenceStrategyResponseBody(Builder builder) {
        this.highRiskOperation = builder.highRiskOperation;
        this.lowRiskOperation = builder.lowRiskOperation;
        this.matchMode = builder.matchMode;
        this.matchTargetIds = builder.matchTargetIds;
        this.maxCpuUsage = builder.maxCpuUsage;
        this.midRiskOperation = builder.midRiskOperation;
        this.requestId = builder.requestId;
        this.scanTargets = builder.scanTargets;
        this.status = builder.status;
        this.strategyId = builder.strategyId;
        this.whitelist = builder.whitelist;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetAntiVirusRealTimeDefenceStrategyResponseBody create() {
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
     * @return whitelist
     */
    public java.util.List<String> getWhitelist() {
        return this.whitelist;
    }

    public static final class Builder {
        private String highRiskOperation; 
        private String lowRiskOperation; 
        private String matchMode; 
        private java.util.List<String> matchTargetIds; 
        private Long maxCpuUsage; 
        private String midRiskOperation; 
        private String requestId; 
        private java.util.List<String> scanTargets; 
        private String status; 
        private String strategyId; 
        private java.util.List<String> whitelist; 

        private Builder() {
        } 

        private Builder(GetAntiVirusRealTimeDefenceStrategyResponseBody model) {
            this.highRiskOperation = model.highRiskOperation;
            this.lowRiskOperation = model.lowRiskOperation;
            this.matchMode = model.matchMode;
            this.matchTargetIds = model.matchTargetIds;
            this.maxCpuUsage = model.maxCpuUsage;
            this.midRiskOperation = model.midRiskOperation;
            this.requestId = model.requestId;
            this.scanTargets = model.scanTargets;
            this.status = model.status;
            this.strategyId = model.strategyId;
            this.whitelist = model.whitelist;
        } 

        /**
         * HighRiskOperation.
         */
        public Builder highRiskOperation(String highRiskOperation) {
            this.highRiskOperation = highRiskOperation;
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
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
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
         * StrategyId.
         */
        public Builder strategyId(String strategyId) {
            this.strategyId = strategyId;
            return this;
        }

        /**
         * Whitelist.
         */
        public Builder whitelist(java.util.List<String> whitelist) {
            this.whitelist = whitelist;
            return this;
        }

        public GetAntiVirusRealTimeDefenceStrategyResponseBody build() {
            return new GetAntiVirusRealTimeDefenceStrategyResponseBody(this);
        } 

    } 

}
