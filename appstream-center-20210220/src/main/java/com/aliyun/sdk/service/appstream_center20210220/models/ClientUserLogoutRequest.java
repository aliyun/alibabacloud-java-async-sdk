// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.appstream_center20210220.models;

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
 * {@link ClientUserLogoutRequest} extends {@link RequestModel}
 *
 * <p>ClientUserLogoutRequest</p>
 */
public class ClientUserLogoutRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClientId")
    private String clientId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("LoginToken")
    private String loginToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OfficeSiteId")
    private String officeSiteId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ProfileRegion")
    private String profileRegion;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SessionId")
    private String sessionId;

    private ClientUserLogoutRequest(Builder builder) {
        super(builder);
        this.clientId = builder.clientId;
        this.loginToken = builder.loginToken;
        this.officeSiteId = builder.officeSiteId;
        this.profileRegion = builder.profileRegion;
        this.sessionId = builder.sessionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ClientUserLogoutRequest create() {
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

    public static final class Builder extends Request.Builder<ClientUserLogoutRequest, Builder> {
        private String clientId; 
        private String loginToken; 
        private String officeSiteId; 
        private String profileRegion; 
        private String sessionId; 

        private Builder() {
            super();
        } 

        private Builder(ClientUserLogoutRequest request) {
            super(request);
            this.clientId = request.clientId;
            this.loginToken = request.loginToken;
            this.officeSiteId = request.officeSiteId;
            this.profileRegion = request.profileRegion;
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

        @Override
        public ClientUserLogoutRequest build() {
            return new ClientUserLogoutRequest(this);
        } 

    } 

}
