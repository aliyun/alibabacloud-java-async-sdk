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
         * <p>The IDs of the applications in the private access policy. A single policy supports up to 100 private access application IDs.</p>
         */
        public Builder applicationIds(java.util.List<String> applicationIds) {
            this.putBodyParameter("ApplicationIds", applicationIds);
            this.applicationIds = applicationIds;
            return this;
        }

        /**
         * <p>The application type of the private access policy. Valid values:</p>
         * <ul>
         * <li><strong>Application</strong>: Application.</li>
         * <li><strong>Tag</strong>: Tag.</li>
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
         * <p>The custom user groups in the private access policy. This parameter is required when the user group type is <strong>Custom</strong>. This parameter is mutually exclusive with the user group IDs. You can specify up to 10 custom user groups.</p>
         */
        public Builder customUserAttributes(java.util.List<CustomUserAttributes> customUserAttributes) {
            this.putBodyParameter("CustomUserAttributes", customUserAttributes);
            this.customUserAttributes = customUserAttributes;
            return this;
        }

        /**
         * <p>The description of the private access policy. The description must be 1 to 128 characters in length, and can contain Chinese characters, uppercase and lowercase letters, digits, periods (.), underscores (_), hyphens (-), and spaces.</p>
         * 
         * <strong>example:</strong>
         * <p>This is a private access policy</p>
         */
        public Builder description(String description) {
            this.putBodyParameter("Description", description);
            this.description = description;
            return this;
        }

        /**
         * <p>The action to take when the security baseline is not met. Valid values:</p>
         * <ul>
         * <li><strong>Block</strong>: Blocks.</li>
         * <li><strong>Observe</strong>: Observes.</li>
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
         * <p>The modification type of the private access policy. Valid values:</p>
         * <ul>
         * <li><strong>Cover</strong> (default): Overwrites the original application IDs, user group IDs, and custom user groups with the values of the <strong>ApplicationIds</strong>, <strong>UserGroupIds</strong>, and <strong>CustomUserAttributes</strong> parameters.</li>
         * <li><strong>Append</strong>: Appends the values of the <strong>ApplicationIds</strong>, <strong>UserGroupIds</strong>, and <strong>CustomUserAttributes</strong> parameters to the original application IDs, user group IDs, and custom user groups.</li>
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
         * <p>The Policy Name.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        public Builder name(String name) {
            this.putBodyParameter("Name", name);
            this.name = name;
            return this;
        }

        /**
         * <p>The action of the private access policy. Valid values:</p>
         * <ul>
         * <li><strong>Block</strong>: Blocks.</li>
         * <li><strong>Allow</strong>: Allows.</li>
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
         * <p>The ID of the private access policy. You can obtain the value from the following operations:</p>
         * <ul>
         * <li><a href="~~ListPrivateAccessPolices~~">ListPrivateAccessPolices</a>: Queries private access policies.</li>
         * <li><a href="~~CreatePrivateAccessPolicy~~">CreatePrivateAccessPolicy</a>: Creates a private access policy.</li>
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
         * <p>The policy priority of the internal network access policy. A value of 1 indicates the highest priority. Valid values: 1 to 1000. The maximum value is the total number of internal network access policies minus one.</p>
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
         * <p>The status of the private access policy. Valid values:</p>
         * <ul>
         * <li><strong>Enabled</strong>: Enabled.</li>
         * <li><strong>Disabled</strong>: Disabled.</li>
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
         * <p>The IDs of the tags in the private access policy. A single policy supports up to 100 private access tag IDs.</p>
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
         * <p>The IDs of the trusted process groups.</p>
         */
        public Builder trustedProcessGroupIds(java.util.List<String> trustedProcessGroupIds) {
            this.putBodyParameter("TrustedProcessGroupIds", trustedProcessGroupIds);
            this.trustedProcessGroupIds = trustedProcessGroupIds;
            return this;
        }

        /**
         * <p>The status of the trusted process switch. Valid values:</p>
         * <ul>
         * <li><strong>Enabled</strong>: Enabled.</li>
         * <li><strong>Disabled</strong>: Disabled.</li>
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
         * <p>The IDs of the trusted software.</p>
         */
        public Builder trustedSoftwareIds(java.util.List<String> trustedSoftwareIds) {
            this.putBodyParameter("TrustedSoftwareIds", trustedSoftwareIds);
            this.trustedSoftwareIds = trustedSoftwareIds;
            return this;
        }

        /**
         * <p>The IDs of the user groups in the private access policy. This parameter is required when the user group type is <strong>Normal</strong>. This parameter is mutually exclusive with the custom user groups. A single policy supports up to 10,000 user groups, and you can modify up to 2,000 user group IDs at a time.</p>
         */
        public Builder userGroupIds(java.util.List<String> userGroupIds) {
            this.putBodyParameter("UserGroupIds", userGroupIds);
            this.userGroupIds = userGroupIds;
            return this;
        }

        /**
         * <p>The user group type of the private access policy. Valid values:</p>
         * <ul>
         * <li><strong>Normal</strong>: Regular user group.</li>
         * <li><strong>Custom</strong>: Custom user group.</li>
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
         * <p>The start time when the zero trust policy takes effect. The value is a UNIX timestamp in seconds.</p>
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
         * <p>The status of the effective period switch. Valid values:</p>
         * <ul>
         * <li><strong>Enabled</strong>: Enabled.</li>
         * <li><strong>Disabled</strong>: Shutdown.</li>
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
         * <p>The end time when the zero trust policy takes effect. The value is a UNIX timestamp in seconds.</p>
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
             * <p>The ID of the identity source for the custom user group. This parameter is required when the custom user group type is <strong>department</strong>.</p>
             * 
             * <strong>example:</strong>
             * <p>12</p>
             */
            public Builder idpId(Integer idpId) {
                this.idpId = idpId;
                return this;
            }

            /**
             * <p>The relation of the custom user group. Valid values:</p>
             * <ul>
             * <li><strong>Equal</strong>: Equal to.</li>
             * <li><strong>Unequal</strong>: Not equal to.</li>
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
             * <p>The type of the custom user group. Valid values:</p>
             * <ul>
             * <li><strong>username</strong>: Username.</li>
             * <li><strong>department</strong>: Department.</li>
             * <li><strong>email</strong>: Email address.</li>
             * <li><strong>telephone</strong>: Mobile phone number.</li>
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
             * <p>The value of the custom user group attribute.</p>
             * <ul>
             * <li>If the user group type is <strong>username</strong>, this parameter specifies the username. The value must be 1 to 128 characters in length, and can contain Chinese characters, uppercase and lowercase letters, digits, periods (.), underscores (_), hyphens (-), asterisks (*), at signs (@), and spaces.</li>
             * <li>If the user group type is <strong>department</strong>, this parameter specifies the department. Example: OU=Department 1,OU=SASE DingTalk.</li>
             * <li>If the user group type is <strong>email</strong>, this parameter specifies the email address. Example: <a href="mailto:username@example.com">username@example.com</a>.</li>
             * <li>If the user group type is <strong>telephone</strong>, this parameter specifies the mobile phone number. Example: 13900001234.</li>
             * </ul>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>OU=Department 1,OU=SASE DingTalk</p>
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
