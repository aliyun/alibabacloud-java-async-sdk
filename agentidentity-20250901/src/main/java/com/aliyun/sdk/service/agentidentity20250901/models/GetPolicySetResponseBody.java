// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.agentidentity20250901.models;

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
 * {@link GetPolicySetResponseBody} extends {@link TeaModel}
 *
 * <p>GetPolicySetResponseBody</p>
 */
public class GetPolicySetResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("PolicySet")
    private PolicySet policySet;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private GetPolicySetResponseBody(Builder builder) {
        this.policySet = builder.policySet;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetPolicySetResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return policySet
     */
    public PolicySet getPolicySet() {
        return this.policySet;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private PolicySet policySet; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(GetPolicySetResponseBody model) {
            this.policySet = model.policySet;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The details of the policy set.</p>
         */
        public Builder policySet(PolicySet policySet) {
            this.policySet = policySet;
            return this;
        }

        /**
         * <p>The unique identifier of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>2A48EB1D-D645-5758-91AF-EDF8E36E257B</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetPolicySetResponseBody build() {
            return new GetPolicySetResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetPolicySetResponseBody} extends {@link TeaModel}
     *
     * <p>GetPolicySetResponseBody</p>
     */
    public static class PolicySet extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private String createTime;

        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("PolicySetArn")
        private String policySetArn;

        @com.aliyun.core.annotation.NameInMap("PolicySetName")
        private String policySetName;

        @com.aliyun.core.annotation.NameInMap("SourcePlatform")
        private String sourcePlatform;

        @com.aliyun.core.annotation.NameInMap("UpdateTime")
        private String updateTime;

        private PolicySet(Builder builder) {
            this.createTime = builder.createTime;
            this.description = builder.description;
            this.policySetArn = builder.policySetArn;
            this.policySetName = builder.policySetName;
            this.sourcePlatform = builder.sourcePlatform;
            this.updateTime = builder.updateTime;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static PolicySet create() {
            return builder().build();
        }

        /**
         * @return createTime
         */
        public String getCreateTime() {
            return this.createTime;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return policySetArn
         */
        public String getPolicySetArn() {
            return this.policySetArn;
        }

        /**
         * @return policySetName
         */
        public String getPolicySetName() {
            return this.policySetName;
        }

        /**
         * @return sourcePlatform
         */
        public String getSourcePlatform() {
            return this.sourcePlatform;
        }

        /**
         * @return updateTime
         */
        public String getUpdateTime() {
            return this.updateTime;
        }

        public static final class Builder {
            private String createTime; 
            private String description; 
            private String policySetArn; 
            private String policySetName; 
            private String sourcePlatform; 
            private String updateTime; 

            private Builder() {
            } 

            private Builder(PolicySet model) {
                this.createTime = model.createTime;
                this.description = model.description;
                this.policySetArn = model.policySetArn;
                this.policySetName = model.policySetName;
                this.sourcePlatform = model.sourcePlatform;
                this.updateTime = model.updateTime;
            } 

            /**
             * <p>The creation time in UTC ISO 8601 format.</p>
             * 
             * <strong>example:</strong>
             * <p>2026-05-08T06:19:17Z</p>
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * <p>The description.</p>
             * 
             * <strong>example:</strong>
             * <p>example description</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>The ARN of the policy set.</p>
             * 
             * <strong>example:</strong>
             * <p>acs:agentidentity:cn-beijing:123456:policyset/default-policy-set</p>
             */
            public Builder policySetArn(String policySetArn) {
                this.policySetArn = policySetArn;
                return this;
            }

            /**
             * <p>The name of the policy set. The name must be unique within the current Alibaba Cloud account.</p>
             * 
             * <strong>example:</strong>
             * <p>default-policy-set</p>
             */
            public Builder policySetName(String policySetName) {
                this.policySetName = policySetName;
                return this;
            }

            /**
             * <p>The source platform.</p>
             * 
             * <strong>example:</strong>
             * <p>Manuel</p>
             */
            public Builder sourcePlatform(String sourcePlatform) {
                this.sourcePlatform = sourcePlatform;
                return this;
            }

            /**
             * <p>The update time in UTC ISO 8601 format.</p>
             * 
             * <strong>example:</strong>
             * <p>2026-05-08T06:19:17Z</p>
             */
            public Builder updateTime(String updateTime) {
                this.updateTime = updateTime;
                return this;
            }

            public PolicySet build() {
                return new PolicySet(this);
            } 

        } 

    }
}
