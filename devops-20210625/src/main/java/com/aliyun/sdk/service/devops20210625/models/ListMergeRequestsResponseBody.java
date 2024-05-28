// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.devops20210625.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListMergeRequestsResponseBody} extends {@link TeaModel}
 *
 * <p>ListMergeRequestsResponseBody</p>
 */
public class ListMergeRequestsResponseBody extends TeaModel {
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

    private ListMergeRequestsResponseBody(Builder builder) {
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

    public static ListMergeRequestsResponseBody create() {
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
         * Id of the request
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

        public ListMergeRequestsResponseBody build() {
            return new ListMergeRequestsResponseBody(this);
        } 

    } 

    public static class Author extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("avatarUrl")
        private String avatarUrl;

        @com.aliyun.core.annotation.NameInMap("email")
        private String email;

        @com.aliyun.core.annotation.NameInMap("id")
        private Long id;

        @com.aliyun.core.annotation.NameInMap("name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("state")
        private String state;

        @com.aliyun.core.annotation.NameInMap("username")
        private String username;

        private Author(Builder builder) {
            this.avatarUrl = builder.avatarUrl;
            this.email = builder.email;
            this.id = builder.id;
            this.name = builder.name;
            this.state = builder.state;
            this.username = builder.username;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Author create() {
            return builder().build();
        }

        /**
         * @return avatarUrl
         */
        public String getAvatarUrl() {
            return this.avatarUrl;
        }

        /**
         * @return email
         */
        public String getEmail() {
            return this.email;
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
         * @return state
         */
        public String getState() {
            return this.state;
        }

        /**
         * @return username
         */
        public String getUsername() {
            return this.username;
        }

        public static final class Builder {
            private String avatarUrl; 
            private String email; 
            private Long id; 
            private String name; 
            private String state; 
            private String username; 

            /**
             * avatarUrl.
             */
            public Builder avatarUrl(String avatarUrl) {
                this.avatarUrl = avatarUrl;
                return this;
            }

            /**
             * email.
             */
            public Builder email(String email) {
                this.email = email;
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
             * state.
             */
            public Builder state(String state) {
                this.state = state;
                return this;
            }

            /**
             * username.
             */
            public Builder username(String username) {
                this.username = username;
                return this;
            }

            public Author build() {
                return new Author(this);
            } 

        } 

    }
    public static class Labels extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("color")
        private String color;

        @com.aliyun.core.annotation.NameInMap("description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("id")
        private String id;

        @com.aliyun.core.annotation.NameInMap("name")
        private String name;

        private Labels(Builder builder) {
            this.color = builder.color;
            this.description = builder.description;
            this.id = builder.id;
            this.name = builder.name;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Labels create() {
            return builder().build();
        }

        /**
         * @return color
         */
        public String getColor() {
            return this.color;
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
        public String getId() {
            return this.id;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        public static final class Builder {
            private String color; 
            private String description; 
            private String id; 
            private String name; 

            /**
             * color.
             */
            public Builder color(String color) {
                this.color = color;
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
            public Builder id(String id) {
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

            public Labels build() {
                return new Labels(this);
            } 

        } 

    }
    public static class Reviewers extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("avatarUrl")
        private String avatarUrl;

        @com.aliyun.core.annotation.NameInMap("email")
        private String email;

        @com.aliyun.core.annotation.NameInMap("hasCommented")
        private Boolean hasCommented;

        @com.aliyun.core.annotation.NameInMap("hasReviewed")
        private Boolean hasReviewed;

        @com.aliyun.core.annotation.NameInMap("id")
        private Long id;

        @com.aliyun.core.annotation.NameInMap("name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("reviewOpinionStatus")
        private String reviewOpinionStatus;

        @com.aliyun.core.annotation.NameInMap("reviewTime")
        private String reviewTime;

        @com.aliyun.core.annotation.NameInMap("state")
        private String state;

        @com.aliyun.core.annotation.NameInMap("status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("username")
        private String username;

        private Reviewers(Builder builder) {
            this.avatarUrl = builder.avatarUrl;
            this.email = builder.email;
            this.hasCommented = builder.hasCommented;
            this.hasReviewed = builder.hasReviewed;
            this.id = builder.id;
            this.name = builder.name;
            this.reviewOpinionStatus = builder.reviewOpinionStatus;
            this.reviewTime = builder.reviewTime;
            this.state = builder.state;
            this.status = builder.status;
            this.username = builder.username;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Reviewers create() {
            return builder().build();
        }

        /**
         * @return avatarUrl
         */
        public String getAvatarUrl() {
            return this.avatarUrl;
        }

        /**
         * @return email
         */
        public String getEmail() {
            return this.email;
        }

        /**
         * @return hasCommented
         */
        public Boolean getHasCommented() {
            return this.hasCommented;
        }

        /**
         * @return hasReviewed
         */
        public Boolean getHasReviewed() {
            return this.hasReviewed;
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
         * @return reviewOpinionStatus
         */
        public String getReviewOpinionStatus() {
            return this.reviewOpinionStatus;
        }

        /**
         * @return reviewTime
         */
        public String getReviewTime() {
            return this.reviewTime;
        }

        /**
         * @return state
         */
        public String getState() {
            return this.state;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return username
         */
        public String getUsername() {
            return this.username;
        }

        public static final class Builder {
            private String avatarUrl; 
            private String email; 
            private Boolean hasCommented; 
            private Boolean hasReviewed; 
            private Long id; 
            private String name; 
            private String reviewOpinionStatus; 
            private String reviewTime; 
            private String state; 
            private String status; 
            private String username; 

            /**
             * avatarUrl.
             */
            public Builder avatarUrl(String avatarUrl) {
                this.avatarUrl = avatarUrl;
                return this;
            }

            /**
             * email.
             */
            public Builder email(String email) {
                this.email = email;
                return this;
            }

            /**
             * hasCommented.
             */
            public Builder hasCommented(Boolean hasCommented) {
                this.hasCommented = hasCommented;
                return this;
            }

            /**
             * hasReviewed.
             */
            public Builder hasReviewed(Boolean hasReviewed) {
                this.hasReviewed = hasReviewed;
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
             * reviewOpinionStatus.
             */
            public Builder reviewOpinionStatus(String reviewOpinionStatus) {
                this.reviewOpinionStatus = reviewOpinionStatus;
                return this;
            }

            /**
             * reviewTime.
             */
            public Builder reviewTime(String reviewTime) {
                this.reviewTime = reviewTime;
                return this;
            }

            /**
             * state.
             */
            public Builder state(String state) {
                this.state = state;
                return this;
            }

            /**
             * status.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * username.
             */
            public Builder username(String username) {
                this.username = username;
                return this;
            }

            public Reviewers build() {
                return new Reviewers(this);
            } 

        } 

    }
    public static class Subscribers extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("avatarUrl")
        private String avatarUrl;

        @com.aliyun.core.annotation.NameInMap("email")
        private String email;

        @com.aliyun.core.annotation.NameInMap("id")
        private Long id;

        @com.aliyun.core.annotation.NameInMap("name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("state")
        private String state;

        @com.aliyun.core.annotation.NameInMap("username")
        private String username;

        private Subscribers(Builder builder) {
            this.avatarUrl = builder.avatarUrl;
            this.email = builder.email;
            this.id = builder.id;
            this.name = builder.name;
            this.state = builder.state;
            this.username = builder.username;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Subscribers create() {
            return builder().build();
        }

        /**
         * @return avatarUrl
         */
        public String getAvatarUrl() {
            return this.avatarUrl;
        }

        /**
         * @return email
         */
        public String getEmail() {
            return this.email;
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
         * @return state
         */
        public String getState() {
            return this.state;
        }

        /**
         * @return username
         */
        public String getUsername() {
            return this.username;
        }

        public static final class Builder {
            private String avatarUrl; 
            private String email; 
            private Long id; 
            private String name; 
            private String state; 
            private String username; 

            /**
             * avatarUrl.
             */
            public Builder avatarUrl(String avatarUrl) {
                this.avatarUrl = avatarUrl;
                return this;
            }

            /**
             * email.
             */
            public Builder email(String email) {
                this.email = email;
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
             * state.
             */
            public Builder state(String state) {
                this.state = state;
                return this;
            }

            /**
             * username.
             */
            public Builder username(String username) {
                this.username = username;
                return this;
            }

            public Subscribers build() {
                return new Subscribers(this);
            } 

        } 

    }
    public static class Result extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("author")
        private Author author;

        @com.aliyun.core.annotation.NameInMap("createdAt")
        private String createdAt;

        @com.aliyun.core.annotation.NameInMap("creationMethod")
        private String creationMethod;

        @com.aliyun.core.annotation.NameInMap("description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("detailUrl")
        private String detailUrl;

        @com.aliyun.core.annotation.NameInMap("id")
        private Long id;

        @com.aliyun.core.annotation.NameInMap("iid")
        private Long iid;

        @com.aliyun.core.annotation.NameInMap("labels")
        private java.util.List < Labels> labels;

        @com.aliyun.core.annotation.NameInMap("localId")
        private Long localId;

        @com.aliyun.core.annotation.NameInMap("mergedRevision")
        private String mergedRevision;

        @com.aliyun.core.annotation.NameInMap("mrBizId")
        private String mrBizId;

        @com.aliyun.core.annotation.NameInMap("nameWithNamespace")
        private String nameWithNamespace;

        @com.aliyun.core.annotation.NameInMap("newMergeRequestIdentifier")
        private Boolean newMergeRequestIdentifier;

        @com.aliyun.core.annotation.NameInMap("newVersionState")
        private String newVersionState;

        @com.aliyun.core.annotation.NameInMap("projectId")
        private Long projectId;

        @com.aliyun.core.annotation.NameInMap("reviewers")
        private java.util.List < Reviewers> reviewers;

        @com.aliyun.core.annotation.NameInMap("sourceBranch")
        private String sourceBranch;

        @com.aliyun.core.annotation.NameInMap("sourceProjectId")
        private Long sourceProjectId;

        @com.aliyun.core.annotation.NameInMap("sourceType")
        private String sourceType;

        @com.aliyun.core.annotation.NameInMap("sshUrl")
        private String sshUrl;

        @com.aliyun.core.annotation.NameInMap("state")
        private String state;

        @com.aliyun.core.annotation.NameInMap("subscribers")
        private java.util.List < Subscribers> subscribers;

        @com.aliyun.core.annotation.NameInMap("supportMergeFFOnly")
        private Boolean supportMergeFFOnly;

        @com.aliyun.core.annotation.NameInMap("targetBranch")
        private String targetBranch;

        @com.aliyun.core.annotation.NameInMap("targetProjectId")
        private Long targetProjectId;

        @com.aliyun.core.annotation.NameInMap("targetType")
        private String targetType;

        @com.aliyun.core.annotation.NameInMap("title")
        private String title;

        @com.aliyun.core.annotation.NameInMap("updatedAt")
        private String updatedAt;

        @com.aliyun.core.annotation.NameInMap("webUrl")
        private String webUrl;

        @com.aliyun.core.annotation.NameInMap("workInProgress")
        private Boolean workInProgress;

        private Result(Builder builder) {
            this.author = builder.author;
            this.createdAt = builder.createdAt;
            this.creationMethod = builder.creationMethod;
            this.description = builder.description;
            this.detailUrl = builder.detailUrl;
            this.id = builder.id;
            this.iid = builder.iid;
            this.labels = builder.labels;
            this.localId = builder.localId;
            this.mergedRevision = builder.mergedRevision;
            this.mrBizId = builder.mrBizId;
            this.nameWithNamespace = builder.nameWithNamespace;
            this.newMergeRequestIdentifier = builder.newMergeRequestIdentifier;
            this.newVersionState = builder.newVersionState;
            this.projectId = builder.projectId;
            this.reviewers = builder.reviewers;
            this.sourceBranch = builder.sourceBranch;
            this.sourceProjectId = builder.sourceProjectId;
            this.sourceType = builder.sourceType;
            this.sshUrl = builder.sshUrl;
            this.state = builder.state;
            this.subscribers = builder.subscribers;
            this.supportMergeFFOnly = builder.supportMergeFFOnly;
            this.targetBranch = builder.targetBranch;
            this.targetProjectId = builder.targetProjectId;
            this.targetType = builder.targetType;
            this.title = builder.title;
            this.updatedAt = builder.updatedAt;
            this.webUrl = builder.webUrl;
            this.workInProgress = builder.workInProgress;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Result create() {
            return builder().build();
        }

        /**
         * @return author
         */
        public Author getAuthor() {
            return this.author;
        }

        /**
         * @return createdAt
         */
        public String getCreatedAt() {
            return this.createdAt;
        }

        /**
         * @return creationMethod
         */
        public String getCreationMethod() {
            return this.creationMethod;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return detailUrl
         */
        public String getDetailUrl() {
            return this.detailUrl;
        }

        /**
         * @return id
         */
        public Long getId() {
            return this.id;
        }

        /**
         * @return iid
         */
        public Long getIid() {
            return this.iid;
        }

        /**
         * @return labels
         */
        public java.util.List < Labels> getLabels() {
            return this.labels;
        }

        /**
         * @return localId
         */
        public Long getLocalId() {
            return this.localId;
        }

        /**
         * @return mergedRevision
         */
        public String getMergedRevision() {
            return this.mergedRevision;
        }

        /**
         * @return mrBizId
         */
        public String getMrBizId() {
            return this.mrBizId;
        }

        /**
         * @return nameWithNamespace
         */
        public String getNameWithNamespace() {
            return this.nameWithNamespace;
        }

        /**
         * @return newMergeRequestIdentifier
         */
        public Boolean getNewMergeRequestIdentifier() {
            return this.newMergeRequestIdentifier;
        }

        /**
         * @return newVersionState
         */
        public String getNewVersionState() {
            return this.newVersionState;
        }

        /**
         * @return projectId
         */
        public Long getProjectId() {
            return this.projectId;
        }

        /**
         * @return reviewers
         */
        public java.util.List < Reviewers> getReviewers() {
            return this.reviewers;
        }

        /**
         * @return sourceBranch
         */
        public String getSourceBranch() {
            return this.sourceBranch;
        }

        /**
         * @return sourceProjectId
         */
        public Long getSourceProjectId() {
            return this.sourceProjectId;
        }

        /**
         * @return sourceType
         */
        public String getSourceType() {
            return this.sourceType;
        }

        /**
         * @return sshUrl
         */
        public String getSshUrl() {
            return this.sshUrl;
        }

        /**
         * @return state
         */
        public String getState() {
            return this.state;
        }

        /**
         * @return subscribers
         */
        public java.util.List < Subscribers> getSubscribers() {
            return this.subscribers;
        }

        /**
         * @return supportMergeFFOnly
         */
        public Boolean getSupportMergeFFOnly() {
            return this.supportMergeFFOnly;
        }

        /**
         * @return targetBranch
         */
        public String getTargetBranch() {
            return this.targetBranch;
        }

        /**
         * @return targetProjectId
         */
        public Long getTargetProjectId() {
            return this.targetProjectId;
        }

        /**
         * @return targetType
         */
        public String getTargetType() {
            return this.targetType;
        }

        /**
         * @return title
         */
        public String getTitle() {
            return this.title;
        }

        /**
         * @return updatedAt
         */
        public String getUpdatedAt() {
            return this.updatedAt;
        }

        /**
         * @return webUrl
         */
        public String getWebUrl() {
            return this.webUrl;
        }

        /**
         * @return workInProgress
         */
        public Boolean getWorkInProgress() {
            return this.workInProgress;
        }

        public static final class Builder {
            private Author author; 
            private String createdAt; 
            private String creationMethod; 
            private String description; 
            private String detailUrl; 
            private Long id; 
            private Long iid; 
            private java.util.List < Labels> labels; 
            private Long localId; 
            private String mergedRevision; 
            private String mrBizId; 
            private String nameWithNamespace; 
            private Boolean newMergeRequestIdentifier; 
            private String newVersionState; 
            private Long projectId; 
            private java.util.List < Reviewers> reviewers; 
            private String sourceBranch; 
            private Long sourceProjectId; 
            private String sourceType; 
            private String sshUrl; 
            private String state; 
            private java.util.List < Subscribers> subscribers; 
            private Boolean supportMergeFFOnly; 
            private String targetBranch; 
            private Long targetProjectId; 
            private String targetType; 
            private String title; 
            private String updatedAt; 
            private String webUrl; 
            private Boolean workInProgress; 

            /**
             * author.
             */
            public Builder author(Author author) {
                this.author = author;
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
             * creationMethod.
             */
            public Builder creationMethod(String creationMethod) {
                this.creationMethod = creationMethod;
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
             * detailUrl.
             */
            public Builder detailUrl(String detailUrl) {
                this.detailUrl = detailUrl;
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
             * iid.
             */
            public Builder iid(Long iid) {
                this.iid = iid;
                return this;
            }

            /**
             * labels.
             */
            public Builder labels(java.util.List < Labels> labels) {
                this.labels = labels;
                return this;
            }

            /**
             * localId.
             */
            public Builder localId(Long localId) {
                this.localId = localId;
                return this;
            }

            /**
             * mergedRevision.
             */
            public Builder mergedRevision(String mergedRevision) {
                this.mergedRevision = mergedRevision;
                return this;
            }

            /**
             * mrBizId.
             */
            public Builder mrBizId(String mrBizId) {
                this.mrBizId = mrBizId;
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
             * newMergeRequestIdentifier.
             */
            public Builder newMergeRequestIdentifier(Boolean newMergeRequestIdentifier) {
                this.newMergeRequestIdentifier = newMergeRequestIdentifier;
                return this;
            }

            /**
             * newVersionState.
             */
            public Builder newVersionState(String newVersionState) {
                this.newVersionState = newVersionState;
                return this;
            }

            /**
             * projectId.
             */
            public Builder projectId(Long projectId) {
                this.projectId = projectId;
                return this;
            }

            /**
             * reviewers.
             */
            public Builder reviewers(java.util.List < Reviewers> reviewers) {
                this.reviewers = reviewers;
                return this;
            }

            /**
             * sourceBranch.
             */
            public Builder sourceBranch(String sourceBranch) {
                this.sourceBranch = sourceBranch;
                return this;
            }

            /**
             * sourceProjectId.
             */
            public Builder sourceProjectId(Long sourceProjectId) {
                this.sourceProjectId = sourceProjectId;
                return this;
            }

            /**
             * sourceType.
             */
            public Builder sourceType(String sourceType) {
                this.sourceType = sourceType;
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
             * state.
             */
            public Builder state(String state) {
                this.state = state;
                return this;
            }

            /**
             * subscribers.
             */
            public Builder subscribers(java.util.List < Subscribers> subscribers) {
                this.subscribers = subscribers;
                return this;
            }

            /**
             * supportMergeFFOnly.
             */
            public Builder supportMergeFFOnly(Boolean supportMergeFFOnly) {
                this.supportMergeFFOnly = supportMergeFFOnly;
                return this;
            }

            /**
             * targetBranch.
             */
            public Builder targetBranch(String targetBranch) {
                this.targetBranch = targetBranch;
                return this;
            }

            /**
             * targetProjectId.
             */
            public Builder targetProjectId(Long targetProjectId) {
                this.targetProjectId = targetProjectId;
                return this;
            }

            /**
             * targetType.
             */
            public Builder targetType(String targetType) {
                this.targetType = targetType;
                return this;
            }

            /**
             * title.
             */
            public Builder title(String title) {
                this.title = title;
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
             * webUrl.
             */
            public Builder webUrl(String webUrl) {
                this.webUrl = webUrl;
                return this;
            }

            /**
             * workInProgress.
             */
            public Builder workInProgress(Boolean workInProgress) {
                this.workInProgress = workInProgress;
                return this;
            }

            public Result build() {
                return new Result(this);
            } 

        } 

    }
}
