// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aiworkspace20210204.models;

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
 * {@link CreateCodeSourceRequest} extends {@link RequestModel}
 *
 * <p>CreateCodeSourceRequest</p>
 */
public class CreateCodeSourceRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Accessibility")
    private String accessibility;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("CodeBranch")
    private String codeBranch;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("CodeCommit")
    private String codeCommit;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("CodeRepo")
    private String codeRepo;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("CodeRepoAccessToken")
    private String codeRepoAccessToken;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("CodeRepoUserName")
    private String codeRepoUserName;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Description")
    private String description;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("DisplayName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String displayName;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("MountPath")
    private String mountPath;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("WorkspaceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String workspaceId;

    private CreateCodeSourceRequest(Builder builder) {
        super(builder);
        this.accessibility = builder.accessibility;
        this.codeBranch = builder.codeBranch;
        this.codeCommit = builder.codeCommit;
        this.codeRepo = builder.codeRepo;
        this.codeRepoAccessToken = builder.codeRepoAccessToken;
        this.codeRepoUserName = builder.codeRepoUserName;
        this.description = builder.description;
        this.displayName = builder.displayName;
        this.mountPath = builder.mountPath;
        this.workspaceId = builder.workspaceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateCodeSourceRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return accessibility
     */
    public String getAccessibility() {
        return this.accessibility;
    }

    /**
     * @return codeBranch
     */
    public String getCodeBranch() {
        return this.codeBranch;
    }

    /**
     * @return codeCommit
     */
    public String getCodeCommit() {
        return this.codeCommit;
    }

    /**
     * @return codeRepo
     */
    public String getCodeRepo() {
        return this.codeRepo;
    }

    /**
     * @return codeRepoAccessToken
     */
    public String getCodeRepoAccessToken() {
        return this.codeRepoAccessToken;
    }

    /**
     * @return codeRepoUserName
     */
    public String getCodeRepoUserName() {
        return this.codeRepoUserName;
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
     * @return mountPath
     */
    public String getMountPath() {
        return this.mountPath;
    }

    /**
     * @return workspaceId
     */
    public String getWorkspaceId() {
        return this.workspaceId;
    }

    public static final class Builder extends Request.Builder<CreateCodeSourceRequest, Builder> {
        private String accessibility; 
        private String codeBranch; 
        private String codeCommit; 
        private String codeRepo; 
        private String codeRepoAccessToken; 
        private String codeRepoUserName; 
        private String description; 
        private String displayName; 
        private String mountPath; 
        private String workspaceId; 

        private Builder() {
            super();
        } 

        private Builder(CreateCodeSourceRequest request) {
            super(request);
            this.accessibility = request.accessibility;
            this.codeBranch = request.codeBranch;
            this.codeCommit = request.codeCommit;
            this.codeRepo = request.codeRepo;
            this.codeRepoAccessToken = request.codeRepoAccessToken;
            this.codeRepoUserName = request.codeRepoUserName;
            this.description = request.description;
            this.displayName = request.displayName;
            this.mountPath = request.mountPath;
            this.workspaceId = request.workspaceId;
        } 

        /**
         * <p>The visibility of the code build. Valid values:</p>
         * <ul>
         * <li>PUBLIC: The code build is visible to all members in the workspace.</li>
         * <li>PRIVATE: The code build is visible only to you and the administrator of the workspace.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>PRIVATE</p>
         */
        public Builder accessibility(String accessibility) {
            this.putBodyParameter("Accessibility", accessibility);
            this.accessibility = accessibility;
            return this;
        }

        /**
         * <p>The code branch.</p>
         * 
         * <strong>example:</strong>
         * <p>master</p>
         */
        public Builder codeBranch(String codeBranch) {
            this.putBodyParameter("CodeBranch", codeBranch);
            this.codeBranch = codeBranch;
            return this;
        }

        /**
         * CodeCommit.
         */
        public Builder codeCommit(String codeCommit) {
            this.putBodyParameter("CodeCommit", codeCommit);
            this.codeCommit = codeCommit;
            return this;
        }

        /**
         * <p>The URL of the code repository.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://code.aliyun.com/">https://code.aliyun.com/</a>******</p>
         */
        public Builder codeRepo(String codeRepo) {
            this.putBodyParameter("CodeRepo", codeRepo);
            this.codeRepo = codeRepo;
            return this;
        }

        /**
         * <p>The token used to access the code repository.</p>
         * 
         * <strong>example:</strong>
         * <hr>
         */
        public Builder codeRepoAccessToken(String codeRepoAccessToken) {
            this.putBodyParameter("CodeRepoAccessToken", codeRepoAccessToken);
            this.codeRepoAccessToken = codeRepoAccessToken;
            return this;
        }

        /**
         * <p>The username of the code repository.</p>
         * 
         * <strong>example:</strong>
         * <p>use***</p>
         */
        public Builder codeRepoUserName(String codeRepoUserName) {
            this.putBodyParameter("CodeRepoUserName", codeRepoUserName);
            this.codeRepoUserName = codeRepoUserName;
            return this;
        }

        /**
         * <p>The description of the code build, which helps you distinguish between code builds.</p>
         * 
         * <strong>example:</strong>
         * <p>code source of dlc examples</p>
         */
        public Builder description(String description) {
            this.putBodyParameter("Description", description);
            this.description = description;
            return this;
        }

        /**
         * <p>The name of the code build.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>MyCodeSource1</p>
         */
        public Builder displayName(String displayName) {
            this.putBodyParameter("DisplayName", displayName);
            this.displayName = displayName;
            return this;
        }

        /**
         * <p>The local mount path of the code. By default, the code is mounted to the /root/code/ path.</p>
         * 
         * <strong>example:</strong>
         * <p>/root/code/code-source-1</p>
         */
        public Builder mountPath(String mountPath) {
            this.putBodyParameter("MountPath", mountPath);
            this.mountPath = mountPath;
            return this;
        }

        /**
         * <p>The workspace ID. You can call <a href="https://help.aliyun.com/document_detail/449124.html">ListWorkspaces</a> to obtain the workspace ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1234</p>
         */
        public Builder workspaceId(String workspaceId) {
            this.putBodyParameter("WorkspaceId", workspaceId);
            this.workspaceId = workspaceId;
            return this;
        }

        @Override
        public CreateCodeSourceRequest build() {
            return new CreateCodeSourceRequest(this);
        } 

    } 

}
