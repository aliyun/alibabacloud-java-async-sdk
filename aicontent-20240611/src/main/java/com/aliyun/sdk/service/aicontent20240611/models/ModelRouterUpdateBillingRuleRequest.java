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
 * {@link ModelRouterUpdateBillingRuleRequest} extends {@link RequestModel}
 *
 * <p>ModelRouterUpdateBillingRuleRequest</p>
 */
public class ModelRouterUpdateBillingRuleRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("id")
    private Long id;

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
    @com.aliyun.core.annotation.NameInMap("pricingConfig")
    private Object pricingConfig;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("status")
    private Integer status;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("version")
    private Integer version;

    private ModelRouterUpdateBillingRuleRequest(Builder builder) {
        super(builder);
        this.id = builder.id;
        this.billingType = builder.billingType;
        this.effectiveTime = builder.effectiveTime;
        this.expireTime = builder.expireTime;
        this.pricingConfig = builder.pricingConfig;
        this.status = builder.status;
        this.version = builder.version;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModelRouterUpdateBillingRuleRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return id
     */
    public Long getId() {
        return this.id;
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
     * @return pricingConfig
     */
    public Object getPricingConfig() {
        return this.pricingConfig;
    }

    /**
     * @return status
     */
    public Integer getStatus() {
        return this.status;
    }

    /**
     * @return version
     */
    public Integer getVersion() {
        return this.version;
    }

    public static final class Builder extends Request.Builder<ModelRouterUpdateBillingRuleRequest, Builder> {
        private Long id; 
        private String billingType; 
        private String effectiveTime; 
        private String expireTime; 
        private Object pricingConfig; 
        private Integer status; 
        private Integer version; 

        private Builder() {
            super();
        } 

        private Builder(ModelRouterUpdateBillingRuleRequest request) {
            super(request);
            this.id = request.id;
            this.billingType = request.billingType;
            this.effectiveTime = request.effectiveTime;
            this.expireTime = request.expireTime;
            this.pricingConfig = request.pricingConfig;
            this.status = request.status;
            this.version = request.version;
        } 

        /**
         * id.
         */
        public Builder id(Long id) {
            this.putPathParameter("id", id);
            this.id = id;
            return this;
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
         * pricingConfig.
         */
        public Builder pricingConfig(Object pricingConfig) {
            this.putBodyParameter("pricingConfig", pricingConfig);
            this.pricingConfig = pricingConfig;
            return this;
        }

        /**
         * status.
         */
        public Builder status(Integer status) {
            this.putBodyParameter("status", status);
            this.status = status;
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
        public ModelRouterUpdateBillingRuleRequest build() {
            return new ModelRouterUpdateBillingRuleRequest(this);
        } 

    } 

}
