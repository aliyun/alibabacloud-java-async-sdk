// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cs20151215.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QuotasValue} extends {@link TeaModel}
 *
 * <p>QuotasValue</p>
 */
public class QuotasValue extends TeaModel {
    @NameInMap("quota")
    private String quota;

    @NameInMap("operation_code")
    private String operationCode;

    @NameInMap("adjustable")
    private Boolean adjustable;

    @NameInMap("unit")
    private String unit;

    private QuotasValue(Builder builder) {
        this.quota = builder.quota;
        this.operationCode = builder.operationCode;
        this.adjustable = builder.adjustable;
        this.unit = builder.unit;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QuotasValue create() {
        return builder().build();
    }

    /**
     * @return quota
     */
    public String getQuota() {
        return this.quota;
    }

    /**
     * @return operationCode
     */
    public String getOperationCode() {
        return this.operationCode;
    }

    /**
     * @return adjustable
     */
    public Boolean getAdjustable() {
        return this.adjustable;
    }

    /**
     * @return unit
     */
    public String getUnit() {
        return this.unit;
    }

    public static final class Builder {
        private String quota; 
        private String operationCode; 
        private Boolean adjustable; 
        private String unit; 

        /**
         * The value of the quota. If the quota limit is reached, submit an application in the [Quota Center console](https://quotas.console.aliyun.com/products/csk/quotas) to increase the quota.
         */
        public Builder quota(String quota) {
            this.quota = quota;
            return this;
        }

        /**
         * The quota code.
         */
        public Builder operationCode(String operationCode) {
            this.operationCode = operationCode;
            return this;
        }

        /**
         * Indicates whether the quota is adjustable.
         */
        public Builder adjustable(Boolean adjustable) {
            this.adjustable = adjustable;
            return this;
        }

        /**
         * The unit.
         */
        public Builder unit(String unit) {
            this.unit = unit;
            return this;
        }

        public QuotasValue build() {
            return new QuotasValue(this);
        } 

    } 

}
