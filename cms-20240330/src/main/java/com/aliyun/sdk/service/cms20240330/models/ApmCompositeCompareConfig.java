// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cms20240330.models;

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
 * {@link ApmCompositeCompareConfig} extends {@link TeaModel}
 *
 * <p>ApmCompositeCompareConfig</p>
 */
public class ApmCompositeCompareConfig extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("aggregate")
    @com.aliyun.core.annotation.Validation(required = true)
    private String aggregate;

    @com.aliyun.core.annotation.NameInMap("operator")
    @com.aliyun.core.annotation.Validation(required = true)
    private String operator;

    @com.aliyun.core.annotation.NameInMap("threshold")
    @com.aliyun.core.annotation.Validation(required = true)
    private Float threshold;

    private ApmCompositeCompareConfig(Builder builder) {
        this.aggregate = builder.aggregate;
        this.operator = builder.operator;
        this.threshold = builder.threshold;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ApmCompositeCompareConfig create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return aggregate
     */
    public String getAggregate() {
        return this.aggregate;
    }

    /**
     * @return operator
     */
    public String getOperator() {
        return this.operator;
    }

    /**
     * @return threshold
     */
    public Float getThreshold() {
        return this.threshold;
    }

    public static final class Builder {
        private String aggregate; 
        private String operator; 
        private Float threshold; 

        private Builder() {
        } 

        private Builder(ApmCompositeCompareConfig model) {
            this.aggregate = model.aggregate;
            this.operator = model.operator;
            this.threshold = model.threshold;
        } 

        /**
         * <p>聚合函数</p>
         * <p>This parameter is required.</p>
         */
        public Builder aggregate(String aggregate) {
            this.aggregate = aggregate;
            return this;
        }

        /**
         * <p>比较操作符</p>
         * <p>This parameter is required.</p>
         */
        public Builder operator(String operator) {
            this.operator = operator;
            return this;
        }

        /**
         * <p>单阈值</p>
         * <p>This parameter is required.</p>
         */
        public Builder threshold(Float threshold) {
            this.threshold = threshold;
            return this;
        }

        public ApmCompositeCompareConfig build() {
            return new ApmCompositeCompareConfig(this);
        } 

    } 

}
