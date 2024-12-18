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
 * {@link GetPrivateAccessPolicyResponseBody} extends {@link TeaModel}
 *
 * <p>GetPrivateAccessPolicyResponseBody</p>
 */
public class GetPrivateAccessPolicyResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Policy")
    private Policy policy;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private GetPrivateAccessPolicyResponseBody(Builder builder) {
        this.policy = builder.policy;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetPrivateAccessPolicyResponseBody create() {
        return builder().build();
    }

    /**
     * @return policy
     */
    public Policy getPolicy() {
        return this.policy;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private Policy policy; 
        private String requestId; 

        /**
         * Policy.
         */
        public Builder policy(Policy policy) {
            this.policy = policy;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetPrivateAccessPolicyResponseBody build() {
            return new GetPrivateAccessPolicyResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetPrivateAccessPolicyResponseBody} extends {@link TeaModel}
     *
     * <p>GetPrivateAccessPolicyResponseBody</p>
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

            public CustomUserAttributes build() {
                return new CustomUserAttributes(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetPrivateAccessPolicyResponseBody} extends {@link TeaModel}
     *
     * <p>GetPrivateAccessPolicyResponseBody</p>
     */
    public static class Policy extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ApplicationIds")
        private java.util.List<String> applicationIds;

        @com.aliyun.core.annotation.NameInMap("ApplicationType")
        private String applicationType;

        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private String createTime;

        @com.aliyun.core.annotation.NameInMap("CustomUserAttributes")
        private java.util.List<CustomUserAttributes> customUserAttributes;

        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("DeviceAttributeAction")
        private String deviceAttributeAction;

        @com.aliyun.core.annotation.NameInMap("DeviceAttributeId")
        private String deviceAttributeId;

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

        @com.aliyun.core.annotation.NameInMap("TagIds")
        private java.util.List<String> tagIds;

        @com.aliyun.core.annotation.NameInMap("UserGroupIds")
        private java.util.List<String> userGroupIds;

        @com.aliyun.core.annotation.NameInMap("UserGroupMode")
        private String userGroupMode;

        private Policy(Builder builder) {
            this.applicationIds = builder.applicationIds;
            this.applicationType = builder.applicationType;
            this.createTime = builder.createTime;
            this.customUserAttributes = builder.customUserAttributes;
            this.description = builder.description;
            this.deviceAttributeAction = builder.deviceAttributeAction;
            this.deviceAttributeId = builder.deviceAttributeId;
            this.name = builder.name;
            this.policyAction = builder.policyAction;
            this.policyId = builder.policyId;
            this.priority = builder.priority;
            this.status = builder.status;
            this.tagIds = builder.tagIds;
            this.userGroupIds = builder.userGroupIds;
            this.userGroupMode = builder.userGroupMode;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Policy create() {
            return builder().build();
        }

        /**
         * @return applicationIds
         */
        public java.util.List<String> getApplicationIds() {
            return this.applicationIds;
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
         * @return deviceAttributeAction
         */
        public String getDeviceAttributeAction() {
            return this.deviceAttributeAction;
        }

        /**
         * @return deviceAttributeId
         */
        public String getDeviceAttributeId() {
            return this.deviceAttributeId;
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
         * @return tagIds
         */
        public java.util.List<String> getTagIds() {
            return this.tagIds;
        }

        /**
         * @return userGroupIds
         */
        public java.util.List<String> getUserGroupIds() {
            return this.userGroupIds;
        }

        /**
         * @return userGroupMode
         */
        public String getUserGroupMode() {
            return this.userGroupMode;
        }

        public static final class Builder {
            private java.util.List<String> applicationIds; 
            private String applicationType; 
            private String createTime; 
            private java.util.List<CustomUserAttributes> customUserAttributes; 
            private String description; 
            private String deviceAttributeAction; 
            private String deviceAttributeId; 
            private String name; 
            private String policyAction; 
            private String policyId; 
            private Integer priority; 
            private String status; 
            private java.util.List<String> tagIds; 
            private java.util.List<String> userGroupIds; 
            private String userGroupMode; 

            /**
             * ApplicationIds.
             */
            public Builder applicationIds(java.util.List<String> applicationIds) {
                this.applicationIds = applicationIds;
                return this;
            }

            /**
             * ApplicationType.
             */
            public Builder applicationType(String applicationType) {
                this.applicationType = applicationType;
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
             * CustomUserAttributes.
             */
            public Builder customUserAttributes(java.util.List<CustomUserAttributes> customUserAttributes) {
                this.customUserAttributes = customUserAttributes;
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
             * DeviceAttributeAction.
             */
            public Builder deviceAttributeAction(String deviceAttributeAction) {
                this.deviceAttributeAction = deviceAttributeAction;
                return this;
            }

            /**
             * DeviceAttributeId.
             */
            public Builder deviceAttributeId(String deviceAttributeId) {
                this.deviceAttributeId = deviceAttributeId;
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
             * PolicyAction.
             */
            public Builder policyAction(String policyAction) {
                this.policyAction = policyAction;
                return this;
            }

            /**
             * PolicyId.
             */
            public Builder policyId(String policyId) {
                this.policyId = policyId;
                return this;
            }

            /**
             * Priority.
             */
            public Builder priority(Integer priority) {
                this.priority = priority;
                return this;
            }

            /**
             * Status.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * TagIds.
             */
            public Builder tagIds(java.util.List<String> tagIds) {
                this.tagIds = tagIds;
                return this;
            }

            /**
             * UserGroupIds.
             */
            public Builder userGroupIds(java.util.List<String> userGroupIds) {
                this.userGroupIds = userGroupIds;
                return this;
            }

            /**
             * UserGroupMode.
             */
            public Builder userGroupMode(String userGroupMode) {
                this.userGroupMode = userGroupMode;
                return this;
            }

            public Policy build() {
                return new Policy(this);
            } 

        } 

    }
}
