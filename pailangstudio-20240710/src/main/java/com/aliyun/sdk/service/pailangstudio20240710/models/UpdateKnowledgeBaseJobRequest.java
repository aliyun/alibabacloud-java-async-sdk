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
 * {@link UpdateKnowledgeBaseJobRequest} extends {@link RequestModel}
 *
 * <p>UpdateKnowledgeBaseJobRequest</p>
 */
public class UpdateKnowledgeBaseJobRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("KnowledgeBaseId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String knowledgeBaseId;

    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("KnowledgeBaseJobId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String knowledgeBaseJobId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Description")
    private String description;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("WorkspaceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String workspaceId;

    private UpdateKnowledgeBaseJobRequest(Builder builder) {
        super(builder);
        this.knowledgeBaseId = builder.knowledgeBaseId;
        this.knowledgeBaseJobId = builder.knowledgeBaseJobId;
        this.description = builder.description;
        this.workspaceId = builder.workspaceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateKnowledgeBaseJobRequest create() {
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
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return workspaceId
     */
    public String getWorkspaceId() {
        return this.workspaceId;
    }

    public static final class Builder extends Request.Builder<UpdateKnowledgeBaseJobRequest, Builder> {
        private String knowledgeBaseId; 
        private String knowledgeBaseJobId; 
        private String description; 
        private String workspaceId; 

        private Builder() {
            super();
        } 

        private Builder(UpdateKnowledgeBaseJobRequest request) {
            super(request);
            this.knowledgeBaseId = request.knowledgeBaseId;
            this.knowledgeBaseJobId = request.knowledgeBaseJobId;
            this.description = request.description;
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
         * Description.
         */
        public Builder description(String description) {
            this.putBodyParameter("Description", description);
            this.description = description;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>285***</p>
         */
        public Builder workspaceId(String workspaceId) {
            this.putBodyParameter("WorkspaceId", workspaceId);
            this.workspaceId = workspaceId;
            return this;
        }

        @Override
        public UpdateKnowledgeBaseJobRequest build() {
            return new UpdateKnowledgeBaseJobRequest(this);
        } 

    } 

}
