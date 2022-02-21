// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.datalake20200710.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetIndicatorDetailsResponseBody} extends {@link TeaModel}
 *
 * <p>GetIndicatorDetailsResponseBody</p>
 */
public class GetIndicatorDetailsResponseBody extends TeaModel {
    @NameInMap("Data")
    private java.util.List < Data> data;

    @NameInMap("requestId")
    private String requestId;

    private GetIndicatorDetailsResponseBody(Builder builder) {
        this.data = builder.data;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetIndicatorDetailsResponseBody create() {
        return builder().build();
    }

    /**
     * @return data
     */
    public java.util.List < Data> getData() {
        return this.data;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List < Data> data; 
        private String requestId; 

        /**
         * Data.
         */
        public Builder data(java.util.List < Data> data) {
            this.data = data;
            return this;
        }

        /**
         * Id of the request
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetIndicatorDetailsResponseBody build() {
            return new GetIndicatorDetailsResponseBody(this);
        } 

    } 

    public static class IndicatorStatistic extends TeaModel {
        @NameInMap("data")
        private Long data;

        @NameInMap("date")
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
             * data.
             */
            public Builder data(Long data) {
                this.data = data;
                return this;
            }

            /**
             * date.
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
    public static class Data extends TeaModel {
        @NameInMap("IndicatorStatistic")
        private IndicatorStatistic indicatorStatistic;

        private Data(Builder builder) {
            this.indicatorStatistic = builder.indicatorStatistic;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return indicatorStatistic
         */
        public IndicatorStatistic getIndicatorStatistic() {
            return this.indicatorStatistic;
        }

        public static final class Builder {
            private IndicatorStatistic indicatorStatistic; 

            /**
             * IndicatorStatistic.
             */
            public Builder indicatorStatistic(IndicatorStatistic indicatorStatistic) {
                this.indicatorStatistic = indicatorStatistic;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
