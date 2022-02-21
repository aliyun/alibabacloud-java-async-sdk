// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.resourcemanager20200331.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListPolicyAttachmentsResponseBody} extends {@link TeaModel}
 *
 * <p>ListPolicyAttachmentsResponseBody</p>
 */
public class ListPolicyAttachmentsResponseBody extends TeaModel {
    @NameInMap("PageNumber")
    private Integer pageNumber;

    @NameInMap("PageSize")
    private Integer pageSize;

    @NameInMap("PolicyAttachments")
    private PolicyAttachments policyAttachments;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("TotalCount")
    private Integer totalCount;

    private ListPolicyAttachmentsResponseBody(Builder builder) {
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.policyAttachments = builder.policyAttachments;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListPolicyAttachmentsResponseBody create() {
        return builder().build();
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
     * @return policyAttachments
     */
    public PolicyAttachments getPolicyAttachments() {
        return this.policyAttachments;
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
        private Integer pageNumber; 
        private Integer pageSize; 
        private PolicyAttachments policyAttachments; 
        private String requestId; 
        private Integer totalCount; 

        /**
         * PageNumber.
         */
        public Builder pageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * PageSize.
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * PolicyAttachments.
         */
        public Builder policyAttachments(PolicyAttachments policyAttachments) {
            this.policyAttachments = policyAttachments;
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
         * TotalCount.
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public ListPolicyAttachmentsResponseBody build() {
            return new ListPolicyAttachmentsResponseBody(this);
        } 

    } 

    public static class PolicyAttachment extends TeaModel {
        @NameInMap("AttachDate")
        private String attachDate;

        @NameInMap("Description")
        private String description;

        @NameInMap("PolicyName")
        private String policyName;

        @NameInMap("PolicyType")
        private String policyType;

        @NameInMap("PrincipalName")
        private String principalName;

        @NameInMap("PrincipalType")
        private String principalType;

        @NameInMap("ResourceGroupId")
        private String resourceGroupId;

        private PolicyAttachment(Builder builder) {
            this.attachDate = builder.attachDate;
            this.description = builder.description;
            this.policyName = builder.policyName;
            this.policyType = builder.policyType;
            this.principalName = builder.principalName;
            this.principalType = builder.principalType;
            this.resourceGroupId = builder.resourceGroupId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static PolicyAttachment create() {
            return builder().build();
        }

        /**
         * @return attachDate
         */
        public String getAttachDate() {
            return this.attachDate;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
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
         * @return principalName
         */
        public String getPrincipalName() {
            return this.principalName;
        }

        /**
         * @return principalType
         */
        public String getPrincipalType() {
            return this.principalType;
        }

        /**
         * @return resourceGroupId
         */
        public String getResourceGroupId() {
            return this.resourceGroupId;
        }

        public static final class Builder {
            private String attachDate; 
            private String description; 
            private String policyName; 
            private String policyType; 
            private String principalName; 
            private String principalType; 
            private String resourceGroupId; 

            /**
             * AttachDate.
             */
            public Builder attachDate(String attachDate) {
                this.attachDate = attachDate;
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
             * PolicyName.
             */
            public Builder policyName(String policyName) {
                this.policyName = policyName;
                return this;
            }

            /**
             * PolicyType.
             */
            public Builder policyType(String policyType) {
                this.policyType = policyType;
                return this;
            }

            /**
             * PrincipalName.
             */
            public Builder principalName(String principalName) {
                this.principalName = principalName;
                return this;
            }

            /**
             * PrincipalType.
             */
            public Builder principalType(String principalType) {
                this.principalType = principalType;
                return this;
            }

            /**
             * ResourceGroupId.
             */
            public Builder resourceGroupId(String resourceGroupId) {
                this.resourceGroupId = resourceGroupId;
                return this;
            }

            public PolicyAttachment build() {
                return new PolicyAttachment(this);
            } 

        } 

    }
    public static class PolicyAttachments extends TeaModel {
        @NameInMap("PolicyAttachment")
        private java.util.List < PolicyAttachment> policyAttachment;

        private PolicyAttachments(Builder builder) {
            this.policyAttachment = builder.policyAttachment;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static PolicyAttachments create() {
            return builder().build();
        }

        /**
         * @return policyAttachment
         */
        public java.util.List < PolicyAttachment> getPolicyAttachment() {
            return this.policyAttachment;
        }

        public static final class Builder {
            private java.util.List < PolicyAttachment> policyAttachment; 

            /**
             * PolicyAttachment.
             */
            public Builder policyAttachment(java.util.List < PolicyAttachment> policyAttachment) {
                this.policyAttachment = policyAttachment;
                return this;
            }

            public PolicyAttachments build() {
                return new PolicyAttachments(this);
            } 

        } 

    }
}
