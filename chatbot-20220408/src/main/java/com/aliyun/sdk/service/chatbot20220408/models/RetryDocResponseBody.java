// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.chatbot20220408.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link RetryDocResponseBody} extends {@link TeaModel}
 *
 * <p>RetryDocResponseBody</p>
 */
public class RetryDocResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("KnowledgeId")
    private Long knowledgeId;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private RetryDocResponseBody(Builder builder) {
        this.knowledgeId = builder.knowledgeId;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static RetryDocResponseBody create() {
        return builder().build();
    }

    /**
     * @return knowledgeId
     */
    public Long getKnowledgeId() {
        return this.knowledgeId;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private Long knowledgeId; 
        private String requestId; 

        /**
         * KnowledgeId.
         */
        public Builder knowledgeId(Long knowledgeId) {
            this.knowledgeId = knowledgeId;
            return this;
        }

        /**
         * <p>Id of the request</p>
         * 
         * <strong>example:</strong>
         * <p>6419BA93-D111-5225-8998-13E63E6D3940</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public RetryDocResponseBody build() {
            return new RetryDocResponseBody(this);
        } 

    } 

}
