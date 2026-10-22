// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.yundun_bastionhost20191209.models;

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
 * {@link AddUsersToGroupResponseBody} extends {@link TeaModel}
 *
 * <p>AddUsersToGroupResponseBody</p>
 */
public class AddUsersToGroupResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Results")
    private java.util.List<Results> results;

    private AddUsersToGroupResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.results = builder.results;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AddUsersToGroupResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return results
     */
    public java.util.List<Results> getResults() {
        return this.results;
    }

    public static final class Builder {
        private String requestId; 
        private java.util.List<Results> results; 

        private Builder() {
        } 

        private Builder(AddUsersToGroupResponseBody model) {
            this.requestId = model.requestId;
            this.results = model.results;
        } 

        /**
         * <p>The request ID. Alibaba Cloud generates a unique ID for each request. You can use the ID to troubleshoot issues.</p>
         * 
         * <strong>example:</strong>
         * <p>EC9BF0F4-8983-491A-BC8C-1B4DD94976DE</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The result information of the operation.</p>
         */
        public Builder results(java.util.List<Results> results) {
            this.results = results;
            return this;
        }

        public AddUsersToGroupResponseBody build() {
            return new AddUsersToGroupResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link AddUsersToGroupResponseBody} extends {@link TeaModel}
     *
     * <p>AddUsersToGroupResponseBody</p>
     */
    public static class Results extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Code")
        private String code;

        @com.aliyun.core.annotation.NameInMap("Message")
        private String message;

        @com.aliyun.core.annotation.NameInMap("UserGroupId")
        private String userGroupId;

        @com.aliyun.core.annotation.NameInMap("UserId")
        private String userId;

        private Results(Builder builder) {
            this.code = builder.code;
            this.message = builder.message;
            this.userGroupId = builder.userGroupId;
            this.userId = builder.userId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Results create() {
            return builder().build();
        }

        /**
         * @return code
         */
        public String getCode() {
            return this.code;
        }

        /**
         * @return message
         */
        public String getMessage() {
            return this.message;
        }

        /**
         * @return userGroupId
         */
        public String getUserGroupId() {
            return this.userGroupId;
        }

        /**
         * @return userId
         */
        public String getUserId() {
            return this.userId;
        }

        public static final class Builder {
            private String code; 
            private String message; 
            private String userGroupId; 
            private String userId; 

            private Builder() {
            } 

            private Builder(Results model) {
                this.code = model.code;
                this.message = model.message;
                this.userGroupId = model.userGroupId;
                this.userId = model.userId;
            } 

            /**
             * <p>The result of the operation. Valid values:</p>
             * <ul>
             * <li><p><strong>OK</strong>: The operation was successful.</p>
             * </li>
             * <li><p><strong>UNEXPECTED</strong>: An unknown error occurred.</p>
             * </li>
             * <li><p><strong>INVALID_ARGUMENT</strong>: The request parameters are invalid.</p>
             * <blockquote>
             * <p>Check the request parameters and call the operation again.</p>
             * </blockquote>
             * </li>
             * <li><p><strong>OBJECT_NOT_FOUND</strong>: The specified object does not exist.</p>
             * <blockquote>
             * <p>Check whether the bastion host instance ID exists, whether the host exists, and whether the host ID is correct, and then call the operation again.</p>
             * </blockquote>
             * </li>
             * <li><p><strong>OBJECT_AlREADY_EXISTS</strong>: The specified object already exists.</p>
             * </li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>OK</p>
             */
            public Builder code(String code) {
                this.code = code;
                return this;
            }

            /**
             * <p>This parameter is deprecated and can be ignored.</p>
             * 
             * <strong>example:</strong>
             * <p>None</p>
             */
            public Builder message(String message) {
                this.message = message;
                return this;
            }

            /**
             * <p>The user group ID.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder userGroupId(String userGroupId) {
                this.userGroupId = userGroupId;
                return this;
            }

            /**
             * <p>The user ID.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder userId(String userId) {
                this.userId = userId;
                return this;
            }

            public Results build() {
                return new Results(this);
            } 

        } 

    }
}
