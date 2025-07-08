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
 * {@link CreatePrevLimitNewRequest} extends {@link RequestModel}
 *
 * <p>CreatePrevLimitNewRequest</p>
 */
public class CreatePrevLimitNewRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("HourLimit")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long hourLimit;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("IncreaseRate")
    @com.aliyun.core.annotation.Validation(required = true, maximum = 2147483647)
    private Integer increaseRate;

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

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SuccessRate")
    @com.aliyun.core.annotation.Validation(required = true, maximum = 2147483647)
    private Integer successRate;

    private CreatePrevLimitNewRequest(Builder builder) {
        super(builder);
        this.hourLimit = builder.hourLimit;
        this.increaseRate = builder.increaseRate;
        this.ownerId = builder.ownerId;
        this.prodCode = builder.prodCode;
        this.resourceOwnerAccount = builder.resourceOwnerAccount;
        this.resourceOwnerId = builder.resourceOwnerId;
        this.successRate = builder.successRate;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreatePrevLimitNewRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return hourLimit
     */
    public Long getHourLimit() {
        return this.hourLimit;
    }

    /**
     * @return increaseRate
     */
    public Integer getIncreaseRate() {
        return this.increaseRate;
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

    /**
     * @return successRate
     */
    public Integer getSuccessRate() {
        return this.successRate;
    }

    public static final class Builder extends Request.Builder<CreatePrevLimitNewRequest, Builder> {
        private Long hourLimit; 
        private Integer increaseRate; 
        private Long ownerId; 
        private String prodCode; 
        private String resourceOwnerAccount; 
        private Long resourceOwnerId; 
        private Integer successRate; 

        private Builder() {
            super();
        } 

        private Builder(CreatePrevLimitNewRequest request) {
            super(request);
            this.hourLimit = request.hourLimit;
            this.increaseRate = request.increaseRate;
            this.ownerId = request.ownerId;
            this.prodCode = request.prodCode;
            this.resourceOwnerAccount = request.resourceOwnerAccount;
            this.resourceOwnerId = request.resourceOwnerId;
            this.successRate = request.successRate;
        } 

        /**
         * <p>This parameter is required.</p>
         */
        public Builder hourLimit(Long hourLimit) {
            this.putQueryParameter("HourLimit", hourLimit);
            this.hourLimit = hourLimit;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder increaseRate(Integer increaseRate) {
            this.putQueryParameter("IncreaseRate", increaseRate);
            this.increaseRate = increaseRate;
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

        /**
         * <p>This parameter is required.</p>
         */
        public Builder successRate(Integer successRate) {
            this.putQueryParameter("SuccessRate", successRate);
            this.successRate = successRate;
            return this;
        }

        @Override
        public CreatePrevLimitNewRequest build() {
            return new CreatePrevLimitNewRequest(this);
        } 

    } 

}
