// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aliding20230426.models;

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
 * {@link RetrieveRunRequest} extends {@link RequestModel}
 *
 * <p>RetrieveRunRequest</p>
 */
public class RetrieveRunRequest extends Request {
    @com.aliyun.core.annotation.Header
    @com.aliyun.core.annotation.NameInMap("accountId")
    private String accountId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("assistantId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String assistantId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("originalAssistantId")
    private String originalAssistantId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("runId")
    private String runId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("threadId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String threadId;

    private RetrieveRunRequest(Builder builder) {
        super(builder);
        this.accountId = builder.accountId;
        this.assistantId = builder.assistantId;
        this.originalAssistantId = builder.originalAssistantId;
        this.runId = builder.runId;
        this.threadId = builder.threadId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static RetrieveRunRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return accountId
     */
    public String getAccountId() {
        return this.accountId;
    }

    /**
     * @return assistantId
     */
    public String getAssistantId() {
        return this.assistantId;
    }

    /**
     * @return originalAssistantId
     */
    public String getOriginalAssistantId() {
        return this.originalAssistantId;
    }

    /**
     * @return runId
     */
    public String getRunId() {
        return this.runId;
    }

    /**
     * @return threadId
     */
    public String getThreadId() {
        return this.threadId;
    }

    public static final class Builder extends Request.Builder<RetrieveRunRequest, Builder> {
        private String accountId; 
        private String assistantId; 
        private String originalAssistantId; 
        private String runId; 
        private String threadId; 

        private Builder() {
            super();
        } 

        private Builder(RetrieveRunRequest request) {
            super(request);
            this.accountId = request.accountId;
            this.assistantId = request.assistantId;
            this.originalAssistantId = request.originalAssistantId;
            this.runId = request.runId;
            this.threadId = request.threadId;
        } 

        /**
         * accountId.
         */
        public Builder accountId(String accountId) {
            this.putHeaderParameter("accountId", accountId);
            this.accountId = accountId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>assistantId1</p>
         */
        public Builder assistantId(String assistantId) {
            this.putBodyParameter("assistantId", assistantId);
            this.assistantId = assistantId;
            return this;
        }

        /**
         * originalAssistantId.
         */
        public Builder originalAssistantId(String originalAssistantId) {
            this.putBodyParameter("originalAssistantId", originalAssistantId);
            this.originalAssistantId = originalAssistantId;
            return this;
        }

        /**
         * runId.
         */
        public Builder runId(String runId) {
            this.putBodyParameter("runId", runId);
            this.runId = runId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>threadId123</p>
         */
        public Builder threadId(String threadId) {
            this.putBodyParameter("threadId", threadId);
            this.threadId = threadId;
            return this;
        }

        @Override
        public RetrieveRunRequest build() {
            return new RetrieveRunRequest(this);
        } 

    } 

}
