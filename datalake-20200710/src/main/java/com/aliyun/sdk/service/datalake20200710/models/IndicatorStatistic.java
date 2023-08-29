// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.datalake20200710.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link IndicatorStatistic} extends {@link TeaModel}
 *
 * <p>IndicatorStatistic</p>
 */
public class IndicatorStatistic extends TeaModel {
    @NameInMap("Data")
    private Long data;

    @NameInMap("Date")
    private String date;

    private IndicatorStatistic(Builder builder) {
        this.data = builder.data;
        this.date = builder.date;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static IndicatorStatistic create() {
        return builder().build();
    }

    /**
     * @return data
     */
    public Long getData() {
        return this.data;
    }

    /**
     * @return date
     */
    public String getDate() {
        return this.date;
    }

    public static final class Builder {
        private Long data; 
        private String date; 

        /**
         * Data.
         */
        public Builder data(Long data) {
            this.data = data;
            return this;
        }

        /**
         * Date.
         */
        public Builder date(String date) {
            this.date = date;
            return this;
        }

        public IndicatorStatistic build() {
            return new IndicatorStatistic(this);
        } 

    } 

}
