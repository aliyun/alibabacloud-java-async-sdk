// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aiworkspace20210204.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link UpdateCodeSourceRequest} extends {@link RequestModel}
 *
 * <p>UpdateCodeSourceRequest</p>
 */
public class UpdateCodeSourceRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("CodeSourceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String codeSourceId;

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
    private String displayName;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("MountPath")
    private String mountPath;

    private UpdateCodeSourceRequest(Builder builder) {
        super(builder);
        this.codeSourceId = builder.codeSourceId;
        this.codeBranch = builder.codeBranch;
        this.codeCommit = builder.codeCommit;
        this.codeRepo = builder.codeRepo;
        this.codeRepoAccessToken = builder.codeRepoAccessToken;
        this.codeRepoUserName = builder.codeRepoUserName;
        this.description = builder.description;
        this.displayName = builder.displayName;
        this.mountPath = builder.mountPath;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateCodeSourceRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return codeSourceId
     */
    public String getCodeSourceId() {
        return this.codeSourceId;
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

    public static final class Builder extends Request.Builder<UpdateCodeSourceRequest, Builder> {
        private String codeSourceId; 
        private String codeBranch; 
        private String codeCommit; 
        private String codeRepo; 
        private String codeRepoAccessToken; 
        private String codeRepoUserName; 
        private String description; 
        private String displayName; 
        private String mountPath; 

        private Builder() {
            super();
        } 

        private Builder(UpdateCodeSourceRequest request) {
            super(request);
            this.codeSourceId = request.codeSourceId;
            this.codeBranch = request.codeBranch;
            this.codeCommit = request.codeCommit;
            this.codeRepo = request.codeRepo;
            this.codeRepoAccessToken = request.codeRepoAccessToken;
            this.codeRepoUserName = request.codeRepoUserName;
            this.description = request.description;
            this.displayName = request.displayName;
            this.mountPath = request.mountPath;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>code-202**********</p>
         */
        public Builder codeSourceId(String codeSourceId) {
            this.putPathParameter("CodeSourceId", codeSourceId);
            this.codeSourceId = codeSourceId;
            return this;
        }

        /**
         * CodeBranch.
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
         * CodeRepo.
         */
        public Builder codeRepo(String codeRepo) {
            this.putBodyParameter("CodeRepo", codeRepo);
            this.codeRepo = codeRepo;
            return this;
        }

        /**
         * CodeRepoAccessToken.
         */
        public Builder codeRepoAccessToken(String codeRepoAccessToken) {
            this.putBodyParameter("CodeRepoAccessToken", codeRepoAccessToken);
            this.codeRepoAccessToken = codeRepoAccessToken;
            return this;
        }

        /**
         * CodeRepoUserName.
         */
        public Builder codeRepoUserName(String codeRepoUserName) {
            this.putBodyParameter("CodeRepoUserName", codeRepoUserName);
            this.codeRepoUserName = codeRepoUserName;
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
         * DisplayName.
         */
        public Builder displayName(String displayName) {
            this.putBodyParameter("DisplayName", displayName);
            this.displayName = displayName;
            return this;
        }

        /**
         * MountPath.
         */
        public Builder mountPath(String mountPath) {
            this.putBodyParameter("MountPath", mountPath);
            this.mountPath = mountPath;
            return this;
        }

        @Override
        public UpdateCodeSourceRequest build() {
            return new UpdateCodeSourceRequest(this);
        } 

    } 

}
