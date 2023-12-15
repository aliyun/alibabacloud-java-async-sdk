// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.chatbot20171011.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteEntityRequest} extends {@link RequestModel}
 *
 * <p>DeleteEntityRequest</p>
 */
public class DeleteEntityRequest extends Request {
    @Query
    @NameInMap("AgentKey")
    private String agentKey;

    @Query
    @NameInMap("EntityId")
    @Validation(required = true)
    private Long entityId;

    private DeleteEntityRequest(Builder builder) {
        super(builder);
        this.agentKey = builder.agentKey;
        this.entityId = builder.entityId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteEntityRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return agentKey
     */
    public String getAgentKey() {
        return this.agentKey;
    }

    /**
     * @return entityId
     */
    public Long getEntityId() {
        return this.entityId;
    }

    public static final class Builder extends Request.Builder<DeleteEntityRequest, Builder> {
        private String agentKey; 
        private Long entityId; 

        private Builder() {
            super();
        } 

        private Builder(DeleteEntityRequest request) {
            super(request);
            this.agentKey = request.agentKey;
            this.entityId = request.entityId;
        } 

        /**
         * AgentKey.
         */
        public Builder agentKey(String agentKey) {
            this.putQueryParameter("AgentKey", agentKey);
            this.agentKey = agentKey;
            return this;
        }

        /**
         * EntityId.
         */
        public Builder entityId(Long entityId) {
            this.putQueryParameter("EntityId", entityId);
            this.entityId = entityId;
            return this;
        }

        @Override
        public DeleteEntityRequest build() {
            return new DeleteEntityRequest(this);
        } 

    } 

}
