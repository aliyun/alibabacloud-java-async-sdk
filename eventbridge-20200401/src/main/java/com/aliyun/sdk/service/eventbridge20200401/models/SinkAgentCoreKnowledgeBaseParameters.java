// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eventbridge20200401.models;

import com.aliyun.sdk.gateway.eventbridge.*;
import darabonba.core.*;
import darabonba.core.async.*;
import darabonba.core.sync.*;
import darabonba.core.client.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.eventbridge.models.*;

/**
 * 
 * {@link SinkAgentCoreKnowledgeBaseParameters} extends {@link TeaModel}
 *
 * <p>SinkAgentCoreKnowledgeBaseParameters</p>
 */
public class SinkAgentCoreKnowledgeBaseParameters extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("KnowledgeBaseId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String knowledgeBaseId;

    @com.aliyun.core.annotation.NameInMap("RoleName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String roleName;

    @com.aliyun.core.annotation.NameInMap("WorkspaceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String workspaceId;

    private SinkAgentCoreKnowledgeBaseParameters(Builder builder) {
        this.knowledgeBaseId = builder.knowledgeBaseId;
        this.roleName = builder.roleName;
        this.workspaceId = builder.workspaceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SinkAgentCoreKnowledgeBaseParameters create() {
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
     * @return roleName
     */
    public String getRoleName() {
        return this.roleName;
    }

    /**
     * @return workspaceId
     */
    public String getWorkspaceId() {
        return this.workspaceId;
    }

    public static final class Builder {
        private String knowledgeBaseId; 
        private String roleName; 
        private String workspaceId; 

        private Builder() {
        } 

        private Builder(SinkAgentCoreKnowledgeBaseParameters model) {
            this.knowledgeBaseId = model.knowledgeBaseId;
            this.roleName = model.roleName;
            this.workspaceId = model.workspaceId;
        } 

        /**
         * <p>The AgentCore knowledge base ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>kb-123</p>
         */
        public Builder knowledgeBaseId(String knowledgeBaseId) {
            this.knowledgeBaseId = knowledgeBaseId;
            return this;
        }

        /**
         * <p>The AgentCore knowledge base role name.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>kbRole</p>
         */
        public Builder roleName(String roleName) {
            this.roleName = roleName;
            return this;
        }

        /**
         * <p>The AgentCore workspace ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>kws-123</p>
         */
        public Builder workspaceId(String workspaceId) {
            this.workspaceId = workspaceId;
            return this;
        }

        public SinkAgentCoreKnowledgeBaseParameters build() {
            return new SinkAgentCoreKnowledgeBaseParameters(this);
        } 

    } 

}
