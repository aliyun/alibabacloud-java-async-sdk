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

    @NameInMap("requestId")
    private String requestId;

    @NameInMap("result")
    private Result result;

    @NameInMap("success")
    private Boolean success;

    private CreateRepositoryResponseBody(Builder builder) {
        this.errorCode = builder.errorCode;
        this.errorMessage = builder.errorMessage;
        this.requestId = builder.requestId;
        this.result = builder.result;
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
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return result
     */
    public Result getResult() {
        return this.result;
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
        private String requestId; 
        private Result result; 
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
         * 请求ID
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * result.
         */
        public Builder result(Result result) {
            this.result = result;
            return this;
        }

        /**
         * 调用是否成功
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

        @NameInMap("public")
        private Boolean _public;

        @NameInMap("updatedAt")
        private String updatedAt;

        @NameInMap("visibilityLevel")
        private String visibilityLevel;

        private Namespace(Builder builder) {
            this.avatar = builder.avatar;
            this.createdAt = builder.createdAt;
            this.description = builder.description;
            this.id = builder.id;
            this.name = builder.name;
            this.ownerId = builder.ownerId;
            this.path = builder.path;
            this._public = builder._public;
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
         * @return _public
         */
        public Boolean get_public() {
            return this._public;
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
        public String getVisibilityLevel() {
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
            private Boolean _public; 
            private String updatedAt; 
            private String visibilityLevel; 

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
             * 归属者id
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
             * 公开性
             */
            public Builder _public(Boolean _public) {
                this._public = _public;
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
            public Builder visibilityLevel(String visibilityLevel) {
                this.visibilityLevel = visibilityLevel;
                return this;
            }

            public Namespace build() {
                return new Namespace(this);
            } 

        } 

    }
    public static class Result extends TeaModel {
        @NameInMap("Import_from_svn")
        private Boolean importFromSvn;

        @NameInMap("archived")
        private Boolean archived;

        @NameInMap("avatar_url")
        private String avatarUrl;

        @NameInMap("createdAt")
        private String createdAt;

        @NameInMap("creatorId")
        private Long creatorId;

        @NameInMap("defaultBranch")
        private String defaultBranch;

        @NameInMap("demoProject")
        private Boolean demoProject;

        @NameInMap("description")
        private String description;

        @NameInMap("httpUrlToRepo")
        private String httpUrlToRepo;

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

        @NameInMap("sshUrlToRepo")
        private String sshUrlToRepo;

        @NameInMap("visibilityLevel")
        private String visibilityLevel;

        @NameInMap("webUrl")
        private String webUrl;

        private Result(Builder builder) {
            this.importFromSvn = builder.importFromSvn;
            this.archived = builder.archived;
            this.avatarUrl = builder.avatarUrl;
            this.createdAt = builder.createdAt;
            this.creatorId = builder.creatorId;
            this.defaultBranch = builder.defaultBranch;
            this.demoProject = builder.demoProject;
            this.description = builder.description;
            this.httpUrlToRepo = builder.httpUrlToRepo;
            this.id = builder.id;
            this.lastActivityAt = builder.lastActivityAt;
            this.name = builder.name;
            this.nameWithNamespace = builder.nameWithNamespace;
            this.namespace = builder.namespace;
            this.path = builder.path;
            this.pathWithNamespace = builder.pathWithNamespace;
            this.sshUrlToRepo = builder.sshUrlToRepo;
            this.visibilityLevel = builder.visibilityLevel;
            this.webUrl = builder.webUrl;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Result create() {
            return builder().build();
        }

        /**
         * @return importFromSvn
         */
        public Boolean getImportFromSvn() {
            return this.importFromSvn;
        }

        /**
         * @return archived
         */
        public Boolean getArchived() {
            return this.archived;
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
         * @return demoProject
         */
        public Boolean getDemoProject() {
            return this.demoProject;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return httpUrlToRepo
         */
        public String getHttpUrlToRepo() {
            return this.httpUrlToRepo;
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
         * @return sshUrlToRepo
         */
        public String getSshUrlToRepo() {
            return this.sshUrlToRepo;
        }

        /**
         * @return visibilityLevel
         */
        public String getVisibilityLevel() {
            return this.visibilityLevel;
        }

        /**
         * @return webUrl
         */
        public String getWebUrl() {
            return this.webUrl;
        }

        public static final class Builder {
            private Boolean importFromSvn; 
            private Boolean archived; 
            private String avatarUrl; 
            private String createdAt; 
            private Long creatorId; 
            private String defaultBranch; 
            private Boolean demoProject; 
            private String description; 
            private String httpUrlToRepo; 
            private Long id; 
            private String lastActivityAt; 
            private String name; 
            private String nameWithNamespace; 
            private Namespace namespace; 
            private String path; 
            private String pathWithNamespace; 
            private String sshUrlToRepo; 
            private String visibilityLevel; 
            private String webUrl; 

            /**
             * 从SVN导入
             */
            public Builder importFromSvn(Boolean importFromSvn) {
                this.importFromSvn = importFromSvn;
                return this;
            }

            /**
             * 归档标识
             */
            public Builder archived(Boolean archived) {
                this.archived = archived;
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
             * 创建者id
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
             * demo库标识
             */
            public Builder demoProject(Boolean demoProject) {
                this.demoProject = demoProject;
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
             * http地址
             */
            public Builder httpUrlToRepo(String httpUrlToRepo) {
                this.httpUrlToRepo = httpUrlToRepo;
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
             * 名称（含父路径）
             */
            public Builder nameWithNamespace(String nameWithNamespace) {
                this.nameWithNamespace = nameWithNamespace;
                return this;
            }

            /**
             * 父路径信息
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
             * ssh地址
             */
            public Builder sshUrlToRepo(String sshUrlToRepo) {
                this.sshUrlToRepo = sshUrlToRepo;
                return this;
            }

            /**
             * 可见性。0：私有，10：内部公开
             */
            public Builder visibilityLevel(String visibilityLevel) {
                this.visibilityLevel = visibilityLevel;
                return this;
            }

            /**
             * web url
             */
            public Builder webUrl(String webUrl) {
                this.webUrl = webUrl;
                return this;
            }

            public Result build() {
                return new Result(this);
            } 

        } 

    }
}
