// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dytnsapi20200217.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribePhoneNumberOnlineTimeRequest} extends {@link RequestModel}
 *
 * <p>DescribePhoneNumberOnlineTimeRequest</p>
 */
public class DescribePhoneNumberOnlineTimeRequest extends Request {
    @Query
    @NameInMap("AuthCode")
    @Validation(required = true)
    private String authCode;

    @Query
    @NameInMap("Carrier")
    private String carrier;

    @Query
    @NameInMap("InputNumber")
    @Validation(required = true)
    private String inputNumber;

    @Query
    @NameInMap("Mask")
    @Validation(required = true)
    private String mask;

    @Query
    @NameInMap("OwnerId")
    private Long ownerId;

    @Query
    @NameInMap("ResourceOwnerAccount")
    private String resourceOwnerAccount;

    @Query
    @NameInMap("ResourceOwnerId")
    private Long resourceOwnerId;

    private DescribePhoneNumberOnlineTimeRequest(Builder builder) {
        super(builder);
        this.authCode = builder.authCode;
        this.carrier = builder.carrier;
        this.inputNumber = builder.inputNumber;
        this.mask = builder.mask;
        this.ownerId = builder.ownerId;
        this.resourceOwnerAccount = builder.resourceOwnerAccount;
        this.resourceOwnerId = builder.resourceOwnerId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribePhoneNumberOnlineTimeRequest create() {
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
     * @return carrier
     */
    public String getCarrier() {
        return this.carrier;
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

    public static final class Builder extends Request.Builder<DescribePhoneNumberOnlineTimeRequest, Builder> {
        private String authCode; 
        private String carrier; 
        private String inputNumber; 
        private String mask; 
        private Long ownerId; 
        private String resourceOwnerAccount; 
        private Long resourceOwnerId; 

        private Builder() {
            super();
        } 

        private Builder(DescribePhoneNumberOnlineTimeRequest request) {
            super(request);
            this.authCode = request.authCode;
            this.carrier = request.carrier;
            this.inputNumber = request.inputNumber;
            this.mask = request.mask;
            this.ownerId = request.ownerId;
            this.resourceOwnerAccount = request.resourceOwnerAccount;
            this.resourceOwnerId = request.resourceOwnerId;
        } 

        /**
         * The authorization code.
         * <p>
         * 
         * >  On the **My Applications** page in the [Cell Phone Number Service console](https://dytns.console.aliyun.com/analysis/apply), you can obtain the authorization code (also known as authorization ID).
         */
        public Builder authCode(String authCode) {
            this.putQueryParameter("AuthCode", authCode);
            this.authCode = authCode;
            return this;
        }

        /**
         * The carrier. Valid values:
         * <p>
         * 
         * *   **MOBILE**: China Mobile
         * *   **UNICOM**: China Unicom
         * *   **TELECOM**: China Telecom
         * 
         * >  Alibaba Cloud automatically determines the carrier based on the carrier who assigns the phone number. Therefore, the value of this field does not affect the query result.
         */
        public Builder carrier(String carrier) {
            this.putQueryParameter("Carrier", carrier);
            this.carrier = carrier;
            return this;
        }

        /**
         * The phone number to be queried.
         * <p>
         * 
         * *   If the value of Mask is NORMAL, specify an 11-digit phone number in plaintext.
         * *   If the value of Mask is MD5, specify a 32-bit string that is encrypted by using MD5.
         * *   If the value of Mask is SHA256, specify a 64-bit string that is encrypted by using SHA256.
         * 
         * >  Letters in the encrypted strings are not case-sensitive.
         */
        public Builder inputNumber(String inputNumber) {
            this.putQueryParameter("InputNumber", inputNumber);
            this.inputNumber = inputNumber;
            return this;
        }

        /**
         * The encryption method of the phone number. Valid values:
         * <p>
         * 
         * *   **NORMAL**: The phone number is not encrypted.
         * *   **MD5**
         * *   **SHA256**
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

        @Override
        public DescribePhoneNumberOnlineTimeRequest build() {
            return new DescribePhoneNumberOnlineTimeRequest(this);
        } 

    } 

}
