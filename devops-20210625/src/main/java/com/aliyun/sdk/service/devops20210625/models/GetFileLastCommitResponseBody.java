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
 * {@link GetFileLastCommitResponseBody} extends {@link TeaModel}
 *
 * <p>GetFileLastCommitResponseBody</p>
 */
public class GetFileLastCommitResponseBody extends TeaModel {
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

    private GetFileLastCommitResponseBody(Builder builder) {
        this.errorCode = builder.errorCode;
        this.errorMessage = builder.errorMessage;
        this.requestId = builder.requestId;
        this.result = builder.result;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetFileLastCommitResponseBody create() {
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

        public GetFileLastCommitResponseBody build() {
            return new GetFileLastCommitResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetFileLastCommitResponseBody} extends {@link TeaModel}
     *
     * <p>GetFileLastCommitResponseBody</p>
     */
    public static class Signature extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("gpgKeyId")
        private String gpgKeyId;

        @com.aliyun.core.annotation.NameInMap("verificationStatus")
        private String verificationStatus;

        private Signature(Builder builder) {
            this.gpgKeyId = builder.gpgKeyId;
            this.verificationStatus = builder.verificationStatus;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Signature create() {
            return builder().build();
        }

        /**
         * @return gpgKeyId
         */
        public String getGpgKeyId() {
            return this.gpgKeyId;
        }

        /**
         * @return verificationStatus
         */
        public String getVerificationStatus() {
            return this.verificationStatus;
        }

        public static final class Builder {
            private String gpgKeyId; 
            private String verificationStatus; 

            /**
             * <p>GPG密钥ID</p>
             * 
             * <strong>example:</strong>
             * <p>34d2c47c7ce46a5c4639c5ffe208</p>
             */
            public Builder gpgKeyId(String gpgKeyId) {
                this.gpgKeyId = gpgKeyId;
                return this;
            }

            /**
             * verificationStatus.
             */
            public Builder verificationStatus(String verificationStatus) {
                this.verificationStatus = verificationStatus;
                return this;
            }

            public Signature build() {
                return new Signature(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetFileLastCommitResponseBody} extends {@link TeaModel}
     *
     * <p>GetFileLastCommitResponseBody</p>
     */
    public static class Result extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("authorDate")
        private String authorDate;

        @com.aliyun.core.annotation.NameInMap("authorEmail")
        private String authorEmail;

        @com.aliyun.core.annotation.NameInMap("authorName")
        private String authorName;

        @com.aliyun.core.annotation.NameInMap("committedDate")
        private String committedDate;

        @com.aliyun.core.annotation.NameInMap("committerEmail")
        private String committerEmail;

        @com.aliyun.core.annotation.NameInMap("committerName")
        private String committerName;

        @com.aliyun.core.annotation.NameInMap("createdAt")
        private String createdAt;

        @com.aliyun.core.annotation.NameInMap("id")
        private String id;

        @com.aliyun.core.annotation.NameInMap("message")
        private String message;

        @com.aliyun.core.annotation.NameInMap("parentIds")
        private java.util.List<String> parentIds;

        @com.aliyun.core.annotation.NameInMap("shortId")
        private String shortId;

        @com.aliyun.core.annotation.NameInMap("signature")
        private Signature signature;

        @com.aliyun.core.annotation.NameInMap("title")
        private String title;

        private Result(Builder builder) {
            this.authorDate = builder.authorDate;
            this.authorEmail = builder.authorEmail;
            this.authorName = builder.authorName;
            this.committedDate = builder.committedDate;
            this.committerEmail = builder.committerEmail;
            this.committerName = builder.committerName;
            this.createdAt = builder.createdAt;
            this.id = builder.id;
            this.message = builder.message;
            this.parentIds = builder.parentIds;
            this.shortId = builder.shortId;
            this.signature = builder.signature;
            this.title = builder.title;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Result create() {
            return builder().build();
        }

        /**
         * @return authorDate
         */
        public String getAuthorDate() {
            return this.authorDate;
        }

        /**
         * @return authorEmail
         */
        public String getAuthorEmail() {
            return this.authorEmail;
        }

        /**
         * @return authorName
         */
        public String getAuthorName() {
            return this.authorName;
        }

        /**
         * @return committedDate
         */
        public String getCommittedDate() {
            return this.committedDate;
        }

        /**
         * @return committerEmail
         */
        public String getCommitterEmail() {
            return this.committerEmail;
        }

        /**
         * @return committerName
         */
        public String getCommitterName() {
            return this.committerName;
        }

        /**
         * @return createdAt
         */
        public String getCreatedAt() {
            return this.createdAt;
        }

        /**
         * @return id
         */
        public String getId() {
            return this.id;
        }

        /**
         * @return message
         */
        public String getMessage() {
            return this.message;
        }

        /**
         * @return parentIds
         */
        public java.util.List<String> getParentIds() {
            return this.parentIds;
        }

        /**
         * @return shortId
         */
        public String getShortId() {
            return this.shortId;
        }

        /**
         * @return signature
         */
        public Signature getSignature() {
            return this.signature;
        }

        /**
         * @return title
         */
        public String getTitle() {
            return this.title;
        }

        public static final class Builder {
            private String authorDate; 
            private String authorEmail; 
            private String authorName; 
            private String committedDate; 
            private String committerEmail; 
            private String committerName; 
            private String createdAt; 
            private String id; 
            private String message; 
            private java.util.List<String> parentIds; 
            private String shortId; 
            private Signature signature; 
            private String title; 

            /**
             * authorDate.
             */
            public Builder authorDate(String authorDate) {
                this.authorDate = authorDate;
                return this;
            }

            /**
             * authorEmail.
             */
            public Builder authorEmail(String authorEmail) {
                this.authorEmail = authorEmail;
                return this;
            }

            /**
             * authorName.
             */
            public Builder authorName(String authorName) {
                this.authorName = authorName;
                return this;
            }

            /**
             * committedDate.
             */
            public Builder committedDate(String committedDate) {
                this.committedDate = committedDate;
                return this;
            }

            /**
             * committerEmail.
             */
            public Builder committerEmail(String committerEmail) {
                this.committerEmail = committerEmail;
                return this;
            }

            /**
             * committerName.
             */
            public Builder committerName(String committerName) {
                this.committerName = committerName;
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
             * id.
             */
            public Builder id(String id) {
                this.id = id;
                return this;
            }

            /**
             * message.
             */
            public Builder message(String message) {
                this.message = message;
                return this;
            }

            /**
             * parentIds.
             */
            public Builder parentIds(java.util.List<String> parentIds) {
                this.parentIds = parentIds;
                return this;
            }

            /**
             * shortId.
             */
            public Builder shortId(String shortId) {
                this.shortId = shortId;
                return this;
            }

            /**
             * signature.
             */
            public Builder signature(Signature signature) {
                this.signature = signature;
                return this;
            }

            /**
             * title.
             */
            public Builder title(String title) {
                this.title = title;
                return this;
            }

            public Result build() {
                return new Result(this);
            } 

        } 

    }
}
