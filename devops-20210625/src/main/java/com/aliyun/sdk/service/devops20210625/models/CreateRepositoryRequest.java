// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.devops20210625.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateRepositoryRequest} extends {@link RequestModel}
 *
 * <p>CreateRepositoryRequest</p>
 */
public class CreateRepositoryRequest extends Request {
    @Query
    @NameInMap("accessToken")
    private String accessToken;

    @Body
    @NameInMap("avatarUrl")
    private String avatarUrl;

    @Body
    @NameInMap("description")
    private String description;

    @Body
    @NameInMap("gitignoreType")
    private String gitignoreType;

    @Body
    @NameInMap("importAccount")
    private String importAccount;

    @Body
    @NameInMap("importDemoProject")
    private Boolean importDemoProject;

    @Body
    @NameInMap("importRepoType")
    private String importRepoType;

    @Body
    @NameInMap("importToken")
    private String importToken;

    @Body
    @NameInMap("importTokenEncrypted")
    private String importTokenEncrypted;

    @Body
    @NameInMap("importUrl")
    private String importUrl;

    @Body
    @NameInMap("initStandardService")
    private Boolean initStandardService;

    @Body
    @NameInMap("isCryptoEnabled")
    private Boolean isCryptoEnabled;

    @Body
    @NameInMap("localImportUrl")
    private String localImportUrl;

    @Body
    @NameInMap("name")
    @Validation(required = true)
    private String name;

    @Body
    @NameInMap("namespaceId")
    private Long namespaceId;

    @Body
    @NameInMap("path")
    private String path;

    @Body
    @NameInMap("readmeType")
    private String readmeType;

    @Body
    @NameInMap("visibilityLevel")
    private Integer visibilityLevel;

    @Query
    @NameInMap("createParentPath")
    private Boolean createParentPath;

    @Query
    @NameInMap("organizationId")
    @Validation(required = true)
    private String organizationId;

    @Query
    @NameInMap("sync")
    private Boolean sync;

