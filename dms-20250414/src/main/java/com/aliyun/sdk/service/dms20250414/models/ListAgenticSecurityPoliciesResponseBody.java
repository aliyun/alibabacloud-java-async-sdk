// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dms20250414.models;

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
 * {@link ListAgenticSecurityPoliciesResponseBody} extends {@link TeaModel}
 *
 * <p>ListAgenticSecurityPoliciesResponseBody</p>
 */
public class ListAgenticSecurityPoliciesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Data")
    private java.util.List<Data> data;

    @com.aliyun.core.annotation.NameInMap("ErrorCode")
    private String errorCode;

    @com.aliyun.core.annotation.NameInMap("ErrorMessage")
    private String errorMessage;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Long totalCount;

    private ListAgenticSecurityPoliciesResponseBody(Builder builder) {
        this.data = builder.data;
        this.errorCode = builder.errorCode;
        this.errorMessage = builder.errorMessage;
        this.requestId = builder.requestId;
        this.success = builder.success;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListAgenticSecurityPoliciesResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return data
     */
    public java.util.List<Data> getData() {
        return this.data;
    }

    /**
     * @return errorCode
     */
    public String getErrorCode() {
        return this.errorCode;
    }

    /**
     * @return errorMessage
     */
    public String getErrorMessage() {
        return this.errorMessage;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    /**
     * @return totalCount
     */
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private java.util.List<Data> data; 
        private String errorCode; 
        private String errorMessage; 
        private String requestId; 
        private Boolean success; 
        private Long totalCount; 

        private Builder() {
        } 

        private Builder(ListAgenticSecurityPoliciesResponseBody model) {
            this.data = model.data;
            this.errorCode = model.errorCode;
            this.errorMessage = model.errorMessage;
            this.requestId = model.requestId;
            this.success = model.success;
            this.totalCount = model.totalCount;
        } 

        /**
         * <p>The list of security policies returned by this query. Enabled system default policies are placed at the beginning, followed by the user policies on the current page. You can use Readonly to distinguish between the two types of policies.</p>
         */
        public Builder data(java.util.List<Data> data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The error code returned when the request fails. This parameter is empty when the request is successful.</p>
         * 
         * <strong>example:</strong>
         * <p>INVALID_PARAMETER</p>
         */
        public Builder errorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }

        /**
         * <p>The error message returned when the request fails. This parameter is empty when the request is successful.</p>
         * 
         * <strong>example:</strong>
         * <p>invalid policyStatus: ARCHIVED</p>
         */
        public Builder errorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }

        /**
         * <p>The request ID, which is used to locate and trace this call.</p>
         * 
         * <strong>example:</strong>
         * <p>request-1234567890</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Indicates whether the request is successful. Valid values:</p>
         * <ul>
         * <li>true: The request is successful.</li>
         * <li>false: The request fails.</li>
         * </ul>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        /**
         * <p>The total number of policies that meet the query conditions. The value is the sum of the number of all enabled system default policies and the number of user policies of the current account that meet the filter conditions.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        public Builder totalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public ListAgenticSecurityPoliciesResponseBody build() {
            return new ListAgenticSecurityPoliciesResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListAgenticSecurityPoliciesResponseBody} extends {@link TeaModel}
     *
     * <p>ListAgenticSecurityPoliciesResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AliyunAccountUid")
        private String aliyunAccountUid;

        @com.aliyun.core.annotation.NameInMap("BasePolicyId")
        private String basePolicyId;

        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("GmtCreate")
        private String gmtCreate;

        @com.aliyun.core.annotation.NameInMap("GmtModified")
        private String gmtModified;

        @com.aliyun.core.annotation.NameInMap("PolicyId")
        private String policyId;

        @com.aliyun.core.annotation.NameInMap("PolicyName")
        private String policyName;

        @com.aliyun.core.annotation.NameInMap("PolicyStatus")
        private String policyStatus;

        @com.aliyun.core.annotation.NameInMap("Readonly")
        private Boolean readonly;

        @com.aliyun.core.annotation.NameInMap("Tags")
        private String tags;

        @com.aliyun.core.annotation.NameInMap("UpdatedBy")
        private String updatedBy;

        private Data(Builder builder) {
            this.aliyunAccountUid = builder.aliyunAccountUid;
            this.basePolicyId = builder.basePolicyId;
            this.description = builder.description;
            this.gmtCreate = builder.gmtCreate;
            this.gmtModified = builder.gmtModified;
            this.policyId = builder.policyId;
            this.policyName = builder.policyName;
            this.policyStatus = builder.policyStatus;
            this.readonly = builder.readonly;
            this.tags = builder.tags;
            this.updatedBy = builder.updatedBy;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return aliyunAccountUid
         */
        public String getAliyunAccountUid() {
            return this.aliyunAccountUid;
        }

        /**
         * @return basePolicyId
         */
        public String getBasePolicyId() {
            return this.basePolicyId;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return gmtCreate
         */
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        /**
         * @return gmtModified
         */
        public String getGmtModified() {
            return this.gmtModified;
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
         * @return policyStatus
         */
        public String getPolicyStatus() {
            return this.policyStatus;
        }

        /**
         * @return readonly
         */
        public Boolean getReadonly() {
            return this.readonly;
        }

        /**
         * @return tags
         */
        public String getTags() {
            return this.tags;
        }

        /**
         * @return updatedBy
         */
        public String getUpdatedBy() {
            return this.updatedBy;
        }

        public static final class Builder {
            private String aliyunAccountUid; 
            private String basePolicyId; 
            private String description; 
            private String gmtCreate; 
            private String gmtModified; 
            private String policyId; 
            private String policyName; 
            private String policyStatus; 
            private Boolean readonly; 
            private String tags; 
            private String updatedBy; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.aliyunAccountUid = model.aliyunAccountUid;
                this.basePolicyId = model.basePolicyId;
                this.description = model.description;
                this.gmtCreate = model.gmtCreate;
                this.gmtModified = model.gmtModified;
                this.policyId = model.policyId;
                this.policyName = model.policyName;
                this.policyStatus = model.policyStatus;
                this.readonly = model.readonly;
                this.tags = model.tags;
                this.updatedBy = model.updatedBy;
            } 

            /**
             * <p>The UID of the Alibaba Cloud account to which the user policy belongs. This value is not returned for system default policies.</p>
             * 
             * <strong>example:</strong>
             * <p>123456789012****</p>
             */
            public Builder aliyunAccountUid(String aliyunAccountUid) {
                this.aliyunAccountUid = aliyunAccountUid;
                return this;
            }

            /**
             * <p>The ID of the system default policy inherited by the user policy. This value is empty if no inheritance relationship is configured. This value is not returned for system default policies.</p>
             * 
             * <strong>example:</strong>
             * <p>sp-sys-default</p>
             */
            public Builder basePolicyId(String basePolicyId) {
                this.basePolicyId = basePolicyId;
                return this;
            }

            /**
             * <p>The description of the security policy. The description of a system default policy is returned in the language of the request context.</p>
             * 
             * <strong>example:</strong>
             * <p>Read-only access policy for analytics</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>The time when the security policy was created. The time is in the yyyy-MM-dd HH:mm:ss format and does not contain a time zone offset.</p>
             * 
             * <strong>example:</strong>
             * <p>2026-10-13 14:30:00</p>
             */
            public Builder gmtCreate(String gmtCreate) {
                this.gmtCreate = gmtCreate;
                return this;
            }

            /**
             * <p>The time when the security policy was last modified. The time is in the yyyy-MM-dd HH:mm:ss format and does not contain a time zone offset.</p>
             * 
             * <strong>example:</strong>
             * <p>2026-10-13 14:35:00</p>
             */
            public Builder gmtModified(String gmtModified) {
                this.gmtModified = gmtModified;
                return this;
            }

            /**
             * <p>The business ID of the security policy. A system default policy ID starts with sp-sys-, and a user policy ID starts with sp-usr-.</p>
             * 
             * <strong>example:</strong>
             * <p>sp-sys-default</p>
             */
            public Builder policyId(String policyId) {
                this.policyId = policyId;
                return this;
            }

            /**
             * <p>The Policy Name of the security policy. The Policy Name of a system default policy is returned in the language of the request context.</p>
             * 
             * <strong>example:</strong>
             * <p>team-readonly-policy</p>
             */
            public Builder policyName(String policyName) {
                this.policyName = policyName;
                return this;
            }

            /**
             * <p>The current state of the security policy. Valid values:</p>
             * <ul>
             * <li>ON: Enabled.</li>
             * <li>OFF: Disabled.</li>
             * <li>ARCHIVED: Archived.
             * All system default policies returned by this operation are in the ON state.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>ON</p>
             */
            public Builder policyStatus(String policyStatus) {
                this.policyStatus = policyStatus;
                return this;
            }

            /**
             * <p>Specifies whether the policy is read-only. Valid values:</p>
             * <ul>
             * <li>true: The policy is a system default policy.</li>
             * <li>false: The policy is a user policy of the current account.</li>
             * </ul>
             */
            public Builder readonly(Boolean readonly) {
                this.readonly = readonly;
                return this;
            }

            /**
             * <p>The tags of the system default policy. Multiple tags are separated by commas (,). This value is not returned for user policies.</p>
             * 
             * <strong>example:</strong>
             * <p>default,phase1</p>
             */
            public Builder tags(String tags) {
                this.tags = tags;
                return this;
            }

            /**
             * <p>The identifier of the operator that last modified the policy. For a user policy, the operator ID is recorded first. If no operator ID is available, the UID of the current Alibaba Cloud account is recorded.</p>
             * 
             * <strong>example:</strong>
             * <p>system</p>
             */
            public Builder updatedBy(String updatedBy) {
                this.updatedBy = updatedBy;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
