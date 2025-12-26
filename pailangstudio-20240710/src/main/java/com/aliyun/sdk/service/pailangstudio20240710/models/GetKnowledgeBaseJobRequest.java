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
 * {@link GetKnowledgeBaseJobRequest} extends {@link RequestModel}
 *
 * <p>GetKnowledgeBaseJobRequest</p>
 */
public class GetKnowledgeBaseJobRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("KnowledgeBaseId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String knowledgeBaseId;

    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("KnowledgeBaseJobId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String knowledgeBaseJobId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("WorkspaceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String workspaceId;

    private GetKnowledgeBaseJobRequest(Builder builder) {
        super(builder);
        this.knowledgeBaseId = builder.knowledgeBaseId;
        this.knowledgeBaseJobId = builder.knowledgeBaseJobId;
        this.workspaceId = builder.workspaceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetKnowledgeBaseJobRequest create() {
        return builder().build();
    }

@Override
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
     * @return knowledgeBaseJobId
     */
    public String getKnowledgeBaseJobId() {
        return this.knowledgeBaseJobId;
    }

    /**
     * @return workspaceId
     */
    public String getWorkspaceId() {
        return this.workspaceId;
    }

    public static final class Builder extends Request.Builder<GetKnowledgeBaseJobRequest, Builder> {
        private String knowledgeBaseId; 
        private String knowledgeBaseJobId; 
        private String workspaceId; 

        private Builder() {
            super();
        } 

        private Builder(GetKnowledgeBaseJobRequest request) {
            super(request);
            this.knowledgeBaseId = request.knowledgeBaseId;
            this.knowledgeBaseJobId = request.knowledgeBaseJobId;
            this.workspaceId = request.workspaceId;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>d-nacr******sxd2</p>
         */
        public Builder knowledgeBaseId(String knowledgeBaseId) {
            this.putPathParameter("KnowledgeBaseId", knowledgeBaseId);
            this.knowledgeBaseId = knowledgeBaseId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>kbjob-9m******54</p>
         */
        public Builder knowledgeBaseJobId(String knowledgeBaseJobId) {
            this.putPathParameter("KnowledgeBaseJobId", knowledgeBaseJobId);
            this.knowledgeBaseJobId = knowledgeBaseJobId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>478***</p>
         */
        public Builder workspaceId(String workspaceId) {
            this.putQueryParameter("WorkspaceId", workspaceId);
            this.workspaceId = workspaceId;
            return this;
        }

        @Override
        public GetKnowledgeBaseJobRequest build() {
            return new GetKnowledgeBaseJobRequest(this);
        } 

    } 

}
