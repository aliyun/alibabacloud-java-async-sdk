// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.datalake20200710.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SingleIndicatorDTO} extends {@link TeaModel}
 *
 * <p>SingleIndicatorDTO</p>
 */
public class SingleIndicatorDTO extends TeaModel {
    @NameInMap("DayIncrement")
    private Long dayIncrement;

    @NameInMap("DayOnDay")
    private Double dayOnDay;

    @NameInMap("MonthIncrement")
    private Long monthIncrement;

    @NameInMap("MonthOnMonth")
    private Double monthOnMonth;

    @NameInMap("Total")
    private Long total;

    private SingleIndicatorDTO(Builder builder) {
        this.dayIncrement = builder.dayIncrement;
        this.dayOnDay = builder.dayOnDay;
        this.monthIncrement = builder.monthIncrement;
        this.monthOnMonth = builder.monthOnMonth;
        this.total = builder.total;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SingleIndicatorDTO create() {
        return builder().build();
    }

    /**
     * @return dayIncrement
     */
    public Long getDayIncrement() {
        return this.dayIncrement;
    }

    /**
     * @return dayOnDay
     */
    public Double getDayOnDay() {
        return this.dayOnDay;
    }

    /**
     * @return monthIncrement
     */
    public Long getMonthIncrement() {
        return this.monthIncrement;
    }

    /**
     * @return monthOnMonth
     */
    public Double getMonthOnMonth() {
        return this.monthOnMonth;
    }

    /**
     * @return total
     */
    public Long getTotal() {
        return this.total;
    }

    public static final class Builder {
        private Long dayIncrement; 
        private Double dayOnDay; 
        private Long monthIncrement; 
        private Double monthOnMonth; 
        private Long total; 

        /**
         * 日新增
         */
        public Builder dayIncrement(Long dayIncrement) {
            this.dayIncrement = dayIncrement;
            return this;
        }

        /**
         * 日环比
         */
        public Builder dayOnDay(Double dayOnDay) {
            this.dayOnDay = dayOnDay;
            return this;
        }

        /**
         * 月新增
         */
        public Builder monthIncrement(Long monthIncrement) {
            this.monthIncrement = monthIncrement;
            return this;
        }

        /**
         * 月环比
         */
        public Builder monthOnMonth(Double monthOnMonth) {
            this.monthOnMonth = monthOnMonth;
            return this;
        }

        /**
         * 总量
         */
        public Builder total(Long total) {
            this.total = total;
            return this;
        }

        public SingleIndicatorDTO build() {
            return new SingleIndicatorDTO(this);
        } 

    } 

}
