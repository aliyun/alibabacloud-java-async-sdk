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
 * {@link ClientBalanceDTO} extends {@link TeaModel}
 *
 * <p>ClientBalanceDTO</p>
 */
public class ClientBalanceDTO extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("balance")
    private Double balance;

    @com.aliyun.core.annotation.NameInMap("balanceType")
    private String balanceType;

    @com.aliyun.core.annotation.NameInMap("clientId")
    private Long clientId;

    @com.aliyun.core.annotation.NameInMap("enableBalance")
    private Boolean enableBalance;

    @com.aliyun.core.annotation.NameInMap("gmtCreate")
    private String gmtCreate;

    @com.aliyun.core.annotation.NameInMap("gmtModified")
    private String gmtModified;

    @com.aliyun.core.annotation.NameInMap("id")
    private Long id;

    private ClientBalanceDTO(Builder builder) {
        this.balance = builder.balance;
        this.balanceType = builder.balanceType;
        this.clientId = builder.clientId;
        this.enableBalance = builder.enableBalance;
        this.gmtCreate = builder.gmtCreate;
        this.gmtModified = builder.gmtModified;
        this.id = builder.id;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ClientBalanceDTO create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return balance
     */
    public Double getBalance() {
        return this.balance;
    }

    /**
     * @return balanceType
     */
    public String getBalanceType() {
        return this.balanceType;
    }

    /**
     * @return clientId
     */
    public Long getClientId() {
        return this.clientId;
    }

    /**
     * @return enableBalance
     */
    public Boolean getEnableBalance() {
        return this.enableBalance;
    }

    /**
     * @return gmtCreate
     */
    public String getGmtCreate() {
        return this.gmtCreate;
    }

    /**
     * @return gmtModified
     */
    public String getGmtModified() {
        return this.gmtModified;
    }

    /**
     * @return id
     */
    public Long getId() {
        return this.id;
    }

    public static final class Builder {
        private Double balance; 
        private String balanceType; 
        private Long clientId; 
        private Boolean enableBalance; 
        private String gmtCreate; 
        private String gmtModified; 
        private Long id; 

        private Builder() {
        } 

        private Builder(ClientBalanceDTO model) {
            this.balance = model.balance;
            this.balanceType = model.balanceType;
            this.clientId = model.clientId;
            this.enableBalance = model.enableBalance;
            this.gmtCreate = model.gmtCreate;
            this.gmtModified = model.gmtModified;
            this.id = model.id;
        } 

        /**
         * balance.
         */
        public Builder balance(Double balance) {
            this.balance = balance;
            return this;
        }

        /**
         * balanceType.
         */
        public Builder balanceType(String balanceType) {
            this.balanceType = balanceType;
            return this;
        }

        /**
         * clientId.
         */
        public Builder clientId(Long clientId) {
            this.clientId = clientId;
            return this;
        }

        /**
         * enableBalance.
         */
        public Builder enableBalance(Boolean enableBalance) {
            this.enableBalance = enableBalance;
            return this;
        }

        /**
         * gmtCreate.
         */
        public Builder gmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }

        /**
         * gmtModified.
         */
        public Builder gmtModified(String gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }

        /**
         * id.
         */
        public Builder id(Long id) {
            this.id = id;
            return this;
        }

        public ClientBalanceDTO build() {
            return new ClientBalanceDTO(this);
        } 

    } 

}
