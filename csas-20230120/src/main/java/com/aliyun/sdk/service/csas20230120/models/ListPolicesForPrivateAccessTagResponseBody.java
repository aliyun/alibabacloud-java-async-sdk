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
 * {@link ListPolicesForPrivateAccessTagResponseBody} extends {@link TeaModel}
 *
 * <p>ListPolicesForPrivateAccessTagResponseBody</p>
 */
public class ListPolicesForPrivateAccessTagResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Tags")
    private java.util.List<Tags> tags;

    private ListPolicesForPrivateAccessTagResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.tags = builder.tags;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListPolicesForPrivateAccessTagResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return tags
     */
    public java.util.List<Tags> getTags() {
        return this.tags;
    }

    public static final class Builder {
        private String requestId; 
        private java.util.List<Tags> tags; 

        private Builder() {
        } 

        private Builder(ListPolicesForPrivateAccessTagResponseBody model) {
            this.requestId = model.requestId;
            this.tags = model.tags;
        } 

        /**
         * <p>The ID of this request.</p>
         * 
         * <strong>example:</strong>
         * <p>4D169859-A4F2-5EC8-853B-8447787C0D8A</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>List of private network access tags.</p>
         */
        public Builder tags(java.util.List<Tags> tags) {
            this.tags = tags;
            return this;
        }

        public ListPolicesForPrivateAccessTagResponseBody build() {
            return new ListPolicesForPrivateAccessTagResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListPolicesForPrivateAccessTagResponseBody} extends {@link TeaModel}
     *
     * <p>ListPolicesForPrivateAccessTagResponseBody</p>
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
             * <p>The identity provider ID of the user group. This value exists if the custom user group type is <strong>department</strong>.</p>
             * 
             * <strong>example:</strong>
             * <p>12</p>
             */
            public Builder idpId(Integer idpId) {
                this.idpId = idpId;
                return this;
            }

            /**
             * <p>The relationship of the user group. Values:</p>
             * <ul>
             * <li><p><strong>Equal</strong>: Equal.</p>
             * </li>
             * <li><p><strong>Unequal</strong>: Unequal.</p>
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
             * <p>The type of user group. Values:</p>
             * <ul>
             * <li><p><strong>username</strong>: Username.</p>
             * </li>
             * <li><p><strong>department</strong>: Department.</p>
             * </li>
             * <li><p><strong>email</strong>: Mailbox.</p>
             * </li>
             * <li><p><strong>telephone</strong>: Mobile phone.</p>
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
             * <li><p>If the user group type is <strong>username</strong>, this indicates the username\&quot;s value. The length is 1 to 128 characters. It supports Chinese characters, uppercase and lowercase English letters, and can include numbers, periods (.), underscores (_), and hyphens (-).</p>
             * </li>
             * <li><p>If the user group type is <strong>department</strong>, this indicates the department\&quot;s value. For example: OU=Department 1,OU=SASE DingTalk.</p>
             * </li>
             * <li><p>If the user group type is <strong>email</strong>, this indicates the mailbox\&quot;s value. For example: username\@example.com.</p>
             * </li>
             * <li><p>If the user group type is <strong>telephone</strong>, this indicates the mobile phone\&quot;s value. For example: 13900001234.</p>
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
     * {@link ListPolicesForPrivateAccessTagResponseBody} extends {@link TeaModel}
     *
     * <p>ListPolicesForPrivateAccessTagResponseBody</p>
     */
    public static class Polices extends TeaModel {
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

        private Polices(Builder builder) {
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

        public static Polices create() {
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

            private Builder(Polices model) {
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
             * <p>The application type of the private network access policy. Values:</p>
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
             * <p>Creation time of the private network access policy.</p>
             * 
             * <strong>example:</strong>
             * <p>2023-02-21 14:10:16</p>
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * <p>A collection of custom user group attributes. Multiple custom user group attributes have an OR relationship and take effect as a union.</p>
             */
            public Builder customUserAttributes(java.util.List<CustomUserAttributes> customUserAttributes) {
                this.customUserAttributes = customUserAttributes;
                return this;
            }

            /**
             * <p>Description of the private network access policy.</p>
             * 
             * <strong>example:</strong>
             * <p>这是一条内网访问策略</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>Private network access policy name.</p>
             * 
             * <strong>example:</strong>
             * <p>private_access_policy_name</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The action that the private access policy performs. Valid values:</p>
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
             * <p>Private network access policy ID.</p>
             * 
             * <strong>example:</strong>
             * <p>pa-policy-867ef4007c8a****</p>
             */
            public Builder policyId(String policyId) {
                this.policyId = policyId;
                return this;
            }

            /**
             * <p>The private network access policy priority. The number 1 indicates the highest priority.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder priority(Integer priority) {
                this.priority = priority;
                return this;
            }

            /**
             * <p>The status of the private network access policy. Values:</p>
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
                this.status = status;
                return this;
            }

            /**
             * <p>The user group type of the private network access policy. Values:</p>
             * <ul>
             * <li><p><strong>Normal</strong>: Normal user group.</p>
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

            public Polices build() {
                return new Polices(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListPolicesForPrivateAccessTagResponseBody} extends {@link TeaModel}
     *
     * <p>ListPolicesForPrivateAccessTagResponseBody</p>
     */
    public static class Tags extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Polices")
        private java.util.List<Polices> polices;

        @com.aliyun.core.annotation.NameInMap("TagId")
        private String tagId;

        private Tags(Builder builder) {
            this.polices = builder.polices;
            this.tagId = builder.tagId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Tags create() {
            return builder().build();
        }

        /**
         * @return polices
         */
        public java.util.List<Polices> getPolices() {
            return this.polices;
        }

        /**
         * @return tagId
         */
        public String getTagId() {
            return this.tagId;
        }

        public static final class Builder {
            private java.util.List<Polices> polices; 
            private String tagId; 

            private Builder() {
            } 

            private Builder(Tags model) {
                this.polices = model.polices;
                this.tagId = model.tagId;
            } 

            /**
             * <p>Collection of private network access policies.</p>
             */
            public Builder polices(java.util.List<Polices> polices) {
                this.polices = polices;
                return this;
            }

            /**
             * <p>Private network access tag ID.</p>
             * 
             * <strong>example:</strong>
             * <p>tag-b927baf3e592****</p>
             */
            public Builder tagId(String tagId) {
                this.tagId = tagId;
                return this;
            }

            public Tags build() {
                return new Tags(this);
            } 

        } 

    }
}
