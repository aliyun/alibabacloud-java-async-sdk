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
 * {@link DescribePhoneNumberOperatorAttributeRequest} extends {@link RequestModel}
 *
 * <p>DescribePhoneNumberOperatorAttributeRequest</p>
 */
public class DescribePhoneNumberOperatorAttributeRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AuthCode")
    @com.aliyun.core.annotation.Validation(required = true)
    private String authCode;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("FlowName")
    private String flowName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InputNumber")
    @com.aliyun.core.annotation.Validation(required = true)
    private String inputNumber;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Mask")
    @com.aliyun.core.annotation.Validation(required = true)
    private String mask;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OwnerId")
    private Long ownerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceOwnerAccount")
    private String resourceOwnerAccount;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceOwnerId")
    private Long resourceOwnerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResultCount")
    private String resultCount;

    private DescribePhoneNumberOperatorAttributeRequest(Builder builder) {
        super(builder);
        this.authCode = builder.authCode;
        this.flowName = builder.flowName;
        this.inputNumber = builder.inputNumber;
        this.mask = builder.mask;
        this.ownerId = builder.ownerId;
        this.resourceOwnerAccount = builder.resourceOwnerAccount;
        this.resourceOwnerId = builder.resourceOwnerId;
        this.resultCount = builder.resultCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribePhoneNumberOperatorAttributeRequest create() {
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
     * @return flowName
     */
    public String getFlowName() {
        return this.flowName;
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
     * @return ownerId
     */
    public Long getOwnerId() {
        return this.ownerId;
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
     * @return resultCount
     */
    public String getResultCount() {
        return this.resultCount;
    }

    public static final class Builder extends Request.Builder<DescribePhoneNumberOperatorAttributeRequest, Builder> {
        private String authCode; 
        private String flowName; 
        private String inputNumber; 
        private String mask; 
        private Long ownerId; 
        private String resourceOwnerAccount; 
        private Long resourceOwnerId; 
        private String resultCount; 

        private Builder() {
            super();
        } 

        private Builder(DescribePhoneNumberOperatorAttributeRequest request) {
            super(request);
            this.authCode = request.authCode;
            this.flowName = request.flowName;
            this.inputNumber = request.inputNumber;
            this.mask = request.mask;
            this.ownerId = request.ownerId;
            this.resourceOwnerAccount = request.resourceOwnerAccount;
            this.resourceOwnerId = request.resourceOwnerId;
            this.resultCount = request.resultCount;
        } 

        /**
         * <p>The authorization code.</p>
         * <blockquote>
         * <p> On the <strong>My Applications</strong> page in the <a href="https://dytns.console.aliyun.com/analysis/apply">Cell Phone Number Service console</a>, you can obtain the authorization code (also known as authorization ID).</p>
         * </blockquote>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>Dd1r***4id</p>
         */
        public Builder authCode(String authCode) {
            this.putQueryParameter("AuthCode", authCode);
            this.authCode = authCode;
            return this;
        }

        /**
         * FlowName.
         */
        public Builder flowName(String flowName) {
            this.putQueryParameter("FlowName", flowName);
            this.flowName = flowName;
            return this;
        }

        /**
         * <p>The phone number to be queried.</p>
         * <ul>
         * <li>If the value of Mask is NORMAL, specify an 11-digit phone number in plaintext.</li>
         * <li>If the value of Mask is MD5, specify a 32-bit string that is encrypted by using MD5.</li>
         * <li>If the value of Mask is SHA256, specify a 64-bit string that is encrypted by using SHA256.</li>
         * </ul>
         * <blockquote>
         * <p> Letters in the encrypted strings are not case-sensitive.</p>
         * </blockquote>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>139****1234</p>
         */
        public Builder inputNumber(String inputNumber) {
            this.putQueryParameter("InputNumber", inputNumber);
            this.inputNumber = inputNumber;
            return this;
        }

        /**
         * <p>The encryption method of the phone number. Valid values:</p>
         * <ul>
         * <li><strong>NORMAL</strong>: The phone number is not encrypted.</li>
         * <li><strong>MD5</strong>: The phone number is MD5-encrypted.</li>
         * <li><strong>SHA256</strong>: The phone number is SHA256-encrypted.</li>
         * </ul>
         * <blockquote>
         * <p>Letters in the string must be uppercase.</p>
         * </blockquote>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>MD5</p>
         */
        public Builder mask(String mask) {
            this.putQueryParameter("Mask", mask);
            this.mask = mask;
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
         * ResultCount.
         */
        public Builder resultCount(String resultCount) {
            this.putQueryParameter("ResultCount", resultCount);
            this.resultCount = resultCount;
            return this;
        }

        @Override
        public DescribePhoneNumberOperatorAttributeRequest build() {
            return new DescribePhoneNumberOperatorAttributeRequest(this);
        } 

    } 

}
