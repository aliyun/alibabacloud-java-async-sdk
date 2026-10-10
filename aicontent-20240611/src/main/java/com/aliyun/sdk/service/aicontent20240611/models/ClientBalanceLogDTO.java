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
 * {@link ClientBalanceLogDTO} extends {@link TeaModel}
 *
 * <p>ClientBalanceLogDTO</p>
 */
public class ClientBalanceLogDTO extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("balanceAfter")
    private Double balanceAfter;

    @com.aliyun.core.annotation.NameInMap("balanceBefore")
    private Double balanceBefore;

    @com.aliyun.core.annotation.NameInMap("changeAmount")
    private Double changeAmount;

    @com.aliyun.core.annotation.NameInMap("changeType")
    private String changeType;

    @com.aliyun.core.annotation.NameInMap("clientId")
    private Long clientId;

    @com.aliyun.core.annotation.NameInMap("gmtCreate")
    private String gmtCreate;

    @com.aliyun.core.annotation.NameInMap("id")
    private Long id;

    @com.aliyun.core.annotation.NameInMap("remark")
    private String remark;

    private ClientBalanceLogDTO(Builder builder) {
        this.balanceAfter = builder.balanceAfter;
        this.balanceBefore = builder.balanceBefore;
        this.changeAmount = builder.changeAmount;
        this.changeType = builder.changeType;
        this.clientId = builder.clientId;
        this.gmtCreate = builder.gmtCreate;
        this.id = builder.id;
        this.remark = builder.remark;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ClientBalanceLogDTO create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return balanceAfter
     */
    public Double getBalanceAfter() {
        return this.balanceAfter;
    }

    /**
     * @return balanceBefore
     */
    public Double getBalanceBefore() {
        return this.balanceBefore;
    }

    /**
     * @return changeAmount
     */
    public Double getChangeAmount() {
        return this.changeAmount;
    }

    /**
     * @return changeType
     */
    public String getChangeType() {
        return this.changeType;
    }

    /**
     * @return clientId
     */
    public Long getClientId() {
        return this.clientId;
    }

    /**
     * @return gmtCreate
     */
    public String getGmtCreate() {
        return this.gmtCreate;
    }

    /**
     * @return id
     */
    public Long getId() {
        return this.id;
    }

    /**
     * @return remark
     */
    public String getRemark() {
        return this.remark;
    }

    public static final class Builder {
        private Double balanceAfter; 
        private Double balanceBefore; 
        private Double changeAmount; 
        private String changeType; 
        private Long clientId; 
        private String gmtCreate; 
        private Long id; 
        private String remark; 

        private Builder() {
        } 

        private Builder(ClientBalanceLogDTO model) {
            this.balanceAfter = model.balanceAfter;
            this.balanceBefore = model.balanceBefore;
            this.changeAmount = model.changeAmount;
            this.changeType = model.changeType;
            this.clientId = model.clientId;
            this.gmtCreate = model.gmtCreate;
            this.id = model.id;
            this.remark = model.remark;
        } 

        /**
         * <p>The new balance.</p>
         * 
         * <strong>example:</strong>
         * <p>100.00</p>
         */
        public Builder balanceAfter(Double balanceAfter) {
            this.balanceAfter = balanceAfter;
            return this;
        }

        /**
         * <p>The previous balance.</p>
         * 
         * <strong>example:</strong>
         * <p>90.00</p>
         */
        public Builder balanceBefore(Double balanceBefore) {
            this.balanceBefore = balanceBefore;
            return this;
        }

        /**
         * <p>The change amount. A positive value represents a recharge, and a negative value represents a deduction.</p>
         * 
         * <strong>example:</strong>
         * <p>10.00</p>
         */
        public Builder changeAmount(Double changeAmount) {
            this.changeAmount = changeAmount;
            return this;
        }

        /**
         * <p>The type of change. Possible values are <code>auto_deduct</code>, <code>deduct</code>, or <code>recharge</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>recharge</p>
         */
        public Builder changeType(String changeType) {
            this.changeType = changeType;
            return this;
        }

        /**
         * <p>The client ID.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder clientId(Long clientId) {
            this.clientId = clientId;
            return this;
        }

        /**
         * <p>The creation time in ISO 8601 UTC format.</p>
         * 
         * <strong>example:</strong>
         * <p>2024-01-01T00:00:00Z</p>
         */
        public Builder gmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }

        /**
         * <p>The unique record ID.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder id(Long id) {
            this.id = id;
            return this;
        }

        /**
         * <p>Notes about the balance change.</p>
         * 
         * <strong>example:</strong>
         * <p>充值</p>
         */
        public Builder remark(String remark) {
            this.remark = remark;
            return this;
        }

        public ClientBalanceLogDTO build() {
            return new ClientBalanceLogDTO(this);
        } 

    } 

}
