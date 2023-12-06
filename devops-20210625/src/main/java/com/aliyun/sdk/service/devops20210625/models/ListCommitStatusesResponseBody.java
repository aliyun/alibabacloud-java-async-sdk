// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.devops20210625.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListCommitStatusesResponseBody} extends {@link TeaModel}
 *
 * <p>ListCommitStatusesResponseBody</p>
 */
public class ListCommitStatusesResponseBody extends TeaModel {
    @NameInMap("errorCode")
    private String errorCode;

    @NameInMap("errorMessage")
    private String errorMessage;

    @NameInMap("requestId")
    private String requestId;

    @NameInMap("result")
    private java.util.List < Result> result;

    @NameInMap("success")
    private Boolean success;

    @NameInMap("total")
    private Long total;

    private ListCommitStatusesResponseBody(Builder builder) {
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

    public static ListCommitStatusesResponseBody create() {
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

        public ListCommitStatusesResponseBody build() {
            return new ListCommitStatusesResponseBody(this);
        } 

    } 

    public static class Creator extends TeaModel {
        @NameInMap("aliyunPk")
        private String aliyunPk;

        @NameInMap("avatarUrl")
        private String avatarUrl;

        @NameInMap("login")
        private String login;

        @NameInMap("type")
        private String type;

        private Creator(Builder builder) {
            this.aliyunPk = builder.aliyunPk;
            this.avatarUrl = builder.avatarUrl;
            this.login = builder.login;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Creator create() {
            return builder().build();
        }

        /**
         * @return aliyunPk
         */
        public String getAliyunPk() {
            return this.aliyunPk;
        }

        /**
         * @return avatarUrl
         */
        public String getAvatarUrl() {
            return this.avatarUrl;
        }

        /**
         * @return login
         */
        public String getLogin() {
            return this.login;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        public static final class Builder {
            private String aliyunPk; 
            private String avatarUrl; 
            private String login; 
            private String type; 

            /**
             * aliyunPk.
             */
            public Builder aliyunPk(String aliyunPk) {
                this.aliyunPk = aliyunPk;
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
             * login.
             */
            public Builder login(String login) {
                this.login = login;
                return this;
            }

            /**
             * type.
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            public Creator build() {
                return new Creator(this);
            } 

        } 

    }
    public static class Result extends TeaModel {
        @NameInMap("context")
        private String context;

        @NameInMap("creator")
        private Creator creator;

        @NameInMap("description")
        private String description;

        @NameInMap("id")
        private Long id;

        @NameInMap("sha")
        private String sha;

        @NameInMap("state")
        private String state;

        @NameInMap("targetUrl")
        private String targetUrl;

        private Result(Builder builder) {
            this.context = builder.context;
            this.creator = builder.creator;
            this.description = builder.description;
            this.id = builder.id;
            this.sha = builder.sha;
            this.state = builder.state;
            this.targetUrl = builder.targetUrl;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Result create() {
            return builder().build();
        }

        /**
         * @return context
         */
        public String getContext() {
            return this.context;
        }

        /**
         * @return creator
         */
        public Creator getCreator() {
            return this.creator;
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
         * @return sha
         */
        public String getSha() {
            return this.sha;
        }

        /**
         * @return state
         */
        public String getState() {
            return this.state;
        }

        /**
         * @return targetUrl
         */
        public String getTargetUrl() {
            return this.targetUrl;
        }

        public static final class Builder {
            private String context; 
            private Creator creator; 
            private String description; 
            private Long id; 
            private String sha; 
            private String state; 
            private String targetUrl; 

            /**
             * context.
             */
            public Builder context(String context) {
                this.context = context;
                return this;
            }

            /**
             * creator.
             */
            public Builder creator(Creator creator) {
                this.creator = creator;
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
             * sha.
             */
            public Builder sha(String sha) {
                this.sha = sha;
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
             * targetUrl.
             */
            public Builder targetUrl(String targetUrl) {
                this.targetUrl = targetUrl;
                return this;
            }

            public Result build() {
                return new Result(this);
            } 

        } 

    }
}
