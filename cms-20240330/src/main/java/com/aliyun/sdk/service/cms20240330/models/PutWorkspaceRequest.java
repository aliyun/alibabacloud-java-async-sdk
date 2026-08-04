// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cms20240330.models;

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
 * {@link PutWorkspaceRequest} extends {@link RequestModel}
 *
 * <p>PutWorkspaceRequest</p>
 */
public class PutWorkspaceRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("workspaceName")
    @com.aliyun.core.annotation.Validation(required = true, maxLength = 56, minLength = 1)
    private String workspaceName;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("description")
    @com.aliyun.core.annotation.Validation(maxLength = 256)
    private String description;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("displayName")
    @com.aliyun.core.annotation.Validation(maxLength = 256)
    private String displayName;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("resourceGroupId")
    private String resourceGroupId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("slsProject")
    @com.aliyun.core.annotation.Validation(required = true, maxLength = 128, minLength = 1)
    private String slsProject;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("tags")
    private java.util.List<Tags> tags;

    private PutWorkspaceRequest(Builder builder) {
        super(builder);
        this.workspaceName = builder.workspaceName;
        this.description = builder.description;
        this.displayName = builder.displayName;
        this.resourceGroupId = builder.resourceGroupId;
        this.slsProject = builder.slsProject;
        this.tags = builder.tags;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static PutWorkspaceRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return workspaceName
     */
    public String getWorkspaceName() {
        return this.workspaceName;
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return displayName
     */
    public String getDisplayName() {
        return this.displayName;
    }

    /**
     * @return resourceGroupId
     */
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    /**
     * @return slsProject
     */
    public String getSlsProject() {
        return this.slsProject;
    }

    /**
     * @return tags
     */
    public java.util.List<Tags> getTags() {
        return this.tags;
    }

    public static final class Builder extends Request.Builder<PutWorkspaceRequest, Builder> {
        private String workspaceName; 
        private String description; 
        private String displayName; 
        private String resourceGroupId; 
        private String slsProject; 
        private java.util.List<Tags> tags; 

        private Builder() {
            super();
        } 

        private Builder(PutWorkspaceRequest request) {
            super(request);
            this.workspaceName = request.workspaceName;
            this.description = request.description;
            this.displayName = request.displayName;
            this.resourceGroupId = request.resourceGroupId;
            this.slsProject = request.slsProject;
            this.tags = request.tags;
        } 

        /**
         * <p>Name of the workspace</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>workspace-test-001</p>
         */
        public Builder workspaceName(String workspaceName) {
            this.putPathParameter("workspaceName", workspaceName);
            this.workspaceName = workspaceName;
            return this;
        }

        /**
         * <p>Description of the workspace</p>
         * 
         * <strong>example:</strong>
         * <p>workspace test</p>
         */
        public Builder description(String description) {
            this.putBodyParameter("description", description);
            this.description = description;
            return this;
        }

        /**
         * <p>Display name of the workspace</p>
         * 
         * <strong>example:</strong>
         * <p>workspace-test</p>
         */
        public Builder displayName(String displayName) {
            this.putBodyParameter("displayName", displayName);
            this.displayName = displayName;
            return this;
        }

        /**
         * <p>创建工作空间时指定的资源组 ID</p>
         * 
         * <strong>example:</strong>
         * <p>rg-ae******ey</p>
         */
        public Builder resourceGroupId(String resourceGroupId) {
            this.putBodyParameter("resourceGroupId", resourceGroupId);
            this.resourceGroupId = resourceGroupId;
            return this;
        }

        /**
         * <p>Name of the Log Service project</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>sls-project-test-001</p>
         */
        public Builder slsProject(String slsProject) {
            this.putBodyParameter("slsProject", slsProject);
            this.slsProject = slsProject;
            return this;
        }

        /**
         * <p>创建工作空间时绑定的标签</p>
         */
        public Builder tags(java.util.List<Tags> tags) {
            this.putBodyParameter("tags", tags);
            this.tags = tags;
            return this;
        }

        @Override
        public PutWorkspaceRequest build() {
            return new PutWorkspaceRequest(this);
        } 

    } 

    /**
     * 
     * {@link PutWorkspaceRequest} extends {@link TeaModel}
     *
     * <p>PutWorkspaceRequest</p>
     */
    public static class Tags extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("key")
        private String key;

        @com.aliyun.core.annotation.NameInMap("value")
        private String value;

        private Tags(Builder builder) {
            this.key = builder.key;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Tags create() {
            return builder().build();
        }

        /**
         * @return key
         */
        public String getKey() {
            return this.key;
        }

        /**
         * @return value
         */
        public String getValue() {
            return this.value;
        }

        public static final class Builder {
            private String key; 
            private String value; 

            private Builder() {
            } 

            private Builder(Tags model) {
                this.key = model.key;
                this.value = model.value;
            } 

            /**
             * key.
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * value.
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public Tags build() {
                return new Tags(this);
            } 

        } 

    }
}
