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

    public Builder toBuilder() {
        return new Builder(this);
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

        private Builder() {
        } 

        private Builder(GetPrivateAccessPolicyResponseBody model) {
            this.policy = model.policy;
            this.requestId = model.requestId;
        } 

        /**
         * <p>Intranet access policy.</p>
         */
        public Builder policy(Policy policy) {
            this.policy = policy;
            return this;
        }

        /**
         * <p>The ID of the current request.</p>
         * 
         * <strong>example:</strong>
         * <p>7E9D7ACD-53D5-56EF-A913-79D148D06299</p>
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

            private Builder() {
            } 

            private Builder(CustomUserAttributes model) {
                this.idpId = model.idpId;
                this.relation = model.relation;
                this.userGroupType = model.userGroupType;
                this.value = model.value;
            } 

            /**
             * <p>The identity provider ID for the custom user group. This field is required when the custom user group type is <strong>department</strong>.</p>
             * 
             * <strong>example:</strong>
             * <p>12</p>
             */
            public Builder idpId(Integer idpId) {
                this.idpId = idpId;
                return this;
            }

            /**
             * <p>Custom user group relationship. Values: - <strong>Equal</strong>: Equal to. - <strong>Unequal</strong>: Not equal to.</p>
             * 
             * <strong>example:</strong>
             * <p>Equal</p>
             */
            public Builder relation(String relation) {
                this.relation = relation;
                return this;
            }

            /**
             * <p>Type of the custom user group. Values:</p>
             * <ul>
             * <li><strong>username</strong>: Username.</li>
             * <li><strong>department</strong>: Department.</li>
             * <li><strong>email</strong>: Email.</li>
             * <li><strong>telephone</strong>: Telephone.</li>
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
             * <p>The value of the custom user group attribute.</p>
             * <ul>
             * <li>When the user group type is <strong>username</strong>, it represents the value of the username. The length should be 1 to 128 characters, supporting Chinese and case-sensitive English letters, and can include numbers, periods (.), underscores (_), and hyphens (-).</li>
             * <li>When the user group type is <strong>department</strong>, it represents the value of the department. For example: OU=Department1,OU=SASE DingTalk.</li>
             * <li>When the user group type is <strong>email</strong>, it represents the value of the email. For example: <a href="mailto:username@example.com">username@example.com</a>.</li>
             * <li>When the user group type is <strong>telephone</strong>, it represents the value of the phone number. For example: 13900001234.</li>
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

        @com.aliyun.core.annotation.NameInMap("TriggerTemplateId")
        private String triggerTemplateId;

        @com.aliyun.core.annotation.NameInMap("TrustedProcessGroupIds")
        private java.util.List<String> trustedProcessGroupIds;

        @com.aliyun.core.annotation.NameInMap("TrustedProcessStatus")
        private String trustedProcessStatus;

        @com.aliyun.core.annotation.NameInMap("TrustedSoftwareIds")
        private java.util.List<String> trustedSoftwareIds;

        @com.aliyun.core.annotation.NameInMap("UserGroupIds")
        private java.util.List<String> userGroupIds;

        @com.aliyun.core.annotation.NameInMap("UserGroupMode")
        private String userGroupMode;

        @com.aliyun.core.annotation.NameInMap("ValidFrom")
        private Long validFrom;

        @com.aliyun.core.annotation.NameInMap("ValidTimeStatus")
        private String validTimeStatus;

        @com.aliyun.core.annotation.NameInMap("ValidUntil")
        private Long validUntil;

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
            this.triggerTemplateId = builder.triggerTemplateId;
            this.trustedProcessGroupIds = builder.trustedProcessGroupIds;
            this.trustedProcessStatus = builder.trustedProcessStatus;
            this.trustedSoftwareIds = builder.trustedSoftwareIds;
            this.userGroupIds = builder.userGroupIds;
            this.userGroupMode = builder.userGroupMode;
            this.validFrom = builder.validFrom;
            this.validTimeStatus = builder.validTimeStatus;
            this.validUntil = builder.validUntil;
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
         * @return triggerTemplateId
         */
        public String getTriggerTemplateId() {
            return this.triggerTemplateId;
        }

        /**
         * @return trustedProcessGroupIds
         */
        public java.util.List<String> getTrustedProcessGroupIds() {
            return this.trustedProcessGroupIds;
        }

        /**
         * @return trustedProcessStatus
         */
        public String getTrustedProcessStatus() {
            return this.trustedProcessStatus;
        }

        /**
         * @return trustedSoftwareIds
         */
        public java.util.List<String> getTrustedSoftwareIds() {
            return this.trustedSoftwareIds;
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

        /**
         * @return validFrom
         */
        public Long getValidFrom() {
            return this.validFrom;
        }

        /**
         * @return validTimeStatus
         */
        public String getValidTimeStatus() {
            return this.validTimeStatus;
        }

        /**
         * @return validUntil
         */
        public Long getValidUntil() {
            return this.validUntil;
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
            private String triggerTemplateId; 
            private java.util.List<String> trustedProcessGroupIds; 
            private String trustedProcessStatus; 
            private java.util.List<String> trustedSoftwareIds; 
            private java.util.List<String> userGroupIds; 
            private String userGroupMode; 
            private Long validFrom; 
            private String validTimeStatus; 
            private Long validUntil; 

            private Builder() {
            } 

            private Builder(Policy model) {
                this.applicationIds = model.applicationIds;
                this.applicationType = model.applicationType;
                this.createTime = model.createTime;
                this.customUserAttributes = model.customUserAttributes;
                this.description = model.description;
                this.deviceAttributeAction = model.deviceAttributeAction;
                this.deviceAttributeId = model.deviceAttributeId;
                this.name = model.name;
                this.policyAction = model.policyAction;
                this.policyId = model.policyId;
                this.priority = model.priority;
                this.status = model.status;
                this.tagIds = model.tagIds;
                this.triggerTemplateId = model.triggerTemplateId;
                this.trustedProcessGroupIds = model.trustedProcessGroupIds;
                this.trustedProcessStatus = model.trustedProcessStatus;
                this.trustedSoftwareIds = model.trustedSoftwareIds;
                this.userGroupIds = model.userGroupIds;
                this.userGroupMode = model.userGroupMode;
                this.validFrom = model.validFrom;
                this.validTimeStatus = model.validTimeStatus;
                this.validUntil = model.validUntil;
            } 

            /**
             * <p>A collection of application IDs for the private access policy. This field has a value when the application type is Application.</p>
             */
            public Builder applicationIds(java.util.List<String> applicationIds) {
                this.applicationIds = applicationIds;
                return this;
            }

            /**
             * <p>The application type of the private access policy. Possible values:</p>
             * <ul>
             * <li><strong>Application</strong>: Application.</li>
             * <li><strong>Tag</strong>: Tag.</li>
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
             * <p>Intranet access policy creation time.</p>
             * 
             * <strong>example:</strong>
             * <p>2021-07-29 11:26:02</p>
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * <p>Collection of custom user group attributes. Multiple custom user group attributes are combined with an OR relationship and take effect as a set.</p>
             */
            public Builder customUserAttributes(java.util.List<CustomUserAttributes> customUserAttributes) {
                this.customUserAttributes = customUserAttributes;
                return this;
            }

            /**
             * <p>Intranet access policy description.</p>
             * 
             * <strong>example:</strong>
             * <p>test</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>The action to take if the security baseline is not met. Possible values:</p>
             * <ul>
             * <li><strong>Block</strong>: Block.</li>
             * <li><strong>Observe</strong>: Observe.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Block</p>
             */
            public Builder deviceAttributeAction(String deviceAttributeAction) {
                this.deviceAttributeAction = deviceAttributeAction;
                return this;
            }

            /**
             * <p>The ID of the security baseline policy.</p>
             * 
             * <strong>example:</strong>
             * <p>dag-d3f64e8bdd4a****</p>
             */
            public Builder deviceAttributeId(String deviceAttributeId) {
                this.deviceAttributeId = deviceAttributeId;
                return this;
            }

            /**
             * <p>Intranet access policy name.</p>
             * 
             * <strong>example:</strong>
             * <p>private_access_policy_name</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>Intranet access policy action. Values:</p>
             * <ul>
             * <li><strong>Block</strong>: Block.</li>
             * <li><strong>Allow</strong>: Allow.</li>
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
             * <p>Intranet access policy ID.</p>
             * 
             * <strong>example:</strong>
             * <p>pa-policy-63b2f1844b86****</p>
             */
            public Builder policyId(String policyId) {
                this.policyId = policyId;
                return this;
            }

            /**
             * <p>Intranet access policy priority. A value of 1 indicates the highest priority.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder priority(Integer priority) {
                this.priority = priority;
                return this;
            }

            /**
             * <p>Intranet access policy status. Values:</p>
             * <ul>
             * <li><strong>Enabled</strong>: Enabled.</li>
             * <li><strong>Disabled</strong>: Disabled.</li>
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
             * <p>A collection of tag IDs for the private access policy. This field has a value when the application type is Tag.</p>
             */
            public Builder tagIds(java.util.List<String> tagIds) {
                this.tagIds = tagIds;
                return this;
            }

            /**
             * <p>The trigger template ID.</p>
             * 
             * <strong>example:</strong>
             * <p>dag-d3f64e8bdd4a****</p>
             */
            public Builder triggerTemplateId(String triggerTemplateId) {
                this.triggerTemplateId = triggerTemplateId;
                return this;
            }

            /**
             * <p>A list of trusted process group IDs.</p>
             */
            public Builder trustedProcessGroupIds(java.util.List<String> trustedProcessGroupIds) {
                this.trustedProcessGroupIds = trustedProcessGroupIds;
                return this;
            }

            /**
             * <p>The status of the trusted process switch. Possible values:</p>
             * <ul>
             * <li><strong>Enabled</strong>: Enabled.</li>
             * <li><strong>Disabled</strong>: Disabled.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Enabled</p>
             */
            public Builder trustedProcessStatus(String trustedProcessStatus) {
                this.trustedProcessStatus = trustedProcessStatus;
                return this;
            }

            /**
             * <p>A list of trusted software IDs.</p>
             */
            public Builder trustedSoftwareIds(java.util.List<String> trustedSoftwareIds) {
                this.trustedSoftwareIds = trustedSoftwareIds;
                return this;
            }

            /**
             * <p>Collection of user group IDs for the intranet access policy. This field is populated when the user group type is Normal.</p>
             */
            public Builder userGroupIds(java.util.List<String> userGroupIds) {
                this.userGroupIds = userGroupIds;
                return this;
            }

            /**
             * <p>User group type for the intranet access policy. Values:</p>
             * <ul>
             * <li><strong>Normal</strong>: Normal user group.</li>
             * <li><strong>Custom</strong>: Custom user group.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Normal</p>
             */
            public Builder userGroupMode(String userGroupMode) {
                this.userGroupMode = userGroupMode;
                return this;
            }

            /**
             * <p>The start time when the zero trust policy takes effect, represented as a timestamp in seconds.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder validFrom(Long validFrom) {
                this.validFrom = validFrom;
                return this;
            }

            /**
             * <p>Switch status for effective time. Values: - <strong>Enabled</strong>: On. - <strong>Disabled</strong>: Off.</p>
             * 
             * <strong>example:</strong>
             * <p>Enabled</p>
             */
            public Builder validTimeStatus(String validTimeStatus) {
                this.validTimeStatus = validTimeStatus;
                return this;
            }

            /**
             * <p>The expiration time of the zero trust policy, in seconds timestamp.</p>
             * 
             * <strong>example:</strong>
             * <p>1764727544</p>
             */
            public Builder validUntil(Long validUntil) {
                this.validUntil = validUntil;
                return this;
            }

            public Policy build() {
                return new Policy(this);
            } 

        } 

    }
}
