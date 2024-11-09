// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecd20201002.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link SendTokenCodeRequest} extends {@link RequestModel}
 *
 * <p>SendTokenCodeRequest</p>
 */
public class SendTokenCodeRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClientId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String clientId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClientOS")
    private String clientOS;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClientVersion")
    private String clientVersion;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EndUserId")
    private String endUserId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("LoginToken")
    private String loginToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OfficeSiteId")
    private String officeSiteId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SessionId")
    private String sessionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TokenCode")
    private String tokenCode;

    private SendTokenCodeRequest(Builder builder) {
        super(builder);
        this.clientId = builder.clientId;
        this.clientOS = builder.clientOS;
        this.clientVersion = builder.clientVersion;
        this.endUserId = builder.endUserId;
        this.loginToken = builder.loginToken;
        this.officeSiteId = builder.officeSiteId;
        this.sessionId = builder.sessionId;
        this.tokenCode = builder.tokenCode;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SendTokenCodeRequest create() {
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
     * @return clientOS
     */
    public String getClientOS() {
        return this.clientOS;
    }

    /**
     * @return clientVersion
     */
    public String getClientVersion() {
        return this.clientVersion;
    }

    /**
     * @return endUserId
     */
    public String getEndUserId() {
        return this.endUserId;
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
     * @return sessionId
     */
    public String getSessionId() {
        return this.sessionId;
    }

    /**
     * @return tokenCode
     */
    public String getTokenCode() {
        return this.tokenCode;
    }

    public static final class Builder extends Request.Builder<SendTokenCodeRequest, Builder> {
        private String clientId; 
        private String clientOS; 
        private String clientVersion; 
        private String endUserId; 
        private String loginToken; 
        private String officeSiteId; 
        private String sessionId; 
        private String tokenCode; 

        private Builder() {
            super();
        } 

        private Builder(SendTokenCodeRequest request) {
            super(request);
            this.clientId = request.clientId;
            this.clientOS = request.clientOS;
            this.clientVersion = request.clientVersion;
            this.endUserId = request.endUserId;
            this.loginToken = request.loginToken;
            this.officeSiteId = request.officeSiteId;
            this.sessionId = request.sessionId;
            this.tokenCode = request.tokenCode;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>f4a0dc8e-1702-4728-9a60-95b27a35****</p>
         */
        public Builder clientId(String clientId) {
            this.putQueryParameter("ClientId", clientId);
            this.clientId = clientId;
            return this;
        }

        /**
         * ClientOS.
         */
        public Builder clientOS(String clientOS) {
            this.putQueryParameter("ClientOS", clientOS);
            this.clientOS = clientOS;
            return this;
        }

        /**
         * ClientVersion.
         */
        public Builder clientVersion(String clientVersion) {
            this.putQueryParameter("ClientVersion", clientVersion);
            this.clientVersion = clientVersion;
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
         * SessionId.
         */
        public Builder sessionId(String sessionId) {
            this.putQueryParameter("SessionId", sessionId);
            this.sessionId = sessionId;
            return this;
        }

        /**
         * TokenCode.
         */
        public Builder tokenCode(String tokenCode) {
            this.putQueryParameter("TokenCode", tokenCode);
            this.tokenCode = tokenCode;
            return this;
        }

        @Override
        public SendTokenCodeRequest build() {
            return new SendTokenCodeRequest(this);
        } 

    } 

}
