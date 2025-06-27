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
    @com.aliyun.core.annotation.NameInMap("Messages")
    private Object messages;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Temperature")
    private Float temperature;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("TopP")
    private Float topP;

    private LlmStreamChatRequest(Builder builder) {
        super(builder);
        this.messages = builder.messages;
        this.temperature = builder.temperature;
        this.topP = builder.topP;
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

    public static final class Builder extends Request.Builder<LlmStreamChatRequest, Builder> {
        private Object messages; 
        private Float temperature; 
        private Float topP; 

        private Builder() {
            super();
        } 

        private Builder(LlmStreamChatRequest request) {
            super(request);
            this.messages = request.messages;
            this.temperature = request.temperature;
            this.topP = request.topP;
        } 

        /**
         * Messages.
         */
        public Builder messages(Object messages) {
            this.putBodyParameter("Messages", messages);
            this.messages = messages;
            return this;
        }

        /**
         * Temperature.
         */
        public Builder temperature(Float temperature) {
            this.putBodyParameter("Temperature", temperature);
            this.temperature = temperature;
            return this;
        }

        /**
         * TopP.
         */
        public Builder topP(Float topP) {
            this.putBodyParameter("TopP", topP);
            this.topP = topP;
            return this;
        }

        @Override
        public LlmStreamChatRequest build() {
            return new LlmStreamChatRequest(this);
        } 

    } 

}
