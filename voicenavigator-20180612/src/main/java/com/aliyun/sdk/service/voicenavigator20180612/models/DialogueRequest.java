// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.voicenavigator20180612.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DialogueRequest} extends {@link RequestModel}
 *
 * <p>DialogueRequest</p>
 */
public class DialogueRequest extends Request {
    @Query
    @NameInMap("AdditionalContext")
    private String additionalContext;

    @Query
    @NameInMap("CalledNumber")
    private String calledNumber;

    @Query
    @NameInMap("CallingNumber")
    private String callingNumber;

    @Query
    @NameInMap("ConversationId")
    @Validation(required = true)
    private String conversationId;

    @Query
    @NameInMap("Emotion")
    private String emotion;

    @Query
    @NameInMap("InstanceId")
    @Validation(required = true)
    private String instanceId;

    @Query
    @NameInMap("InstanceOwnerId")
    private Long instanceOwnerId;

    @Query
    @NameInMap("Utterance")
    @Validation(required = true)
    private String utterance;

    private DialogueRequest(Builder builder) {
        super(builder);
        this.additionalContext = builder.additionalContext;
        this.calledNumber = builder.calledNumber;
        this.callingNumber = builder.callingNumber;
        this.conversationId = builder.conversationId;
        this.emotion = builder.emotion;
        this.instanceId = builder.instanceId;
        this.instanceOwnerId = builder.instanceOwnerId;
        this.utterance = builder.utterance;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DialogueRequest create() {
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
     * @return calledNumber
     */
    public String getCalledNumber() {
        return this.calledNumber;
    }

    /**
     * @return callingNumber
     */
    public String getCallingNumber() {
        return this.callingNumber;
    }

    /**
     * @return conversationId
     */
    public String getConversationId() {
        return this.conversationId;
    }

    /**
     * @return emotion
     */
    public String getEmotion() {
        return this.emotion;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return instanceOwnerId
     */
    public Long getInstanceOwnerId() {
        return this.instanceOwnerId;
    }

    /**
     * @return utterance
     */
    public String getUtterance() {
        return this.utterance;
    }

    public static final class Builder extends Request.Builder<DialogueRequest, Builder> {
        private String additionalContext; 
        private String calledNumber; 
        private String callingNumber; 
        private String conversationId; 
        private String emotion; 
        private String instanceId; 
        private Long instanceOwnerId; 
        private String utterance; 

        private Builder() {
            super();
        } 

        private Builder(DialogueRequest request) {
            super(request);
            this.additionalContext = request.additionalContext;
            this.calledNumber = request.calledNumber;
            this.callingNumber = request.callingNumber;
            this.conversationId = request.conversationId;
            this.emotion = request.emotion;
            this.instanceId = request.instanceId;
            this.instanceOwnerId = request.instanceOwnerId;
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
         * CalledNumber.
         */
        public Builder calledNumber(String calledNumber) {
            this.putQueryParameter("CalledNumber", calledNumber);
            this.calledNumber = calledNumber;
            return this;
        }

        /**
         * CallingNumber.
         */
        public Builder callingNumber(String callingNumber) {
            this.putQueryParameter("CallingNumber", callingNumber);
            this.callingNumber = callingNumber;
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
         * Emotion.
         */
        public Builder emotion(String emotion) {
            this.putQueryParameter("Emotion", emotion);
            this.emotion = emotion;
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
         * InstanceOwnerId.
         */
        public Builder instanceOwnerId(Long instanceOwnerId) {
            this.putQueryParameter("InstanceOwnerId", instanceOwnerId);
            this.instanceOwnerId = instanceOwnerId;
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
        public DialogueRequest build() {
            return new DialogueRequest(this);
        } 

    } 

}
