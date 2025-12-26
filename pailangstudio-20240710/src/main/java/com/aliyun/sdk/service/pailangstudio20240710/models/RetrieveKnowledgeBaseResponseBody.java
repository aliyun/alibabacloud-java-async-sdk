// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.pailangstudio20240710.models;

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
 * {@link RetrieveKnowledgeBaseResponseBody} extends {@link TeaModel}
 *
 * <p>RetrieveKnowledgeBaseResponseBody</p>
 */
public class RetrieveKnowledgeBaseResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("KnowledgeBaseFileChunks")
    private java.util.List<KnowledgeBaseFileChunk> knowledgeBaseFileChunks;

    private RetrieveKnowledgeBaseResponseBody(Builder builder) {
        this.knowledgeBaseFileChunks = builder.knowledgeBaseFileChunks;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static RetrieveKnowledgeBaseResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return knowledgeBaseFileChunks
     */
    public java.util.List<KnowledgeBaseFileChunk> getKnowledgeBaseFileChunks() {
        return this.knowledgeBaseFileChunks;
    }

    public static final class Builder {
        private java.util.List<KnowledgeBaseFileChunk> knowledgeBaseFileChunks; 

        private Builder() {
        } 

        private Builder(RetrieveKnowledgeBaseResponseBody model) {
            this.knowledgeBaseFileChunks = model.knowledgeBaseFileChunks;
        } 

        /**
         * KnowledgeBaseFileChunks.
         */
        public Builder knowledgeBaseFileChunks(java.util.List<KnowledgeBaseFileChunk> knowledgeBaseFileChunks) {
            this.knowledgeBaseFileChunks = knowledgeBaseFileChunks;
            return this;
        }

        public RetrieveKnowledgeBaseResponseBody build() {
            return new RetrieveKnowledgeBaseResponseBody(this);
        } 

    } 

}
