// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.grace20220606.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link PhaseStatisticItem} extends {@link TeaModel}
 *
 * <p>PhaseStatisticItem</p>
 */
public class PhaseStatisticItem extends TeaModel {
    @NameInMap("count")
    private Integer count;

    @NameInMap("durationAvg")
    private Double durationAvg;

    @NameInMap("durationMax")
    private Double durationMax;

    @NameInMap("durationTotal")
    private Double durationTotal;

    @NameInMap("intervalAvg")
    private Double intervalAvg;

    @NameInMap("intervalMin")
    private Double intervalMin;

    @NameInMap("name")
    private String name;

    private PhaseStatisticItem(Builder builder) {
        this.count = builder.count;
        this.durationAvg = builder.durationAvg;
        this.durationMax = builder.durationMax;
        this.durationTotal = builder.durationTotal;
        this.intervalAvg = builder.intervalAvg;
        this.intervalMin = builder.intervalMin;
        this.name = builder.name;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static PhaseStatisticItem create() {
        return builder().build();
    }

    /**
     * @return count
     */
    public Integer getCount() {
        return this.count;
    }

    /**
     * @return durationAvg
     */
    public Double getDurationAvg() {
        return this.durationAvg;
    }

    /**
     * @return durationMax
     */
    public Double getDurationMax() {
        return this.durationMax;
    }

    /**
     * @return durationTotal
     */
    public Double getDurationTotal() {
        return this.durationTotal;
    }

    /**
     * @return intervalAvg
     */
    public Double getIntervalAvg() {
        return this.intervalAvg;
    }

    /**
     * @return intervalMin
     */
    public Double getIntervalMin() {
        return this.intervalMin;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    public static final class Builder {
        private Integer count; 
        private Double durationAvg; 
        private Double durationMax; 
        private Double durationTotal; 
        private Double intervalAvg; 
        private Double intervalMin; 
        private String name; 

        /**
         * count.
         */
        public Builder count(Integer count) {
            this.count = count;
            return this;
        }

        /**
         * durationAvg.
         */
        public Builder durationAvg(Double durationAvg) {
            this.durationAvg = durationAvg;
            return this;
        }

        /**
         * durationMax.
         */
        public Builder durationMax(Double durationMax) {
            this.durationMax = durationMax;
            return this;
        }

        /**
         * durationTotal.
         */
        public Builder durationTotal(Double durationTotal) {
            this.durationTotal = durationTotal;
            return this;
        }

        /**
         * intervalAvg.
         */
        public Builder intervalAvg(Double intervalAvg) {
            this.intervalAvg = intervalAvg;
            return this;
        }

        /**
         * intervalMin.
         */
        public Builder intervalMin(Double intervalMin) {
            this.intervalMin = intervalMin;
            return this;
        }

        /**
         * name.
         */
        public Builder name(String name) {
            this.name = name;
            return this;
        }

        public PhaseStatisticItem build() {
            return new PhaseStatisticItem(this);
        } 

    } 

}
