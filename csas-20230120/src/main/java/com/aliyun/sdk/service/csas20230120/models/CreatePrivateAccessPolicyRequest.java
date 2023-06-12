// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.csas20230120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreatePrivateAccessPolicyRequest} extends {@link RequestModel}
 *
 * <p>CreatePrivateAccessPolicyRequest</p>
 */
public class CreatePrivateAccessPolicyRequest extends Request {
    @Body
    @NameInMap("ApplicationIds")
    private java.util.List < String > applicationIds;

    @Body
    @NameInMap("ApplicationType")
    @Validation(required = true)
    private String applicationType;

    @Body
    @NameInMap("CustomUserAttributes")
    private java.util.List < CustomUserAttributes> customUserAttributes;

    @Body
    @NameInMap("Description")
    private String description;

    @Body
    @NameInMap("Name")
    @Validation(required = true)
    private String name;

    @Body
    @NameInMap("PolicyAction")
    @Validation(required = true)
    private String policyAction;

    @Body
    @NameInMap("Priority")
    @Validation(required = true)
    private Integer priority;

    @Body
    @NameInMap("Status")
    @Validation(required = true)
    private String status;

    @Body
    @NameInMap("TagIds")
    private java.util.List < String > tagIds;

    @Body
    @NameInMap("UserGroupIds")
    private java.util.List < String > userGroupIds;

    @Body
    @NameInMap("UserGroupMode")
    @Validation(required = true)
    private String userGroupMode;

    private CreatePrivateAccessPolicyRequest(Builder builder) {
        super(builder);
        this.applicationIds = builder.applicationIds;
        this.applicationType = builder.applicationType;
        this.customUserAttributes = builder.customUserAttributes;
        this.description = builder.description;
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
            String applicationIdsShrink = shrink(applicationIds, "ApplicationIds", "json");
            this.putBodyParameter("ApplicationIds", applicationIdsShrink);
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
            String customUserAttributesShrink = shrink(customUserAttributes, "CustomUserAttributes", "json");
            this.putBodyParameter("CustomUserAttributes", customUserAttributesShrink);
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
            String tagIdsShrink = shrink(tagIds, "TagIds", "json");
            this.putBodyParameter("TagIds", tagIdsShrink);
            this.tagIds = tagIds;
            return this;
        }

        /**
         * UserGroupIds.
         */
        public Builder userGroupIds(java.util.List < String > userGroupIds) {
            String userGroupIdsShrink = shrink(userGroupIds, "UserGroupIds", "json");
            this.putBodyParameter("UserGroupIds", userGroupIdsShrink);
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
        @NameInMap("IdpId")
        private Integer idpId;

        @NameInMap("Relation")
        @Validation(required = true)
        private String relation;

        @NameInMap("UserGroupType")
        @Validation(required = true)
        private String userGroupType;

        @NameInMap("Value")
        @Validation(required = true)
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
