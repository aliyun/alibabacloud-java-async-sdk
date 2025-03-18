// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cs20151215.models;

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
 * {@link QuotasValue} extends {@link TeaModel}
 *
 * <p>QuotasValue</p>
 */
public class QuotasValue extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("quota")
    private String quota;

    @com.aliyun.core.annotation.NameInMap("operation_code")
    private String operationCode;

    @com.aliyun.core.annotation.NameInMap("adjustable")
    private Boolean adjustable;

    @com.aliyun.core.annotation.NameInMap("unit")
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

    public Builder toBuilder() {
        return new Builder(this);
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

        private Builder() {
        } 

        private Builder(QuotasValue model) {
            this.quota = model.quota;
            this.operationCode = model.operationCode;
            this.adjustable = model.adjustable;
            this.unit = model.unit;
        } 

        /**
         * <p>The value of the quota. If the quota limit is reached, submit an application in the <a href="https://quotas.console.aliyun.com/products/csk/quotas">Quota Center console</a> to increase the quota.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder quota(String quota) {
            this.quota = quota;
            return this;
        }

        /**
         * <p>The quota code.</p>
         * 
         * <strong>example:</strong>
         * <p>q_Kubernetes_Cluster</p>
         */
        public Builder operationCode(String operationCode) {
            this.operationCode = operationCode;
            return this;
        }

        /**
         * <p>Indicates whether the quota is adjustable.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder adjustable(Boolean adjustable) {
            this.adjustable = adjustable;
            return this;
        }

        /**
         * <p>The unit.</p>
         * 
         * <strong>example:</strong>
         * <p>Cluster</p>
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
