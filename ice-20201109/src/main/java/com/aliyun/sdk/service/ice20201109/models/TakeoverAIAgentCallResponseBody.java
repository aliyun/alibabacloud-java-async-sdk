// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ice20201109.models;

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
 * {@link TakeoverAIAgentCallResponseBody} extends {@link TeaModel}
 *
 * <p>TakeoverAIAgentCallResponseBody</p>
 */
public class TakeoverAIAgentCallResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("ChannelId")
    private String channelId;

    @com.aliyun.core.annotation.NameInMap("HumanAgentUserId")
    private String humanAgentUserId;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Token")
    private String token;

    private TakeoverAIAgentCallResponseBody(Builder builder) {
        this.channelId = builder.channelId;
        this.humanAgentUserId = builder.humanAgentUserId;
        this.requestId = builder.requestId;
        this.token = builder.token;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static TakeoverAIAgentCallResponseBody create() {
        return builder().build();
    }

    /**
     * @return channelId
     */
    public String getChannelId() {
        return this.channelId;
    }

    /**
     * @return humanAgentUserId
     */
    public String getHumanAgentUserId() {
        return this.humanAgentUserId;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return token
     */
    public String getToken() {
        return this.token;
    }

    public static final class Builder {
        private String channelId; 
        private String humanAgentUserId; 
        private String requestId; 
        private String token; 

        /**
         * <p>The ID of the ARTC channel.</p>
         * 
         * <strong>example:</strong>
         * <p>70f22d5784194938a7e387052f2b3208</p>
         */
        public Builder channelId(String channelId) {
            this.channelId = channelId;
            return this;
        }

        /**
         * <p>The ID of the human agent.</p>
         * 
         * <strong>example:</strong>
         * <p>uid2</p>
         */
        public Builder humanAgentUserId(String humanAgentUserId) {
            this.humanAgentUserId = humanAgentUserId;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p><strong><strong><strong>3B-0E1A-586A-AC29-742247</strong></strong></strong></p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The ARTC token.</p>
         * 
         * <strong>example:</strong>
         * <p>eyJhcHBpZCI6ICIxMjM0MTIzNxxxxx</p>
         */
        public Builder token(String token) {
            this.token = token;
            return this;
        }

        public TakeoverAIAgentCallResponseBody build() {
            return new TakeoverAIAgentCallResponseBody(this);
        } 

    } 

}
