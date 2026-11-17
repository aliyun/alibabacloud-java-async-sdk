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
 * {@link GetKnowledgeBaseBuildTaskInstanceRequest} extends {@link RequestModel}
 *
 * <p>GetKnowledgeBaseBuildTaskInstanceRequest</p>
 */
public class GetKnowledgeBaseBuildTaskInstanceRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("KnowledgeBaseId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String knowledgeBaseId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("TaskInstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String taskInstanceId;

    private GetKnowledgeBaseBuildTaskInstanceRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.knowledgeBaseId = builder.knowledgeBaseId;
        this.taskInstanceId = builder.taskInstanceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetKnowledgeBaseBuildTaskInstanceRequest create() {
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

    public static final class Builder extends Request.Builder<GetKnowledgeBaseBuildTaskInstanceRequest, Builder> {
        private String regionId; 
        private String knowledgeBaseId; 
        private String taskInstanceId; 

        private Builder() {
            super();
        } 

        private Builder(GetKnowledgeBaseBuildTaskInstanceRequest request) {
            super(request);
            this.regionId = request.regionId;
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
         * <p>The execution ID.</p>
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
        public GetKnowledgeBaseBuildTaskInstanceRequest build() {
            return new GetKnowledgeBaseBuildTaskInstanceRequest(this);
        } 

    } 

}
