// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.chatbot20220408.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ApplyForStreamAccessTokenResponseBody} extends {@link TeaModel}
 *
 * <p>ApplyForStreamAccessTokenResponseBody</p>
 */
public class ApplyForStreamAccessTokenResponseBody extends TeaModel {
    @NameInMap("AccessToken")
    private String accessToken;

    @NameInMap("ChannelId")
    private String channelId;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("StreamSecret")
    private String streamSecret;

    private ApplyForStreamAccessTokenResponseBody(Builder builder) {
        this.accessToken = builder.accessToken;
        this.channelId = builder.channelId;
        this.requestId = builder.requestId;
        this.streamSecret = builder.streamSecret;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ApplyForStreamAccessTokenResponseBody create() {
        return builder().build();
    }

    /**
     * @return accessToken
     */
    public String getAccessToken() {
        return this.accessToken;
    }

    /**
     * @return channelId
     */
    public String getChannelId() {
        return this.channelId;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return streamSecret
     */
    public String getStreamSecret() {
        return this.streamSecret;
    }

    public static final class Builder {
        private String accessToken; 
        private String channelId; 
        private String requestId; 
        private String streamSecret; 

        /**
         * AccessToken.
         */
        public Builder accessToken(String accessToken) {
            this.accessToken = accessToken;
            return this;
        }

        /**
         * ChannelId.
         */
        public Builder channelId(String channelId) {
            this.channelId = channelId;
            return this;
        }

        /**
         * Id of the request
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * StreamSecret.
         */
        public Builder streamSecret(String streamSecret) {
            this.streamSecret = streamSecret;
            return this;
        }

        public ApplyForStreamAccessTokenResponseBody build() {
            return new ApplyForStreamAccessTokenResponseBody(this);
        } 

    } 

}
