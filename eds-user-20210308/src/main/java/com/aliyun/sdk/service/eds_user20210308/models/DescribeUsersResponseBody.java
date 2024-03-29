// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eds_user20210308.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeUsersResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeUsersResponseBody</p>
 */
public class DescribeUsersResponseBody extends TeaModel {
    @NameInMap("NextToken")
    private String nextToken;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Users")
    private java.util.List < Users> users;

    private DescribeUsersResponseBody(Builder builder) {
        this.nextToken = builder.nextToken;
        this.requestId = builder.requestId;
        this.users = builder.users;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeUsersResponseBody create() {
        return builder().build();
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
    public java.util.List < Users> getUsers() {
        return this.users;
    }

    public static final class Builder {
        private String nextToken; 
        private String requestId; 
        private java.util.List < Users> users; 

        /**
         * NextToken.
         */
        public Builder nextToken(String nextToken) {
            this.nextToken = nextToken;
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
         * Details of the convenience users.
         */
        public Builder users(java.util.List < Users> users) {
            this.users = users;
            return this;
        }

        public DescribeUsersResponseBody build() {
            return new DescribeUsersResponseBody(this);
        } 

    } 

    public static class Groups extends TeaModel {
        @NameInMap("GroupId")
        private String groupId;

        @NameInMap("GroupName")
        private String groupName;

        private Groups(Builder builder) {
            this.groupId = builder.groupId;
            this.groupName = builder.groupName;
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

        public static final class Builder {
            private String groupId; 
            private String groupName; 

            /**
             * GroupId.
             */
            public Builder groupId(String groupId) {
                this.groupId = groupId;
                return this;
            }

            /**
             * GroupName.
             */
            public Builder groupName(String groupName) {
                this.groupName = groupName;
                return this;
            }

            public Groups build() {
                return new Groups(this);
            } 

        } 

    }
    public static class Orgs extends TeaModel {
        @NameInMap("OrgId")
        private String orgId;

        @NameInMap("OrgName")
        private String orgName;

        private Orgs(Builder builder) {
            this.orgId = builder.orgId;
            this.orgName = builder.orgName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Orgs create() {
            return builder().build();
        }

        /**
         * @return orgId
         */
        public String getOrgId() {
            return this.orgId;
        }

        /**
         * @return orgName
         */
        public String getOrgName() {
            return this.orgName;
        }

        public static final class Builder {
            private String orgId; 
            private String orgName; 

            /**
             * OrgId.
             */
            public Builder orgId(String orgId) {
                this.orgId = orgId;
                return this;
            }

            /**
             * OrgName.
             */
            public Builder orgName(String orgName) {
                this.orgName = orgName;
                return this;
            }

            public Orgs build() {
                return new Orgs(this);
            } 

        } 

    }
    public static class Users extends TeaModel {
        @NameInMap("Address")
        private String address;

        @NameInMap("Avatar")
        private String avatar;

        @NameInMap("Email")
        private String email;

        @NameInMap("EndUserId")
        private String endUserId;

        @NameInMap("Groups")
        private java.util.List < Groups> groups;

        @NameInMap("Id")
        private Long id;

        @NameInMap("IsTenantManager")
        private Boolean isTenantManager;

        @NameInMap("JobNumber")
        private String jobNumber;

        @NameInMap("NickName")
        private String nickName;

        @NameInMap("OrgId")
        private String orgId;

        @NameInMap("Orgs")
        private java.util.List < Orgs> orgs;

        @NameInMap("OwnerType")
        private String ownerType;

        @NameInMap("Phone")
        private String phone;

        @NameInMap("Remark")
        private String remark;

        @NameInMap("Status")
        private Long status;

        @NameInMap("WyId")
        private String wyId;

        private Users(Builder builder) {
            this.address = builder.address;
            this.avatar = builder.avatar;
            this.email = builder.email;
            this.endUserId = builder.endUserId;
            this.groups = builder.groups;
            this.id = builder.id;
            this.isTenantManager = builder.isTenantManager;
            this.jobNumber = builder.jobNumber;
            this.nickName = builder.nickName;
            this.orgId = builder.orgId;
            this.orgs = builder.orgs;
            this.ownerType = builder.ownerType;
            this.phone = builder.phone;
            this.remark = builder.remark;
            this.status = builder.status;
            this.wyId = builder.wyId;
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
         * @return groups
         */
        public java.util.List < Groups> getGroups() {
            return this.groups;
        }

        /**
         * @return id
         */
        public Long getId() {
            return this.id;
        }

        /**
         * @return isTenantManager
         */
        public Boolean getIsTenantManager() {
            return this.isTenantManager;
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
         * @return orgId
         */
        public String getOrgId() {
            return this.orgId;
        }

        /**
         * @return orgs
         */
        public java.util.List < Orgs> getOrgs() {
            return this.orgs;
        }

        /**
         * @return ownerType
         */
        public String getOwnerType() {
            return this.ownerType;
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

        /**
         * @return status
         */
        public Long getStatus() {
            return this.status;
        }

        /**
         * @return wyId
         */
        public String getWyId() {
            return this.wyId;
        }

        public static final class Builder {
            private String address; 
            private String avatar; 
            private String email; 
            private String endUserId; 
            private java.util.List < Groups> groups; 
            private Long id; 
            private Boolean isTenantManager; 
            private String jobNumber; 
            private String nickName; 
            private String orgId; 
            private java.util.List < Orgs> orgs; 
            private String ownerType; 
            private String phone; 
            private String remark; 
            private Long status; 
            private String wyId; 

            /**
             * Address.
             */
            public Builder address(String address) {
                this.address = address;
                return this;
            }

            /**
             * Avatar.
             */
            public Builder avatar(String avatar) {
                this.avatar = avatar;
                return this;
            }

            /**
             * The email address.
             */
            public Builder email(String email) {
                this.email = email;
                return this;
            }

            /**
             * The name of the user.
             */
            public Builder endUserId(String endUserId) {
                this.endUserId = endUserId;
                return this;
            }

            /**
             * Groups.
             */
            public Builder groups(java.util.List < Groups> groups) {
                this.groups = groups;
                return this;
            }

            /**
             * The ID of the user.
             */
            public Builder id(Long id) {
                this.id = id;
                return this;
            }

            /**
             * Indicates whether the user is an administrator. If the convenience user is of the administrator-activated type, you must specify a user administrator. Notifications such as password reset on a client are sent to the email address or mobile phone of the user administrator. For more information, see [Create a convenience user](~~214472~~).
             */
            public Builder isTenantManager(Boolean isTenantManager) {
                this.isTenantManager = isTenantManager;
                return this;
            }

            /**
             * JobNumber.
             */
            public Builder jobNumber(String jobNumber) {
                this.jobNumber = jobNumber;
                return this;
            }

            /**
             * The nickname of the user.
             */
            public Builder nickName(String nickName) {
                this.nickName = nickName;
                return this;
            }

            /**
             * The ID of the organization to which the user belongs.
             */
            public Builder orgId(String orgId) {
                this.orgId = orgId;
                return this;
            }

            /**
             * Orgs.
             */
            public Builder orgs(java.util.List < Orgs> orgs) {
                this.orgs = orgs;
                return this;
            }

            /**
             * The type of the convenience account.
             * <p>
             * 
             * *   The administrator-activated type. The administrator specifies the username and the password of the convenience account. User notifications such as password reset are sent to the email address or mobile number of the administrator.
             * *   The user-activated type. The administrator specifies the username and the email address or mobile number of a user. Activation notifications are sent to the email address or mobile number of the user.
             * 
             * Valid values:
             * 
             * *   CreateFromManager
             * 
             *     <!-- -->
             * 
             *     :
             * 
             *     <!-- -->
             * 
             *     administrator-activated
             * 
             *     <!-- -->
             * 
             * *   Normal: user-activated
             * 
             *     <!-- -->
             * 
             *     <!-- -->
             * 
             *     <!-- -->
             */
            public Builder ownerType(String ownerType) {
                this.ownerType = ownerType;
                return this;
            }

            /**
             * The mobile number of the user. If you leave this parameter empty, the value of this parameter is not returned.
             */
            public Builder phone(String phone) {
                this.phone = phone;
                return this;
            }

            /**
             * The remarks on the user.
             */
            public Builder remark(String remark) {
                this.remark = remark;
                return this;
            }

            /**
             * The status of the user.
             */
            public Builder status(Long status) {
                this.status = status;
                return this;
            }

            /**
             * The user ID that is globally unique.
             */
            public Builder wyId(String wyId) {
                this.wyId = wyId;
                return this;
            }

            public Users build() {
                return new Users(this);
            } 

        } 

    }
}
