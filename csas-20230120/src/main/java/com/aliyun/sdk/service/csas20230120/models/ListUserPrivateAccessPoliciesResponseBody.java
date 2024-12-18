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

        /**
         * Polices.
         */
        public Builder polices(java.util.List<Polices> polices) {
            this.polices = polices;
            return this;
        }

        /**
         * <p>Id of the request</p>
         * 
         * <strong>example:</strong>
         * <p>9D852F87-AFB5-51B8-AACD-F7D0EFB8277D</p>
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
            private String userGroupMode; 

            /**
             * CustomUserAttributes.
             */
            public Builder customUserAttributes(java.util.List<CustomUserAttributes> customUserAttributes) {
                this.customUserAttributes = customUserAttributes;
                return this;
            }

            /**
             * DeviceAttributeName.
             */
            public Builder deviceAttributeName(String deviceAttributeName) {
                this.deviceAttributeName = deviceAttributeName;
                return this;
            }

            /**
             * MatchedUserGroup.
             */
            public Builder matchedUserGroup(String matchedUserGroup) {
                this.matchedUserGroup = matchedUserGroup;
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
            public Builder priority(Long priority) {
                this.priority = priority;
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
