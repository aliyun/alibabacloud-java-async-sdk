// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eflo_controller20221215.models;

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
 * {@link CreateSessionResponseBody} extends {@link TeaModel}
 *
 * <p>CreateSessionResponseBody</p>
 */
public class CreateSessionResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("ServerSn")
    private String serverSn;

    @com.aliyun.core.annotation.NameInMap("SessionId")
    private String sessionId;

    @com.aliyun.core.annotation.NameInMap("SessionToken")
    private String sessionToken;

    @com.aliyun.core.annotation.NameInMap("WssEndpoint")
    private String wssEndpoint;

    private CreateSessionResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.serverSn = builder.serverSn;
        this.sessionId = builder.sessionId;
        this.sessionToken = builder.sessionToken;
        this.wssEndpoint = builder.wssEndpoint;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateSessionResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return serverSn
     */
    public String getServerSn() {
        return this.serverSn;
    }

    /**
     * @return sessionId
     */
    public String getSessionId() {
        return this.sessionId;
    }

    /**
     * @return sessionToken
     */
    public String getSessionToken() {
        return this.sessionToken;
    }

    /**
     * @return wssEndpoint
     */
    public String getWssEndpoint() {
        return this.wssEndpoint;
    }

    public static final class Builder {
        private String requestId; 
        private String serverSn; 
        private String sessionId; 
        private String sessionToken; 
        private String wssEndpoint; 

        private Builder() {
        } 

        private Builder(CreateSessionResponseBody model) {
            this.requestId = model.requestId;
            this.serverSn = model.serverSn;
            this.sessionId = model.sessionId;
            this.sessionToken = model.sessionToken;
            this.wssEndpoint = model.wssEndpoint;
        } 

        /**
         * <p>ID of the request</p>
         * 
         * <strong>example:</strong>
         * <p>887FA855-89F4-5DB3-B305-C5879EC480E6</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>节点  ID。</p>
         * 
         * <strong>example:</strong>
         * <p>2A59143F1</p>
         */
        public Builder serverSn(String serverSn) {
            this.serverSn = serverSn;
            return this;
        }

        /**
         * <p>Session ID.</p>
         * 
         * <strong>example:</strong>
         * <p>i207023871669364793713</p>
         */
        public Builder sessionId(String sessionId) {
            this.sessionId = sessionId;
            return this;
        }

        /**
         * <p>Session token.</p>
         * 
         * <strong>example:</strong>
         * <p>03f53c719015a9ad4f4f55d66cac2dac161b18e8065ca75a3220b89de389c980</p>
         */
        public Builder sessionToken(String sessionToken) {
            this.sessionToken = sessionToken;
            return this;
        }

        /**
         * <p>WebSocket address</p>
         * 
         * <strong>example:</strong>
         * <p>ws://x.x.x.x:xx/calypso_web_console</p>
         */
        public Builder wssEndpoint(String wssEndpoint) {
            this.wssEndpoint = wssEndpoint;
            return this;
        }

        public CreateSessionResponseBody build() {
            return new CreateSessionResponseBody(this);
        } 

    } 

}
