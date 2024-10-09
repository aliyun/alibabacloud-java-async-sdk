// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.swas_open20200601.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link StartTerminalSessionResponseBody} extends {@link TeaModel}
 *
 * <p>StartTerminalSessionResponseBody</p>
 */
public class StartTerminalSessionResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("SecurityToken")
    private String securityToken;

    @com.aliyun.core.annotation.NameInMap("SessionId")
    private String sessionId;

    @com.aliyun.core.annotation.NameInMap("WebSocketUrl")
    private String webSocketUrl;

    private StartTerminalSessionResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.securityToken = builder.securityToken;
        this.sessionId = builder.sessionId;
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
     * @return securityToken
     */
    public String getSecurityToken() {
        return this.securityToken;
    }

    /**
     * @return sessionId
     */
    public String getSessionId() {
        return this.sessionId;
    }

    /**
     * @return webSocketUrl
     */
    public String getWebSocketUrl() {
        return this.webSocketUrl;
    }

    public static final class Builder {
        private String requestId; 
        private String securityToken; 
        private String sessionId; 
        private String webSocketUrl; 

        /**
         * <p>Id of the request</p>
         * 
         * <strong>example:</strong>
         * <p>20758A-585D-4A41-A9B2-28DA8F4F****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The security token included in the WebSocket request header. The system uses this token to authenticate the request.</p>
         * 
         * <strong>example:</strong>
         * <p>token-xxxaaz</p>
         */
        public Builder securityToken(String securityToken) {
            this.securityToken = securityToken;
            return this;
        }

        /**
         * <p>The session ID.</p>
         * 
         * <strong>example:</strong>
         * <p>ffb90b6e-b18a-4a33-88cf-86fb88****</p>
         */
        public Builder sessionId(String sessionId) {
            this.sessionId = sessionId;
            return this;
        }

        /**
         * <p>The URL of the WebSocket session that is used to connect to the server. The URL contains the session ID (<code>SessionId</code>) and the authentication token (<code>SecurityToken</code>).</p>
         * 
         * <strong>example:</strong>
         * <p>wss://xxxx</p>
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
