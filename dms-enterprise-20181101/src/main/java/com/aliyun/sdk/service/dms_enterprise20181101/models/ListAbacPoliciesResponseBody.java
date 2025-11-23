// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dms_enterprise20181101.models;

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
 * {@link ListAbacPoliciesResponseBody} extends {@link TeaModel}
 *
 * <p>ListAbacPoliciesResponseBody</p>
 */
public class ListAbacPoliciesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("ErrorCode")
    private String errorCode;

    @com.aliyun.core.annotation.NameInMap("ErrorMessage")
    private String errorMessage;

    @com.aliyun.core.annotation.NameInMap("PolicyList")
    private java.util.List<PolicyList> policyList;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    @com.aliyun.core.annotation.NameInMap("Tid")
    private Long tid;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Long totalCount;

    private ListAbacPoliciesResponseBody(Builder builder) {
        this.errorCode = builder.errorCode;
        this.errorMessage = builder.errorMessage;
        this.policyList = builder.policyList;
        this.requestId = builder.requestId;
        this.success = builder.success;
        this.tid = builder.tid;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListAbacPoliciesResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
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
     * @return policyList
     */
    public java.util.List<PolicyList> getPolicyList() {
        return this.policyList;
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
     * @return tid
     */
    public Long getTid() {
        return this.tid;
    }

    /**
     * @return totalCount
     */
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private String errorCode; 
        private String errorMessage; 
        private java.util.List<PolicyList> policyList; 
        private String requestId; 
        private Boolean success; 
        private Long tid; 
        private Long totalCount; 

        private Builder() {
        } 

        private Builder(ListAbacPoliciesResponseBody model) {
            this.errorCode = model.errorCode;
            this.errorMessage = model.errorMessage;
            this.policyList = model.policyList;
            this.requestId = model.requestId;
            this.success = model.success;
            this.tid = model.tid;
            this.totalCount = model.totalCount;
        } 

        /**
         * <p>The error code that is returned if the request failed.</p>
         * 
         * <strong>example:</strong>
         * <p>UnknownError</p>
         */
        public Builder errorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }

        /**
         * <p>The error message that is returned if the request failed.</p>
         * 
         * <strong>example:</strong>
         * <p>UnknownError</p>
         */
        public Builder errorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }

        /**
         * <p>The details of the permission policies.</p>
         */
        public Builder policyList(java.util.List<PolicyList> policyList) {
            this.policyList = policyList;
            return this;
        }

        /**
         * <p>The request ID. You can use the request ID to locate logs and troubleshoot issues.</p>
         * 
         * <strong>example:</strong>
         * <p>0C1CB646-1DE4-4AD0-B4A4-7D47DD52E931</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Indicates whether the request was successful. Valid values:</p>
         * <ul>
         * <li><strong>true</strong>: The request was successful.</li>
         * <li><strong>false</strong>: The request failed.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        /**
         * <p>The ID of the tenant.</p>
         * 
         * <strong>example:</strong>
         * <p>3***</p>
         */
        public Builder tid(Long tid) {
            this.tid = tid;
            return this;
        }

        /**
         * <p>The total number of policies.</p>
         * 
         * <strong>example:</strong>
         * <p>5</p>
         */
        public Builder totalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public ListAbacPoliciesResponseBody build() {
            return new ListAbacPoliciesResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListAbacPoliciesResponseBody} extends {@link TeaModel}
     *
     * <p>ListAbacPoliciesResponseBody</p>
     */
    public static class PolicyList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AbacPolicyContent")
        private String abacPolicyContent;

        @com.aliyun.core.annotation.NameInMap("AbacPolicyDesc")
        private String abacPolicyDesc;

        @com.aliyun.core.annotation.NameInMap("AbacPolicyId")
        private Long abacPolicyId;

        @com.aliyun.core.annotation.NameInMap("AbacPolicyName")
        private String abacPolicyName;

        @com.aliyun.core.annotation.NameInMap("AbacPolicySource")
        private String abacPolicySource;

        @com.aliyun.core.annotation.NameInMap("CreatorId")
        private Long creatorId;

        private PolicyList(Builder builder) {
            this.abacPolicyContent = builder.abacPolicyContent;
            this.abacPolicyDesc = builder.abacPolicyDesc;
            this.abacPolicyId = builder.abacPolicyId;
            this.abacPolicyName = builder.abacPolicyName;
            this.abacPolicySource = builder.abacPolicySource;
            this.creatorId = builder.creatorId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static PolicyList create() {
            return builder().build();
        }

        /**
         * @return abacPolicyContent
         */
        public String getAbacPolicyContent() {
            return this.abacPolicyContent;
        }

        /**
         * @return abacPolicyDesc
         */
        public String getAbacPolicyDesc() {
            return this.abacPolicyDesc;
        }

        /**
         * @return abacPolicyId
         */
        public Long getAbacPolicyId() {
            return this.abacPolicyId;
        }

        /**
         * @return abacPolicyName
         */
        public String getAbacPolicyName() {
            return this.abacPolicyName;
        }

        /**
         * @return abacPolicySource
         */
        public String getAbacPolicySource() {
            return this.abacPolicySource;
        }

        /**
         * @return creatorId
         */
        public Long getCreatorId() {
            return this.creatorId;
        }

        public static final class Builder {
            private String abacPolicyContent; 
            private String abacPolicyDesc; 
            private Long abacPolicyId; 
            private String abacPolicyName; 
            private String abacPolicySource; 
            private Long creatorId; 

            private Builder() {
            } 

            private Builder(PolicyList model) {
                this.abacPolicyContent = model.abacPolicyContent;
                this.abacPolicyDesc = model.abacPolicyDesc;
                this.abacPolicyId = model.abacPolicyId;
                this.abacPolicyName = model.abacPolicyName;
                this.abacPolicySource = model.abacPolicySource;
                this.creatorId = model.creatorId;
            } 

            /**
             * <p>The content of the policy.</p>
             * 
             * <strong>example:</strong>
             * <p>{
             *   &quot;Statement&quot;: [
             *     {
             *       &quot;Action&quot;: &quot;<em>&quot;,
             *       &quot;Effect&quot;: &quot;Allow&quot;,
             *       &quot;Resource&quot;: &quot;</em>&quot;,
             *       &quot;Condition&quot;: {
             *         &quot;StringEqualsIgnoreCase&quot;: {
             *           &quot;dms:DbType&quot;: [
             *             &quot;redis&quot;
             *           ]
             *         }
             *       }
             *     }
             *   ],
             *   &quot;Version&quot;: &quot;1&quot;
             * }</p>
             */
            public Builder abacPolicyContent(String abacPolicyContent) {
                this.abacPolicyContent = abacPolicyContent;
                return this;
            }

            /**
             * <p>The description of the policy.</p>
             * 
             * <strong>example:</strong>
             * <p>test</p>
             */
            public Builder abacPolicyDesc(String abacPolicyDesc) {
                this.abacPolicyDesc = abacPolicyDesc;
                return this;
            }

            /**
             * <p>The ID of the policy.</p>
             * 
             * <strong>example:</strong>
             * <p>12****</p>
             */
            public Builder abacPolicyId(Long abacPolicyId) {
                this.abacPolicyId = abacPolicyId;
                return this;
            }

            /**
             * <p>The name of the policy.</p>
             * 
             * <strong>example:</strong>
             * <p>policy_test</p>
             */
            public Builder abacPolicyName(String abacPolicyName) {
                this.abacPolicyName = abacPolicyName;
                return this;
            }

            /**
             * <p>The source of the policy.</p>
             * 
             * <strong>example:</strong>
             * <p>USER_DEFINE</p>
             */
            public Builder abacPolicySource(String abacPolicySource) {
                this.abacPolicySource = abacPolicySource;
                return this;
            }

            /**
             * <p>The ID of the user who created the policy.</p>
             * 
             * <strong>example:</strong>
             * <p>51****</p>
             */
            public Builder creatorId(Long creatorId) {
                this.creatorId = creatorId;
                return this;
            }

            public PolicyList build() {
                return new PolicyList(this);
            } 

        } 

    }
}
