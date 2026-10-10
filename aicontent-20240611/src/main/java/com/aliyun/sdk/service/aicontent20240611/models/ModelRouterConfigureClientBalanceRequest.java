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
 * {@link ModelRouterConfigureClientBalanceRequest} extends {@link RequestModel}
 *
 * <p>ModelRouterConfigureClientBalanceRequest</p>
 */
public class ModelRouterConfigureClientBalanceRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("id")
    private Long id;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("balanceType")
    private String balanceType;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("enableBalance")
    private Boolean enableBalance;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("initialBalance")
    private Double initialBalance;

    private ModelRouterConfigureClientBalanceRequest(Builder builder) {
        super(builder);
        this.id = builder.id;
        this.balanceType = builder.balanceType;
        this.enableBalance = builder.enableBalance;
        this.initialBalance = builder.initialBalance;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModelRouterConfigureClientBalanceRequest create() {
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
     * @return enableBalance
     */
    public Boolean getEnableBalance() {
        return this.enableBalance;
    }

    /**
     * @return initialBalance
     */
    public Double getInitialBalance() {
        return this.initialBalance;
    }

    public static final class Builder extends Request.Builder<ModelRouterConfigureClientBalanceRequest, Builder> {
        private Long id; 
        private String balanceType; 
        private Boolean enableBalance; 
        private Double initialBalance; 

        private Builder() {
            super();
        } 

        private Builder(ModelRouterConfigureClientBalanceRequest request) {
            super(request);
            this.id = request.id;
            this.balanceType = request.balanceType;
            this.enableBalance = request.enableBalance;
            this.initialBalance = request.initialBalance;
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
         * <p>The balance type. Valid values:</p>
         * <ul>
         * <li>amount: monetary amount.</li>
         * <li>tokens: token count.</li>
         * </ul>
         * <p>This parameter is required when you enable balance throttling for the first time. Once set, it cannot be modified.</p>
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
         * <p>Specifies whether to enable balance-based throttling. Once enabled, balance throttling cannot be disabled.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder enableBalance(Boolean enableBalance) {
            this.putBodyParameter("enableBalance", enableBalance);
            this.enableBalance = enableBalance;
            return this;
        }

        /**
         * <p>The initial balance. This parameter takes effect only when balance throttling is enabled for the first time.</p>
         * 
         * <strong>example:</strong>
         * <p>100.00</p>
         */
        public Builder initialBalance(Double initialBalance) {
            this.putBodyParameter("initialBalance", initialBalance);
            this.initialBalance = initialBalance;
            return this;
        }

        @Override
        public ModelRouterConfigureClientBalanceRequest build() {
            return new ModelRouterConfigureClientBalanceRequest(this);
        } 

    } 

}
