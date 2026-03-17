// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.smartag20180313.models;

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
 * {@link DescribeSmartAccessGatewayClientUsersResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeSmartAccessGatewayClientUsersResponseBody</p>
 */
public class DescribeSmartAccessGatewayClientUsersResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Integer pageNumber;

    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Integer totalCount;

    @com.aliyun.core.annotation.NameInMap("Users")
    private Users users;

    private DescribeSmartAccessGatewayClientUsersResponseBody(Builder builder) {
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
        this.users = builder.users;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeSmartAccessGatewayClientUsersResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
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
        private Integer pageNumber; 
        private Integer pageSize; 
        private String requestId; 
        private Integer totalCount; 
        private Users users; 

        private Builder() {
        } 

        private Builder(DescribeSmartAccessGatewayClientUsersResponseBody model) {
            this.pageNumber = model.pageNumber;
            this.pageSize = model.pageSize;
            this.requestId = model.requestId;
            this.totalCount = model.totalCount;
            this.users = model.users;
        } 

        /**
         * <p>The number of the returned page.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder pageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * <p>The number of entries returned per page.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>62F4CF10-F909-487E-8E95-BC35457C5F50</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The number of entries returned.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        /**
         * <p>The information about the client account.</p>
         */
        public Builder users(Users users) {
            this.users = users;
            return this;
        }

        public DescribeSmartAccessGatewayClientUsersResponseBody build() {
            return new DescribeSmartAccessGatewayClientUsersResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeSmartAccessGatewayClientUsersResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeSmartAccessGatewayClientUsersResponseBody</p>
     */
    public static class User extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AccelerateBandwidth")
        private Long accelerateBandwidth;

        @com.aliyun.core.annotation.NameInMap("Bandwidth")
        private Integer bandwidth;

        @com.aliyun.core.annotation.NameInMap("ClientIp")
        private String clientIp;

        @com.aliyun.core.annotation.NameInMap("IsStaticIp")
        private Long isStaticIp;

        @com.aliyun.core.annotation.NameInMap("State")
        private Integer state;

        @com.aliyun.core.annotation.NameInMap("UserMail")
        private String userMail;

        @com.aliyun.core.annotation.NameInMap("UserName")
        private String userName;

        private User(Builder builder) {
            this.accelerateBandwidth = builder.accelerateBandwidth;
            this.bandwidth = builder.bandwidth;
            this.clientIp = builder.clientIp;
            this.isStaticIp = builder.isStaticIp;
            this.state = builder.state;
            this.userMail = builder.userMail;
            this.userName = builder.userName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static User create() {
            return builder().build();
        }

        /**
         * @return accelerateBandwidth
         */
        public Long getAccelerateBandwidth() {
            return this.accelerateBandwidth;
        }

        /**
         * @return bandwidth
         */
        public Integer getBandwidth() {
            return this.bandwidth;
        }

        /**
         * @return clientIp
         */
        public String getClientIp() {
            return this.clientIp;
        }

        /**
         * @return isStaticIp
         */
        public Long getIsStaticIp() {
            return this.isStaticIp;
        }

        /**
         * @return state
         */
        public Integer getState() {
            return this.state;
        }

        /**
         * @return userMail
         */
        public String getUserMail() {
            return this.userMail;
        }

        /**
         * @return userName
         */
        public String getUserName() {
            return this.userName;
        }

        public static final class Builder {
            private Long accelerateBandwidth; 
            private Integer bandwidth; 
            private String clientIp; 
            private Long isStaticIp; 
            private Integer state; 
            private String userMail; 
            private String userName; 

            private Builder() {
            } 

            private Builder(User model) {
                this.accelerateBandwidth = model.accelerateBandwidth;
                this.bandwidth = model.bandwidth;
                this.clientIp = model.clientIp;
                this.isStaticIp = model.isStaticIp;
                this.state = model.state;
                this.userMail = model.userMail;
                this.userName = model.userName;
            } 

            /**
             * <p>The maximum application acceleration bandwidth allocated to the client account. Unit: Kbit/s.</p>
             * 
             * <strong>example:</strong>
             * <p>1000</p>
             */
            public Builder accelerateBandwidth(Long accelerateBandwidth) {
                this.accelerateBandwidth = accelerateBandwidth;
                return this;
            }

            /**
             * <p>The maximum bandwidth allocated to the client account. Unit: Kbit/s.</p>
             * 
             * <strong>example:</strong>
             * <p>2000</p>
             */
            public Builder bandwidth(Integer bandwidth) {
                this.bandwidth = bandwidth;
                return this;
            }

            /**
             * <p>The IP address assigned by the system to the client.</p>
             * 
             * <strong>example:</strong>
             * <p>10.10.10.1</p>
             */
            public Builder clientIp(String clientIp) {
                this.clientIp = clientIp;
                return this;
            }

            /**
             * <p>Indicates whether the client IP address is a static IP address.</p>
             * <ul>
             * <li><strong>1</strong>: yes</li>
             * <li><strong>0</strong>: no</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder isStaticIp(Long isStaticIp) {
                this.isStaticIp = isStaticIp;
                return this;
            }

            /**
             * <p>Indicates whether the client is enabled. Valid values:</p>
             * <ul>
             * <li><strong>0</strong>: enabled</li>
             * <li><strong>1</strong>: disabled</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder state(Integer state) {
                this.state = state;
                return this;
            }

            /**
             * <p>The email address of the client account.</p>
             * 
             * <strong>example:</strong>
             * <p><a href="mailto:username@example.com">username@example.com</a></p>
             */
            public Builder userMail(String userMail) {
                this.userMail = userMail;
                return this;
            }

            /**
             * <p>The username of the client account.</p>
             * 
             * <strong>example:</strong>
             * <p>username</p>
             */
            public Builder userName(String userName) {
                this.userName = userName;
                return this;
            }

            public User build() {
                return new User(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeSmartAccessGatewayClientUsersResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeSmartAccessGatewayClientUsersResponseBody</p>
     */
    public static class Users extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("User")
        private java.util.List<User> user;

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
        public java.util.List<User> getUser() {
            return this.user;
        }

        public static final class Builder {
            private java.util.List<User> user; 

            private Builder() {
            } 

            private Builder(Users model) {
                this.user = model.user;
            } 

            /**
             * User.
             */
            public Builder user(java.util.List<User> user) {
                this.user = user;
                return this;
            }

            public Users build() {
                return new Users(this);
            } 

        } 

    }
}
