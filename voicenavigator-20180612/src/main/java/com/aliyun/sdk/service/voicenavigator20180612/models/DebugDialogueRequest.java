// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.voicenavigator20180612.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DebugDialogueRequest} extends {@link RequestModel}
 *
 * <p>DebugDialogueRequest</p>
 */
public class DebugDialogueRequest extends Request {
    @Query
    @NameInMap("AdditionalContext")
    private String additionalContext;

    @Query
    @NameInMap("ConversationId")
    @Validation(required = true)
    private String conversationId;

    @Query
    @NameInMap("InstanceId")
    @Validation(required = true)
    private String instanceId;

    @Query
    @NameInMap("Utterance")
    @Validation(required = true)
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

        private Builder(DebugDialogueRequest response) {
            super(response);
            this.additionalContext = response.additionalContext;
            this.conversationId = response.conversationId;
            this.instanceId = response.instanceId;
            this.utterance = response.utterance;
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
         * ConversationId.
         */
        public Builder conversationId(String conversationId) {
            this.putQueryParameter("ConversationId", conversationId);
            this.conversationId = conversationId;
            return this;
        }

        /**
         * InstanceId.
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * Utterance.
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
