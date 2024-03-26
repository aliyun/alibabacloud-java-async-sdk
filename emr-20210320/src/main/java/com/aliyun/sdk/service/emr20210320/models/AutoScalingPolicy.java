// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.emr20210320.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link AutoScalingPolicy} extends {@link TeaModel}
 *
 * <p>AutoScalingPolicy</p>
 */
public class AutoScalingPolicy extends TeaModel {
    @NameInMap("constraints")
    private Constraints constraints;

    @NameInMap("scalingRules")
    private java.util.List < ScalingRule > scalingRules;

    private AutoScalingPolicy(Builder builder) {
        this.constraints = builder.constraints;
        this.scalingRules = builder.scalingRules;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AutoScalingPolicy create() {
        return builder().build();
    }

    /**
     * @return constraints
     */
    public Constraints getConstraints() {
        return this.constraints;
    }

    /**
     * @return scalingRules
     */
    public java.util.List < ScalingRule > getScalingRules() {
        return this.scalingRules;
    }

    public static final class Builder {
        private Constraints constraints; 
        private java.util.List < ScalingRule > scalingRules; 

        /**
         * constraints.
         */
        public Builder constraints(Constraints constraints) {
            this.constraints = constraints;
            return this;
        }

        /**
         * scalingRules.
         */
        public Builder scalingRules(java.util.List < ScalingRule > scalingRules) {
            this.scalingRules = scalingRules;
            return this;
        }

        public AutoScalingPolicy build() {
            return new AutoScalingPolicy(this);
        } 

    } 

    public static class Constraints extends TeaModel {
        @NameInMap("maxCapacity")
        private Integer maxCapacity;

        @NameInMap("minCapacity")
        private Integer minCapacity;

        private Constraints(Builder builder) {
            this.maxCapacity = builder.maxCapacity;
            this.minCapacity = builder.minCapacity;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Constraints create() {
            return builder().build();
        }

        /**
         * @return maxCapacity
         */
        public Integer getMaxCapacity() {
            return this.maxCapacity;
        }

        /**
         * @return minCapacity
         */
        public Integer getMinCapacity() {
            return this.minCapacity;
        }

        public static final class Builder {
            private Integer maxCapacity; 
            private Integer minCapacity; 

            /**
             * maxCapacity.
             */
            public Builder maxCapacity(Integer maxCapacity) {
                this.maxCapacity = maxCapacity;
                return this;
            }

            /**
             * minCapacity.
             */
            public Builder minCapacity(Integer minCapacity) {
                this.minCapacity = minCapacity;
                return this;
            }

            public Constraints build() {
                return new Constraints(this);
            } 

        } 

    }
}
