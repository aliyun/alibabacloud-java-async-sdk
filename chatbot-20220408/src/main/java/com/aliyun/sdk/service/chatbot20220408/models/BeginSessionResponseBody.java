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

    public Builder toBuilder() {
        return new Builder(this);
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

        private Builder() {
        } 

        private Builder(BeginSessionResponseBody model) {
            this.asrMaxEndSilence = model.asrMaxEndSilence;
            this.interruptible = model.interruptible;
            this.requestId = model.requestId;
            this.silenceReplyTimeout = model.silenceReplyTimeout;
            this.welcomeMessage = model.welcomeMessage;
        } 

        /**
         * <p>The Automatic Speech Recognition (ASR) end-of-speech detection time. Unit: milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>700</p>
         */
        public Builder asrMaxEndSilence(Integer asrMaxEndSilence) {
            this.asrMaxEndSilence = asrMaxEndSilence;
            return this;
        }

        /**
         * <p>Indicates whether the voice broadcast can be interrupted.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder interruptible(Boolean interruptible) {
            this.interruptible = interruptible;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>149C7528-C104-1B50-A4F9-0C5907A8AD9D</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The silence timeout period. Unit: seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>5</p>
         */
        public Builder silenceReplyTimeout(Integer silenceReplyTimeout) {
            this.silenceReplyTimeout = silenceReplyTimeout;
            return this;
        }

        /**
         * <p>The welcome message.</p>
         * 
         * <strong>example:</strong>
         * <p>The intelligent chatbot is at your service. How can I help you?</p>
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
