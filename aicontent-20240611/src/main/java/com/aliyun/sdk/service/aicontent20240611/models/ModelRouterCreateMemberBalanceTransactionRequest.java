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
 * {@link ModelRouterCreateMemberBalanceTransactionRequest} extends {@link RequestModel}
 *
 * <p>ModelRouterCreateMemberBalanceTransactionRequest</p>
 */
public class ModelRouterCreateMemberBalanceTransactionRequest extends Request {
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
    @com.aliyun.core.annotation.NameInMap("idempotencyKey")
    private String idempotencyKey;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("remark")
    private String remark;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("type")
    private String type;

    private ModelRouterCreateMemberBalanceTransactionRequest(Builder builder) {
        super(builder);
        this.clientId = builder.clientId;
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

    public static ModelRouterCreateMemberBalanceTransactionRequest create() {
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

    public static final class Builder extends Request.Builder<ModelRouterCreateMemberBalanceTransactionRequest, Builder> {
        private Long clientId; 
        private Long id; 
        private Double amount; 
        private String balanceType; 
        private String idempotencyKey; 
        private String remark; 
        private String type; 

        private Builder() {
            super();
        } 

        private Builder(ModelRouterCreateMemberBalanceTransactionRequest request) {
            super(request);
            this.clientId = request.clientId;
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
         * <p>The balance type. Valid values:</p>
         * <ul>
         * <li>permanent</li>
         * <li>monthly</li>
         * </ul>
         * <p>Default value: permanent.</p>
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

        /**
         * <p>The remark for the transaction.</p>
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
         * <p>The transaction type. Valid values: recharge, deduct, and transfer.</p>
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
        public ModelRouterCreateMemberBalanceTransactionRequest build() {
            return new ModelRouterCreateMemberBalanceTransactionRequest(this);
        } 

    } 

}
