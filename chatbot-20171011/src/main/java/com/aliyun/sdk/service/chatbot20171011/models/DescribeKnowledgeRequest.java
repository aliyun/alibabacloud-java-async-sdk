// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.chatbot20171011.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeKnowledgeRequest} extends {@link RequestModel}
 *
 * <p>DescribeKnowledgeRequest</p>
 */
public class DescribeKnowledgeRequest extends Request {
    @Query
    @NameInMap("KnowledgeId")
    @Validation(required = true)
    private Long knowledgeId;

    private DescribeKnowledgeRequest(Builder builder) {
        super(builder);
        this.knowledgeId = builder.knowledgeId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeKnowledgeRequest create() {
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

    public static final class Builder extends Request.Builder<DescribeKnowledgeRequest, Builder> {
        private Long knowledgeId; 

        private Builder() {
            super();
        } 

        private Builder(DescribeKnowledgeRequest response) {
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
        public DescribeKnowledgeRequest build() {
            return new DescribeKnowledgeRequest(this);
        } 

    } 

}
