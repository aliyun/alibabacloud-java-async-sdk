// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.devops20210625.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateRepositoryRequest} extends {@link RequestModel}
 *
 * <p>CreateRepositoryRequest</p>
 */
public class CreateRepositoryRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("accessToken")
    private String accessToken;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("avatarUrl")
    private String avatarUrl;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("description")
    private String description;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("gitignoreType")
    private String gitignoreType;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("importAccount")
    private String importAccount;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("importDemoProject")
    private Boolean importDemoProject;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("importRepoType")
    private String importRepoType;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("importToken")
    private String importToken;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("importTokenEncrypted")
    private String importTokenEncrypted;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("importUrl")
    private String importUrl;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("initStandardService")
    private Boolean initStandardService;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("isCryptoEnabled")
    private Boolean isCryptoEnabled;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("localImportUrl")
    private String localImportUrl;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("name")
    @com.aliyun.core.annotation.Validation(required = true)
    private String name;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("namespaceId")
    private Long namespaceId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("path")
    private String path;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("readmeType")
    private String readmeType;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("visibilityLevel")
    private Integer visibilityLevel;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("createParentPath")
    private Boolean createParentPath;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("organizationId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String organizationId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("sync")
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
         * avatarUrl.
         */
        public Builder avatarUrl(String avatarUrl) {
            this.putBodyParameter("avatarUrl", avatarUrl);
            this.avatarUrl = avatarUrl;
            return this;
        }

        /**
         * description.
         */
        public Builder description(String description) {
            this.putBodyParameter("description", description);
            this.description = description;
            return this;
        }

        /**
         * gitignoreType.
         */
        public Builder gitignoreType(String gitignoreType) {
            this.putBodyParameter("gitignoreType", gitignoreType);
            this.gitignoreType = gitignoreType;
            return this;
        }

        /**
         * importAccount.
         */
        public Builder importAccount(String importAccount) {
            this.putBodyParameter("importAccount", importAccount);
            this.importAccount = importAccount;
            return this;
        }

        /**
         * importDemoProject.
         */
        public Builder importDemoProject(Boolean importDemoProject) {
            this.putBodyParameter("importDemoProject", importDemoProject);
            this.importDemoProject = importDemoProject;
            return this;
        }

        /**
         * importRepoType.
         */
        public Builder importRepoType(String importRepoType) {
            this.putBodyParameter("importRepoType", importRepoType);
            this.importRepoType = importRepoType;
            return this;
        }

        /**
         * importToken.
         */
        public Builder importToken(String importToken) {
            this.putBodyParameter("importToken", importToken);
            this.importToken = importToken;
            return this;
        }

        /**
         * importTokenEncrypted.
         */
        public Builder importTokenEncrypted(String importTokenEncrypted) {
            this.putBodyParameter("importTokenEncrypted", importTokenEncrypted);
            this.importTokenEncrypted = importTokenEncrypted;
            return this;
        }

        /**
         * importUrl.
         */
        public Builder importUrl(String importUrl) {
            this.putBodyParameter("importUrl", importUrl);
            this.importUrl = importUrl;
            return this;
        }

        /**
         * initStandardService.
         */
        public Builder initStandardService(Boolean initStandardService) {
            this.putBodyParameter("initStandardService", initStandardService);
            this.initStandardService = initStandardService;
            return this;
        }

        /**
         * isCryptoEnabled.
         */
        public Builder isCryptoEnabled(Boolean isCryptoEnabled) {
            this.putBodyParameter("isCryptoEnabled", isCryptoEnabled);
            this.isCryptoEnabled = isCryptoEnabled;
            return this;
        }

        /**
         * localImportUrl.
         */
        public Builder localImportUrl(String localImportUrl) {
            this.putBodyParameter("localImportUrl", localImportUrl);
            this.localImportUrl = localImportUrl;
            return this;
        }

        /**
         * name.
         */
        public Builder name(String name) {
            this.putBodyParameter("name", name);
            this.name = name;
            return this;
        }

        /**
         * namespaceId.
         */
        public Builder namespaceId(Long namespaceId) {
            this.putBodyParameter("namespaceId", namespaceId);
            this.namespaceId = namespaceId;
            return this;
        }

        /**
         * path.
         */
        public Builder path(String path) {
            this.putBodyParameter("path", path);
            this.path = path;
            return this;
        }

        /**
         * readmeType.
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
