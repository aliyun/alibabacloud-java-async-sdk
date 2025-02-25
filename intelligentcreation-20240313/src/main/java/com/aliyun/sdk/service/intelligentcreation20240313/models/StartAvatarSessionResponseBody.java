// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.intelligentcreation20240313.models;

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
 * {@link StartAvatarSessionResponseBody} extends {@link TeaModel}
 *
 * <p>StartAvatarSessionResponseBody</p>
 */
public class StartAvatarSessionResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("channelToken")
    private String channelToken;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("sessionId")
    private String sessionId;

    @com.aliyun.core.annotation.NameInMap("token")
    private String token;

    @com.aliyun.core.annotation.NameInMap("webSocketUrl")
    private String webSocketUrl;

    private StartAvatarSessionResponseBody(Builder builder) {
        this.channelToken = builder.channelToken;
        this.requestId = builder.requestId;
        this.sessionId = builder.sessionId;
        this.token = builder.token;
        this.webSocketUrl = builder.webSocketUrl;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static StartAvatarSessionResponseBody create() {
        return builder().build();
    }

    /**
     * @return channelToken
     */
    public String getChannelToken() {
        return this.channelToken;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return sessionId
     */
    public String getSessionId() {
        return this.sessionId;
    }

    /**
     * @return token
     */
    public String getToken() {
        return this.token;
    }

    /**
     * @return webSocketUrl
     */
    public String getWebSocketUrl() {
        return this.webSocketUrl;
    }

    public static final class Builder {
        private String channelToken; 
        private String requestId; 
        private String sessionId; 
        private String token; 
        private String webSocketUrl; 

        /**
         * channelToken.
         */
        public Builder channelToken(String channelToken) {
            this.channelToken = channelToken;
            return this;
        }

        /**
         * requestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * sessionId.
         */
        public Builder sessionId(String sessionId) {
            this.sessionId = sessionId;
            return this;
        }

        /**
         * token.
         */
        public Builder token(String token) {
            this.token = token;
            return this;
        }

        /**
         * webSocketUrl.
         */
        public Builder webSocketUrl(String webSocketUrl) {
            this.webSocketUrl = webSocketUrl;
            return this;
        }

        public StartAvatarSessionResponseBody build() {
            return new StartAvatarSessionResponseBody(this);
        } 

    } 

}
