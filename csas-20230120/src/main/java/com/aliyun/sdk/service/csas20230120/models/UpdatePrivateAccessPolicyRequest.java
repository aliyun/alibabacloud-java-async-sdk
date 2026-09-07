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
 * {@link UpdatePrivateAccessPolicyRequest} extends {@link RequestModel}
 *
 * <p>UpdatePrivateAccessPolicyRequest</p>
 */
public class UpdatePrivateAccessPolicyRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ApplicationIds")
    private java.util.List<String> applicationIds;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ApplicationType")
    private String applicationType;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("CustomUserAttributes")
    private java.util.List<CustomUserAttributes> customUserAttributes;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Description")
    private String description;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("DeviceAttributeAction")
    private String deviceAttributeAction;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("DeviceAttributeId")
    private String deviceAttributeId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ModifyType")
    private String modifyType;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Name")
    private String name;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("PolicyAction")
    private String policyAction;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("PolicyId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String policyId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Priority")
    private Integer priority;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Status")
    private String status;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("TagIds")
    private java.util.List<String> tagIds;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("TriggerTemplateId")
    private String triggerTemplateId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("TrustedProcessGroupIds")
    private java.util.List<String> trustedProcessGroupIds;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("TrustedProcessStatus")
    private String trustedProcessStatus;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("TrustedSoftwareIds")
    private java.util.List<String> trustedSoftwareIds;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("UserGroupIds")
    private java.util.List<String> userGroupIds;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("UserGroupMode")
    private String userGroupMode;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ValidFrom")
    private Long validFrom;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ValidTimeStatus")
    private String validTimeStatus;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ValidUntil")
    private Long validUntil;

    private UpdatePrivateAccessPolicyRequest(Builder builder) {
        super(builder);
        this.applicationIds = builder.applicationIds;
        this.applicationType = builder.applicationType;
        this.customUserAttributes = builder.customUserAttributes;
        this.description = builder.description;
        this.deviceAttributeAction = builder.deviceAttributeAction;
        this.deviceAttributeId = builder.deviceAttributeId;
        this.modifyType = builder.modifyType;
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

    public static UpdatePrivateAccessPolicyRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
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
     * @return modifyType
     */
    public String getModifyType() {
        return this.modifyType;
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

    public static final class Builder extends Request.Builder<UpdatePrivateAccessPolicyRequest, Builder> {
        private java.util.List<String> applicationIds; 
        private String applicationType; 
        private java.util.List<CustomUserAttributes> customUserAttributes; 
        private String description; 
        private String deviceAttributeAction; 
        private String deviceAttributeId; 
        private String modifyType; 
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
            super();
        } 

        private Builder(UpdatePrivateAccessPolicyRequest request) {
            super(request);
            this.applicationIds = request.applicationIds;
            this.applicationType = request.applicationType;
            this.customUserAttributes = request.customUserAttributes;
            this.description = request.description;
            this.deviceAttributeAction = request.deviceAttributeAction;
            this.deviceAttributeId = request.deviceAttributeId;
            this.modifyType = request.modifyType;
            this.name = request.name;
            this.policyAction = request.policyAction;
            this.policyId = request.policyId;
            this.priority = request.priority;
            this.status = request.status;
            this.tagIds = request.tagIds;
            this.triggerTemplateId = request.triggerTemplateId;
            this.trustedProcessGroupIds = request.trustedProcessGroupIds;
            this.trustedProcessStatus = request.trustedProcessStatus;
            this.trustedSoftwareIds = request.trustedSoftwareIds;
            this.userGroupIds = request.userGroupIds;
            this.userGroupMode = request.userGroupMode;
            this.validFrom = request.validFrom;
            this.validTimeStatus = request.validTimeStatus;
            this.validUntil = request.validUntil;
        } 

        /**
         * <p>The IDs of applications associated with the internal network access policy. A single policy supports up to 100 application IDs.</p>
         */
        public Builder applicationIds(java.util.List<String> applicationIds) {
            this.putBodyParameter("ApplicationIds", applicationIds);
            this.applicationIds = applicationIds;
            return this;
        }

        /**
         * <p>The application type for the internal network access policy. Valid values:</p>
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
            this.putBodyParameter("ApplicationType", applicationType);
            this.applicationType = applicationType;
            return this;
        }

        /**
         * <p>This parameter specifies a collection of custom user groups for the private network access policy. It is required when the user group type is <strong>Custom</strong>. This collection is mutually exclusive with the user group ID collection, and you can specify a maximum of 10 custom user groups.</p>
         */
        public Builder customUserAttributes(java.util.List<CustomUserAttributes> customUserAttributes) {
            this.putBodyParameter("CustomUserAttributes", customUserAttributes);
            this.customUserAttributes = customUserAttributes;
            return this;
        }

        /**
         * <p>A description of the internal network access policy. The description must be 1 to 128 characters in length. It can contain Chinese characters, uppercase and lowercase letters, digits, periods (.), underscores (_), hyphens (-), and spaces.</p>
         * 
         * <strong>example:</strong>
         * <p>这是一条内网访问策略</p>
         */
        public Builder description(String description) {
            this.putBodyParameter("Description", description);
            this.description = description;
            return this;
        }

        /**
         * <p>The action taken when a device does not meet the security baseline. Valid values:</p>
         * <ul>
         * <li><p><strong>Block</strong>: Block access.</p>
         * </li>
         * <li><p><strong>Observe</strong>: Monitor access.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Block</p>
         */
        public Builder deviceAttributeAction(String deviceAttributeAction) {
            this.putBodyParameter("DeviceAttributeAction", deviceAttributeAction);
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
            this.putBodyParameter("DeviceAttributeId", deviceAttributeId);
            this.deviceAttributeId = deviceAttributeId;
            return this;
        }

        /**
         * <p>The method used to update the internal network access policy. Valid values:</p>
         * <ul>
         * <li><p><strong>Cover</strong> (default): Replace the existing application IDs, user group IDs, and custom user attributes with the values specified in <strong>ApplicationIds</strong>, <strong>UserGroupIds</strong>, and <strong>CustomUserAttributes</strong>.</p>
         * </li>
         * <li><p><strong>Append</strong>: Add the values specified in <strong>ApplicationIds</strong>, <strong>UserGroupIds</strong>, and <strong>CustomUserAttributes</strong> to the existing application IDs, user group IDs, and custom user attributes.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Cover</p>
         */
        public Builder modifyType(String modifyType) {
            this.putBodyParameter("ModifyType", modifyType);
            this.modifyType = modifyType;
            return this;
        }

        /**
         * Name.
         */
        public Builder name(String name) {
            this.putBodyParameter("Name", name);
            this.name = name;
            return this;
        }

        /**
         * <p>The action that the internal network access policy takes. Valid values:</p>
         * <ul>
         * <li><p><strong>Block</strong>: Block access.</p>
         * </li>
         * <li><p><strong>Allow</strong>: Allow access.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Allow</p>
         */
        public Builder policyAction(String policyAction) {
            this.putBodyParameter("PolicyAction", policyAction);
            this.policyAction = policyAction;
            return this;
        }

        /**
         * <p>The ID of the internal network access policy. Get this value from one of the following operations:</p>
         * <ul>
         * <li><p><a href="~~ListPrivateAccessPolices~~">ListPrivateAccessPolices</a>: List internal network access policies in batches.</p>
         * </li>
         * <li><p><a href="~~CreatePrivateAccessPolicy~~">CreatePrivateAccessPolicy</a>: Create an internal network access policy.</p>
         * </li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>pa-policy-63b2f1844b86****</p>
         */
        public Builder policyId(String policyId) {
            this.putBodyParameter("PolicyId", policyId);
            this.policyId = policyId;
            return this;
        }

        /**
         * <p>The priority of the internal network access policy. Priority 1 is the highest. Valid values: 1 to 1000. The maximum value is the total number of internal network access policies minus 1.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder priority(Integer priority) {
            this.putBodyParameter("Priority", priority);
            this.priority = priority;
            return this;
        }

        /**
         * <p>The status of the internal network access policy. Valid values:</p>
         * <ul>
         * <li><p><strong>Enabled</strong>: Enabled.</p>
         * </li>
         * <li><p><strong>Disabled</strong>: Disabled.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Enabled</p>
         */
        public Builder status(String status) {
            this.putBodyParameter("Status", status);
            this.status = status;
            return this;
        }

        /**
         * <p>The IDs of tags associated with the internal network access policy. A single policy supports up to 100 tag IDs.</p>
         */
        public Builder tagIds(java.util.List<String> tagIds) {
            this.putBodyParameter("TagIds", tagIds);
            this.tagIds = tagIds;
            return this;
        }

        /**
         * <p>The ID of the trigger template.</p>
         * 
         * <strong>example:</strong>
         * <p>dag-d3f64e8bdd4a****</p>
         */
        public Builder triggerTemplateId(String triggerTemplateId) {
            this.putBodyParameter("TriggerTemplateId", triggerTemplateId);
            this.triggerTemplateId = triggerTemplateId;
            return this;
        }

        /**
         * <p>The IDs of trusted process groups.</p>
         */
        public Builder trustedProcessGroupIds(java.util.List<String> trustedProcessGroupIds) {
            this.putBodyParameter("TrustedProcessGroupIds", trustedProcessGroupIds);
            this.trustedProcessGroupIds = trustedProcessGroupIds;
            return this;
        }

        /**
         * <p>The status of the trusted process feature. Valid values:</p>
         * <ul>
         * <li><p><strong>Enabled</strong>: Enabled.</p>
         * </li>
         * <li><p><strong>Disabled</strong>: Disabled.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Disabled</p>
         */
        public Builder trustedProcessStatus(String trustedProcessStatus) {
            this.putBodyParameter("TrustedProcessStatus", trustedProcessStatus);
            this.trustedProcessStatus = trustedProcessStatus;
            return this;
        }

        /**
         * <p>The IDs of trusted software.</p>
         */
        public Builder trustedSoftwareIds(java.util.List<String> trustedSoftwareIds) {
            this.putBodyParameter("TrustedSoftwareIds", trustedSoftwareIds);
            this.trustedSoftwareIds = trustedSoftwareIds;
            return this;
        }

        /**
         * <p>The IDs of user groups associated with the internal network access policy. This parameter is required when UserGroupMode is set to Normal. This parameter is mutually exclusive with <strong>CustomUserAttributes</strong>. A single policy supports up to 10,000 user groups. You can update up to 2,000 user group IDs at a time.</p>
         */
        public Builder userGroupIds(java.util.List<String> userGroupIds) {
            this.putBodyParameter("UserGroupIds", userGroupIds);
            this.userGroupIds = userGroupIds;
            return this;
        }

        /**
         * <p>The user group type for the internal network access policy. Valid values:</p>
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
        public Builder userGroupMode(String userGroupMode) {
            this.putBodyParameter("UserGroupMode", userGroupMode);
            this.userGroupMode = userGroupMode;
            return this;
        }

        /**
         * <p>The start time of the zero-trust policy\&quot;s effective period, in seconds since the Unix epoch.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        public Builder validFrom(Long validFrom) {
            this.putBodyParameter("ValidFrom", validFrom);
            this.validFrom = validFrom;
            return this;
        }

        /**
         * <p>The status of the effective time feature. Valid values:</p>
         * <ul>
         * <li><p><strong>Enabled</strong>: Enabled.</p>
         * </li>
         * <li><p><strong>Disabled</strong>: Disabled.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Enabled</p>
         */
        public Builder validTimeStatus(String validTimeStatus) {
            this.putBodyParameter("ValidTimeStatus", validTimeStatus);
            this.validTimeStatus = validTimeStatus;
            return this;
        }

        /**
         * <p>The end time of the zero-trust policy\&quot;s effective period, in seconds since the Unix epoch.</p>
         * 
         * <strong>example:</strong>
         * <p>1764727544</p>
         */
        public Builder validUntil(Long validUntil) {
            this.putBodyParameter("ValidUntil", validUntil);
            this.validUntil = validUntil;
            return this;
        }

        @Override
        public UpdatePrivateAccessPolicyRequest build() {
            return new UpdatePrivateAccessPolicyRequest(this);
        } 

    } 

    /**
     * 
     * {@link UpdatePrivateAccessPolicyRequest} extends {@link TeaModel}
     *
     * <p>UpdatePrivateAccessPolicyRequest</p>
     */
    public static class CustomUserAttributes extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("IdpId")
        private Integer idpId;

        @com.aliyun.core.annotation.NameInMap("Relation")
        @com.aliyun.core.annotation.Validation(required = true)
        private String relation;

        @com.aliyun.core.annotation.NameInMap("UserGroupType")
        @com.aliyun.core.annotation.Validation(required = true)
        private String userGroupType;

        @com.aliyun.core.annotation.NameInMap("Value")
        @com.aliyun.core.annotation.Validation(required = true)
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
             * <p>The identity provider ID for the custom user attribute. This parameter is required when UserGroupType is <strong>department</strong>.</p>
             * 
             * <strong>example:</strong>
             * <p>12</p>
             */
            public Builder idpId(Integer idpId) {
                this.idpId = idpId;
                return this;
            }

            /**
             * <p>The relation used to match the custom user attribute. Valid values:</p>
             * <ul>
             * <li><p><strong>Equal</strong>: Equal to.</p>
             * </li>
             * <li><p><strong>Unequal</strong>: Not equal to.</p>
             * </li>
             * </ul>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>Equal</p>
             */
            public Builder relation(String relation) {
                this.relation = relation;
                return this;
            }

            /**
             * <p>The type of the custom user attribute. Valid values:</p>
             * <ul>
             * <li><p><strong>username</strong>: Username.</p>
             * </li>
             * <li><p><strong>department</strong>: Department.</p>
             * </li>
             * <li><p><strong>email</strong>: Email address.</p>
             * </li>
             * <li><p><strong>telephone</strong>: Phone number.</p>
             * </li>
             * </ul>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>department</p>
             */
            public Builder userGroupType(String userGroupType) {
                this.userGroupType = userGroupType;
                return this;
            }

            /**
             * <p>The value of the custom user attribute.</p>
             * <ul>
             * <li><p>If UserGroupType is <strong>username</strong>, this is the username. The value must be 1 to 128 characters in length. It can contain Chinese characters, uppercase and lowercase letters, digits, periods (.), underscores (_), hyphens (-), asterisks (\*), at signs (@), and spaces.</p>
             * </li>
             * <li><p>If UserGroupType is <strong>department</strong>, this is the department name. Example: OU=Department 1,OU=SASE DingTalk.</p>
             * </li>
             * <li><p>If UserGroupType is <strong>email</strong>, this is the email address. Example: username\@example.com.</p>
             * </li>
             * <li><p>If UserGroupType is <strong>telephone</strong>, this is the phone number. Example: 13900001234.</p>
             * </li>
             * </ul>
             * <p>This parameter is required.</p>
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
}
