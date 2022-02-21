// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.chatbot20171011.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link PublishKnowledgeRequest} extends {@link RequestModel}
 *
 * <p>PublishKnowledgeRequest</p>
 */
public class PublishKnowledgeRequest extends Request {
    @Query
    @NameInMap("Async")
    private Boolean async;

    @Query
    @NameInMap("KnowledgeId")
    @Validation(required = true)
    private Long knowledgeId;

    private PublishKnowledgeRequest(Builder builder) {
        super(builder);
        this.async = builder.async;
        this.knowledgeId = builder.knowledgeId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static PublishKnowledgeRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return async
     */
    public Boolean getAsync() {
        return this.async;
    }

    /**
     * @return knowledgeId
     */
    public Long getKnowledgeId() {
        return this.knowledgeId;
    }

    public static final class Builder extends Request.Builder<PublishKnowledgeRequest, Builder> {
        private Boolean async; 
        private Long knowledgeId; 

        private Builder() {
            super();
        } 

        private Builder(PublishKnowledgeRequest response) {
            super(response);
            this.async = response.async;
            this.knowledgeId = response.knowledgeId;
        } 

        /**
         * Async.
         */
        public Builder async(Boolean async) {
            this.putQueryParameter("Async", async);
            this.async = async;
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
        public PublishKnowledgeRequest build() {
            return new PublishKnowledgeRequest(this);
        } 

    } 

}
