// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.imm20200930.models;

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
 * {@link Schedule} extends {@link TeaModel}
 *
 * <p>Schedule</p>
 */
public class Schedule extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Gamma")
    private Float gamma;

    @com.aliyun.core.annotation.NameInMap("LRScheduler")
    private String LRScheduler;

    @com.aliyun.core.annotation.NameInMap("StepSize")
    private Long stepSize;

    private Schedule(Builder builder) {
        this.gamma = builder.gamma;
        this.LRScheduler = builder.LRScheduler;
        this.stepSize = builder.stepSize;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Schedule create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return gamma
     */
    public Float getGamma() {
        return this.gamma;
    }

    /**
     * @return LRScheduler
     */
    public String getLRScheduler() {
        return this.LRScheduler;
    }

    /**
     * @return stepSize
     */
    public Long getStepSize() {
        return this.stepSize;
    }

    public static final class Builder {
        private Float gamma; 
        private String LRScheduler; 
        private Long stepSize; 

        private Builder() {
        } 

        private Builder(Schedule model) {
            this.gamma = model.gamma;
            this.LRScheduler = model.LRScheduler;
            this.stepSize = model.stepSize;
        } 

        /**
         * Gamma.
         */
        public Builder gamma(Float gamma) {
            this.gamma = gamma;
            return this;
        }

        /**
         * LRScheduler.
         */
        public Builder LRScheduler(String LRScheduler) {
            this.LRScheduler = LRScheduler;
            return this;
        }

        /**
         * StepSize.
         */
        public Builder stepSize(Long stepSize) {
            this.stepSize = stepSize;
            return this;
        }

        public Schedule build() {
            return new Schedule(this);
        } 

    } 

}
