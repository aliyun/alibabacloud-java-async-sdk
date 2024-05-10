// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.chatbot20220408.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link BeginSessionResponseBody} extends {@link TeaModel}
 *
 * <p>BeginSessionResponseBody</p>
 */
public class BeginSessionResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("AsrMaxEndSilence")
    private Integer asrMaxEndSilence;

    @com.aliyun.core.annotation.NameInMap("Interruptible")
    private Boolean interruptible;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("SilenceReplyTimeout")
    private Integer silenceReplyTimeout;

    @com.aliyun.core.annotation.NameInMap("WelcomeMessage")
    private String welcomeMessage;

    private BeginSessionResponseBody(Builder builder) {
        this.asrMaxEndSilence = builder.asrMaxEndSilence;
        this.interruptible = builder.interruptible;
        this.requestId = builder.requestId;
        this.silenceReplyTimeout = builder.silenceReplyTimeout;
        this.welcomeMessage = builder.welcomeMessage;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static BeginSessionResponseBody create() {
        return builder().build();
    }

    /**
     * @return asrMaxEndSilence
     */
    public Integer getAsrMaxEndSilence() {
        return this.asrMaxEndSilence;
    }

    /**
     * @return interruptible
     */
    public Boolean getInterruptible() {
        return this.interruptible;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return silenceReplyTimeout
     */
    public Integer getSilenceReplyTimeout() {
        return this.silenceReplyTimeout;
    }

    /**
     * @return welcomeMessage
     */
    public String getWelcomeMessage() {
        return this.welcomeMessage;
    }

    public static final class Builder {
        private Integer asrMaxEndSilence; 
        private Boolean interruptible; 
        private String requestId; 
        private Integer silenceReplyTimeout; 
        private String welcomeMessage; 

        /**
         * AsrMaxEndSilence.
         */
        public Builder asrMaxEndSilence(Integer asrMaxEndSilence) {
            this.asrMaxEndSilence = asrMaxEndSilence;
            return this;
        }

        /**
         * Interruptible.
         */
        public Builder interruptible(Boolean interruptible) {
            this.interruptible = interruptible;
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
         * 静默超时时间
         */
        public Builder silenceReplyTimeout(Integer silenceReplyTimeout) {
            this.silenceReplyTimeout = silenceReplyTimeout;
            return this;
        }

        /**
         * WelcomeMessage.
         */
        public Builder welcomeMessage(String welcomeMessage) {
            this.welcomeMessage = welcomeMessage;
            return this;
        }

        public BeginSessionResponseBody build() {
            return new BeginSessionResponseBody(this);
        } 

    } 

}
