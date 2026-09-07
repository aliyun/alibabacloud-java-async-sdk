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
 * {@link ListPolicesForPrivateAccessApplicationResponseBody} extends {@link TeaModel}
 *
 * <p>ListPolicesForPrivateAccessApplicationResponseBody</p>
 */
public class ListPolicesForPrivateAccessApplicationResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Applications")
    private java.util.List<Applications> applications;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private ListPolicesForPrivateAccessApplicationResponseBody(Builder builder) {
        this.applications = builder.applications;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListPolicesForPrivateAccessApplicationResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return applications
     */
    public java.util.List<Applications> getApplications() {
        return this.applications;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List<Applications> applications; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(ListPolicesForPrivateAccessApplicationResponseBody model) {
            this.applications = model.applications;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The list of private access applications.</p>
         */
        public Builder applications(java.util.List<Applications> applications) {
            this.applications = applications;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>4AB972E2-D702-5464-B132-B1911498B8BF</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ListPolicesForPrivateAccessApplicationResponseBody build() {
            return new ListPolicesForPrivateAccessApplicationResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListPolicesForPrivateAccessApplicationResponseBody} extends {@link TeaModel}
     *
     * <p>ListPolicesForPrivateAccessApplicationResponseBody</p>
     */
    public static class CustomUserAttributes extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("IdpId")
        private Integer idpId;

        @com.aliyun.core.annotation.NameInMap("Relation")
        private String relation;

        @com.aliyun.core.annotation.NameInMap("UserGroupType")
        private String userGroupType;

        @com.aliyun.core.annotation.NameInMap("Value")
        private String value;

        private CustomUserAttributes(Builder builder) {
            this.idpId = builder.idpId;
            this.relation = builder.relation;
            this.userGroupType = builder.userGroupType;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static CustomUserAttributes create() {
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

            private Builder(CustomUserAttributes model) {
                this.idpId = model.idpId;
                this.relation = model.relation;
                this.userGroupType = model.userGroupType;
                this.value = model.value;
            } 

            /**
             * <p>The ID of the identity provider (IdP) for the user group. This parameter is returned when the custom user group type is <strong>department</strong>.</p>
             * 
             * <strong>example:</strong>
             * <p>12</p>
             */
            public Builder idpId(Integer idpId) {
                this.idpId = idpId;
                return this;
            }

            /**
             * <p>The relationship of the user group. Valid values:</p>
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
             * <li><p><strong>username</strong>: Username.</p>
             * </li>
             * <li><p><strong>department</strong>: Department.</p>
             * </li>
             * <li><p><strong>email</strong>: Email.</p>
             * </li>
             * <li><p><strong>telephone</strong>: Mobile number.</p>
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
             * <li><p>If the user group type is <strong>username</strong>, this parameter specifies the value of the username. The value can be 1 to 128 characters in length and can contain Chinese characters, letters, digits, periods (.), underscores (_), and hyphens (-).</p>
             * </li>
             * <li><p>If the user group type is <strong>department</strong>, this parameter specifies the value of the department. Example: OU=Department 1,OU=SASE DingTalk.</p>
             * </li>
             * <li><p>If the user group type is <strong>email</strong>, this parameter specifies the value of the email address. Example: username\@example.com.</p>
             * </li>
             * <li><p>If the user group type is <strong>telephone</strong>, this parameter specifies the value of the mobile number. Example: 13900001234.</p>
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

            public CustomUserAttributes build() {
                return new CustomUserAttributes(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListPolicesForPrivateAccessApplicationResponseBody} extends {@link TeaModel}
     *
     * <p>ListPolicesForPrivateAccessApplicationResponseBody</p>
     */
    public static class Policies extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ApplicationType")
        private String applicationType;

        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private String createTime;

        @com.aliyun.core.annotation.NameInMap("CustomUserAttributes")
        private java.util.List<CustomUserAttributes> customUserAttributes;

        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("PolicyAction")
        private String policyAction;

        @com.aliyun.core.annotation.NameInMap("PolicyId")
        private String policyId;

        @com.aliyun.core.annotation.NameInMap("Priority")
        private Integer priority;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("UserGroupType")
        private String userGroupType;

        private Policies(Builder builder) {
            this.applicationType = builder.applicationType;
            this.createTime = builder.createTime;
            this.customUserAttributes = builder.customUserAttributes;
            this.description = builder.description;
            this.name = builder.name;
            this.policyAction = builder.policyAction;
            this.policyId = builder.policyId;
            this.priority = builder.priority;
            this.status = builder.status;
            this.userGroupType = builder.userGroupType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Policies create() {
            return builder().build();
        }

        /**
         * @return applicationType
         */
        public String getApplicationType() {
            return this.applicationType;
        }

        /**
         * @return createTime
         */
        public String getCreateTime() {
            return this.createTime;
        }

        /**
         * @return customUserAttributes
         */
        public java.util.List<CustomUserAttributes> getCustomUserAttributes() {
            return this.customUserAttributes;
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
         * @return policyAction
         */
        public String getPolicyAction() {
            return this.policyAction;
        }

        /**
         * @return policyId
         */
        public String getPolicyId() {
            return this.policyId;
        }

        /**
         * @return priority
         */
        public Integer getPriority() {
            return this.priority;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return userGroupType
         */
        public String getUserGroupType() {
            return this.userGroupType;
        }

        public static final class Builder {
            private String applicationType; 
            private String createTime; 
            private java.util.List<CustomUserAttributes> customUserAttributes; 
            private String description; 
            private String name; 
            private String policyAction; 
            private String policyId; 
            private Integer priority; 
            private String status; 
            private String userGroupType; 

            private Builder() {
            } 

            private Builder(Policies model) {
                this.applicationType = model.applicationType;
                this.createTime = model.createTime;
                this.customUserAttributes = model.customUserAttributes;
                this.description = model.description;
                this.name = model.name;
                this.policyAction = model.policyAction;
                this.policyId = model.policyId;
                this.priority = model.priority;
                this.status = model.status;
                this.userGroupType = model.userGroupType;
            } 

            /**
             * <p>The application type of the private access policy. Valid values:</p>
             * <ul>
             * <li><p><strong>Application</strong>: Application.</p>
             * </li>
             * <li><p><strong>Tag</strong>: Tag.</p>
             * </li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Application</p>
             */
            public Builder applicationType(String applicationType) {
                this.applicationType = applicationType;
                return this;
            }

            /**
             * <p>The time when the private access policy was created.</p>
             * 
             * <strong>example:</strong>
             * <p>2022-09-27 18:10:25</p>
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * <p>The collection of custom user group attributes. If you specify multiple attributes, the relationship between them is OR.</p>
             */
            public Builder customUserAttributes(java.util.List<CustomUserAttributes> customUserAttributes) {
                this.customUserAttributes = customUserAttributes;
                return this;
            }

            /**
             * <p>The description of the private access policy.</p>
             * 
             * <strong>example:</strong>
             * <p>这是一条内网访问策略</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>The name of the private access policy.</p>
             * 
             * <strong>example:</strong>
             * <p>private_access_policy_name</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The action of the private access policy. Valid values:</p>
             * <ul>
             * <li><p><strong>Block</strong>: Blocks access.</p>
             * </li>
             * <li><p><strong>Allow</strong>: Allows access.</p>
             * </li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Allow</p>
             */
            public Builder policyAction(String policyAction) {
                this.policyAction = policyAction;
                return this;
            }

            /**
             * <p>The ID of the private access policy.</p>
             * 
             * <strong>example:</strong>
             * <p>pa-policy-867ef4007c8a****</p>
             */
            public Builder policyId(String policyId) {
                this.policyId = policyId;
                return this;
            }

            /**
             * <p>The priority of the private access policy. The value 1 indicates the highest priority.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder priority(Integer priority) {
                this.priority = priority;
                return this;
            }

            /**
             * <p>The status of the private access policy. Valid values:</p>
             * <ul>
             * <li><p><strong>Enabled</strong>: The policy is enabled.</p>
             * </li>
             * <li><p><strong>Disabled</strong>: The policy is disabled.</p>
             * </li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Enabled</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * <p>The user group type of the private access policy. Valid values:</p>
             * <ul>
             * <li><p><strong>Normal</strong>: Regular user group.</p>
             * </li>
             * <li><p><strong>Custom</strong>: Custom user group.</p>
             * </li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Normal</p>
             */
            public Builder userGroupType(String userGroupType) {
                this.userGroupType = userGroupType;
                return this;
            }

            public Policies build() {
                return new Policies(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListPolicesForPrivateAccessApplicationResponseBody} extends {@link TeaModel}
     *
     * <p>ListPolicesForPrivateAccessApplicationResponseBody</p>
     */
    public static class Applications extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ApplicationId")
        private String applicationId;

        @com.aliyun.core.annotation.NameInMap("Policies")
        private java.util.List<Policies> policies;

        private Applications(Builder builder) {
            this.applicationId = builder.applicationId;
            this.policies = builder.policies;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Applications create() {
            return builder().build();
        }

        /**
         * @return applicationId
         */
        public String getApplicationId() {
            return this.applicationId;
        }

        /**
         * @return policies
         */
        public java.util.List<Policies> getPolicies() {
            return this.policies;
        }

        public static final class Builder {
            private String applicationId; 
            private java.util.List<Policies> policies; 

            private Builder() {
            } 

            private Builder(Applications model) {
                this.applicationId = model.applicationId;
                this.policies = model.policies;
            } 

            /**
             * <p>The ID of the private access application.</p>
             * 
             * <strong>example:</strong>
             * <p>pa-application-b927baf3e592****</p>
             */
            public Builder applicationId(String applicationId) {
                this.applicationId = applicationId;
                return this;
            }

            /**
             * <p>The collection of private access policies.</p>
             */
            public Builder policies(java.util.List<Policies> policies) {
                this.policies = policies;
                return this;
            }

            public Applications build() {
                return new Applications(this);
            } 

        } 

    }
}
