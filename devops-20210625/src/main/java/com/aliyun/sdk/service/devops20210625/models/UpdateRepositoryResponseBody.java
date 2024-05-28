// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.devops20210625.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateRepositoryResponseBody} extends {@link TeaModel}
 *
 * <p>UpdateRepositoryResponseBody</p>
 */
public class UpdateRepositoryResponseBody extends TeaModel {
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

    private UpdateRepositoryResponseBody(Builder builder) {
        this.errorCode = builder.errorCode;
        this.errorMessage = builder.errorMessage;
        this.requestId = builder.requestId;
        this.result = builder.result;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateRepositoryResponseBody create() {
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

        public UpdateRepositoryResponseBody build() {
            return new UpdateRepositoryResponseBody(this);
        } 

    } 

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

        @com.aliyun.core.annotation.NameInMap("updatedAt")
        private String updatedAt;

        @com.aliyun.core.annotation.NameInMap("visibilityLevel")
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
             * id.
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
             * updatedAt.
             */
            public Builder updatedAt(String updatedAt) {
                this.updatedAt = updatedAt;
                return this;
            }

            /**
             * visibilityLevel.
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
    public static class Result extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("archived")
        private Boolean archived;

        @com.aliyun.core.annotation.NameInMap("avatarUrl")
        private String avatarUrl;

        @com.aliyun.core.annotation.NameInMap("buildsEnabled")
        private Boolean buildsEnabled;

        @com.aliyun.core.annotation.NameInMap("createdAt")
        private String createdAt;

        @com.aliyun.core.annotation.NameInMap("creatorId")
        private Long creatorId;

        @com.aliyun.core.annotation.NameInMap("defaultBranch")
        private String defaultBranch;

        @com.aliyun.core.annotation.NameInMap("description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("httpUrlToRepo")
        private String httpUrlToRepo;

        @com.aliyun.core.annotation.NameInMap("id")
        private Long id;

        @com.aliyun.core.annotation.NameInMap("issuesEnabled")
        private Boolean issuesEnabled;

        @com.aliyun.core.annotation.NameInMap("lastActivityAt")
        private String lastActivityAt;

        @com.aliyun.core.annotation.NameInMap("mergeRequestsEnabled")
        private Boolean mergeRequestsEnabled;

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

        @com.aliyun.core.annotation.NameInMap("snippetsEnabled")
        private Boolean snippetsEnabled;

        @com.aliyun.core.annotation.NameInMap("sshUrlToRepo")
        private String sshUrlToRepo;

        @com.aliyun.core.annotation.NameInMap("visibilityLevel")
        private Integer visibilityLevel;

        @com.aliyun.core.annotation.NameInMap("webUrl")
        private String webUrl;

        @com.aliyun.core.annotation.NameInMap("wikiEnabled")
        private Boolean wikiEnabled;

        private Result(Builder builder) {
            this.archived = builder.archived;
            this.avatarUrl = builder.avatarUrl;
            this.buildsEnabled = builder.buildsEnabled;
            this.createdAt = builder.createdAt;
            this.creatorId = builder.creatorId;
            this.defaultBranch = builder.defaultBranch;
            this.description = builder.description;
            this.httpUrlToRepo = builder.httpUrlToRepo;
            this.id = builder.id;
            this.issuesEnabled = builder.issuesEnabled;
            this.lastActivityAt = builder.lastActivityAt;
            this.mergeRequestsEnabled = builder.mergeRequestsEnabled;
            this.name = builder.name;
            this.nameWithNamespace = builder.nameWithNamespace;
            this.namespace = builder.namespace;
            this.path = builder.path;
            this.pathWithNamespace = builder.pathWithNamespace;
            this.snippetsEnabled = builder.snippetsEnabled;
            this.sshUrlToRepo = builder.sshUrlToRepo;
            this.visibilityLevel = builder.visibilityLevel;
            this.webUrl = builder.webUrl;
            this.wikiEnabled = builder.wikiEnabled;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Result create() {
            return builder().build();
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
         * @return buildsEnabled
         */
        public Boolean getBuildsEnabled() {
            return this.buildsEnabled;
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
         * @return issuesEnabled
         */
        public Boolean getIssuesEnabled() {
            return this.issuesEnabled;
        }

        /**
         * @return lastActivityAt
         */
        public String getLastActivityAt() {
            return this.lastActivityAt;
        }

        /**
         * @return mergeRequestsEnabled
         */
        public Boolean getMergeRequestsEnabled() {
            return this.mergeRequestsEnabled;
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
         * @return snippetsEnabled
         */
        public Boolean getSnippetsEnabled() {
            return this.snippetsEnabled;
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
        public Integer getVisibilityLevel() {
            return this.visibilityLevel;
        }

        /**
         * @return webUrl
         */
        public String getWebUrl() {
            return this.webUrl;
        }

        /**
         * @return wikiEnabled
         */
        public Boolean getWikiEnabled() {
            return this.wikiEnabled;
        }

        public static final class Builder {
            private Boolean archived; 
            private String avatarUrl; 
            private Boolean buildsEnabled; 
            private String createdAt; 
            private Long creatorId; 
            private String defaultBranch; 
            private String description; 
            private String httpUrlToRepo; 
            private Long id; 
            private Boolean issuesEnabled; 
            private String lastActivityAt; 
            private Boolean mergeRequestsEnabled; 
            private String name; 
            private String nameWithNamespace; 
            private Namespace namespace; 
            private String path; 
            private String pathWithNamespace; 
            private Boolean snippetsEnabled; 
            private String sshUrlToRepo; 
            private Integer visibilityLevel; 
            private String webUrl; 
            private Boolean wikiEnabled; 

            /**
             * archived.
             */
            public Builder archived(Boolean archived) {
                this.archived = archived;
                return this;
            }

            /**
             * avatarUrl.
             */
            public Builder avatarUrl(String avatarUrl) {
                this.avatarUrl = avatarUrl;
                return this;
            }

            /**
             * buildsEnabled.
             */
            public Builder buildsEnabled(Boolean buildsEnabled) {
                this.buildsEnabled = buildsEnabled;
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
             * id.
             */
            public Builder id(Long id) {
                this.id = id;
                return this;
            }

            /**
             * issuesEnabled.
             */
            public Builder issuesEnabled(Boolean issuesEnabled) {
                this.issuesEnabled = issuesEnabled;
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
             * mergeRequestsEnabled.
             */
            public Builder mergeRequestsEnabled(Boolean mergeRequestsEnabled) {
                this.mergeRequestsEnabled = mergeRequestsEnabled;
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
             * snippetsEnabled.
             */
            public Builder snippetsEnabled(Boolean snippetsEnabled) {
                this.snippetsEnabled = snippetsEnabled;
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
            public Builder visibilityLevel(Integer visibilityLevel) {
                this.visibilityLevel = visibilityLevel;
                return this;
            }

            /**
             * webUrl.
             */
            public Builder webUrl(String webUrl) {
                this.webUrl = webUrl;
                return this;
            }

            /**
             * wikiEnabled.
             */
            public Builder wikiEnabled(Boolean wikiEnabled) {
                this.wikiEnabled = wikiEnabled;
                return this;
            }

            public Result build() {
                return new Result(this);
            } 

        } 

    }
}
