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
 * {@link TwoElementsVerificationRequest} extends {@link RequestModel}
 *
 * <p>TwoElementsVerificationRequest</p>
 */
public class TwoElementsVerificationRequest extends Request {
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
    @com.aliyun.core.annotation.Validation(required = true)
    private String mask;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Name")
    @com.aliyun.core.annotation.Validation(required = true)
    private String name;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OwnerId")
    private Long ownerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceOwnerAccount")
    private String resourceOwnerAccount;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceOwnerId")
    private Long resourceOwnerId;

    private TwoElementsVerificationRequest(Builder builder) {
        super(builder);
        this.authCode = builder.authCode;
        this.inputNumber = builder.inputNumber;
        this.mask = builder.mask;
        this.name = builder.name;
        this.ownerId = builder.ownerId;
        this.resourceOwnerAccount = builder.resourceOwnerAccount;
        this.resourceOwnerId = builder.resourceOwnerId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static TwoElementsVerificationRequest create() {
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
     * @return name
     */
    public String getName() {
        return this.name;
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

    public static final class Builder extends Request.Builder<TwoElementsVerificationRequest, Builder> {
        private String authCode; 
        private String inputNumber; 
        private String mask; 
        private String name; 
        private Long ownerId; 
        private String resourceOwnerAccount; 
        private Long resourceOwnerId; 

        private Builder() {
            super();
        } 

        private Builder(TwoElementsVerificationRequest request) {
            super(request);
            this.authCode = request.authCode;
            this.inputNumber = request.inputNumber;
            this.mask = request.mask;
            this.name = request.name;
            this.ownerId = request.ownerId;
            this.resourceOwnerAccount = request.resourceOwnerAccount;
            this.resourceOwnerId = request.resourceOwnerId;
        } 

        /**
         * <p>The authorization code.</p>
         * <blockquote>
         * <p> On the <strong>My Applications</strong> page in the <a href="https://dytns.console.aliyun.com/analysis/apply">Cell Phone Number Service console</a>, you can obtain the authorization code (also known as authorization ID).</p>
         * </blockquote>
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
         * <p>The phone number to be verified.</p>
         * <ul>
         * <li>If the value of Mask is NORMAL, specify a value in plaintext for this field.</li>
         * <li>If the value of Mask is MD5, specify a MD5-encrypted value for this field.</li>
         * <li>If the value of Mask is SHA256, specify a SHA256-encrypted value for this field.</li>
         * </ul>
         * <blockquote>
         * <p> Letters in the encrypted strings are not case-sensitive.</p>
         * </blockquote>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1390000****</p>
         */
        public Builder inputNumber(String inputNumber) {
            this.putQueryParameter("InputNumber", inputNumber);
            this.inputNumber = inputNumber;
            return this;
        }

        /**
         * <p>The encryption method. Valid values:</p>
         * <ul>
         * <li><strong>NORMAL</strong>: plaintext</li>
         * <li><strong>MD5</strong></li>
         * <li><strong>SHA256</strong></li>
         * </ul>
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
         * <p>The name to be verified.</p>
         * <ul>
         * <li>If the value of Mask is NORMAL, specify a value in plaintext for this field.</li>
         * <li>If the value of Mask is MD5, specify a MD5-encrypted value for this field.</li>
         * <li>If the value of Mask is SHA256, specify a SHA256-encrypted value for this field.</li>
         * </ul>
         * <blockquote>
         * <p> Letters in the encrypted strings are not case-sensitive.</p>
         * </blockquote>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>Aliyun</p>
         */
        public Builder name(String name) {
            this.putQueryParameter("Name", name);
            this.name = name;
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

        @Override
        public TwoElementsVerificationRequest build() {
            return new TwoElementsVerificationRequest(this);
        } 

    } 

}
