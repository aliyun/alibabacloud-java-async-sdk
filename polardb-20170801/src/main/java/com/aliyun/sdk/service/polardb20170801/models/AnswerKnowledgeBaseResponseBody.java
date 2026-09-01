// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.polardb20170801.models;

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
 * {@link AnswerKnowledgeBaseResponseBody} extends {@link TeaModel}
 *
 * <p>AnswerKnowledgeBaseResponseBody</p>
 */
public class AnswerKnowledgeBaseResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("QueryId")
    private String queryId;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Status")
    private String status;

    private AnswerKnowledgeBaseResponseBody(Builder builder) {
        this.queryId = builder.queryId;
        this.requestId = builder.requestId;
        this.status = builder.status;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AnswerKnowledgeBaseResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return queryId
     */
    public String getQueryId() {
        return this.queryId;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return status
     */
    public String getStatus() {
        return this.status;
    }

    public static final class Builder {
        private String queryId; 
        private String requestId; 
        private String status; 

        private Builder() {
        } 

        private Builder(AnswerKnowledgeBaseResponseBody model) {
            this.queryId = model.queryId;
            this.requestId = model.requestId;
            this.status = model.status;
        } 

        /**
         * QueryId.
         */
        public Builder queryId(String queryId) {
            this.queryId = queryId;
            return this;
        }

        /**
         * <p>Id of the request</p>
         * 
         * <strong>example:</strong>
         * <p>A7E6A8FD-C50B-46B2-BA85-D8B8D3******</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Status.
         */
        public Builder status(String status) {
            this.status = status;
            return this;
        }

        public AnswerKnowledgeBaseResponseBody build() {
            return new AnswerKnowledgeBaseResponseBody(this);
        } 

    } 

}
