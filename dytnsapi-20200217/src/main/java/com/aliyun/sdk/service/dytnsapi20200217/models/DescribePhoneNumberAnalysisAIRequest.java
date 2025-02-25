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
 * {@link DescribePhoneNumberAnalysisAIRequest} extends {@link RequestModel}
 *
 * <p>DescribePhoneNumberAnalysisAIRequest</p>
 */
public class DescribePhoneNumberAnalysisAIRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AuthCode")
    @com.aliyun.core.annotation.Validation(required = true)
    private String authCode;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InputNumber")
    @com.aliyun.core.annotation.Validation(required = true)
    private String inputNumber;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ModelConfig")
    private String modelConfig;

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
         * <p>The authorization code.</p>
         * <blockquote>
         * <p> On the ****<a href="https://dytns.console.aliyun.com/analysis/square"><strong>Labels</strong></a> page, find the label that you want to use, click Activate Now, enter the required information, and then submit your application. After your application is approved, you can obtain an authorization code.</p>
         * </blockquote>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>HwD***nG</p>
         */
        public Builder authCode(String authCode) {
            this.putQueryParameter("AuthCode", authCode);
            this.authCode = authCode;
            return this;
        }

        /**
         * <p>The phone number to be queried.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>187****5620</p>
         */
        public Builder inputNumber(String inputNumber) {
            this.putQueryParameter("InputNumber", inputNumber);
            this.inputNumber = inputNumber;
            return this;
        }

        /**
         * <p>The model parameter configuration. This field is required by some labels.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;trainingJobId&quot;: &quot;17**********48&quot;}</p>
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
         * <p>The score threshold for the phone number. Valid values: <strong>0 to 100</strong>.</p>
         * <blockquote>
         * <p> The system provided by Alibaba Cloud determines whether to accept the specified score threshold. When the system does not accept the specified score threshold, the value of this field is invalid.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>96</p>
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
