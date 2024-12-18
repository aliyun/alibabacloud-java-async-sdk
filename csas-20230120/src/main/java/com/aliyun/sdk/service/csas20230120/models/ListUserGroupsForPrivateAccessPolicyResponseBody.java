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

        /**
         * Polices.
         */
        public Builder polices(java.util.List<Polices> polices) {
            this.polices = polices;
            return this;
        }

        /**
         * RequestId.
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

            /**
             * IdpId.
             */
            public Builder idpId(Integer idpId) {
                this.idpId = idpId;
                return this;
            }

            /**
             * Relation.
             */
            public Builder relation(String relation) {
                this.relation = relation;
                return this;
            }

            /**
             * UserGroupType.
             */
            public Builder userGroupType(String userGroupType) {
                this.userGroupType = userGroupType;
                return this;
            }

            /**
             * Value.
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

            /**
             * Attributes.
             */
            public Builder attributes(java.util.List<Attributes> attributes) {
                this.attributes = attributes;
                return this;
            }

            /**
             * <p>用户组创建时间。</p>
             * 
             * <strong>example:</strong>
             * <p>2022-09-27 18:10:25</p>
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * Description.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * Name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * UserGroupId.
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

            /**
             * PolicyId.
             */
            public Builder policyId(String policyId) {
                this.policyId = policyId;
                return this;
            }

            /**
             * UserGroups.
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
