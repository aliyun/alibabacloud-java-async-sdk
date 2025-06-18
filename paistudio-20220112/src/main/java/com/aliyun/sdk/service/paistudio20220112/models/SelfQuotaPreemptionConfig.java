// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.paistudio20220112.models;

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
 * {@link SelfQuotaPreemptionConfig} extends {@link TeaModel}
 *
 * <p>SelfQuotaPreemptionConfig</p>
 */
public class SelfQuotaPreemptionConfig extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("PreemptedPriorities")
    private java.util.List<Integer> preemptedPriorities;

    @com.aliyun.core.annotation.NameInMap("PreemptedProducts")
    private java.util.List<String> preemptedProducts;

    @com.aliyun.core.annotation.NameInMap("PreemptorPriorities")
    private java.util.List<Integer> preemptorPriorities;

    private SelfQuotaPreemptionConfig(Builder builder) {
        this.preemptedPriorities = builder.preemptedPriorities;
        this.preemptedProducts = builder.preemptedProducts;
        this.preemptorPriorities = builder.preemptorPriorities;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SelfQuotaPreemptionConfig create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return preemptedPriorities
     */
    public java.util.List<Integer> getPreemptedPriorities() {
        return this.preemptedPriorities;
    }

    /**
     * @return preemptedProducts
     */
    public java.util.List<String> getPreemptedProducts() {
        return this.preemptedProducts;
    }

    /**
     * @return preemptorPriorities
     */
    public java.util.List<Integer> getPreemptorPriorities() {
        return this.preemptorPriorities;
    }

    public static final class Builder {
        private java.util.List<Integer> preemptedPriorities; 
        private java.util.List<String> preemptedProducts; 
        private java.util.List<Integer> preemptorPriorities; 

        private Builder() {
        } 

        private Builder(SelfQuotaPreemptionConfig model) {
            this.preemptedPriorities = model.preemptedPriorities;
            this.preemptedProducts = model.preemptedProducts;
            this.preemptorPriorities = model.preemptorPriorities;
        } 

        /**
         * PreemptedPriorities.
         */
        public Builder preemptedPriorities(java.util.List<Integer> preemptedPriorities) {
            this.preemptedPriorities = preemptedPriorities;
            return this;
        }

        /**
         * PreemptedProducts.
         */
        public Builder preemptedProducts(java.util.List<String> preemptedProducts) {
            this.preemptedProducts = preemptedProducts;
            return this;
        }

        /**
         * PreemptorPriorities.
         */
        public Builder preemptorPriorities(java.util.List<Integer> preemptorPriorities) {
            this.preemptorPriorities = preemptorPriorities;
            return this;
        }

        public SelfQuotaPreemptionConfig build() {
            return new SelfQuotaPreemptionConfig(this);
        } 

    } 

}
