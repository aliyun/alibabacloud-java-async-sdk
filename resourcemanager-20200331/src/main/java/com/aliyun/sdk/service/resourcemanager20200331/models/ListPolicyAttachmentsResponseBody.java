// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.resourcemanager20200331.models;

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
 * {@link ListPolicyAttachmentsResponseBody} extends {@link TeaModel}
 *
 * <p>ListPolicyAttachmentsResponseBody</p>
 */
public class ListPolicyAttachmentsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Integer pageNumber;

    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.NameInMap("PolicyAttachments")
    private PolicyAttachments policyAttachments;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
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
         * <p>The page number of the returned page.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder pageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * <p>The number of entries returned per page.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>The policy attachment records.</p>
         */
        public Builder policyAttachments(PolicyAttachments policyAttachments) {
            this.policyAttachments = policyAttachments;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>7B8A4E7D-6CFF-471D-84DF-195A7A241ECB</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The total number of returned entries.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public ListPolicyAttachmentsResponseBody build() {
            return new ListPolicyAttachmentsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListPolicyAttachmentsResponseBody} extends {@link TeaModel}
     *
     * <p>ListPolicyAttachmentsResponseBody</p>
     */
    public static class PolicyAttachment extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AttachDate")
        private String attachDate;

        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("PolicyName")
        private String policyName;

        @com.aliyun.core.annotation.NameInMap("PolicyType")
        private String policyType;

        @com.aliyun.core.annotation.NameInMap("PrincipalName")
        private String principalName;

        @com.aliyun.core.annotation.NameInMap("PrincipalType")
        private String principalType;

        @com.aliyun.core.annotation.NameInMap("ResourceGroupId")
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
             * <p>The time when the policy was attached.</p>
             * 
             * <strong>example:</strong>
             * <p>2015-01-23T12:33:18Z</p>
             */
            public Builder attachDate(String attachDate) {
                this.attachDate = attachDate;
                return this;
            }

            /**
             * <p>The description of the policy.</p>
             * 
             * <strong>example:</strong>
             * <p>The description of the policy.</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>The name of the policy.</p>
             * 
             * <strong>example:</strong>
             * <p>AdministratorAccess</p>
             */
            public Builder policyName(String policyName) {
                this.policyName = policyName;
                return this;
            }

            /**
             * <p>The type of the policy. Valid values:</p>
             * <ul>
             * <li>Custom: custom policy</li>
             * <li>System: system policy</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>System</p>
             */
            public Builder policyType(String policyType) {
                this.policyType = policyType;
                return this;
            }

            /**
             * <p>The name of the object to which the policy is attached.</p>
             * 
             * <strong>example:</strong>
             * <p><a href="mailto:alice@demo.onaliyun.com">alice@demo.onaliyun.com</a></p>
             */
            public Builder principalName(String principalName) {
                this.principalName = principalName;
                return this;
            }

            /**
             * <p>The type of the object to which the policy is attached. Valid values:</p>
             * <ul>
             * <li>IMSUser: RAM user</li>
             * <li>IMSGroup: RAM user group</li>
             * <li>ServiceRole: RAM role</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>IMSUser</p>
             */
            public Builder principalType(String principalType) {
                this.principalType = principalType;
                return this;
            }

            /**
             * <p>The ID of the resource group or the ID of the Alibaba Cloud account to which the resource group belongs.</p>
             * 
             * <strong>example:</strong>
             * <p>rg-9gLOoK****</p>
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
    /**
     * 
     * {@link ListPolicyAttachmentsResponseBody} extends {@link TeaModel}
     *
     * <p>ListPolicyAttachmentsResponseBody</p>
     */
    public static class PolicyAttachments extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("PolicyAttachment")
        private java.util.List<PolicyAttachment> policyAttachment;

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
        public java.util.List<PolicyAttachment> getPolicyAttachment() {
            return this.policyAttachment;
        }

        public static final class Builder {
            private java.util.List<PolicyAttachment> policyAttachment; 

            /**
             * PolicyAttachment.
             */
            public Builder policyAttachment(java.util.List<PolicyAttachment> policyAttachment) {
                this.policyAttachment = policyAttachment;
                return this;
            }

            public PolicyAttachments build() {
                return new PolicyAttachments(this);
            } 

        } 

    }
}
