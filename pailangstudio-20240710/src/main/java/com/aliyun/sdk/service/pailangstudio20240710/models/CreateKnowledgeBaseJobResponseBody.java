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
 * {@link CreateKnowledgeBaseJobResponseBody} extends {@link TeaModel}
 *
 * <p>CreateKnowledgeBaseJobResponseBody</p>
 */
public class CreateKnowledgeBaseJobResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("KnowledgeBaseJobId")
    private String knowledgeBaseJobId;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private CreateKnowledgeBaseJobResponseBody(Builder builder) {
        this.knowledgeBaseJobId = builder.knowledgeBaseJobId;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateKnowledgeBaseJobResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return knowledgeBaseJobId
     */
    public String getKnowledgeBaseJobId() {
        return this.knowledgeBaseJobId;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String knowledgeBaseJobId; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(CreateKnowledgeBaseJobResponseBody model) {
            this.knowledgeBaseJobId = model.knowledgeBaseJobId;
            this.requestId = model.requestId;
        } 

        /**
         * KnowledgeBaseJobId.
         */
        public Builder knowledgeBaseJobId(String knowledgeBaseJobId) {
            this.knowledgeBaseJobId = knowledgeBaseJobId;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public CreateKnowledgeBaseJobResponseBody build() {
            return new CreateKnowledgeBaseJobResponseBody(this);
        } 

    } 

}
