// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.csas20230120.models;

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
 * {@link ListUserGroupsForPrivateAccessPolicyResponseBody} extends {@link TeaModel}
 *
 * <p>ListUserGroupsForPrivateAccessPolicyResponseBody</p>
 */
public class ListUserGroupsForPrivateAccessPolicyResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Polices")
    private java.util.List<Polices> polices;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private ListUserGroupsForPrivateAccessPolicyResponseBody(Builder builder) {
        this.polices = builder.polices;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListUserGroupsForPrivateAccessPolicyResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return polices
     */
    public java.util.List<Polices> getPolices() {
        return this.polices;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List<Polices> polices; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(ListUserGroupsForPrivateAccessPolicyResponseBody model) {
            this.polices = model.polices;
            this.requestId = model.requestId;
        } 

        /**
         * <p>List of private network access policies.</p>
         */
        public Builder polices(java.util.List<Polices> polices) {
            this.polices = polices;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>58D6B23E-E5DA-5418-8F61-51A3B5A30049</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ListUserGroupsForPrivateAccessPolicyResponseBody build() {
            return new ListUserGroupsForPrivateAccessPolicyResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListUserGroupsForPrivateAccessPolicyResponseBody} extends {@link TeaModel}
     *
     * <p>ListUserGroupsForPrivateAccessPolicyResponseBody</p>
     */
    public static class Attributes extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("IdpId")
        private Integer idpId;

        @com.aliyun.core.annotation.NameInMap("Relation")
        private String relation;

        @com.aliyun.core.annotation.NameInMap("UserGroupType")
        private String userGroupType;

        @com.aliyun.core.annotation.NameInMap("Value")
        private String value;

        private Attributes(Builder builder) {
            this.idpId = builder.idpId;
            this.relation = builder.relation;
            this.userGroupType = builder.userGroupType;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Attributes create() {
            return builder().build();
        }

        /**
         * @return idpId
         */
        public Integer getIdpId() {
            return this.idpId;
        }

        /**
         * @return relation
         */
        public String getRelation() {
            return this.relation;
        }

        /**
         * @return userGroupType
         */
        public String getUserGroupType() {
            return this.userGroupType;
        }

        /**
         * @return value
         */
        public String getValue() {
            return this.value;
        }

        public static final class Builder {
            private Integer idpId; 
            private String relation; 
            private String userGroupType; 
            private String value; 

            private Builder() {
            } 

            private Builder(Attributes model) {
                this.idpId = model.idpId;
                this.relation = model.relation;
                this.userGroupType = model.userGroupType;
                this.value = model.value;
            } 

            /**
             * <p>The identity source ID of the user group. This value exists if the custom user group type is <strong>department</strong>.</p>
             * 
             * <strong>example:</strong>
             * <p>12</p>
             */
            public Builder idpId(Integer idpId) {
                this.idpId = idpId;
                return this;
            }

            /**
             * <p>The relationship of the user group. Values:</p>
             * <ul>
             * <li><p><strong>Equal</strong>: Equal.</p>
             * </li>
             * <li><p><strong>Unequal</strong>: Unequal.</p>
             * </li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Equal</p>
             */
            public Builder relation(String relation) {
                this.relation = relation;
                return this;
            }

            /**
             * <p>The type of the user group. Values:</p>
             * <ul>
             * <li><p><strong>username</strong>: username.</p>
             * </li>
             * <li><p><strong>department</strong>: department.</p>
             * </li>
             * <li><p><strong>email</strong>: mailbox.</p>
             * </li>
             * <li><p><strong>telephone</strong>: telephone.</p>
             * </li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>department</p>
             */
            public Builder userGroupType(String userGroupType) {
                this.userGroupType = userGroupType;
                return this;
            }

            /**
             * <p>Value of the user group property.</p>
             * <ul>
             * <li><p>If the user group type is <strong>username</strong>, this indicates the username\&quot;s value. The length is 1 to 128 characters. It supports Chinese characters and uppercase and lowercase English letters. It can contain numbers, periods (.), underscores (_), and hyphens (-).</p>
             * </li>
             * <li><p>If the user group type is <strong>department</strong>, this indicates the department\&quot;s value, such as OU=Department 1,OU=SASE DingTalk.</p>
             * </li>
             * <li><p>If the user group type is <strong>email</strong>, this indicates the mailbox\&quot;s value, such as username\@example.com.</p>
             * </li>
             * <li><p>If the user group type is <strong>telephone</strong>, this indicates the telephone\&quot;s value, such as 13900001234.</p>
             * </li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>OU=部门1,OU=SASE钉钉</p>
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public Attributes build() {
                return new Attributes(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListUserGroupsForPrivateAccessPolicyResponseBody} extends {@link TeaModel}
     *
     * <p>ListUserGroupsForPrivateAccessPolicyResponseBody</p>
     */
    public static class UserGroups extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Attributes")
        private java.util.List<Attributes> attributes;

        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private String createTime;

        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("UserGroupId")
        private String userGroupId;

        private UserGroups(Builder builder) {
            this.attributes = builder.attributes;
            this.createTime = builder.createTime;
            this.description = builder.description;
            this.name = builder.name;
            this.userGroupId = builder.userGroupId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static UserGroups create() {
            return builder().build();
        }

        /**
         * @return attributes
         */
        public java.util.List<Attributes> getAttributes() {
            return this.attributes;
        }

        /**
         * @return createTime
         */
        public String getCreateTime() {
            return this.createTime;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return userGroupId
         */
        public String getUserGroupId() {
            return this.userGroupId;
        }

        public static final class Builder {
            private java.util.List<Attributes> attributes; 
            private String createTime; 
            private String description; 
            private String name; 
            private String userGroupId; 

            private Builder() {
            } 

            private Builder(UserGroups model) {
                this.attributes = model.attributes;
                this.createTime = model.createTime;
                this.description = model.description;
                this.name = model.name;
                this.userGroupId = model.userGroupId;
            } 

            /**
             * <p>Collection of user group properties.</p>
             */
            public Builder attributes(java.util.List<Attributes> attributes) {
                this.attributes = attributes;
                return this;
            }

            /**
             * <p>User group creation time.</p>
             * 
             * <strong>example:</strong>
             * <p>2022-09-27 18:10:25</p>
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * <p>User group description.</p>
             * 
             * <strong>example:</strong>
             * <p>这是一条被内网访问策略引用的用户组</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>User group name.</p>
             * 
             * <strong>example:</strong>
             * <p>user_group_name</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>User group ID.</p>
             * 
             * <strong>example:</strong>
             * <p>usergroup-6f1ef2fc56b6****</p>
             */
            public Builder userGroupId(String userGroupId) {
                this.userGroupId = userGroupId;
                return this;
            }

            public UserGroups build() {
                return new UserGroups(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListUserGroupsForPrivateAccessPolicyResponseBody} extends {@link TeaModel}
     *
     * <p>ListUserGroupsForPrivateAccessPolicyResponseBody</p>
     */
    public static class Polices extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("PolicyId")
        private String policyId;

        @com.aliyun.core.annotation.NameInMap("UserGroups")
        private java.util.List<UserGroups> userGroups;

        private Polices(Builder builder) {
            this.policyId = builder.policyId;
            this.userGroups = builder.userGroups;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Polices create() {
            return builder().build();
        }

        /**
         * @return policyId
         */
        public String getPolicyId() {
            return this.policyId;
        }

        /**
         * @return userGroups
         */
        public java.util.List<UserGroups> getUserGroups() {
            return this.userGroups;
        }

        public static final class Builder {
            private String policyId; 
            private java.util.List<UserGroups> userGroups; 

            private Builder() {
            } 

            private Builder(Polices model) {
                this.policyId = model.policyId;
                this.userGroups = model.userGroups;
            } 

            /**
             * <p>Private network access policy ID.</p>
             * 
             * <strong>example:</strong>
             * <p>pa-policy-1b0d0e8b4bcf****</p>
             */
            public Builder policyId(String policyId) {
                this.policyId = policyId;
                return this;
            }

            /**
             * <p>Collection of user groups for the private network access policy.</p>
             */
            public Builder userGroups(java.util.List<UserGroups> userGroups) {
                this.userGroups = userGroups;
                return this;
            }

            public Polices build() {
                return new Polices(this);
            } 

        } 

    }
}
