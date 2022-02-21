// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.chatbot20171011.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateKnowledgeResponseBody} extends {@link TeaModel}
 *
 * <p>UpdateKnowledgeResponseBody</p>
 */
public class UpdateKnowledgeResponseBody extends TeaModel {
    @NameInMap("KnowledgeId")
    private Long knowledgeId;

    @NameInMap("RequestId")
    private String requestId;

    private UpdateKnowledgeResponseBody(Builder builder) {
        this.knowledgeId = builder.knowledgeId;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateKnowledgeResponseBody create() {
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
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public UpdateKnowledgeResponseBody build() {
            return new UpdateKnowledgeResponseBody(this);
        } 

    } 

}
