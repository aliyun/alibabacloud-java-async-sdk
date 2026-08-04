// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aicontent20240611.models;

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
 * {@link BillingCostBreakdownRowDTO} extends {@link TeaModel}
 *
 * <p>BillingCostBreakdownRowDTO</p>
 */
public class BillingCostBreakdownRowDTO extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("apiKeyId")
    private Long apiKeyId;

    @com.aliyun.core.annotation.NameInMap("apiKeyName")
    private String apiKeyName;

    @com.aliyun.core.annotation.NameInMap("billingType")
    private String billingType;

    @com.aliyun.core.annotation.NameInMap("clientId")
    private Long clientId;

    @com.aliyun.core.annotation.NameInMap("clientName")
    private String clientName;

    @com.aliyun.core.annotation.NameInMap("dimValues")
    private String dimValues;

    @com.aliyun.core.annotation.NameInMap("memberUserId")
    private Long memberUserId;

    @com.aliyun.core.annotation.NameInMap("memberUserName")
    private String memberUserName;

    @com.aliyun.core.annotation.NameInMap("modelCode")
    private String modelCode;

    @com.aliyun.core.annotation.NameInMap("modelId")
    private Long modelId;

    @com.aliyun.core.annotation.NameInMap("modelName")
    private String modelName;

    @com.aliyun.core.annotation.NameInMap("modelSymbol")
    private String modelSymbol;

    @com.aliyun.core.annotation.NameInMap("modelType")
    private String modelType;

    @com.aliyun.core.annotation.NameInMap("modelVersion")
    private Integer modelVersion;

    @com.aliyun.core.annotation.NameInMap("payableAmount")
    private Float payableAmount;

    @com.aliyun.core.annotation.NameInMap("summaryTime")
    private Long summaryTime;

    @com.aliyun.core.annotation.NameInMap("tiers")
    private java.util.List<BillingBillTierDTO> tiers;

    @com.aliyun.core.annotation.NameInMap("values")
    private String values;

    private BillingCostBreakdownRowDTO(Builder builder) {
        this.apiKeyId = builder.apiKeyId;
        this.apiKeyName = builder.apiKeyName;
        this.billingType = builder.billingType;
        this.clientId = builder.clientId;
        this.clientName = builder.clientName;
        this.dimValues = builder.dimValues;
        this.memberUserId = builder.memberUserId;
        this.memberUserName = builder.memberUserName;
        this.modelCode = builder.modelCode;
        this.modelId = builder.modelId;
        this.modelName = builder.modelName;
        this.modelSymbol = builder.modelSymbol;
        this.modelType = builder.modelType;
        this.modelVersion = builder.modelVersion;
        this.payableAmount = builder.payableAmount;
        this.summaryTime = builder.summaryTime;
        this.tiers = builder.tiers;
        this.values = builder.values;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static BillingCostBreakdownRowDTO create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return apiKeyId
     */
    public Long getApiKeyId() {
        return this.apiKeyId;
    }

    /**
     * @return apiKeyName
     */
    public String getApiKeyName() {
        return this.apiKeyName;
    }

    /**
     * @return billingType
     */
    public String getBillingType() {
        return this.billingType;
    }

    /**
     * @return clientId
     */
    public Long getClientId() {
        return this.clientId;
    }

    /**
     * @return clientName
     */
    public String getClientName() {
        return this.clientName;
    }

    /**
     * @return dimValues
     */
    public String getDimValues() {
        return this.dimValues;
    }

    /**
     * @return memberUserId
     */
    public Long getMemberUserId() {
        return this.memberUserId;
    }

    /**
     * @return memberUserName
     */
    public String getMemberUserName() {
        return this.memberUserName;
    }

    /**
     * @return modelCode
     */
    public String getModelCode() {
        return this.modelCode;
    }

    /**
     * @return modelId
     */
    public Long getModelId() {
        return this.modelId;
    }

    /**
     * @return modelName
     */
    public String getModelName() {
        return this.modelName;
    }

    /**
     * @return modelSymbol
     */
    public String getModelSymbol() {
        return this.modelSymbol;
    }

    /**
     * @return modelType
     */
    public String getModelType() {
        return this.modelType;
    }

    /**
     * @return modelVersion
     */
    public Integer getModelVersion() {
        return this.modelVersion;
    }

    /**
     * @return payableAmount
     */
    public Float getPayableAmount() {
        return this.payableAmount;
    }

    /**
     * @return summaryTime
     */
    public Long getSummaryTime() {
        return this.summaryTime;
    }

    /**
     * @return tiers
     */
    public java.util.List<BillingBillTierDTO> getTiers() {
        return this.tiers;
    }

    /**
     * @return values
     */
    public String getValues() {
        return this.values;
    }

    public static final class Builder {
        private Long apiKeyId; 
        private String apiKeyName; 
        private String billingType; 
        private Long clientId; 
        private String clientName; 
        private String dimValues; 
        private Long memberUserId; 
        private String memberUserName; 
        private String modelCode; 
        private Long modelId; 
        private String modelName; 
        private String modelSymbol; 
        private String modelType; 
        private Integer modelVersion; 
        private Float payableAmount; 
        private Long summaryTime; 
        private java.util.List<BillingBillTierDTO> tiers; 
        private String values; 

        private Builder() {
        } 

        private Builder(BillingCostBreakdownRowDTO model) {
            this.apiKeyId = model.apiKeyId;
            this.apiKeyName = model.apiKeyName;
            this.billingType = model.billingType;
            this.clientId = model.clientId;
            this.clientName = model.clientName;
            this.dimValues = model.dimValues;
            this.memberUserId = model.memberUserId;
            this.memberUserName = model.memberUserName;
            this.modelCode = model.modelCode;
            this.modelId = model.modelId;
            this.modelName = model.modelName;
            this.modelSymbol = model.modelSymbol;
            this.modelType = model.modelType;
            this.modelVersion = model.modelVersion;
            this.payableAmount = model.payableAmount;
            this.summaryTime = model.summaryTime;
            this.tiers = model.tiers;
            this.values = model.values;
        } 

        /**
         * apiKeyId.
         */
        public Builder apiKeyId(Long apiKeyId) {
            this.apiKeyId = apiKeyId;
            return this;
        }

        /**
         * apiKeyName.
         */
        public Builder apiKeyName(String apiKeyName) {
            this.apiKeyName = apiKeyName;
            return this;
        }

        /**
         * billingType.
         */
        public Builder billingType(String billingType) {
            this.billingType = billingType;
            return this;
        }

        /**
         * clientId.
         */
        public Builder clientId(Long clientId) {
            this.clientId = clientId;
            return this;
        }

        /**
         * clientName.
         */
        public Builder clientName(String clientName) {
            this.clientName = clientName;
            return this;
        }

        /**
         * dimValues.
         */
        public Builder dimValues(String dimValues) {
            this.dimValues = dimValues;
            return this;
        }

        /**
         * memberUserId.
         */
        public Builder memberUserId(Long memberUserId) {
            this.memberUserId = memberUserId;
            return this;
        }

        /**
         * memberUserName.
         */
        public Builder memberUserName(String memberUserName) {
            this.memberUserName = memberUserName;
            return this;
        }

        /**
         * modelCode.
         */
        public Builder modelCode(String modelCode) {
            this.modelCode = modelCode;
            return this;
        }

        /**
         * modelId.
         */
        public Builder modelId(Long modelId) {
            this.modelId = modelId;
            return this;
        }

        /**
         * modelName.
         */
        public Builder modelName(String modelName) {
            this.modelName = modelName;
            return this;
        }

        /**
         * modelSymbol.
         */
        public Builder modelSymbol(String modelSymbol) {
            this.modelSymbol = modelSymbol;
            return this;
        }

        /**
         * modelType.
         */
        public Builder modelType(String modelType) {
            this.modelType = modelType;
            return this;
        }

        /**
         * modelVersion.
         */
        public Builder modelVersion(Integer modelVersion) {
            this.modelVersion = modelVersion;
            return this;
        }

        /**
         * payableAmount.
         */
        public Builder payableAmount(Float payableAmount) {
            this.payableAmount = payableAmount;
            return this;
        }

        /**
         * summaryTime.
         */
        public Builder summaryTime(Long summaryTime) {
            this.summaryTime = summaryTime;
            return this;
        }

        /**
         * tiers.
         */
        public Builder tiers(java.util.List<BillingBillTierDTO> tiers) {
            this.tiers = tiers;
            return this;
        }

        /**
         * values.
         */
        public Builder values(String values) {
            this.values = values;
            return this;
        }

        public BillingCostBreakdownRowDTO build() {
            return new BillingCostBreakdownRowDTO(this);
        } 

    } 

}
