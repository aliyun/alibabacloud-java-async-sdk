// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eds_user20210308.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeUsersResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeUsersResponseBody</p>
 */
public class DescribeUsersResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("NextToken")
    private String nextToken;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Users")
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
         * The token that determines the start point of the next query. If this parameter is left empty, all results are returned.
         */
        public Builder nextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * The information about the convenience users.
         */
        public Builder users(java.util.List < Users> users) {
            this.users = users;
            return this;
        }

        public DescribeUsersResponseBody build() {
            return new DescribeUsersResponseBody(this);
        } 

    } 

    public static class Extras extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AssignedResourceCount")
        private java.util.Map < String, ? > assignedResourceCount;

        private Extras(Builder builder) {
            this.assignedResourceCount = builder.assignedResourceCount;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Extras create() {
            return builder().build();
        }

        /**
         * @return assignedResourceCount
         */
        public java.util.Map < String, ? > getAssignedResourceCount() {
            return this.assignedResourceCount;
        }

        public static final class Builder {
            private java.util.Map < String, ? > assignedResourceCount; 

            /**
             * AssignedResourceCount.
             */
            public Builder assignedResourceCount(java.util.Map < String, ? > assignedResourceCount) {
                this.assignedResourceCount = assignedResourceCount;
                return this;
            }

            public Extras build() {
                return new Extras(this);
            } 

        } 

    }
    public static class Groups extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("GroupId")
        private String groupId;

        @com.aliyun.core.annotation.NameInMap("GroupName")
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
             * The ID of the user group.
             */
            public Builder groupId(String groupId) {
                this.groupId = groupId;
                return this;
            }

            /**
             * The name of the user group.
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
        @com.aliyun.core.annotation.NameInMap("OrgId")
        private String orgId;

        @com.aliyun.core.annotation.NameInMap("OrgName")
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
             * The organization ID.
             */
            public Builder orgId(String orgId) {
                this.orgId = orgId;
                return this;
            }

            /**
             * The organization name.
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
        @com.aliyun.core.annotation.NameInMap("Address")
        private String address;

        @com.aliyun.core.annotation.NameInMap("Avatar")
        private String avatar;

        @com.aliyun.core.annotation.NameInMap("Email")
        private String email;

        @com.aliyun.core.annotation.NameInMap("EndUserId")
        private String endUserId;

        @com.aliyun.core.annotation.NameInMap("Extras")
        private Extras extras;

        @com.aliyun.core.annotation.NameInMap("Groups")
        private java.util.List < Groups> groups;

        @com.aliyun.core.annotation.NameInMap("Id")
        private Long id;

        @com.aliyun.core.annotation.NameInMap("IsTenantManager")
        private Boolean isTenantManager;

        @com.aliyun.core.annotation.NameInMap("JobNumber")
        private String jobNumber;

        @com.aliyun.core.annotation.NameInMap("NickName")
        private String nickName;

        @com.aliyun.core.annotation.NameInMap("OrgId")
        private String orgId;

        @com.aliyun.core.annotation.NameInMap("Orgs")
        private java.util.List < Orgs> orgs;

        @com.aliyun.core.annotation.NameInMap("OwnerType")
        private String ownerType;

        @com.aliyun.core.annotation.NameInMap("Phone")
        private String phone;

        @com.aliyun.core.annotation.NameInMap("RealNickName")
        private String realNickName;

        @com.aliyun.core.annotation.NameInMap("Remark")
        private String remark;

        @com.aliyun.core.annotation.NameInMap("Status")
        private Long status;

        @com.aliyun.core.annotation.NameInMap("WyId")
        private String wyId;

        private Users(Builder builder) {
            this.address = builder.address;
            this.avatar = builder.avatar;
            this.email = builder.email;
            this.endUserId = builder.endUserId;
            this.extras = builder.extras;
            this.groups = builder.groups;
            this.id = builder.id;
            this.isTenantManager = builder.isTenantManager;
            this.jobNumber = builder.jobNumber;
            this.nickName = builder.nickName;
            this.orgId = builder.orgId;
            this.orgs = builder.orgs;
            this.ownerType = builder.ownerType;
            this.phone = builder.phone;
            this.realNickName = builder.realNickName;
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
         * @return extras
         */
        public Extras getExtras() {
            return this.extras;
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
         * @return realNickName
         */
        public String getRealNickName() {
            return this.realNickName;
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
            private Extras extras; 
            private java.util.List < Groups> groups; 
            private Long id; 
            private Boolean isTenantManager; 
            private String jobNumber; 
            private String nickName; 
            private String orgId; 
            private java.util.List < Orgs> orgs; 
            private String ownerType; 
            private String phone; 
            private String realNickName; 
            private String remark; 
            private Long status; 
            private String wyId; 

            /**
             * The work address of the convenience user.
             */
            public Builder address(String address) {
                this.address = address;
                return this;
            }

            /**
             * The profile picture of the convenience user.
             */
            public Builder avatar(String avatar) {
                this.avatar = avatar;
                return this;
            }

            /**
             * The email address of the convenience user.
             */
            public Builder email(String email) {
                this.email = email;
                return this;
            }

            /**
             * The username of the convenience user.
             */
            public Builder endUserId(String endUserId) {
                this.endUserId = endUserId;
                return this;
            }

            /**
             * Extras.
             */
            public Builder extras(Extras extras) {
                this.extras = extras;
                return this;
            }

            /**
             * The user groups to which the convenience user belongs.
             */
            public Builder groups(java.util.List < Groups> groups) {
                this.groups = groups;
                return this;
            }

            /**
             * The ID of the convenience user.
             */
            public Builder id(Long id) {
                this.id = id;
                return this;
            }

            /**
             * Indicates whether the convenience user is an administrator. If the convenience user is of the administrator-activated type, you must specify a user administrator. Notifications such as password reset on a client are sent to the email address or mobile number of the user administrator. For more information, see [Create a convenience user](~~214472~~).
             */
            public Builder isTenantManager(Boolean isTenantManager) {
                this.isTenantManager = isTenantManager;
                return this;
            }

            /**
             * The employee number of the convenience user.
             */
            public Builder jobNumber(String jobNumber) {
                this.jobNumber = jobNumber;
                return this;
            }

            /**
             * The nickname of the convenience user.
             */
            public Builder nickName(String nickName) {
                this.nickName = nickName;
                return this;
            }

            /**
             * The ID of the organization to which the convenience user belongs.
             * <p>
             * 
             * >  This parameter will be deprecated in the future.
             */
            public Builder orgId(String orgId) {
                this.orgId = orgId;
                return this;
            }

            /**
             * The organizations to which the convenience user belongs.
             */
            public Builder orgs(java.util.List < Orgs> orgs) {
                this.orgs = orgs;
                return this;
            }

            /**
             * The type of the convenience account.
             * <p>
             * 
             * *   Administrator-activated type: The administrator specifies the username and password of the convenience account. User notifications such as password reset notifications are sent to the email address or mobile number of the administrator.
             * *   User-activated type: The administrator specifies the username and the email address or mobile number of a convenience user. Notifications such as activation notifications that contain the default password are sent to the email address or mobile number of the convenience user.
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
             * *   Normal
             * 
             *     <!-- -->
             * 
             *     :
             * 
             *     <!-- -->
             * 
             *     user-activated
             * 
             *     <!-- -->
             */
            public Builder ownerType(String ownerType) {
                this.ownerType = ownerType;
                return this;
            }

            /**
             * The mobile number of the convenience user. If you leave this parameter empty, the value of this parameter is not returned.
             */
            public Builder phone(String phone) {
                this.phone = phone;
                return this;
            }

            /**
             * RealNickName.
             */
            public Builder realNickName(String realNickName) {
                this.realNickName = realNickName;
                return this;
            }

            /**
             * The remarks on the convenience user.
             */
            public Builder remark(String remark) {
                this.remark = remark;
                return this;
            }

            /**
             * The status of the convenience user.
             * <p>
             * 
             * Valid values:
             * 
             * *   0: The convenience user is normal.
             * 
             *     <!-- -->
             * 
             *     <!-- -->
             * 
             *     <!-- -->
             * 
             * *   9: The convenience user is locked.
             * 
             *     <!-- -->
             * 
             *     <!-- -->
             * 
             *     <!-- -->
             */
            public Builder status(Long status) {
                this.status = status;
                return this;
            }

            /**
             * The globally unique ID of the convenience user.
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
