// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.modelstudio20260210.models;

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
 * {@link DeleteWorkspaceResponseBody} extends {@link TeaModel}
 *
 * <p>DeleteWorkspaceResponseBody</p>
 */
public class DeleteWorkspaceResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("failReasons")
    private java.util.List<FailReasons> failReasons;

    @com.aliyun.core.annotation.NameInMap("httpStatusCode")
    private Integer httpStatusCode;

    @com.aliyun.core.annotation.NameInMap("isDeleted")
    private Boolean isDeleted;

    @com.aliyun.core.annotation.NameInMap("message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("success")
    private Boolean success;

    private DeleteWorkspaceResponseBody(Builder builder) {
        this.code = builder.code;
        this.failReasons = builder.failReasons;
        this.httpStatusCode = builder.httpStatusCode;
        this.isDeleted = builder.isDeleted;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteWorkspaceResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return failReasons
     */
    public java.util.List<FailReasons> getFailReasons() {
        return this.failReasons;
    }

    /**
     * @return httpStatusCode
     */
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    /**
     * @return isDeleted
     */
    public Boolean getIsDeleted() {
        return this.isDeleted;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private String code; 
        private java.util.List<FailReasons> failReasons; 
        private Integer httpStatusCode; 
        private Boolean isDeleted; 
        private String message; 
        private String requestId; 
        private Boolean success; 

        private Builder() {
        } 

        private Builder(DeleteWorkspaceResponseBody model) {
            this.code = model.code;
            this.failReasons = model.failReasons;
            this.httpStatusCode = model.httpStatusCode;
            this.isDeleted = model.isDeleted;
            this.message = model.message;
            this.requestId = model.requestId;
            this.success = model.success;
        } 

        /**
         * code.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * failReasons.
         */
        public Builder failReasons(java.util.List<FailReasons> failReasons) {
            this.failReasons = failReasons;
            return this;
        }

        /**
         * httpStatusCode.
         */
        public Builder httpStatusCode(Integer httpStatusCode) {
            this.httpStatusCode = httpStatusCode;
            return this;
        }

        /**
         * isDeleted.
         */
        public Builder isDeleted(Boolean isDeleted) {
            this.isDeleted = isDeleted;
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
         * <p>Id of the request</p>
         * 
         * <strong>example:</strong>
         * <p>DFD55E7B-0615-5343-BDA0-FBEE86F29935</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * success.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public DeleteWorkspaceResponseBody build() {
            return new DeleteWorkspaceResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DeleteWorkspaceResponseBody} extends {@link TeaModel}
     *
     * <p>DeleteWorkspaceResponseBody</p>
     */
    public static class FailReasons extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("reason")
        private String reason;

        @com.aliyun.core.annotation.NameInMap("resourceType")
        private String resourceType;

        private FailReasons(Builder builder) {
            this.reason = builder.reason;
            this.resourceType = builder.resourceType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static FailReasons create() {
            return builder().build();
        }

        /**
         * @return reason
         */
        public String getReason() {
            return this.reason;
        }

        /**
         * @return resourceType
         */
        public String getResourceType() {
            return this.resourceType;
        }

        public static final class Builder {
            private String reason; 
            private String resourceType; 

            private Builder() {
            } 

            private Builder(FailReasons model) {
                this.reason = model.reason;
                this.resourceType = model.resourceType;
            } 

            /**
             * reason.
             */
            public Builder reason(String reason) {
                this.reason = reason;
                return this;
            }

            /**
             * resourceType.
             */
            public Builder resourceType(String resourceType) {
                this.resourceType = resourceType;
                return this;
            }

            public FailReasons build() {
                return new FailReasons(this);
            } 

        } 

    }
}
