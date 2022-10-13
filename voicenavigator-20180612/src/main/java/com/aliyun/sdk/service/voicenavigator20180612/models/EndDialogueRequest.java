// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.voicenavigator20180612.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link EndDialogueRequest} extends {@link RequestModel}
 *
 * <p>EndDialogueRequest</p>
 */
public class EndDialogueRequest extends Request {
    @Query
    @NameInMap("ConversationId")
    @Validation(required = true)
    private String conversationId;

    @Query
    @NameInMap("HangUpParams")
    private String hangUpParams;

    @Query
    @NameInMap("InstanceId")
    @Validation(required = true)
    private String instanceId;

    @Query
    @NameInMap("InstanceOwnerId")
    private Long instanceOwnerId;

    private EndDialogueRequest(Builder builder) {
        super(builder);
        this.conversationId = builder.conversationId;
        this.hangUpParams = builder.hangUpParams;
        this.instanceId = builder.instanceId;
        this.instanceOwnerId = builder.instanceOwnerId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static EndDialogueRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return conversationId
     */
    public String getConversationId() {
        return this.conversationId;
    }

    /**
     * @return hangUpParams
     */
    public String getHangUpParams() {
        return this.hangUpParams;
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

    public static final class Builder extends Request.Builder<EndDialogueRequest, Builder> {
        private String conversationId; 
        private String hangUpParams; 
        private String instanceId; 
        private Long instanceOwnerId; 

        private Builder() {
            super();
        } 

        private Builder(EndDialogueRequest request) {
            super(request);
            this.conversationId = request.conversationId;
            this.hangUpParams = request.hangUpParams;
            this.instanceId = request.instanceId;
            this.instanceOwnerId = request.instanceOwnerId;
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
         * HangUpParams.
         */
        public Builder hangUpParams(String hangUpParams) {
            this.putQueryParameter("HangUpParams", hangUpParams);
            this.hangUpParams = hangUpParams;
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

        @Override
        public EndDialogueRequest build() {
            return new EndDialogueRequest(this);
        } 

    } 

}
