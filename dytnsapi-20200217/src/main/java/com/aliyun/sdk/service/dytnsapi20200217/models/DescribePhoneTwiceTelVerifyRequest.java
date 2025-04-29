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
 * {@link DescribePhoneTwiceTelVerifyRequest} extends {@link RequestModel}
 *
 * <p>DescribePhoneTwiceTelVerifyRequest</p>
 */
public class DescribePhoneTwiceTelVerifyRequest extends Request {
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
    @com.aliyun.core.annotation.NameInMap("OwnerId")
    private Long ownerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceOwnerAccount")
    private String resourceOwnerAccount;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceOwnerId")
    private Long resourceOwnerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("StartTime")
    @com.aliyun.core.annotation.Validation(required = true)
    private String startTime;

    private DescribePhoneTwiceTelVerifyRequest(Builder builder) {
        super(builder);
        this.authCode = builder.authCode;
        this.inputNumber = builder.inputNumber;
        this.mask = builder.mask;
        this.ownerId = builder.ownerId;
        this.resourceOwnerAccount = builder.resourceOwnerAccount;
        this.resourceOwnerId = builder.resourceOwnerId;
        this.startTime = builder.startTime;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribePhoneTwiceTelVerifyRequest create() {
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
     * @return startTime
     */
    public String getStartTime() {
        return this.startTime;
    }

    public static final class Builder extends Request.Builder<DescribePhoneTwiceTelVerifyRequest, Builder> {
        private String authCode; 
        private String inputNumber; 
        private String mask; 
        private Long ownerId; 
        private String resourceOwnerAccount; 
        private Long resourceOwnerId; 
        private String startTime; 

        private Builder() {
            super();
        } 

        private Builder(DescribePhoneTwiceTelVerifyRequest request) {
            super(request);
            this.authCode = request.authCode;
            this.inputNumber = request.inputNumber;
            this.mask = request.mask;
            this.ownerId = request.ownerId;
            this.resourceOwnerAccount = request.resourceOwnerAccount;
            this.resourceOwnerId = request.resourceOwnerId;
            this.startTime = request.startTime;
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
         * <p>139*******</p>
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
         * <li><strong>MD5</strong></li>
         * <li><strong>SHA256</strong></li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>NORMAL</p>
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
         * <p>The registration time. Specify the time in the yyyy-MM-dd HH:mm:ss format. This time is the service registration time of the mobile phone user. If the service registration time is later than the time when the phone number is assigned by a carrier, it indicates that the phone number is not a reassigned number. Otherwise, the phone number is a reassigned number.</p>
         * <blockquote>
         * </blockquote>
         * <ul>
         * <li><p>If a carrier allocates a single number multiple times, the system will determine whether the phone number is a reassigned number based on the time when the carrier last allocated the phone number.</p>
         * </li>
         * <li><p>The service registration time must be later than 00:00:00 on January 1, 1970.</p>
         * </li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>2018-01-01 00:00:00</p>
         */
        public Builder startTime(String startTime) {
            this.putQueryParameter("StartTime", startTime);
            this.startTime = startTime;
            return this;
        }

        @Override
        public DescribePhoneTwiceTelVerifyRequest build() {
            return new DescribePhoneTwiceTelVerifyRequest(this);
        } 

    } 

}
