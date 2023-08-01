// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.devops20210625.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteRepositoryMemberResponseBody} extends {@link TeaModel}
 *
 * <p>DeleteRepositoryMemberResponseBody</p>
 */
public class DeleteRepositoryMemberResponseBody extends TeaModel {
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

    private DeleteRepositoryMemberResponseBody(Builder builder) {
        this.errorCode = builder.errorCode;
        this.errorMessage = builder.errorMessage;
        this.requestId = builder.requestId;
        this.result = builder.result;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteRepositoryMemberResponseBody create() {
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

        public DeleteRepositoryMemberResponseBody build() {
            return new DeleteRepositoryMemberResponseBody(this);
        } 

    } 

    public static class Result extends TeaModel {
        @NameInMap("accessLevel")
        private Integer accessLevel;

        @NameInMap("createAt")
        private String createAt;

        @NameInMap("id")
        private Long id;

        @NameInMap("sourceId")
        private Long sourceId;

        @NameInMap("sourceType")
        private String sourceType;

        @NameInMap("updateAt")
        private String updateAt;

        @NameInMap("userId")
        private Long userId;

        private Result(Builder builder) {
            this.accessLevel = builder.accessLevel;
            this.createAt = builder.createAt;
            this.id = builder.id;
            this.sourceId = builder.sourceId;
            this.sourceType = builder.sourceType;
            this.updateAt = builder.updateAt;
            this.userId = builder.userId;
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
         * @return createAt
         */
        public String getCreateAt() {
            return this.createAt;
        }

        /**
         * @return id
         */
        public Long getId() {
            return this.id;
        }

        /**
         * @return sourceId
         */
        public Long getSourceId() {
            return this.sourceId;
        }

        /**
         * @return sourceType
         */
        public String getSourceType() {
            return this.sourceType;
        }

        /**
         * @return updateAt
         */
        public String getUpdateAt() {
            return this.updateAt;
        }

        /**
         * @return userId
         */
        public Long getUserId() {
            return this.userId;
        }

        public static final class Builder {
            private Integer accessLevel; 
            private String createAt; 
            private Long id; 
            private Long sourceId; 
            private String sourceType; 
            private String updateAt; 
            private Long userId; 

            /**
             * accessLevel.
             */
            public Builder accessLevel(Integer accessLevel) {
                this.accessLevel = accessLevel;
                return this;
            }

            /**
             * createAt.
             */
            public Builder createAt(String createAt) {
                this.createAt = createAt;
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
             * sourceId.
             */
            public Builder sourceId(Long sourceId) {
                this.sourceId = sourceId;
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
             * updateAt.
             */
            public Builder updateAt(String updateAt) {
                this.updateAt = updateAt;
                return this;
            }

            /**
             * userId.
             */
            public Builder userId(Long userId) {
                this.userId = userId;
                return this;
            }

            public Result build() {
                return new Result(this);
            } 

        } 

    }
}
