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
 * {@link ModelRouterTransferToMemberRequest} extends {@link RequestModel}
 *
 * <p>ModelRouterTransferToMemberRequest</p>
 */
public class ModelRouterTransferToMemberRequest extends Request {
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
    @com.aliyun.core.annotation.NameInMap("monthlyQuota")
    private Double monthlyQuota;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("remark")
    private String remark;

    private ModelRouterTransferToMemberRequest(Builder builder) {
        super(builder);
        this.clientId = builder.clientId;
        this.id = builder.id;
        this.amount = builder.amount;
        this.balanceType = builder.balanceType;
        this.idempotencyKey = builder.idempotencyKey;
        this.monthlyQuota = builder.monthlyQuota;
        this.remark = builder.remark;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModelRouterTransferToMemberRequest create() {
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
     * @return monthlyQuota
     */
    public Double getMonthlyQuota() {
        return this.monthlyQuota;
    }

    /**
     * @return remark
     */
    public String getRemark() {
        return this.remark;
    }

    public static final class Builder extends Request.Builder<ModelRouterTransferToMemberRequest, Builder> {
        private Long clientId; 
        private Long id; 
        private Double amount; 
        private String balanceType; 
        private String idempotencyKey; 
        private Double monthlyQuota; 
        private String remark; 

        private Builder() {
            super();
        } 

        private Builder(ModelRouterTransferToMemberRequest request) {
            super(request);
            this.clientId = request.clientId;
            this.id = request.id;
            this.amount = request.amount;
            this.balanceType = request.balanceType;
            this.idempotencyKey = request.idempotencyKey;
            this.monthlyQuota = request.monthlyQuota;
            this.remark = request.remark;
        } 

        /**
         * clientId.
         */
        public Builder clientId(Long clientId) {
            this.putPathParameter("clientId", clientId);
            this.clientId = clientId;
            return this;
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
         * amount.
         */
        public Builder amount(Double amount) {
            this.putBodyParameter("amount", amount);
            this.amount = amount;
            return this;
        }

        /**
         * balanceType.
         */
        public Builder balanceType(String balanceType) {
            this.putBodyParameter("balanceType", balanceType);
            this.balanceType = balanceType;
            return this;
        }

        /**
         * idempotencyKey.
         */
        public Builder idempotencyKey(String idempotencyKey) {
            this.putBodyParameter("idempotencyKey", idempotencyKey);
            this.idempotencyKey = idempotencyKey;
            return this;
        }

        /**
         * monthlyQuota.
         */
        public Builder monthlyQuota(Double monthlyQuota) {
            this.putBodyParameter("monthlyQuota", monthlyQuota);
            this.monthlyQuota = monthlyQuota;
            return this;
        }

        /**
         * remark.
         */
        public Builder remark(String remark) {
            this.putBodyParameter("remark", remark);
            this.remark = remark;
            return this;
        }

        @Override
        public ModelRouterTransferToMemberRequest build() {
            return new ModelRouterTransferToMemberRequest(this);
        } 

    } 

}
