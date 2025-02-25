// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.devops20210625.models;

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
 * {@link CreateRepositoryResponseBody} extends {@link TeaModel}
 *
 * <p>CreateRepositoryResponseBody</p>
 */
public class CreateRepositoryResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("errorCode")
    private String errorCode;

    @com.aliyun.core.annotation.NameInMap("errorMessage")
    private String errorMessage;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("result")
    private Result result;

    @com.aliyun.core.annotation.NameInMap("success")
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
         * errorCode.
         */
        public Builder errorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }

        /**
         * errorMessage.
         */
        public Builder errorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }

        /**
         * requestId.
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
         * success.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public CreateRepositoryResponseBody build() {
            return new CreateRepositoryResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link CreateRepositoryResponseBody} extends {@link TeaModel}
     *
     * <p>CreateRepositoryResponseBody</p>
     */
    public static class Namespace extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("avatar")
        private String avatar;

        @com.aliyun.core.annotation.NameInMap("createdAt")
        private String createdAt;

        @com.aliyun.core.annotation.NameInMap("description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("id")
        private Long id;

        @com.aliyun.core.annotation.NameInMap("name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("ownerId")
        private Long ownerId;

        @com.aliyun.core.annotation.NameInMap("path")
        private String path;

        @com.aliyun.core.annotation.NameInMap("public")
        private Boolean _public;

        @com.aliyun.core.annotation.NameInMap("updatedAt")
        private String updatedAt;

        @com.aliyun.core.annotation.NameInMap("visibilityLevel")
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
             * avatar.
             */
            public Builder avatar(String avatar) {
                this.avatar = avatar;
                return this;
            }

            /**
             * createdAt.
             */
            public Builder createdAt(String createdAt) {
                this.createdAt = createdAt;
                return this;
            }

            /**
             * description.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>id</p>
             * 
             * <strong>example:</strong>
             * <p>3194</p>
             */
            public Builder id(Long id) {
                this.id = id;
                return this;
            }

            /**
             * name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * ownerId.
             */
            public Builder ownerId(Long ownerId) {
                this.ownerId = ownerId;
                return this;
            }

            /**
             * path.
             */
            public Builder path(String path) {
                this.path = path;
                return this;
            }

            /**
             * public.
             */
            public Builder _public(Boolean _public) {
                this._public = _public;
                return this;
            }

            /**
             * updatedAt.
             */
            public Builder updatedAt(String updatedAt) {
                this.updatedAt = updatedAt;
                return this;
            }

            /**
             * visibilityLevel.
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
    /**
     * 
     * {@link CreateRepositoryResponseBody} extends {@link TeaModel}
     *
     * <p>CreateRepositoryResponseBody</p>
     */
    public static class Result extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Import_from_svn")
        private Boolean importFromSvn;

        @com.aliyun.core.annotation.NameInMap("archived")
        private Boolean archived;

        @com.aliyun.core.annotation.NameInMap("avatar_url")
        private String avatarUrl;

        @com.aliyun.core.annotation.NameInMap("createdAt")
        private String createdAt;

        @com.aliyun.core.annotation.NameInMap("creatorId")
        private Long creatorId;

        @com.aliyun.core.annotation.NameInMap("defaultBranch")
        private String defaultBranch;

        @com.aliyun.core.annotation.NameInMap("demoProject")
        private Boolean demoProject;

        @com.aliyun.core.annotation.NameInMap("description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("httpUrlToRepo")
        private String httpUrlToRepo;

        @com.aliyun.core.annotation.NameInMap("id")
        private Long id;

        @com.aliyun.core.annotation.NameInMap("lastActivityAt")
        private String lastActivityAt;

        @com.aliyun.core.annotation.NameInMap("name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("nameWithNamespace")
        private String nameWithNamespace;

        @com.aliyun.core.annotation.NameInMap("namespace")
        private Namespace namespace;

        @com.aliyun.core.annotation.NameInMap("path")
        private String path;

        @com.aliyun.core.annotation.NameInMap("pathWithNamespace")
        private String pathWithNamespace;

        @com.aliyun.core.annotation.NameInMap("sshUrlToRepo")
        private String sshUrlToRepo;

        @com.aliyun.core.annotation.NameInMap("visibilityLevel")
        private String visibilityLevel;

        @com.aliyun.core.annotation.NameInMap("webUrl")
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
             * Import_from_svn.
             */
            public Builder importFromSvn(Boolean importFromSvn) {
                this.importFromSvn = importFromSvn;
                return this;
            }

            /**
             * archived.
             */
            public Builder archived(Boolean archived) {
                this.archived = archived;
                return this;
            }

            /**
             * avatar_url.
             */
            public Builder avatarUrl(String avatarUrl) {
                this.avatarUrl = avatarUrl;
                return this;
            }

            /**
             * createdAt.
             */
            public Builder createdAt(String createdAt) {
                this.createdAt = createdAt;
                return this;
            }

            /**
             * creatorId.
             */
            public Builder creatorId(Long creatorId) {
                this.creatorId = creatorId;
                return this;
            }

            /**
             * defaultBranch.
             */
            public Builder defaultBranch(String defaultBranch) {
                this.defaultBranch = defaultBranch;
                return this;
            }

            /**
             * demoProject.
             */
            public Builder demoProject(Boolean demoProject) {
                this.demoProject = demoProject;
                return this;
            }

            /**
             * description.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * httpUrlToRepo.
             */
            public Builder httpUrlToRepo(String httpUrlToRepo) {
                this.httpUrlToRepo = httpUrlToRepo;
                return this;
            }

            /**
             * <p>id</p>
             * 
             * <strong>example:</strong>
             * <p>2959</p>
             */
            public Builder id(Long id) {
                this.id = id;
                return this;
            }

            /**
             * lastActivityAt.
             */
            public Builder lastActivityAt(String lastActivityAt) {
                this.lastActivityAt = lastActivityAt;
                return this;
            }

            /**
             * name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * nameWithNamespace.
             */
            public Builder nameWithNamespace(String nameWithNamespace) {
                this.nameWithNamespace = nameWithNamespace;
                return this;
            }

            /**
             * namespace.
             */
            public Builder namespace(Namespace namespace) {
                this.namespace = namespace;
                return this;
            }

            /**
             * path.
             */
            public Builder path(String path) {
                this.path = path;
                return this;
            }

            /**
             * pathWithNamespace.
             */
            public Builder pathWithNamespace(String pathWithNamespace) {
                this.pathWithNamespace = pathWithNamespace;
                return this;
            }

            /**
             * sshUrlToRepo.
             */
            public Builder sshUrlToRepo(String sshUrlToRepo) {
                this.sshUrlToRepo = sshUrlToRepo;
                return this;
            }

            /**
             * visibilityLevel.
             */
            public Builder visibilityLevel(String visibilityLevel) {
                this.visibilityLevel = visibilityLevel;
                return this;
            }

            /**
             * <p>web url</p>
             * 
             * <strong>example:</strong>
             * <p>&quot;&quot;</p>
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
