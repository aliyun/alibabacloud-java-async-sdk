// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.chatbot20220408.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link UpdateDocResponseBody} extends {@link TeaModel}
 *
 * <p>UpdateDocResponseBody</p>
 */
public class UpdateDocResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("KnowledgeId")
    private Long knowledgeId;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private UpdateDocResponseBody(Builder builder) {
        this.knowledgeId = builder.knowledgeId;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateDocResponseBody create() {
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
         * <p>0F9F136A-1BF6-5CC1-9D57-9717761F03B8</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public UpdateDocResponseBody build() {
            return new UpdateDocResponseBody(this);
        } 

    } 

}
