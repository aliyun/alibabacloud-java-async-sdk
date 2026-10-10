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
 * {@link ModelRouterCreateBalanceTransactionRequest} extends {@link RequestModel}
 *
 * <p>ModelRouterCreateBalanceTransactionRequest</p>
 */
public class ModelRouterCreateBalanceTransactionRequest extends Request {
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
    @com.aliyun.core.annotation.NameInMap("idempotencyKey")
    private String idempotencyKey;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("remark")
    private String remark;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("type")
    private String type;

    private ModelRouterCreateBalanceTransactionRequest(Builder builder) {
        super(builder);
        this.id = builder.id;
        this.amount = builder.amount;
        this.balanceType = builder.balanceType;
        this.idempotencyKey = builder.idempotencyKey;
        this.remark = builder.remark;
        this.type = builder.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModelRouterCreateBalanceTransactionRequest create() {
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
     * @return idempotencyKey
     */
    public String getIdempotencyKey() {
        return this.idempotencyKey;
    }

    /**
     * @return remark
     */
    public String getRemark() {
        return this.remark;
    }

    /**
     * @return type
     */
    public String getType() {
        return this.type;
    }

    public static final class Builder extends Request.Builder<ModelRouterCreateBalanceTransactionRequest, Builder> {
        private Long id; 
        private Double amount; 
        private String balanceType; 
        private String idempotencyKey; 
        private String remark; 
        private String type; 

        private Builder() {
            super();
        } 

        private Builder(ModelRouterCreateBalanceTransactionRequest request) {
            super(request);
            this.id = request.id;
            this.amount = request.amount;
            this.balanceType = request.balanceType;
            this.idempotencyKey = request.idempotencyKey;
            this.remark = request.remark;
            this.type = request.type;
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
         * <p>The transaction amount.</p>
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
         * <p>The target balance pool type. If not specified, the default value is permanent. Valid values: permanent: permanent balance pool (the balance never expires). monthly: monthly balance pool (the balance is automatically cleared at the beginning of each month).</p>
         * 
         * <strong>example:</strong>
         * <p>amount</p>
         */
        public Builder balanceType(String balanceType) {
            this.putBodyParameter("balanceType", balanceType);
            this.balanceType = balanceType;
            return this;
        }

        /**
         * <p>The idempotency key. UUID v4 format is recommended. The maximum length is 32 characters. Duplicate submissions with the same key are not executed more than once.</p>
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
         * <p>The remarks.</p>
         * 
         * <strong>example:</strong>
         * <p>Recharge</p>
         */
        public Builder remark(String remark) {
            this.putBodyParameter("remark", remark);
            this.remark = remark;
            return this;
        }

        /**
         * <p>The transaction type.</p>
         * 
         * <strong>example:</strong>
         * <p>recharge</p>
         */
        public Builder type(String type) {
            this.putBodyParameter("type", type);
            this.type = type;
            return this;
        }

        @Override
        public ModelRouterCreateBalanceTransactionRequest build() {
            return new ModelRouterCreateBalanceTransactionRequest(this);
        } 

    } 

}
