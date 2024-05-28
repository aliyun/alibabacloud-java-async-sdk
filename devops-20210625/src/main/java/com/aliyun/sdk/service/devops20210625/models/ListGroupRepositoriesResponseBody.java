// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.devops20210625.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListGroupRepositoriesResponseBody} extends {@link TeaModel}
 *
 * <p>ListGroupRepositoriesResponseBody</p>
 */
public class ListGroupRepositoriesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("errorCode")
    private String errorCode;

    @com.aliyun.core.annotation.NameInMap("errorMessage")
    private String errorMessage;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("result")
    private java.util.List < Result> result;

    @com.aliyun.core.annotation.NameInMap("success")
    private Boolean success;

    @com.aliyun.core.annotation.NameInMap("total")
    private Long total;

    private ListGroupRepositoriesResponseBody(Builder builder) {
        this.errorCode = builder.errorCode;
        this.errorMessage = builder.errorMessage;
        this.requestId = builder.requestId;
        this.result = builder.result;
        this.success = builder.success;
        this.total = builder.total;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListGroupRepositoriesResponseBody create() {
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
    public java.util.List < Result> getResult() {
        return this.result;
    }

    /**
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    /**
     * @return total
     */
    public Long getTotal() {
        return this.total;
    }

    public static final class Builder {
        private String errorCode; 
        private String errorMessage; 
        private String requestId; 
        private java.util.List < Result> result; 
        private Boolean success; 
        private Long total; 

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
        public Builder result(java.util.List < Result> result) {
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

        /**
         * total.
         */
        public Builder total(Long total) {
            this.total = total;
            return this;
        }

        public ListGroupRepositoriesResponseBody build() {
            return new ListGroupRepositoriesResponseBody(this);
        } 

    } 

    public static class Result extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("archived")
        private Boolean archived;

        @com.aliyun.core.annotation.NameInMap("commitCount")
        private Long commitCount;

        @com.aliyun.core.annotation.NameInMap("createdAt")
        private String createdAt;

        @com.aliyun.core.annotation.NameInMap("creatorId")
        private Long creatorId;

        @com.aliyun.core.annotation.NameInMap("description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("httpUrl")
        private String httpUrl;

        @com.aliyun.core.annotation.NameInMap("id")
        private Long id;

        @com.aliyun.core.annotation.NameInMap("importUrl")
        private String importUrl;

        @com.aliyun.core.annotation.NameInMap("isStared")
        private Boolean isStared;

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

        @com.aliyun.core.annotation.NameInMap("namespaceId")
        private Boolean namespaceId;

        @com.aliyun.core.annotation.NameInMap("path")
        private String path;

        @com.aliyun.core.annotation.NameInMap("pathWithNamespace")
        private String pathWithNamespace;

        @com.aliyun.core.annotation.NameInMap("privateFlag")
        private Boolean privateFlag;

        @com.aliyun.core.annotation.NameInMap("snippetsEnabled")
        private Boolean snippetsEnabled;

        @com.aliyun.core.annotation.NameInMap("sshUrl")
        private String sshUrl;

        @com.aliyun.core.annotation.NameInMap("starCount")
        private Integer starCount;

        @com.aliyun.core.annotation.NameInMap("updatedAt")
        private String updatedAt;

        @com.aliyun.core.annotation.NameInMap("visibilityLevel")
        private Integer visibilityLevel;

        @com.aliyun.core.annotation.NameInMap("webUrl")
        private String webUrl;

        @com.aliyun.core.annotation.NameInMap("wikiEnabled")
        private Boolean wikiEnabled;

        private Result(Builder builder) {
            this.archived = builder.archived;
            this.commitCount = builder.commitCount;
            this.createdAt = builder.createdAt;
            this.creatorId = builder.creatorId;
            this.description = builder.description;
            this.httpUrl = builder.httpUrl;
            this.id = builder.id;
            this.importUrl = builder.importUrl;
            this.isStared = builder.isStared;
            this.issuesEnabled = builder.issuesEnabled;
            this.lastActivityAt = builder.lastActivityAt;
            this.mergeRequestsEnabled = builder.mergeRequestsEnabled;
            this.name = builder.name;
            this.nameWithNamespace = builder.nameWithNamespace;
            this.namespaceId = builder.namespaceId;
            this.path = builder.path;
            this.pathWithNamespace = builder.pathWithNamespace;
            this.privateFlag = builder.privateFlag;
            this.snippetsEnabled = builder.snippetsEnabled;
            this.sshUrl = builder.sshUrl;
            this.starCount = builder.starCount;
            this.updatedAt = builder.updatedAt;
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
         * @return commitCount
         */
        public Long getCommitCount() {
            return this.commitCount;
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
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return httpUrl
         */
        public String getHttpUrl() {
            return this.httpUrl;
        }

        /**
         * @return id
         */
        public Long getId() {
            return this.id;
        }

        /**
         * @return importUrl
         */
        public String getImportUrl() {
            return this.importUrl;
        }

        /**
         * @return isStared
         */
        public Boolean getIsStared() {
            return this.isStared;
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
         * @return namespaceId
         */
        public Boolean getNamespaceId() {
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
         * @return privateFlag
         */
        public Boolean getPrivateFlag() {
            return this.privateFlag;
        }

        /**
         * @return snippetsEnabled
         */
        public Boolean getSnippetsEnabled() {
            return this.snippetsEnabled;
        }

        /**
         * @return sshUrl
         */
        public String getSshUrl() {
            return this.sshUrl;
        }

        /**
         * @return starCount
         */
        public Integer getStarCount() {
            return this.starCount;
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

        /**
         * @return wikiEnabled
         */
        public Boolean getWikiEnabled() {
            return this.wikiEnabled;
        }

        public static final class Builder {
            private Boolean archived; 
            private Long commitCount; 
            private String createdAt; 
            private Long creatorId; 
            private String description; 
            private String httpUrl; 
            private Long id; 
            private String importUrl; 
            private Boolean isStared; 
            private Boolean issuesEnabled; 
            private String lastActivityAt; 
            private Boolean mergeRequestsEnabled; 
            private String name; 
            private String nameWithNamespace; 
            private Boolean namespaceId; 
            private String path; 
            private String pathWithNamespace; 
            private Boolean privateFlag; 
            private Boolean snippetsEnabled; 
            private String sshUrl; 
            private Integer starCount; 
            private String updatedAt; 
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
             * commitCount.
             */
            public Builder commitCount(Long commitCount) {
                this.commitCount = commitCount;
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
             * description.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * httpUrl.
             */
            public Builder httpUrl(String httpUrl) {
                this.httpUrl = httpUrl;
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
             * importUrl.
             */
            public Builder importUrl(String importUrl) {
                this.importUrl = importUrl;
                return this;
            }

            /**
             * isStared.
             */
            public Builder isStared(Boolean isStared) {
                this.isStared = isStared;
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
             * namespaceId.
             */
            public Builder namespaceId(Boolean namespaceId) {
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
             * privateFlag.
             */
            public Builder privateFlag(Boolean privateFlag) {
                this.privateFlag = privateFlag;
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
             * sshUrl.
             */
            public Builder sshUrl(String sshUrl) {
                this.sshUrl = sshUrl;
                return this;
            }

            /**
             * starCount.
             */
            public Builder starCount(Integer starCount) {
                this.starCount = starCount;
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
