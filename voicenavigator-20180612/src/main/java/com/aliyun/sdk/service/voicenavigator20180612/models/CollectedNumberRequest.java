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
 * {@link CollectedNumberRequest} extends {@link RequestModel}
 *
 * <p>CollectedNumberRequest</p>
 */
public class CollectedNumberRequest extends Request {
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
    @com.aliyun.core.annotation.NameInMap("InstanceOwnerId")
    private Long instanceOwnerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Number")
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
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>0099b75d-60fd-4c63-8541-7fbba0ae6bb0</p>
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
         * <p>0099b75d-60fd-4c63-8541-7fbba0ae6bb0</p>
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
