// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.pai_dlc20201203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateCodeSourceRequest} extends {@link RequestModel}
 *
 * <p>CreateCodeSourceRequest</p>
 */
public class CreateCodeSourceRequest extends Request {
    @Body
    @NameInMap("CodeBranch")
    private String codeBranch;

    @Body
    @NameInMap("CodeRepo")
    private String codeRepo;

    @Body
    @NameInMap("CodeRepoAccessToken")
    private String codeRepoAccessToken;

    @Body
    @NameInMap("CodeRepoUserName")
    private String codeRepoUserName;

    @Body
    @NameInMap("Description")
    private String description;

    @Body
    @NameInMap("DisplayName")
    @Validation(required = true)
    private String displayName;

    @Body
    @NameInMap("MountPath")
    private String mountPath;

    private CreateCodeSourceRequest(Builder builder) {
        super(builder);
        this.codeBranch = builder.codeBranch;
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

    public static CreateCodeSourceRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return codeBranch
     */
    public String getCodeBranch() {
        return this.codeBranch;
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

    public static final class Builder extends Request.Builder<CreateCodeSourceRequest, Builder> {
        private String codeBranch; 
        private String codeRepo; 
        private String codeRepoAccessToken; 
        private String codeRepoUserName; 
        private String description; 
        private String displayName; 
        private String mountPath; 

        private Builder() {
            super();
        } 

        private Builder(CreateCodeSourceRequest request) {
            super(request);
            this.codeBranch = request.codeBranch;
            this.codeRepo = request.codeRepo;
            this.codeRepoAccessToken = request.codeRepoAccessToken;
            this.codeRepoUserName = request.codeRepoUserName;
            this.description = request.description;
            this.displayName = request.displayName;
            this.mountPath = request.mountPath;
        } 

        /**
         * 代码分支
         */
        public Builder codeBranch(String codeBranch) {
            this.putBodyParameter("CodeBranch", codeBranch);
            this.codeBranch = codeBranch;
            return this;
        }

        /**
         * 代码仓库地址
         */
        public Builder codeRepo(String codeRepo) {
            this.putBodyParameter("CodeRepo", codeRepo);
            this.codeRepo = codeRepo;
            return this;
        }

        /**
         * 密码
         */
        public Builder codeRepoAccessToken(String codeRepoAccessToken) {
            this.putBodyParameter("CodeRepoAccessToken", codeRepoAccessToken);
            this.codeRepoAccessToken = codeRepoAccessToken;
            return this;
        }

        /**
         * 用户名
         */
        public Builder codeRepoUserName(String codeRepoUserName) {
            this.putBodyParameter("CodeRepoUserName", codeRepoUserName);
            this.codeRepoUserName = codeRepoUserName;
            return this;
        }

        /**
         * 代码源详细描述
         */
        public Builder description(String description) {
            this.putBodyParameter("Description", description);
            this.description = description;
            return this;
        }

        /**
         * 代码源配置名称
         */
        public Builder displayName(String displayName) {
            this.putBodyParameter("DisplayName", displayName);
            this.displayName = displayName;
            return this;
        }

        /**
         * 代码本地挂载目录，默认挂载到/root/code/下
         */
        public Builder mountPath(String mountPath) {
            this.putBodyParameter("MountPath", mountPath);
            this.mountPath = mountPath;
            return this;
        }

        @Override
        public CreateCodeSourceRequest build() {
            return new CreateCodeSourceRequest(this);
        } 

    } 

}
