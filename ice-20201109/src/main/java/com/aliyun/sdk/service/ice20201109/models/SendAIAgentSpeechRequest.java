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

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Type")
    private String type;

    private SendAIAgentSpeechRequest(Builder builder) {
        super(builder);
        this.enableInterrupt = builder.enableInterrupt;
        this.instanceId = builder.instanceId;
        this.text = builder.text;
        this.type = builder.type;
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

    /**
     * @return type
     */
    public String getType() {
        return this.type;
    }

    public static final class Builder extends Request.Builder<SendAIAgentSpeechRequest, Builder> {
        private Boolean enableInterrupt; 
        private String instanceId; 
        private String text; 
        private String type; 

        private Builder() {
            super();
        } 

        private Builder(SendAIAgentSpeechRequest request) {
            super(request);
            this.enableInterrupt = request.enableInterrupt;
            this.instanceId = request.instanceId;
            this.text = request.text;
            this.type = request.type;
        } 

        /**
         * <p>Specifies whether this proactive broadcast can interrupt the current voice playback. Default value: true.</p>
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
         * <p>The instance ID of the agent.</p>
         * <blockquote>
         * <p>InstanceId is the unique ID returned after an agent instance is successfully started. For the operations used to start an agent instance, see <a href="https://help.aliyun.com/document_detail/2846201.html">StartAIAgentInstance</a> and <a href="https://help.aliyun.com/document_detail/2846209.html">GenerateAIAgentCall</a>.</p>
         * </blockquote>
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
         * <p>The text content to be broadcast. Different input types are supported based on the Type parameter. The length cannot exceed 1,024 characters.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>Hello, welcome to use our service</p>
         */
        public Builder text(String text) {
            this.putQueryParameter("Text", text);
            this.text = text;
            return this;
        }

        /**
         * <p>The input type. Valid values:</p>
         * <ul>
         * <li><p>Text: text input.</p>
         * </li>
         * <li><p>AudioUrl: audio URL input.</p>
         * </li>
         * </ul>
         * <p>Default value: Text.</p>
         * 
         * <strong>example:</strong>
         * <p>Text</p>
         */
        public Builder type(String type) {
            this.putQueryParameter("Type", type);
            this.type = type;
            return this;
        }

        @Override
        public SendAIAgentSpeechRequest build() {
            return new SendAIAgentSpeechRequest(this);
        } 

    } 

}
