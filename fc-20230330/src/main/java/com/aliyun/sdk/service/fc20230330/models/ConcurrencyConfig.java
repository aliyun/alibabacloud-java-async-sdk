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
 * {@link ConcurrencyConfig} extends {@link TeaModel}
 *
 * <p>ConcurrencyConfig</p>
 */
public class ConcurrencyConfig extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("functionArn")
    private String functionArn;

    @com.aliyun.core.annotation.NameInMap("reservedConcurrency")
    private Long reservedConcurrency;

    private ConcurrencyConfig(Builder builder) {
        this.functionArn = builder.functionArn;
        this.reservedConcurrency = builder.reservedConcurrency;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ConcurrencyConfig create() {
        return builder().build();
    }

    /**
     * @return functionArn
     */
    public String getFunctionArn() {
        return this.functionArn;
    }

    /**
     * @return reservedConcurrency
     */
    public Long getReservedConcurrency() {
        return this.reservedConcurrency;
    }

    public static final class Builder {
        private String functionArn; 
        private Long reservedConcurrency; 

        /**
         * functionArn.
         */
        public Builder functionArn(String functionArn) {
            this.functionArn = functionArn;
            return this;
        }

        /**
         * reservedConcurrency.
         */
        public Builder reservedConcurrency(Long reservedConcurrency) {
            this.reservedConcurrency = reservedConcurrency;
            return this;
        }

        public ConcurrencyConfig build() {
            return new ConcurrencyConfig(this);
        } 

    } 

}
