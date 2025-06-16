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
 * {@link ListUserPrivateAccessPoliciesResponseBody} extends {@link TeaModel}
 *
 * <p>ListUserPrivateAccessPoliciesResponseBody</p>
 */
public class ListUserPrivateAccessPoliciesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Polices")
    private java.util.List<Polices> polices;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalNum")
    private Integer totalNum;

    private ListUserPrivateAccessPoliciesResponseBody(Builder builder) {
        this.polices = builder.polices;
        this.requestId = builder.requestId;
        this.totalNum = builder.totalNum;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListUserPrivateAccessPoliciesResponseBody create() {
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

        private Builder(ListUserPrivateAccessPoliciesResponseBody model) {
            this.polices = model.polices;
            this.requestId = model.requestId;
            this.totalNum = model.totalNum;
        } 

        /**
         * <p>List of authorized policies.</p>
         */
        public Builder polices(java.util.List<Polices> polices) {
            this.polices = polices;
            return this;
        }

        /**
         * <p>ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>9D852F87-AFB5-51B8-AACD-F7D0EFB8277D</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Total number of authorized policies.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        public Builder totalNum(Integer totalNum) {
            this.totalNum = totalNum;
            return this;
        }

        public ListUserPrivateAccessPoliciesResponseBody build() {
            return new ListUserPrivateAccessPoliciesResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListUserPrivateAccessPoliciesResponseBody} extends {@link TeaModel}
     *
     * <p>ListUserPrivateAccessPoliciesResponseBody</p>
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
             * <p>The identity provider ID of the user group. This value exists when the custom user group type is <strong>department</strong>.</p>
             * 
             * <strong>example:</strong>
             * <p>12</p>
             */
            public Builder idpId(Integer idpId) {
                this.idpId = idpId;
                return this;
            }

            /**
             * <p>Relation of the user group. Values:</p>
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
             * <p>Type of the user group. Values:</p>
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
             * <p>The value of the user group attribute.</p>
             * <ul>
             * <li>When the user group type is <strong>username</strong>, it represents the value of the username. The length is 1 to 128 characters, supporting Chinese and case-sensitive English letters, and can include numbers, periods (.), underscores (_), and hyphens (-).</li>
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
     * {@link ListUserPrivateAccessPoliciesResponseBody} extends {@link TeaModel}
     *
     * <p>ListUserPrivateAccessPoliciesResponseBody</p>
     */
    public static class Polices extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CustomUserAttributes")
        private java.util.List<CustomUserAttributes> customUserAttributes;

        @com.aliyun.core.annotation.NameInMap("DeviceAttributeName")
        private String deviceAttributeName;

        @com.aliyun.core.annotation.NameInMap("MatchedUserGroup")
        private String matchedUserGroup;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("PolicyAction")
        private String policyAction;

        @com.aliyun.core.annotation.NameInMap("PolicyId")
        private String policyId;

        @com.aliyun.core.annotation.NameInMap("Priority")
        private Long priority;

        @com.aliyun.core.annotation.NameInMap("TrustedProcessGroupIds")
        private java.util.List<String> trustedProcessGroupIds;

        @com.aliyun.core.annotation.NameInMap("TrustedSoftwareIds")
        private java.util.List<String> trustedSoftwareIds;

        @com.aliyun.core.annotation.NameInMap("UserGroupMode")
        private String userGroupMode;

        private Polices(Builder builder) {
            this.customUserAttributes = builder.customUserAttributes;
            this.deviceAttributeName = builder.deviceAttributeName;
            this.matchedUserGroup = builder.matchedUserGroup;
            this.name = builder.name;
            this.policyAction = builder.policyAction;
            this.policyId = builder.policyId;
            this.priority = builder.priority;
            this.trustedProcessGroupIds = builder.trustedProcessGroupIds;
            this.trustedSoftwareIds = builder.trustedSoftwareIds;
            this.userGroupMode = builder.userGroupMode;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Polices create() {
            return builder().build();
        }

        /**
         * @return customUserAttributes
         */
        public java.util.List<CustomUserAttributes> getCustomUserAttributes() {
            return this.customUserAttributes;
        }

        /**
         * @return deviceAttributeName
         */
        public String getDeviceAttributeName() {
            return this.deviceAttributeName;
        }

        /**
         * @return matchedUserGroup
         */
        public String getMatchedUserGroup() {
            return this.matchedUserGroup;
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
        public Long getPriority() {
            return this.priority;
        }

        /**
         * @return trustedProcessGroupIds
         */
        public java.util.List<String> getTrustedProcessGroupIds() {
            return this.trustedProcessGroupIds;
        }

        /**
         * @return trustedSoftwareIds
         */
        public java.util.List<String> getTrustedSoftwareIds() {
            return this.trustedSoftwareIds;
        }

        /**
         * @return userGroupMode
         */
        public String getUserGroupMode() {
            return this.userGroupMode;
        }

        public static final class Builder {
            private java.util.List<CustomUserAttributes> customUserAttributes; 
            private String deviceAttributeName; 
            private String matchedUserGroup; 
            private String name; 
            private String policyAction; 
            private String policyId; 
            private Long priority; 
            private java.util.List<String> trustedProcessGroupIds; 
            private java.util.List<String> trustedSoftwareIds; 
            private String userGroupMode; 

            private Builder() {
            } 

            private Builder(Polices model) {
                this.customUserAttributes = model.customUserAttributes;
                this.deviceAttributeName = model.deviceAttributeName;
                this.matchedUserGroup = model.matchedUserGroup;
                this.name = model.name;
                this.policyAction = model.policyAction;
                this.policyId = model.policyId;
                this.priority = model.priority;
                this.trustedProcessGroupIds = model.trustedProcessGroupIds;
                this.trustedSoftwareIds = model.trustedSoftwareIds;
                this.userGroupMode = model.userGroupMode;
            } 

            /**
             * <p>Set of custom user group attributes. Multiple custom user group attributes are in an OR relationship, effective as a union.</p>
             */
            public Builder customUserAttributes(java.util.List<CustomUserAttributes> customUserAttributes) {
                this.customUserAttributes = customUserAttributes;
                return this;
            }

            /**
             * <p>Associated security baseline.</p>
             * 
             * <strong>example:</strong>
             * <p>device_attribute_name</p>
             */
            public Builder deviceAttributeName(String deviceAttributeName) {
                this.deviceAttributeName = deviceAttributeName;
                return this;
            }

            /**
             * <p>Associated user group.</p>
             * 
             * <strong>example:</strong>
             * <p>user_group_name</p>
             */
            public Builder matchedUserGroup(String matchedUserGroup) {
                this.matchedUserGroup = matchedUserGroup;
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
             * <p>Action of the intranet access policy. Values:</p>
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
             * <p>pa-policy-1b0d0e8b4bcf****</p>
             */
            public Builder policyId(String policyId) {
                this.policyId = policyId;
                return this;
            }

            /**
             * <p>Priority of the intranet access policy. The number 1 indicates the highest priority.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder priority(Long priority) {
                this.priority = priority;
                return this;
            }

            /**
             * <p>List of trusted process group IDs.</p>
             */
            public Builder trustedProcessGroupIds(java.util.List<String> trustedProcessGroupIds) {
                this.trustedProcessGroupIds = trustedProcessGroupIds;
                return this;
            }

            /**
             * <p>List of trusted software IDs.</p>
             */
            public Builder trustedSoftwareIds(java.util.List<String> trustedSoftwareIds) {
                this.trustedSoftwareIds = trustedSoftwareIds;
                return this;
            }

            /**
             * <p>Type of the user group for the intranet access policy. Values:</p>
             * <ul>
             * <li><strong>Normal</strong>: Normal user group.</li>
             * <li><strong>Custom</strong>: Custom user group.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Custom</p>
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
