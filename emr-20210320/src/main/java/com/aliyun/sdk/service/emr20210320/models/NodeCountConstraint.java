// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.emr20210320.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link NodeCountConstraint} extends {@link TeaModel}
 *
 * <p>NodeCountConstraint</p>
 */
public class NodeCountConstraint extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Max")
    private Integer max;

    @com.aliyun.core.annotation.NameInMap("Min")
    private Integer min;

    @com.aliyun.core.annotation.NameInMap("Type")
    @com.aliyun.core.annotation.Validation(required = true)
    private String type;

    @com.aliyun.core.annotation.NameInMap("Values")
    private java.util.List < Integer > values;

    private NodeCountConstraint(Builder builder) {
        this.max = builder.max;
        this.min = builder.min;
        this.type = builder.type;
        this.values = builder.values;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static NodeCountConstraint create() {
        return builder().build();
    }

    /**
     * @return max
     */
    public Integer getMax() {
        return this.max;
    }

    /**
     * @return min
     */
    public Integer getMin() {
        return this.min;
    }

    /**
     * @return type
     */
    public String getType() {
        return this.type;
    }

    /**
     * @return values
     */
    public java.util.List < Integer > getValues() {
        return this.values;
    }

    public static final class Builder {
        private Integer max; 
        private Integer min; 
        private String type; 
        private java.util.List < Integer > values; 

        /**
         * Max.
         */
        public Builder max(Integer max) {
            this.max = max;
            return this;
        }

        /**
         * Min.
         */
        public Builder min(Integer min) {
            this.min = min;
            return this;
        }

        /**
         * Type.
         */
        public Builder type(String type) {
            this.type = type;
            return this;
        }

        /**
         * Values.
         */
        public Builder values(java.util.List < Integer > values) {
            this.values = values;
            return this;
        }

        public NodeCountConstraint build() {
            return new NodeCountConstraint(this);
        } 

    } 

}
