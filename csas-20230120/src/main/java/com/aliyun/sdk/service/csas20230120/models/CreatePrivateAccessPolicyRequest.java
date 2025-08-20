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
 * {@link CreatePrivateAccessPolicyRequest} extends {@link RequestModel}
 *
 * <p>CreatePrivateAccessPolicyRequest</p>
 */
public class CreatePrivateAccessPolicyRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ApplicationIds")
    private java.util.List<String> applicationIds;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ApplicationType")
    @com.aliyun.core.annotation.Validation(required = true)
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
    @com.aliyun.core.annotation.NameInMap("Name")
    @com.aliyun.core.annotation.Validation(required = true)
    private String name;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("PolicyAction")
    @com.aliyun.core.annotation.Validation(required = true)
    private String policyAction;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Priority")
    @com.aliyun.core.annotation.Validation(required = true)
    private Integer priority;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Status")
    @com.aliyun.core.annotation.Validation(required = true)
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
    @com.aliyun.core.annotation.Validation(required = true)
    private String userGroupMode;

    private CreatePrivateAccessPolicyRequest(Builder builder) {
        super(builder);
        this.applicationIds = builder.applicationIds;
        this.applicationType = builder.applicationType;
        this.customUserAttributes = builder.customUserAttributes;
        this.description = builder.description;
        this.deviceAttributeAction = builder.deviceAttributeAction;
        this.deviceAttributeId = builder.deviceAttributeId;
        this.name = builder.name;
        this.policyAction = builder.policyAction;
        this.priority = builder.priority;
        this.status = builder.status;
        this.tagIds = builder.tagIds;
        this.triggerTemplateId = builder.triggerTemplateId;
        this.trustedProcessGroupIds = builder.trustedProcessGroupIds;
        this.trustedProcessStatus = builder.trustedProcessStatus;
        this.trustedSoftwareIds = builder.trustedSoftwareIds;
        this.userGroupIds = builder.userGroupIds;
        this.userGroupMode = builder.userGroupMode;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreatePrivateAccessPolicyRequest create() {
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

    public static final class Builder extends Request.Builder<CreatePrivateAccessPolicyRequest, Builder> {
        private java.util.List<String> applicationIds; 
        private String applicationType; 
        private java.util.List<CustomUserAttributes> customUserAttributes; 
        private String description; 
        private String deviceAttributeAction; 
        private String deviceAttributeId; 
        private String name; 
        private String policyAction; 
        private Integer priority; 
        private String status; 
        private java.util.List<String> tagIds; 
        private String triggerTemplateId; 
        private java.util.List<String> trustedProcessGroupIds; 
        private String trustedProcessStatus; 
        private java.util.List<String> trustedSoftwareIds; 
        private java.util.List<String> userGroupIds; 
        private String userGroupMode; 

        private Builder() {
            super();
        } 

        private Builder(CreatePrivateAccessPolicyRequest request) {
            super(request);
            this.applicationIds = request.applicationIds;
            this.applicationType = request.applicationType;
            this.customUserAttributes = request.customUserAttributes;
            this.description = request.description;
            this.deviceAttributeAction = request.deviceAttributeAction;
            this.deviceAttributeId = request.deviceAttributeId;
            this.name = request.name;
            this.policyAction = request.policyAction;
            this.priority = request.priority;
            this.status = request.status;
            this.tagIds = request.tagIds;
            this.triggerTemplateId = request.triggerTemplateId;
            this.trustedProcessGroupIds = request.trustedProcessGroupIds;
            this.trustedProcessStatus = request.trustedProcessStatus;
            this.trustedSoftwareIds = request.trustedSoftwareIds;
            this.userGroupIds = request.userGroupIds;
            this.userGroupMode = request.userGroupMode;
        } 

        /**
         * <p>Set of application IDs for the private access policy. Up to 100 application IDs can be entered. Required when <strong>ApplicationType</strong> is <strong>Application</strong>. Mutually exclusive with <strong>TagIds</strong>.</p>
         */
        public Builder applicationIds(java.util.List<String> applicationIds) {
            this.putBodyParameter("ApplicationIds", applicationIds);
            this.applicationIds = applicationIds;
            return this;
        }

        /**
         * <p>Application type of the private access policy. Values:</p>
         * <ul>
         * <li><strong>Application</strong>: Application.</li>
         * <li><strong>Tag</strong>: Tag.</li>
         * </ul>
         * <p>This parameter is required.</p>
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
         * <p>Set of custom user groups for the private access policy. Required when the user group type is <strong>Custom</strong>. Mutually exclusive with the user group ID set. Up to 10 custom user groups can be entered.</p>
         */
        public Builder customUserAttributes(java.util.List<CustomUserAttributes> customUserAttributes) {
            this.putBodyParameter("CustomUserAttributes", customUserAttributes);
            this.customUserAttributes = customUserAttributes;
            return this;
        }

        /**
         * <p>Description of the private access policy. The length is 1 to 128 characters, supporting Chinese and uppercase and lowercase English letters, and can include numbers, periods (.), underscores (_), hyphens (-), and spaces.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        public Builder description(String description) {
            this.putBodyParameter("Description", description);
            this.description = description;
            return this;
        }

        /**
         * <p>The execution policy for not meeting the security baseline. Values:</p>
         * <ul>
         * <li><strong>Block</strong>: Block.</li>
         * <li><strong>Observe</strong>: Observe.</li>
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
         * <p>Name of the private access policy. The length is 1 to 128 characters, supporting Chinese and uppercase and lowercase English letters, and can include numbers, periods (.), underscores (_), and hyphens (-).</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>private_access_policy_name</p>
         */
        public Builder name(String name) {
            this.putBodyParameter("Name", name);
            this.name = name;
            return this;
        }

        /**
         * <p>Action of the private access policy. Values:</p>
         * <ul>
         * <li><strong>Block</strong>: Block.</li>
         * <li><strong>Allow</strong>: Allow.</li>
         * </ul>
         * <p>This parameter is required.</p>
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
         * <p>The priority of the private access policy. The number 1 indicates the highest priority. Range: 1~1000, with the maximum value being the total number of private access policies.</p>
         * <p>This parameter is required.</p>
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
         * <p>The status of the private access policy. Values:</p>
         * <ul>
         * <li><strong>Enabled</strong>: Enabled.</li>
         * <li><strong>Disabled</strong>: Disabled.</li>
         * </ul>
         * <p>This parameter is required.</p>
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
         * <p>Set of tag IDs for the private access policy. Up to 100 tag IDs can be entered. Required when <strong>ApplicationType</strong> is <strong>Tag</strong>. Mutually exclusive with <strong>ApplicationIds</strong>.</p>
         */
        public Builder tagIds(java.util.List<String> tagIds) {
            this.putBodyParameter("TagIds", tagIds);
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
            this.putBodyParameter("TriggerTemplateId", triggerTemplateId);
            this.triggerTemplateId = triggerTemplateId;
            return this;
        }

        /**
         * <p>The ID of the trusted process group.</p>
         */
        public Builder trustedProcessGroupIds(java.util.List<String> trustedProcessGroupIds) {
            this.putBodyParameter("TrustedProcessGroupIds", trustedProcessGroupIds);
            this.trustedProcessGroupIds = trustedProcessGroupIds;
            return this;
        }

        /**
         * <p>The switch status of the trusted process. Values:</p>
         * <ul>
         * <li><strong>Enabled</strong>: Enabled.</li>
         * <li><strong>Disabled</strong>: Disabled.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Enabled</p>
         */
        public Builder trustedProcessStatus(String trustedProcessStatus) {
            this.putBodyParameter("TrustedProcessStatus", trustedProcessStatus);
            this.trustedProcessStatus = trustedProcessStatus;
            return this;
        }

        /**
         * <p>The ID of the trusted software.</p>
         */
        public Builder trustedSoftwareIds(java.util.List<String> trustedSoftwareIds) {
            this.putBodyParameter("TrustedSoftwareIds", trustedSoftwareIds);
            this.trustedSoftwareIds = trustedSoftwareIds;
            return this;
        }

        /**
         * <p>Set of user group IDs for the private access policy. Required when the user group type is <strong>Normal</strong>. Mutually exclusive with the custom user group set. Up to 2000 user group IDs can be entered.</p>
         */
        public Builder userGroupIds(java.util.List<String> userGroupIds) {
            this.putBodyParameter("UserGroupIds", userGroupIds);
            this.userGroupIds = userGroupIds;
            return this;
        }

        /**
         * <p>User group type of the private access policy. Values:</p>
         * <ul>
         * <li><strong>Normal</strong>: Normal user group.</li>
         * <li><strong>Custom</strong>: Custom user group.</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>Normal</p>
         */
        public Builder userGroupMode(String userGroupMode) {
            this.putBodyParameter("UserGroupMode", userGroupMode);
            this.userGroupMode = userGroupMode;
            return this;
        }

        @Override
        public CreatePrivateAccessPolicyRequest build() {
            return new CreatePrivateAccessPolicyRequest(this);
        } 

    } 

    /**
     * 
     * {@link CreatePrivateAccessPolicyRequest} extends {@link TeaModel}
     *
     * <p>CreatePrivateAccessPolicyRequest</p>
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
             * <p>The ID of the identity source for the custom user group. Required when the custom user group type is <strong>department</strong>.</p>
             * 
             * <strong>example:</strong>
             * <p>12</p>
             */
            public Builder idpId(Integer idpId) {
                this.idpId = idpId;
                return this;
            }

            /**
             * <p>Relation of the custom user group. Values:</p>
             * <ul>
             * <li><strong>Equal</strong>: Equal.</li>
             * <li><strong>Unequal</strong>: Not equal.</li>
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
             * <p>Value of the custom user group attribute.</p>
             * <ul>
             * <li>When the user group type is <strong>username</strong>, it represents the value of the username. The length is 1 to 128 characters, supporting Chinese and uppercase and lowercase English letters, and can include numbers, periods (.), underscores (_), hyphens (-), asterisks (*), at (@) symbols, and spaces.</li>
             * <li>When the user group type is <strong>department</strong>, it represents the value of the department. For example: OU=Department1,OU=SASE DingTalk.</li>
             * <li>When the user group type is <strong>email</strong>, it represents the value of the email. For example: <a href="mailto:username@example.com">username@example.com</a>.</li>
             * <li>When the user group type is <strong>telephone</strong>, it represents the value of the telephone. For example: 13900001234.</li>
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
}
