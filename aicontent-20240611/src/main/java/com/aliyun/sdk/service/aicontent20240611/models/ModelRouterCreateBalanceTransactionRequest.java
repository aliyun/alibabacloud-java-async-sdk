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
    @com.aliyun.core.annotation.NameInMap("remark")
    private String remark;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("type")
    private String type;

    private ModelRouterCreateBalanceTransactionRequest(Builder builder) {
        super(builder);
        this.id = builder.id;
        this.amount = builder.amount;
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
        private String remark; 
        private String type; 

        private Builder() {
            super();
        } 

        private Builder(ModelRouterCreateBalanceTransactionRequest request) {
            super(request);
            this.id = request.id;
            this.amount = request.amount;
            this.remark = request.remark;
            this.type = request.type;
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
         * remark.
         */
        public Builder remark(String remark) {
            this.putBodyParameter("remark", remark);
            this.remark = remark;
            return this;
        }

        /**
         * type.
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
