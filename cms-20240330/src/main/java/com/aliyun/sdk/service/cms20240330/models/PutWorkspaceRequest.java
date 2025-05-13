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
    @com.aliyun.core.annotation.NameInMap("slsProject")
    @com.aliyun.core.annotation.Validation(required = true, maxLength = 128, minLength = 1)
    private String slsProject;

    private PutWorkspaceRequest(Builder builder) {
        super(builder);
        this.workspaceName = builder.workspaceName;
        this.description = builder.description;
        this.displayName = builder.displayName;
        this.slsProject = builder.slsProject;
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
     * @return slsProject
     */
    public String getSlsProject() {
        return this.slsProject;
    }

    public static final class Builder extends Request.Builder<PutWorkspaceRequest, Builder> {
        private String workspaceName; 
        private String description; 
        private String displayName; 
        private String slsProject; 

        private Builder() {
            super();
        } 

        private Builder(PutWorkspaceRequest request) {
            super(request);
            this.workspaceName = request.workspaceName;
            this.description = request.description;
            this.displayName = request.displayName;
            this.slsProject = request.slsProject;
        } 

        /**
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
         * <p>工作空间描述</p>
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
         * displayName.
         */
        public Builder displayName(String displayName) {
            this.putBodyParameter("displayName", displayName);
            this.displayName = displayName;
            return this;
        }

        /**
         * <p>工作空间绑定的日志服务项目名称</p>
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

        @Override
        public PutWorkspaceRequest build() {
            return new PutWorkspaceRequest(this);
        } 

    } 

}
