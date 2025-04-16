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
 * {@link SubQuotaPreemptionConfig} extends {@link TeaModel}
 *
 * <p>SubQuotaPreemptionConfig</p>
 */
public class SubQuotaPreemptionConfig extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("PreemptedPriorityUpperBound")
    private Long preemptedPriorityUpperBound;

    @com.aliyun.core.annotation.NameInMap("PreemptedProducts")
    private java.util.List<String> preemptedProducts;

    private SubQuotaPreemptionConfig(Builder builder) {
        this.preemptedPriorityUpperBound = builder.preemptedPriorityUpperBound;
        this.preemptedProducts = builder.preemptedProducts;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SubQuotaPreemptionConfig create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return preemptedPriorityUpperBound
     */
    public Long getPreemptedPriorityUpperBound() {
        return this.preemptedPriorityUpperBound;
    }

    /**
     * @return preemptedProducts
     */
    public java.util.List<String> getPreemptedProducts() {
        return this.preemptedProducts;
    }

    public static final class Builder {
        private Long preemptedPriorityUpperBound; 
        private java.util.List<String> preemptedProducts; 

        private Builder() {
        } 

        private Builder(SubQuotaPreemptionConfig model) {
            this.preemptedPriorityUpperBound = model.preemptedPriorityUpperBound;
            this.preemptedProducts = model.preemptedProducts;
        } 

        /**
         * PreemptedPriorityUpperBound.
         */
        public Builder preemptedPriorityUpperBound(Long preemptedPriorityUpperBound) {
            this.preemptedPriorityUpperBound = preemptedPriorityUpperBound;
            return this;
        }

        /**
         * PreemptedProducts.
         */
        public Builder preemptedProducts(java.util.List<String> preemptedProducts) {
            this.preemptedProducts = preemptedProducts;
            return this;
        }

        public SubQuotaPreemptionConfig build() {
            return new SubQuotaPreemptionConfig(this);
        } 

    } 

}
