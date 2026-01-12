// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.green20220926.models;

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
 * {@link LlmStreamChatRequest} extends {@link RequestModel}
 *
 * <p>LlmStreamChatRequest</p>
 */
public class LlmStreamChatRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Channel")
    private String channel;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Messages")
    private Object messages;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Temperature")
    private Float temperature;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("TopP")
    private Float topP;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Type")
    private String type;

    private LlmStreamChatRequest(Builder builder) {
        super(builder);
        this.channel = builder.channel;
        this.messages = builder.messages;
        this.temperature = builder.temperature;
        this.topP = builder.topP;
        this.type = builder.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static LlmStreamChatRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return channel
     */
    public String getChannel() {
        return this.channel;
    }

    /**
     * @return messages
     */
    public Object getMessages() {
        return this.messages;
    }

    /**
     * @return temperature
     */
    public Float getTemperature() {
        return this.temperature;
    }

    /**
     * @return topP
     */
    public Float getTopP() {
        return this.topP;
    }

    /**
     * @return type
     */
    public String getType() {
        return this.type;
    }

    public static final class Builder extends Request.Builder<LlmStreamChatRequest, Builder> {
        private String channel; 
        private Object messages; 
        private Float temperature; 
        private Float topP; 
        private String type; 

        private Builder() {
            super();
        } 

        private Builder(LlmStreamChatRequest request) {
            super(request);
            this.channel = request.channel;
            this.messages = request.messages;
            this.temperature = request.temperature;
            this.topP = request.topP;
            this.type = request.type;
        } 

        /**
         * Channel.
         */
        public Builder channel(String channel) {
            this.putBodyParameter("Channel", channel);
            this.channel = channel;
            return this;
        }

        /**
         * <p>Conversation information</p>
         * 
         * <strong>example:</strong>
         * <p>[{&quot;content&quot;:&quot;你好&quot;,&quot;role&quot;:&quot;user&quot;}]</p>
         */
        public Builder messages(Object messages) {
            this.putBodyParameter("Messages", messages);
            this.messages = messages;
            return this;
        }

        /**
         * <p>Temperature value for the large model</p>
         * 
         * <strong>example:</strong>
         * <p>0.5</p>
         */
        public Builder temperature(Float temperature) {
            this.putBodyParameter("Temperature", temperature);
            this.temperature = temperature;
            return this;
        }

        /**
         * <p>Top p parameter controlling the randomness of the large model&quot;s output.</p>
         * 
         * <strong>example:</strong>
         * <p>0.5</p>
         */
        public Builder topP(Float topP) {
            this.putBodyParameter("TopP", topP);
            this.topP = topP;
            return this;
        }

        /**
         * <p>Type of conversation</p>
         * 
         * <strong>example:</strong>
         * <p>image</p>
         */
        public Builder type(String type) {
            this.putBodyParameter("Type", type);
            this.type = type;
            return this;
        }

        @Override
        public LlmStreamChatRequest build() {
            return new LlmStreamChatRequest(this);
        } 

    } 

}
