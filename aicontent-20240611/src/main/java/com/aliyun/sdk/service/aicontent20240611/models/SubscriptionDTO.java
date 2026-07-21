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
 * {@link SubscriptionDTO} extends {@link TeaModel}
 *
 * <p>SubscriptionDTO</p>
 */
public class SubscriptionDTO extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("balanceType")
    private String balanceType;

    @com.aliyun.core.annotation.NameInMap("clientId")
    private Long clientId;

    @com.aliyun.core.annotation.NameInMap("createTime")
    private String createTime;

    @com.aliyun.core.annotation.NameInMap("id")
    private Long id;

    @com.aliyun.core.annotation.NameInMap("status")
    private String status;

    @com.aliyun.core.annotation.NameInMap("stopTime")
    private String stopTime;

    @com.aliyun.core.annotation.NameInMap("subscriptionAmount")
    private Double subscriptionAmount;

    @com.aliyun.core.annotation.NameInMap("updateTime")
    private String updateTime;

    @com.aliyun.core.annotation.NameInMap("validFrom")
    private String validFrom;

    private SubscriptionDTO(Builder builder) {
        this.balanceType = builder.balanceType;
        this.clientId = builder.clientId;
        this.createTime = builder.createTime;
        this.id = builder.id;
        this.status = builder.status;
        this.stopTime = builder.stopTime;
        this.subscriptionAmount = builder.subscriptionAmount;
        this.updateTime = builder.updateTime;
        this.validFrom = builder.validFrom;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SubscriptionDTO create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
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
     * @return createTime
     */
    public String getCreateTime() {
        return this.createTime;
    }

    /**
     * @return id
     */
    public Long getId() {
        return this.id;
    }

    /**
     * @return status
     */
    public String getStatus() {
        return this.status;
    }

    /**
     * @return stopTime
     */
    public String getStopTime() {
        return this.stopTime;
    }

    /**
     * @return subscriptionAmount
     */
    public Double getSubscriptionAmount() {
        return this.subscriptionAmount;
    }

    /**
     * @return updateTime
     */
    public String getUpdateTime() {
        return this.updateTime;
    }

    /**
     * @return validFrom
     */
    public String getValidFrom() {
        return this.validFrom;
    }

    public static final class Builder {
        private String balanceType; 
        private Long clientId; 
        private String createTime; 
        private Long id; 
        private String status; 
        private String stopTime; 
        private Double subscriptionAmount; 
        private String updateTime; 
        private String validFrom; 

        private Builder() {
        } 

        private Builder(SubscriptionDTO model) {
            this.balanceType = model.balanceType;
            this.clientId = model.clientId;
            this.createTime = model.createTime;
            this.id = model.id;
            this.status = model.status;
            this.stopTime = model.stopTime;
            this.subscriptionAmount = model.subscriptionAmount;
            this.updateTime = model.updateTime;
            this.validFrom = model.validFrom;
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
         * createTime.
         */
        public Builder createTime(String createTime) {
            this.createTime = createTime;
            return this;
        }

        /**
         * id.
         */
        public Builder id(Long id) {
            this.id = id;
            return this;
        }

        /**
         * status.
         */
        public Builder status(String status) {
            this.status = status;
            return this;
        }

        /**
         * stopTime.
         */
        public Builder stopTime(String stopTime) {
            this.stopTime = stopTime;
            return this;
        }

        /**
         * subscriptionAmount.
         */
        public Builder subscriptionAmount(Double subscriptionAmount) {
            this.subscriptionAmount = subscriptionAmount;
            return this;
        }

        /**
         * updateTime.
         */
        public Builder updateTime(String updateTime) {
            this.updateTime = updateTime;
            return this;
        }

        /**
         * validFrom.
         */
        public Builder validFrom(String validFrom) {
            this.validFrom = validFrom;
            return this;
        }

        public SubscriptionDTO build() {
            return new SubscriptionDTO(this);
        } 

    } 

}
