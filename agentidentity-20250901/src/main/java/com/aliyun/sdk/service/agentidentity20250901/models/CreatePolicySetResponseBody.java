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
 * {@link CreatePolicySetResponseBody} extends {@link TeaModel}
 *
 * <p>CreatePolicySetResponseBody</p>
 */
public class CreatePolicySetResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("PolicySet")
    private PolicySet policySet;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private CreatePolicySetResponseBody(Builder builder) {
        this.policySet = builder.policySet;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreatePolicySetResponseBody create() {
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

        private Builder(CreatePolicySetResponseBody model) {
            this.policySet = model.policySet;
            this.requestId = model.requestId;
        } 

        /**
         * PolicySet.
         */
        public Builder policySet(PolicySet policySet) {
            this.policySet = policySet;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public CreatePolicySetResponseBody build() {
            return new CreatePolicySetResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link CreatePolicySetResponseBody} extends {@link TeaModel}
     *
     * <p>CreatePolicySetResponseBody</p>
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

        private PolicySet(Builder builder) {
            this.createTime = builder.createTime;
            this.description = builder.description;
            this.policySetArn = builder.policySetArn;
            this.policySetName = builder.policySetName;
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

        public static final class Builder {
            private String createTime; 
            private String description; 
            private String policySetArn; 
            private String policySetName; 

            private Builder() {
            } 

            private Builder(PolicySet model) {
                this.createTime = model.createTime;
                this.description = model.description;
                this.policySetArn = model.policySetArn;
                this.policySetName = model.policySetName;
            } 

            /**
             * CreateTime.
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
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
             * PolicySetArn.
             */
            public Builder policySetArn(String policySetArn) {
                this.policySetArn = policySetArn;
                return this;
            }

            /**
             * PolicySetName.
             */
            public Builder policySetName(String policySetName) {
                this.policySetName = policySetName;
                return this;
            }

            public PolicySet build() {
                return new PolicySet(this);
            } 

        } 

    }
}
