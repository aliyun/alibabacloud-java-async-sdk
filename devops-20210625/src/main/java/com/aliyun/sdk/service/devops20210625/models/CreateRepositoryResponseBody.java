// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.devops20210625.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateRepositoryResponseBody} extends {@link TeaModel}
 *
 * <p>CreateRepositoryResponseBody</p>
 */
public class CreateRepositoryResponseBody extends TeaModel {
    @NameInMap("errorCode")
    private String errorCode;

    @NameInMap("errorMessage")
    private String errorMessage;

    @NameInMap("repository")
    private Repository repository;

    @NameInMap("requestId")
    private String requestId;

    @NameInMap("success")
    private Boolean success;

    private CreateRepositoryResponseBody(Builder builder) {
        this.errorCode = builder.errorCode;
        this.errorMessage = builder.errorMessage;
        this.repository = builder.repository;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateRepositoryResponseBody create() {
        return builder().build();
    }

    /**
     * @return errorCode
     */
    public String getErrorCode() {
        return this.errorCode;
    }

    /**
     * @return errorMessage
     */
    public String getErrorMessage() {
        return this.errorMessage;
    }

    /**
     * @return repository
     */
    public Repository getRepository() {
        return this.repository;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private String errorCode; 
        private String errorMessage; 
        private Repository repository; 
        private String requestId; 
        private Boolean success; 

        /**
         * 错误码
         */
        public Builder errorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }

        /**
         * 错误信息
         */
        public Builder errorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }

        /**
         * 代码库信息
         */
        public Builder repository(Repository repository) {
            this.repository = repository;
            return this;
        }

        /**
         * 请求ID
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * 请求是否成功
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public CreateRepositoryResponseBody build() {
            return new CreateRepositoryResponseBody(this);
        } 

    } 

    public static class Namespace extends TeaModel {
        @NameInMap("avatar")
        private String avatar;

        @NameInMap("createdAt")
        private String createdAt;

        @NameInMap("description")
        private String description;

        @NameInMap("id")
        private Long id;

        @NameInMap("name")
        private String name;

        @NameInMap("ownerId")
        private Long ownerId;

        @NameInMap("path")
        private String path;

        @NameInMap("updatedAt")
        private String updatedAt;

        @NameInMap("visibilityLevel")
        private Integer visibilityLevel;

        private Namespace(Builder builder) {
            this.avatar = builder.avatar;
            this.createdAt = builder.createdAt;
            this.description = builder.description;
            this.id = builder.id;
            this.name = builder.name;
            this.ownerId = builder.ownerId;
            this.path = builder.path;
            this.updatedAt = builder.updatedAt;
            this.visibilityLevel = builder.visibilityLevel;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Namespace create() {
            return builder().build();
        }

        /**
         * @return avatar
         */
        public String getAvatar() {
            return this.avatar;
        }

