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
 * {@link CreateKnowledgeBaseResponseBody} extends {@link TeaModel}
 *
 * <p>CreateKnowledgeBaseResponseBody</p>
 */
public class CreateKnowledgeBaseResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("KnowledgeBaseId")
    private String knowledgeBaseId;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private CreateKnowledgeBaseResponseBody(Builder builder) {
        this.knowledgeBaseId = builder.knowledgeBaseId;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateKnowledgeBaseResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return knowledgeBaseId
     */
    public String getKnowledgeBaseId() {
        return this.knowledgeBaseId;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String knowledgeBaseId; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(CreateKnowledgeBaseResponseBody model) {
            this.knowledgeBaseId = model.knowledgeBaseId;
            this.requestId = model.requestId;
        } 

        /**
         * KnowledgeBaseId.
         */
        public Builder knowledgeBaseId(String knowledgeBaseId) {
            this.knowledgeBaseId = knowledgeBaseId;
            return this;
        }

        /**
         * <p>Id of the request</p>
         * 
         * <strong>example:</strong>
         * <p>E56531A4-E552-40BA-9C58-137B80******</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public CreateKnowledgeBaseResponseBody build() {
            return new CreateKnowledgeBaseResponseBody(this);
        } 

    } 

}
