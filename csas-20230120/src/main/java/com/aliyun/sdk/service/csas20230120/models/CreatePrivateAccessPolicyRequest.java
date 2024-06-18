// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.csas20230120.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreatePrivateAccessPolicyRequest} extends {@link RequestModel}
 *
 * <p>CreatePrivateAccessPolicyRequest</p>
 */
public class CreatePrivateAccessPolicyRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ApplicationIds")
    private java.util.List < String > applicationIds;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ApplicationType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String applicationType;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("CustomUserAttributes")
    private java.util.List < CustomUserAttributes> customUserAttributes;

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
    private java.util.List < String > tagIds;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("UserGroupIds")
    private java.util.List < String > userGroupIds;

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
    public java.util.List < String > getApplicationIds() {
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
    public java.util.List < CustomUserAttributes> getCustomUserAttributes() {
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
    public java.util.List < String > getTagIds() {
        return this.tagIds;
    }

    /**
     * @return userGroupIds
     */
    public java.util.List < String > getUserGroupIds() {
        return this.userGroupIds;
    }

    /**
     * @return userGroupMode
     */
    public String getUserGroupMode() {
        return this.userGroupMode;
    }

    public static final class Builder extends Request.Builder<CreatePrivateAccessPolicyRequest, Builder> {
        private java.util.List < String > applicationIds; 
        private String applicationType; 
        private java.util.List < CustomUserAttributes> customUserAttributes; 
        private String description; 
        private String deviceAttributeAction; 
        private String deviceAttributeId; 
        private String name; 
        private String policyAction; 
        private Integer priority; 
        private String status; 
        private java.util.List < String > tagIds; 
        private java.util.List < String > userGroupIds; 
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
            this.userGroupIds = request.userGroupIds;
            this.userGroupMode = request.userGroupMode;
        } 

        /**
         * ApplicationIds.
         */
        public Builder applicationIds(java.util.List < String > applicationIds) {
            this.putBodyParameter("ApplicationIds", applicationIds);
            this.applicationIds = applicationIds;
            return this;
        }

        /**
         * ApplicationType.
         */
        public Builder applicationType(String applicationType) {
            this.putBodyParameter("ApplicationType", applicationType);
            this.applicationType = applicationType;
            return this;
        }

        /**
         * CustomUserAttributes.
         */
        public Builder customUserAttributes(java.util.List < CustomUserAttributes> customUserAttributes) {
            this.putBodyParameter("CustomUserAttributes", customUserAttributes);
            this.customUserAttributes = customUserAttributes;
            return this;
        }

        /**
         * Description.
         */
        public Builder description(String description) {
            this.putBodyParameter("Description", description);
            this.description = description;
            return this;
        }

        /**
         * DeviceAttributeAction.
         */
        public Builder deviceAttributeAction(String deviceAttributeAction) {
            this.putBodyParameter("DeviceAttributeAction", deviceAttributeAction);
            this.deviceAttributeAction = deviceAttributeAction;
            return this;
        }

        /**
         * DeviceAttributeId.
         */
        public Builder deviceAttributeId(String deviceAttributeId) {
            this.putBodyParameter("DeviceAttributeId", deviceAttributeId);
            this.deviceAttributeId = deviceAttributeId;
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
         * PolicyAction.
         */
        public Builder policyAction(String policyAction) {
            this.putBodyParameter("PolicyAction", policyAction);
            this.policyAction = policyAction;
            return this;
        }

        /**
         * Priority.
         */
        public Builder priority(Integer priority) {
            this.putBodyParameter("Priority", priority);
            this.priority = priority;
            return this;
        }

        /**
         * Status.
         */
        public Builder status(String status) {
            this.putBodyParameter("Status", status);
            this.status = status;
            return this;
        }

        /**
         * 内网访问标签ID集合。最多可输入100个内网访问标签ID。当**ApplicationType**为**Tag时**，必填。和**ApplicationIds**互斥。
         */
        public Builder tagIds(java.util.List < String > tagIds) {
            this.putBodyParameter("TagIds", tagIds);
            this.tagIds = tagIds;
            return this;
        }

        /**
         * UserGroupIds.
         */
        public Builder userGroupIds(java.util.List < String > userGroupIds) {
            this.putBodyParameter("UserGroupIds", userGroupIds);
            this.userGroupIds = userGroupIds;
            return this;
        }

        /**
         * 内网访问策略的用户组类型。取值：
         * <p>
         * - **Normal**：普通用户组。
         * - **Custom**：自定义用户组。
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
}
