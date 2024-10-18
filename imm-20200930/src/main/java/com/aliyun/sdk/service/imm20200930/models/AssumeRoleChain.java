// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.imm20200930.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link AssumeRoleChain} extends {@link TeaModel}
 *
 * <p>AssumeRoleChain</p>
 */
public class AssumeRoleChain extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Chain")
    private java.util.List < AssumeRoleChainNode > chain;

    @com.aliyun.core.annotation.NameInMap("Policy")
    private String policy;

    private AssumeRoleChain(Builder builder) {
        this.chain = builder.chain;
        this.policy = builder.policy;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AssumeRoleChain create() {
        return builder().build();
    }

    /**
     * @return chain
     */
    public java.util.List < AssumeRoleChainNode > getChain() {
        return this.chain;
    }

    /**
     * @return policy
     */
    public String getPolicy() {
        return this.policy;
    }

    public static final class Builder {
        private java.util.List < AssumeRoleChainNode > chain; 
        private String policy; 

        /**
         * Chain.
         */
        public Builder chain(java.util.List < AssumeRoleChainNode > chain) {
            this.chain = chain;
            return this;
        }

        /**
         * Policy.
         */
        public Builder policy(String policy) {
            this.policy = policy;
            return this;
        }

        public AssumeRoleChain build() {
            return new AssumeRoleChain(this);
        } 

    } 

}
