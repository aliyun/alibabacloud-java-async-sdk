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

    public Builder toBuilder() {
        return new Builder(this);
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

        private Builder() {
        } 

        private Builder(ConcurrencyConfig model) {
            this.functionArn = model.functionArn;
            this.reservedConcurrency = model.reservedConcurrency;
        } 

        /**
         * <p>The Alibaba Cloud Resource Name (ARN).</p>
         * 
         * <strong>example:</strong>
         * <p>acs:fc:cn-shanghai:123:functions/demo</p>
         */
        public Builder functionArn(String functionArn) {
            this.functionArn = functionArn;
            return this;
        }

        /**
         * <p>The reserved concurrency of the function. Other functions cannot use the concurrency. The reserved concurrency includes the total concurrency of provisioned instances and on-demand instances.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
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
