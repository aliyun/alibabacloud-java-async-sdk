// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aicontent20240611.models;

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
 * {@link BalancePoolSummaryDTO} extends {@link TeaModel}
 *
 * <p>BalancePoolSummaryDTO</p>
 */
public class BalancePoolSummaryDTO extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("allocated")
    private Double allocated;

    @com.aliyun.core.annotation.NameInMap("available")
    private Double available;

    @com.aliyun.core.annotation.NameInMap("total")
    private Double total;

    private BalancePoolSummaryDTO(Builder builder) {
        this.allocated = builder.allocated;
        this.available = builder.available;
        this.total = builder.total;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static BalancePoolSummaryDTO create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return allocated
     */
    public Double getAllocated() {
        return this.allocated;
    }

    /**
     * @return available
     */
    public Double getAvailable() {
        return this.available;
    }

    /**
     * @return total
     */
    public Double getTotal() {
        return this.total;
    }

    public static final class Builder {
        private Double allocated; 
        private Double available; 
        private Double total; 

        private Builder() {
        } 

        private Builder(BalancePoolSummaryDTO model) {
            this.allocated = model.allocated;
            this.available = model.available;
            this.total = model.total;
        } 

        /**
         * allocated.
         */
        public Builder allocated(Double allocated) {
            this.allocated = allocated;
            return this;
        }

        /**
         * available.
         */
        public Builder available(Double available) {
            this.available = available;
            return this;
        }

        /**
         * total.
         */
        public Builder total(Double total) {
            this.total = total;
            return this;
        }

        public BalancePoolSummaryDTO build() {
            return new BalancePoolSummaryDTO(this);
        } 

    } 

}
