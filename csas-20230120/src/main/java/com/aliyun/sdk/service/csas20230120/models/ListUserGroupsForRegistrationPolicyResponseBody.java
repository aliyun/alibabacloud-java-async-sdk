// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.csas20230120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListUserGroupsForRegistrationPolicyResponseBody} extends {@link TeaModel}
 *
 * <p>ListUserGroupsForRegistrationPolicyResponseBody</p>
 */
public class ListUserGroupsForRegistrationPolicyResponseBody extends TeaModel {
    @NameInMap("Policies")
    private java.util.List < Policies> policies;

    @NameInMap("RequestId")
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

    /**
     * @return policies
     */
    public java.util.List < Policies> getPolicies() {
        return this.policies;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List < Policies> policies; 
        private String requestId; 

        /**
         * Policies.
         */
        public Builder policies(java.util.List < Policies> policies) {
            this.policies = policies;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ListUserGroupsForRegistrationPolicyResponseBody build() {
            return new ListUserGroupsForRegistrationPolicyResponseBody(this);
        } 

    } 

    public static class Attributes extends TeaModel {
        @NameInMap("IdpId")
        private Integer idpId;

        @NameInMap("Relation")
        private String relation;

        @NameInMap("UserGroupType")
        private String userGroupType;

        @NameInMap("Value")
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
    public static class UserGroups extends TeaModel {
        @NameInMap("Attributes")
        private java.util.List < Attributes> attributes;

        @NameInMap("CreateTime")
        private String createTime;

        @NameInMap("Description")
        private String description;

        @NameInMap("Name")
        private String name;

        @NameInMap("UserGroupId")
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
        public java.util.List < Attributes> getAttributes() {
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
            private java.util.List < Attributes> attributes; 
            private String createTime; 
            private String description; 
            private String name; 
            private String userGroupId; 

            /**
             * Attributes.
             */
            public Builder attributes(java.util.List < Attributes> attributes) {
                this.attributes = attributes;
                return this;
            }

            /**
             * CreateTime.
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
    public static class Policies extends TeaModel {
        @NameInMap("PolicyId")
        private String policyId;

        @NameInMap("UserGroups")
        private java.util.List < UserGroups> userGroups;

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
        public java.util.List < UserGroups> getUserGroups() {
            return this.userGroups;
        }

        public static final class Builder {
            private String policyId; 
            private java.util.List < UserGroups> userGroups; 

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
            public Builder userGroups(java.util.List < UserGroups> userGroups) {
                this.userGroups = userGroups;
                return this;
            }

            public Policies build() {
                return new Policies(this);
            } 

        } 

    }
}
