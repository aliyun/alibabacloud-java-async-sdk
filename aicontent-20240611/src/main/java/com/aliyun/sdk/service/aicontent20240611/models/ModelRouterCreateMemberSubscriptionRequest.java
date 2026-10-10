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
 * {@link ModelRouterCreateMemberSubscriptionRequest} extends {@link RequestModel}
 *
 * <p>ModelRouterCreateMemberSubscriptionRequest</p>
 */
public class ModelRouterCreateMemberSubscriptionRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("clientId")
    private Long clientId;

    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("id")
    private Long id;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("amount")
    private Double amount;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("balanceType")
    private String balanceType;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("effectiveTime")
    private Long effectiveTime;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("idempotencyKey")
    private String idempotencyKey;

    private ModelRouterCreateMemberSubscriptionRequest(Builder builder) {
        super(builder);
        this.clientId = builder.clientId;
        this.id = builder.id;
        this.amount = builder.amount;
        this.balanceType = builder.balanceType;
        this.effectiveTime = builder.effectiveTime;
        this.idempotencyKey = builder.idempotencyKey;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModelRouterCreateMemberSubscriptionRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return clientId
     */
    public Long getClientId() {
        return this.clientId;
    }

    /**
     * @return id
     */
    public Long getId() {
        return this.id;
    }

    /**
     * @return amount
     */
    public Double getAmount() {
        return this.amount;
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

    public static final class Builder extends Request.Builder<ModelRouterCreateMemberSubscriptionRequest, Builder> {
        private Long clientId; 
        private Long id; 
        private Double amount; 
        private String balanceType; 
        private Long effectiveTime; 
        private String idempotencyKey; 

        private Builder() {
            super();
        } 

        private Builder(ModelRouterCreateMemberSubscriptionRequest request) {
            super(request);
            this.clientId = request.clientId;
            this.id = request.id;
            this.amount = request.amount;
            this.balanceType = request.balanceType;
            this.effectiveTime = request.effectiveTime;
            this.idempotencyKey = request.idempotencyKey;
        } 

        /**
         * <p>The department ID.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder clientId(Long clientId) {
            this.putPathParameter("clientId", clientId);
            this.clientId = clientId;
            return this;
        }

        /**
         * <p>The member identifier (member ID within the organization, not an Alibaba Cloud account ID).</p>
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
         * <p>The subscription amount.</p>
         * 
         * <strong>example:</strong>
         * <p>100.00</p>
         */
        public Builder amount(Double amount) {
            this.putBodyParameter("amount", amount);
            this.amount = amount;
            return this;
        }

        /**
         * <p>The balance type. Valid values:</p>
         * <ul>
         * <li>permanent: permanent balance.</li>
         * <li>monthly: monthly balance.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>monthly</p>
         */
        public Builder balanceType(String balanceType) {
            this.putBodyParameter("balanceType", balanceType);
            this.balanceType = balanceType;
            return this;
        }

        /**
         * <p>The effective period in UNIX timestamp (seconds).</p>
         * 
         * <strong>example:</strong>
         * <p>1753858800</p>
         */
        public Builder effectiveTime(Long effectiveTime) {
            this.putBodyParameter("effectiveTime", effectiveTime);
            this.effectiveTime = effectiveTime;
            return this;
        }

        /**
         * <p>The idempotency key. UUID v4 format is recommended.</p>
         * 
         * <strong>example:</strong>
         * <p>550e8400-e29b-41d4-a716-446655440000</p>
         */
        public Builder idempotencyKey(String idempotencyKey) {
            this.putBodyParameter("idempotencyKey", idempotencyKey);
            this.idempotencyKey = idempotencyKey;
            return this;
        }

        @Override
        public ModelRouterCreateMemberSubscriptionRequest build() {
            return new ModelRouterCreateMemberSubscriptionRequest(this);
        } 

    } 

}