    private CreateRepositoryRequest(Builder builder) {
        super(builder);
        this.accessToken = builder.accessToken;
        this.avatarUrl = builder.avatarUrl;
        this.description = builder.description;
        this.gitignoreType = builder.gitignoreType;
        this.importAccount = builder.importAccount;
        this.importDemoProject = builder.importDemoProject;
        this.importRepoType = builder.importRepoType;
        this.importToken = builder.importToken;
        this.importTokenEncrypted = builder.importTokenEncrypted;
        this.importUrl = builder.importUrl;
        this.initStandardService = builder.initStandardService;
        this.isCryptoEnabled = builder.isCryptoEnabled;
        this.localImportUrl = builder.localImportUrl;
        this.name = builder.name;
        this.namespaceId = builder.namespaceId;
        this.path = builder.path;
        this.readmeType = builder.readmeType;
        this.visibilityLevel = builder.visibilityLevel;
        this.createParentPath = builder.createParentPath;
        this.organizationId = builder.organizationId;
        this.sync = builder.sync;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateRepositoryRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return accessToken
     */
    public String getAccessToken() {
        return this.accessToken;
    }

    /**
     * @return avatarUrl
     */
    public String getAvatarUrl() {
        return this.avatarUrl;
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return gitignoreType
     */
    public String getGitignoreType() {
        return this.gitignoreType;
    }

    /**
     * @return importAccount
     */
    public String getImportAccount() {
        return this.importAccount;
    }

    /**
     * @return importDemoProject
     */
    public Boolean getImportDemoProject() {
        return this.importDemoProject;
    }

    /**
     * @return importRepoType
     */
    public String getImportRepoType() {
        return this.importRepoType;
    }

    /**
     * @return importToken
     */
    public String getImportToken() {
        return this.importToken;
    }

    /**
     * @return importTokenEncrypted
     */
    public String getImportTokenEncrypted() {
        return this.importTokenEncrypted;
    }

    /**
     * @return importUrl
     */
    public String getImportUrl() {
        return this.importUrl;
    }

    /**
     * @return initStandardService
     */
    public Boolean getInitStandardService() {
        return this.initStandardService;
    }

    /**
     * @return isCryptoEnabled
     */
    public Boolean getIsCryptoEnabled() {
        return this.isCryptoEnabled;
    }

    /**
     * @return localImportUrl
     */
    public String getLocalImportUrl() {
        return this.localImportUrl;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return namespaceId
     */
    public Long getNamespaceId() {
        return this.namespaceId;
    }

    /**
     * @return path
     */
    public String getPath() {
        return this.path;
    }

    /**
     * @return readmeType
     */
    public String getReadmeType() {
        return this.readmeType;
    }

    /**
     * @return visibilityLevel
     */
    public Integer getVisibilityLevel() {
        return this.visibilityLevel;
    }

    /**
     * @return createParentPath
     */
    public Boolean getCreateParentPath() {
        return this.createParentPath;
    }

    /**
     * @return organizationId
     */
    public String getOrganizationId() {
        return this.organizationId;
    }

    /**
     * @return sync
     */
    public Boolean getSync() {
        return this.sync;
    }

    public static final class Builder extends Request.Builder<CreateRepositoryRequest, Builder> {
        private String accessToken; 
        private String avatarUrl; 
        private String description; 
        private String gitignoreType; 
        private String importAccount; 
        private Boolean importDemoProject; 
        private String importRepoType; 
        private String importToken; 
        private String importTokenEncrypted; 
        private String importUrl; 
        private Boolean initStandardService; 
        private Boolean isCryptoEnabled; 
        private String localImportUrl; 
        private String name; 
        private Long namespaceId; 
        private String path; 
        private String readmeType; 
        private Integer visibilityLevel; 
        private Boolean createParentPath; 
        private String organizationId; 
        private Boolean sync; 

        private Builder() {
            super();
        } 

        private Builder(CreateRepositoryRequest request) {
            super(request);
            this.accessToken = request.accessToken;
            this.avatarUrl = request.avatarUrl;
            this.description = request.description;
            this.gitignoreType = request.gitignoreType;
            this.importAccount = request.importAccount;
            this.importDemoProject = request.importDemoProject;
            this.importRepoType = request.importRepoType;
            this.importToken = request.importToken;
            this.importTokenEncrypted = request.importTokenEncrypted;
            this.importUrl = request.importUrl;
            this.initStandardService = request.initStandardService;
            this.isCryptoEnabled = request.isCryptoEnabled;
            this.localImportUrl = request.localImportUrl;
            this.name = request.name;
            this.namespaceId = request.namespaceId;
            this.path = request.path;
            this.readmeType = request.readmeType;
            this.visibilityLevel = request.visibilityLevel;
            this.createParentPath = request.createParentPath;
            this.organizationId = request.organizationId;
            this.sync = request.sync;
        } 

        /**
         * accessToken.
         */
        public Builder accessToken(String accessToken) {
            this.putQueryParameter("accessToken", accessToken);
            this.accessToken = accessToken;
            return this;
        }

        /**
         * 代码库头像地址
         */
        public Builder avatarUrl(String avatarUrl) {
            this.putBodyParameter("avatarUrl", avatarUrl);
            this.avatarUrl = avatarUrl;
            return this;
        }

        /**
         * 代码库描述
         */
        public Builder description(String description) {
            this.putBodyParameter("description", description);
            this.description = description;
            return this;
        }

        /**
         * gitignore模板类型
         */
        public Builder gitignoreType(String gitignoreType) {
            this.putBodyParameter("gitignoreType", gitignoreType);
            this.gitignoreType = gitignoreType;
            return this;
        }

        /**
         * 导入时使用的账号
         */
        public Builder importAccount(String importAccount) {
            this.putBodyParameter("importAccount", importAccount);
            this.importAccount = importAccount;
            return this;
        }

        /**
         * 使用使用demo库内容进行初始化
         */
        public Builder importDemoProject(Boolean importDemoProject) {
            this.putBodyParameter("importDemoProject", importDemoProject);
            this.importDemoProject = importDemoProject;
            return this;
        }

        /**
         * 导入代码库类型 (GIT: Git库, SVN: SVN库)
         */
        public Builder importRepoType(String importRepoType) {
            this.putBodyParameter("importRepoType", importRepoType);
            this.importRepoType = importRepoType;
            return this;
        }

        /**
         * 导入时账号的token
         */
        public Builder importToken(String importToken) {
            this.putBodyParameter("importToken", importToken);
            this.importToken = importToken;
            return this;
        }

        /**
         * import_token字段的传输格式，使用明文或rsa加密
         */
        public Builder importTokenEncrypted(String importTokenEncrypted) {
            this.putBodyParameter("importTokenEncrypted", importTokenEncrypted);
            this.importTokenEncrypted = importTokenEncrypted;
            return this;
        }

        /**
         * 导入地址（http协议地址）
         */
        public Builder importUrl(String importUrl) {
            this.putBodyParameter("importUrl", importUrl);
            this.importUrl = importUrl;
            return this;
        }

        /**
         * 初始化标准智能化服务
         */
        public Builder initStandardService(Boolean initStandardService) {
            this.putBodyParameter("initStandardService", initStandardService);
            this.initStandardService = initStandardService;
            return this;
        }

        /**
         * 是否启用加密
         */
        public Builder isCryptoEnabled(Boolean isCryptoEnabled) {
            this.putBodyParameter("isCryptoEnabled", isCryptoEnabled);
            this.isCryptoEnabled = isCryptoEnabled;
            return this;
        }

        /**
         * 本地导入代码库的远程地址
         */
        public Builder localImportUrl(String localImportUrl) {
            this.putBodyParameter("localImportUrl", localImportUrl);
            this.localImportUrl = localImportUrl;
            return this;
        }

        /**
         * 代码库名称
         */
        public Builder name(String name) {
            this.putBodyParameter("name", name);
            this.name = name;
            return this;
        }

        /**
         * 代码库父路径id
         */
        public Builder namespaceId(Long namespaceId) {
            this.putBodyParameter("namespaceId", namespaceId);
            this.namespaceId = namespaceId;
            return this;
        }

        /**
         * 代码库路径
         */
        public Builder path(String path) {
            this.putBodyParameter("path", path);
            this.path = path;
            return this;
        }

        /**
         * 自动创建readme类型 (EMPTY: 仅创建README.md, USER_GUIDE: 包含新手引导)
         */
        public Builder readmeType(String readmeType) {
            this.putBodyParameter("readmeType", readmeType);
            this.readmeType = readmeType;
            return this;
        }

        /**
         * visibilityLevel.
         */
        public Builder visibilityLevel(Integer visibilityLevel) {
            this.putBodyParameter("visibilityLevel", visibilityLevel);
            this.visibilityLevel = visibilityLevel;
            return this;
        }

        /**
         * createParentPath.
         */
        public Builder createParentPath(Boolean createParentPath) {
            this.putQueryParameter("createParentPath", createParentPath);
            this.createParentPath = createParentPath;
            return this;
        }

        /**
         * organizationId.
         */
        public Builder organizationId(String organizationId) {
            this.putQueryParameter("organizationId", organizationId);
            this.organizationId = organizationId;
            return this;
        }

        /**
         * sync.
         */
        public Builder sync(Boolean sync) {
            this.putQueryParameter("sync", sync);
            this.sync = sync;
            return this;
        }

        @Override
        public CreateRepositoryRequest build() {
            return new CreateRepositoryRequest(this);
        } 

    } 

}
