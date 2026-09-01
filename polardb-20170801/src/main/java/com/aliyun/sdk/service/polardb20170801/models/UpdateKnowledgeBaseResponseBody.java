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
 * {@link UpdateKnowledgeBaseResponseBody} extends {@link TeaModel}
 *
 * <p>UpdateKnowledgeBaseResponseBody</p>
 */
public class UpdateKnowledgeBaseResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("KnowledgeBaseId")
    private String knowledgeBaseId;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private UpdateKnowledgeBaseResponseBody(Builder builder) {
        this.knowledgeBaseId = builder.knowledgeBaseId;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateKnowledgeBaseResponseBody create() {
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

        private Builder(UpdateKnowledgeBaseResponseBody model) {
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
         * <p>EB07CFF0-D8A4-5C76-AED7-D00E26FC2***</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public UpdateKnowledgeBaseResponseBody build() {
            return new UpdateKnowledgeBaseResponseBody(this);
        } 

    } 

}
