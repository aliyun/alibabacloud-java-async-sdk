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
 * {@link ListPrivateAccessPolicesResponseBody} extends {@link TeaModel}
 *
 * <p>ListPrivateAccessPolicesResponseBody</p>
 */
public class ListPrivateAccessPolicesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Polices")
    private java.util.List<Polices> polices;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalNum")
    private Integer totalNum;

    private ListPrivateAccessPolicesResponseBody(Builder builder) {
        this.polices = builder.polices;
        this.requestId = builder.requestId;
        this.totalNum = builder.totalNum;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListPrivateAccessPolicesResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
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

    /**
     * @return totalNum
     */
    public Integer getTotalNum() {
        return this.totalNum;
    }

    public static final class Builder {
        private java.util.List<Polices> polices; 
        private String requestId; 
        private Integer totalNum; 

        private Builder() {
        } 

        private Builder(ListPrivateAccessPolicesResponseBody model) {
            this.polices = model.polices;
            this.requestId = model.requestId;
            this.totalNum = model.totalNum;
        } 

        /**
         * <p>The private access policies.</p>
         */
        public Builder polices(java.util.List<Polices> polices) {
            this.polices = polices;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>748CFDC7-1EB6-5B8B-9405-DA76ED5BB60D</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The total number of private access policies.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder totalNum(Integer totalNum) {
            this.totalNum = totalNum;
            return this;
        }

        public ListPrivateAccessPolicesResponseBody build() {
            return new ListPrivateAccessPolicesResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListPrivateAccessPolicesResponseBody} extends {@link TeaModel}
     *
     * <p>ListPrivateAccessPolicesResponseBody</p>
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
             * <p>The ID of the identity provider (IdP) for the user group. If the value of UserGroupType is <strong>department</strong>, this parameter is returned.</p>
             * 
             * <strong>example:</strong>
             * <p>12</p>
             */
            public Builder idpId(Integer idpId) {
                this.idpId = idpId;
                return this;
            }

            /**
             * <p>The logical operator for the user group. Valid values:</p>
             * <ul>
             * <li><strong>Equal</strong></li>
             * <li><strong>Unequal</strong></li>
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
             * <p>The type of the user group, which is the key of the attribute. Valid values:</p>
             * <ul>
             * <li><strong>username</strong></li>
             * <li><strong>department</strong></li>
             * <li><strong>email</strong></li>
             * <li><strong>telephone</strong></li>
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
             * <p>The value of the attribute.</p>
             * <ul>
             * <li>If the value of UserGroupType is <strong>username</strong>, the value of this parameter is a username. The value must be 1 to 128 characters in length and can contain letters, digits, hyphens (-), underscores (_), and periods (.).</li>
             * <li>If the value of UserGroupType is <strong>department</strong>, the value of this parameter is a department. Examples: OU=Department 1, OU=SASE DingTalk.</li>
             * <li>If the value of UserGroupType is <strong>email</strong>, the value of this parameter is an email address. Example: <a href="mailto:username@example.com">username@example.com</a>.</li>
             * <li>If the value of UserGroupType is <strong>telephone</strong>, the value of this parameter is a mobile phone number. Example: 13900001234.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>OU=Department 1, OU=SASE DingTalk</p>
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
     * {@link ListPrivateAccessPolicesResponseBody} extends {@link TeaModel}
     *
     * <p>ListPrivateAccessPolicesResponseBody</p>
     */
    public static class Polices extends TeaModel {
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

        @com.aliyun.core.annotation.NameInMap("UserGroupIds")
        private java.util.List<String> userGroupIds;

        @com.aliyun.core.annotation.NameInMap("UserGroupMode")
        private String userGroupMode;

        private Polices(Builder builder) {
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
            this.userGroupIds = builder.userGroupIds;
            this.userGroupMode = builder.userGroupMode;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Polices create() {
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
            private String triggerTemplateId; 
            private java.util.List<String> userGroupIds; 
            private String userGroupMode; 

            private Builder() {
            } 

            private Builder(Polices model) {
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
                this.userGroupIds = model.userGroupIds;
                this.userGroupMode = model.userGroupMode;
            } 

            /**
             * <p>The IDs of the applications that are specified in the private access policy. If the value of ApplicationType is <strong>Application</strong>, this parameter is returned.</p>
             */
            public Builder applicationIds(java.util.List<String> applicationIds) {
                this.applicationIds = applicationIds;
                return this;
            }

            /**
             * <p>The application type of the private access policy. Valid values:</p>
             * <ul>
             * <li><strong>Application</strong></li>
             * <li><strong>Tag</strong></li>
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
             * <p>The creation time of the private access policy.</p>
             * 
             * <strong>example:</strong>
             * <p>2022-07-10 15:50:23</p>
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * <p>The attributes of the custom user group. The attributes of the custom user group are evaluated by using a logical OR. If an attribute is matched, the policy takes effect.</p>
             */
            public Builder customUserAttributes(java.util.List<CustomUserAttributes> customUserAttributes) {
                this.customUserAttributes = customUserAttributes;
                return this;
            }

            /**
             * <p>The description of the private access policy.</p>
             * 
             * <strong>example:</strong>
             * <p>a private access policy</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>The action that is performed when the security baseline is not met. Valid values:</p>
             * <ul>
             * <li><strong>Block</strong></li>
             * <li><strong>Observe</strong></li>
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
             * <p>The ID of the security baseline.</p>
             * 
             * <strong>example:</strong>
             * <p>dag-d3f64e8bdd4a****</p>
             */
            public Builder deviceAttributeId(String deviceAttributeId) {
                this.deviceAttributeId = deviceAttributeId;
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
             * <p>The action in the private access policy. Valid values:</p>
             * <ul>
             * <li><strong>Block</strong></li>
             * <li><strong>Allow</strong></li>
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
             * <p>pa-policy-63b2f1844b86****</p>
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
             * <li><strong>Enabled</strong></li>
             * <li><strong>Disabled</strong></li>
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
             * <p>The IDs of the tags that are specified in the private access policy. If the value of ApplicationType is <strong>Tag</strong>, this parameter is returned.</p>
             */
            public Builder tagIds(java.util.List<String> tagIds) {
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
                this.triggerTemplateId = triggerTemplateId;
                return this;
            }

            /**
             * <p>The IDs of user groups in the private access policy. If the value of UserGroupMode is <strong>Normal</strong>, this parameter is returned.</p>
             */
            public Builder userGroupIds(java.util.List<String> userGroupIds) {
                this.userGroupIds = userGroupIds;
                return this;
            }

            /**
             * <p>The type of the user group in the private access policy. Valid values:</p>
             * <ul>
             * <li><strong>Normal</strong>: regular user group.</li>
             * <li><strong>Custom</strong>: custom user group.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Normal</p>
             */
            public Builder userGroupMode(String userGroupMode) {
                this.userGroupMode = userGroupMode;
                return this;
            }

            public Polices build() {
                return new Polices(this);
            } 

        } 

    }
}
