// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dytnsapi20200217.models;

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
 * {@link DescribePhoneNumberAnalysisRequest} extends {@link RequestModel}
 *
 * <p>DescribePhoneNumberAnalysisRequest</p>
 */
public class DescribePhoneNumberAnalysisRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AuthCode")
    @com.aliyun.core.annotation.Validation(required = true)
    private String authCode;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InputNumber")
    @com.aliyun.core.annotation.Validation(required = true)
    private String inputNumber;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Mask")
    private String mask;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NumberType")
    private Long numberType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OwnerId")
    private Long ownerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Rate")
    private Long rate;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceOwnerAccount")
    private String resourceOwnerAccount;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceOwnerId")
    private Long resourceOwnerId;

    private DescribePhoneNumberAnalysisRequest(Builder builder) {
        super(builder);
        this.authCode = builder.authCode;
        this.inputNumber = builder.inputNumber;
        this.mask = builder.mask;
        this.numberType = builder.numberType;
        this.ownerId = builder.ownerId;
        this.rate = builder.rate;
        this.resourceOwnerAccount = builder.resourceOwnerAccount;
        this.resourceOwnerId = builder.resourceOwnerId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribePhoneNumberAnalysisRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return authCode
     */
    public String getAuthCode() {
        return this.authCode;
    }

    /**
     * @return inputNumber
     */
    public String getInputNumber() {
        return this.inputNumber;
    }

    /**
     * @return mask
     */
    public String getMask() {
        return this.mask;
    }

    /**
     * @return numberType
     */
    public Long getNumberType() {
        return this.numberType;
    }

    /**
     * @return ownerId
     */
    public Long getOwnerId() {
        return this.ownerId;
    }

    /**
     * @return rate
     */
    public Long getRate() {
        return this.rate;
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

    public static final class Builder extends Request.Builder<DescribePhoneNumberAnalysisRequest, Builder> {
        private String authCode; 
        private String inputNumber; 
        private String mask; 
        private Long numberType; 
        private Long ownerId; 
        private Long rate; 
        private String resourceOwnerAccount; 
        private Long resourceOwnerId; 

        private Builder() {
            super();
        } 

        private Builder(DescribePhoneNumberAnalysisRequest request) {
            super(request);
            this.authCode = request.authCode;
            this.inputNumber = request.inputNumber;
            this.mask = request.mask;
            this.numberType = request.numberType;
            this.ownerId = request.ownerId;
            this.rate = request.rate;
            this.resourceOwnerAccount = request.resourceOwnerAccount;
            this.resourceOwnerId = request.resourceOwnerId;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>QASDW@#**</p>
         */
        public Builder authCode(String authCode) {
            this.putQueryParameter("AuthCode", authCode);
            this.authCode = authCode;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1310000****</p>
         */
        public Builder inputNumber(String inputNumber) {
            this.putQueryParameter("InputNumber", inputNumber);
            this.inputNumber = inputNumber;
            return this;
        }

        /**
         * Mask.
         */
        public Builder mask(String mask) {
            this.putQueryParameter("Mask", mask);
            this.mask = mask;
            return this;
        }

        /**
         * NumberType.
         */
        public Builder numberType(Long numberType) {
            this.putQueryParameter("NumberType", numberType);
            this.numberType = numberType;
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
         * Rate.
         */
        public Builder rate(Long rate) {
            this.putQueryParameter("Rate", rate);
            this.rate = rate;
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
        public DescribePhoneNumberAnalysisRequest build() {
            return new DescribePhoneNumberAnalysisRequest(this);
        } 

    } 

}
