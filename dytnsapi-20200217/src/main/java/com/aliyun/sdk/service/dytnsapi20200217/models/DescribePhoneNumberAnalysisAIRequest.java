// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dytnsapi20200217.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribePhoneNumberAnalysisAIRequest} extends {@link RequestModel}
 *
 * <p>DescribePhoneNumberAnalysisAIRequest</p>
 */
public class DescribePhoneNumberAnalysisAIRequest extends Request {
    @Query
    @NameInMap("AuthCode")
    @Validation(required = true)
    private String authCode;

    @Query
    @NameInMap("InputNumber")
    @Validation(required = true)
    private String inputNumber;

    @Query
    @NameInMap("ModelConfig")
    private String modelConfig;

    @Query
    @NameInMap("OwnerId")
    private Long ownerId;

    @Query
    @NameInMap("Rate")
    private Long rate;

    @Query
    @NameInMap("ResourceOwnerAccount")
    private String resourceOwnerAccount;

    @Query
    @NameInMap("ResourceOwnerId")
    private Long resourceOwnerId;

    private DescribePhoneNumberAnalysisAIRequest(Builder builder) {
        super(builder);
        this.authCode = builder.authCode;
        this.inputNumber = builder.inputNumber;
        this.modelConfig = builder.modelConfig;
        this.ownerId = builder.ownerId;
        this.rate = builder.rate;
        this.resourceOwnerAccount = builder.resourceOwnerAccount;
        this.resourceOwnerId = builder.resourceOwnerId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribePhoneNumberAnalysisAIRequest create() {
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
     * @return modelConfig
     */
    public String getModelConfig() {
        return this.modelConfig;
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

    public static final class Builder extends Request.Builder<DescribePhoneNumberAnalysisAIRequest, Builder> {
        private String authCode; 
        private String inputNumber; 
        private String modelConfig; 
        private Long ownerId; 
        private Long rate; 
        private String resourceOwnerAccount; 
        private Long resourceOwnerId; 

        private Builder() {
            super();
        } 

        private Builder(DescribePhoneNumberAnalysisAIRequest request) {
            super(request);
            this.authCode = request.authCode;
            this.inputNumber = request.inputNumber;
            this.modelConfig = request.modelConfig;
            this.ownerId = request.ownerId;
            this.rate = request.rate;
            this.resourceOwnerAccount = request.resourceOwnerAccount;
            this.resourceOwnerId = request.resourceOwnerId;
        } 

        /**
         * The authorization code.
         * <p>
         * 
         * >  On the ****[**Labels**](https://dytns.console.aliyun.com/analysis/square) page, find the label that you want to use, click Activate Now, enter the required information, and then submit your application. After your application is approved, you can obtain an authorization code.
         */
        public Builder authCode(String authCode) {
            this.putQueryParameter("AuthCode", authCode);
            this.authCode = authCode;
            return this;
        }

        /**
         * The phone number to be queried.
         */
        public Builder inputNumber(String inputNumber) {
            this.putQueryParameter("InputNumber", inputNumber);
            this.inputNumber = inputNumber;
            return this;
        }

        /**
         * The model parameter configuration. This field is required by some labels.
         */
        public Builder modelConfig(String modelConfig) {
            this.putQueryParameter("ModelConfig", modelConfig);
            this.modelConfig = modelConfig;
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
         * The score threshold for the phone number. Valid values: **0 to 100**.
         * <p>
         * 
         * >  The system provided by Alibaba Cloud determines whether to accept the specified score threshold. When the system does not accept the specified score threshold, the value of this field is invalid.
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
        public DescribePhoneNumberAnalysisAIRequest build() {
            return new DescribePhoneNumberAnalysisAIRequest(this);
        } 

    } 

}
