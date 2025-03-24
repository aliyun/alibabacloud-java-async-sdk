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
    private java.util.List<Users> users;

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
    public java.util.List<Users> getUsers() {
        return this.users;
    }

    public static final class Builder {
        private String nextToken; 
        private String requestId; 
        private java.util.List<Users> users; 

        /**
         * <p>The token that determines the start point of the next query. If this parameter is left empty, all results are returned.</p>
         * 
         * <strong>example:</strong>
         * <p>caeba0bbb2be03f84eb48b699f0a4883</p>
         */
        public Builder nextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>1CBAFFAB-B697-4049-A9B1-67E1FC5F****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The information about the convenience users.</p>
         */
        public Builder users(java.util.List<Users> users) {
            this.users = users;
            return this;
        }

        public DescribeUsersResponseBody build() {
            return new DescribeUsersResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeUsersResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeUsersResponseBody</p>
     */
    public static class Extras extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AssignedResourceCount")
        private java.util.Map<String, ?> assignedResourceCount;

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
        public java.util.Map<String, ?> getAssignedResourceCount() {
            return this.assignedResourceCount;
        }

        public static final class Builder {
            private java.util.Map<String, ?> assignedResourceCount; 

            /**
             * AssignedResourceCount.
             */
            public Builder assignedResourceCount(java.util.Map<String, ?> assignedResourceCount) {
                this.assignedResourceCount = assignedResourceCount;
                return this;
            }

            public Extras build() {
                return new Extras(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeUsersResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeUsersResponseBody</p>
     */
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
             * <p>The ID of the user group.</p>
             * 
             * <strong>example:</strong>
             * <p>ug-12341234****</p>
             */
            public Builder groupId(String groupId) {
                this.groupId = groupId;
                return this;
            }

            /**
             * <p>The name of the user group.</p>
             * 
             * <strong>example:</strong>
             * <p>User Group 1</p>
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
    /**
     * 
     * {@link DescribeUsersResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeUsersResponseBody</p>
     */
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
             * <p>The organization ID.</p>
             * 
             * <strong>example:</strong>
             * <p>org-4mdgc1cocc59z****</p>
             */
            public Builder orgId(String orgId) {
                this.orgId = orgId;
                return this;
            }

            /**
             * <p>The organization name.</p>
             * 
             * <strong>example:</strong>
             * <p>Organization 1</p>
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
    /**
     * 
     * {@link DescribeUsersResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeUsersResponseBody</p>
     */
    public static class Properties extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Key")
        private String key;

        @com.aliyun.core.annotation.NameInMap("Value")
        private String value;

        private Properties(Builder builder) {
            this.key = builder.key;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Properties create() {
            return builder().build();
        }

        /**
         * @return key
         */
        public String getKey() {
            return this.key;
        }

        /**
         * @return value
         */
        public String getValue() {
            return this.value;
        }

        public static final class Builder {
            private String key; 
            private String value; 

            /**
             * Key.
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * Value.
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public Properties build() {
                return new Properties(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeUsersResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeUsersResponseBody</p>
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

        @com.aliyun.core.annotation.NameInMap("ExternalName")
        private String externalName;

        @com.aliyun.core.annotation.NameInMap("Extras")
        private Extras extras;

        @com.aliyun.core.annotation.NameInMap("Groups")
        private java.util.List<Groups> groups;

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
        private java.util.List<Orgs> orgs;

        @com.aliyun.core.annotation.NameInMap("OwnerType")
        private String ownerType;

        @com.aliyun.core.annotation.NameInMap("Phone")
        private String phone;

        @com.aliyun.core.annotation.NameInMap("Properties")
        private java.util.List<Properties> properties;

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
            this.externalName = builder.externalName;
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
            this.properties = builder.properties;
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
         * @return externalName
         */
        public String getExternalName() {
            return this.externalName;
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
        public java.util.List<Groups> getGroups() {
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
        public java.util.List<Orgs> getOrgs() {
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
         * @return properties
         */
        public java.util.List<Properties> getProperties() {
            return this.properties;
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
            private String externalName; 
            private Extras extras; 
            private java.util.List<Groups> groups; 
            private Long id; 
            private Boolean isTenantManager; 
            private String jobNumber; 
            private String nickName; 
            private String orgId; 
            private java.util.List<Orgs> orgs; 
            private String ownerType; 
            private String phone; 
            private java.util.List<Properties> properties; 
            private String realNickName; 
            private String remark; 
            private Long status; 
            private String wyId; 

            /**
             * <p>The work address of the convenience user.</p>
             * 
             * <strong>example:</strong>
             * <p>Hangzhou ***</p>
             */
            public Builder address(String address) {
                this.address = address;
                return this;
            }

            /**
             * <p>The profile picture of the convenience user.</p>
             * 
             * <strong>example:</strong>
             * <p><a href="https://cdn">https://cdn</a>.*****</p>
             */
            public Builder avatar(String avatar) {
                this.avatar = avatar;
                return this;
            }

            /**
             * <p>The email address of the convenience user.</p>
             * 
             * <strong>example:</strong>
             * <p><a href="mailto:username@example.com">username@example.com</a></p>
             */
            public Builder email(String email) {
                this.email = email;
                return this;
            }

            /**
             * <p>The username of the convenience user.</p>
             * 
             * <strong>example:</strong>
             * <p>alice</p>
             */
            public Builder endUserId(String endUserId) {
                this.endUserId = endUserId;
                return this;
            }

            /**
             * ExternalName.
             */
            public Builder externalName(String externalName) {
                this.externalName = externalName;
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
             * <p>The user groups to which the convenience user belongs.</p>
             */
            public Builder groups(java.util.List<Groups> groups) {
                this.groups = groups;
                return this;
            }

            /**
             * <p>The ID of the convenience user.</p>
             * 
             * <strong>example:</strong>
             * <p>4205**</p>
             */
            public Builder id(Long id) {
                this.id = id;
                return this;
            }

            /**
             * <p>Indicates whether the convenience user is an administrator. If the convenience user is of the administrator-activated type, you must specify a user administrator. Notifications such as password reset on a client are sent to the email address or mobile number of the user administrator. For more information, see <a href="https://help.aliyun.com/document_detail/214472.html">Create a convenience user</a>.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder isTenantManager(Boolean isTenantManager) {
                this.isTenantManager = isTenantManager;
                return this;
            }

            /**
             * <p>The employee number of the convenience user.</p>
             * 
             * <strong>example:</strong>
             * <p>A10000**</p>
             */
            public Builder jobNumber(String jobNumber) {
                this.jobNumber = jobNumber;
                return this;
            }

            /**
             * <p>The nickname of the convenience user.</p>
             * 
             * <strong>example:</strong>
             * <p>Lee</p>
             */
            public Builder nickName(String nickName) {
                this.nickName = nickName;
                return this;
            }

            /**
             * <p>The ID of the organization to which the convenience user belongs.</p>
             * <blockquote>
             * <p> This parameter will be deprecated in the future.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>org-4mdgc1cocc59z****</p>
             */
            public Builder orgId(String orgId) {
                this.orgId = orgId;
                return this;
            }

            /**
             * <p>The organizations to which the convenience user belongs.</p>
             */
            public Builder orgs(java.util.List<Orgs> orgs) {
                this.orgs = orgs;
                return this;
            }

            /**
             * <p>The type of the convenience account.</p>
             * <ul>
             * <li>Administrator-activated type: The administrator specifies the username and password of the convenience account. User notifications such as password reset notifications are sent to the email address or mobile number of the administrator.</li>
             * <li>User-activated type: The administrator specifies the username and the email address or mobile number of a convenience user. Notifications such as activation notifications that contain the default password are sent to the email address or mobile number of the convenience user.</li>
             * </ul>
             * <p>Valid values:</p>
             * <ul>
             * <li><p>CreateFromManager</p>
             * <!-- -->
             * 
             * <p>:</p>
             * <!-- -->
             * 
             * <p>administrator-activated</p>
             * <!-- -->
             * </li>
             * <li><p>Normal</p>
             * <!-- -->
             * 
             * <p>:</p>
             * <!-- -->
             * 
             * <p>user-activated</p>
             * <!-- --></li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Normal</p>
             */
            public Builder ownerType(String ownerType) {
                this.ownerType = ownerType;
                return this;
            }

            /**
             * <p>The mobile number of the convenience user. If you leave this parameter empty, the value of this parameter is not returned.</p>
             * 
             * <strong>example:</strong>
             * <p>1381111****</p>
             */
            public Builder phone(String phone) {
                this.phone = phone;
                return this;
            }

            /**
             * Properties.
             */
            public Builder properties(java.util.List<Properties> properties) {
                this.properties = properties;
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
             * <p>The remarks on the convenience user.</p>
             * 
             * <strong>example:</strong>
             * <p>TestUser</p>
             */
            public Builder remark(String remark) {
                this.remark = remark;
                return this;
            }

            /**
             * <p>The status of the convenience user.</p>
             * <p>Valid values:</p>
             * <ul>
             * <li><p>0: The convenience user is normal.</p>
             * <!-- -->
             * 
             * <!-- -->
             * 
             * <!-- -->
             * </li>
             * <li><p>9: The convenience user is locked.</p>
             * <!-- -->
             * 
             * <!-- -->
             * 
             * <!-- --></li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder status(Long status) {
                this.status = status;
                return this;
            }

            /**
             * <p>The globally unique ID of the convenience user.</p>
             * 
             * <strong>example:</strong>
             * <p>41fd1254d8f7****</p>
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
