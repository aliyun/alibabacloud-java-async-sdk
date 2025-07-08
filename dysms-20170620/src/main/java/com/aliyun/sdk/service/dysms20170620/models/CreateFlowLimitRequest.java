// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dysms20170620.models;

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
 * {@link CreateFlowLimitRequest} extends {@link RequestModel}
 *
 * <p>CreateFlowLimitRequest</p>
 */
public class CreateFlowLimitRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DailyLimit")
    private String dailyLimit;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("HourLimit")
    private String hourLimit;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MinuteLimit")
    private String minuteLimit;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OwnerId")
    private Long ownerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ProdCode")
    private String prodCode;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceOwnerAccount")
    private String resourceOwnerAccount;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceOwnerId")
    private Long resourceOwnerId;

    private CreateFlowLimitRequest(Builder builder) {
        super(builder);
        this.dailyLimit = builder.dailyLimit;
        this.hourLimit = builder.hourLimit;
        this.minuteLimit = builder.minuteLimit;
        this.ownerId = builder.ownerId;
        this.prodCode = builder.prodCode;
        this.resourceOwnerAccount = builder.resourceOwnerAccount;
        this.resourceOwnerId = builder.resourceOwnerId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateFlowLimitRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return dailyLimit
     */
    public String getDailyLimit() {
        return this.dailyLimit;
    }

    /**
     * @return hourLimit
     */
    public String getHourLimit() {
        return this.hourLimit;
    }

    /**
     * @return minuteLimit
     */
    public String getMinuteLimit() {
        return this.minuteLimit;
    }

    /**
     * @return ownerId
     */
    public Long getOwnerId() {
        return this.ownerId;
    }

    /**
     * @return prodCode
     */
    public String getProdCode() {
        return this.prodCode;
    }

    /**
     * @return resourceOwnerAccount
     */
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    /**
     * @return resourceOwnerId
     */
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public static final class Builder extends Request.Builder<CreateFlowLimitRequest, Builder> {
        private String dailyLimit; 
        private String hourLimit; 
        private String minuteLimit; 
        private Long ownerId; 
        private String prodCode; 
        private String resourceOwnerAccount; 
        private Long resourceOwnerId; 

        private Builder() {
            super();
        } 

        private Builder(CreateFlowLimitRequest request) {
            super(request);
            this.dailyLimit = request.dailyLimit;
            this.hourLimit = request.hourLimit;
            this.minuteLimit = request.minuteLimit;
            this.ownerId = request.ownerId;
            this.prodCode = request.prodCode;
            this.resourceOwnerAccount = request.resourceOwnerAccount;
            this.resourceOwnerId = request.resourceOwnerId;
        } 

        /**
         * DailyLimit.
         */
        public Builder dailyLimit(String dailyLimit) {
            this.putQueryParameter("DailyLimit", dailyLimit);
            this.dailyLimit = dailyLimit;
            return this;
        }

        /**
         * HourLimit.
         */
        public Builder hourLimit(String hourLimit) {
            this.putQueryParameter("HourLimit", hourLimit);
            this.hourLimit = hourLimit;
            return this;
        }

        /**
         * MinuteLimit.
         */
        public Builder minuteLimit(String minuteLimit) {
            this.putQueryParameter("MinuteLimit", minuteLimit);
            this.minuteLimit = minuteLimit;
            return this;
        }

        /**
         * OwnerId.
         */
        public Builder ownerId(Long ownerId) {
            this.putQueryParameter("OwnerId", ownerId);
            this.ownerId = ownerId;
            return this;
        }

        /**
         * ProdCode.
         */
        public Builder prodCode(String prodCode) {
            this.putQueryParameter("ProdCode", prodCode);
            this.prodCode = prodCode;
            return this;
        }

        /**
         * ResourceOwnerAccount.
         */
        public Builder resourceOwnerAccount(String resourceOwnerAccount) {
            this.putQueryParameter("ResourceOwnerAccount", resourceOwnerAccount);
            this.resourceOwnerAccount = resourceOwnerAccount;
            return this;
        }

        /**
         * ResourceOwnerId.
         */
        public Builder resourceOwnerId(Long resourceOwnerId) {
            this.putQueryParameter("ResourceOwnerId", resourceOwnerId);
            this.resourceOwnerId = resourceOwnerId;
            return this;
        }

        @Override
        public CreateFlowLimitRequest build() {
            return new CreateFlowLimitRequest(this);
        } 

    } 

}
