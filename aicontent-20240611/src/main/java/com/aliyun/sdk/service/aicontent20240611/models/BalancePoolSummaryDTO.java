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
         * <p>The balance allocated to users equals the sum of the sub-wallet balances of all members in the department.</p>
         * 
         * <strong>example:</strong>
         * <p>40.00</p>
         */
        public Builder allocated(Double allocated) {
            this.allocated = allocated;
            return this;
        }

        /**
         * <p>The available department balance equals the sub-wallet balance of the department.</p>
         * 
         * <strong>example:</strong>
         * <p>60.00</p>
         */
        public Builder available(Double available) {
            this.available = available;
            return this;
        }

        /**
         * <p>The total amount equals the available department balance plus the balance allocated to users.</p>
         * 
         * <strong>example:</strong>
         * <p>100.00</p>
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
