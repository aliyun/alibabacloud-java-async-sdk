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
 * {@link CreateKnowledgeBaseResponseBody} extends {@link TeaModel}
 *
 * <p>CreateKnowledgeBaseResponseBody</p>
 */
public class CreateKnowledgeBaseResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("KnowledgeBaseId")
    private String knowledgeBaseId;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("WorkspaceId")
    private String workspaceId;

    private CreateKnowledgeBaseResponseBody(Builder builder) {
        this.knowledgeBaseId = builder.knowledgeBaseId;
        this.requestId = builder.requestId;
        this.workspaceId = builder.workspaceId;
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

    /**
     * @return workspaceId
     */
    public String getWorkspaceId() {
        return this.workspaceId;
    }

    public static final class Builder {
        private String knowledgeBaseId; 
        private String requestId; 
        private String workspaceId; 

        private Builder() {
        } 

        private Builder(CreateKnowledgeBaseResponseBody model) {
            this.knowledgeBaseId = model.knowledgeBaseId;
            this.requestId = model.requestId;
            this.workspaceId = model.workspaceId;
        } 

        /**
         * KnowledgeBaseId.
         */
        public Builder knowledgeBaseId(String knowledgeBaseId) {
            this.knowledgeBaseId = knowledgeBaseId;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * WorkspaceId.
         */
        public Builder workspaceId(String workspaceId) {
            this.workspaceId = workspaceId;
            return this;
        }

        public CreateKnowledgeBaseResponseBody build() {
            return new CreateKnowledgeBaseResponseBody(this);
        } 

    } 

}
