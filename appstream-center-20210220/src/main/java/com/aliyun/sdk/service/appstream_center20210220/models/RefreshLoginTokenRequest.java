// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.appstream_center20210220.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link RefreshLoginTokenRequest} extends {@link RequestModel}
 *
 * <p>RefreshLoginTokenRequest</p>
 */
public class RefreshLoginTokenRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClientId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String clientId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClientType")
    private String clientType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EndUserId")
    private String endUserId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("LoginIdentifier")
    private String loginIdentifier;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("LoginToken")
    @com.aliyun.core.annotation.Validation(required = true)
    private String loginToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OfficeSiteId")
    private String officeSiteId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ProfileRegion")
    private String profileRegion;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SessionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String sessionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Uuid")
    private String uuid;

    private RefreshLoginTokenRequest(Builder builder) {
        super(builder);
        this.clientId = builder.clientId;
        this.clientType = builder.clientType;
        this.endUserId = builder.endUserId;
        this.loginIdentifier = builder.loginIdentifier;
        this.loginToken = builder.loginToken;
        this.officeSiteId = builder.officeSiteId;
        this.profileRegion = builder.profileRegion;
        this.sessionId = builder.sessionId;
        this.uuid = builder.uuid;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static RefreshLoginTokenRequest create() {
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
     * @return clientType
     */
    public String getClientType() {
        return this.clientType;
    }

    /**
     * @return endUserId
     */
    public String getEndUserId() {
        return this.endUserId;
    }

    /**
     * @return loginIdentifier
     */
    public String getLoginIdentifier() {
        return this.loginIdentifier;
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
     * @return profileRegion
     */
    public String getProfileRegion() {
        return this.profileRegion;
    }

    /**
     * @return sessionId
     */
    public String getSessionId() {
        return this.sessionId;
    }

    /**
     * @return uuid
     */
    public String getUuid() {
        return this.uuid;
    }

    public static final class Builder extends Request.Builder<RefreshLoginTokenRequest, Builder> {
        private String clientId; 
        private String clientType; 
        private String endUserId; 
        private String loginIdentifier; 
        private String loginToken; 
        private String officeSiteId; 
        private String profileRegion; 
        private String sessionId; 
        private String uuid; 

        private Builder() {
            super();
        } 

        private Builder(RefreshLoginTokenRequest request) {
            super(request);
            this.clientId = request.clientId;
            this.clientType = request.clientType;
            this.endUserId = request.endUserId;
            this.loginIdentifier = request.loginIdentifier;
            this.loginToken = request.loginToken;
            this.officeSiteId = request.officeSiteId;
            this.profileRegion = request.profileRegion;
            this.sessionId = request.sessionId;
            this.uuid = request.uuid;
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
         * ClientType.
         */
        public Builder clientType(String clientType) {
            this.putQueryParameter("ClientType", clientType);
            this.clientType = clientType;
            return this;
        }

        /**
         * EndUserId.
         */
        public Builder endUserId(String endUserId) {
            this.putQueryParameter("EndUserId", endUserId);
            this.endUserId = endUserId;
            return this;
        }

        /**
         * LoginIdentifier.
         */
        public Builder loginIdentifier(String loginIdentifier) {
            this.putQueryParameter("LoginIdentifier", loginIdentifier);
            this.loginIdentifier = loginIdentifier;
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
         * ProfileRegion.
         */
        public Builder profileRegion(String profileRegion) {
            this.putQueryParameter("ProfileRegion", profileRegion);
            this.profileRegion = profileRegion;
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

        /**
         * Uuid.
         */
        public Builder uuid(String uuid) {
            this.putQueryParameter("Uuid", uuid);
            this.uuid = uuid;
            return this;
        }

        @Override
        public RefreshLoginTokenRequest build() {
            return new RefreshLoginTokenRequest(this);
        } 

    } 

}
