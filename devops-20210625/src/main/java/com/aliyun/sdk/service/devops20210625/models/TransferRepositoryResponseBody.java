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
 * {@link TransferRepositoryResponseBody} extends {@link TeaModel}
 *
 * <p>TransferRepositoryResponseBody</p>
 */
public class TransferRepositoryResponseBody extends TeaModel {
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

    private TransferRepositoryResponseBody(Builder builder) {
        this.errorCode = builder.errorCode;
        this.errorMessage = builder.errorMessage;
        this.requestId = builder.requestId;
        this.result = builder.result;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static TransferRepositoryResponseBody create() {
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

        public TransferRepositoryResponseBody build() {
            return new TransferRepositoryResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link TransferRepositoryResponseBody} extends {@link TeaModel}
     *
     * <p>TransferRepositoryResponseBody</p>
     */
    public static class Result extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("accessLevel")
        private Integer accessLevel;

        @com.aliyun.core.annotation.NameInMap("archived")
        private Boolean archived;

        @com.aliyun.core.annotation.NameInMap("createdAt")
        private String createdAt;

        @com.aliyun.core.annotation.NameInMap("creatorId")
        private Long creatorId;

        @com.aliyun.core.annotation.NameInMap("demoProject")
        private Boolean demoProject;

        @com.aliyun.core.annotation.NameInMap("description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("encrypted")
        private Boolean encrypted;

        @com.aliyun.core.annotation.NameInMap("id")
        private Long id;

        @com.aliyun.core.annotation.NameInMap("lastActivityAt")
        private String lastActivityAt;

        @com.aliyun.core.annotation.NameInMap("name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("nameWithNamespace")
        private String nameWithNamespace;

        @com.aliyun.core.annotation.NameInMap("namespaceId")
        private Long namespaceId;

        @com.aliyun.core.annotation.NameInMap("path")
        private String path;

        @com.aliyun.core.annotation.NameInMap("pathWithNamespace")
        private String pathWithNamespace;

        @com.aliyun.core.annotation.NameInMap("starCount")
        private Long starCount;

        @com.aliyun.core.annotation.NameInMap("starred")
        private Boolean starred;

        @com.aliyun.core.annotation.NameInMap("updatedAt")
        private String updatedAt;

        @com.aliyun.core.annotation.NameInMap("visibilityLevel")
        private Integer visibilityLevel;

        @com.aliyun.core.annotation.NameInMap("webUrl")
        private String webUrl;

        private Result(Builder builder) {
            this.accessLevel = builder.accessLevel;
            this.archived = builder.archived;
            this.createdAt = builder.createdAt;
            this.creatorId = builder.creatorId;
            this.demoProject = builder.demoProject;
            this.description = builder.description;
            this.encrypted = builder.encrypted;
            this.id = builder.id;
            this.lastActivityAt = builder.lastActivityAt;
            this.name = builder.name;
            this.nameWithNamespace = builder.nameWithNamespace;
            this.namespaceId = builder.namespaceId;
            this.path = builder.path;
            this.pathWithNamespace = builder.pathWithNamespace;
            this.starCount = builder.starCount;
            this.starred = builder.starred;
            this.updatedAt = builder.updatedAt;
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
         * @return accessLevel
         */
        public Integer getAccessLevel() {
            return this.accessLevel;
        }

        /**
         * @return archived
         */
        public Boolean getArchived() {
            return this.archived;
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
         * @return encrypted
         */
        public Boolean getEncrypted() {
            return this.encrypted;
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
         * @return pathWithNamespace
         */
        public String getPathWithNamespace() {
            return this.pathWithNamespace;
        }

        /**
         * @return starCount
         */
        public Long getStarCount() {
            return this.starCount;
        }

        /**
         * @return starred
         */
        public Boolean getStarred() {
            return this.starred;
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

        /**
         * @return webUrl
         */
        public String getWebUrl() {
            return this.webUrl;
        }

        public static final class Builder {
            private Integer accessLevel; 
            private Boolean archived; 
            private String createdAt; 
            private Long creatorId; 
            private Boolean demoProject; 
            private String description; 
            private Boolean encrypted; 
            private Long id; 
            private String lastActivityAt; 
            private String name; 
            private String nameWithNamespace; 
            private Long namespaceId; 
            private String path; 
            private String pathWithNamespace; 
            private Long starCount; 
            private Boolean starred; 
            private String updatedAt; 
            private Integer visibilityLevel; 
            private String webUrl; 

            /**
             * accessLevel.
             */
            public Builder accessLevel(Integer accessLevel) {
                this.accessLevel = accessLevel;
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
             * encrypted.
             */
            public Builder encrypted(Boolean encrypted) {
                this.encrypted = encrypted;
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
             * namespaceId.
             */
            public Builder namespaceId(Long namespaceId) {
                this.namespaceId = namespaceId;
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
             * starCount.
             */
            public Builder starCount(Long starCount) {
                this.starCount = starCount;
                return this;
            }

            /**
             * starred.
             */
            public Builder starred(Boolean starred) {
                this.starred = starred;
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

            /**
             * webUrl.
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
