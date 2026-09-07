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
 * {@link ListUserGroupsForRegistrationPolicyResponseBody} extends {@link TeaModel}
 *
 * <p>ListUserGroupsForRegistrationPolicyResponseBody</p>
 */
public class ListUserGroupsForRegistrationPolicyResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Policies")
    private java.util.List<Policies> policies;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private ListUserGroupsForRegistrationPolicyResponseBody(Builder builder) {
        this.policies = builder.policies;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListUserGroupsForRegistrationPolicyResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return policies
     */
    public java.util.List<Policies> getPolicies() {
        return this.policies;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List<Policies> policies; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(ListUserGroupsForRegistrationPolicyResponseBody model) {
            this.policies = model.policies;
            this.requestId = model.requestId;
        } 

        /**
         * <p>A list of device registration policies.</p>
         */
        public Builder policies(java.util.List<Policies> policies) {
            this.policies = policies;
            return this;
        }

        /**
         * <p>The ID of this request.</p>
         * 
         * <strong>example:</strong>
         * <p>D89009C7-54C6-51B6-BAE7-3F373920C6BF</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ListUserGroupsForRegistrationPolicyResponseBody build() {
            return new ListUserGroupsForRegistrationPolicyResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListUserGroupsForRegistrationPolicyResponseBody} extends {@link TeaModel}
     *
     * <p>ListUserGroupsForRegistrationPolicyResponseBody</p>
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
             * <p>The identity provider ID for the user group. This field appears only when UserGroupType is <strong>department</strong>.</p>
             * 
             * <strong>example:</strong>
             * <p>12</p>
             */
            public Builder idpId(Integer idpId) {
                this.idpId = idpId;
                return this;
            }

            /**
             * <p>The relation for the user group. Valid values:</p>
             * <ul>
             * <li><p><strong>Equal</strong>: Equal to.</p>
             * </li>
             * <li><p><strong>Unequal</strong>: Not equal to.</p>
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
             * <p>The type of the user group. Valid values:</p>
             * <ul>
             * <li><p><strong>username</strong>: A username.</p>
             * </li>
             * <li><p><strong>department</strong>: A department.</p>
             * </li>
             * <li><p><strong>email</strong>: An email address.</p>
             * </li>
             * <li><p><strong>telephone</strong>: A phone number.</p>
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
             * <p>The value of the user group attribute.</p>
             * <ul>
             * <li><p>If UserGroupType is <strong>username</strong>, this is the username. It must be 1–128 characters long and can contain uppercase and lowercase letters, Chinese characters, digits, periods (.), underscores (_), and hyphens (-).</p>
             * </li>
             * <li><p>If UserGroupType is <strong>department</strong>, this is the department name. Example: OU=Department 1,OU=SASE DingTalk.</p>
             * </li>
             * <li><p>If UserGroupType is <strong>email</strong>, this is the email address. Example: username\@example.com.</p>
             * </li>
             * <li><p>If UserGroupType is <strong>telephone</strong>, this is the phone number. Example: 13900001234.</p>
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
     * {@link ListUserGroupsForRegistrationPolicyResponseBody} extends {@link TeaModel}
     *
     * <p>ListUserGroupsForRegistrationPolicyResponseBody</p>
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
             * <p>A collection of user group attributes.</p>
             */
            public Builder attributes(java.util.List<Attributes> attributes) {
                this.attributes = attributes;
                return this;
            }

            /**
             * <p>The time when the user group was created.</p>
             * 
             * <strong>example:</strong>
             * <p>2022-09-27 18:10:25</p>
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * <p>A description of the user group.</p>
             * 
             * <strong>example:</strong>
             * <p>这是一条被设备注册策略引用的用户组。</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>The name of the user group.</p>
             * 
             * <strong>example:</strong>
             * <p>user_group_name</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The ID of the user group.</p>
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
     * {@link ListUserGroupsForRegistrationPolicyResponseBody} extends {@link TeaModel}
     *
     * <p>ListUserGroupsForRegistrationPolicyResponseBody</p>
     */
    public static class Policies extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("PolicyId")
        private String policyId;

        @com.aliyun.core.annotation.NameInMap("UserGroups")
        private java.util.List<UserGroups> userGroups;

        private Policies(Builder builder) {
            this.policyId = builder.policyId;
            this.userGroups = builder.userGroups;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Policies create() {
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

            private Builder(Policies model) {
                this.policyId = model.policyId;
                this.userGroups = model.userGroups;
            } 

            /**
             * <p>The ID of the device registration policy.</p>
             * 
             * <strong>example:</strong>
             * <p>reg-policy-f25c9e5872e5****</p>
             */
            public Builder policyId(String policyId) {
                this.policyId = policyId;
                return this;
            }

            /**
             * <p>A collection of user groups associated with the device registration policy.</p>
             */
            public Builder userGroups(java.util.List<UserGroups> userGroups) {
                this.userGroups = userGroups;
                return this;
            }

            public Policies build() {
                return new Policies(this);
            } 

        } 

    }
}
