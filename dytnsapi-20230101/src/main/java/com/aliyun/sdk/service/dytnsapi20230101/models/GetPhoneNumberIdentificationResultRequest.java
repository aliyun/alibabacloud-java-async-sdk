// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dytnsapi20230101.models;

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
 * {@link GetPhoneNumberIdentificationResultRequest} extends {@link RequestModel}
 *
 * <p>GetPhoneNumberIdentificationResultRequest</p>
 */
public class GetPhoneNumberIdentificationResultRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AuthCode")
    @com.aliyun.core.annotation.Validation(required = true)
    private String authCode;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OutId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String outId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OwnerId")
    private Long ownerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PhoneNumber")
    @com.aliyun.core.annotation.Validation(required = true)
    private String phoneNumber;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceOwnerAccount")
    private String resourceOwnerAccount;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceOwnerId")
    private Long resourceOwnerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SessionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String sessionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SessionPayload")
    @com.aliyun.core.annotation.Validation(required = true)
    private String sessionPayload;

    private GetPhoneNumberIdentificationResultRequest(Builder builder) {
        super(builder);
        this.authCode = builder.authCode;
        this.outId = builder.outId;
        this.ownerId = builder.ownerId;
        this.phoneNumber = builder.phoneNumber;
        this.resourceOwnerAccount = builder.resourceOwnerAccount;
        this.resourceOwnerId = builder.resourceOwnerId;
        this.sessionId = builder.sessionId;
        this.sessionPayload = builder.sessionPayload;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetPhoneNumberIdentificationResultRequest create() {
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
     * @return sessionId
     */
    public String getSessionId() {
        return this.sessionId;
    }

    /**
     * @return sessionPayload
     */
    public String getSessionPayload() {
        return this.sessionPayload;
    }

    public static final class Builder extends Request.Builder<GetPhoneNumberIdentificationResultRequest, Builder> {
        private String authCode; 
        private String outId; 
        private Long ownerId; 
        private String phoneNumber; 
        private String resourceOwnerAccount; 
        private Long resourceOwnerId; 
        private String sessionId; 
        private String sessionPayload; 

        private Builder() {
            super();
        } 

        private Builder(GetPhoneNumberIdentificationResultRequest request) {
            super(request);
            this.authCode = request.authCode;
            this.outId = request.outId;
            this.ownerId = request.ownerId;
            this.phoneNumber = request.phoneNumber;
            this.resourceOwnerAccount = request.resourceOwnerAccount;
            this.resourceOwnerId = request.resourceOwnerId;
            this.sessionId = request.sessionId;
            this.sessionPayload = request.sessionPayload;
        } 

        /**
         * <p>The authorization code.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>K***9i7CIe</p>
         */
        public Builder authCode(String authCode) {
            this.putQueryParameter("AuthCode", authCode);
            this.authCode = authCode;
            return this;
        }

        /**
         * <p>The external ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>149b03d2-a749-4e6e-8f5b-34******5815</p>
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
         * <p>The phone number of the subscriber. The phone number to be verified must be in the Mobile Station International Subscriber Directory Number (MSISDN) format.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>628211****113</p>
         */
        public Builder phoneNumber(String phoneNumber) {
            this.putQueryParameter("PhoneNumber", phoneNumber);
            this.phoneNumber = phoneNumber;
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
         * <p>The session ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>8636b75e2fcb40c53ffecc2b5947115c.149b03d2a7494e6e8f5b34c915245815.707c7f0d93f4409db0761aa5da94ce01.1686******041</p>
         */
        public Builder sessionId(String sessionId) {
            this.putQueryParameter("SessionId", sessionId);
            this.sessionId = sessionId;
            return this;
        }

        /**
         * <p>The session payload.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>uQne0vsuNywXVvI4VP5taHsgDNsd3BwcbmrhjXi58WbxBGFW+e8ufMEi9j89YonphV6NZ1PIeKvboHtU1nsSjZMTcoFPfkjqaORIHdSlPb6vmIzqOnJMsP1KPQ8K1JLXSaAKsB2lQ5A9HCkX2HzDEwje14HYQsnPd/Ka2YWgXuL0N8GE9oYi25d4DdlU0XR52YjSj8GMLSgbW7yNxEPvUCOQG83FZfQqmIWG2+0C/fQ3gdG9WI7AeeHZo4IRKGtQnpjKGtZZl8VoLPNIswDqZeeyjCyZlKUXKrAt4Co9c4I4q8G1jZm53COQJ+DuTiWH7w+tois3WJwFV/HmdlAKt8SqpiVrEv47VQ9V+8FYsdKz3A3CRyBVgNj6wYKKbwaI9BdQoOkbYzzA8CfAKO5w1oYVD2nOcYS/AffbPbE31PJj7SdVvKghwPL56OVdjS9Hd0iW0SMBWD0F1iRNCUNHL3ffHcFjJLdhTrMt8VHSRn0nOlvO1ZaWqMQ0yE0q*************************kXTpoQLo0+0h+CEcf90hTg8XdMhj9B0A3SOINceLlmoZb3czvYl00+CC0075DjOX41YtnuAUfaNYPgLIZkjYyq+JopBQFAkxPUbJHC0oCzB9dQahUthWY38OPBs=</p>
         */
        public Builder sessionPayload(String sessionPayload) {
            this.putQueryParameter("SessionPayload", sessionPayload);
            this.sessionPayload = sessionPayload;
            return this;
        }

        @Override
        public GetPhoneNumberIdentificationResultRequest build() {
            return new GetPhoneNumberIdentificationResultRequest(this);
        } 

    } 

}
