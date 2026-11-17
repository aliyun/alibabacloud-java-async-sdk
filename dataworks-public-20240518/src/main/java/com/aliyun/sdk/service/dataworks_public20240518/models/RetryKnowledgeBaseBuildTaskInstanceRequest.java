// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataworks_public20240518.models;

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
 * {@link RetryKnowledgeBaseBuildTaskInstanceRequest} extends {@link RequestModel}
 *
 * <p>RetryKnowledgeBaseBuildTaskInstanceRequest</p>
 */
public class RetryKnowledgeBaseBuildTaskInstanceRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ClientToken")
    private String clientToken;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("KnowledgeBaseId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String knowledgeBaseId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("TaskInstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String taskInstanceId;

    private RetryKnowledgeBaseBuildTaskInstanceRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.clientToken = builder.clientToken;
        this.knowledgeBaseId = builder.knowledgeBaseId;
        this.taskInstanceId = builder.taskInstanceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static RetryKnowledgeBaseBuildTaskInstanceRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return clientToken
     */
    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * @return knowledgeBaseId
     */
    public String getKnowledgeBaseId() {
        return this.knowledgeBaseId;
    }

    /**
     * @return taskInstanceId
     */
    public String getTaskInstanceId() {
        return this.taskInstanceId;
    }

    public static final class Builder extends Request.Builder<RetryKnowledgeBaseBuildTaskInstanceRequest, Builder> {
        private String regionId; 
        private String clientToken; 
        private String knowledgeBaseId; 
        private String taskInstanceId; 

        private Builder() {
            super();
        } 

        private Builder(RetryKnowledgeBaseBuildTaskInstanceRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.clientToken = request.clientToken;
            this.knowledgeBaseId = request.knowledgeBaseId;
            this.taskInstanceId = request.taskInstanceId;
        } 

        /**
         * <p>This parameter is required.</p>
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>The idempotency key for the retry operation. Keep the original value when you resend the same request, and use a new token when you initiate another retry.</p>
         * 
         * <strong>example:</strong>
         * <p>retry-001</p>
         */
        public Builder clientToken(String clientToken) {
            this.putBodyParameter("ClientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * <p>The ID of the knowledge base.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>12345678-1234-4234-8234-123456789abc</p>
         */
        public Builder knowledgeBaseId(String knowledgeBaseId) {
            this.putBodyParameter("KnowledgeBaseId", knowledgeBaseId);
            this.knowledgeBaseId = knowledgeBaseId;
            return this;
        }

        /**
         * <p>The ID of the instance to be retried.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>20001</p>
         */
        public Builder taskInstanceId(String taskInstanceId) {
            this.putBodyParameter("TaskInstanceId", taskInstanceId);
            this.taskInstanceId = taskInstanceId;
            return this;
        }

        @Override
        public RetryKnowledgeBaseBuildTaskInstanceRequest build() {
            return new RetryKnowledgeBaseBuildTaskInstanceRequest(this);
        } 

    } 

}
