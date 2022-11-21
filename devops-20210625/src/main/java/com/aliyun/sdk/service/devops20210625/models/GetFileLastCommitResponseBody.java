// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.devops20210625.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetFileLastCommitResponseBody} extends {@link TeaModel}
 *
 * <p>GetFileLastCommitResponseBody</p>
 */
public class GetFileLastCommitResponseBody extends TeaModel {
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
         * 响应结果
         */
        public Builder result(Result result) {
            this.result = result;
            return this;
        }

        /**
         * 请求结果
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public GetFileLastCommitResponseBody build() {
            return new GetFileLastCommitResponseBody(this);
        } 

    } 

    public static class Signature extends TeaModel {
        @NameInMap("GpgKeyId")
        private String gpgKeyId;

        @NameInMap("VerificationStatus")
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
             * GPG密钥ID
             */
            public Builder gpgKeyId(String gpgKeyId) {
                this.gpgKeyId = gpgKeyId;
                return this;
            }

            /**
             * 验证状态
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
    public static class Result extends TeaModel {
        @NameInMap("authorDate")
        private String authorDate;

        @NameInMap("authorEmail")
        private String authorEmail;

        @NameInMap("authorName")
        private String authorName;

        @NameInMap("committedDate")
        private String committedDate;

        @NameInMap("committerEmail")
        private String committerEmail;

        @NameInMap("committerName")
        private String committerName;

        @NameInMap("createdAt")
        private String createdAt;

        @NameInMap("id")
        private String id;

        @NameInMap("message")
        private String message;

        @NameInMap("parentIds")
        private java.util.List < String > parentIds;

        @NameInMap("shortId")
        private String shortId;

        @NameInMap("signature")
        private Signature signature;

        @NameInMap("title")
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
        public java.util.List < String > getParentIds() {
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
            private java.util.List < String > parentIds; 
            private String shortId; 
            private Signature signature; 
            private String title; 

            /**
             * 作者提交时间
             */
            public Builder authorDate(String authorDate) {
                this.authorDate = authorDate;
                return this;
            }

            /**
             * 提交者邮箱
             */
            public Builder authorEmail(String authorEmail) {
                this.authorEmail = authorEmail;
                return this;
            }

            /**
             * 作者姓名
             */
            public Builder authorName(String authorName) {
                this.authorName = authorName;
                return this;
            }

            /**
             * 提交者提交时间
             */
            public Builder committedDate(String committedDate) {
                this.committedDate = committedDate;
                return this;
            }

            /**
             * 提交者邮箱
             */
            public Builder committerEmail(String committerEmail) {
                this.committerEmail = committerEmail;
                return this;
            }

            /**
             * 提交者姓名
             */
            public Builder committerName(String committerName) {
                this.committerName = committerName;
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
             * Commit ID
             */
            public Builder id(String id) {
                this.id = id;
                return this;
            }

            /**
             * 提交内容
             */
            public Builder message(String message) {
                this.message = message;
                return this;
            }

            /**
             * 父提交ID
             */
            public Builder parentIds(java.util.List < String > parentIds) {
                this.parentIds = parentIds;
                return this;
            }

            /**
             * Commit短ID
             */
            public Builder shortId(String shortId) {
                this.shortId = shortId;
                return this;
            }

            /**
             * 签名
             */
            public Builder signature(Signature signature) {
                this.signature = signature;
                return this;
            }

            /**
             * 标题，提交的第一行内容
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