        /**
         * @return createdAt
         */
        public String getCreatedAt() {
            return this.createdAt;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return id
         */
        public Long getId() {
            return this.id;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return ownerId
         */
        public Long getOwnerId() {
            return this.ownerId;
        }

        /**
         * @return path
         */
        public String getPath() {
            return this.path;
        }

        /**
         * @return updatedAt
         */
        public String getUpdatedAt() {
            return this.updatedAt;
        }

        /**
         * @return visibilityLevel
         */
        public Integer getVisibilityLevel() {
            return this.visibilityLevel;
        }

        public static final class Builder {
            private String avatar; 
            private String createdAt; 
            private String description; 
            private Long id; 
            private String name; 
            private Long ownerId; 
            private String path; 
            private String updatedAt; 
            private Integer visibilityLevel; 

            /**
             * 头像地址
             */
            public Builder avatar(String avatar) {
                this.avatar = avatar;
                return this;
            }

            /**
             * 创建时间
             */
            public Builder createdAt(String createdAt) {
                this.createdAt = createdAt;
                return this;
            }

            /**
             * 描述
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * id
             */
            public Builder id(Long id) {
                this.id = id;
                return this;
            }

            /**
             * 名称
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * 归属者ID
             */
            public Builder ownerId(Long ownerId) {
                this.ownerId = ownerId;
                return this;
            }

            /**
             * 路径
             */
            public Builder path(String path) {
                this.path = path;
                return this;
            }

            /**
             * 更新时间
             */
            public Builder updatedAt(String updatedAt) {
                this.updatedAt = updatedAt;
                return this;
            }

            /**
             * 可见性。0：私有，10：内部公开
             */
            public Builder visibilityLevel(Integer visibilityLevel) {
                this.visibilityLevel = visibilityLevel;
                return this;
            }

            public Namespace build() {
                return new Namespace(this);
            } 

        } 

    }
    public static class Repository extends TeaModel {
        @NameInMap("archive")
        private Boolean archive;

        @NameInMap("avatarUrl")
        private String avatarUrl;

        @NameInMap("createdAt")
        private String createdAt;

        @NameInMap("creatorId")
        private Long creatorId;

        @NameInMap("defaultBranch")
        private String defaultBranch;

        @NameInMap("demoProjectStatus")
        private Boolean demoProjectStatus;

        @NameInMap("description")
        private String description;

        @NameInMap("httpUrlToRepository")
        private String httpUrlToRepository;

        @NameInMap("id")
        private Long id;

        @NameInMap("lastActivityAt")
        private String lastActivityAt;

        @NameInMap("name")
        private String name;

        @NameInMap("nameWithNamespace")
        private String nameWithNamespace;

        @NameInMap("namespace")
        private Namespace namespace;

        @NameInMap("path")
        private String path;

        @NameInMap("pathWithNamespace")
        private String pathWithNamespace;

        @NameInMap("sshUrlToRepository")
        private String sshUrlToRepository;

        @NameInMap("visibilityLevel")
        private Integer visibilityLevel;

        @NameInMap("webUrl")
        private String webUrl;

        private Repository(Builder builder) {
            this.archive = builder.archive;
            this.avatarUrl = builder.avatarUrl;
            this.createdAt = builder.createdAt;
            this.creatorId = builder.creatorId;
            this.defaultBranch = builder.defaultBranch;
            this.demoProjectStatus = builder.demoProjectStatus;
            this.description = builder.description;
            this.httpUrlToRepository = builder.httpUrlToRepository;
            this.id = builder.id;
            this.lastActivityAt = builder.lastActivityAt;
            this.name = builder.name;
            this.nameWithNamespace = builder.nameWithNamespace;
            this.namespace = builder.namespace;
            this.path = builder.path;
            this.pathWithNamespace = builder.pathWithNamespace;
            this.sshUrlToRepository = builder.sshUrlToRepository;
            this.visibilityLevel = builder.visibilityLevel;
            this.webUrl = builder.webUrl;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Repository create() {
            return builder().build();
        }

        /**
         * @return archive
         */
        public Boolean getArchive() {
            return this.archive;
        }

        /**
         * @return avatarUrl
         */
        public String getAvatarUrl() {
            return this.avatarUrl;
        }

        /**
         * @return createdAt
         */
        public String getCreatedAt() {
            return this.createdAt;
        }

        /**
         * @return creatorId
         */
        public Long getCreatorId() {
            return this.creatorId;
        }

        /**
         * @return defaultBranch
         */
        public String getDefaultBranch() {
            return this.defaultBranch;
        }

        /**
         * @return demoProjectStatus
         */
        public Boolean getDemoProjectStatus() {
            return this.demoProjectStatus;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return httpUrlToRepository
         */
        public String getHttpUrlToRepository() {
            return this.httpUrlToRepository;
        }

        /**
         * @return id
         */
        public Long getId() {
            return this.id;
        }

        /**
         * @return lastActivityAt
         */
        public String getLastActivityAt() {
            return this.lastActivityAt;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return nameWithNamespace
         */
        public String getNameWithNamespace() {
            return this.nameWithNamespace;
        }

        /**
         * @return namespace
         */
        public Namespace getNamespace() {
            return this.namespace;
        }

        /**
         * @return path
         */
        public String getPath() {
            return this.path;
        }

        /**
         * @return pathWithNamespace
         */
        public String getPathWithNamespace() {
            return this.pathWithNamespace;
        }

        /**
         * @return sshUrlToRepository
         */
        public String getSshUrlToRepository() {
            return this.sshUrlToRepository;
        }

        /**
         * @return visibilityLevel
         */
        public Integer getVisibilityLevel() {
            return this.visibilityLevel;
        }

        /**
         * @return webUrl
         */
        public String getWebUrl() {
            return this.webUrl;
        }

        public static final class Builder {
            private Boolean archive; 
            private String avatarUrl; 
            private String createdAt; 
            private Long creatorId; 
            private String defaultBranch; 
            private Boolean demoProjectStatus; 
            private String description; 
            private String httpUrlToRepository; 
            private Long id; 
            private String lastActivityAt; 
            private String name; 
            private String nameWithNamespace; 
            private Namespace namespace; 
            private String path; 
            private String pathWithNamespace; 
            private String sshUrlToRepository; 
            private Integer visibilityLevel; 
            private String webUrl; 

            /**
             * 归档标识
             */
            public Builder archive(Boolean archive) {
                this.archive = archive;
                return this;
            }

            /**
             * 代码库头像地址
             */
            public Builder avatarUrl(String avatarUrl) {
                this.avatarUrl = avatarUrl;
                return this;
            }

            /**
             * 创建时间
             */
            public Builder createdAt(String createdAt) {
                this.createdAt = createdAt;
                return this;
            }

            /**
             * 创建者ID
             */
            public Builder creatorId(Long creatorId) {
                this.creatorId = creatorId;
                return this;
            }

            /**
             * 默认分支
             */
            public Builder defaultBranch(String defaultBranch) {
                this.defaultBranch = defaultBranch;
                return this;
            }

            /**
             * DEMO库标识
             */
            public Builder demoProjectStatus(Boolean demoProjectStatus) {
                this.demoProjectStatus = demoProjectStatus;
                return this;
            }

            /**
             * 描述
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * HTTP克隆地址
             */
            public Builder httpUrlToRepository(String httpUrlToRepository) {
                this.httpUrlToRepository = httpUrlToRepository;
                return this;
            }

            /**
             * 代码库ID
             */
            public Builder id(Long id) {
                this.id = id;
                return this;
            }

            /**
             * 最后活跃时间
             */
            public Builder lastActivityAt(String lastActivityAt) {
                this.lastActivityAt = lastActivityAt;
                return this;
            }

            /**
             * 名称
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * 名称（含父名称）
             */
            public Builder nameWithNamespace(String nameWithNamespace) {
                this.nameWithNamespace = nameWithNamespace;
                return this;
            }

            /**
             * 父空间
             */
            public Builder namespace(Namespace namespace) {
                this.namespace = namespace;
                return this;
            }

            /**
             * 路径
             */
            public Builder path(String path) {
                this.path = path;
                return this;
            }

            /**
             * 路径（含父路径）
             */
            public Builder pathWithNamespace(String pathWithNamespace) {
                this.pathWithNamespace = pathWithNamespace;
                return this;
            }

            /**
             * SSH克隆地址
             */
            public Builder sshUrlToRepository(String sshUrlToRepository) {
                this.sshUrlToRepository = sshUrlToRepository;
                return this;
            }

            /**
             * 可见性。0：私有，10：内部公开
             */
            public Builder visibilityLevel(Integer visibilityLevel) {
                this.visibilityLevel = visibilityLevel;
                return this;
            }

            /**
             * 页面访问地址
             */
            public Builder webUrl(String webUrl) {
                this.webUrl = webUrl;
                return this;
            }

            public Repository build() {
                return new Repository(this);
            } 

        } 

    }
}
