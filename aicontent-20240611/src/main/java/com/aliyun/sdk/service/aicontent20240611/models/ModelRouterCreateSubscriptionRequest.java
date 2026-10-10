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
 * {@link ModelRouterCreateSubscriptionRequest} extends {@link RequestModel}
 *
 * <p>ModelRouterCreateSubscriptionRequest</p>
 */
public class ModelRouterCreateSubscriptionRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("id")
    private Long id;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("balanceType")
    private String balanceType;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("effectiveTime")
    private Long effectiveTime;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("idempotencyKey")
    private String idempotencyKey;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("subscriptionAmount")
    private Double subscriptionAmount;

    private ModelRouterCreateSubscriptionRequest(Builder builder) {
        super(builder);
        this.id = builder.id;
        this.balanceType = builder.balanceType;
        this.effectiveTime = builder.effectiveTime;
        this.idempotencyKey = builder.idempotencyKey;
        this.subscriptionAmount = builder.subscriptionAmount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModelRouterCreateSubscriptionRequest create() {
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
     * @return balanceType
     */
    public String getBalanceType() {
        return this.balanceType;
    }

    /**
     * @return effectiveTime
     */
    public Long getEffectiveTime() {
        return this.effectiveTime;
    }

    /**
     * @return idempotencyKey
     */
    public String getIdempotencyKey() {
        return this.idempotencyKey;
    }

    /**
     * @return subscriptionAmount
     */
    public Double getSubscriptionAmount() {
        return this.subscriptionAmount;
    }

    public static final class Builder extends Request.Builder<ModelRouterCreateSubscriptionRequest, Builder> {
        private Long id; 
        private String balanceType; 
        private Long effectiveTime; 
        private String idempotencyKey; 
        private Double subscriptionAmount; 

        private Builder() {
            super();
        } 

        private Builder(ModelRouterCreateSubscriptionRequest request) {
            super(request);
            this.id = request.id;
            this.balanceType = request.balanceType;
            this.effectiveTime = request.effectiveTime;
            this.idempotencyKey = request.idempotencyKey;
            this.subscriptionAmount = request.subscriptionAmount;
        } 

        /**
         * <p>The department ID.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder id(Long id) {
            this.putPathParameter("id", id);
            this.id = id;
            return this;
        }

        /**
         * <p>The balance pool to which the recharge is applied. Valid values:</p>
         * <ul>
         * <li>permanent: the permanent balance pool.</li>
         * <li>monthly: the monthly balance pool.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>permanent</p>
         */
        public Builder balanceType(String balanceType) {
            this.putBodyParameter("balanceType", balanceType);
            this.balanceType = balanceType;
            return this;
        }

        /**
         * <p>The effective period, in UNIX timestamp (seconds). Range: from 00:00 of today to 00:00 of the first day of the next month (Asia/Shanghai).</p>
         * 
         * <strong>example:</strong>
         * <p>1719792000</p>
         */
        public Builder effectiveTime(Long effectiveTime) {
            this.putBodyParameter("effectiveTime", effectiveTime);
            this.effectiveTime = effectiveTime;
            return this;
        }

        /**
         * <p>The idempotency key. UUID v4 format without hyphens is recommended. This prevents duplicate subscription creation.</p>
         * 
         * <strong>example:</strong>
         * <p>550e8400e29b41d4a716446655440000</p>
         */
        public Builder idempotencyKey(String idempotencyKey) {
            this.putBodyParameter("idempotencyKey", idempotencyKey);
            this.idempotencyKey = idempotencyKey;
            return this;
        }

        /**
         * <p>The subscription recharge amount.</p>
         * 
         * <strong>example:</strong>
         * <p>100.00</p>
         */
        public Builder subscriptionAmount(Double subscriptionAmount) {
            this.putBodyParameter("subscriptionAmount", subscriptionAmount);
            this.subscriptionAmount = subscriptionAmount;
            return this;
        }

        @Override
        public ModelRouterCreateSubscriptionRequest build() {
            return new ModelRouterCreateSubscriptionRequest(this);
        } 

    } 

}
