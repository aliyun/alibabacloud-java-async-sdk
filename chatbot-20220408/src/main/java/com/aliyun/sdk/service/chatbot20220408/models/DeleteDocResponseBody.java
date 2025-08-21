// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.chatbot20220408.models;

import com.aliyun.sdk.gateway.pop.*;
import darabonba.core.*;
import darabonba.core.async.*;
import darabonba.core.sync.*;
import darabonba.core.client.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DeleteDocResponseBody} extends {@link TeaModel}
 *
 * <p>DeleteDocResponseBody</p>
 */
public class DeleteDocResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("KnowledgeId")
    private Long knowledgeId;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DeleteDocResponseBody(Builder builder) {
        this.knowledgeId = builder.knowledgeId;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteDocResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
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

        private Builder() {
        } 

        private Builder(DeleteDocResponseBody model) {
            this.knowledgeId = model.knowledgeId;
            this.requestId = model.requestId;
        } 

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

        public DeleteDocResponseBody build() {
            return new DeleteDocResponseBody(this);
        } 

    } 

}
