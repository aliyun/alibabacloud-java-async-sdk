// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.chatbot20171011.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link MoveKnowledgeCategoryRequest} extends {@link RequestModel}
 *
 * <p>MoveKnowledgeCategoryRequest</p>
 */
public class MoveKnowledgeCategoryRequest extends Request {
    @Query
    @NameInMap("CategoryId")
    @Validation(required = true)
    private Long categoryId;

    @Query
    @NameInMap("KnowledgeId")
    @Validation(required = true)
    private Long knowledgeId;

    private MoveKnowledgeCategoryRequest(Builder builder) {
        super(builder);
        this.categoryId = builder.categoryId;
        this.knowledgeId = builder.knowledgeId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static MoveKnowledgeCategoryRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return categoryId
     */
    public Long getCategoryId() {
        return this.categoryId;
    }

    /**
     * @return knowledgeId
     */
    public Long getKnowledgeId() {
        return this.knowledgeId;
    }

    public static final class Builder extends Request.Builder<MoveKnowledgeCategoryRequest, Builder> {
        private Long categoryId; 
        private Long knowledgeId; 

        private Builder() {
            super();
        } 

        private Builder(MoveKnowledgeCategoryRequest response) {
            super(response);
            this.categoryId = response.categoryId;
            this.knowledgeId = response.knowledgeId;
        } 

        /**
         * CategoryId.
         */
        public Builder categoryId(Long categoryId) {
            this.putQueryParameter("CategoryId", categoryId);
            this.categoryId = categoryId;
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
        public MoveKnowledgeCategoryRequest build() {
            return new MoveKnowledgeCategoryRequest(this);
        } 

    } 

}
