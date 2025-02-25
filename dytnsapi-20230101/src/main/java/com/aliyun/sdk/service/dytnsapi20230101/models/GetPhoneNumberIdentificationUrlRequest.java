// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dytnsapi20230101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetPhoneNumberIdentificationUrlRequest} extends {@link RequestModel}
 *
 * <p>GetPhoneNumberIdentificationUrlRequest</p>
 */
public class GetPhoneNumberIdentificationUrlRequest extends Request {
    @Query
    @NameInMap("AuthCode")
    @Validation(required = true)
    private String authCode;

    @Query
    @NameInMap("Ip")
    private String ip;

    @Query
    @NameInMap("OutId")
    @Validation(required = true)
    private String outId;

    @Query
    @NameInMap("OwnerId")
    private Long ownerId;

    @Query
    @NameInMap("PhoneNumber")
    @Validation(required = true)
    private String phoneNumber;

    @Query
    @NameInMap("RememberPhoneNumber")
    private Boolean rememberPhoneNumber;

    @Query
    @NameInMap("ResourceOwnerAccount")
    private String resourceOwnerAccount;

    @Query
    @NameInMap("ResourceOwnerId")
    private Long resourceOwnerId;

    private GetPhoneNumberIdentificationUrlRequest(Builder builder) {
        super(builder);
        this.authCode = builder.authCode;
        this.ip = builder.ip;
        this.outId = builder.outId;
        this.ownerId = builder.ownerId;
        this.phoneNumber = builder.phoneNumber;
        this.rememberPhoneNumber = builder.rememberPhoneNumber;
        this.resourceOwnerAccount = builder.resourceOwnerAccount;
        this.resourceOwnerId = builder.resourceOwnerId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetPhoneNumberIdentificationUrlRequest create() {
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
     * @return ip
     */
    public String getIp() {
        return this.ip;
    }

    /**
     * @return outId
     */
    public String getOutId() {
        return this.outId;
    }

    /**
     * @return ownerId
     */
    public Long getOwnerId() {
        return this.ownerId;
    }

    /**
     * @return phoneNumber
     */
    public String getPhoneNumber() {
        return this.phoneNumber;
    }

    /**
     * @return rememberPhoneNumber
     */
    public Boolean getRememberPhoneNumber() {
        return this.rememberPhoneNumber;
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

    public static final class Builder extends Request.Builder<GetPhoneNumberIdentificationUrlRequest, Builder> {
        private String authCode; 
        private String ip; 
        private String outId; 
        private Long ownerId; 
        private String phoneNumber; 
        private Boolean rememberPhoneNumber; 
        private String resourceOwnerAccount; 
        private Long resourceOwnerId; 

        private Builder() {
            super();
        } 

        private Builder(GetPhoneNumberIdentificationUrlRequest request) {
            super(request);
            this.authCode = request.authCode;
            this.ip = request.ip;
            this.outId = request.outId;
            this.ownerId = request.ownerId;
            this.phoneNumber = request.phoneNumber;
            this.rememberPhoneNumber = request.rememberPhoneNumber;
            this.resourceOwnerAccount = request.resourceOwnerAccount;
            this.resourceOwnerId = request.resourceOwnerId;
        } 

        /**
         * The authorization code.
         */
        public Builder authCode(String authCode) {
            this.putQueryParameter("AuthCode", authCode);
            this.authCode = authCode;
            return this;
        }

        /**
         * The IP address of the subscriber\"s phone.
         */
        public Builder ip(String ip) {
            this.putQueryParameter("Ip", ip);
            this.ip = ip;
            return this;
        }

        /**
         * The external ID.
         */
        public Builder outId(String outId) {
            this.putQueryParameter("OutId", outId);
            this.outId = outId;
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
         * The phone number of the subscriber. The phone number is in the Mobile Station International Subscriber Directory Number (MSISDN) format.
         */
        public Builder phoneNumber(String phoneNumber) {
            this.putQueryParameter("PhoneNumber", phoneNumber);
            this.phoneNumber = phoneNumber;
            return this;
        }

        /**
         * Specifies whether to remember the phone number.
         */
        public Builder rememberPhoneNumber(Boolean rememberPhoneNumber) {
            this.putQueryParameter("RememberPhoneNumber", rememberPhoneNumber);
            this.rememberPhoneNumber = rememberPhoneNumber;
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
        public GetPhoneNumberIdentificationUrlRequest build() {
            return new GetPhoneNumberIdentificationUrlRequest(this);
        } 

    } 

}
