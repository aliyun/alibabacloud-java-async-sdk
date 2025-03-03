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

        /**
         * <p>Id of the request</p>
         * 
         * <strong>example:</strong>
         * <p>887FA855-89F4-5DB3-B305-C5879EC480E6</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * ServerSn.
         */
        public Builder serverSn(String serverSn) {
            this.serverSn = serverSn;
            return this;
        }

        /**
         * SessionId.
         */
        public Builder sessionId(String sessionId) {
            this.sessionId = sessionId;
            return this;
        }

        /**
         * SessionToken.
         */
        public Builder sessionToken(String sessionToken) {
            this.sessionToken = sessionToken;
            return this;
        }

        /**
         * WssEndpoint.
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
