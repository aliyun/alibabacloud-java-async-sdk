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
 * {@link DeleteRepositoryWebhookResponseBody} extends {@link TeaModel}
 *
 * <p>DeleteRepositoryWebhookResponseBody</p>
 */
public class DeleteRepositoryWebhookResponseBody extends TeaModel {
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

    private DeleteRepositoryWebhookResponseBody(Builder builder) {
        this.errorCode = builder.errorCode;
        this.errorMessage = builder.errorMessage;
        this.requestId = builder.requestId;
        this.result = builder.result;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteRepositoryWebhookResponseBody create() {
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

        public DeleteRepositoryWebhookResponseBody build() {
            return new DeleteRepositoryWebhookResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DeleteRepositoryWebhookResponseBody} extends {@link TeaModel}
     *
     * <p>DeleteRepositoryWebhookResponseBody</p>
     */
    public static class Result extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("buildEvents")
        private Boolean buildEvents;

        @com.aliyun.core.annotation.NameInMap("createdAt")
        private String createdAt;

        @com.aliyun.core.annotation.NameInMap("description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("enableSslVerification")
        private Boolean enableSslVerification;

        @com.aliyun.core.annotation.NameInMap("id")
        private Long id;

        @com.aliyun.core.annotation.NameInMap("issuesEvents")
        private Boolean issuesEvents;

        @com.aliyun.core.annotation.NameInMap("lastTestResult")
        private String lastTestResult;

        @com.aliyun.core.annotation.NameInMap("mergeRequestsEvents")
        private Boolean mergeRequestsEvents;

        @com.aliyun.core.annotation.NameInMap("noteEvents")
        private Boolean noteEvents;

        @com.aliyun.core.annotation.NameInMap("projectId")
        private Long projectId;

        @com.aliyun.core.annotation.NameInMap("pushEvents")
        private Boolean pushEvents;

        @com.aliyun.core.annotation.NameInMap("secretToken")
        private String secretToken;

        @com.aliyun.core.annotation.NameInMap("tagPushEvents")
        private Boolean tagPushEvents;

        @com.aliyun.core.annotation.NameInMap("type")
        private String type;

        @com.aliyun.core.annotation.NameInMap("url")
        private String url;

        private Result(Builder builder) {
            this.buildEvents = builder.buildEvents;
            this.createdAt = builder.createdAt;
            this.description = builder.description;
            this.enableSslVerification = builder.enableSslVerification;
            this.id = builder.id;
            this.issuesEvents = builder.issuesEvents;
            this.lastTestResult = builder.lastTestResult;
            this.mergeRequestsEvents = builder.mergeRequestsEvents;
            this.noteEvents = builder.noteEvents;
            this.projectId = builder.projectId;
            this.pushEvents = builder.pushEvents;
            this.secretToken = builder.secretToken;
            this.tagPushEvents = builder.tagPushEvents;
            this.type = builder.type;
            this.url = builder.url;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Result create() {
            return builder().build();
        }

        /**
         * @return buildEvents
         */
        public Boolean getBuildEvents() {
            return this.buildEvents;
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
         * @return enableSslVerification
         */
        public Boolean getEnableSslVerification() {
            return this.enableSslVerification;
        }

        /**
         * @return id
         */
        public Long getId() {
            return this.id;
        }

        /**
         * @return issuesEvents
         */
        public Boolean getIssuesEvents() {
            return this.issuesEvents;
        }

        /**
         * @return lastTestResult
         */
        public String getLastTestResult() {
            return this.lastTestResult;
        }

        /**
         * @return mergeRequestsEvents
         */
        public Boolean getMergeRequestsEvents() {
            return this.mergeRequestsEvents;
        }

        /**
         * @return noteEvents
         */
        public Boolean getNoteEvents() {
            return this.noteEvents;
        }

        /**
         * @return projectId
         */
        public Long getProjectId() {
            return this.projectId;
        }

        /**
         * @return pushEvents
         */
        public Boolean getPushEvents() {
            return this.pushEvents;
        }

        /**
         * @return secretToken
         */
        public String getSecretToken() {
            return this.secretToken;
        }

        /**
         * @return tagPushEvents
         */
        public Boolean getTagPushEvents() {
            return this.tagPushEvents;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        /**
         * @return url
         */
        public String getUrl() {
            return this.url;
        }

        public static final class Builder {
            private Boolean buildEvents; 
            private String createdAt; 
            private String description; 
            private Boolean enableSslVerification; 
            private Long id; 
            private Boolean issuesEvents; 
            private String lastTestResult; 
            private Boolean mergeRequestsEvents; 
            private Boolean noteEvents; 
            private Long projectId; 
            private Boolean pushEvents; 
            private String secretToken; 
            private Boolean tagPushEvents; 
            private String type; 
            private String url; 

            /**
             * buildEvents.
             */
            public Builder buildEvents(Boolean buildEvents) {
                this.buildEvents = buildEvents;
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
             * enableSslVerification.
             */
            public Builder enableSslVerification(Boolean enableSslVerification) {
                this.enableSslVerification = enableSslVerification;
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
             * issuesEvents.
             */
            public Builder issuesEvents(Boolean issuesEvents) {
                this.issuesEvents = issuesEvents;
                return this;
            }

            /**
             * lastTestResult.
             */
            public Builder lastTestResult(String lastTestResult) {
                this.lastTestResult = lastTestResult;
                return this;
            }

            /**
             * mergeRequestsEvents.
             */
            public Builder mergeRequestsEvents(Boolean mergeRequestsEvents) {
                this.mergeRequestsEvents = mergeRequestsEvents;
                return this;
            }

            /**
             * noteEvents.
             */
            public Builder noteEvents(Boolean noteEvents) {
                this.noteEvents = noteEvents;
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
             * pushEvents.
             */
            public Builder pushEvents(Boolean pushEvents) {
                this.pushEvents = pushEvents;
                return this;
            }

            /**
             * secretToken.
             */
            public Builder secretToken(String secretToken) {
                this.secretToken = secretToken;
                return this;
            }

            /**
             * tagPushEvents.
             */
            public Builder tagPushEvents(Boolean tagPushEvents) {
                this.tagPushEvents = tagPushEvents;
                return this;
            }

            /**
             * type.
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            /**
             * url.
             */
            public Builder url(String url) {
                this.url = url;
                return this;
            }

            public Result build() {
                return new Result(this);
            } 

        } 

    }
}
