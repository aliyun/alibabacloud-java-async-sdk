// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ons20190214.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link OnsTrendGroupOutputTpsResponseBody} extends {@link TeaModel}
 *
 * <p>OnsTrendGroupOutputTpsResponseBody</p>
 */
public class OnsTrendGroupOutputTpsResponseBody extends TeaModel {
    @NameInMap("Data")
    private Data data;

    @NameInMap("RequestId")
    private String requestId;

    private OnsTrendGroupOutputTpsResponseBody(Builder builder) {
        this.data = builder.data;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static OnsTrendGroupOutputTpsResponseBody create() {
        return builder().build();
    }

    /**
     * @return data
     */
    public Data getData() {
        return this.data;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private Data data; 
        private String requestId; 

        /**
         * The data that is returned.
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * The ID of the request. The system generates a unique ID for each request. You can troubleshoot issues based on the request ID.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public OnsTrendGroupOutputTpsResponseBody build() {
            return new OnsTrendGroupOutputTpsResponseBody(this);
        } 

    } 

    public static class StatsDataDo extends TeaModel {
        @NameInMap("X")
        private Long x;

        @NameInMap("Y")
        private Float y;

        private StatsDataDo(Builder builder) {
            this.x = builder.x;
            this.y = builder.y;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static StatsDataDo create() {
            return builder().build();
        }

        /**
         * @return x
         */
        public Long getX() {
            return this.x;
        }

        /**
         * @return y
         */
        public Float getY() {
            return this.y;
        }

        public static final class Builder {
            private Long x; 
            private Float y; 

            /**
             * Indicates the timestamp. The value is a UNIX timestamp representing the number of milliseconds that have elapsed since the epoch time January 1, 1970, 00:00:00 UTC.
             */
            public Builder x(Long x) {
                this.x = x;
                return this;
            }

            /**
             * Indicates the TPS for message consumption or the number of messages that are consumed.
             */
            public Builder y(Float y) {
                this.y = y;
                return this;
            }

            public StatsDataDo build() {
                return new StatsDataDo(this);
            } 

        } 

    }
    public static class Records extends TeaModel {
        @NameInMap("StatsDataDo")
        private java.util.List < StatsDataDo> statsDataDo;

        private Records(Builder builder) {
            this.statsDataDo = builder.statsDataDo;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Records create() {
            return builder().build();
        }

        /**
         * @return statsDataDo
         */
        public java.util.List < StatsDataDo> getStatsDataDo() {
            return this.statsDataDo;
        }

        public static final class Builder {
            private java.util.List < StatsDataDo> statsDataDo; 

            /**
             * StatsDataDo.
             */
            public Builder statsDataDo(java.util.List < StatsDataDo> statsDataDo) {
                this.statsDataDo = statsDataDo;
                return this;
            }

            public Records build() {
                return new Records(this);
            } 

        } 

    }
    public static class Data extends TeaModel {
        @NameInMap("Records")
        private Records records;

        @NameInMap("Title")
        private String title;

        @NameInMap("XUnit")
        private String xUnit;

        @NameInMap("YUnit")
        private String yUnit;

        private Data(Builder builder) {
            this.records = builder.records;
            this.title = builder.title;
            this.xUnit = builder.xUnit;
            this.yUnit = builder.yUnit;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return records
         */
        public Records getRecords() {
            return this.records;
        }

        /**
         * @return title
         */
        public String getTitle() {
            return this.title;
        }

        /**
         * @return xUnit
         */
        public String getXUnit() {
            return this.xUnit;
        }

        /**
         * @return yUnit
         */
        public String getYUnit() {
            return this.yUnit;
        }

        public static final class Builder {
            private Records records; 
            private String title; 
            private String xUnit; 
            private String yUnit; 

            /**
             * The data set that is returned based on sampling period.
             */
            public Builder records(Records records) {
                this.records = records;
                return this;
            }

            /**
             * The name of the table that stores the data.
             */
            public Builder title(String title) {
                this.title = title;
                return this;
            }

            /**
             * The unit of the timestamp. Unit: milliseconds.
             */
            public Builder xUnit(String xUnit) {
                this.xUnit = xUnit;
                return this;
            }

            /**
             * The unit of the value of the Y parameter.
             */
            public Builder yUnit(String yUnit) {
                this.yUnit = yUnit;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
