// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sgw20180511.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeGatewaySMBUsersResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeGatewaySMBUsersResponseBody</p>
 */
public class DescribeGatewaySMBUsersResponseBody extends TeaModel {
    @NameInMap("ActiveDirectory")
    private Boolean activeDirectory;

    @NameInMap("Code")
    private String code;

    @NameInMap("Message")
    private String message;

    @NameInMap("PageNumber")
    private Integer pageNumber;

    @NameInMap("PageSize")
    private Integer pageSize;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Success")
    private Boolean success;

    @NameInMap("TotalCount")
    private Integer totalCount;

    @NameInMap("Users")
    private Users users;

    private DescribeGatewaySMBUsersResponseBody(Builder builder) {
        this.activeDirectory = builder.activeDirectory;
        this.code = builder.code;
        this.message = builder.message;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.success = builder.success;
        this.totalCount = builder.totalCount;
        this.users = builder.users;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeGatewaySMBUsersResponseBody create() {
        return builder().build();
    }

    /**
     * @return activeDirectory
     */
    public Boolean getActiveDirectory() {
        return this.activeDirectory;
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
     * @return pageNumber
     */
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
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

    /**
     * @return totalCount
     */
    public Integer getTotalCount() {
        return this.totalCount;
    }

    /**
     * @return users
     */
    public Users getUsers() {
        return this.users;
    }

    public static final class Builder {
        private Boolean activeDirectory; 
        private String code; 
        private String message; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String requestId; 
        private Boolean success; 
        private Integer totalCount; 
        private Users users; 

        /**
         * ActiveDirectory.
         */
        public Builder activeDirectory(Boolean activeDirectory) {
            this.activeDirectory = activeDirectory;
            return this;
        }

        /**
         * Code.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * Message.
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * PageNumber.
         */
        public Builder pageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * PageSize.
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Success.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        /**
         * TotalCount.
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        /**
         * Users.
         */
        public Builder users(Users users) {
            this.users = users;
            return this;
        }

        public DescribeGatewaySMBUsersResponseBody build() {
            return new DescribeGatewaySMBUsersResponseBody(this);
        } 

    } 

    public static class User extends TeaModel {
        @NameInMap("Username")
        private String username;

        private User(Builder builder) {
            this.username = builder.username;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static User create() {
            return builder().build();
        }

        /**
         * @return username
         */
        public String getUsername() {
            return this.username;
        }

        public static final class Builder {
            private String username; 

            /**
             * Username.
             */
            public Builder username(String username) {
                this.username = username;
                return this;
            }

            public User build() {
                return new User(this);
            } 

        } 

    }
    public static class Users extends TeaModel {
        @NameInMap("User")
        private java.util.List < User> user;

        private Users(Builder builder) {
            this.user = builder.user;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Users create() {
            return builder().build();
        }

        /**
         * @return user
         */
        public java.util.List < User> getUser() {
            return this.user;
        }

        public static final class Builder {
            private java.util.List < User> user; 

            /**
             * User.
             */
            public Builder user(java.util.List < User> user) {
                this.user = user;
                return this;
            }

            public Users build() {
                return new Users(this);
            } 

        } 

    }
}
