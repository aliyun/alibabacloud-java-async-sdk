// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.yundun_bastionhost20191209.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link AddUsersToGroupResponseBody} extends {@link TeaModel}
 *
 * <p>AddUsersToGroupResponseBody</p>
 */
public class AddUsersToGroupResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Results")
    private java.util.List < Results> results;

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

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return results
     */
    public java.util.List < Results> getResults() {
        return this.results;
    }

    public static final class Builder {
        private String requestId; 
        private java.util.List < Results> results; 

        /**
         * All Alibaba Cloud API operations must include common request parameters. For more information about common request parameters, see [Common parameters](~~315526~~).
         * <p>
         * 
         * For more information about sample requests, see the "Examples" section of this topic.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Adds one or more users to a user group.
         */
        public Builder results(java.util.List < Results> results) {
            this.results = results;
            return this;
        }

        public AddUsersToGroupResponseBody build() {
            return new AddUsersToGroupResponseBody(this);
        } 

    } 

    public static class Results extends TeaModel {
        @NameInMap("Code")
        private String code;

        @NameInMap("Message")
        private String message;

        @NameInMap("UserGroupId")
        private String userGroupId;

        @NameInMap("UserId")
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

            /**
             * AddUsersToGroup
             */
            public Builder code(String code) {
                this.code = code;
                return this;
            }

            /**
             * WB01014029
             */
            public Builder message(String message) {
                this.message = message;
                return this;
            }

            /**
             * AddUsersToGroup
             */
            public Builder userGroupId(String userGroupId) {
                this.userGroupId = userGroupId;
                return this;
            }

            /**
             * UserId.
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
