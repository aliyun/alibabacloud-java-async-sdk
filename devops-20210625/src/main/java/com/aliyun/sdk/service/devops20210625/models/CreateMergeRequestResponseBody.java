// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.devops20210625.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateMergeRequestResponseBody} extends {@link TeaModel}
 *
 * <p>CreateMergeRequestResponseBody</p>
 */
public class CreateMergeRequestResponseBody extends TeaModel {
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

    private CreateMergeRequestResponseBody(Builder builder) {
        this.errorCode = builder.errorCode;
        this.errorMessage = builder.errorMessage;
        this.requestId = builder.requestId;
        this.result = builder.result;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateMergeRequestResponseBody create() {
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

        public CreateMergeRequestResponseBody build() {
            return new CreateMergeRequestResponseBody(this);
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
    public static class Reviewers extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("avatarUrl")
        private String avatarUrl;

        @com.aliyun.core.annotation.NameInMap("email")
        private String email;

        @com.aliyun.core.annotation.NameInMap("hasReviewed")
        private Boolean hasReviewed;

        @com.aliyun.core.annotation.NameInMap("id")
        private Long id;

        @com.aliyun.core.annotation.NameInMap("name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("reviewOpinionStatus")
        private String reviewOpinionStatus;

        @com.aliyun.core.annotation.NameInMap("state")
        private String state;

        @com.aliyun.core.annotation.NameInMap("username")
        private String username;

        private Reviewers(Builder builder) {
            this.avatarUrl = builder.avatarUrl;
            this.email = builder.email;
            this.hasReviewed = builder.hasReviewed;
            this.id = builder.id;
            this.name = builder.name;
            this.reviewOpinionStatus = builder.reviewOpinionStatus;
            this.state = builder.state;
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
            private Boolean hasReviewed; 
            private Long id; 
            private String name; 
            private String reviewOpinionStatus; 
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
        @com.aliyun.core.annotation.NameInMap("ahead")
        private Integer ahead;

        @com.aliyun.core.annotation.NameInMap("allRequirementsPass")
        private Boolean allRequirementsPass;

        @com.aliyun.core.annotation.NameInMap("author")
        private Author author;

        @com.aliyun.core.annotation.NameInMap("behind")
        private Integer behind;

        @com.aliyun.core.annotation.NameInMap("createFrom")
        private String createFrom;

        @com.aliyun.core.annotation.NameInMap("createTime")
        private String createTime;

        @com.aliyun.core.annotation.NameInMap("description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("detailUrl")
        private String detailUrl;

        @com.aliyun.core.annotation.NameInMap("localId")
        private Long localId;

        @com.aliyun.core.annotation.NameInMap("mrBizId")
        private String mrBizId;

        @com.aliyun.core.annotation.NameInMap("mrType")
        private String mrType;

        @com.aliyun.core.annotation.NameInMap("projectId")
        private Long projectId;

        @com.aliyun.core.annotation.NameInMap("reviewers")
        private java.util.List < Reviewers> reviewers;

        @com.aliyun.core.annotation.NameInMap("sourceBranch")
        private String sourceBranch;

        @com.aliyun.core.annotation.NameInMap("sourceProjectId")
        private Long sourceProjectId;

        @com.aliyun.core.annotation.NameInMap("status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("subscribers")
        private java.util.List < Subscribers> subscribers;

        @com.aliyun.core.annotation.NameInMap("supportMergeFastForwardOnly")
        private Boolean supportMergeFastForwardOnly;

        @com.aliyun.core.annotation.NameInMap("targetBranch")
        private String targetBranch;

        @com.aliyun.core.annotation.NameInMap("targetProjectId")
        private Long targetProjectId;

        @com.aliyun.core.annotation.NameInMap("title")
        private String title;

        @com.aliyun.core.annotation.NameInMap("updateTime")
        private String updateTime;

        @com.aliyun.core.annotation.NameInMap("webUrl")
        private String webUrl;

        private Result(Builder builder) {
            this.ahead = builder.ahead;
            this.allRequirementsPass = builder.allRequirementsPass;
            this.author = builder.author;
            this.behind = builder.behind;
            this.createFrom = builder.createFrom;
            this.createTime = builder.createTime;
            this.description = builder.description;
            this.detailUrl = builder.detailUrl;
            this.localId = builder.localId;
            this.mrBizId = builder.mrBizId;
            this.mrType = builder.mrType;
            this.projectId = builder.projectId;
            this.reviewers = builder.reviewers;
            this.sourceBranch = builder.sourceBranch;
            this.sourceProjectId = builder.sourceProjectId;
            this.status = builder.status;
            this.subscribers = builder.subscribers;
            this.supportMergeFastForwardOnly = builder.supportMergeFastForwardOnly;
            this.targetBranch = builder.targetBranch;
            this.targetProjectId = builder.targetProjectId;
            this.title = builder.title;
            this.updateTime = builder.updateTime;
            this.webUrl = builder.webUrl;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Result create() {
            return builder().build();
        }

        /**
         * @return ahead
         */
        public Integer getAhead() {
            return this.ahead;
        }

        /**
         * @return allRequirementsPass
         */
        public Boolean getAllRequirementsPass() {
            return this.allRequirementsPass;
        }

        /**
         * @return author
         */
        public Author getAuthor() {
            return this.author;
        }

        /**
         * @return behind
         */
        public Integer getBehind() {
            return this.behind;
        }

        /**
         * @return createFrom
         */
        public String getCreateFrom() {
            return this.createFrom;
        }

        /**
         * @return createTime
         */
        public String getCreateTime() {
            return this.createTime;
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
         * @return localId
         */
        public Long getLocalId() {
            return this.localId;
        }

        /**
         * @return mrBizId
         */
        public String getMrBizId() {
            return this.mrBizId;
        }

        /**
         * @return mrType
         */
        public String getMrType() {
            return this.mrType;
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
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return subscribers
         */
        public java.util.List < Subscribers> getSubscribers() {
            return this.subscribers;
        }

        /**
         * @return supportMergeFastForwardOnly
         */
        public Boolean getSupportMergeFastForwardOnly() {
            return this.supportMergeFastForwardOnly;
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
         * @return title
         */
        public String getTitle() {
            return this.title;
        }

        /**
         * @return updateTime
         */
        public String getUpdateTime() {
            return this.updateTime;
        }

        /**
         * @return webUrl
         */
        public String getWebUrl() {
            return this.webUrl;
        }

        public static final class Builder {
            private Integer ahead; 
            private Boolean allRequirementsPass; 
            private Author author; 
            private Integer behind; 
            private String createFrom; 
            private String createTime; 
            private String description; 
            private String detailUrl; 
            private Long localId; 
            private String mrBizId; 
            private String mrType; 
            private Long projectId; 
            private java.util.List < Reviewers> reviewers; 
            private String sourceBranch; 
            private Long sourceProjectId; 
            private String status; 
            private java.util.List < Subscribers> subscribers; 
            private Boolean supportMergeFastForwardOnly; 
            private String targetBranch; 
            private Long targetProjectId; 
            private String title; 
            private String updateTime; 
            private String webUrl; 

            /**
             * ahead.
             */
            public Builder ahead(Integer ahead) {
                this.ahead = ahead;
                return this;
            }

            /**
             * allRequirementsPass.
             */
            public Builder allRequirementsPass(Boolean allRequirementsPass) {
                this.allRequirementsPass = allRequirementsPass;
                return this;
            }

            /**
             * author.
             */
            public Builder author(Author author) {
                this.author = author;
                return this;
            }

            /**
             * behind.
             */
            public Builder behind(Integer behind) {
                this.behind = behind;
                return this;
            }

            /**
             * createFrom.
             */
            public Builder createFrom(String createFrom) {
                this.createFrom = createFrom;
                return this;
            }

            /**
             * createTime.
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
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
             * localId.
             */
            public Builder localId(Long localId) {
                this.localId = localId;
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
             * mrType.
             */
            public Builder mrType(String mrType) {
                this.mrType = mrType;
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
             * status.
             */
            public Builder status(String status) {
                this.status = status;
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
             * supportMergeFastForwardOnly.
             */
            public Builder supportMergeFastForwardOnly(Boolean supportMergeFastForwardOnly) {
                this.supportMergeFastForwardOnly = supportMergeFastForwardOnly;
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
             * title.
             */
            public Builder title(String title) {
                this.title = title;
                return this;
            }

            /**
             * updateTime.
             */
            public Builder updateTime(String updateTime) {
                this.updateTime = updateTime;
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
