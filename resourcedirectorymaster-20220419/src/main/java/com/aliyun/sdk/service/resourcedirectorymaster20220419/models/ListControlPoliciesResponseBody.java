// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.resourcedirectorymaster20220419.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListControlPoliciesResponseBody} extends {@link TeaModel}
 *
 * <p>ListControlPoliciesResponseBody</p>
 */
public class ListControlPoliciesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("ControlPolicies")
    private ControlPolicies controlPolicies;

    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Integer pageNumber;

    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Integer totalCount;

    private ListControlPoliciesResponseBody(Builder builder) {
        this.controlPolicies = builder.controlPolicies;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListControlPoliciesResponseBody create() {
        return builder().build();
    }

    /**
     * @return controlPolicies
     */
    public ControlPolicies getControlPolicies() {
        return this.controlPolicies;
    }

    /**
     * @return pageNumber
     */
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return totalCount
     */
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private ControlPolicies controlPolicies; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String requestId; 
        private Integer totalCount; 

        /**
         * The information of the access control policies.
         */
        public Builder controlPolicies(ControlPolicies controlPolicies) {
            this.controlPolicies = controlPolicies;
            return this;
        }

        /**
         * The page number of the returned page.
         */
        public Builder pageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * The number of entries returned per page.
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * The number of access control policies.
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public ListControlPoliciesResponseBody build() {
            return new ListControlPoliciesResponseBody(this);
        } 

    } 

    public static class ControlPolicy extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AttachmentCount")
        private String attachmentCount;

        @com.aliyun.core.annotation.NameInMap("CreateDate")
        private String createDate;

        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("EffectScope")
        private String effectScope;

        @com.aliyun.core.annotation.NameInMap("PolicyId")
        private String policyId;

        @com.aliyun.core.annotation.NameInMap("PolicyName")
        private String policyName;

        @com.aliyun.core.annotation.NameInMap("PolicyType")
        private String policyType;

        @com.aliyun.core.annotation.NameInMap("UpdateDate")
        private String updateDate;

        private ControlPolicy(Builder builder) {
            this.attachmentCount = builder.attachmentCount;
            this.createDate = builder.createDate;
            this.description = builder.description;
            this.effectScope = builder.effectScope;
            this.policyId = builder.policyId;
            this.policyName = builder.policyName;
            this.policyType = builder.policyType;
            this.updateDate = builder.updateDate;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ControlPolicy create() {
            return builder().build();
        }

        /**
         * @return attachmentCount
         */
        public String getAttachmentCount() {
            return this.attachmentCount;
        }

        /**
         * @return createDate
         */
        public String getCreateDate() {
            return this.createDate;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return effectScope
         */
        public String getEffectScope() {
            return this.effectScope;
        }

        /**
         * @return policyId
         */
        public String getPolicyId() {
            return this.policyId;
        }

        /**
         * @return policyName
         */
        public String getPolicyName() {
            return this.policyName;
        }

        /**
         * @return policyType
         */
        public String getPolicyType() {
            return this.policyType;
        }

        /**
         * @return updateDate
         */
        public String getUpdateDate() {
            return this.updateDate;
        }

        public static final class Builder {
            private String attachmentCount; 
            private String createDate; 
            private String description; 
            private String effectScope; 
            private String policyId; 
            private String policyName; 
            private String policyType; 
            private String updateDate; 

            /**
             * The number of times that the access control policy is referenced.
             */
            public Builder attachmentCount(String attachmentCount) {
                this.attachmentCount = attachmentCount;
                return this;
            }

            /**
             * The time when the access control policy was created.
             */
            public Builder createDate(String createDate) {
                this.createDate = createDate;
                return this;
            }

            /**
             * The description of the access control policy.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * The effective scope of the access control policy. Valid values:
             * <p>
             * 
             * *   All: The access control policy is in effect for Alibaba Cloud accounts, RAM users, and RAM roles.
             * *   RAM: The access control policy is in effect only for RAM users and RAM roles.
             */
            public Builder effectScope(String effectScope) {
                this.effectScope = effectScope;
                return this;
            }

            /**
             * The ID of the access control policy.
             */
            public Builder policyId(String policyId) {
                this.policyId = policyId;
                return this;
            }

            /**
             * The name of the access control policy.
             */
            public Builder policyName(String policyName) {
                this.policyName = policyName;
                return this;
            }

            /**
             * The type of the access control policy. Valid values:
             * <p>
             * 
             * *   System: system access control policy
             * *   Custom: custom access control policy
             */
            public Builder policyType(String policyType) {
                this.policyType = policyType;
                return this;
            }

            /**
             * The time when the access control policy was updated.
             */
            public Builder updateDate(String updateDate) {
                this.updateDate = updateDate;
                return this;
            }

            public ControlPolicy build() {
                return new ControlPolicy(this);
            } 

        } 

    }
    public static class ControlPolicies extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ControlPolicy")
        private java.util.List < ControlPolicy> controlPolicy;

        private ControlPolicies(Builder builder) {
            this.controlPolicy = builder.controlPolicy;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ControlPolicies create() {
            return builder().build();
        }

        /**
         * @return controlPolicy
         */
        public java.util.List < ControlPolicy> getControlPolicy() {
            return this.controlPolicy;
        }

        public static final class Builder {
            private java.util.List < ControlPolicy> controlPolicy; 

            /**
             * ControlPolicy.
             */
            public Builder controlPolicy(java.util.List < ControlPolicy> controlPolicy) {
                this.controlPolicy = controlPolicy;
                return this;
            }

            public ControlPolicies build() {
                return new ControlPolicies(this);
            } 

        } 

    }
}
