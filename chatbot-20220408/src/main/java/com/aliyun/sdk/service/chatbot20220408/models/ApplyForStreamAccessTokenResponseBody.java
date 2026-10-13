// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.chatbot20220408.models;

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
 * {@link ApplyForStreamAccessTokenResponseBody} extends {@link TeaModel}
 *
 * <p>ApplyForStreamAccessTokenResponseBody</p>
 */
public class ApplyForStreamAccessTokenResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("AccessToken")
    private String accessToken;

    @com.aliyun.core.annotation.NameInMap("ChannelId")
    private String channelId;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("StreamSecret")
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

        private Builder() {
        } 

        private Builder(ApplyForStreamAccessTokenResponseBody model) {
            this.accessToken = model.accessToken;
            this.channelId = model.channelId;
            this.requestId = model.requestId;
            this.streamSecret = model.streamSecret;
        } 

        /**
         * <p>The request token of the service.</p>
         * 
         * <strong>example:</strong>
         * <p>63ba97b4f18a4a04f715c81e8e643938</p>
         */
        public Builder accessToken(String accessToken) {
            this.accessToken = accessToken;
            return this;
        }

        /**
         * <p>The channel ID.</p>
         * 
         * <strong>example:</strong>
         * <p>cc9e88c0-4f41-4f1d-a1a9-91a72d2aa27d</p>
         */
        public Builder channelId(String channelId) {
            this.channelId = channelId;
            return this;
        }

        /**
         * <p>Id of the request</p>
         * 
         * <strong>example:</strong>
         * <p>736994BD-AA35-4742-88C9-E64BE4BAA14B</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The secret key of the business space, which is used to sign streaming requests.</p>
         * 
         * <strong>example:</strong>
         * <p>cc9e88c0-4f41-4f1d-a1a9-91a72d2aa27d</p>
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
