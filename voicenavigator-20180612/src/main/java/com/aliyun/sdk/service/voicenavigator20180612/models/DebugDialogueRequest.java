// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.voicenavigator20180612.models;

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
 * {@link DebugDialogueRequest} extends {@link RequestModel}
 *
 * <p>DebugDialogueRequest</p>
 */
public class DebugDialogueRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AdditionalContext")
    private String additionalContext;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ConversationId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String conversationId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Utterance")
    @com.aliyun.core.annotation.Validation(required = true)
    private String utterance;

    private DebugDialogueRequest(Builder builder) {
        super(builder);
        this.additionalContext = builder.additionalContext;
        this.conversationId = builder.conversationId;
        this.instanceId = builder.instanceId;
        this.utterance = builder.utterance;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DebugDialogueRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return additionalContext
     */
    public String getAdditionalContext() {
        return this.additionalContext;
    }

    /**
     * @return conversationId
     */
    public String getConversationId() {
        return this.conversationId;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return utterance
     */
    public String getUtterance() {
        return this.utterance;
    }

    public static final class Builder extends Request.Builder<DebugDialogueRequest, Builder> {
        private String additionalContext; 
        private String conversationId; 
        private String instanceId; 
        private String utterance; 

        private Builder() {
            super();
        } 

        private Builder(DebugDialogueRequest request) {
            super(request);
            this.additionalContext = request.additionalContext;
            this.conversationId = request.conversationId;
            this.instanceId = request.instanceId;
            this.utterance = request.utterance;
        } 

        /**
         * AdditionalContext.
         */
        public Builder additionalContext(String additionalContext) {
            this.putQueryParameter("AdditionalContext", additionalContext);
            this.additionalContext = additionalContext;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>7cefbff0-8d50-4d6f-b93c-73cee23c1555</p>
         */
        public Builder conversationId(String conversationId) {
            this.putQueryParameter("ConversationId", conversationId);
            this.conversationId = conversationId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>abb4aa26-3a8e-43dd-82f8-0c3898c9c67f</p>
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder utterance(String utterance) {
            this.putQueryParameter("Utterance", utterance);
            this.utterance = utterance;
            return this;
        }

        @Override
        public DebugDialogueRequest build() {
            return new DebugDialogueRequest(this);
        } 

    } 

}
