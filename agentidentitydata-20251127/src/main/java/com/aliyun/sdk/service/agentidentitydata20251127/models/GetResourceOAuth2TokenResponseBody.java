// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.agentidentitydata20251127.models;

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
 * {@link GetResourceOAuth2TokenResponseBody} extends {@link TeaModel}
 *
 * <p>GetResourceOAuth2TokenResponseBody</p>
 */
public class GetResourceOAuth2TokenResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("AccessToken")
    private String accessToken;

    @com.aliyun.core.annotation.NameInMap("AuthorizationURL")
    private String authorizationURL;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("SessionStatus")
    private String sessionStatus;

    @com.aliyun.core.annotation.NameInMap("SessionURI")
    private String sessionURI;

    private GetResourceOAuth2TokenResponseBody(Builder builder) {
        this.accessToken = builder.accessToken;
        this.authorizationURL = builder.authorizationURL;
        this.requestId = builder.requestId;
        this.sessionStatus = builder.sessionStatus;
        this.sessionURI = builder.sessionURI;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetResourceOAuth2TokenResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return accessToken
     */
    public String getAccessToken() {
        return this.accessToken;
    }

    /**
     * @return authorizationURL
     */
    public String getAuthorizationURL() {
        return this.authorizationURL;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return sessionStatus
     */
    public String getSessionStatus() {
        return this.sessionStatus;
    }

    /**
     * @return sessionURI
     */
    public String getSessionURI() {
        return this.sessionURI;
    }

    public static final class Builder {
        private String accessToken; 
        private String authorizationURL; 
        private String requestId; 
        private String sessionStatus; 
        private String sessionURI; 

        private Builder() {
        } 

        private Builder(GetResourceOAuth2TokenResponseBody model) {
            this.accessToken = model.accessToken;
            this.authorizationURL = model.authorizationURL;
            this.requestId = model.requestId;
            this.sessionStatus = model.sessionStatus;
            this.sessionURI = model.sessionURI;
        } 

        /**
         * AccessToken.
         */
        public Builder accessToken(String accessToken) {
            this.accessToken = accessToken;
            return this;
        }

        /**
         * AuthorizationURL.
         */
        public Builder authorizationURL(String authorizationURL) {
            this.authorizationURL = authorizationURL;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * SessionStatus.
         */
        public Builder sessionStatus(String sessionStatus) {
            this.sessionStatus = sessionStatus;
            return this;
        }

        /**
         * SessionURI.
         */
        public Builder sessionURI(String sessionURI) {
            this.sessionURI = sessionURI;
            return this;
        }

        public GetResourceOAuth2TokenResponseBody build() {
            return new GetResourceOAuth2TokenResponseBody(this);
        } 

    } 

}
