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
 * {@link ModelRouterCreateBillingRuleRequest} extends {@link RequestModel}
 *
 * <p>ModelRouterCreateBillingRuleRequest</p>
 */
public class ModelRouterCreateBillingRuleRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("billingType")
    private String billingType;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("effectiveTime")
    private String effectiveTime;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("expireTime")
    private String expireTime;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("modelId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long modelId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("pricingConfig")
    private Object pricingConfig;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("version")
    private Integer version;

    private ModelRouterCreateBillingRuleRequest(Builder builder) {
        super(builder);
        this.billingType = builder.billingType;
        this.effectiveTime = builder.effectiveTime;
        this.expireTime = builder.expireTime;
        this.modelId = builder.modelId;
        this.pricingConfig = builder.pricingConfig;
        this.version = builder.version;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModelRouterCreateBillingRuleRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return billingType
     */
    public String getBillingType() {
        return this.billingType;
    }

    /**
     * @return effectiveTime
     */
    public String getEffectiveTime() {
        return this.effectiveTime;
    }

    /**
     * @return expireTime
     */
    public String getExpireTime() {
        return this.expireTime;
    }

    /**
     * @return modelId
     */
    public Long getModelId() {
        return this.modelId;
    }

    /**
     * @return pricingConfig
     */
    public Object getPricingConfig() {
        return this.pricingConfig;
    }

    /**
     * @return version
     */
    public Integer getVersion() {
        return this.version;
    }

    public static final class Builder extends Request.Builder<ModelRouterCreateBillingRuleRequest, Builder> {
        private String billingType; 
        private String effectiveTime; 
        private String expireTime; 
        private Long modelId; 
        private Object pricingConfig; 
        private Integer version; 

        private Builder() {
            super();
        } 

        private Builder(ModelRouterCreateBillingRuleRequest request) {
            super(request);
            this.billingType = request.billingType;
            this.effectiveTime = request.effectiveTime;
            this.expireTime = request.expireTime;
            this.modelId = request.modelId;
            this.pricingConfig = request.pricingConfig;
            this.version = request.version;
        } 

        /**
         * billingType.
         */
        public Builder billingType(String billingType) {
            this.putBodyParameter("billingType", billingType);
            this.billingType = billingType;
            return this;
        }

        /**
         * effectiveTime.
         */
        public Builder effectiveTime(String effectiveTime) {
            this.putBodyParameter("effectiveTime", effectiveTime);
            this.effectiveTime = effectiveTime;
            return this;
        }

        /**
         * expireTime.
         */
        public Builder expireTime(String expireTime) {
            this.putBodyParameter("expireTime", expireTime);
            this.expireTime = expireTime;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder modelId(Long modelId) {
            this.putBodyParameter("modelId", modelId);
            this.modelId = modelId;
            return this;
        }

        /**
         * pricingConfig.
         */
        public Builder pricingConfig(Object pricingConfig) {
            this.putBodyParameter("pricingConfig", pricingConfig);
            this.pricingConfig = pricingConfig;
            return this;
        }

        /**
         * version.
         */
        public Builder version(Integer version) {
            this.putBodyParameter("version", version);
            this.version = version;
            return this;
        }

        @Override
        public ModelRouterCreateBillingRuleRequest build() {
            return new ModelRouterCreateBillingRuleRequest(this);
        } 

    } 

}
