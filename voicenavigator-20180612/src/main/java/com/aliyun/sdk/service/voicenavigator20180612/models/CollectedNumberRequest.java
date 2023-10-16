// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.voicenavigator20180612.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CollectedNumberRequest} extends {@link RequestModel}
 *
 * <p>CollectedNumberRequest</p>
 */
public class CollectedNumberRequest extends Request {
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
    @NameInMap("InstanceOwnerId")
    private Long instanceOwnerId;

    @Query
    @NameInMap("Number")
    private String number;

    private CollectedNumberRequest(Builder builder) {
        super(builder);
        this.additionalContext = builder.additionalContext;
        this.conversationId = builder.conversationId;
        this.instanceId = builder.instanceId;
        this.instanceOwnerId = builder.instanceOwnerId;
        this.number = builder.number;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CollectedNumberRequest create() {
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
     * @return instanceOwnerId
     */
    public Long getInstanceOwnerId() {
        return this.instanceOwnerId;
    }

    /**
     * @return number
     */
    public String getNumber() {
        return this.number;
    }

    public static final class Builder extends Request.Builder<CollectedNumberRequest, Builder> {
        private String additionalContext; 
        private String conversationId; 
        private String instanceId; 
        private Long instanceOwnerId; 
        private String number; 

        private Builder() {
            super();
        } 

        private Builder(CollectedNumberRequest request) {
            super(request);
            this.additionalContext = request.additionalContext;
            this.conversationId = request.conversationId;
            this.instanceId = request.instanceId;
            this.instanceOwnerId = request.instanceOwnerId;
            this.number = request.number;
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
         * InstanceOwnerId.
         */
        public Builder instanceOwnerId(Long instanceOwnerId) {
            this.putQueryParameter("InstanceOwnerId", instanceOwnerId);
            this.instanceOwnerId = instanceOwnerId;
            return this;
        }

        /**
         * Number.
         */
        public Builder number(String number) {
            this.putQueryParameter("Number", number);
            this.number = number;
            return this;
        }

        @Override
        public CollectedNumberRequest build() {
            return new CollectedNumberRequest(this);
        } 

    } 

}
