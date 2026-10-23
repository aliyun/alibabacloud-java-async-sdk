// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.winnexo20260512.models;

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
 * {@link GetWorkItemArtifactAccessRequest} extends {@link RequestModel}
 *
 * <p>GetWorkItemArtifactAccessRequest</p>
 */
public class GetWorkItemArtifactAccessRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("artifactId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String artifactId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("collaborationGroupId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String collaborationGroupId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("tenantId")
    private String tenantId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("workItemId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String workItemId;

    private GetWorkItemArtifactAccessRequest(Builder builder) {
        super(builder);
        this.artifactId = builder.artifactId;
        this.collaborationGroupId = builder.collaborationGroupId;
        this.tenantId = builder.tenantId;
        this.workItemId = builder.workItemId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetWorkItemArtifactAccessRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return artifactId
     */
    public String getArtifactId() {
        return this.artifactId;
    }

    /**
     * @return collaborationGroupId
     */
    public String getCollaborationGroupId() {
        return this.collaborationGroupId;
    }

    /**
     * @return tenantId
     */
    public String getTenantId() {
        return this.tenantId;
    }

    /**
     * @return workItemId
     */
    public String getWorkItemId() {
        return this.workItemId;
    }

    public static final class Builder extends Request.Builder<GetWorkItemArtifactAccessRequest, Builder> {
        private String artifactId; 
        private String collaborationGroupId; 
        private String tenantId; 
        private String workItemId; 

        private Builder() {
            super();
        } 

        private Builder(GetWorkItemArtifactAccessRequest request) {
            super(request);
            this.artifactId = request.artifactId;
            this.collaborationGroupId = request.collaborationGroupId;
            this.tenantId = request.tenantId;
            this.workItemId = request.workItemId;
        } 

        /**
         * <p>The ID of the artifact.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>example</p>
         */
        public Builder artifactId(String artifactId) {
            this.putQueryParameter("artifactId", artifactId);
            this.artifactId = artifactId;
            return this;
        }

        /**
         * <p>The ID of the collaboration workspace.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>group_example</p>
         */
        public Builder collaborationGroupId(String collaborationGroupId) {
            this.putQueryParameter("collaborationGroupId", collaborationGroupId);
            this.collaborationGroupId = collaborationGroupId;
            return this;
        }

        /**
         * <p>The tenant ID. This is a common parameter. If this parameter is not specified, the default tenant of the caller is used.</p>
         * 
         * <strong>example:</strong>
         * <p>10000</p>
         */
        public Builder tenantId(String tenantId) {
            this.putQueryParameter("tenantId", tenantId);
            this.tenantId = tenantId;
            return this;
        }

        /**
         * <p>The ID of the work item.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>wi_example</p>
         */
        public Builder workItemId(String workItemId) {
            this.putQueryParameter("workItemId", workItemId);
            this.workItemId = workItemId;
            return this;
        }

        @Override
        public GetWorkItemArtifactAccessRequest build() {
            return new GetWorkItemArtifactAccessRequest(this);
        } 

    } 

}
