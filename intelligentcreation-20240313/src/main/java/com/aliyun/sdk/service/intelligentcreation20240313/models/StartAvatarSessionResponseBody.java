// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.intelligentcreation20240313.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
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

    private StartAvatarSessionResponseBody(Builder builder) {
        this.channelToken = builder.channelToken;
        this.requestId = builder.requestId;
        this.sessionId = builder.sessionId;
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

    public static final class Builder {
        private String channelToken; 
        private String requestId; 
        private String sessionId; 

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

        public StartAvatarSessionResponseBody build() {
            return new StartAvatarSessionResponseBody(this);
        } 

    } 

}
