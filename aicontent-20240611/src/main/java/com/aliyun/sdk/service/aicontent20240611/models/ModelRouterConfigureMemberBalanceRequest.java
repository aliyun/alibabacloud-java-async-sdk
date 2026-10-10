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
 * {@link ModelRouterConfigureMemberBalanceRequest} extends {@link RequestModel}
 *
 * <p>ModelRouterConfigureMemberBalanceRequest</p>
 */
public class ModelRouterConfigureMemberBalanceRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("clientId")
    private Long clientId;

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

    private ModelRouterConfigureMemberBalanceRequest(Builder builder) {
        super(builder);
        this.clientId = builder.clientId;
        this.id = builder.id;
        this.balanceType = builder.balanceType;
        this.enableBalance = builder.enableBalance;
        this.initialBalance = builder.initialBalance;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModelRouterConfigureMemberBalanceRequest create() {
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

    public static final class Builder extends Request.Builder<ModelRouterConfigureMemberBalanceRequest, Builder> {
        private Long clientId; 
        private Long id; 
        private String balanceType; 
        private Boolean enableBalance; 
        private Double initialBalance; 

        private Builder() {
            super();
        } 

        private Builder(ModelRouterConfigureMemberBalanceRequest request) {
            super(request);
            this.clientId = request.clientId;
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
         * <p>The balance type. Valid values:</p>
         * <ul>
         * <li>amount: monetary amount.</li>
         * <li>tokens: token count.</li>
         * </ul>
         * <p>This parameter is required when balance throttling is enabled for the first time.</p>
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
         * <p>Specifies whether to enable balance throttling. Once enabled, it cannot be disabled.</p>
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
         * <p>0</p>
         */
        public Builder initialBalance(Double initialBalance) {
            this.putBodyParameter("initialBalance", initialBalance);
            this.initialBalance = initialBalance;
            return this;
        }

        @Override
        public ModelRouterConfigureMemberBalanceRequest build() {
            return new ModelRouterConfigureMemberBalanceRequest(this);
        } 

    } 

}
