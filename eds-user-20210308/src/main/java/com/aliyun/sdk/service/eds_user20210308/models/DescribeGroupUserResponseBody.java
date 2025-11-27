// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eds_user20210308.models;

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
 * {@link DescribeGroupUserResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeGroupUserResponseBody</p>
 */
public class DescribeGroupUserResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Groups")
    private java.util.List<Groups> groups;

    @com.aliyun.core.annotation.NameInMap("NextToken")
    private String nextToken;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Users")
    private java.util.List<Users> users;

    private DescribeGroupUserResponseBody(Builder builder) {
        this.groups = builder.groups;
        this.nextToken = builder.nextToken;
        this.requestId = builder.requestId;
        this.users = builder.users;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeGroupUserResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return groups
     */
    public java.util.List<Groups> getGroups() {
        return this.groups;
    }

    /**
     * @return nextToken
     */
    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return users
     */
    public java.util.List<Users> getUsers() {
        return this.users;
    }

    public static final class Builder {
        private java.util.List<Groups> groups; 
        private String nextToken; 
        private String requestId; 
        private java.util.List<Users> users; 

        private Builder() {
        } 

        private Builder(DescribeGroupUserResponseBody model) {
            this.groups = model.groups;
            this.nextToken = model.nextToken;
            this.requestId = model.requestId;
            this.users = model.users;
        } 

        /**
         * <blockquote>
         * <p> This field is deprecated.</p>
         * </blockquote>
         */
        public Builder groups(java.util.List<Groups> groups) {
            this.groups = groups;
            return this;
        }

        /**
         * <p>The token for the next query. If NextToken is empty, all results have been queried.</p>
         * 
         * <strong>example:</strong>
         * <p>AAAAAV3MpHK****</p>
         */
        public Builder nextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>AA8D67CB-345D-5CDA-986E-FFAC7D0****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The members.</p>
         */
        public Builder users(java.util.List<Users> users) {
            this.users = users;
            return this;
        }

        public DescribeGroupUserResponseBody build() {
            return new DescribeGroupUserResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeGroupUserResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeGroupUserResponseBody</p>
     */
    public static class Groups extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("GroupId")
        private String groupId;

        @com.aliyun.core.annotation.NameInMap("GroupName")
        private String groupName;

        @com.aliyun.core.annotation.NameInMap("UserCount")
        private String userCount;

        private Groups(Builder builder) {
            this.groupId = builder.groupId;
            this.groupName = builder.groupName;
            this.userCount = builder.userCount;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Groups create() {
            return builder().build();
        }

        /**
         * @return groupId
         */
        public String getGroupId() {
            return this.groupId;
        }

        /**
         * @return groupName
         */
        public String getGroupName() {
            return this.groupName;
        }

        /**
         * @return userCount
         */
        public String getUserCount() {
            return this.userCount;
        }

        public static final class Builder {
            private String groupId; 
            private String groupName; 
            private String userCount; 

            private Builder() {
            } 

            private Builder(Groups model) {
                this.groupId = model.groupId;
                this.groupName = model.groupName;
                this.userCount = model.userCount;
            } 

            /**
             * <p>The user group ID.</p>
             * 
             * <strong>example:</strong>
             * <p>ug-91mvbosdjsdfh****</p>
             */
            public Builder groupId(String groupId) {
                this.groupId = groupId;
                return this;
            }

            /**
             * <p>The name of the user group.</p>
             */
            public Builder groupName(String groupName) {
                this.groupName = groupName;
                return this;
            }

            /**
             * <p>The number of members in the user group.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder userCount(String userCount) {
                this.userCount = userCount;
                return this;
            }

            public Groups build() {
                return new Groups(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeGroupUserResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeGroupUserResponseBody</p>
     */
    public static class Users extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Address")
        private String address;

        @com.aliyun.core.annotation.NameInMap("Avatar")
        private String avatar;

        @com.aliyun.core.annotation.NameInMap("Email")
        private String email;

        @com.aliyun.core.annotation.NameInMap("EndUserId")
        private String endUserId;

        @com.aliyun.core.annotation.NameInMap("GmtCreated")
        private String gmtCreated;

        @com.aliyun.core.annotation.NameInMap("GmtJoinGroup")
        private String gmtJoinGroup;

        @com.aliyun.core.annotation.NameInMap("JobNumber")
        private String jobNumber;

        @com.aliyun.core.annotation.NameInMap("NickName")
        private String nickName;

        @com.aliyun.core.annotation.NameInMap("Phone")
        private String phone;

        @com.aliyun.core.annotation.NameInMap("Remark")
        private String remark;

        private Users(Builder builder) {
            this.address = builder.address;
            this.avatar = builder.avatar;
            this.email = builder.email;
            this.endUserId = builder.endUserId;
            this.gmtCreated = builder.gmtCreated;
            this.gmtJoinGroup = builder.gmtJoinGroup;
            this.jobNumber = builder.jobNumber;
            this.nickName = builder.nickName;
            this.phone = builder.phone;
            this.remark = builder.remark;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Users create() {
            return builder().build();
        }

        /**
         * @return address
         */
        public String getAddress() {
            return this.address;
        }

        /**
         * @return avatar
         */
        public String getAvatar() {
            return this.avatar;
        }

        /**
         * @return email
         */
        public String getEmail() {
            return this.email;
        }

        /**
         * @return endUserId
         */
        public String getEndUserId() {
            return this.endUserId;
        }

        /**
         * @return gmtCreated
         */
        public String getGmtCreated() {
            return this.gmtCreated;
        }

        /**
         * @return gmtJoinGroup
         */
        public String getGmtJoinGroup() {
            return this.gmtJoinGroup;
        }

        /**
         * @return jobNumber
         */
        public String getJobNumber() {
            return this.jobNumber;
        }

        /**
         * @return nickName
         */
        public String getNickName() {
            return this.nickName;
        }

        /**
         * @return phone
         */
        public String getPhone() {
            return this.phone;
        }

        /**
         * @return remark
         */
        public String getRemark() {
            return this.remark;
        }

        public static final class Builder {
            private String address; 
            private String avatar; 
            private String email; 
            private String endUserId; 
            private String gmtCreated; 
            private String gmtJoinGroup; 
            private String jobNumber; 
            private String nickName; 
            private String phone; 
            private String remark; 

            private Builder() {
            } 

            private Builder(Users model) {
                this.address = model.address;
                this.avatar = model.avatar;
                this.email = model.email;
                this.endUserId = model.endUserId;
                this.gmtCreated = model.gmtCreated;
                this.gmtJoinGroup = model.gmtJoinGroup;
                this.jobNumber = model.jobNumber;
                this.nickName = model.nickName;
                this.phone = model.phone;
                this.remark = model.remark;
            } 

            /**
             * <blockquote>
             * <p> This field is deprecated.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>xx-xx-xx</p>
             */
            public Builder address(String address) {
                this.address = address;
                return this;
            }

            /**
             * <blockquote>
             * <p> This field is deprecated.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p><a href="https://avatar.****.com">https://avatar.****.com</a></p>
             */
            public Builder avatar(String avatar) {
                this.avatar = avatar;
                return this;
            }

            /**
             * <p>The email address.</p>
             * 
             * <strong>example:</strong>
             * <p>alex****@aliyun.com</p>
             */
            public Builder email(String email) {
                this.email = email;
                return this;
            }

            /**
             * <p>The user name.</p>
             * 
             * <strong>example:</strong>
             * <p>alex****</p>
             */
            public Builder endUserId(String endUserId) {
                this.endUserId = endUserId;
                return this;
            }

            /**
             * <p>The time when the user was created.</p>
             * 
             * <strong>example:</strong>
             * <p>2024-08-26T02:59:22.000+00:00</p>
             */
            public Builder gmtCreated(String gmtCreated) {
                this.gmtCreated = gmtCreated;
                return this;
            }

            /**
             * <p>The time when the user was added to the user group.</p>
             * 
             * <strong>example:</strong>
             * <p>2024-08-26T02:59:22.000+00:00</p>
             */
            public Builder gmtJoinGroup(String gmtJoinGroup) {
                this.gmtJoinGroup = gmtJoinGroup;
                return this;
            }

            /**
             * <blockquote>
             * <p> This field is deprecated.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>123</p>
             */
            public Builder jobNumber(String jobNumber) {
                this.jobNumber = jobNumber;
                return this;
            }

            /**
             * <p>The display name.</p>
             * 
             * <strong>example:</strong>
             * <p>alex</p>
             */
            public Builder nickName(String nickName) {
                this.nickName = nickName;
                return this;
            }

            /**
             * <p>The mobile number.</p>
             * 
             * <strong>example:</strong>
             * <p>188888****</p>
             */
            public Builder phone(String phone) {
                this.phone = phone;
                return this;
            }

            /**
             * <p>The remarks on the user.</p>
             * 
             * <strong>example:</strong>
             * <p>remark</p>
             */
            public Builder remark(String remark) {
                this.remark = remark;
                return this;
            }

            public Users build() {
                return new Users(this);
            } 

        } 

    }
}
