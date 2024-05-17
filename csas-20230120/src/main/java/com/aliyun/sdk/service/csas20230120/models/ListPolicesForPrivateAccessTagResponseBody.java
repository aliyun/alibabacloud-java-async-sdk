// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.csas20230120.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListPolicesForPrivateAccessTagResponseBody} extends {@link TeaModel}
 *
 * <p>ListPolicesForPrivateAccessTagResponseBody</p>
 */
public class ListPolicesForPrivateAccessTagResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Tags")
    private java.util.List < Tags> tags;

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

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return tags
     */
    public java.util.List < Tags> getTags() {
        return this.tags;
    }

    public static final class Builder {
        private String requestId; 
        private java.util.List < Tags> tags; 

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Tags.
         */
        public Builder tags(java.util.List < Tags> tags) {
            this.tags = tags;
            return this;
        }

        public ListPolicesForPrivateAccessTagResponseBody build() {
            return new ListPolicesForPrivateAccessTagResponseBody(this);
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
             * 用户组的身份源ID。当自定义用户组类型为**department**时，存在该值。
             */
            public Builder idpId(Integer idpId) {
                this.idpId = idpId;
                return this;
            }

            /**
             * 用户组的关系。取值：
             * <p>
             * - **Equal**：等于。
             * - **Unequal**：不等于。
             */
            public Builder relation(String relation) {
                this.relation = relation;
                return this;
            }

            /**
             * 用户组的类型。取值：
             * <p>
             * - **username**：用户名。
             * - **department**：部门。
             * - **email**：邮箱。
             * - **telephone**：手机。
             */
            public Builder userGroupType(String userGroupType) {
                this.userGroupType = userGroupType;
                return this;
            }

            /**
             * 用户组属性的值。
             * <p>
             * - 当用户组类型为**username**时，表示用户名的值。长度为1~128个字符，支持中文和大小写英文字母，可包含数字、半角句号（.）、下划线（_）和短划线（-）。
             * - 当用户组类型为**department**时，表示部门的值。如：OU=部门1,OU=SASE钉钉。
             * - 当用户组类型为**email**时，表示邮箱的值。如：username@example.com。
             * - 当用户组类型为**telephone**时，表示手机的值。如：13900001234。
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
    public static class Polices extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ApplicationType")
        private String applicationType;

        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private String createTime;

        @com.aliyun.core.annotation.NameInMap("CustomUserAttributes")
        private java.util.List < CustomUserAttributes> customUserAttributes;

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
            private java.util.List < CustomUserAttributes> customUserAttributes; 
            private String description; 
            private String name; 
            private String policyAction; 
            private String policyId; 
            private Integer priority; 
            private String status; 
            private String userGroupType; 

            /**
             * ApplicationType.
             */
            public Builder applicationType(String applicationType) {
                this.applicationType = applicationType;
                return this;
            }

            /**
             * 内网访问策略创建时间。
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * 自定义用户组属性集合。多个自定义用户组属性之间是或的关系，按照合集生效。
             */
            public Builder customUserAttributes(java.util.List < CustomUserAttributes> customUserAttributes) {
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
             * 用户组的类型。取值：
             * <p>
             * - **username**：用户名。
             * - **department**：部门。
             * - **email**：邮箱。
             * - **telephone**：手机。
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
    public static class Tags extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Polices")
        private java.util.List < Polices> polices;

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
        public java.util.List < Polices> getPolices() {
            return this.polices;
        }

        /**
         * @return tagId
         */
        public String getTagId() {
            return this.tagId;
        }

        public static final class Builder {
            private java.util.List < Polices> polices; 
            private String tagId; 

            /**
             * Polices.
             */
            public Builder polices(java.util.List < Polices> polices) {
                this.polices = polices;
                return this;
            }

            /**
             * TagId.
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
