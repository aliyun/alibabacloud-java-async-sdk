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
    @Path
    @NameInMap("organizationId")
    @Validation(required = true)
    private String organizationId;

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
    @NameInMap("importAccount")
    private String importAccount;

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
    @NameInMap("name")
    @Validation(required = true)
    private String name;

    @Body
    @NameInMap("namespaceId")
    @Validation(required = true)
    private Long namespaceId;

    @Body
    @NameInMap("path")
    @Validation(required = true)
    private String path;

    @Body
    @NameInMap("readmeType")
    private String readmeType;

    @Body
    @NameInMap("visibilityLevel")
    @Validation(required = true)
    private String visibilityLevel;

    @Query
    @NameInMap("createParentPath")
    private Boolean createParentPath;

    @Query
    @NameInMap("sync")
    private Boolean sync;

    private CreateRepositoryRequest(Builder builder) {
        super(builder);
        this.organizationId = builder.organizationId;
        this.accessToken = builder.accessToken;
        this.avatarUrl = builder.avatarUrl;
        this.description = builder.description;
        this.importAccount = builder.importAccount;
        this.importToken = builder.importToken;
        this.importTokenEncrypted = builder.importTokenEncrypted;
        this.importUrl = builder.importUrl;
        this.name = builder.name;
        this.namespaceId = builder.namespaceId;
        this.path = builder.path;
        this.readmeType = builder.readmeType;
        this.visibilityLevel = builder.visibilityLevel;
        this.createParentPath = builder.createParentPath;
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
     * @return organizationId
     */
    public String getOrganizationId() {
        return this.organizationId;
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
     * @return importAccount
     */
    public String getImportAccount() {
        return this.importAccount;
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
    public String getVisibilityLevel() {
        return this.visibilityLevel;
    }

    /**
     * @return createParentPath
     */
    public Boolean getCreateParentPath() {
        return this.createParentPath;
    }

    /**
     * @return sync
     */
    public Boolean getSync() {
        return this.sync;
    }

    public static final class Builder extends Request.Builder<CreateRepositoryRequest, Builder> {
        private String organizationId; 
        private String accessToken; 
        private String avatarUrl; 
        private String description; 
        private String importAccount; 
        private String importToken; 
        private String importTokenEncrypted; 
        private String importUrl; 
        private String name; 
        private Long namespaceId; 
        private String path; 
        private String readmeType; 
        private String visibilityLevel; 
        private Boolean createParentPath; 
        private Boolean sync; 

        private Builder() {
            super();
        } 

        private Builder(CreateRepositoryRequest response) {
            super(response);
            this.organizationId = response.organizationId;
            this.accessToken = response.accessToken;
            this.avatarUrl = response.avatarUrl;
            this.description = response.description;
            this.importAccount = response.importAccount;
            this.importToken = response.importToken;
            this.importTokenEncrypted = response.importTokenEncrypted;
            this.importUrl = response.importUrl;
            this.name = response.name;
            this.namespaceId = response.namespaceId;
            this.path = response.path;
            this.readmeType = response.readmeType;
            this.visibilityLevel = response.visibilityLevel;
            this.createParentPath = response.createParentPath;
            this.sync = response.sync;
        } 

        /**
         * 企业ID
         */
        public Builder organizationId(String organizationId) {
            this.putPathParameter("organizationId", organizationId);
            this.organizationId = organizationId;
            return this;
        }

        /**
         * 个人访问令牌
         */
        public Builder accessToken(String accessToken) {
            this.putQueryParameter("accessToken", accessToken);
            this.accessToken = accessToken;
            return this;
        }

        /**
         * 头像地址
         */
        public Builder avatarUrl(String avatarUrl) {
            this.putBodyParameter("avatarUrl", avatarUrl);
            this.avatarUrl = avatarUrl;
            return this;
        }

        /**
         * 描述
         */
        public Builder description(String description) {
            this.putBodyParameter("description", description);
            this.description = description;
            return this;
        }

        /**
         * 导入库使用的账号
         */
        public Builder importAccount(String importAccount) {
            this.putBodyParameter("importAccount", importAccount);
            this.importAccount = importAccount;
            return this;
        }

        /**
         * 导入库使用的Token
         */
        public Builder importToken(String importToken) {
            this.putBodyParameter("importToken", importToken);
            this.importToken = importToken;
            return this;
        }

        /**
         * importToken传输格式
         */
        public Builder importTokenEncrypted(String importTokenEncrypted) {
            this.putBodyParameter("importTokenEncrypted", importTokenEncrypted);
            this.importTokenEncrypted = importTokenEncrypted;
            return this;
        }

        /**
         * 库导入地址
         */
        public Builder importUrl(String importUrl) {
            this.putBodyParameter("importUrl", importUrl);
            this.importUrl = importUrl;
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
         * 父空间ID
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
         * 内置README.md类型
         */
        public Builder readmeType(String readmeType) {
            this.putBodyParameter("readmeType", readmeType);
            this.readmeType = readmeType;
            return this;
        }

        /**
         * 代码库可见性
         */
        public Builder visibilityLevel(String visibilityLevel) {
            this.putBodyParameter("visibilityLevel", visibilityLevel);
            this.visibilityLevel = visibilityLevel;
            return this;
        }

        /**
         * 自动创建父路径
         */
        public Builder createParentPath(Boolean createParentPath) {
            this.putQueryParameter("createParentPath", createParentPath);
            this.createParentPath = createParentPath;
            return this;
        }

        /**
         * 是否采用同步调用
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
