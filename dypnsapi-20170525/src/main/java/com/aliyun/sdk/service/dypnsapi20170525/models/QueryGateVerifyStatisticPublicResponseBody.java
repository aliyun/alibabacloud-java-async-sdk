// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dypnsapi20170525.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QueryGateVerifyStatisticPublicResponseBody} extends {@link TeaModel}
 *
 * <p>QueryGateVerifyStatisticPublicResponseBody</p>
 */
public class QueryGateVerifyStatisticPublicResponseBody extends TeaModel {
    @NameInMap("Code")
    private String code;

    @NameInMap("Data")
    private Data data;

    @NameInMap("Message")
    private String message;

    @NameInMap("RequestId")
    private String requestId;

    private QueryGateVerifyStatisticPublicResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryGateVerifyStatisticPublicResponseBody create() {
        return builder().build();
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return data
     */
    public Data getData() {
        return this.data;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String code; 
        private Data data; 
        private String message; 
        private String requestId; 

        /**
         * Code.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * Data.
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * Message.
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public QueryGateVerifyStatisticPublicResponseBody build() {
            return new QueryGateVerifyStatisticPublicResponseBody(this);
        } 

    } 

    public static class DayStatistic extends TeaModel {
        @NameInMap("StatisticDateStr")
        private String statisticDateStr;

        @NameInMap("TotalFail")
        private Long totalFail;

        @NameInMap("TotalSuccess")
        private Long totalSuccess;

        @NameInMap("TotalUnknown")
        private Long totalUnknown;

        private DayStatistic(Builder builder) {
            this.statisticDateStr = builder.statisticDateStr;
            this.totalFail = builder.totalFail;
            this.totalSuccess = builder.totalSuccess;
            this.totalUnknown = builder.totalUnknown;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DayStatistic create() {
            return builder().build();
        }

        /**
         * @return statisticDateStr
         */
        public String getStatisticDateStr() {
            return this.statisticDateStr;
        }

        /**
         * @return totalFail
         */
        public Long getTotalFail() {
            return this.totalFail;
        }

        /**
         * @return totalSuccess
         */
        public Long getTotalSuccess() {
            return this.totalSuccess;
        }

        /**
         * @return totalUnknown
         */
        public Long getTotalUnknown() {
            return this.totalUnknown;
        }

        public static final class Builder {
            private String statisticDateStr; 
            private Long totalFail; 
            private Long totalSuccess; 
            private Long totalUnknown; 

            /**
             * StatisticDateStr.
             */
            public Builder statisticDateStr(String statisticDateStr) {
                this.statisticDateStr = statisticDateStr;
                return this;
            }

            /**
             * TotalFail.
             */
            public Builder totalFail(Long totalFail) {
                this.totalFail = totalFail;
                return this;
            }

            /**
             * TotalSuccess.
             */
            public Builder totalSuccess(Long totalSuccess) {
                this.totalSuccess = totalSuccess;
                return this;
            }

            /**
             * TotalUnknown.
             */
            public Builder totalUnknown(Long totalUnknown) {
                this.totalUnknown = totalUnknown;
                return this;
            }

            public DayStatistic build() {
                return new DayStatistic(this);
            } 

        } 

    }
    public static class Data extends TeaModel {
        @NameInMap("DayStatistic")
        private java.util.List < DayStatistic> dayStatistic;

        @NameInMap("Total")
        private Long total;

        @NameInMap("TotalFail")
        private Long totalFail;

        @NameInMap("TotalSuccess")
        private Long totalSuccess;

        @NameInMap("TotalUnknown")
        private Long totalUnknown;

        private Data(Builder builder) {
            this.dayStatistic = builder.dayStatistic;
            this.total = builder.total;
            this.totalFail = builder.totalFail;
            this.totalSuccess = builder.totalSuccess;
            this.totalUnknown = builder.totalUnknown;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return dayStatistic
         */
        public java.util.List < DayStatistic> getDayStatistic() {
            return this.dayStatistic;
        }

        /**
         * @return total
         */
        public Long getTotal() {
            return this.total;
        }

        /**
         * @return totalFail
         */
        public Long getTotalFail() {
            return this.totalFail;
        }

        /**
         * @return totalSuccess
         */
        public Long getTotalSuccess() {
            return this.totalSuccess;
        }

        /**
         * @return totalUnknown
         */
        public Long getTotalUnknown() {
            return this.totalUnknown;
        }

        public static final class Builder {
            private java.util.List < DayStatistic> dayStatistic; 
            private Long total; 
            private Long totalFail; 
            private Long totalSuccess; 
            private Long totalUnknown; 

            /**
             * DayStatistic.
             */
            public Builder dayStatistic(java.util.List < DayStatistic> dayStatistic) {
                this.dayStatistic = dayStatistic;
                return this;
            }

            /**
             * Total.
             */
            public Builder total(Long total) {
                this.total = total;
                return this;
            }

            /**
             * TotalFail.
             */
            public Builder totalFail(Long totalFail) {
                this.totalFail = totalFail;
                return this;
            }

            /**
             * TotalSuccess.
             */
            public Builder totalSuccess(Long totalSuccess) {
                this.totalSuccess = totalSuccess;
                return this;
            }

            /**
             * TotalUnknown.
             */
            public Builder totalUnknown(Long totalUnknown) {
                this.totalUnknown = totalUnknown;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
