// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.fc20230330.models;

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

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return reservedConcurrency
     */
    public Long getReservedConcurrency() {
        return this.reservedConcurrency;
    }

    public static final class Builder {
        private Long reservedConcurrency; 

        private Builder() {
        } 

        private Builder(PutConcurrencyInput model) {
            this.reservedConcurrency = model.reservedConcurrency;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
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
