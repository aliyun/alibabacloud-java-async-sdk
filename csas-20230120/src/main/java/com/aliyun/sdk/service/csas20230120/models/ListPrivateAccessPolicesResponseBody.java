// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.csas20230120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListPrivateAccessPolicesResponseBody} extends {@link TeaModel}
 *
 * <p>ListPrivateAccessPolicesResponseBody</p>
 */
public class ListPrivateAccessPolicesResponseBody extends TeaModel {
    @NameInMap("Polices")
    private java.util.List < Polices> polices;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("TotalNum")
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

    /**
     * @return polices
     */
    public java.util.List < Polices> getPolices() {
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
        private java.util.List < Polices> polices; 
        private String requestId; 
        private Integer totalNum; 

        /**
         * Polices.
         */
        public Builder polices(java.util.List < Polices> polices) {
            this.polices = polices;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * TotalNum.
         */
        public Builder totalNum(Integer totalNum) {
            this.totalNum = totalNum;
            return this;
        }

        public ListPrivateAccessPolicesResponseBody build() {
            return new ListPrivateAccessPolicesResponseBody(this);
        } 

    } 

    public static class CustomUserAttributes extends TeaModel {
        @NameInMap("IdpId")
        private Integer idpId;

        @NameInMap("Relation")
        private String relation;

        @NameInMap("UserGroupType")
        private String userGroupType;

        @NameInMap("Value")
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
    public static class Polices extends TeaModel {
        @NameInMap("ApplicationIds")
        private java.util.List < String > applicationIds;

        @NameInMap("ApplicationType")
        private String applicationType;

        @NameInMap("CreateTime")
        private String createTime;

        @NameInMap("CustomUserAttributes")
        private java.util.List < CustomUserAttributes> customUserAttributes;

        @NameInMap("Description")
        private String description;

        @NameInMap("Name")
        private String name;

        @NameInMap("PolicyAction")
        private String policyAction;

        @NameInMap("PolicyId")
        private String policyId;

        @NameInMap("Priority")
        private Integer priority;

        @NameInMap("Status")
        private String status;

        @NameInMap("TagIds")
        private java.util.List < String > tagIds;

        @NameInMap("UserGroupIds")
        private java.util.List < String > userGroupIds;

        @NameInMap("UserGroupMode")
        private String userGroupMode;

        private Polices(Builder builder) {
            this.applicationIds = builder.applicationIds;
            this.applicationType = builder.applicationType;
            this.createTime = builder.createTime;
            this.customUserAttributes = builder.customUserAttributes;
            this.description = builder.description;
            this.name = builder.name;
            this.policyAction = builder.policyAction;
            this.policyId = builder.policyId;
            this.priority = builder.priority;
            this.status = builder.status;
            this.tagIds = builder.tagIds;
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

        public static final class Builder {
            private java.util.List < String > applicationIds; 
            private String applicationType; 
            private String createTime; 
            private java.util.List < CustomUserAttributes> customUserAttributes; 
            private String description; 
            private String name; 
            private String policyAction; 
            private String policyId; 
            private Integer priority; 
            private String status; 
            private java.util.List < String > tagIds; 
            private java.util.List < String > userGroupIds; 
            private String userGroupMode; 

            /**
             * ApplicationIds.
             */
            public Builder applicationIds(java.util.List < String > applicationIds) {
                this.applicationIds = applicationIds;
                return this;
            }

            /**
             * ApplicationType.
             */
            public Builder applicationType(String applicationType) {
                this.applicationType = applicationType;
                return this;
            }

            /**
             * CreateTime.
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * CustomUserAttributes.
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
             * TagIds.
             */
            public Builder tagIds(java.util.List < String > tagIds) {
                this.tagIds = tagIds;
                return this;
            }

            /**
             * UserGroupIds.
             */
            public Builder userGroupIds(java.util.List < String > userGroupIds) {
                this.userGroupIds = userGroupIds;
                return this;
            }

            /**
             * UserGroupMode.
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
