// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.tag20180828.models;

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
 * {@link GetEffectivePolicyResponseBody} extends {@link TeaModel}
 *
 * <p>GetEffectivePolicyResponseBody</p>
 */
public class GetEffectivePolicyResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("EffectivePolicy")
    private String effectivePolicy;

    @com.aliyun.core.annotation.NameInMap("PolicyAttachments")
    private java.util.List<PolicyAttachments> policyAttachments;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private GetEffectivePolicyResponseBody(Builder builder) {
        this.effectivePolicy = builder.effectivePolicy;
        this.policyAttachments = builder.policyAttachments;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetEffectivePolicyResponseBody create() {
        return builder().build();
    }

    /**
     * @return effectivePolicy
     */
    public String getEffectivePolicy() {
        return this.effectivePolicy;
    }

    /**
     * @return policyAttachments
     */
    public java.util.List<PolicyAttachments> getPolicyAttachments() {
        return this.policyAttachments;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String effectivePolicy; 
        private java.util.List<PolicyAttachments> policyAttachments; 
        private String requestId; 

        /**
         * <p>The effective tag policy.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;tags&quot;:{&quot;costcenter&quot;:{&quot;tag_value&quot;:[&quot;Beijing&quot;,&quot;Shanghai&quot;],&quot;tag_key&quot;:&quot;CostCenter&quot;}}}</p>
         */
        public Builder effectivePolicy(String effectivePolicy) {
            this.effectivePolicy = effectivePolicy;
            return this;
        }

        /**
         * PolicyAttachments.
         */
        public Builder policyAttachments(java.util.List<PolicyAttachments> policyAttachments) {
            this.policyAttachments = policyAttachments;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>BB532282-94F5-5F56-877F-32D5E2A04F3F</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetEffectivePolicyResponseBody build() {
            return new GetEffectivePolicyResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetEffectivePolicyResponseBody} extends {@link TeaModel}
     *
     * <p>GetEffectivePolicyResponseBody</p>
     */
    public static class PolicyList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AttachSeq")
        private Integer attachSeq;

        @com.aliyun.core.annotation.NameInMap("AttachTime")
        private String attachTime;

        @com.aliyun.core.annotation.NameInMap("PolicyId")
        private String policyId;

        @com.aliyun.core.annotation.NameInMap("PolicyName")
        private String policyName;

        @com.aliyun.core.annotation.NameInMap("TargetId")
        private String targetId;

        @com.aliyun.core.annotation.NameInMap("TargetType")
        private String targetType;

        private PolicyList(Builder builder) {
            this.attachSeq = builder.attachSeq;
            this.attachTime = builder.attachTime;
            this.policyId = builder.policyId;
            this.policyName = builder.policyName;
            this.targetId = builder.targetId;
            this.targetType = builder.targetType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static PolicyList create() {
            return builder().build();
        }

        /**
         * @return attachSeq
         */
        public Integer getAttachSeq() {
            return this.attachSeq;
        }

        /**
         * @return attachTime
         */
        public String getAttachTime() {
            return this.attachTime;
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
         * @return targetId
         */
        public String getTargetId() {
            return this.targetId;
        }

        /**
         * @return targetType
         */
        public String getTargetType() {
            return this.targetType;
        }

        public static final class Builder {
            private Integer attachSeq; 
            private String attachTime; 
            private String policyId; 
            private String policyName; 
            private String targetId; 
            private String targetType; 

            /**
             * AttachSeq.
             */
            public Builder attachSeq(Integer attachSeq) {
                this.attachSeq = attachSeq;
                return this;
            }

            /**
             * AttachTime.
             */
            public Builder attachTime(String attachTime) {
                this.attachTime = attachTime;
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
             * PolicyName.
             */
            public Builder policyName(String policyName) {
                this.policyName = policyName;
                return this;
            }

            /**
             * TargetId.
             */
            public Builder targetId(String targetId) {
                this.targetId = targetId;
                return this;
            }

            /**
             * TargetType.
             */
            public Builder targetType(String targetType) {
                this.targetType = targetType;
                return this;
            }

            public PolicyList build() {
                return new PolicyList(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetEffectivePolicyResponseBody} extends {@link TeaModel}
     *
     * <p>GetEffectivePolicyResponseBody</p>
     */
    public static class PolicyAttachments extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("PolicyList")
        private java.util.List<PolicyList> policyList;

        @com.aliyun.core.annotation.NameInMap("PolicyType")
        private String policyType;

        @com.aliyun.core.annotation.NameInMap("TagKey")
        private String tagKey;

        private PolicyAttachments(Builder builder) {
            this.policyList = builder.policyList;
            this.policyType = builder.policyType;
            this.tagKey = builder.tagKey;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static PolicyAttachments create() {
            return builder().build();
        }

        /**
         * @return policyList
         */
        public java.util.List<PolicyList> getPolicyList() {
            return this.policyList;
        }

        /**
         * @return policyType
         */
        public String getPolicyType() {
            return this.policyType;
        }

        /**
         * @return tagKey
         */
        public String getTagKey() {
            return this.tagKey;
        }

        public static final class Builder {
            private java.util.List<PolicyList> policyList; 
            private String policyType; 
            private String tagKey; 

            /**
             * PolicyList.
             */
            public Builder policyList(java.util.List<PolicyList> policyList) {
                this.policyList = policyList;
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
             * TagKey.
             */
            public Builder tagKey(String tagKey) {
                this.tagKey = tagKey;
                return this;
            }

            public PolicyAttachments build() {
                return new PolicyAttachments(this);
            } 

        } 

    }
}
