// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.devops20210625.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetCodeupOrganizationResponseBody} extends {@link TeaModel}
 *
 * <p>GetCodeupOrganizationResponseBody</p>
 */
public class GetCodeupOrganizationResponseBody extends TeaModel {
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

    private GetCodeupOrganizationResponseBody(Builder builder) {
        this.errorCode = builder.errorCode;
        this.errorMessage = builder.errorMessage;
        this.requestId = builder.requestId;
        this.result = builder.result;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetCodeupOrganizationResponseBody create() {
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

        public GetCodeupOrganizationResponseBody build() {
            return new GetCodeupOrganizationResponseBody(this);
        } 

    } 

    public static class Result extends TeaModel {
        @NameInMap("createdAt")
        private String createdAt;

        @NameInMap("id")
        private Long id;

        @NameInMap("namespaceId")
        private Long namespaceId;

        @NameInMap("organizationId")
        private String organizationId;

        @NameInMap("path")
        private String path;

        @NameInMap("updatedAt")
        private String updatedAt;

        @NameInMap("userRole")
        private String userRole;

        private Result(Builder builder) {
            this.createdAt = builder.createdAt;
            this.id = builder.id;
            this.namespaceId = builder.namespaceId;
            this.organizationId = builder.organizationId;
            this.path = builder.path;
            this.updatedAt = builder.updatedAt;
            this.userRole = builder.userRole;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Result create() {
            return builder().build();
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
        public Long getId() {
            return this.id;
        }

        /**
         * @return namespaceId
         */
        public Long getNamespaceId() {
            return this.namespaceId;
        }

        /**
         * @return organizationId
         */
        public String getOrganizationId() {
            return this.organizationId;
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
         * @return userRole
         */
        public String getUserRole() {
            return this.userRole;
        }

        public static final class Builder {
            private String createdAt; 
            private Long id; 
            private Long namespaceId; 
            private String organizationId; 
            private String path; 
            private String updatedAt; 
            private String userRole; 

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
            public Builder id(Long id) {
                this.id = id;
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
             * organizationId.
             */
            public Builder organizationId(String organizationId) {
                this.organizationId = organizationId;
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
             * userRole.
             */
            public Builder userRole(String userRole) {
                this.userRole = userRole;
                return this;
            }

            public Result build() {
                return new Result(this);
            } 

        } 

    }
}
