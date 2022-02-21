// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link StartTerminalSessionResponseBody} extends {@link TeaModel}
 *
 * <p>StartTerminalSessionResponseBody</p>
 */
public class StartTerminalSessionResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("SessionId")
    private String sessionId;

    @NameInMap("SecurityToken")
    private String securityToken;

    @NameInMap("WebSocketUrl")
    private String webSocketUrl;

    private StartTerminalSessionResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.sessionId = builder.sessionId;
        this.securityToken = builder.securityToken;
        this.webSocketUrl = builder.webSocketUrl;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static StartTerminalSessionResponseBody create() {
        return builder().build();
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
     * @return securityToken
     */
    public String getSecurityToken() {
        return this.securityToken;
    }

    /**
     * @return webSocketUrl
     */
    public String getWebSocketUrl() {
        return this.webSocketUrl;
    }

    public static final class Builder {
        private String requestId; 
        private String sessionId; 
        private String securityToken; 
        private String webSocketUrl; 

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * The ID of the session.
         */
        public Builder sessionId(String sessionId) {
            this.sessionId = sessionId;
            return this;
        }

        /**
         * The request header attached to the WebSocket is used to verify the request.
         */
        public Builder securityToken(String securityToken) {
            this.securityToken = securityToken;
            return this;
        }

        /**
         * The URL of the WebSocket session to connect to the ECS instance. Contains the session ID("SessionId") and the "SecurityToken" used for system verification ".
         */
        public Builder webSocketUrl(String webSocketUrl) {
            this.webSocketUrl = webSocketUrl;
            return this;
        }

        public StartTerminalSessionResponseBody build() {
            return new StartTerminalSessionResponseBody(this);
        } 

    } 

}
