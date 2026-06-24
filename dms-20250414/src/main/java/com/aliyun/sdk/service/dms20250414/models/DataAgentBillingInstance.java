// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dms20250414.models;

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
 * {@link DataAgentBillingInstance} extends {@link TeaModel}
 *
 * <p>DataAgentBillingInstance</p>
 */
public class DataAgentBillingInstance extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("AgentSeats")
    private Integer agentSeats;

    @com.aliyun.core.annotation.NameInMap("BillingInstanceId")
    private String billingInstanceId;

    @com.aliyun.core.annotation.NameInMap("BoundWorkspaceIds")
    private java.util.List<String> boundWorkspaceIds;

    @com.aliyun.core.annotation.NameInMap("ChargeType")
    private String chargeType;

    @com.aliyun.core.annotation.NameInMap("CommodityCode")
    private String commodityCode;

    @com.aliyun.core.annotation.NameInMap("ExpireTime")
    private Long expireTime;

    @com.aliyun.core.annotation.NameInMap("FreeAgentSeats")
    private Integer freeAgentSeats;

    @com.aliyun.core.annotation.NameInMap("GmtCreated")
    private Long gmtCreated;

    @com.aliyun.core.annotation.NameInMap("GmtModified")
    private Long gmtModified;

    @com.aliyun.core.annotation.NameInMap("IsDefault")
    private Boolean isDefault;

    @com.aliyun.core.annotation.NameInMap("LLM")
    private Integer LLM;

    @com.aliyun.core.annotation.NameInMap("PayLevel")
    private String payLevel;

    @com.aliyun.core.annotation.NameInMap("SessionAvailableDurationQuota")
    private Integer sessionAvailableDurationQuota;

    @com.aliyun.core.annotation.NameInMap("SessionSeats")
    private Integer sessionSeats;

    @com.aliyun.core.annotation.NameInMap("TokenLimit")
    private Integer tokenLimit;

    private DataAgentBillingInstance(Builder builder) {
        this.agentSeats = builder.agentSeats;
        this.billingInstanceId = builder.billingInstanceId;
        this.boundWorkspaceIds = builder.boundWorkspaceIds;
        this.chargeType = builder.chargeType;
        this.commodityCode = builder.commodityCode;
        this.expireTime = builder.expireTime;
        this.freeAgentSeats = builder.freeAgentSeats;
        this.gmtCreated = builder.gmtCreated;
        this.gmtModified = builder.gmtModified;
        this.isDefault = builder.isDefault;
        this.LLM = builder.LLM;
        this.payLevel = builder.payLevel;
        this.sessionAvailableDurationQuota = builder.sessionAvailableDurationQuota;
        this.sessionSeats = builder.sessionSeats;
        this.tokenLimit = builder.tokenLimit;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DataAgentBillingInstance create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return agentSeats
     */
    public Integer getAgentSeats() {
        return this.agentSeats;
    }

    /**
     * @return billingInstanceId
     */
    public String getBillingInstanceId() {
        return this.billingInstanceId;
    }

    /**
     * @return boundWorkspaceIds
     */
    public java.util.List<String> getBoundWorkspaceIds() {
        return this.boundWorkspaceIds;
    }

    /**
     * @return chargeType
     */
    public String getChargeType() {
        return this.chargeType;
    }

    /**
     * @return commodityCode
     */
    public String getCommodityCode() {
        return this.commodityCode;
    }

    /**
     * @return expireTime
     */
    public Long getExpireTime() {
        return this.expireTime;
    }

    /**
     * @return freeAgentSeats
     */
    public Integer getFreeAgentSeats() {
        return this.freeAgentSeats;
    }

    /**
     * @return gmtCreated
     */
    public Long getGmtCreated() {
        return this.gmtCreated;
    }

    /**
     * @return gmtModified
     */
    public Long getGmtModified() {
        return this.gmtModified;
    }

    /**
     * @return isDefault
     */
    public Boolean getIsDefault() {
        return this.isDefault;
    }

    /**
     * @return LLM
     */
    public Integer getLLM() {
        return this.LLM;
    }

    /**
     * @return payLevel
     */
    public String getPayLevel() {
        return this.payLevel;
    }

    /**
     * @return sessionAvailableDurationQuota
     */
    public Integer getSessionAvailableDurationQuota() {
        return this.sessionAvailableDurationQuota;
    }

    /**
     * @return sessionSeats
     */
    public Integer getSessionSeats() {
        return this.sessionSeats;
    }

    /**
     * @return tokenLimit
     */
    public Integer getTokenLimit() {
        return this.tokenLimit;
    }

    public static final class Builder {
        private Integer agentSeats; 
        private String billingInstanceId; 
        private java.util.List<String> boundWorkspaceIds; 
        private String chargeType; 
        private String commodityCode; 
        private Long expireTime; 
        private Integer freeAgentSeats; 
        private Long gmtCreated; 
        private Long gmtModified; 
        private Boolean isDefault; 
        private Integer LLM; 
        private String payLevel; 
        private Integer sessionAvailableDurationQuota; 
        private Integer sessionSeats; 
        private Integer tokenLimit; 

        private Builder() {
        } 

        private Builder(DataAgentBillingInstance model) {
            this.agentSeats = model.agentSeats;
            this.billingInstanceId = model.billingInstanceId;
            this.boundWorkspaceIds = model.boundWorkspaceIds;
            this.chargeType = model.chargeType;
            this.commodityCode = model.commodityCode;
            this.expireTime = model.expireTime;
            this.freeAgentSeats = model.freeAgentSeats;
            this.gmtCreated = model.gmtCreated;
            this.gmtModified = model.gmtModified;
            this.isDefault = model.isDefault;
            this.LLM = model.LLM;
            this.payLevel = model.payLevel;
            this.sessionAvailableDurationQuota = model.sessionAvailableDurationQuota;
            this.sessionSeats = model.sessionSeats;
            this.tokenLimit = model.tokenLimit;
        } 

        /**
         * AgentSeats.
         */
        public Builder agentSeats(Integer agentSeats) {
            this.agentSeats = agentSeats;
            return this;
        }

        /**
         * BillingInstanceId.
         */
        public Builder billingInstanceId(String billingInstanceId) {
            this.billingInstanceId = billingInstanceId;
            return this;
        }

        /**
         * BoundWorkspaceIds.
         */
        public Builder boundWorkspaceIds(java.util.List<String> boundWorkspaceIds) {
            this.boundWorkspaceIds = boundWorkspaceIds;
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
         * CommodityCode.
         */
        public Builder commodityCode(String commodityCode) {
            this.commodityCode = commodityCode;
            return this;
        }

        /**
         * ExpireTime.
         */
        public Builder expireTime(Long expireTime) {
            this.expireTime = expireTime;
            return this;
        }

        /**
         * FreeAgentSeats.
         */
        public Builder freeAgentSeats(Integer freeAgentSeats) {
            this.freeAgentSeats = freeAgentSeats;
            return this;
        }

        /**
         * GmtCreated.
         */
        public Builder gmtCreated(Long gmtCreated) {
            this.gmtCreated = gmtCreated;
            return this;
        }

        /**
         * GmtModified.
         */
        public Builder gmtModified(Long gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }

        /**
         * IsDefault.
         */
        public Builder isDefault(Boolean isDefault) {
            this.isDefault = isDefault;
            return this;
        }

        /**
         * LLM.
         */
        public Builder LLM(Integer LLM) {
            this.LLM = LLM;
            return this;
        }

        /**
         * PayLevel.
         */
        public Builder payLevel(String payLevel) {
            this.payLevel = payLevel;
            return this;
        }

        /**
         * SessionAvailableDurationQuota.
         */
        public Builder sessionAvailableDurationQuota(Integer sessionAvailableDurationQuota) {
            this.sessionAvailableDurationQuota = sessionAvailableDurationQuota;
            return this;
        }

        /**
         * SessionSeats.
         */
        public Builder sessionSeats(Integer sessionSeats) {
            this.sessionSeats = sessionSeats;
            return this;
        }

        /**
         * TokenLimit.
         */
        public Builder tokenLimit(Integer tokenLimit) {
            this.tokenLimit = tokenLimit;
            return this;
        }

        public DataAgentBillingInstance build() {
            return new DataAgentBillingInstance(this);
        } 

    } 

}
