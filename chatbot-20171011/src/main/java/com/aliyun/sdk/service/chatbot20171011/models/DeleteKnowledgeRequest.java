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
    @NameInMap("KnowledgeId")
    @Validation(required = true)
    private Long knowledgeId;

    private DeleteKnowledgeRequest(Builder builder) {
        super(builder);
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
     * @return knowledgeId
     */
    public Long getKnowledgeId() {
        return this.knowledgeId;
    }

    public static final class Builder extends Request.Builder<DeleteKnowledgeRequest, Builder> {
        private Long knowledgeId; 

        private Builder() {
            super();
        } 

        private Builder(DeleteKnowledgeRequest response) {
            super(response);
            this.knowledgeId = response.knowledgeId;
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
