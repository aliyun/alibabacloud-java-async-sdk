// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.fc20230330.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link PutConcurrencyInput} extends {@link TeaModel}
 *
 * <p>PutConcurrencyInput</p>
 */
public class PutConcurrencyInput extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("reservedConcurrency")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long reservedConcurrency;

    private PutConcurrencyInput(Builder builder) {
        this.reservedConcurrency = builder.reservedConcurrency;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static PutConcurrencyInput create() {
        return builder().build();
    }

    /**
     * @return reservedConcurrency
     */
    public Long getReservedConcurrency() {
        return this.reservedConcurrency;
    }

    public static final class Builder {
        private Long reservedConcurrency; 

        /**
         * reservedConcurrency.
         */
        public Builder reservedConcurrency(Long reservedConcurrency) {
            this.reservedConcurrency = reservedConcurrency;
            return this;
        }

        public PutConcurrencyInput build() {
            return new PutConcurrencyInput(this);
        } 

    } 

}
