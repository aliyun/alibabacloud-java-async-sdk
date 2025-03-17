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
 * {@link SendAIAgentSpeechRequest} extends {@link RequestModel}
 *
 * <p>SendAIAgentSpeechRequest</p>
 */
public class SendAIAgentSpeechRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EnableInterrupt")
    private Boolean enableInterrupt;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Text")
    @com.aliyun.core.annotation.Validation(required = true)
    private String text;

    private SendAIAgentSpeechRequest(Builder builder) {
        super(builder);
        this.enableInterrupt = builder.enableInterrupt;
        this.instanceId = builder.instanceId;
        this.text = builder.text;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SendAIAgentSpeechRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return enableInterrupt
     */
    public Boolean getEnableInterrupt() {
        return this.enableInterrupt;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return text
     */
    public String getText() {
        return this.text;
    }

    public static final class Builder extends Request.Builder<SendAIAgentSpeechRequest, Builder> {
        private Boolean enableInterrupt; 
        private String instanceId; 
        private String text; 

        private Builder() {
            super();
        } 

        private Builder(SendAIAgentSpeechRequest request) {
            super(request);
            this.enableInterrupt = request.enableInterrupt;
            this.instanceId = request.instanceId;
            this.text = request.text;
        } 

        /**
         * <p>Specifies whether the broadcast can interrupt the ongoing speech. Default value: true</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder enableInterrupt(Boolean enableInterrupt) {
            this.putQueryParameter("EnableInterrupt", enableInterrupt);
            this.enableInterrupt = enableInterrupt;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>39f8e0bc005e4f309379701645f4****</p>
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder text(String text) {
            this.putQueryParameter("Text", text);
            this.text = text;
            return this;
        }

        @Override
        public SendAIAgentSpeechRequest build() {
            return new SendAIAgentSpeechRequest(this);
        } 

    } 

}
