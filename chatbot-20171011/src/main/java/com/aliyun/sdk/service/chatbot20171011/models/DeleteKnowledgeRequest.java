// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.chatbot20171011.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteKnowledgeRequest} extends {@link RequestModel}
 *
 * <p>DeleteKnowledgeRequest</p>
 */
public class DeleteKnowledgeRequest extends Request {
    @Query
    @NameInMap("AgentKey")
    private String agentKey;

    @Query
    @NameInMap("KnowledgeId")
    @Validation(required = true)
    private Long knowledgeId;

    private DeleteKnowledgeRequest(Builder builder) {
        super(builder);
        this.agentKey = builder.agentKey;
        this.knowledgeId = builder.knowledgeId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteKnowledgeRequest create() {
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
     * @return knowledgeId
     */
    public Long getKnowledgeId() {
        return this.knowledgeId;
    }

    public static final class Builder extends Request.Builder<DeleteKnowledgeRequest, Builder> {
        private String agentKey; 
        private Long knowledgeId; 

        private Builder() {
            super();
        } 

        private Builder(DeleteKnowledgeRequest request) {
            super(request);
            this.agentKey = request.agentKey;
            this.knowledgeId = request.knowledgeId;
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
         * KnowledgeId.
         */
        public Builder knowledgeId(Long knowledgeId) {
            this.putQueryParameter("KnowledgeId", knowledgeId);
            this.knowledgeId = knowledgeId;
            return this;
        }

        @Override
        public DeleteKnowledgeRequest build() {
            return new DeleteKnowledgeRequest(this);
        } 

    } 

}
