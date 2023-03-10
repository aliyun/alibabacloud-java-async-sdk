// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecd20201002.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link VerifyCredentialRequest} extends {@link RequestModel}
 *
 * <p>VerifyCredentialRequest</p>
 */
public class VerifyCredentialRequest extends Request {
    @Query
    @NameInMap("ClientId")
    @Validation(required = true)
    private String clientId;

    @Query
    @NameInMap("Credential")
    @Validation(required = true)
    private String credential;

    @Query
    @NameInMap("CredentialType")
    private String credentialType;

    @Query
    @NameInMap("EncryptedKey")
    private String encryptedKey;

    @Query
    @NameInMap("LoginToken")
    @Validation(required = true)
    private String loginToken;

    @Query
    @NameInMap("OfficeSiteId")
    @Validation(required = true)
    private String officeSiteId;

    @Query
    @NameInMap("RegionId")
    @Validation(required = true)
    private String regionId;

    @Query
    @NameInMap("SessionId")
    private String sessionId;

    private VerifyCredentialRequest(Builder builder) {
        super(builder);
        this.clientId = builder.clientId;
        this.credential = builder.credential;
        this.credentialType = builder.credentialType;
        this.encryptedKey = builder.encryptedKey;
        this.loginToken = builder.loginToken;
        this.officeSiteId = builder.officeSiteId;
        this.regionId = builder.regionId;
        this.sessionId = builder.sessionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static VerifyCredentialRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return clientId
     */
    public String getClientId() {
        return this.clientId;
    }

    /**
     * @return credential
     */
    public String getCredential() {
        return this.credential;
    }

    /**
     * @return credentialType
     */
    public String getCredentialType() {
        return this.credentialType;
    }

    /**
     * @return encryptedKey
     */
    public String getEncryptedKey() {
        return this.encryptedKey;
    }

    /**
     * @return loginToken
     */
    public String getLoginToken() {
        return this.loginToken;
    }

    /**
     * @return officeSiteId
     */
    public String getOfficeSiteId() {
        return this.officeSiteId;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return sessionId
     */
    public String getSessionId() {
        return this.sessionId;
    }

    public static final class Builder extends Request.Builder<VerifyCredentialRequest, Builder> {
        private String clientId; 
        private String credential; 
        private String credentialType; 
        private String encryptedKey; 
        private String loginToken; 
        private String officeSiteId; 
        private String regionId; 
        private String sessionId; 

        private Builder() {
            super();
        } 

        private Builder(VerifyCredentialRequest request) {
            super(request);
            this.clientId = request.clientId;
            this.credential = request.credential;
            this.credentialType = request.credentialType;
            this.encryptedKey = request.encryptedKey;
            this.loginToken = request.loginToken;
            this.officeSiteId = request.officeSiteId;
            this.regionId = request.regionId;
            this.sessionId = request.sessionId;
        } 

        /**
         * ClientId.
         */
        public Builder clientId(String clientId) {
            this.putQueryParameter("ClientId", clientId);
            this.clientId = clientId;
            return this;
        }

        /**
         * Credential.
         */
        public Builder credential(String credential) {
            this.putQueryParameter("Credential", credential);
            this.credential = credential;
            return this;
        }

        /**
         * CredentialType.
         */
        public Builder credentialType(String credentialType) {
            this.putQueryParameter("CredentialType", credentialType);
            this.credentialType = credentialType;
            return this;
        }

        /**
         * EncryptedKey.
         */
        public Builder encryptedKey(String encryptedKey) {
            this.putQueryParameter("EncryptedKey", encryptedKey);
            this.encryptedKey = encryptedKey;
            return this;
        }

        /**
         * LoginToken.
         */
        public Builder loginToken(String loginToken) {
            this.putQueryParameter("LoginToken", loginToken);
            this.loginToken = loginToken;
            return this;
        }

        /**
         * OfficeSiteId.
         */
        public Builder officeSiteId(String officeSiteId) {
            this.putQueryParameter("OfficeSiteId", officeSiteId);
            this.officeSiteId = officeSiteId;
            return this;
        }

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * SessionId.
         */
        public Builder sessionId(String sessionId) {
            this.putQueryParameter("SessionId", sessionId);
            this.sessionId = sessionId;
            return this;
        }

        @Override
        public VerifyCredentialRequest build() {
            return new VerifyCredentialRequest(this);
        } 

    } 

}
